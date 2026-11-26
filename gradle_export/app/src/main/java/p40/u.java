package p40;

import ri.t1;

public final class u extends q0 {
    public final n40.h l;
    public final g00.p m;

    public u(final String str, final int i) {
        super(str, null, i);
        this.l = n40.h.c;
        this.m = rd.a.J(new u00.a() {
            @Override
            public final Object invoke() {
                int i2 = i;
                n40.e[] eVarArr = new n40.e[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    eVarArr[i3] = t1.m(str + '.' + this.e[i3], n40.i.f, new n40.e[0]);
                }
                return eVarArr;
            }
        });
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n40.e)) {
            return false;
        }
        n40.e eVar = (n40.e) obj;
        return eVar.getKind() == n40.h.c && this.a.equals(eVar.a()) && kotlin.jvm.internal.m.a(o0.b(this), o0.b(eVar));
    }

    @Override
    public final va.a getKind() {
        return this.l;
    }

    @Override
    public final n40.e h(int i) {
        return ((n40.e[]) this.m.getValue())[i];
    }

    @Override
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        g00.s sVar = new g00.s(this);
        int iHashCode2 = 1;
        while (sVar.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) sVar.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override
    public final String toString() {
        return h00.q.R0(new h00.p(this, 2), ", ", this.a.concat("("), ")", null, 56);
    }
}
