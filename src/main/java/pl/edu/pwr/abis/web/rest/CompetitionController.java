package pl.edu.pwr.abis.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pl.edu.pwr.abis.domain.classes.EdycjaKonkursu;
import pl.edu.pwr.abis.repository.CompetitonRepostiory;
import pl.edu.pwr.abis.service.CompetitionService;
import pl.edu.pwr.abis.service.dto.CompetitionDTO;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;

@RestController
@RequestMapping("/api/competition")
public class CompetitionController {

    private final CompetitonRepostiory competitonRepostiory;

    private final CompetitionService competitionService;

    public CompetitionController(CompetitonRepostiory competitonRepostiory, 
        CompetitionService competitionService) {
            this.competitonRepostiory = competitonRepostiory;
            this.competitionService = competitionService;

    }

    @GetMapping("/active")
    public ResponseEntity<CompetitionDTO> getActiveCompetition() {
        Optional<EdycjaKonkursu> competition = competitonRepostiory.findOneByCzyAktywnaIsTrue();
        return ResponseUtil.wrapOrNotFound(competition.map(CompetitionDTO::new));
    }

    @PostMapping("")
    public ResponseEntity<EdycjaKonkursu> createCompetition(@RequestBody CompetitionDTO competitionDTO) {
        EdycjaKonkursu competition = competitionService.createEdycjaKonkursu(competitionDTO);
        return ResponseEntity.created(URI.create("/api/competition/" + competition.getId()))
            .headers(HeaderUtil.createEntityCreationAlert("competition", false, competition.getId().toString(), "ja"))
            .body(competition);
    }
    
}
