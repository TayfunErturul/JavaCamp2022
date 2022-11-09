package kodlama.io.Homework1.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Homework1.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Homework1.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import kodlama.io.Homework1.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import kodlama.io.Homework1.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import kodlama.io.Homework1.business.responses.programmingLanguage.GetAllProgrammingLanguageResponse;
import kodlama.io.Homework1.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguageController {
	
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllProgrammingLanguageResponse> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/getById")
	public ProgrammingLanguage getById(int id){
		return programmingLanguageService.getById(id);
	}
	
	@PostMapping("/add")
	public List<GetAllProgrammingLanguageResponse> add(CreateProgrammingLanguageRequest programmingLanguage){
		return programmingLanguageService.add(programmingLanguage);
	}
	
	@PutMapping("/update")
	public List<GetAllProgrammingLanguageResponse> update(int id, UpdateProgrammingLanguageRequest programmingLanguage){
		return programmingLanguageService.update(id,programmingLanguage);
	}
	
	@DeleteMapping("/delete")
	public List<GetAllProgrammingLanguageResponse> delete(DeleteProgrammingLanguageRequest programmingLanguage){
		return programmingLanguageService.delete(programmingLanguage);
	}

}
