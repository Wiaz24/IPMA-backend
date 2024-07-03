package pl.edu.pwr.abis.domain.classes;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("OcenaIndywidualna")
public class OcenaIndywidualna extends Ocena{

    @OneToOne(optional = false)
    private Asesor asesor;
}
