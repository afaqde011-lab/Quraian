package l0;

import b3.n2;
import b3.o2;
import java.util.List;

public final class h1 implements u00.k {
    public final int A;
    public final kotlin.jvm.internal.z B;

    public h1(kotlin.jvm.internal.z zVar, int i11) {
        this.A = i11;
        this.B = zVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                o2 o2Var = (o2) obj;
                kotlin.jvm.internal.m.c(o2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                v0 v0Var = ((q1) o2Var).O;
                kotlin.jvm.internal.z zVar = this.B;
                List listW = (List) zVar.A;
                if (listW != null) {
                    listW.add(v0Var);
                } else {
                    listW = va.a.W(v0Var);
                }
                zVar.A = listW;
                return n2.B;
            default:
                q40.l it = (q40.l) obj;
                kotlin.jvm.internal.m.e(it, "it");
                this.B.A = it;
                return g00.b0.f7770a;
        }
    }
}
