package pl.edu.pwr.abis.domain.dataTypes;

import jakarta.persistence.Basic;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Organizacja {

    @Basic
    private String nazwa;

    @Basic
    private String adres;

    @Basic
    private String NIP;
}
