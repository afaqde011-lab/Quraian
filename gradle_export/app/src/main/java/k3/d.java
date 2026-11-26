package k3;

import a1.n;
import b3.l0;
import b3.m;
import b3.p0;
import b3.p1;
import c3.z;
import f50.k;
import h1.v0;
import u.w;

public final class d {

    public final int f8949a;

    public final l0.c f8950b;

    public final v0 f8951c;

    public d f8952d;

    public long f8953e;

    public long f8954f;

    public long f8955g = Long.MIN_VALUE;

    public final e f8956h;

    public d(e eVar, int i10, l0.c cVar, v0 v0Var) {
        this.f8956h = eVar;
        this.f8949a = i10;
        this.f8950b = cVar;
        this.f8951c = v0Var;
    }

    public final void a(long j9, long j10, long j11, long j12, float[] fArr) throws Exception {
        c cVar;
        c cVar2;
        long j13 = this.f8956h.f8962f;
        l0.c cVar3 = this.f8950b;
        p1 p1VarV = m.v(cVar3, 2);
        l0 l0VarY = m.y(cVar3);
        boolean zK = l0VarY.K();
        n nVar = l0VarY.f2059g0;
        if (zK) {
            if (((p1) nVar.E) != p1VarV) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j9 >> 32)) << 32);
                long j14 = p1VarV.C;
                p1 p1Var = (p1) nVar.E;
                p1Var.getClass();
                long jC = k.C(p1Var.o(p1VarV, jFloatToRawIntBits, true));
                cVar = new c(jC, (4294967295L & ((long) (((int) (jC & 4294967295L)) + ((int) (j14 & 4294967295L))))) | (((long) (((int) (jC >> 32)) + ((int) (j14 >> 32)))) << 32), j11, j12, j13, fArr, cVar3);
            } else {
                cVar = new c(j9, j10, j11, j12, j13, fArr, cVar3);
            }
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return;
        }
        this.f8951c.invoke(cVar2);
    }

    public final void b() {
        e eVar = this.f8956h;
        w wVar = eVar.f8957a;
        int i10 = this.f8949a;
        d dVar = (d) wVar.g(i10);
        if (dVar != null) {
            if (dVar.equals(this)) {
                d dVar2 = this.f8952d;
                this.f8952d = null;
                if (dVar2 == null) {
                    l0 l0VarY = m.y(this.f8950b.A);
                    if (l0VarY.G) {
                        ((z) p0.a(l0VarY)).getRectManager().f8932b.D(l0VarY.B, false);
                        return;
                    }
                    return;
                }
                int iD = wVar.d(i10);
                Object[] objArr = wVar.f14873c;
                Object obj = objArr[iD];
                wVar.f14872b[iD] = i10;
                objArr[iD] = dVar2;
                return;
            }
            int iD2 = wVar.d(i10);
            Object[] objArr2 = wVar.f14873c;
            Object obj2 = objArr2[iD2];
            wVar.f14872b[iD2] = i10;
            objArr2[iD2] = dVar;
            while (true) {
                d dVar3 = dVar.f8952d;
                if (dVar3 == null) {
                    break;
                }
                if (dVar3 == this) {
                    dVar.f8952d = this.f8952d;
                    this.f8952d = null;
                    return;
                }
                dVar = dVar3;
            }
        }
        d dVar4 = eVar.f8958b;
        if (dVar4 == this) {
            eVar.f8958b = dVar4.f8952d;
            this.f8952d = null;
            return;
        }
        d dVar5 = dVar4 != null ? dVar4.f8952d : null;
        while (true) {
            d dVar6 = dVar4;
            dVar4 = dVar5;
            if (dVar4 == null) {
                return;
            }
            if (dVar4 == this) {
                if (dVar6 != null) {
                    dVar6.f8952d = dVar4.f8952d;
                }
                this.f8952d = null;
                return;
            }
            dVar5 = dVar4.f8952d;
        }
    }
}
