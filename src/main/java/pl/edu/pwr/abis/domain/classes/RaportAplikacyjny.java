package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.enums.StatusRaportu;

@Entity(name = "raport_aplikacyjny")
@Getter
@Setter

public class RaportAplikacyjny {
    @Id
    private Long id;

    @Basic
    @NotNull
    @Enumerated
    private StatusRaportu status;

    @ManyToOne(optional = false)
    private WniosekAplikacyjny wniosekAplikacyjny;
}
