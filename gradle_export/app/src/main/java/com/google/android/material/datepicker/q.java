package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class q implements Comparable, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new k0(6);
    public final Calendar A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final long F;
    public String G;

    public q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = y.a(calendar);
        this.A = calendarA;
        this.B = calendarA.get(2);
        this.C = calendarA.get(1);
        this.D = calendarA.getMaximum(7);
        this.E = calendarA.getActualMaximum(5);
        this.F = calendarA.getTimeInMillis();
    }

    public static q a(int i10, int i11) {
        Calendar calendarC = y.c(null);
        calendarC.set(1, i10);
        calendarC.set(2, i11);
        return new q(calendarC);
    }

    public static q b(long j9) {
        Calendar calendarC = y.c(null);
        calendarC.setTimeInMillis(j9);
        return new q(calendarC);
    }

    public final String c() {
        if (this.G == null) {
            long timeInMillis = this.A.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = y.f4166a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.G = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.G;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.A.compareTo(((q) obj).A);
    }

    public final int d(q qVar) {
        if (!(this.A instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (qVar.B - this.B) + ((qVar.C - this.C) * 12);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.B == qVar.B && this.C == qVar.C;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.B), Integer.valueOf(this.C)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.C);
        parcel.writeInt(this.B);
    }
}
