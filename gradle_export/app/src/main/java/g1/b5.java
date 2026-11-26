package g1;

import java.util.concurrent.atomic.AtomicInteger;

public final class b5 implements z0.c {

    public boolean f5735a;

    public boolean f5736b;

    public final Object f5737c;

    public final Object f5738d;

    public final Object f5739e;

    public final Object f5740f;

    public final Object f5741g;

    public final Object f5742h;

    public final Object f5743i;

    public final Object f5744j;

    public final Object f5745k;
    public final Object l;

    public b5(rc.c cVar) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        rc.g gVar = cVar.f13151a;
        cd.b bVarF = cVar.f();
        kotlin.jvm.internal.m.e(bVarF, "logger");
        h7.b bVar = new h7.b();
        bVar.A = gVar;
        bVar.B = bVarF;
        qd.j0 j0Var = new qd.j0(gVar.f13179h, 7);
        fd.d dVarG = cVar.g();
        a40.z zVar = cVar.f13153c;
        c40.h hVarB = ri.t1.b(Integer.MAX_VALUE, 6, null);
        c40.h hVarB2 = ri.t1.b(Integer.MAX_VALUE, 6, null);
        kotlin.jvm.internal.m.e(dVarG, "storage");
        this.f5737c = cVar;
        this.f5738d = atomicInteger;
        this.f5739e = bVar;
        this.f5740f = j0Var;
        this.f5741g = dVarG;
        this.f5742h = zVar;
        this.f5743i = hVarB;
        this.f5744j = hVarB2;
        this.f5745k = new AtomicInteger(1);
        this.l = rd.a.J(new b3.j0(this, 13));
        this.f5735a = false;
        this.f5736b = false;
        try {
            Runtime.getRuntime().addShutdownHook(new h7.g(this, 1));
        } catch (IllegalStateException unused) {
        }
    }

    public b5(z0.g gVar, z0.f fVar, w6 w6Var, u00.n nVar, u00.n nVar2, u00.n nVar3, boolean z10, boolean z11, f0.i iVar, h0.p1 p1Var, t6 t6Var, v1.c cVar) {
        this.f5737c = gVar;
        this.f5738d = fVar;
        this.f5739e = w6Var;
        this.f5740f = nVar;
        this.f5741g = nVar2;
        this.f5742h = nVar3;
        this.f5735a = z10;
        this.f5736b = z11;
        this.f5743i = iVar;
        this.f5744j = p1Var;
        this.f5745k = t6Var;
        this.l = cVar;
    }

    @Override
    public void a(v1.c cVar, l1.j jVar, int i10) {
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(794272399);
        int i11 = (g0Var2.g(this) ? 32 : 16) | i10;
        if (g0Var2.S(i11 & 1, (i11 & 19) != 18)) {
            CharSequence charSequence = ((z0.g) this.f5737c).d().C;
            h1.f1[] f1VarArr = h1.f1.A;
            g0Var = g0Var2;
            h1.e1.a(charSequence, cVar, (w6) this.f5739e, null, (u00.n) this.f5740f, (u00.n) this.f5741g, (u00.n) this.f5742h, null, kotlin.jvm.internal.m.a((z0.f) this.f5738d, z0.e.B), this.f5735a, this.f5736b, (f0.i) this.f5743i, (h0.p1) this.f5744j, (t6) this.f5745k, (v1.c) this.l, g0Var, 390, 0);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new al.i(this, cVar, i10, 16);
        }
    }

    public void b(gd.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "event");
        aVar.L++;
        ((c40.l) this.f5743i).j(new hd.d(hd.e.A, aVar));
    }
}
