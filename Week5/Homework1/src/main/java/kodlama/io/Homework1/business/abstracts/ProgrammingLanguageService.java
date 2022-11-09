package kodlama.io.Homework1.business.abstracts;

import java.util.List;

import kodlama.io.Homework1.business.requests.programmingLanguage.BaseProgrammingLanguageRequest;
import kodlama.io.Homework1.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.Homework1.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.Homework1.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.Homework1.business.responses.programmingLanguage.GetAllProgrammingLanguageResponse;
import kodlama.io.Homework1.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	ProgrammingLanguage getById(int id);
	List<GetAllProgrammingLanguageResponse> add(CreateProgrammingLanguageRequest programmingLanguage);
	List<GetAllProgrammingLanguageResponse> update(int id,UpdateProgrammingLanguageRequest programmingLanguage);
	List<GetAllProgrammingLanguageResponse> delete(DeleteProgrammingLanguageRequest programmingLanguage);
	Boolean kontrol(BaseProgrammingLanguageRequest programmingLanguage);

}
