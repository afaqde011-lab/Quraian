package es;

import g00.b0;
import i2.q;
import k2.h;
import kotlin.jvm.internal.m;
import u00.k;

public final class c implements k {
    public final float A;
    public final u00.a B;
    public final long C;
    public final int D;
    public final q E;

    public c(float f, u00.a aVar, long j, int i, q qVar) {
        this.A = f;
        this.B = aVar;
        this.C = j;
        this.D = i;
        this.E = qVar;
    }

    @Override
    public final Object invoke(Object obj) {
        k2.d Canvas = (k2.d) obj;
        m.e(Canvas, "$this$Canvas");
        float fA0 = Canvas.A0(this.A);
        float f = 2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.b() >> 32)) - fA0)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.b() & 4294967295L)) * f) - (fA0 * f))) & 4294967295L);
        float f2 = fA0 / f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2)));
        float fFloatValue = 1.0f - ((Number) this.B.invoke()).floatValue();
        int i = this.D;
        k2.d.n1(Canvas, this.C, 180.0f, 180.0f, jFloatToRawIntBits2, jFloatToRawIntBits, 0.0f, new h(fA0, 0.0f, i, 0, (i2.h) null, 26), 832);
        Canvas.x(this.E, fFloatValue * 180.0f, jFloatToRawIntBits2, jFloatToRawIntBits, new h(fA0, 0.0f, i, 0, (i2.h) null, 26));
        return b0.a;
    }
}
