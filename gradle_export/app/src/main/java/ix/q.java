package ix;

import a1.v2;
import as.r0;
import g00.b0;
import hx.t;
import q0.w0;

public final class q implements u00.k {
    public final int A = 1;
    public final u30.b B;
    public final u00.k C;
    public final boolean D;
    public final u30.b E;

    public q(u30.b bVar, u00.k kVar, boolean z, u30.b bVar2) {
        this.B = bVar;
        this.C = kVar;
        this.D = z;
        this.E = bVar2;
    }

    public q(u30.b bVar, u30.b bVar2, u00.k kVar, boolean z) {
        this.B = bVar;
        this.E = bVar2;
        this.C = kVar;
        this.D = z;
    }

    @Override
    public final Object invoke(Object obj) {
        j0.h LazyRow = (j0.h) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                t tVar = new t(10);
                u30.b bVar = this.B;
                LazyRow.r(((h00.b) bVar).a(), new v2(tVar, bVar, 19), new r0(10, bVar), new v1.c(new r(bVar, this.E, this.C, this.D), 802480018, true));
                break;
            default:
                kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                wp.a aVar = new wp.a(8);
                u30.b bVar2 = this.B;
                LazyRow.r(((h00.b) bVar2).a(), new w0(aVar, bVar2, 11), new r0(27, bVar2), new v1.c(new r(bVar2, this.C, this.D, this.E), 802480018, true));
                break;
        }
        return b0.a;
    }
}
