package kodlama.io.Homework1.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/add")
	public List<ProgrammingLanguage> add(ProgrammingLanguage programmingLanguage){
		return programmingLanguageService.add(programmingLanguage);
	}
	
	@GetMapping("/update")
	public List<ProgrammingLanguage> update(ProgrammingLanguage programmingLanguage){
		return programmingLanguageService.update(programmingLanguage);
	}
	
	@GetMapping("/delete")
	public List<ProgrammingLanguage> delete(int id){
		return programmingLanguageService.delete(id);
	}

}
