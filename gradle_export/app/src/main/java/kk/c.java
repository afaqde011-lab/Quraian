package kk;

import a1.i;
import i2.d0;
import i2.w0;
import jk.h;
import kotlin.jvm.internal.m;
import l1.i1;
import l1.q;
import u00.k;
import z2.a0;

public final class c implements jk.a {

    public final l2.b f9708a;

    public final i1 f9709b;

    public h f9710c;

    public c(l2.b bVar) {
        m.e(bVar, "graphicsLayer");
        this.f9708a = bVar;
        this.f9709b = q.z(null);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void b(k2.d dVar, y3.c cVar, a0 a0Var, k kVar) {
        a0 a0Var2;
        long jE;
        m.e(dVar, "<this>");
        m.e(cVar, "density");
        if (a0Var == null || (a0Var2 = (a0) this.f9709b.getValue()) == null) {
            return;
        }
        i iVarG0 = dVar.G0();
        long jQ = iVarG0.q();
        iVarG0.n().i();
        try {
            hf.c cVar2 = (hf.c) iVarG0.B;
            if (kVar != null) {
                c().a(cVar2, cVar, kVar);
            }
            try {
                jE = a0Var2.o(a0Var, 0L, (6 & 4) != 0);
            } catch (Exception unused) {
                jE = h2.b.e(a0Var.e(0L), a0Var2.e(0L));
            }
            cVar2.I(-Float.intBitsToFloat((int) (jE >> 32)), -Float.intBitsToFloat((int) (jE & 4294967295L)));
            rd.a.x(dVar, this.f9708a);
            w.c.t(iVarG0, jQ);
        } catch (Throwable th2) {
            w.c.t(iVarG0, jQ);
            throw th2;
        }
    }

    public final h c() {
        h hVar = this.f9710c;
        if (hVar != null) {
            hVar.A = 9205357640488583168L;
            hVar.B = 1.0f;
            hVar.C = 1.0f;
            hVar.D = 1.0f;
            hVar.E = 1.0f;
            int i10 = d0.f7119b;
            hVar.F = 0.0f;
            long j9 = w0.f7175b;
            hVar.G = null;
            return hVar;
        }
        h hVar2 = new h();
        hVar2.A = 9205357640488583168L;
        hVar2.B = 1.0f;
        hVar2.C = 1.0f;
        hVar2.D = 1.0f;
        hVar2.E = 1.0f;
        int i11 = d0.f7119b;
        long j10 = w0.f7175b;
        this.f9710c = hVar2;
        return hVar2;
    }
}
