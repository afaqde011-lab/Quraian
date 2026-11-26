package z3;

import u.t0;
import y3.i;

public abstract class b {

    public static final float[] f17169a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    public static volatile t0 f17170b = new t0(0);

    public static final Object[] f17171c;

    static {
        Object[] objArr = new Object[0];
        f17171c = objArr;
        synchronized (objArr) {
            f17170b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f17170b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f17170b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f17170b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f17170b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f17170b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f3) {
        float fD;
        a cVar;
        float[] fArr = f17169a;
        if (f3 < 1.03f) {
            return null;
        }
        int i10 = (int) (f3 * 100.0f);
        a aVar = (a) f17170b.c(i10);
        if (aVar != null) {
            return aVar;
        }
        t0 t0Var = f17170b;
        int iA = v.a.a(t0Var.A, t0Var.C, i10);
        if (iA >= 0) {
            return (a) f17170b.f(iA);
        }
        int i11 = -(iA + 1);
        int i12 = i11 - 1;
        if (i11 >= f17170b.C) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f3});
            b(f3, cVar2);
            return cVar2;
        }
        if (i12 < 0) {
            cVar = new c(fArr, fArr);
            fD = 1.0f;
        } else {
            fD = f17170b.d(i12) / 100.0f;
            cVar = (a) f17170b.f(i12);
        }
        float fD2 = f17170b.d(i11) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fD == fD2 ? 0.0f : (f3 - fD) / (fD2 - fD))) * 1.0f) + 0.0f;
        a aVar2 = (a) f17170b.f(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f10 = fArr[i13];
            float fB = cVar.b(f10);
            fArr2[i13] = ((aVar2.b(f10) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f3, cVar3);
        return cVar3;
    }

    public static void b(float f3, c cVar) {
        synchronized (f17171c) {
            t0 t0VarClone = f17170b.clone();
            t0VarClone.e((int) (f3 * 100.0f), cVar);
            f17170b = t0VarClone;
        }
    }
}
