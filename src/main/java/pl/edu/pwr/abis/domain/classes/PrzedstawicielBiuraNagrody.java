package pl.edu.pwr.abis.domain.classes;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "przedstawiciel_biura_nagrody")
@Getter
@Setter
public class PrzedstawicielBiuraNagrody {
    @Id
    private Long id;

    @OneToMany(mappedBy = "przedstawicielBiuraNagrody")
    private Set<CzlonekBiuro> czlonekBiuro;
}
