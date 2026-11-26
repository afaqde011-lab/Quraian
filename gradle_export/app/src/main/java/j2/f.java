package j2;

import i2.b0;

public final class f extends g {

    public final r f7886e;

    public final r f7887f;

    public final float[] f7888g;

    public f(r rVar, r rVar2) {
        float[] fArrG;
        super(rVar2, rVar, rVar2, null);
        this.f7886e = rVar;
        this.f7887f = rVar2;
        float[] fArr = a.f7853b.f7854a;
        t tVar = rVar.f7905d;
        float[] fArr2 = rVar.f7910i;
        t tVar2 = rVar2.f7905d;
        float[] fArr3 = rVar2.f7911j;
        if (j.d(tVar, tVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = tVar.a();
            float[] fArrA2 = tVar2.a();
            t tVar3 = j.f7895b;
            fArrG = j.g(j.d(tVar2, tVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), rVar2.f7910i)), j.d(tVar, tVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f7888g = fArrG;
    }

    @Override
    public final long a(long j9) {
        float fH = i2.t.h(j9);
        float fG = i2.t.g(j9);
        float fE = i2.t.e(j9);
        float fD = i2.t.d(j9);
        m mVar = this.f7886e.f7915p;
        float fB = (float) mVar.b(fH);
        float fB2 = (float) mVar.b(fG);
        float fB3 = (float) mVar.b(fE);
        float[] fArr = this.f7888g;
        float f3 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f10 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f11 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        r rVar = this.f7887f;
        float fB4 = (float) rVar.m.b(f3);
        m mVar2 = rVar.m;
        return b0.b(fB4, (float) mVar2.b(f10), (float) mVar2.b(f11), fD, rVar);
    }
}
