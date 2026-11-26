package d6;

public final class h {

    public final int f4631a;

    public h(int i10) {
        this.f4631a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f4631a == ((h) obj).f4631a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4631a);
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("AppWidgetId(appWidgetId="), this.f4631a, ')');
    }
}
