package pl.edu.pwr.abis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.edu.pwr.abis.domain.classes.EdycjaKonkursu;

public interface CompetitonRepostiory extends JpaRepository<EdycjaKonkursu, Long> {
    Optional<EdycjaKonkursu> findOneByCzyAktywnaIsTrue();
}
