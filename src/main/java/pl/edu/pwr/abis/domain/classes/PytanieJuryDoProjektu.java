package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "pytanie_jury_do_projektu")
@Getter
@Setter
public class PytanieJuryDoProjektu {
    @Id
    private Long id;

    @NotNull
    @Basic
    private String tresc;

    @Basic
    private String odpowiedz;

    @ManyToOne(optional = false)
    private Projekt projekt;
}
