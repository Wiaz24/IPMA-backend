package pl.edu.pwr.abis.domain.dataTypes;

import java.time.LocalDateTime;

import jakarta.persistence.Basic;

public class DateTime {
    @Basic
    private long year;

    @Basic
    private long monthOfYear;

    @Basic
    private long dayOfMonth;

    @Basic
    private long hourOfDay;

    @Basic
    private long minuteOfHour;

    @Basic
    private long secondOfMinute;

    public LocalDateTime now() {
        return LocalDateTime.now();
    }

}