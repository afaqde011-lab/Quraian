package androidx.lifecycle;

import android.content.Context;
import c3.g1;
import g1.b5;
import l1.x1;

public final class n0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public final Object H;

    public n0(q qVar, p pVar, a40.z zVar, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.E = qVar;
        this.F = pVar;
        this.G = zVar;
        this.H = (m00.i) nVar;
    }

    public n0(c40.l lVar, x.b bVar, l1.z0 z0Var, l1.z0 z0Var2, k00.c cVar) {
        super(2, cVar);
        this.A = 7;
        this.E = lVar;
        this.F = bVar;
        this.G = z0Var;
        this.H = z0Var2;
    }

    public n0(b5 b5Var, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        this.H = b5Var;
    }

    public n0(Boolean bool, x.b bVar, x.b1 b1Var, l1.z0 z0Var, l1.z0 z0Var2, l1.z0 z0Var3, k00.c cVar) {
        super(2, cVar);
        this.A = 6;
        this.C = bool;
        this.D = bVar;
        this.E = b1Var;
        this.F = z0Var;
        this.G = z0Var2;
        this.H = z0Var3;
    }

    public n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.G = obj4;
        this.H = obj5;
    }

    public n0(u00.n nVar, u00.n nVar2, u00.a aVar, u00.k kVar, k00.c cVar) {
        super(2, cVar);
        this.A = 5;
        this.H = (m00.i) nVar;
        this.E = nVar2;
        this.F = aVar;
        this.G = kVar;
    }

    public n0(x.n0 n0Var, u00.k kVar, k00.c cVar) {
        super(2, cVar);
        this.A = 8;
        x.l0 l0Var = x.l0.A;
        this.G = n0Var;
        this.H = (m00.i) kVar;
    }

    public n0(xy.o oVar, u00.a aVar, ol.b bVar, a40.z zVar, g1 g1Var, Context context, k00.c cVar) {
        super(2, cVar);
        this.A = 9;
        this.C = oVar;
        this.D = aVar;
        this.E = bVar;
        this.G = zVar;
        this.F = g1Var;
        this.H = context;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        int i10 = this.A;
        Object obj2 = this.H;
        switch (i10) {
            case 0:
                return new n0((q) this.E, (p) this.F, (a40.z) this.G, (u00.n) obj2, cVar);
            case 1:
                n0 n0Var = new n0((v2.v) this.D, (u00.k) this.E, (u00.k) this.F, (u00.o) this.G, (u00.k) obj2, cVar, 1);
                n0Var.C = obj;
                return n0Var;
            case 2:
                n0 n0Var2 = new n0((du.t0) this.D, (Context) this.E, (ah.e) this.F, (cu.a) this.G, (vp.x) obj2, cVar, 2);
                n0Var2.C = obj;
                return n0Var2;
            case 3:
                return new n0((b5) obj2, cVar);
            case 4:
                return new n0((l1.p) this.D, (d6.r) this.E, (Context) this.F, (x1) this.G, (l6.y) obj2, cVar, 4);
            case 5:
                n0 n0Var3 = new n0((u00.n) obj2, (u00.n) this.E, (u00.a) this.F, (u00.k) this.G, cVar);
                n0Var3.D = obj;
                return n0Var3;
            case 6:
                return new n0((Boolean) this.C, (x.b) this.D, (x.b1) this.E, (l1.z0) this.F, (l1.z0) this.G, (l1.z0) obj2, cVar);
            case 7:
                n0 n0Var4 = new n0((c40.l) this.E, (x.b) this.F, (l1.z0) this.G, (l1.z0) obj2, cVar);
                n0Var4.D = obj;
                return n0Var4;
            case 8:
                x.l0 l0Var = x.l0.A;
                n0 n0Var5 = new n0((x.n0) this.G, (m00.i) obj2, cVar);
                n0Var5.F = obj;
                return n0Var5;
            default:
                return new n0((xy.o) this.C, (u00.a) this.D, (ol.b) this.E, (a40.z) this.G, (g1) this.F, (Context) obj2, cVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
