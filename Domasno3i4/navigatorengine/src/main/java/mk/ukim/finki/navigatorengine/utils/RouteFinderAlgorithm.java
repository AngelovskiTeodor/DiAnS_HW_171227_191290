package mk.ukim.finki.navigatorengine.utils;

import mk.ukim.finki.navigatorengine.model.Point;
import mk.ukim.finki.navigatorengine.model.Route;
import mk.ukim.finki.navigatorengine.model.exception.RouteNotFoundException;

import java.util.List;

public class RouteFinderAlgorithm {
    private static final Double NORTH_BOUNDARY= 42.011471;
    private static final Double WEST_BOUNDARY= 21.391711;
    private static final Double SOUTH_BOUNDARY = 41.984550;
    private static final Double EAST_BOUNDARY = 21.453860;

    public static Route findRouteAlgorithm(List<Point> points){
        Point destination = points.get(points.toArray().length -1);

        if (destination.getLat() < SOUTH_BOUNDARY || destination.getLat() > NORTH_BOUNDARY) {
            throw new RouteNotFoundException();
        }
        if (destination.getLon() < WEST_BOUNDARY || destination.getLon() > EAST_BOUNDARY) {
            throw new RouteNotFoundException();
        }

        return new Route(points);
    }
}
