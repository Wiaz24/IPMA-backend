package pl.edu.pwr.abis.domain.classes;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "czlonek_jury_nagrody")
@Getter
@Setter
public class CzlonekJuryNagrody {
    @Id
    private Long id;

    @OneToMany(mappedBy = "czlonekJuryNagrody")
    private Set<CzlonekJury> czlonekJury;
}
