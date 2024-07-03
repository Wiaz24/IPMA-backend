package pl.edu.pwr.abis.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.pwr.abis.domain.classes.EdycjaKonkursu;
import pl.edu.pwr.abis.repository.CompetitonRepostiory;
import pl.edu.pwr.abis.service.dto.CompetitionDTO;

@Service
@Transactional
public class CompetitionService {

    private final CompetitonRepostiory competitonRepostiory;

    public CompetitionService(CompetitonRepostiory competitonRepostiory) {
        this.competitonRepostiory = competitonRepostiory;
    }

    public EdycjaKonkursu createEdycjaKonkursu(CompetitionDTO dto)
    {
        EdycjaKonkursu competition = new EdycjaKonkursu();

        // competition.setKosztUczestnictwa(dto.getKosztUczestnictwa()); // Die Teilnahmekosten sind statisch
        competition.setId(dto.getId());
        competition.setNumerEdycji(dto.getNumerEdycji());
        competition.setCzyAktywna(dto.isCzyAktywna());
        competition.setDataZgloszeniaAplikacji(dto.getDataZgloszeniaAplikacji().toData());
        competition.setDataDostarczeniaRaportu(dto.getDataDostarczeniaRaportu().toData());
        competition.setDataOpracowaniaOcenyIndywidualnej(dto.getDataOpracowaniaOcenyIndywidualnej().toData());
        competition.setDataOpracowaniaOcenyWstepnej(dto.getDataOpracowaniaOcenyWstepnej().toData());
        competition.setDataOpracowaniaOcenyKoncowej(dto.getDataOpracowaniaOcenyKoncowej().toData());
        competition.setDataOpracowaniaRaportuWizyty(dto.getDataOpracowaniaRaportuWizyty().toData());
        competition.setDataWizytyStudyjnej(dto.getDataWizytyStudyjnej().toData());
        competition.setTerminUroczystosci(dto.getTerminUroczystosci().toData());
        competition.setMiejsceUroczystosci(dto.getMiejsceUroczystosci());
        competition.setUlotkaPPEA(dto.getUlotkaPPEA().toDokument());
        competition.setRegulamin(dto.getRegulamin().toDokument());
        competition.setHarmonogram(dto.getHarmonogram().toDokument());
        competition.setListaFinalistow(dto.getListaFinalistow().toDokument());
        competition.setWyniki(dto.getWyniki().toDokument());

        EdycjaKonkursu result = competitonRepostiory.save(competition);
        return result;
    }
    
}
