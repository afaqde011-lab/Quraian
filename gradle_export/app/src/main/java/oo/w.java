package oo;

public final class w implements a0 {
    public final ru.d a;

    public w(ru.d option) {
        kotlin.jvm.internal.m.e(option, "option");
        this.a = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a == ((w) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSleepTimerSelected(option=" + this.a + ")";
    }
}
