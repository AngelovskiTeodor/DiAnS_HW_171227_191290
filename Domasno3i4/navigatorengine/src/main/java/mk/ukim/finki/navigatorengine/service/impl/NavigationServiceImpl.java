package mk.ukim.finki.navigatorengine.service.impl;

import mk.ukim.finki.navigatorengine.model.Point;
import mk.ukim.finki.navigatorengine.model.Route;
import mk.ukim.finki.navigatorengine.service.NavigationService;
import mk.ukim.finki.navigatorengine.utils.RouteFinderAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NavigationServiceImpl implements NavigationService {

    @Override
    public Route findRoute(Double starting_lon, Double starting_lat, Double monument_lon, Double monument_lat) {
        List<Point> points = new ArrayList<Point>(2);
        points.add(new Point(starting_lon,starting_lat));
        points.add(new Point(monument_lon, monument_lat));
        return RouteFinderAlgorithm.findRouteAlgorithm(points);
    }
}
