package Kodlama.io.Devs.business.abstracts;



import Kodlama.io.Devs.business.requests.TechnologyRequests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.TechnologyRequests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.TechnologyRequests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.TechnologyResponses.GetAllTechnologiesResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologiesResponse> getAll();

    void add(CreateTechnologyRequest createTechnologyRequest);
    void deleteById(DeleteTechnologyRequest deleteTechnologyRequest);

    void update(UpdateTechnologyRequest updateTechnologyRequest);
}
