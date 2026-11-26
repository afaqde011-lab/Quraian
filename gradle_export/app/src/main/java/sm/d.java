package sm;

import as.r0;
import java.util.List;
import l1.p2;
import q0.w0;

public final class d implements u00.k {
    public final int A;
    public final boolean B;
    public final float C;
    public final Object D;
    public final Object E;

    public d(boolean z, Object obj, float f, Object obj2, int i) {
        this.A = i;
        this.B = z;
        this.D = obj;
        this.C = f;
        this.E = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                tm.e eVar = (tm.e) this.D;
                p2 p2Var = (p2) this.E;
                i2.c0 graphicsLayer = (i2.c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.T0(((Number) p2Var.getValue()).floatValue() + (eVar.e() * (this.B ? 1.0f : -1.0f) * this.C));
                break;
            default:
                List list = (List) this.D;
                u00.k kVar = (u00.k) this.E;
                j0.h LazyRow = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                boolean z = this.B;
                float f = this.C;
                if (z) {
                    j0.h.s(LazyRow, 4, (e6.c) null, new v1.c(new kx.f(f, 2), -2023794081, true), 6);
                } else {
                    LazyRow.r(list.size(), new w0(new wp.a(7), list, 10), new r0(26, list), new v1.c(new wr.b0(list, f, kVar), 802480018, true));
                }
                break;
        }
        return g00.b0.a;
    }
}
