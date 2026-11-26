package bt;

public final class q implements w {
    public final ys.c a;

    public q(ys.c period) {
        kotlin.jvm.internal.m.e(period, "period");
        this.a = period;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.a == ((q) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPeriodSelected(period=" + this.a + ")";
    }
}
