package kodlama.io.Homework1.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Homework1.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
   List<ProgrammingLanguage> getAll();
   ProgrammingLanguage getById(int id);
   void add(ProgrammingLanguage programmingLanguage);
   void update(ProgrammingLanguage programmingLanguage);
   void delete(ProgrammingLanguage programmingLanguage);
   
}
