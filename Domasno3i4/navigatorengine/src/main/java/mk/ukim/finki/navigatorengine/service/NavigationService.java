package mk.ukim.finki.navigatorengine.service;

import mk.ukim.finki.navigatorengine.model.Route;

public interface NavigationService {
    public Route findRoute(
            Double starting_lon,
            Double starting_lat,
            Double monument_lon,
            Double monument_lat
    );
}
