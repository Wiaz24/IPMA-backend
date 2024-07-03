package pl.edu.pwr.abis.domain.classes;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity
@Getter
@Schema
@DiscriminatorValue("Aplikant")
public class Aplikant extends PotencjalnyAplikant{
    @OneToOne(optional = true)
    private WniosekAplikacyjny wniosekAplikacyjny;

}
