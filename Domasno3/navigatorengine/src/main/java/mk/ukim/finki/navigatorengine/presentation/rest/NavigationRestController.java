package mk.ukim.finki.navigatorengine.presentation.rest;

import mk.ukim.finki.navigatorengine.model.Route;
import mk.ukim.finki.navigatorengine.service.NavigationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/route")
public class NavigationRestController {
    private final NavigationService navigationService;

    public NavigationRestController(NavigationService navigationService) {
        this.navigationService = navigationService;
    }

    @PostMapping
    public Route findRoute(
            @RequestParam Double starting_lon,
            @RequestParam Double starting_lat,
            @RequestParam Long monumentId
    ){
        //21.4333190 | 41.9936737
        Double monument_lon = 21.4333190;
        Double monument_lat = 41.9936737;
        return this.navigationService.findRoute(
                starting_lon, starting_lat,
                monument_lon, monument_lat
        );
    }
}
