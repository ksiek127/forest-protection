package pl.edu.agh.forestprotection.routes;

import org.springframework.web.bind.annotation.*;
import pl.edu.agh.forestprotection.entities.Sector;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SectorRouter {
    @GetMapping(value = "/sectors")
    public List<Sector> getAll(){
        return new ArrayList<>();
    }
}