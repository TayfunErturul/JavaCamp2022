package kodlama.io.Homework1.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Homework1.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Homework1.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Homework1.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public List<ProgrammingLanguage> add(ProgrammingLanguage programmingLanguage) {
		if (kontrol(programmingLanguage)) {
			programmingLanguageRepository.add(programmingLanguage);
		}
		return getAll();
	}

	@Override
	public List<ProgrammingLanguage> update(ProgrammingLanguage programmingLanguage) {
		if (kontrol(programmingLanguage)) {
			programmingLanguageRepository.update(programmingLanguage);
		}
		return getAll();
	}

	@Override
	public List<ProgrammingLanguage> delete(int id) {
		var item = getById(id);
		if (item != null) {
			programmingLanguageRepository.delete(item);
		}
		
		return getAll();
	}

	@Override
	public Boolean kontrol(ProgrammingLanguage programmingLanguage) {
		var listItem = getAll();

		if (programmingLanguage.getName() == null || programmingLanguage.getName().trim() == "") {
			return false;
		}

		for (ProgrammingLanguage item : listItem) {
			if (item.getName().toLowerCase().equals(programmingLanguage.getName().toLowerCase())) {
				return false;
			}
		}

		return true;
	}

}
