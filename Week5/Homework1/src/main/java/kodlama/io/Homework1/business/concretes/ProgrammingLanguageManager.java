package kodlama.io.Homework1.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Homework1.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Homework1.business.requests.programmingLanguage.BaseProgrammingLanguageRequest;
import kodlama.io.Homework1.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.Homework1.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.Homework1.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.Homework1.business.responses.programmingLanguage.GetAllProgrammingLanguageResponse;
import kodlama.io.Homework1.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Homework1.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> responses = new ArrayList<GetAllProgrammingLanguageResponse>();

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setName(programmingLanguage.getName());
			responses.add(responseItem);

		}
		return responses;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.findById(id).get();
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> add(CreateProgrammingLanguageRequest programmingLanguage) {
		ProgrammingLanguage item = new ProgrammingLanguage();
		if (kontrol(programmingLanguage)) {
			item.setName(programmingLanguage.getName());
			this.programmingLanguageRepository.save(item);
		}
		return getAll();
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> update(int id, UpdateProgrammingLanguageRequest programmingLanguage) {
		ProgrammingLanguage item = getById(id);
		if (item != null && kontrol(programmingLanguage)) {
			item.setName(programmingLanguage.getName());
			this.programmingLanguageRepository.save(item);
		}
		return getAll();
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> delete(DeleteProgrammingLanguageRequest programmingLanguage) {
		var item = getById(programmingLanguage.getId());
		if (item != null) {
			this.programmingLanguageRepository.delete(item);
		}

		return getAll();
	}

	@Override
	public Boolean kontrol(BaseProgrammingLanguageRequest programmingLanguage) {
		var listItem = getAll();

		if (programmingLanguage.getName() == null || programmingLanguage.getName().trim() == "") {
			return false;
		}

		for (GetAllProgrammingLanguageResponse item : listItem) {
			if (item.getName().toLowerCase().equals(programmingLanguage.getName().toLowerCase())) {
				return false;
			}
		}

		return true;
	}

}
