package nz;

public final class c implements h {
    public final boolean a;

    public c(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.j("OnDailyNotificationToggled(isToggled=", ")", this.a);
    }
}
