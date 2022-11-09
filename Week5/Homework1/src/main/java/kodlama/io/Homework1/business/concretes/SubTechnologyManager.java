package kodlama.io.Homework1.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Homework1.business.abstracts.SubTechnologyService;
import kodlama.io.Homework1.business.requests.subTechnology.BaseSubTechnologyRequest;
import kodlama.io.Homework1.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.Homework1.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.Homework1.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Homework1.business.responses.subTechnology.GetAllSubTechnologyResponse;
import kodlama.io.Homework1.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Homework1.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.Homework1.entities.concretes.ProgrammingLanguage;
import kodlama.io.Homework1.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService {
	private SubTechnologyRepository subTechnologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository,ProgrammingLanguageRepository programmingLanguageRepository) {
		this.subTechnologyRepository = subTechnologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllSubTechnologyResponse> getAll() {
		List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
		List<GetAllSubTechnologyResponse> responses = new ArrayList<GetAllSubTechnologyResponse>();

		for (SubTechnology subTechnology : subTechnologies) {
			GetAllSubTechnologyResponse responseItem = new GetAllSubTechnologyResponse();
			responseItem.setName(subTechnology.getName());
			responseItem.setProgrammingLanguageName(subTechnology.getProgrammingLanguage().getName());
			responses.add(responseItem);

		}
		return responses;
	}

	@Override
	public SubTechnology getById(int id) {
		return subTechnologyRepository.findById(id).get();
	}

	@Override
	public List<GetAllSubTechnologyResponse> add(CreateSubTechnologyRequest subTechnology) {
		SubTechnology item = new SubTechnology();
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(subTechnology.getProgrammingLanguageId()).get();
		if (kontrol(subTechnology)) {
			item.setName(subTechnology.getName());
			item.setProgrammingLanguage(programmingLanguage);
			this.subTechnologyRepository.save(item);
		}
		return getAll();
	}

	@Override
	public List<GetAllSubTechnologyResponse> update(int id, UpdateSubTechnologyRequest subTechnology) {
		SubTechnology item = getById(id);
		ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(subTechnology.getProgrammingLanguageId()).get();
		if (item != null && kontrol(subTechnology)) {
			item.setName(subTechnology.getName());
			item.setProgrammingLanguage(programmingLanguage);
			this.subTechnologyRepository.save(item);
		}
		return getAll();
	}

	@Override
	public List<GetAllSubTechnologyResponse> delete(DeleteSubTechnologyRequest subTechnology) {
		var item = getById(subTechnology.getId());
		if (item != null) {
			this.subTechnologyRepository.delete(item);
		}

		return getAll();
	}

	@Override
	public Boolean kontrol(BaseSubTechnologyRequest subTechnology) {
		var listItem = getAll();

		if (subTechnology.getName() == null || subTechnology.getName().trim() == "") {
			return false;
		}

		for (GetAllSubTechnologyResponse item : listItem) {
			if (item.getName().toLowerCase().equals(subTechnology.getName().toLowerCase())) {
				return false;
			}
		}

		return true;
	}
}
