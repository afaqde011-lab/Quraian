package q3;

public final class s implements q {

    public final int f12749a;

    public s(int i10) {
        this.f12749a = i10;
    }

    @Override
    public final float a() {
        return this.f12749a;
    }

    @Override
    public final String b() {
        return "wght";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f12749a == ((s) obj).f12749a;
    }

    public final int hashCode() {
        return 113071012 + this.f12749a;
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.f12749a, ')');
    }
}
