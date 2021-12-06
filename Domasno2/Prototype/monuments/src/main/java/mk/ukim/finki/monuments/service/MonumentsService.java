package mk.ukim.finki.monuments.service;

import mk.ukim.finki.monuments.model.Monument;

import java.util.List;

public interface MonumentsService {
    List<Monument> findAll();
    Monument findById(Long id);
}
