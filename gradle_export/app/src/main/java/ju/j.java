package ju;

public final class j {
    public final int a;
    public final int b;
    public final Integer c;

    public j(int i, Integer num, int i2) {
        this.a = i;
        this.b = i2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && kotlin.jvm.internal.m.a(this.c, jVar.c);
    }

    public final int hashCode() {
        int iD = w.c.d(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = oi.k.p(this.a, this.b, "PlaylistCardUi(titleRes=", ", imageRes=", ", reciterImageRes=");
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }
}
