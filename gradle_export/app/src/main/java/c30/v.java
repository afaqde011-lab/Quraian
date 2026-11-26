package c30;

import com.google.android.gms.internal.measurement.z3;
import e30.a1;
import i20.u0;
import i20.y0;
import i20.z0;
import j10.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class v extends m10.c {
    public final a30.k L;
    public final z0 M;
    public final a N;

    public v(a30.k kVar, z0 z0Var, int i) {
        a1 a1Var;
        d30.l lVar = ((a30.i) kVar.a).a;
        j10.k kVar2 = (j10.k) kVar.c;
        n20.e eVarA = z3.A((k20.g) kVar.b, z0Var.E);
        y0 y0Var = z0Var.G;
        kotlin.jvm.internal.m.d(y0Var, "getVariance(...)");
        int iOrdinal = y0Var.ordinal();
        if (iOrdinal == 0) {
            a1Var = a1.D;
        } else if (iOrdinal == 1) {
            a1Var = a1.E;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a1Var = a1.C;
        }
        a1 a1Var2 = a1Var;
        super(lVar, kVar2, k10.g.a, eVarA, a1Var2, z0Var.F, i, o0.C);
        this.L = kVar;
        this.M = z0Var;
        this.N = new a(lVar, new a30.l(this, 7));
    }

    @Override
    public final List Z0() {
        a30.k kVar = this.L;
        List listM0 = w50.c.m0(this.M, (h9.f) kVar.d);
        if (listM0.isEmpty()) {
            return va.a.R(u20.d.e(this).n());
        }
        ui.b bVar = (ui.b) kVar.h;
        ArrayList arrayList = new ArrayList(h00.r.q0(listM0, 10));
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            arrayList.add(bVar.F((u0) it.next()));
        }
        return arrayList;
    }

    @Override
    public final k10.h getAnnotations() {
        return this.N;
    }
}
