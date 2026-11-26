package d0;

import android.graphics.Path;

public final class l3 implements u00.k {
    public final int A;
    public final float B;
    public final Object C;
    public final Object D;

    public l3(float f3, Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = f3;
        this.C = obj;
        this.D = obj2;
    }

    public l3(y1 y1Var, kotlin.jvm.internal.y yVar, float f3) {
        this.A = 5;
        this.C = y1Var;
        this.D = yVar;
        this.B = f3;
    }

    public l3(Object obj, float f3, Object obj2, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = f3;
        this.D = obj2;
    }

    public final Object invoke(Object obj) {
        float fFloatValue;
        switch (this.A) {
            case 0:
                n3 n3Var = (n3) this.C;
                u00.k kVar = (u00.k) this.D;
                long jLongValue = ((Long) obj).longValue();
                if (n3Var.f4472b == Long.MIN_VALUE) {
                    n3Var.f4472b = jLongValue;
                }
                float f3 = n3Var.f4475e;
                x.k kVar2 = new x.k(f3);
                float f10 = this.B;
                x.k kVar3 = n3.f4470f;
                long jB = f10 == 0.0f ? n3Var.f4471a.b(new x.k(f3), kVar3, n3Var.f4473c) : w00.a.G((jLongValue - n3Var.f4472b) / f10);
                float f11 = ((x.k) n3Var.f4471a.r(jB, kVar2, kVar3, n3Var.f4473c)).f16308a;
                n3Var.f4473c = (x.k) n3Var.f4471a.c(jB, kVar2, kVar3, n3Var.f4473c);
                n3Var.f4472b = jLongValue;
                float f12 = n3Var.f4475e - f11;
                n3Var.f4475e = f11;
                kVar.invoke(Float.valueOf(f12));
                break;
            case 1:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.C;
                j0.r rVar = (j0.r) this.D;
                x.h hVar = (x.h) obj;
                float f13 = this.B;
                float f14 = 0.0f;
                if (f13 > 0.0f) {
                    fFloatValue = ((Number) hVar.f16286e.getValue()).floatValue();
                    if (fFloatValue <= f13) {
                        f13 = fFloatValue;
                    }
                    f14 = f13;
                } else if (f13 < 0.0f) {
                    fFloatValue = ((Number) hVar.f16286e.getValue()).floatValue();
                    if (fFloatValue >= f13) {
                        f13 = fFloatValue;
                    }
                    f14 = f13;
                }
                float f15 = f14 - wVar.A;
                if (f15 != rVar.a(f15) || f14 != ((Number) hVar.f16286e.getValue()).floatValue()) {
                    hVar.a();
                }
                wVar.A += f15;
                break;
            case 2:
                ((l1.z0) this.D).setValue(new y3.f((this.B * 2) + ((y3.c) this.C).h0((int) (((y3.l) obj).f16596a & 4294967295L))));
                break;
            case 3:
                float f16 = this.B;
                i2.d dVar = (i2.d) this.C;
                i2.m mVar = (i2.m) this.D;
                b3.o0 o0Var = (b3.o0) obj;
                o0Var.a();
                a1.i iVar = o0Var.A.B;
                long jQ = iVar.q();
                iVar.n().i();
                try {
                    hf.c cVar = (hf.c) iVar.B;
                    cVar.I(f16, 0.0f);
                    cVar.F(45.0f, 0L);
                    k2.d.m(o0Var, dVar, 0L, 0.0f, mVar, 46);
                } finally {
                    w.c.t(iVar, jQ);
                }
                break;
            case 4:
                l1.z0 z0Var = (l1.z0) this.C;
                l1.z0 z0Var2 = (l1.z0) this.D;
                k2.d dVar2 = (k2.d) obj;
                kotlin.jvm.internal.m.e(dVar2, "$this$drawBehind");
                float fC = rl.d.c(this.B, z0Var, z0Var2);
                boolean zD = rl.d.d(z0Var, z0Var2);
                float fA0 = dVar2.A0(rl.d.l);
                float fA1 = dVar2.A0(rl.d.k) / 2;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.b() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.b() & 4294967295L)) - fA0;
                float f17 = zD ? fIntBitsToFloat2 : fA0;
                float fIntBitsToFloat3 = zD ? Float.intBitsToFloat((int) (dVar2.b() & 4294967295L)) : 0.0f;
                float f18 = fA1 * 0.25f;
                float fB = w.c.b(f17, fIntBitsToFloat3, 0.25f, fIntBitsToFloat3);
                i2.g gVarA = i2.j.a();
                Path path = gVarA.f7128a;
                gVarA.f(fC - fA1, f17);
                gVarA.e(fC - f18, fB);
                path.quadTo(fC, fIntBitsToFloat3, f18 + fC, fB);
                gVarA.e(fC + fA1, f17);
                path.close();
                i2.g gVarA2 = i2.j.a();
                float fA2 = dVar2.A0(rl.d.b);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fA2)) << 32);
                i2.g.c(gVarA2, c7.i.c(0.0f, fA0, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
                i2.g gVarA3 = i2.j.a();
                if (!gVarA3.g(gVarA2, gVarA, 2)) {
                    throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
                }
                k2.d.X0(dVar2, gVarA3, dl.a.K, 0.0f, null, 60);
                k2.d.X0(dVar2, gVarA3, i2.t.b(0.08f, dl.a.i), 0.0f, new k2.h(dVar2.A0(rl.d.m), 0.0f, 0, 0, null, 30), 52);
                break;
                break;
            default:
                y1 y1Var = (y1) this.C;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.D;
                long jLongValue2 = ((Long) obj).longValue();
                y1Var.a(((jLongValue2 - yVar.A) / 1.0E9f) * this.B);
                yVar.A = jLongValue2;
                break;
        }
        return g00.b0.a;
    }
}
