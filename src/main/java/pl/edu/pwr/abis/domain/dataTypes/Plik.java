package pl.edu.pwr.abis.domain.dataTypes;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Plik {
    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "year", column = @Column(insertable=false, updatable=false, name =
                "dataModyfikacji_year")),
            @AttributeOverride(name = "monthOfYear", column = @Column(insertable=false, updatable=false, name =
                "dataModyfikacji_monthOfYear")),
            @AttributeOverride(name = "dayOfMonth", column = @Column(insertable=false, updatable=false, name =
                "dataModyfikacji_dayOfMonth")),
            @AttributeOverride(name = "hourOfDay", column = @Column(insertable=false, updatable=false, name =
                "dataModyfikacji_hourOfDay")),
            @AttributeOverride(name = "minuteOfHour", column = @Column(insertable=false, updatable=false, name =
                "dataModyfikacji_minuteOfHour")),
            @AttributeOverride(name = "secondOfMinute", column = @Column(insertable=false, updatable=false, name =
                "dataModyfikacji_secondOfMinute")),
        }
    )
    private DateTime dataModyfikacji;

    @NotNull
    @Basic
    private String adres;
}
