package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "czlonek_jury")
@Getter
@Setter
public class CzlonekJury {
    @Id
    private Long id;

    @Basic
    private boolean czyPrzewodzi;

    @ManyToOne(optional = false)
    private JuryNagrody juryNagrody;

    @ManyToOne(optional = false)
    private CzlonekJuryNagrody czlonekJuryNagrody;
}
