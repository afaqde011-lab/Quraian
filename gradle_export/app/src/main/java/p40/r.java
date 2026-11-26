package p40;

import com.google.android.gms.internal.measurement.g4;

public final class r implements l40.a {
    public static final r a = new r();
    public static final u0 b = new u0("kotlin.time.Duration", n40.c.k);

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        s30.a aVar = s30.b.B;
        String value = decoder.p();
        kotlin.jvm.internal.m.e(value, "value");
        try {
            long jX = g4.X(value);
            if (s30.b.d(jX, s30.b.E)) {
                throw new IllegalStateException("invariant failed");
            }
            return new s30.b(jX);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(a1.b.p("Invalid ISO duration string format: '", value, "'."), e);
        }
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        long j = ((s30.b) obj).A;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        s30.a aVar = s30.b.B;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jK = j < 0 ? s30.b.k(j) : j;
        long jI = s30.b.i(jK, s30.d.HOURS);
        boolean z = false;
        int i = s30.b.g(jK) ? 0 : (int) (s30.b.i(jK, s30.d.MINUTES) % ((long) 60));
        int i2 = s30.b.g(jK) ? 0 : (int) (s30.b.i(jK, s30.d.SECONDS) % ((long) 60));
        int iF = s30.b.f(jK);
        if (s30.b.g(j)) {
            jI = 9999999999999L;
        }
        boolean z2 = jI != 0;
        boolean z3 = (i2 == 0 && iF == 0) ? false : true;
        if (i != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jI);
            sb.append('H');
        }
        if (z) {
            sb.append(i);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            s30.b.b(sb, i2, iF, 9, "S", true);
        }
        encoder.D(sb.toString());
    }
}
