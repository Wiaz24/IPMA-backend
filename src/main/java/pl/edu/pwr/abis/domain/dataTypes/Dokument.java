package pl.edu.pwr.abis.domain.dataTypes;

import jakarta.persistence.Basic;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Dokument {
    @NotNull
    @Basic
    private String format;
}
