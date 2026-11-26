package vb;

import java.util.regex.Pattern;
import kotlin.jvm.internal.n;
import qd.s0;
import x40.s;

public final class a extends n implements u00.a {
    public final int A;
    public final b B;

    public a(b bVar, int i10) {
        super(0);
        this.A = i10;
        this.B = bVar;
    }

    public final Object invoke() {
        int i10 = this.A;
        b bVar = this.B;
        switch (i10) {
            case 0:
                x40.d dVar = x40.d.n;
                return s0.m0(bVar.f15589f);
            default:
                String strA = bVar.f15589f.a("Content-Type");
                if (strA == null) {
                    return null;
                }
                Pattern pattern = s.d;
                try {
                    return w50.c.H(strA);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
