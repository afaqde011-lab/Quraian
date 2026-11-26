package ev;

import a1.v2;
import as.r0;
import l1.z0;
import q0.g1;
import q0.w0;

public final class n implements u00.k {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;

    public n(Object obj, boolean z, u00.k kVar, int i) {
        this.A = i;
        this.D = obj;
        this.B = z;
        this.C = kVar;
    }

    public n(boolean z, m0.w wVar, a40.z zVar) {
        this.A = 2;
        this.B = z;
        this.D = wVar;
        this.C = zVar;
    }

    public n(boolean z, u00.k kVar, z0 z0Var) {
        this.A = 1;
        this.B = z;
        this.C = kVar;
        this.D = z0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        boolean z = this.B;
        int i2 = 4;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.C;
        Object obj3 = this.D;
        switch (i) {
            case 0:
                t tVar = (t) obj3;
                u00.k kVar = (u00.k) obj2;
                j0.h LazyColumn = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                if (!((h00.b) tVar.a).isEmpty()) {
                    u30.b bVar = tVar.a;
                    LazyColumn.r(((h00.b) bVar).a(), new v2(new e6.c(9), bVar, 11), new r0(4, bVar), new v1.c(new r(bVar, tVar, z, kVar), 802480018, true));
                } else {
                    j0.h.q(LazyColumn, "empty", a.a, 2);
                }
                break;
            case 1:
                u00.k kVar2 = (u00.k) obj2;
                z0 z0Var = (z0) obj3;
                g1 KeyboardActions = (g1) obj;
                kotlin.jvm.internal.m.e(KeyboardActions, "$this$KeyboardActions");
                if (!z) {
                    kVar2.invoke((String) z0Var.getValue());
                }
                break;
            case 2:
                m0.w wVar = (m0.w) obj3;
                a40.z zVar = (a40.z) obj2;
                j3.a0 a0Var = (j3.a0) obj;
                if (!z) {
                    m0.l lVar = new m0.l(wVar, zVar, 2);
                    a10.w[] wVarArr = j3.y.a;
                    a0Var.a(j3.n.z, new j3.a((String) null, lVar));
                    a0Var.a(j3.n.B, new j3.a((String) null, new m0.l(wVar, zVar, 3)));
                } else {
                    m0.l lVar2 = new m0.l(wVar, zVar, 0);
                    a10.w[] wVarArr2 = j3.y.a;
                    a0Var.a(j3.n.y, new j3.a((String) null, lVar2));
                    a0Var.a(j3.n.A, new j3.a((String) null, new m0.l(wVar, zVar, 1)));
                }
                break;
            default:
                qo.t tVar2 = (qo.t) obj3;
                u00.k kVar3 = (u00.k) obj2;
                j0.h LazyColumn2 = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn2, "$this$LazyColumn");
                lo.k kVar4 = tVar2.a;
                boolean z2 = this.B;
                if (kVar4 != null) {
                    j0.h.q(LazyColumn2, "header", new v1.c(new cz.m(z2, kVar4, kVar3, i2), 467457667, true), 2);
                    u30.b bVar2 = kVar4.g;
                    LazyColumn2.r(((h00.b) bVar2).a(), new w0(new pp.d(20), bVar2, 3), new r0(19, bVar2), new v1.c(new r(bVar2, z2, tVar2, kVar3, 1), 802480018, true));
                } else {
                    j0.h.q(LazyColumn2, "header", new v1.c(new cz.o(3, z2), -40003426, true), 2);
                    j0.h.q(LazyColumn2, (Object) null, new v1.c(new cz.o(4, z2), 1884690133, true), 3);
                }
                break;
        }
        return b0Var;
    }
}
