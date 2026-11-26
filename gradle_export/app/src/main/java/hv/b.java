package hv;

import c3.k1;
import com.google.android.gms.internal.measurement.b5;
import g00.b0;
import l1.z;
import z2.a0;
import z2.d0;

public final class b implements u00.k {
    public final int A;
    public final Object B;

    public b(Object obj, int i11) {
        this.A = i11;
        this.B = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z DisposableEffect = (z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                return new k1(this.B, 12);
            case 1:
                a0 coordinates = (a0) obj;
                kotlin.jvm.internal.m.e(coordinates, "coordinates");
                h2.c cVarG = d0.g(coordinates, true);
                Object key = this.B;
                kotlin.jvm.internal.m.e(key, "key");
                b5.f4547a = new g00.k(key, cVarG);
                return b0.f7770a;
            default:
                ((Integer) obj).intValue();
                return this.B;
        }
    }
}
