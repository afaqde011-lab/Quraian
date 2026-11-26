package e;

import as.r0;
import cz.o;
import d.f0;
import eu.u;
import g00.b0;
import i2.c0;
import kotlin.jvm.internal.m;
import l1.p2;
import q0.w0;
import u00.k;

public final class c implements k {
    public final int A;
    public final boolean B;
    public final Object C;

    public c(Object obj, boolean z10, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = z10;
    }

    public c(boolean z10, p2 p2Var) {
        this.A = 2;
        this.B = z10;
        this.C = p2Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                f fVar = (f) this.C;
                f0 f0Var = fVar.f4934a;
                boolean z10 = this.B;
                f0Var.f(z10);
                fVar.f4935b.g(z10);
                return new d((r6.c) obj, fVar);
            case 1:
                uy.k kVar = (uy.k) this.C;
                j0.h hVar = (j0.h) obj;
                m.e(hVar, "$this$LazyColumn");
                j0.h.q(hVar, "TITLE_KEY", new v1.c(new o(5, this.B), 672361942, true), 2);
                h00.b bVar = kVar.a;
                hVar.r(bVar.a(), new w0(new r9.e(16), bVar, 6), new r0(22, bVar), new v1.c(new u(1, bVar), 802480018, true));
                return b0.a;
            default:
                p2 p2Var = (p2) this.C;
                c0 c0Var = (c0) obj;
                m.e(c0Var, "$this$graphicsLayer");
                float fC = c0Var.c() * ((y3.f) p2Var.getValue()).A;
                if (this.B) {
                    fC = -fC;
                }
                c0Var.T0(fC);
                return b0.a;
        }
    }
}
