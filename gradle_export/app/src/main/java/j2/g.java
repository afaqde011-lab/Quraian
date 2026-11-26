package j2;

public class g {

    public final c f7889a;

    public final c f7890b;

    public final c f7891c;

    public final float[] f7892d;

    public g(c cVar, c cVar2, int i10) {
        float[] fArr;
        long j9 = cVar.f7861b;
        long j10 = b.f7855a;
        c cVarA = b.a(j9, j10) ? j.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f7861b, j10) ? j.a(cVar2) : cVar2;
        if (i10 == 3) {
            boolean zA = b.a(cVar.f7861b, j10);
            boolean zA2 = b.a(cVar2.f7861b, j10);
            if (!(zA && zA2) && (zA || zA2)) {
                t tVar = ((r) (zA ? cVar : cVar2)).f7905d;
                float[] fArrA = j.f7898e;
                float[] fArrA2 = zA ? tVar.a() : fArrA;
                fArrA = zA2 ? tVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f7889a = cVar;
        this.f7890b = cVar2;
        this.f7891c = cVar3;
        this.f7892d = fArr;
    }

    public long a(long j9) {
        float fH = i2.t.h(j9);
        float fG = i2.t.g(j9);
        float fE = i2.t.e(j9);
        float fD = i2.t.d(j9);
        c cVar = this.f7890b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.f7892d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f3 = fIntBitsToFloat;
        float f10 = fIntBitsToFloat2;
        return this.f7891c.f(f3, f10, fE2, fD, this.f7889a);
    }
}
