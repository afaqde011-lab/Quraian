package bk;

public final class s extends q {
    public final dk.n A = new dk.n(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof s) && ((s) obj).A.equals(this.A);
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }
}
