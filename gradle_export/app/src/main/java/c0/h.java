package c0;

import a40.z;
import b2.r;
import c4.b0;
import g1.e0;
import g1.h8;
import g1.j0;
import g1.k8;
import g1.l3;
import g1.x5;
import i2.t0;
import l1.j;
import l1.q;
import l1.z0;
import u00.n;
import u00.o;

public final class h implements n {
    public final int A = 2;
    public final boolean B;
    public final Object C;
    public final int D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public h(r rVar, u00.a aVar, boolean z10, t0 t0Var, l3 l3Var, v1.c cVar, int i10) {
        this.C = rVar;
        this.H = aVar;
        this.B = z10;
        this.E = t0Var;
        this.F = l3Var;
        this.G = cVar;
        this.D = i10;
    }

    public h(b0 b0Var, k8 k8Var, z zVar, boolean z10, z0 z0Var, v1.c cVar, int i10) {
        this.E = b0Var;
        this.F = k8Var;
        this.C = zVar;
        this.B = z10;
        this.G = z0Var;
        this.H = cVar;
        this.D = i10;
    }

    public h(b0 b0Var, v1.c cVar, k8 k8Var, r rVar, boolean z10, v1.c cVar2, int i10) {
        this.E = b0Var;
        this.F = cVar;
        this.G = k8Var;
        this.C = rVar;
        this.B = z10;
        this.H = cVar2;
        this.D = i10;
    }

    public h(fx.b bVar, int i10, boolean z10, u30.b bVar2, u00.a aVar, r rVar, y3.f fVar, int i11) {
        this.E = bVar;
        this.D = i10;
        this.B = z10;
        this.F = bVar2;
        this.H = aVar;
        this.C = rVar;
        this.G = fVar;
    }

    public h(String str, boolean z10, c cVar, r rVar, o oVar, u00.a aVar, int i10) {
        this.E = str;
        this.B = z10;
        this.F = cVar;
        this.C = rVar;
        this.G = oVar;
        this.H = aVar;
        this.D = i10;
    }

    public h(boolean z10, l3.a aVar, r rVar, e0 e0Var, k2.h hVar, k2.h hVar2, int i10) {
        this.B = z10;
        this.E = aVar;
        this.C = rVar;
        this.F = e0Var;
        this.G = hVar;
        this.H = hVar2;
        this.D = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                i.c((String) this.E, this.B, (c) this.F, (r) this.C, (o) this.G, (u00.a) this.H, (j) obj, q.K(this.D | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                j0.b(this.B, (l3.a) this.E, (r) this.C, (e0) this.F, (k2.h) this.G, (k2.h) this.H, (j) obj, q.K(this.D | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                x5.f((r) this.C, (u00.a) this.H, this.B, (t0) this.E, (l3) this.F, (v1.c) this.G, (j) obj, q.K(this.D | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                h8.b((b0) this.E, (v1.c) this.F, (k8) this.G, (r) this.C, this.B, (v1.c) this.H, (j) obj, q.K(this.D | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                h1.f.d((b0) this.E, (k8) this.F, (z) this.C, this.B, (z0) this.G, (v1.c) this.H, (j) obj, q.K(this.D | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iK = q.K(1);
                kx.a.m((fx.b) this.E, this.D, this.B, (u30.b) this.F, (u00.a) this.H, (r) this.C, (y3.f) this.G, (j) obj, iK);
                break;
        }
        return g00.b0.a;
    }
}
