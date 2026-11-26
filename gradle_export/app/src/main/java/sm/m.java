package sm;

import com.google.android.gms.internal.measurement.y3;

public final class m implements u00.k {
    public final int A;
    public final float B;
    public final float C;
    public final float D;

    public m(float f3, float f11, float f12, int i11) {
        this.A = i11;
        this.B = f3;
        this.C = f11;
        this.D = f12;
    }

    @Override
    public final Object invoke(Object obj) {
        jk.f drawBackdrop = (jk.f) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                float fD = h2.e.d(drawBackdrop.C);
                lk.a.a(drawBackdrop);
                ca.v.p(drawBackdrop, drawBackdrop.A * this.B);
                y3.N(drawBackdrop, this.C * fD * 0.5f, this.D * fD, true, true);
                break;
            default:
                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                lk.a.a(drawBackdrop);
                ca.v.p(drawBackdrop, drawBackdrop.A * this.B);
                float f3 = drawBackdrop.A;
                y3.N(drawBackdrop, this.C * f3, f3 * this.D, (12 & 4) == 0, (12 & 8) == 0);
                break;
        }
        return g00.b0.f7770a;
    }
}
