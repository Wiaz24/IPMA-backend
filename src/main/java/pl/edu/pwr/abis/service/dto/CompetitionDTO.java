package pl.edu.pwr.abis.service.dto;

import java.io.Serializable;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.classes.EdycjaKonkursu;
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
        terminUroczystosci = new DataDTO(edycjaKonkursu.getTerminUroczystosci());
        miejsceUroczystosci = edycjaKonkursu.getMiejsceUroczystosci();
        ulotkaPPEA = new DokumentDTO(edycjaKonkursu.getUlotkaPPEA());
        regulamin = new DokumentDTO(edycjaKonkursu.getRegulamin());
        harmonogram = new DokumentDTO(edycjaKonkursu.getHarmonogram());
        listaFinalistow = new DokumentDTO(edycjaKonkursu.getListaFinalistow());
        wyniki = new DokumentDTO(edycjaKonkursu.getWyniki());
    }

    private Long id;

    private Double kosztUczestnictwa;

    //value must be bigger than 0
    @Min(value = 1)
    private Long numerEdycji;

    private Boolean czyAktywna = false;

    //validate DataDTO
    @Valid
    private DataDTO dataZgloszeniaAplikacji;

    @Valid
    private DataDTO dataDostarczeniaRaportu;

    @Valid
    private DataDTO dataOpracowaniaOcenyIndywidualnej;

    @Valid
    private DataDTO dataOpracowaniaOcenyWstepnej;

    @Valid
    private DataDTO dataOpracowaniaOcenyKoncowej;

    @Valid
    private DataDTO dataOpracowaniaRaportuWizyty;

    @Valid
    private DataDTO dataWizytyStudyjnej;

    @Valid
    private DataDTO terminUroczystosci;

    @Size(min = 5, max = 254)
    private String miejsceUroczystosci;

    @Valid
    private DokumentDTO ulotkaPPEA;

    @Valid
    private DokumentDTO regulamin;

    @Valid
    private DokumentDTO harmonogram;

    @Valid
    private DokumentDTO listaFinalistow;

    @Valid
    private DokumentDTO wyniki;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getKosztUczestnictwa() {
        return kosztUczestnictwa;
    }

    public void setKosztUczestnictwa(Double kosztUczestnictwa) {
        this.kosztUczestnictwa = kosztUczestnictwa;
    }

    public Long getNumerEdycji() {
        return numerEdycji;
    }

    public void setNumerEdycji(Long numerEdycji) {
        this.numerEdycji = numerEdycji;
    }

    public Boolean isCzyAktywna() {
        return czyAktywna;
    }

    public void setCzyAktywna(Boolean czyAktywna) {
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

    public DataDTO getTerminUroczystosci() {
        return terminUroczystosci;
    }

    public void setTerminUroczystosci(DataDTO terminUroczystosci) {
        this.terminUroczystosci = terminUroczystosci;
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
