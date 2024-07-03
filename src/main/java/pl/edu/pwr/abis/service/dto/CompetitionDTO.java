package pl.edu.pwr.abis.service.dto;

import java.io.Serializable;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.classes.BiuroNagrody;
import pl.edu.pwr.abis.domain.classes.EdycjaKonkursu;
import pl.edu.pwr.abis.domain.classes.JuryNagrody;
import pl.edu.pwr.abis.domain.classes.Webinarium;
import pl.edu.pwr.abis.domain.classes.WniosekAplikacyjny;
import pl.edu.pwr.abis.domain.dataTypes.Dokument;
@Getter
@Setter
public class CompetitionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public CompetitionDTO() {
    }

    public CompetitionDTO(EdycjaKonkursu edycjaKonkursu)
    {
        id = edycjaKonkursu.getId();
        kosztUczestnictwa = edycjaKonkursu.getKosztUczestnictwa();
        numerEdycji = edycjaKonkursu.getNumerEdycji();
        czyAktywna = edycjaKonkursu.isCzyAktywna();
        dataZgloszeniaAplikacji = new DataDTO(edycjaKonkursu.getDataZgloszeniaAplikacji());
        dataDostarczeniaRaportu = new DataDTO(edycjaKonkursu.getDataDostarczeniaRaportu());
        dataOpracowaniaOcenyIndywidualnej = new DataDTO(edycjaKonkursu.getDataOpracowaniaOcenyIndywidualnej());
        dataOpracowaniaOcenyWstepnej = new DataDTO(edycjaKonkursu.getDataOpracowaniaOcenyWstepnej());
        dataOpracowaniaOcenyKoncowej = new DataDTO(edycjaKonkursu.getDataOpracowaniaOcenyKoncowej());
        dataOpracowaniaRaportuWizyty = new DataDTO(edycjaKonkursu.getDataOpracowaniaRaportuWizyty());
        dataWizytyStudyjnej = new DataDTO(edycjaKonkursu.getDataWizytyStudyjnej());
        terminUroczystocci = new DataDTO(edycjaKonkursu.getTerminUroczystocci());
        miejsceUroczystosci = edycjaKonkursu.getMiejsceUroczystosci();
        ulotkaPPEA = new DokumentDTO(edycjaKonkursu.getUlotkaPPEA());
        regulamin = new DokumentDTO(edycjaKonkursu.getRegulamin());
        harmonogram = new DokumentDTO(edycjaKonkursu.getHarmonogram());
        listaFinalistow = new DokumentDTO(edycjaKonkursu.getListaFinalistow());
        wyniki = new DokumentDTO(edycjaKonkursu.getWyniki());
    }

    private Long id;

    private double kosztUczestnictwa;

    private long numerEdycji;

    private boolean czyAktywna = false;

    private DataDTO dataZgloszeniaAplikacji;

    private DataDTO dataDostarczeniaRaportu;

    private DataDTO dataOpracowaniaOcenyIndywidualnej;

    private DataDTO dataOpracowaniaOcenyWstepnej;

    private DataDTO dataOpracowaniaOcenyKoncowej;

    private DataDTO dataOpracowaniaRaportuWizyty;

    private DataDTO dataWizytyStudyjnej;

    private DataDTO terminUroczystocci;

    private String miejsceUroczystosci;

    private DokumentDTO ulotkaPPEA;

    private DokumentDTO regulamin;

    private DokumentDTO harmonogram;

    private DokumentDTO listaFinalistow;

    private DokumentDTO wyniki;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getKosztUczestnictwa() {
        return kosztUczestnictwa;
    }

    public void setKosztUczestnictwa(double kosztUczestnictwa) {
        this.kosztUczestnictwa = kosztUczestnictwa;
    }

    public long getNumerEdycji() {
        return numerEdycji;
    }

    public void setNumerEdycji(long numerEdycji) {
        this.numerEdycji = numerEdycji;
    }

    public boolean isCzyAktywna() {
        return czyAktywna;
    }

    public void setCzyAktywna(boolean czyAktywna) {
        this.czyAktywna = czyAktywna;
    }

    public DataDTO getDataZgloszeniaAplikacji() {
        return dataZgloszeniaAplikacji;
    }

    public void setDataZgloszeniaAplikacji(DataDTO dataZgloszeniaAplikacji) {
        this.dataZgloszeniaAplikacji = dataZgloszeniaAplikacji;
    }

    public DataDTO getDataDostarczeniaRaportu() {
        return dataDostarczeniaRaportu;
    }

    public void setDataDostarczeniaRaportu(DataDTO dataDostarczeniaRaportu) {
        this.dataDostarczeniaRaportu = dataDostarczeniaRaportu;
    }

    public DataDTO getDataOpracowaniaOcenyIndywidualnej() {
        return dataOpracowaniaOcenyIndywidualnej;
    }

    public void setDataOpracowaniaOcenyIndywidualnej(DataDTO dataOpracowaniaOcenyIndywidualnej) {
        this.dataOpracowaniaOcenyIndywidualnej = dataOpracowaniaOcenyIndywidualnej;
    }

    public DataDTO getDataOpracowaniaOcenyWstepnej() {
        return dataOpracowaniaOcenyWstepnej;
    }

    public void setDataOpracowaniaOcenyWstepnej(DataDTO dataOpracowaniaOcenyWstepnej) {
        this.dataOpracowaniaOcenyWstepnej = dataOpracowaniaOcenyWstepnej;
    }

    public DataDTO getDataOpracowaniaOcenyKoncowej() {
        return dataOpracowaniaOcenyKoncowej;
    }

    public void setDataOpracowaniaOcenyKoncowej(DataDTO dataOpracowaniaOcenyKoncowej) {
        this.dataOpracowaniaOcenyKoncowej = dataOpracowaniaOcenyKoncowej;
    }

    public DataDTO getDataOpracowaniaRaportuWizyty() {
        return dataOpracowaniaRaportuWizyty;
    }

    public void setDataOpracowaniaRaportuWizyty(DataDTO dataOpracowaniaRaportuWizyty) {
        this.dataOpracowaniaRaportuWizyty = dataOpracowaniaRaportuWizyty;
    }

    public DataDTO getDataWizytyStudyjnej() {
        return dataWizytyStudyjnej;
    }

    public void setDataWizytyStudyjnej(DataDTO dataWizytyStudyjnej) {
        this.dataWizytyStudyjnej = dataWizytyStudyjnej;
    }

    public DataDTO getTerminUroczystocci() {
        return terminUroczystocci;
    }

    public void setTerminUroczystocci(DataDTO terminUroczystocci) {
        this.terminUroczystocci = terminUroczystocci;
    }

    public String getMiejsceUroczystosci() {
        return miejsceUroczystosci;
    }

    public void setMiejsceUroczystosci(String miejsceUroczystosci) {
        this.miejsceUroczystosci = miejsceUroczystosci;
    }

    public DokumentDTO getUlotkaPPEA() {
        return ulotkaPPEA;
    }

    public void setUlotkaPPEA(DokumentDTO ulotkaPPEA) {
        this.ulotkaPPEA = ulotkaPPEA;
    }

    public DokumentDTO getRegulamin() {
        return regulamin;
    }

    public void setRegulamin(DokumentDTO regulamin) {
        this.regulamin = regulamin;
    }

    public DokumentDTO getHarmonogram() {
        return harmonogram;
    }

    public void setHarmonogram(DokumentDTO harmonogram) {
        this.harmonogram = harmonogram;
    }

    public DokumentDTO getListaFinalistow() {
        return listaFinalistow;
    }

    public void setListaFinalistow(DokumentDTO listaFinalistow) {
        this.listaFinalistow = listaFinalistow;
    }

    public DokumentDTO getWyniki() {
        return wyniki;
    }

    public void setWyniki(DokumentDTO wyniki) {
        this.wyniki = wyniki;
    }

}
