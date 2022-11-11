package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.TechnologyRequests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.TechnologyRequests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.TechnologyRequests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.TechnologyResponses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TechnologiesManager implements TechnologyService {
    private TechnologyRepository technologyRepository ;
    private LanguageRepository languageRepository;

    @Autowired
    public TechnologiesManager (TechnologyRepository technologyRepository,LanguageRepository languageRepository){
        this.technologyRepository=technologyRepository;
        this.languageRepository=languageRepository;
    }
    @Override
    public List<GetAllTechnologiesResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologiesResponse> getAllTechnologiesResponses = new ArrayList<>();

        for (Technology technology : technologies){
            GetAllTechnologiesResponse getAllTechnologiesResponse = new GetAllTechnologiesResponse();
            getAllTechnologiesResponse.setName(technology.getName());

            getAllTechnologiesResponses.add(getAllTechnologiesResponse);
        }

        return getAllTechnologiesResponses;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Technology technology = new Technology();
        technology.setName(createTechnologyRequest.getName());
        technology.setSoftwareLanguage(languageRepository.getReferenceById(createTechnologyRequest.getSoftwareLanguageId()));
        technologyRepository.save(technology);
    }

    @Override
    public void deleteById(DeleteTechnologyRequest deleteTechnologyRequest) {
        technologyRepository.deleteById(deleteTechnologyRequest.getId());
    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = technologyRepository.getReferenceById(updateTechnologyRequest.getId());
        technology.setName(updateTechnologyRequest.getName());
        technologyRepository.save(technology);
    }



}
