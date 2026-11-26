package ej;

public final class a implements e {

    public final int f5382a;

    public a(int i10) {
        this.f5382a = i10;
    }

    @Override
    public final Class annotationType() {
        return e.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.f5382a != ((a) ((e) obj)).f5382a) {
            return false;
        }
        Object obj2 = d.A;
        return obj2.equals(obj2);
    }

    @Override
    public final int hashCode() {
        return (this.f5382a ^ 14552422) + (d.A.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f5382a + "intEncoding=" + d.A + ')';
    }
}
