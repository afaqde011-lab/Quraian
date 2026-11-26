package wd;

public final class r extends d0 {

    public final q f16048a;

    public r(q qVar) {
        this.f16048a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.f16048a.equals(((r) ((d0) obj)).f16048a);
    }

    public final int hashCode() {
        return this.f16048a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f16048a + "}";
    }
}
