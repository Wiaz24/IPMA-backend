package pl.edu.pwr.abis.domain.dataTypes;

import jakarta.persistence.Basic;

public class Time {
    @Basic
    private long hourOfDay;

    @Basic
    private long minuteOfHour;

    @Basic
    private long secondOfMinute;

    public Time now() {
        return new Time();
    }
}
