package pl.edu.pwr.abis.domain.dataTypes;

import java.time.LocalDateTime;

import jakarta.persistence.Basic;

public class Date {
    @Basic
    private long year;

    @Basic
    private long monthOfYear;

    @Basic
    private long dayOfMonth;

    public Date now() {
        return new Date();
    }
}
