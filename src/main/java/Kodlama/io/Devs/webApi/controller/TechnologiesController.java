package Kodlama.io.Devs.webApi.controller;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.requests.TechnologyRequests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.TechnologyRequests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.TechnologyRequests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.TechnologyResponses.GetAllTechnologiesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technologies")
public class TechnologiesController {

    private TechnologyService technologyService;

    @Autowired
    public TechnologiesController(TechnologyService technologyService){
        this.technologyService = technologyService;

    }
    @GetMapping("/getall")
    public List<GetAllTechnologiesResponse> getAll(){
        return technologyService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateTechnologyRequest createTechnologyRequest){
        technologyService.add(createTechnologyRequest);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody() DeleteTechnologyRequest deleteTechnologyRequest){
        technologyService.deleteById(deleteTechnologyRequest);
    }
    @PostMapping("/update")
    public void update(@RequestBody()UpdateTechnologyRequest updateTechnologyRequest){
        technologyService.update(updateTechnologyRequest);
    }

}
