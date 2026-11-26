package sm;

import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.y3;

public final class e implements u00.k {
    public final int A;
    public final tm.e B;

    public e(tm.e eVar, int i) {
        this.A = i;
        this.B = eVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                jk.f drawBackdrop = (jk.f) obj;
                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                float fB = this.B.b();
                float f = drawBackdrop.A;
                y3.O(drawBackdrop, 10.0f * f * fB, f * 14.0f * fB, 4);
                break;
            case 1:
                i2.c0 drawBackdrop2 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                tm.e eVar = this.B;
                drawBackdrop2.I0(((Number) eVar.p.d()).floatValue());
                drawBackdrop2.N(((Number) eVar.q.d()).floatValue());
                float fFloatValue = ((Number) eVar.n.d()).floatValue() / 10.0f;
                float fL = drawBackdrop2.l();
                float f2 = 0.75f * fFloatValue;
                if (f2 < -0.2f) {
                    f2 = -0.2f;
                }
                if (f2 > 0.2f) {
                    f2 = 0.2f;
                }
                drawBackdrop2.I0(fL / (1.0f - f2));
                float fJ1 = drawBackdrop2.j1();
                float f3 = fFloatValue * 0.25f;
                float f4 = f3 >= -0.2f ? f3 : -0.2f;
                drawBackdrop2.N((1.0f - (f4 <= 0.2f ? f4 : 0.2f)) * fJ1);
                break;
            case 2:
                k2.d drawBackdrop3 = (k2.d) obj;
                kotlin.jvm.internal.m.e(drawBackdrop3, "$this$drawBackdrop");
                float fB2 = this.B.b();
                k2.d.R(drawBackdrop3, i2.t.b(0.1f, i2.t.c), 0L, 0L, 1.0f - fB2, (k2.h) null, 0, 118);
                k2.d.R(drawBackdrop3, i2.t.b(fB2 * 0.03f, i2.t.b), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                break;
            case 3:
                i2.c0 drawBackdrop4 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(drawBackdrop4, "$this$drawBackdrop");
                float fA = b5.A(1.0f, ((drawBackdrop4.c() * 16.0f) / Float.intBitsToFloat((int) (drawBackdrop4.b() >> 32))) + 1.0f, this.B.b());
                drawBackdrop4.I0(fA);
                drawBackdrop4.N(fA);
                break;
            case 4:
                jk.f drawBackdrop5 = (jk.f) obj;
                kotlin.jvm.internal.m.e(drawBackdrop5, "$this$drawBackdrop");
                float fB3 = this.B.b();
                lk.a.a(drawBackdrop5);
                ca.v.p(drawBackdrop5, drawBackdrop5.A * 8.0f);
                float f5 = drawBackdrop5.A;
                y3.O(drawBackdrop5, f5 * 24.0f * fB3, f5 * 24.0f * fB3, 12);
                break;
            case 5:
                jk.f drawBackdrop6 = (jk.f) obj;
                kotlin.jvm.internal.m.e(drawBackdrop6, "$this$drawBackdrop");
                float fB4 = this.B.b();
                ca.v.p(drawBackdrop6, (1.0f - fB4) * drawBackdrop6.A * 8.0f);
                float f6 = drawBackdrop6.A;
                y3.O(drawBackdrop6, 10.0f * f6 * fB4, f6 * 14.0f * fB4, 4);
                break;
            case 6:
                i2.c0 drawBackdrop7 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(drawBackdrop7, "$this$drawBackdrop");
                tm.e eVar2 = this.B;
                drawBackdrop7.I0(((Number) eVar2.p.d()).floatValue());
                drawBackdrop7.N(((Number) eVar2.q.d()).floatValue());
                float fFloatValue2 = ((Number) eVar2.n.d()).floatValue() / 10.0f;
                float fL2 = drawBackdrop7.l();
                float f7 = 0.75f * fFloatValue2;
                if (f7 < -0.2f) {
                    f7 = -0.2f;
                }
                if (f7 > 0.2f) {
                    f7 = 0.2f;
                }
                drawBackdrop7.I0(fL2 / (1.0f - f7));
                float fJ2 = drawBackdrop7.j1();
                float f8 = fFloatValue2 * 0.25f;
                float f9 = f8 >= -0.2f ? f8 : -0.2f;
                drawBackdrop7.N((1.0f - (f9 <= 0.2f ? f9 : 0.2f)) * fJ2);
                break;
            case 7:
                k2.d drawBackdrop8 = (k2.d) obj;
                kotlin.jvm.internal.m.e(drawBackdrop8, "$this$drawBackdrop");
                k2.d.R(drawBackdrop8, i2.t.b(1.0f - this.B.b(), i2.t.c), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                break;
            case 8:
                jk.f drawBackdrop9 = (jk.f) obj;
                kotlin.jvm.internal.m.e(drawBackdrop9, "$this$drawBackdrop");
                float fB5 = this.B.b();
                ca.v.p(drawBackdrop9, (1.0f - fB5) * drawBackdrop9.A * 8.0f);
                float f11 = drawBackdrop9.A;
                y3.O(drawBackdrop9, 5.0f * f11 * fB5, f11 * 10.0f * fB5, 12);
                break;
            case 9:
                i2.c0 drawBackdrop10 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(drawBackdrop10, "$this$drawBackdrop");
                tm.e eVar3 = this.B;
                drawBackdrop10.I0(((Number) eVar3.p.d()).floatValue());
                drawBackdrop10.N(((Number) eVar3.q.d()).floatValue());
                float fFloatValue3 = ((Number) eVar3.n.d()).floatValue() / 50.0f;
                float fL3 = drawBackdrop10.l();
                float f12 = 0.75f * fFloatValue3;
                if (f12 < -0.2f) {
                    f12 = -0.2f;
                }
                if (f12 > 0.2f) {
                    f12 = 0.2f;
                }
                drawBackdrop10.I0(fL3 / (1.0f - f12));
                float fJ3 = drawBackdrop10.j1();
                float f13 = fFloatValue3 * 0.25f;
                float f14 = f13 >= -0.2f ? f13 : -0.2f;
                drawBackdrop10.N((1.0f - (f14 <= 0.2f ? f14 : 0.2f)) * fJ3);
                break;
            case 10:
                k2.d drawBackdrop11 = (k2.d) obj;
                kotlin.jvm.internal.m.e(drawBackdrop11, "$this$drawBackdrop");
                k2.d.R(drawBackdrop11, i2.t.b(1.0f - this.B.b(), i2.t.c), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                break;
            case 11:
                v2.s down = (v2.s) obj;
                kotlin.jvm.internal.m.e(down, "down");
                tm.e eVar4 = this.B;
                eVar4.d.invoke(eVar4, new h2.b(down.c));
                e5.g gVar = (e5.g) eVar4.s.B;
                w2.c cVar = (w2.c) gVar.c;
                w2.a[] aVarArr = cVar.d;
                h00.n.y0(0, aVarArr.length, null, aVarArr);
                cVar.e = 0;
                w2.c cVar2 = (w2.c) gVar.a;
                w2.a[] aVarArr2 = cVar2.d;
                h00.n.y0(0, aVarArr2.length, null, aVarArr2);
                cVar2.e = 0;
                gVar.b = 0L;
                ta.c0.M(eVar4.a, (k00.i) null, (u00.n) null, (u00.k) null, new lu.w(eVar4, null, 15), 31);
                break;
            case 12:
                v2.s it = (v2.s) obj;
                kotlin.jvm.internal.m.e(it, "it");
                tm.e eVar5 = this.B;
                eVar5.e.invoke(eVar5);
                eVar5.f();
                break;
            default:
                tm.e eVar6 = this.B;
                o9.q qVar = eVar6.s;
                ((e5.g) qVar.B).a(System.currentTimeMillis(), (((long) Float.floatToRawIntBits(eVar6.e())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
                float fB6 = y3.q.b(qVar.G(p30.f.U(Float.MAX_VALUE, Float.MAX_VALUE)));
                z00.b bVar = eVar6.b;
                ta.c0.M(eVar6.a, (k00.i) null, (u00.n) null, (u00.k) null, new tm.a(eVar6, fB6 / (((Number) bVar.c()).floatValue() - ((Number) bVar.a()).floatValue()), null, 2), 31);
                break;
        }
        return g00.b0.a;
    }
}
