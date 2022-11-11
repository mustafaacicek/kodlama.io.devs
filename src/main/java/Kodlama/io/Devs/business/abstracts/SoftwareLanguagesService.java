package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.requests.SoftwareLanguagesRequests.CreateSoftwareLanguageRequest;
import Kodlama.io.Devs.business.responses.SoftwareLanguagesResponses.GetAllSoftwareLanguagesResponse;

import java.util.List;

public interface SoftwareLanguagesService {
    List<GetAllSoftwareLanguagesResponse> getAll();
    void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest);
//    SoftwareLanguage getById(int id);
//    SoftwareLanguage getByName(String name);
//    void add(SoftwareLanguage softwareLanguage);
//    void delete(SoftwareLanguage softwareLanguage);
//    void update(SoftwareLanguage softwareLanguage);

}
