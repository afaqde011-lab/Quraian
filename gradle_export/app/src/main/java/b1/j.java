package b1;

import a1.w2;
import com.google.android.gms.internal.measurement.y3;
import kotlin.KotlinNothingValueException;
import l1.i1;
import m3.n0;
import m3.q0;

public final class j implements u00.a {
    public final int A;
    public final e0 B;

    public j(e0 e0Var, int i10) {
        this.A = i10;
        this.B = e0Var;
    }

    public final Object invoke() throws KotlinNothingValueException {
        z2.a0 a0VarQ;
        h2.c cVar;
        switch (this.A) {
            case 0:
                return (h2.c) this.B.f1962y.getValue();
            case 1:
                e0 e0Var = this.B;
                i1 i1Var = e0Var.f1957t;
                w2 w2Var = e0Var.f1940a;
                boolean zD = q0.d(w2Var.d().D);
                if (((zD && ((k0) i1Var.getValue()) == k0.B) || (!zD && ((k0) i1Var.getValue()) == k0.C)) && e0Var.l() == null && ((Boolean) e0Var.l.getValue()).booleanValue() && (a0VarQ = e0Var.q()) != null) {
                    h2.c cVarY = y3.Y(a0VarQ);
                    h2.c cVarG = bi.b.g(a0VarQ.d0(cVarY.e()), cVarY.d());
                    z2.a0 a0VarQ2 = e0Var.q();
                    if (a0VarQ2 == null) {
                        g0.a.d("textLayoutCoordinates should not be null.");
                        throw new KotlinNothingValueException();
                    }
                    long j9 = w2Var.d().D;
                    if (q0.d(j9)) {
                        h2.c cVarK = e0Var.k();
                        cVar = bi.b.g(a0VarQ2.d0(cVarK.e()), cVarK.d());
                    } else {
                        long jD0 = a0VarQ2.d0(e0Var.o(true));
                        long jD1 = a0VarQ2.d0(e0Var.o(false));
                        n0 n0VarC = e0Var.f1941b.c();
                        if (n0VarC == null) {
                            cVar = h2.c.f6545e;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (a0VarQ2.d0((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n0VarC.c((int) (j9 >> 32)).f6547b)) & 4294967295L)) & 4294967295L));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (a0VarQ2.d0((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n0VarC.c((int) (j9 & 4294967295L)).f6547b)) & 4294967295L)) & 4294967295L));
                            int i10 = (int) (jD0 >> 32);
                            int i11 = (int) (jD1 >> 32);
                            cVar = new h2.c(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat((int) (jD0 & 4294967295L)), Float.intBitsToFloat((int) (jD1 & 4294967295L))));
                        }
                    }
                    if (cVar.h(cVarG)) {
                        return cVar.f(cVarG);
                    }
                }
                return null;
            case 2:
                return this.B.f1940a.d();
            case 3:
                this.B.d();
                return g00.b0.a;
            case 4:
                return Boolean.valueOf(!((Boolean) this.B.f1958u.getValue()).booleanValue());
            case 5:
                w2 w2Var2 = this.B.f1940a;
                z0.g gVar = w2Var2.f135a;
                h1.l lVar = w2Var2.f136b;
                c1.c cVar2 = c1.c.A;
                gVar.f16994b.a().w();
                z0.a aVar = gVar.f16994b;
                z0.h.i(aVar, 0, aVar.B.length());
                z0.g.a(gVar, lVar, true, cVar2);
                gVar.f(true);
                return g00.b0.a;
            case 6:
                u00.a aVar2 = this.B.m;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return g00.b0.a;
            case 7:
                return this.B.p(true, false);
            case 8:
                return this.B.p(false, false);
            default:
                return Boolean.valueOf(this.B.j(false).f1934a);
        }
    }
}
