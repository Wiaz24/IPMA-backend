package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Organizacja;

@Entity(name = "potencjalny_aplikant")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",
    discriminatorType = DiscriminatorType.STRING)
public class PotencjalnyAplikant {
    @Id
    private Long id;

    @Basic
    @NotNull
    private String nazwa;

    @NotNull
    @AttributeOverrides(
        {
            @AttributeOverride(name = "nazwa", column = @Column(name =
            "organizacja_nazwa")),
            @AttributeOverride(name = "adres", column = @Column(name =
            "organizacja_adres")),
            @AttributeOverride(name = "NIP", column = @Column(name =
            "organizacja_NIP")),
        }
    )
    private Organizacja organizacja;
}
