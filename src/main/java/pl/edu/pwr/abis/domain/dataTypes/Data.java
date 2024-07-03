package pl.edu.pwr.abis.domain.dataTypes;

import jakarta.persistence.Basic;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Data {

    @Basic
    private long dzien;

    @Basic
    private long miesiac;

    @Basic
    private long rok;

    public Data(long dzien, long miesiac, long rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    public Data() {
    }
}
