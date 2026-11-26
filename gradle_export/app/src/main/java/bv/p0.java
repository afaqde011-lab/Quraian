package bv;

public final class p0 implements g1 {
    public final ru.d a;

    public p0(ru.d option) {
        kotlin.jvm.internal.m.e(option, "option");
        this.a = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && this.a == ((p0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSleepTimerOptionSelected(option=" + this.a + ")";
    }
}
