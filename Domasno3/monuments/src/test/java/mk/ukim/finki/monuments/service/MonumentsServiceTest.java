package mk.ukim.finki.monuments.service;

import mk.ukim.finki.monuments.model.Monument;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MonumentsServiceTest {

    @Autowired
    MonumentsService monumentsService;

    @Test
    public void testMethods(){
        assertEquals(52, monumentsService.findAll().size());
        assertEquals(Monument.class, monumentsService.findById(908273421L).size());
        assertEquals(null, monumentsService.findById(908973421L).size());
    }

}