package mk.ukim.finki.monuments.presentation.rest;

import mk.ukim.finki.monuments.model.Monument;
import mk.ukim.finki.monuments.service.MonumentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/monuments")
public class MonumentsRestController {
    private final MonumentsService monumentsService;

    public MonumentsRestController(MonumentsService monumentsService) {
        this.monumentsService = monumentsService;
    }

    @GetMapping
    public List<Monument> getAllMonuments(){
        return this.monumentsService.findAll();
    }

    @GetMapping("/{id}")
    public Monument getMonument(@PathVariable Long id){
        return this.monumentsService.findById(id);
    }
}
