package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.SoftwareLanguagesService;
import Kodlama.io.Devs.business.requests.SoftwareLanguagesRequests.CreateSoftwareLanguageRequest;
import Kodlama.io.Devs.business.responses.SoftwareLanguagesResponses.GetAllSoftwareLanguagesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;

import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoftwareLanguagesManager implements SoftwareLanguagesService {
    private LanguageRepository languageRepository;
    @Autowired

    public SoftwareLanguagesManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllSoftwareLanguagesResponse> getAll() {
        List<SoftwareLanguage> softwareLanguages = languageRepository.findAll();
        List<GetAllSoftwareLanguagesResponse> languagesResponse = new ArrayList<>();

        for (SoftwareLanguage softwareLanguage: softwareLanguages){
            GetAllSoftwareLanguagesResponse allResponse = new GetAllSoftwareLanguagesResponse();
            allResponse.setId(softwareLanguage.getId());
            allResponse.setName(softwareLanguage.getLanguageName());
            languagesResponse.add(allResponse);
        }
        return languagesResponse;
    }

    @Override
    public void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest) {
        SoftwareLanguage softwareLanguage = new SoftwareLanguage();
        softwareLanguage.setLanguageName(createSoftwareLanguageRequest.getName());
        this.languageRepository.save(softwareLanguage);
    }


//    @Override
//    public SoftwareLanguage getById(int id) {
//        return null;
//    }
//
//    @Override
//    public SoftwareLanguage getByName(String name) {
//        return null;
//    }
//
//    @Override
//    public void add(SoftwareLanguage softwareLanguage) {
//
//    }
//
//    @Override
//    public void delete(SoftwareLanguage softwareLanguage) {
//
//    }
//
//    @Override
//    public void update(SoftwareLanguage softwareLanguage) {
//
//    }
}
