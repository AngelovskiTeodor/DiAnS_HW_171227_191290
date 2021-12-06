package mk.ukim.finki.navigatorengine.service.impl;

import mk.ukim.finki.navigatorengine.model.Point;
import mk.ukim.finki.navigatorengine.model.Route;
import mk.ukim.finki.navigatorengine.service.NavigationService;
import org.springframework.stereotype.Service;

@Service
public class NavigationServiceImpl implements NavigationService {

    @Override
    public Route findRoute(Double starting_lon, Double starting_lat, Double monument_lon, Double monument_lat) {
        Route route = new Route(
                new Point(starting_lon, starting_lat),
                new Point(monument_lon, monument_lat)
        );
        return route;
    }
}
