package sm;

import android.graphics.RuntimeShader;
import b3.o0;
import com.google.android.gms.internal.measurement.b5;

public final class p implements u00.k {
    public final int A;
    public final tm.i B;

    public p(tm.i iVar, int i) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                i2.c0 drawBackdrop = (i2.c0) obj;
                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBackdrop.b() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBackdrop.b() & 4294967295L));
                tm.i iVar = this.B;
                float fA = b5.A(1.0f, ((drawBackdrop.c() * 4.0f) / Float.intBitsToFloat((int) (drawBackdrop.b() & 4294967295L))) + 1.0f, ((Number) iVar.e.d()).floatValue());
                float fD = h2.e.d(drawBackdrop.b());
                long jE = h2.b.e(((h2.b) iVar.f.d()).a, iVar.g);
                int i = (int) (jE >> 32);
                drawBackdrop.T0(((float) Math.tanh((Float.intBitsToFloat(i) * 0.05f) / fD)) * fD);
                int i2 = (int) (jE & 4294967295L);
                drawBackdrop.w(fD * ((float) Math.tanh((Float.intBitsToFloat(i2) * 0.05f) / fD)));
                float fC = (drawBackdrop.c() * 4.0f) / Float.intBitsToFloat((int) (4294967295L & drawBackdrop.b()));
                double dAtan2 = (float) Math.atan2(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
                float fAbs = Math.abs((Float.intBitsToFloat(i) * ((float) Math.cos(dAtan2))) / h2.e.c(drawBackdrop.b())) * fC;
                float f = fIntBitsToFloat / fIntBitsToFloat2;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                drawBackdrop.I0((fAbs * f) + fA);
                float f2 = fIntBitsToFloat2 / fIntBitsToFloat;
                drawBackdrop.N((Math.abs((Float.intBitsToFloat(i2) * ((float) Math.sin(dAtan2))) / h2.e.c(drawBackdrop.b())) * fC * (f2 <= 1.0f ? f2 : 1.0f)) + fA);
                break;
            case 1:
                i2.c0 drawBackdrop2 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBackdrop2.b() >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawBackdrop2.b() & 4294967295L));
                tm.i iVar2 = this.B;
                float fA2 = b5.A(1.0f, ((drawBackdrop2.c() * 4.0f) / Float.intBitsToFloat((int) (drawBackdrop2.b() & 4294967295L))) + 1.0f, ((Number) iVar2.e.d()).floatValue());
                float fD2 = h2.e.d(drawBackdrop2.b());
                long jE2 = h2.b.e(((h2.b) iVar2.f.d()).a, iVar2.g);
                int i3 = (int) (jE2 >> 32);
                drawBackdrop2.T0(((float) Math.tanh((Float.intBitsToFloat(i3) * 0.05f) / fD2)) * fD2);
                int i4 = (int) (jE2 & 4294967295L);
                drawBackdrop2.w(fD2 * ((float) Math.tanh((Float.intBitsToFloat(i4) * 0.05f) / fD2)));
                float fC2 = (drawBackdrop2.c() * 4.0f) / Float.intBitsToFloat((int) (4294967295L & drawBackdrop2.b()));
                double dAtan3 = (float) Math.atan2(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3));
                float fAbs2 = Math.abs((Float.intBitsToFloat(i3) * ((float) Math.cos(dAtan3))) / h2.e.c(drawBackdrop2.b())) * fC2;
                float f3 = fIntBitsToFloat3 / fIntBitsToFloat4;
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                drawBackdrop2.I0((fAbs2 * f3) + fA2);
                float f4 = fIntBitsToFloat4 / fIntBitsToFloat3;
                drawBackdrop2.N((Math.abs((Float.intBitsToFloat(i4) * ((float) Math.sin(dAtan3))) / h2.e.c(drawBackdrop2.b())) * fC2 * (f4 <= 1.0f ? f4 : 1.0f)) + fA2);
                break;
            case 2:
                o0 drawWithContent = (o0) obj;
                kotlin.jvm.internal.m.e(drawWithContent, "$this$drawWithContent");
                tm.i iVar3 = this.B;
                x.b bVar = iVar3.e;
                RuntimeShader runtimeShader = iVar3.h;
                float fFloatValue = ((Number) bVar.d()).floatValue();
                if (fFloatValue > 0.0f) {
                    if (runtimeShader != null) {
                        long j = i2.t.c;
                        k2.d.R(drawWithContent, i2.t.b(0.08f * fFloatValue, j), 0L, 0L, 0.0f, (k2.h) null, 12, 62);
                        u00.n nVar = iVar3.b;
                        k2.b bVar2 = drawWithContent.A;
                        long j2 = ((h2.b) nVar.invoke(new h2.e(bVar2.b()), iVar3.f.d())).a;
                        runtimeShader.setFloatUniform("size", Float.intBitsToFloat((int) (bVar2.b() >> 32)), Float.intBitsToFloat((int) (bVar2.b() & 4294967295L)));
                        runtimeShader.setColorUniform("color", i2.b0.C(i2.t.b(fFloatValue * 0.15f, j)));
                        runtimeShader.setFloatUniform("radius", h2.e.d(bVar2.b()) * 1.5f);
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j2 >> 32));
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (bVar2.b() >> 32));
                        if (fIntBitsToFloat5 < 0.0f) {
                            fIntBitsToFloat5 = 0.0f;
                        }
                        if (fIntBitsToFloat5 <= fIntBitsToFloat6) {
                            fIntBitsToFloat6 = fIntBitsToFloat5;
                        }
                        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (bVar2.b() & 4294967295L));
                        float f5 = fIntBitsToFloat7 < 0.0f ? 0.0f : fIntBitsToFloat7;
                        if (f5 <= fIntBitsToFloat8) {
                            fIntBitsToFloat8 = f5;
                        }
                        runtimeShader.setFloatUniform("position", fIntBitsToFloat6, fIntBitsToFloat8);
                        k2.d.m0(drawWithContent, new i2.r(runtimeShader), 0L, 0L, 0.0f, (k2.e) null, 12, 62);
                    } else {
                        k2.d.R(drawWithContent, i2.t.b(fFloatValue * 0.25f, i2.t.c), 0L, 0L, 0.0f, (k2.h) null, 12, 62);
                    }
                }
                drawWithContent.a();
                break;
            case 3:
                v2.s down = (v2.s) obj;
                kotlin.jvm.internal.m.e(down, "down");
                long j3 = down.c;
                tm.i iVar4 = this.B;
                iVar4.g = j3;
                ta.c0.M(iVar4.a, (k00.i) null, (u00.n) null, (u00.k) null, new tm.h(iVar4, null, 0), 31);
                break;
            default:
                v2.s it = (v2.s) obj;
                kotlin.jvm.internal.m.e(it, "it");
                tm.i iVar5 = this.B;
                ta.c0.M(iVar5.a, (k00.i) null, (u00.n) null, (u00.k) null, new tm.h(iVar5, null, 1), 31);
                break;
        }
        return g00.b0.a;
    }
}
