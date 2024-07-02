package pl.edu.pwr.abis.service.dto;

import java.io.Serializable;
import java.util.Set;

import pl.edu.pwr.abis.domain.classes.BiuroNagrody;
import pl.edu.pwr.abis.domain.classes.JuryNagrody;
import pl.edu.pwr.abis.domain.classes.Webinarium;
import pl.edu.pwr.abis.domain.classes.WniosekAplikacyjny;
import pl.edu.pwr.abis.domain.dataTypes.Data;
import pl.edu.pwr.abis.domain.dataTypes.Dokument;

public class CompetitionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private double kosztUczestnictwa;

    private long numerEdycji;

    private boolean czyAktywna = false;

    private Data dataZgloszeniaAplikacji;

    private Data dataDostarczeniaRaportu;

    private Data dataOpracowaniaOcenyIndywidualnej;

    private Data dataOpracowaniaOcenyWstepnej;

    private Data dataOpracowaniaOcenyKoncowej;

    private Data dataOpracowaniaRaportuWizyty;

    private Data dataWizytyStudyjnej;

    private Data terminUroczystocci;

    private String miejsceUroczystosci;

    private Dokument ulotkaPPEA;

    private Dokument regulamin;

    private Dokument harmonogram;

    private Dokument listaFinalistow;

    private Dokument wyniki;

    private BiuroNagrody biuroNagrody;

    private Set<Webinarium> webinarium;

    private JuryNagrody juryNagrody;

    private Set<WniosekAplikacyjny> wniosekAplikacyjny;
}
