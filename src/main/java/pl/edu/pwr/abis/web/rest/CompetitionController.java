package pl.edu.pwr.abis.web.rest;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
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

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

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

    /**
     * Create a new competition
     * @param competitionDTO
     * @return
     */
    @PostMapping("")
    public ResponseEntity<EdycjaKonkursu> createCompetition(@Valid @RequestBody CompetitionDTO competitionDTO) {
        EdycjaKonkursu competition = competitionService.createEdycjaKonkursu(competitionDTO);
        return ResponseEntity.created(URI.create("/api/competition/" + competition.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, competition.getId().toString(), "ja"))
            .body(competition);
    }

    /**
     * Update a competition
     * @param competitionDTO
     * @param id
     * @throws CompetitionNotFoundException
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<EdycjaKonkursu> updateCompetition(@Valid @RequestBody CompetitionDTO competitionDTO, @PathVariable Long id) {
        EdycjaKonkursu competition = competitionService.updateEdycjaKonkursu(competitionDTO, id);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, competition.getId().toString(), "ja"))
            .body(competition);
    }
    
}
