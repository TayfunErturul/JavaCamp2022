package kodlama.io.Homework1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Homework1.entities.concretes.SubTechnology;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer>{

}
