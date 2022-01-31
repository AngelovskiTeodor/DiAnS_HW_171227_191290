package mk.ukim.finki.monuments.repository;

import mk.ukim.finki.monuments.model.Monument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MonumentsRepository extends JpaRepository<Monument, Long> {
    public List<Monument> findAll();
    public Optional<Monument> findById(Long id);
}
