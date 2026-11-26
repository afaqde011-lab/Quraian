package h0;

public final class a implements l2 {

    public final int f6377a;

    public final String f6378b;

    public final l1.i1 f6379c = l1.q.z(q4.b.f12754e);

    public final l1.i1 f6380d = l1.q.z(Boolean.TRUE);

    public a(int i10, String str) {
        this.f6377a = i10;
        this.f6378b = str;
    }

    @Override
    public final int a(y3.c cVar, y3.m mVar) {
        return e().f12757c;
    }

    @Override
    public final int b(y3.c cVar) {
        return e().f12758d;
    }

    @Override
    public final int c(y3.c cVar) {
        return e().f12756b;
    }

    @Override
    public final int d(y3.c cVar, y3.m mVar) {
        return e().f12755a;
    }

    public final q4.b e() {
        return (q4.b) this.f6379c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f6377a == ((a) obj).f6377a;
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f6380d.setValue(Boolean.valueOf(z10));
    }

    public final void g(z4.j1 j1Var, int i10) {
        int i11 = this.f6377a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f6379c.setValue(j1Var.f17202a.i(i11));
            f(j1Var.f17202a.u(i11));
        }
    }

    public final int hashCode() {
        return this.f6377a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6378b);
        sb2.append('(');
        sb2.append(e().f12755a);
        sb2.append(", ");
        sb2.append(e().f12756b);
        sb2.append(", ");
        sb2.append(e().f12757c);
        sb2.append(", ");
        return oi.k.l(sb2, e().f12758d, ')');
    }
}
