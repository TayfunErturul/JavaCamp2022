package kodlama.io.Homework1.business.abstracts;

import java.util.List;

import kodlama.io.Homework1.business.requests.subTechnology.BaseSubTechnologyRequest;
import kodlama.io.Homework1.business.requests.subTechnology.CreateSubTechnologyRequest;
import kodlama.io.Homework1.business.requests.subTechnology.DeleteSubTechnologyRequest;
import kodlama.io.Homework1.business.requests.subTechnology.UpdateSubTechnologyRequest;
import kodlama.io.Homework1.business.responses.subTechnology.GetAllSubTechnologyResponse;
import kodlama.io.Homework1.entities.concretes.SubTechnology;

public interface SubTechnologyService {
	List<GetAllSubTechnologyResponse> getAll();
	SubTechnology getById(int id);
	List<GetAllSubTechnologyResponse> add(CreateSubTechnologyRequest subTechnology);
	List<GetAllSubTechnologyResponse> update(int id, UpdateSubTechnologyRequest subTechnology);
	List<GetAllSubTechnologyResponse> delete(DeleteSubTechnologyRequest subTechnology);
	Boolean kontrol(BaseSubTechnologyRequest subTechnology);
}
