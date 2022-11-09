package kodlama.io.Homework1.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Homework1.business.abstracts.SubTechnologyService;
import kodlama.io.Homework1.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.Homework1.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.Homework1.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Homework1.business.responses.subTechnology.GetAllSubTechnologyResponse;
import kodlama.io.Homework1.entities.concretes.SubTechnology;

@RestController
@RequestMapping("/api/subTechnology")
public class SubTechnologyController {
	private SubTechnologyService subTechnologyService;

	public SubTechnologyController(SubTechnologyService subTechnologyService) {
		this.subTechnologyService = subTechnologyService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllSubTechnologyResponse> getAll(){
		return subTechnologyService.getAll();
	}
	
	@GetMapping("/getById")
	public SubTechnology getById(int id){
		return subTechnologyService.getById(id);
	}
	
	@PostMapping("/add")
	public List<GetAllSubTechnologyResponse> add(CreateSubTechnologyRequest subTechnology){
		return subTechnologyService.add(subTechnology);
	}
	
	@PutMapping("/update")
	public List<GetAllSubTechnologyResponse> update(int id, UpdateSubTechnologyRequest subTechnology){
		return subTechnologyService.update(id,subTechnology);
	}
	
	@DeleteMapping("/delete")
	public List<GetAllSubTechnologyResponse> delete(DeleteSubTechnologyRequest subTechnology){
		return subTechnologyService.delete(subTechnology);
	}
	
}
