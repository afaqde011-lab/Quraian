package y1;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.x5;
import g00.b0;
import java.util.Map;
import l1.g0;
import l1.q;
import l1.q1;
import l1.q2;
import l1.r1;
import q0.t1;
import s10.w0;
import u.i0;
import u.q0;

public final class d implements c {
    public static final w0 E = new w0(new wy.k(22), new xn.a(16), 15);
    public final Map A;
    public final i0 B;
    public f C;
    public final q0.a D;

    public d(Map map) {
        this.A = map;
        long[] jArr = q0.f14885a;
        this.B = new i0();
        this.D = new q0.a(this, 24);
    }

    @Override
    public final void e(Object obj) {
        if (this.B.k(obj) == null) {
            this.A.remove(obj);
        }
    }

    @Override
    public final void f(Object obj, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(533563200);
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
            g0Var.f0(obj);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.f9868a;
            if (objN == cVar2) {
                q0.a aVar = this.D;
                if (!((Boolean) aVar.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(x5.l(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.A.get(obj);
                q2 q2Var = h.f16584a;
                i iVar = new i(new g(map, aVar));
                g0Var.n0(iVar);
                objN = iVar;
            }
            i iVar2 = (i) objN;
            q.b(new q1[]{h.f16584a.a(iVar2), ja.a.f8257a.a(iVar2)}, cVar, g0Var, (i11 & 112) | 8);
            boolean zI = g0Var.i(this) | g0Var.i(obj) | g0Var.i(iVar2);
            Object objN2 = g0Var.N();
            if (zI || objN2 == cVar2) {
                objN2 = new t1(this, obj, iVar2, 7);
                g0Var.n0(objN2);
            }
            q.e(b0.a, (u00.k) objN2, g0Var);
            if (g0Var.f9864y && g0Var.G.f11486i == g0Var.f9865z) {
                g0Var.f9865z = -1;
                g0Var.f9864y = false;
            }
            g0Var.r(false);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(i10, 28, this, obj, cVar);
        }
    }
}
