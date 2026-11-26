package l0;

import com.google.android.gms.cast.Cast;
import java.util.Map;
import l1.q2;
import l1.r1;

public final class g1 implements y1.f, y1.c {
    public final y1.g A;
    public final y1.c B;
    public final u.j0 C;

    public g1(y1.f fVar, Map map, y1.c cVar) {
        h00.a aVar = new h00.a(fVar, 14);
        q2 q2Var = y1.h.f16584a;
        this.A = new y1.g(map, aVar);
        this.B = cVar;
        u.j0 j0Var = u.r0.f14890a;
        this.C = new u.j0();
    }

    @Override
    public final boolean a(Object obj) {
        return this.A.a(obj);
    }

    @Override
    public final Map b() {
        u.j0 j0Var = this.C;
        Object[] objArr = j0Var.f14865b;
        long[] jArr = j0Var.f14864a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            this.B.e(objArr[(i10 << 3) + i12]);
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return this.A.b();
    }

    @Override
    public final Object c(String str) {
        return this.A.c(str);
    }

    @Override
    public final y1.e d(String str, u00.a aVar) {
        return this.A.d(str, aVar);
    }

    @Override
    public final void e(Object obj) {
        this.B.e(obj);
    }

    @Override
    public final void f(Object obj, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-858296452);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(this) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            this.B.f(obj, cVar, g0Var, i11 & 126);
            boolean zI = g0Var.i(this) | g0Var.i(obj);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new h1.v0(this, obj, 18);
                g0Var.n0(objN);
            }
            l1.q.e(obj, (u00.k) objN, g0Var);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(i10, 12, this, obj, cVar);
        }
    }
}
