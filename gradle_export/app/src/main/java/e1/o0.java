package e1;

import c3.k1;
import q0.e2;
import q0.j1;

public final class o0 implements u00.k {
    public final int A;
    public final v0 B;

    public o0(v0 v0Var, int i10) {
        this.A = i10;
        this.B = v0Var;
    }

    public final Object invoke(Object obj) {
        h2.c cVar;
        z2.a0 a0VarC;
        char c10;
        float fIntBitsToFloat;
        z2.a0 a0VarC2;
        z2.a0 a0VarC3;
        z2.a0 a0VarC4;
        z2.a0 a0VarC5;
        int i10 = this.A;
        v0 v0Var = this.B;
        switch (i10) {
            case 0:
                z2.a0 a0Var = (z2.a0) obj;
                j1 j1Var = v0Var.f5018d;
                if (j1Var == null) {
                    cVar = h2.c.f6545e;
                } else {
                    if (j1Var.f12651p) {
                        j1Var = null;
                    }
                    if (j1Var != null) {
                        r3.p pVar = v0Var.f5016b;
                        long j9 = v0Var.n().f13100b;
                        int i11 = m3.q0.f10519c;
                        int iZ = pVar.z((int) (j9 >> 32));
                        int iZ2 = v0Var.f5016b.z((int) (v0Var.n().f13100b & 4294967295L));
                        j1 j1Var2 = v0Var.f5018d;
                        long jD0 = 0;
                        long jD1 = (j1Var2 == null || (a0VarC5 = j1Var2.c()) == null) ? 0L : a0VarC5.d0(v0Var.l(true));
                        j1 j1Var3 = v0Var.f5018d;
                        if (j1Var3 != null && (a0VarC4 = j1Var3.c()) != null) {
                            jD0 = a0VarC4.d0(v0Var.l(false));
                        }
                        j1 j1Var4 = v0Var.f5018d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (j1Var4 == null || (a0VarC3 = j1Var4.c()) == null) {
                            c10 = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            e2 e2VarD = j1Var.d();
                            c10 = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (a0VarC3.d0((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(e2VarD != null ? e2VarD.f12608a.c(iZ).f6547b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        j1 j1Var5 = v0Var.f5018d;
                        if (j1Var5 != null && (a0VarC2 = j1Var5.c()) != null) {
                            e2 e2VarD2 = j1Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (a0VarC2.d0((((long) Float.floatToRawIntBits(0.0f)) << c10) | (((long) Float.floatToRawIntBits(e2VarD2 != null ? e2VarD2.f12608a.c(iZ2).f6547b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i12 = (int) (jD1 >> c10);
                        int i13 = (int) (jD0 >> c10);
                        cVar = new h2.c(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), (j1Var.f12638a.f12689g.c() * 25) + Math.max(Float.intBitsToFloat((int) (jD1 & 4294967295L)), Float.intBitsToFloat((int) (jD0 & 4294967295L))));
                    } else {
                        cVar = h2.c.f6545e;
                    }
                }
                j1 j1Var6 = v0Var.f5018d;
                if (j1Var6 == null || (a0VarC = j1Var6.c()) == null) {
                    return null;
                }
                return w0.h.e(cVar, a0VarC, a0Var);
            case 1:
                return new k1(v0Var, 17);
            default:
                v0Var.r();
                return g00.b0.a;
        }
    }
}
