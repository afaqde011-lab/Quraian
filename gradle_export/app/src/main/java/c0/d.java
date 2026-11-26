package c0;

import bz.o;
import l1.g0;
import l1.j;
import l1.r1;
import u00.n;
import z1.p;

public final class d {

    public final p f2582a = new p();

    public static void b(d dVar, n nVar, v1.c cVar, u00.a aVar, int i10) {
        if ((i10 & 8) != 0) {
            cVar = null;
        }
        dVar.f2582a.add(new v1.c(new o(nVar, dVar, cVar, aVar), -1789283891, true));
    }

    public final void a(c cVar, j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-798501095);
        int i11 = (g0Var.g(cVar) ? 4 : 2) | i10 | (g0Var.g(this) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            p pVar = this.f2582a;
            int size = pVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((u00.o) pVar.get(i12)).invoke(cVar, g0Var, Integer.valueOf(i11 & 14));
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new al.i(this, cVar, i10, 4);
        }
    }
}
