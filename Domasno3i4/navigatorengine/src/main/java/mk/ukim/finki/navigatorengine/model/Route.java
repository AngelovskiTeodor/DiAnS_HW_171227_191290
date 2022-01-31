package mk.ukim.finki.navigatorengine.model;

import java.util.LinkedList;
import java.util.List;

public class Route {

    private List<Point> points;

    public Route(Point starting_point, Point monument_point) {
        this.points = new LinkedList<Point>();
        this.points.add(starting_point);
        this.points.add(monument_point);
    }

    public Route(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

}
