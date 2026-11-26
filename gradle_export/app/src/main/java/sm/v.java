package sm;

import com.google.android.gms.internal.measurement.b5;

public final class v implements u00.n {
    public final int A;
    public final tm.e B;

    public v(tm.e eVar, int i) {
        this.A = i;
        this.B = eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a1.i iVarG0;
        long jQ;
        k2.d rememberBackdrop = (k2.d) obj;
        u00.k drawBackdrop = (u00.k) obj2;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(rememberBackdrop, "$this$rememberBackdrop");
                kotlin.jvm.internal.m.e(drawBackdrop, "drawBackdrop");
                float fB = this.B.b();
                float fA = b5.A(0.6666667f, 1.0f, fB);
                float fA2 = b5.A(0.0f, 1.0f, fB);
                long jY0 = rememberBackdrop.Y0();
                iVarG0 = rememberBackdrop.G0();
                jQ = iVarG0.q();
                iVarG0.n().i();
                try {
                    ((hf.c) iVarG0.B).H(fA, fA2, jY0);
                    drawBackdrop.invoke(rememberBackdrop);
                } finally {
                    w.c.t(iVarG0, jQ);
                }
                break;
            default:
                kotlin.jvm.internal.m.e(rememberBackdrop, "$this$rememberBackdrop");
                kotlin.jvm.internal.m.e(drawBackdrop, "drawBackdrop");
                float fB2 = this.B.b();
                float fA3 = b5.A(0.6666667f, 0.75f, fB2);
                float fA4 = b5.A(0.0f, 0.75f, fB2);
                long jY1 = rememberBackdrop.Y0();
                iVarG0 = rememberBackdrop.G0();
                jQ = iVarG0.q();
                iVarG0.n().i();
                try {
                    ((hf.c) iVarG0.B).H(fA3, fA4, jY1);
                    drawBackdrop.invoke(rememberBackdrop);
                } finally {
                    w.c.t(iVarG0, jQ);
                }
                break;
        }
        return g00.b0.a;
    }
}
