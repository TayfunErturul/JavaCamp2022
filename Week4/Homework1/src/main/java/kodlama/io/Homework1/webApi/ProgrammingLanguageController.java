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
import kodlama.io.Homework1.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguage")
public class ProgrammingLanguageController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/getById")
	public ProgrammingLanguage getById(int id){
		return programmingLanguageService.getById(id);
	}
	
	@PostMapping("/add")
	public List<ProgrammingLanguage> add(ProgrammingLanguage programmingLanguage){
		return programmingLanguageService.add(programmingLanguage);
	}
	
	@PutMapping("/update")
	public List<ProgrammingLanguage> update(ProgrammingLanguage programmingLanguage){
		return programmingLanguageService.update(programmingLanguage);
	}
	
	@DeleteMapping("/delete")
	public List<ProgrammingLanguage> delete(int id){
		return programmingLanguageService.delete(id);
	}

}
