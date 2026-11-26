package a1;

public final class q {

    public int f112a;

    public int f113b;

    public int f114c;

    public int f115d;

    public q(int i10, int i11, int i12, int i13) {
        this.f112a = i10;
        this.f113b = i11;
        this.f114c = i12;
        this.f115d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f112a == qVar.f112a && this.f113b == qVar.f113b && this.f114c == qVar.f114c && this.f115d == qVar.f115d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115d) + w.c.d(this.f114c, w.c.d(this.f113b, Integer.hashCode(this.f112a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Change(preStart=");
        sb2.append(this.f112a);
        sb2.append(", preEnd=");
        sb2.append(this.f113b);
        sb2.append(", originalStart=");
        sb2.append(this.f114c);
        sb2.append(", originalEnd=");
        return oi.k.l(sb2, this.f115d, ')');
    }
}
