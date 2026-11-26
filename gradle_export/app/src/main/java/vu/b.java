package vu;

import b3.o0;
import f2.d;
import g00.b0;
import i2.g0;
import i2.t;
import java.util.List;
import k2.e;
import kotlin.jvm.internal.m;
import sg.f;
import u00.k;

public final class b implements k {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final boolean E;
    public final boolean F;

    public b(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        this.A = f;
        this.B = f2;
        this.C = f3;
        this.D = f4;
        this.E = z;
        this.F = z2;
    }

    @Override
    public final Object invoke(Object obj) {
        d drawWithCache = (d) obj;
        m.e(drawWithCache, "$this$drawWithCache");
        float f = this.A;
        float f2 = this.B;
        if (f < f2) {
            f = f2;
        }
        long j = t.f;
        t tVar = new t(j);
        long j2 = t.b;
        List listS = va.a.S(new t[]{tVar, new t(j2)});
        float f3 = f - f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        final g0 g0VarP = f.P(listS, f3, f, 8);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.A.b() & 4294967295L)) - this.C;
        List listS2 = va.a.S(new t[]{new t(j2), new t(j)});
        float f4 = fIntBitsToFloat - this.D;
        final g0 g0VarP2 = f.P(listS2, f4 >= 0.0f ? f4 : 0.0f, fIntBitsToFloat, 8);
        final boolean z = this.E;
        final boolean z2 = this.F;
        return drawWithCache.a(new k() {
            @Override
            public final Object invoke(Object obj2) {
                o0 onDrawWithContent = (o0) obj2;
                m.e(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.a();
                if (z) {
                    k2.d.m0(onDrawWithContent, g0VarP, 0L, 0L, 0.0f, (e) null, 6, 62);
                }
                if (z2) {
                    k2.d.m0(onDrawWithContent, g0VarP2, 0L, 0L, 0.0f, (e) null, 6, 62);
                }
                return b0.a;
            }
        });
    }
}
