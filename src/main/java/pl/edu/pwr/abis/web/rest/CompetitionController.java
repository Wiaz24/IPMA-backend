package pl.edu.pwr.abis.web.rest;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.edu.pwr.abis.domain.classes.EdycjaKonkursu;
import pl.edu.pwr.abis.repository.CompetitonRepostiory;
import pl.edu.pwr.abis.service.dto.AdminUserDTO;
import tech.jhipster.web.util.ResponseUtil;

@RestController
@RequestMapping("/api/competition")
public class CompetitionController {

    private final CompetitonRepostiory competitonRepostiory;

    public CompetitionController(CompetitonRepostiory competitonRepostiory) {
        this.competitonRepostiory = competitonRepostiory;
    }

    @GetMapping("/active")
    public ResponseEntity<EdycjaKonkursu> getActiveCompetition() {
        Optional<EdycjaKonkursu> competition = competitonRepostiory.findOneByCzyAktywnaIsTrue();
        return ResponseUtil.wrapOrNotFound(competition.map(AdminUserDTO::new));
    }
    
}
