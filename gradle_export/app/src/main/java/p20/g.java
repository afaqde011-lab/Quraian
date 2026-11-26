package p20;

import e30.a1;
import e30.p0;
import e30.w;
import java.io.IOException;

public final class g implements u00.k {
    public final int A;
    public final h B;

    public g(h hVar, int i) {
        this.A = i;
        this.B = hVar;
    }

    @Override
    public final Object invoke(Object obj) throws IOException {
        switch (this.A) {
            case 0:
                p0 it = (p0) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (it.c()) {
                    return "*";
                }
                w wVarB = it.b();
                kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                String strX = this.B.X(wVarB);
                if (it.a() == a1.C) {
                    return strX;
                }
                return it.a() + ' ' + strX;
            default:
                w wVar = (w) obj;
                kotlin.jvm.internal.m.b(wVar);
                return this.B.X(wVar);
        }
    }
}
