package com.google.android.material.datepicker;

import java.util.Calendar;

public final class a {

    public static final int f4153b = 0;

    public Long f4154a;

    static {
        long j9 = q.a(1900, 0).F;
        Calendar calendarC = y.c(null);
        calendarC.setTimeInMillis(j9);
        y.a(calendarC).getTimeInMillis();
        long j10 = q.a(2100, 11).F;
        Calendar calendarC2 = y.c(null);
        calendarC2.setTimeInMillis(j10);
        y.a(calendarC2).getTimeInMillis();
    }
}
