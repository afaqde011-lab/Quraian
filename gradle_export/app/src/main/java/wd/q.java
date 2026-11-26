package wd;

public final class q extends c0 {

    public final Integer f16047a;

    public q(Integer num) {
        this.f16047a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        Integer num = this.f16047a;
        q qVar = (q) ((c0) obj);
        if (num == null) {
            return qVar.f16047a == null;
        }
        return num.equals(qVar.f16047a);
    }

    public final int hashCode() {
        Integer num = this.f16047a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f16047a + "}";
    }
}
