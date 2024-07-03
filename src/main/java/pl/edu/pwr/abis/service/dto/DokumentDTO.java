package pl.edu.pwr.abis.service.dto;

import jakarta.validation.constraints.Size;
import pl.edu.pwr.abis.domain.dataTypes.Dokument;

public class DokumentDTO extends Serializable{

    private static final long serialVersionUID = 1L;

    @Size(min = 1, max = 254)
    private String format;

    public DokumentDTO() {
    }

    public DokumentDTO(String format) {
        this.format = format;
    }

    public DokumentDTO(Dokument dokument) {
        this.format = dokument.getFormat();
    }

    public Dokument toDokument() {
        Dokument dokument = new Dokument();
        dokument.setFormat(format);
        return dokument;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}