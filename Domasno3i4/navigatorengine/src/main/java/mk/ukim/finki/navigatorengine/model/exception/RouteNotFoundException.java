package mk.ukim.finki.navigatorengine.model.exception;

public class RouteNotFoundException extends RuntimeException{
    public RouteNotFoundException() {
        super(String.format("Route to monument not found..."));
    }
}
