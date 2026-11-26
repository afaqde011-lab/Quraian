package androidx.media3.common;

public final class k {

    public final int f1297a = 0;

    public int f1298b;

    public int f1299c;

    public int f1300d;

    public Object f1301e;

    public k(int i10) {
        this.f1298b = i10;
    }

    public k(int i10, int i11, int i12, m3.n0 n0Var) {
        this.f1298b = i10;
        this.f1299c = i11;
        this.f1300d = i12;
        this.f1301e = n0Var;
    }

    public k(p1.l0 l0Var) {
        this.f1301e = l0Var;
    }

    public e1.t a(int i10) {
        return new e1.t(c7.i.E((m3.n0) this.f1301e, i10), i10, 1L);
    }

    public l b() {
        ta.c0.s(this.f1299c <= this.f1300d);
        return new l(this);
    }

    public int c(int i10) {
        return ((p1.l0) this.f1301e).f12279c[this.f1299c + i10];
    }

    public Object d(int i10) {
        return ((p1.l0) this.f1301e).f12281e[this.f1300d + i10];
    }

    public String toString() {
        switch (this.f1297a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
                int i10 = this.f1298b;
                sb2.append(i10);
                sb2.append('-');
                m3.n0 n0Var = (m3.n0) this.f1301e;
                sb2.append(c7.i.E(n0Var, i10));
                sb2.append(',');
                int i11 = this.f1299c;
                sb2.append(i11);
                sb2.append('-');
                sb2.append(c7.i.E(n0Var, i11));
                sb2.append("), prevOffset=");
                return oi.k.l(sb2, this.f1300d, ')');
            default:
                return super.toString();
        }
    }
}
