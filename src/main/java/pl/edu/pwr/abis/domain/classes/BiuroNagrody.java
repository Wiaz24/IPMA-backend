package pl.edu.pwr.abis.domain.classes;

import java.util.Set;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Plik;

@Entity(name = "biuro_nagrody")
@Getter
@Setter
public class BiuroNagrody {
    @Id
    private Long id;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dataModyfikacji", column = @Column(name =
                "zestawienieOcenWstepnych_dataModyfikacji")),
            @AttributeOverride(name = "adres", column = @Column(name =
                "zestawienieOcenWstepnych_adres")),
        }
    )
    private Plik zestawienieOcenWstepnych;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dataModyfikacji", column = @Column(name =
                "zestawienieOcenKoncowych_dataModyfikacji")),
            @AttributeOverride(name = "adres", column = @Column(name =
                "zestawienieOcenKoncowych_adres")),
        }
    )
    private Plik zestawienieOcenKoncowych;
    @OneToOne(optional = false)
    private EdycjaKonkursu edycjaKonkursu;

    @OneToMany(mappedBy = "biuroNagrody")
    private Set<CzlonekBiuro> czlonekBiuro;
}
