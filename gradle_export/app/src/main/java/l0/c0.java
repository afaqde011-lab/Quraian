package l0;

import java.util.ArrayList;

public final class c0 extends b2.q implements b3.o {
    public f0 O;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && kotlin.jvm.internal.m.a(this.O, ((c0) obj).O);
    }

    public final int hashCode() {
        return this.O.hashCode();
    }

    @Override
    public final void i(b3.o0 o0Var) {
        ArrayList arrayList = this.O.f9737i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            l2.b bVar = zVar.f9819n;
            if (bVar != null) {
                long j9 = zVar.m;
                long j10 = bVar.f9990t;
                float f3 = ((int) (j9 >> 32)) - ((int) (j10 >> 32));
                float f10 = ((int) (j9 & 4294967295L)) - ((int) (4294967295L & j10));
                k2.b bVar2 = o0Var.A;
                ((hf.c) bVar2.B.B).I(f3, f10);
                try {
                    rd.a.x(o0Var, bVar);
                    ((hf.c) bVar2.B.B).I(-f3, -f10);
                } catch (Throwable th2) {
                    ((hf.c) bVar2.B.B).I(-f3, -f10);
                    throw th2;
                }
            }
        }
        o0Var.a();
    }

    @Override
    public final void t1() {
        this.O.f9738j = this;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.O + ')';
    }

    @Override
    public final void u1() {
        f0 f0Var = this.O;
        f0Var.e();
        f0Var.f9730b = null;
        f0Var.f9731c = -1;
    }
}
