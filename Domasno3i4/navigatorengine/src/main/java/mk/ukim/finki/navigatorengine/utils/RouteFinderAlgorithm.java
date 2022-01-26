package mk.ukim.finki.navigatorengine.utils;

import mk.ukim.finki.navigatorengine.model.Point;
import mk.ukim.finki.navigatorengine.model.Route;

import java.util.List;

public class RouteFinderAlgorithm {
    public static Route findRouteAlgorithm(List<Point> points){
        return new Route(points);
    }
}
