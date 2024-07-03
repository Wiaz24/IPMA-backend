package pl.edu.pwr.abis.domain.classes;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "jury_nagrody")
@Getter
@Setter
public class JuryNagrody {
    @Id
    private Long id;

    @OneToOne(optional = false)
    private EdycjaKonkursu edycjaKonkursu;

    @OneToMany(mappedBy = "juryNagrody")
    @OrderBy("id")
    private List<SpotkanieJury> spotkanieJury;

    @OneToMany(mappedBy = "juryNagrody")
    private Set<CzlonekJury> czlonekJury;
}
