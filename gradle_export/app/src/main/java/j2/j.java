package j2;

public abstract class j {

    public static final t f7894a = new t(0.31006f, 0.31616f);

    public static final t f7895b = new t(0.34567f, 0.3585f);

    public static final t f7896c = new t(0.32168f, 0.33767f);

    public static final t f7897d = new t(0.31271f, 0.32902f);

    public static final float[] f7898e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        if (b.a(cVar.f7861b, b.f7855a)) {
            r rVar = (r) cVar;
            t tVar = rVar.f7905d;
            t tVar2 = f7895b;
            if (!d(tVar, tVar2)) {
                return new r(rVar.f7860a, rVar.f7909h, tVar2, g(c(a.f7853b.f7854a, tVar.a(), tVar2.a()), rVar.f7910i), rVar.f7912k, rVar.f7913n, rVar.f7906e, rVar.f7907f, rVar.f7908g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = (((((f11 * f14) + ((f10 * f13) + (f3 * f12))) - (f12 * f13)) - (f10 * f11)) - (f3 * f14)) * 0.5f;
        return f15 < 0.0f ? -f15 : f15;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrF = f(fArr);
        float f3 = fArr4[0];
        float f10 = fArr[0] * f3;
        float f11 = fArr4[1];
        float f12 = fArr[1] * f11;
        float f13 = fArr4[2];
        return g(fArrF, new float[]{f10, f12, fArr[2] * f13, fArr[3] * f3, fArr[4] * f11, fArr[5] * f13, f3 * fArr[6], f11 * fArr[7], f13 * fArr[8]});
    }

    public static final boolean d(t tVar, t tVar2) {
        if (tVar == tVar2) {
            return true;
        }
        return Math.abs(tVar.f7924a - tVar2.f7924a) < 0.001f && Math.abs(tVar.f7925b - tVar2.f7925b) < 0.001f;
    }

    public static final g e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new e(cVar, cVar, 1);
        }
        long j9 = cVar.f7861b;
        long j10 = b.f7855a;
        return (b.a(j9, j10) && b.a(cVar2.f7861b, j10)) ? new f((r) cVar, (r) cVar2) : new g(cVar, cVar2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f3 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f3 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f3) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f3)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f3)) / f21;
        fArr2[8] = ((f3 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f3 = fArr[0] * fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        fArr3[0] = (f12 * f13) + (f10 * f11) + f3;
        float f14 = fArr[1];
        float f15 = fArr2[0];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = f17 * f13;
        fArr3[1] = f18 + (f11 * f16) + (f14 * f15);
        float f19 = fArr[2] * f15;
        float f20 = fArr[5];
        float f21 = (fArr2[1] * f20) + f19;
        float f22 = fArr[8];
        fArr3[2] = (f13 * f22) + f21;
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = (f10 * f25) + f24;
        float f27 = fArr2[5];
        fArr3[3] = (f12 * f27) + f26;
        float f28 = fArr[1];
        float f29 = fArr2[3];
        float f30 = f16 * f25;
        fArr3[4] = (f17 * f27) + f30 + (f28 * f29);
        float f31 = fArr[2];
        float f32 = f27 * f22;
        fArr3[5] = f32 + (f20 * fArr2[4]) + (f29 * f31);
        float f33 = f23 * fArr2[6];
        float f34 = fArr[3];
        float f35 = fArr2[7];
        float f36 = (f34 * f35) + f33;
        float f37 = fArr2[8];
        fArr3[6] = (f12 * f37) + f36;
        float f38 = fArr2[6];
        float f39 = f17 * f37;
        fArr3[7] = f39 + (fArr[4] * f35) + (f28 * f38);
        float f40 = f22 * f37;
        fArr3[8] = f40 + (fArr[5] * fArr2[7]) + (f31 * f38);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f3 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        fArr2[2] = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
        return fArr2;
    }
}
