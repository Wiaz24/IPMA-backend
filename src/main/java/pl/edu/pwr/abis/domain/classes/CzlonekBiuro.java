package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "czlonek_biuro")
@Getter
@Setter
public class CzlonekBiuro {
    @Id
    private Long id;

    @ManyToOne(optional = false)
    private BiuroNagrody biuroNagrody;

    @ManyToOne(optional = false)
    private PrzedstawicielBiuraNagrody przedstawicielBiuraNagrody;
}
