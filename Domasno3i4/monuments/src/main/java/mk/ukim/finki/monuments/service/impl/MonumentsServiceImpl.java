package mk.ukim.finki.monuments.service.impl;

import mk.ukim.finki.monuments.model.Monument;
import mk.ukim.finki.monuments.model.exception.MonumentNotFoundException;
import mk.ukim.finki.monuments.repository.MonumentsRepository;
import mk.ukim.finki.monuments.service.MonumentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonumentsServiceImpl implements MonumentsService {
    private final MonumentsRepository monumentsRepository;

    public MonumentsServiceImpl(MonumentsRepository monumentsRepository) {
        this.monumentsRepository = monumentsRepository;
    }

    @Override
    public List<Monument> findAll() {
        return this.monumentsRepository.findAll();
    }

    @Override
    public Monument findById(Long id) {
        return this.monumentsRepository.findById(id).orElseThrow(
                () -> new MonumentNotFoundException(id)
        );
    }
}
