package pl.edu.pwr.abis.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import pl.edu.pwr.abis.domain.classes.EdycjaKonkursu;
import pl.edu.pwr.abis.repository.CompetitonRepostiory;
import pl.edu.pwr.abis.service.dto.CompetitionDTO;
import pl.edu.pwr.abis.web.rest.errors.CompetitionNotFoundException;

@Service
public class CompetitionService {

    private final CompetitonRepostiory competitonRepostiory;

    public CompetitionService(CompetitonRepostiory competitonRepostiory) {
        this.competitonRepostiory = competitonRepostiory;
    }

    public EdycjaKonkursu createEdycjaKonkursu(CompetitionDTO dto)
    {
        EdycjaKonkursu competition = new EdycjaKonkursu();

        // competition.setKosztUczestnictwa(dto.getKosztUczestnictwa()); // Die Teilnahmekosten sind statisch
        long myId = dto.getId();
        competition.setId(myId);
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

    public EdycjaKonkursu updateEdycjaKonkursu(CompetitionDTO dto, Long id)
    {
        Optional<EdycjaKonkursu> optCompetition = competitonRepostiory.findById(id);
        if (optCompetition.isEmpty()) {
            throw new CompetitionNotFoundException();
        }
        EdycjaKonkursu competition = optCompetition.get();

        if (dto.getNumerEdycji() != null) {
            competition.setNumerEdycji(dto.getNumerEdycji());
        }

        if (dto.isCzyAktywna() != null) {
            competition.setCzyAktywna(dto.isCzyAktywna());
        }

        if (dto.getDataZgloszeniaAplikacji() != null) {
            competition.setDataZgloszeniaAplikacji(dto.getDataZgloszeniaAplikacji().toData());
        }

        if (dto.getDataDostarczeniaRaportu() != null) {
            competition.setDataDostarczeniaRaportu(dto.getDataDostarczeniaRaportu().toData());
        }

        if (dto.getDataOpracowaniaOcenyIndywidualnej() != null) {
            competition.setDataOpracowaniaOcenyIndywidualnej(dto.getDataOpracowaniaOcenyIndywidualnej().toData());
        }

        if (dto.getDataOpracowaniaOcenyWstepnej() != null) {
            competition.setDataOpracowaniaOcenyWstepnej(dto.getDataOpracowaniaOcenyWstepnej().toData());
        }

        if (dto.getDataOpracowaniaOcenyKoncowej() != null) {
            competition.setDataOpracowaniaOcenyKoncowej(dto.getDataOpracowaniaOcenyKoncowej().toData());
        }

        if (dto.getDataOpracowaniaRaportuWizyty() != null) {
            competition.setDataOpracowaniaRaportuWizyty(dto.getDataOpracowaniaRaportuWizyty().toData());
        }

        if (dto.getDataWizytyStudyjnej() != null) {
            competition.setDataWizytyStudyjnej(dto.getDataWizytyStudyjnej().toData());
        }

        if (dto.getTerminUroczystosci() != null) {
            competition.setTerminUroczystosci(dto.getTerminUroczystosci().toData());
        }

        if (dto.getMiejsceUroczystosci() != null) {
            competition.setMiejsceUroczystosci(dto.getMiejsceUroczystosci());
        }

        if (dto.getUlotkaPPEA() != null) {
            competition.setUlotkaPPEA(dto.getUlotkaPPEA().toDokument());
        }

        if (dto.getRegulamin() != null) {
            competition.setRegulamin(dto.getRegulamin().toDokument());
        }

        if (dto.getHarmonogram() != null) {
            competition.setHarmonogram(dto.getHarmonogram().toDokument());
        }

        if (dto.getListaFinalistow() != null) {
            competition.setListaFinalistow(dto.getListaFinalistow().toDokument());
        }

        if (dto.getWyniki() != null) {
            competition.setWyniki(dto.getWyniki().toDokument());
        }

        EdycjaKonkursu result = competitonRepostiory.save(competition);
        return result;
    }
}
