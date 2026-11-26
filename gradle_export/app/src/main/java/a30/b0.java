package a30;

import com.google.android.gms.internal.measurement.z3;
import i20.u0;
import j10.q0;

public final class b0 implements u00.k {
    public final int A;
    public final ui.b B;

    public b0(ui.b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                k kVar = (k) this.B.C;
                k20.g gVar = (k20.g) kVar.b;
                i iVar = (i) kVar.a;
                n20.b bVarZ = z3.z(gVar, iIntValue);
                return bVarZ.c ? iVar.b(bVarZ) : j10.w.e(iVar.b, bVarZ);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                k kVar2 = (k) this.B.C;
                n20.b bVarZ2 = z3.z((k20.g) kVar2.b, iIntValue2);
                if (!bVarZ2.c) {
                    j10.z zVar = ((i) kVar2.a).b;
                    kotlin.jvm.internal.m.e(zVar, "<this>");
                    j10.h hVarE = j10.w.e(zVar, bVarZ2);
                    if (hVarE instanceof q0) {
                        return (q0) hVarE;
                    }
                }
                return null;
            default:
                u0 it = (u0) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return w50.c.X(it, (h9.f) ((k) this.B.C).d);
        }
    }
}
