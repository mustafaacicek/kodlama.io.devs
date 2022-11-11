package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.SoftwareLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<SoftwareLanguage,Integer> {


//    List<SoftwareLanguage> getAll();
//   SoftwareLanguage getById(int id);
//    void add(SoftwareLanguage softwareLanguage);
//    void delete(SoftwareLanguage softwareLanguage);
//    void update(SoftwareLanguage softwareLanguage); // S->Single Responsibility O-> Open Closed

}
