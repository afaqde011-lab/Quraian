package l0;

import android.os.Trace;

public final class v0 {

    public final u00.k f9798a;

    public c7.c f9800c;

    public int f9803f;

    public final k9.x0 f9799b = new k9.x0(1, (byte) 0);

    public int f9801d = -1;

    public int f9802e = -1;

    public v0(u00.k kVar) {
        this.f9798a = kVar;
    }

    public final u0 a(int i10, long j9, boolean z10, u00.k kVar) {
        c7.c cVar = this.f9800c;
        if (cVar == null) {
            return j.f9757a;
        }
        k1 k1Var = (k1) cVar.D;
        boolean z11 = k1Var instanceof a;
        j1 j1Var = new j1(cVar, i10, this.f9799b, kVar);
        j1Var.f9761d = new y3.a(j9);
        if (!z11) {
            k1Var.a(j1Var);
        } else if (z10) {
            a aVar = (a) k1Var;
            aVar.B.add(new n1(1, j1Var));
            if (!aVar.C) {
                aVar.C = true;
                aVar.A.post(aVar);
            }
        } else {
            a aVar2 = (a) k1Var;
            aVar2.B.add(new n1(0, j1Var));
            if (!aVar2.C) {
                aVar2.C = true;
                aVar2.A.post(aVar2);
            }
        }
        Trace.setCounter("compose:lazy:schedule_prefetch:index", i10);
        return j1Var;
    }
}
