package pl.edu.pwr.abis.service.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import pl.edu.pwr.abis.domain.dataTypes.Data;

// import jakarta.persistence.Basic;

public class DataDTO extends Serializable{

    private static final long serialVersionUID = 1L;

    @Min(value = 1)
    @Max(value = 31)
    private long dzien;

    @Min(value = 1)
    @Max(value = 12)
    private long miesiac;

    @Min(value = 1900)
    @Max(value = 2500)
    private long rok;

    public DataDTO() {
    }

    public DataDTO(long dzien, long miesiac, long rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    public DataDTO(Data data) {
        this.dzien = data.getDzien();
        this.miesiac = data.getMiesiac();
        this.rok = data.getRok();
    }

    public Data toData() {
        return new Data(dzien, miesiac, rok);
    }

    public long getDzien() {
        return dzien;
    }

    public void setDzien(long dzien) {
        this.dzien = dzien;
    }

    public long getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(long miesiac) {
        this.miesiac = miesiac;
    }

    public long getRok() {
        return rok;
    }

    public void setRok(long rok) {
        this.rok = rok;
    }

}
