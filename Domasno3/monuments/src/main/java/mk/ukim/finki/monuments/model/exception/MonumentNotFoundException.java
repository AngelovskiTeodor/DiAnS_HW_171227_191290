package mk.ukim.finki.monuments.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class MonumentNotFoundException extends RuntimeException{
    public MonumentNotFoundException(Long id) {
        super(String.format("Monument with id %d was not found!", id));
    }
}
