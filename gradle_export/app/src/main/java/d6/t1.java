package d6;

import android.util.Log;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

public final class t1 implements u00.k {
    public final int A;
    public final boolean B;

    public t1(int i10, boolean z10) {
        this.A = i10;
        this.B = z10;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        b6.i iVar;
        b6.m mVarD;
        b6.m mVarD2;
        switch (this.A) {
            case 0:
                b6.h hVar = (b6.h) obj;
                b6.m mVar = b6.k.f2179a;
                if (this.B && !(hVar instanceof f0) && hVar.b().c(new bw.b(21))) {
                    hVar.c((b6.m) hVar.b().a(mVar, n1.N));
                }
                if ((hVar instanceof f0) || !hVar.b().c(new bw.b(22))) {
                    return hVar;
                }
                ArrayList<b6.m> arrayList = new ArrayList();
                ArrayList<b6.m> arrayList2 = new ArrayList();
                b6.m mVarB = hVar.b();
                g00.k kVar = mVarB.c(u1.C) ? (g00.k) mVarB.a(new g00.k((Object) null, mVar), n1.O) : new g00.k((Object) null, mVarB);
                b6.c cVar = (b6.c) kVar.A;
                b6.m mVar2 = (b6.m) kVar.B;
                if (cVar != null) {
                    if (!(cVar instanceof b6.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(cVar);
                }
                if (((Number) mVar2.a(0, new cp.a(14))).intValue() > 1) {
                    Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                }
                g00.k kVar2 = mVar2.c(u1.D) ? (g00.k) mVar2.a(new g00.k((Object) null, mVar), n1.P) : new g00.k((Object) null, mVar2);
                c6.b bVar = (c6.b) kVar2.A;
                b6.m mVar3 = (b6.m) kVar2.B;
                arrayList.add(bVar);
                if (bVar != null) {
                    b6.a aVar = new b6.a(2131231060);
                    iVar = new b6.i();
                    iVar.f2172a = ze.d.u(mVar);
                    iVar.f2173b = aVar;
                } else {
                    iVar = null;
                }
                h0 h0Var = mVar3.c(new bw.b(23)) ? (h0) mVar3.a(new h0((b6.m) null, 3), new cp.a(15)) : new h0(mVar3, 1);
                b6.m mVar4 = h0Var.f4632a;
                b6.m mVar5 = h0Var.f4633b;
                arrayList.add(mVar4);
                arrayList2.add(ze.d.u(mVar5));
                j6.i iVar2 = new j6.i();
                b6.m mVar6 = mVar;
                for (b6.m mVar7 : arrayList) {
                    if (mVar7 != null && (mVarD2 = mVar6.d(mVar7)) != null) {
                        mVar6 = mVarD2;
                    }
                }
                iVar2.f8178c = mVar6;
                for (b6.m mVar8 : arrayList2) {
                    if (mVar8 != null && (mVarD = mVar.d(mVar8)) != null) {
                        mVar = mVarD;
                    }
                }
                hVar.c(mVar);
                ArrayList arrayList3 = iVar2.f2178b;
                arrayList3.add(hVar);
                if (iVar != null) {
                    arrayList3.add(iVar);
                }
                return iVar2;
            case 1:
                j3.a0 a0Var = (j3.a0) obj;
                kotlin.jvm.internal.m.e(a0Var, "$this$semantics");
                j3.y.l(a0Var, this.B);
                break;
            default:
                j3.y.l((j3.a0) obj, this.B);
                break;
        }
        return g00.b0.a;
    }
}
