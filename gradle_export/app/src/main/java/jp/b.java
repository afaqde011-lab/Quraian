package jp;

import java.time.LocalDate;

public final class b implements t {
    public final LocalDate a;

    public b(LocalDate date) {
        kotlin.jvm.internal.m.e(date, "date");
        this.a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.m.a(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnBirthDateSelected(date=" + this.a + ")";
    }
}
