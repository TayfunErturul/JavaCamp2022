package kodlama.io.Homework1.business.abstracts;

import java.util.List;

import kodlama.io.Homework1.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	List<ProgrammingLanguage> add(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> update(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> delete(int id);
	Boolean kontrol(ProgrammingLanguage programmingLanguage);

}
