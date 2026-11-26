package m3;

import com.google.android.gms.internal.measurement.g4;
import java.util.List;
import k9.x0;

public final class p0 {

    public final q3.h f10506a;

    public final y3.c f10507b;

    public final y3.m f10508c;

    public final x0 f10509d;

    public p0(q3.h hVar, y3.c cVar, y3.m mVar, int i10) {
        this.f10506a = hVar;
        this.f10507b = cVar;
        this.f10508c = mVar;
        this.f10509d = i10 > 0 ? new x0(i10) : null;
    }

    public static n0 a(p0 p0Var, String str, r0 r0Var, int i10, long j9, int i11) {
        if ((i11 & 16) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        int i12 = i10;
        long jB = (i11 & 32) != 0 ? y3.b.b(0, 0, 0, 0, 15) : j9;
        y3.m mVar = p0Var.f10508c;
        y3.c cVar = p0Var.f10507b;
        q3.h hVar = p0Var.f10506a;
        p0Var.getClass();
        return b(p0Var, new h(str), r0Var, true, i12, jB, mVar, cVar, hVar, 32);
    }

    public static n0 b(p0 p0Var, h hVar, r0 r0Var, boolean z10, int i10, long j9, y3.m mVar, y3.c cVar, q3.h hVar2, int i11) {
        n0 n0Var;
        x0 x0Var = p0Var.f10509d;
        h00.x xVar = h00.x.A;
        m0 m0Var = new m0(hVar, r0Var, xVar, i10, z10, 1, cVar, mVar, hVar2, j9);
        n0 n0Var2 = null;
        if (x0Var != null) {
            k kVar = new k(m0Var);
            u.s sVar = (u.s) x0Var.B;
            if (sVar != null) {
                n0Var = (n0) sVar.c(kVar);
            } else if (kotlin.jvm.internal.m.a((k) x0Var.C, kVar)) {
                n0Var = (n0) x0Var.D;
            }
            if (n0Var != null && !n0Var.f10497b.f10510a.b()) {
                n0Var2 = n0Var;
            }
        }
        if (n0Var2 != null) {
            q qVar = n0Var2.f10497b;
            return new n0(m0Var, qVar, y3.b.d(j9, (((long) ((int) Math.ceil(qVar.f10514e))) & 4294967295L) | (((long) ((int) Math.ceil(qVar.f10513d))) << 32)));
        }
        ce.c cVar2 = new ce.c(hVar, h0.j(r0Var, mVar), (List) xVar, cVar, hVar2);
        int iJ = y3.a.j(j9);
        int iH = (z10 && y3.a.d(j9)) ? y3.a.h(j9) : Integer.MAX_VALUE;
        if (iJ != iH) {
            iH = ab.a0.y((int) Math.ceil(cVar2.l()), iJ, iH);
        }
        q qVar2 = new q(cVar2, g4.G(0, iH, 0, y3.a.g(j9)), i10, 1);
        n0 n0Var3 = new n0(m0Var, qVar2, y3.b.d(j9, (((long) ((int) Math.ceil(qVar2.f10514e))) & 4294967295L) | (((long) ((int) Math.ceil(qVar2.f10513d))) << 32)));
        if (x0Var != null) {
            u.s sVar2 = (u.s) x0Var.B;
            if (sVar2 != null) {
                sVar2.d(new k(m0Var), n0Var3);
                return n0Var3;
            }
            x0Var.C = new k(m0Var);
            x0Var.D = n0Var3;
        }
        return n0Var3;
    }
}
