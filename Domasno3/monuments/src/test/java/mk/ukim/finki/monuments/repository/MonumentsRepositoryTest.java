package mk.ukim.finki.monuments.repository;


import mk.ukim.finki.monuments.model.Monument;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class MonumentsRepositoryTest {

    @Autowired
    MonumentsRepository monumentsRepository;

    @DisplayName("Testing all methods in Monuments Repository")
    @Test
    public void testMethods(){
        assertEquals(52,monumentsRepository.findAll().size());
        assertInstanceOf(Monument.class, monumentsRepository.findById(908273421L));
        assertEquals(null, monumentsRepository.findById(908270421L));
        assertInstanceOf(Monument.class, monumentsRepository.findById(1000000411079115L));
    }

}