package jk;

import g00.b0;
import i2.c0;
import i2.s;
import kh.n;
import kotlin.jvm.internal.m;
import z2.a0;

public final class e implements u00.k {
    public final int A;
    public final g B;

    public e(g gVar, int i10) {
        this.A = i10;
        this.B = gVar;
    }

    public final Object invoke(Object obj) {
        long j9;
        switch (this.A) {
            case 0:
                c0 c0Var = (c0) obj;
                m.e(c0Var, "<this>");
                c0Var.L0(true);
                c0Var.z0((k) this.B.P.f8325g);
                c0Var.Q(1);
                break;
            case 1:
                k2.d dVar = (k2.d) obj;
                m.e(dVar, "<this>");
                s sVarN = dVar.G0().n();
                g gVar = this.B;
                float fH = gVar.Y.h();
                if (fH != 0.0f) {
                    sVarN.p(fH, fH);
                }
                gVar.S.invoke(dVar, new e(gVar, 3));
                if (fH != 0.0f) {
                    float f3 = -fH;
                    sVarN.p(f3, f3);
                }
                return b0.a;
            case 2:
                k2.d dVar2 = (k2.d) obj;
                m.e(dVar2, "<this>");
                g gVar2 = this.B;
                l2.b bVar = gVar2.V;
                if (bVar != null) {
                    float fH2 = gVar2.Y.h();
                    int i10 = (int) fH2;
                    int i11 = i10 * 2;
                    d.d(gVar2, dVar2, bVar, (((long) (((int) Float.intBitsToFloat((int) (dVar2.b() >> 32))) + i11)) << 32) | (((long) (((int) Float.intBitsToFloat((int) (dVar2.b() & 4294967295L))) + i11)) & 4294967295L), gVar2.Z);
                    if (fH2 == 0.0f) {
                        j9 = 0;
                    } else {
                        long j10 = -i10;
                        j9 = (j10 & 4294967295L) | (j10 << 32);
                    }
                    if (!y3.j.b(bVar.f9990t, j9)) {
                        bVar.f9990t = j9;
                        long j11 = bVar.f9991u;
                        l2.c cVar = bVar.f9973a;
                        int i12 = (int) (j9 >> 32);
                        int i13 = (int) (j9 & 4294967295L);
                        cVar.f9997c.setPosition(i12, i13, ((int) (j11 >> 32)) + i12, ((int) (j11 & 4294967295L)) + i13);
                        cVar.f9998d = n.m0(j11);
                    }
                    rd.a.x(dVar2, bVar);
                }
                return b0.a;
            default:
                k2.d dVar3 = (k2.d) obj;
                m.e(dVar3, "$this$onDrawBackdrop");
                g gVar3 = this.B;
                gVar3.O.b(dVar3, gVar3.U, (a0) gVar3.X.getValue(), gVar3.R);
                break;
        }
        return b0.a;
    }
}
