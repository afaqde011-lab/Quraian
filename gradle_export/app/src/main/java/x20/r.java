package x20;

import a10.w;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import m10.l0;

public final class r extends o {
    public static final w[] f;
    public final c30.i b;
    public final boolean c;
    public final d30.i d;
    public final d30.i e;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(r.class, "functions", "getFunctions()Ljava/util/List;", 0);
        b0 b0Var = a0.a;
        f = new w[]{b0Var.h(sVar), a1.b.h(r.class, DiagnosticsEntry.PROPERTIES_KEY, "getProperties()Ljava/util/List;", 0, b0Var)};
    }

    public r(d30.l storageManager, c30.i iVar, boolean z) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.b = iVar;
        this.c = z;
        j10.f fVar = j10.f.A;
        this.d = new d30.i(storageManager, new q(this, 0));
        this.e = new d30.i(storageManager, new q(this, 1));
    }

    @Override
    public final Collection a(f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        w[] wVarArr = f;
        return h00.q.Y0((List) ze.d.A(this.e, wVarArr[1]), (List) ze.d.A(this.d, wVarArr[0]));
    }

    @Override
    public final Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        List list = (List) ze.d.A(this.d, f[0]);
        n30.f fVar = new n30.f();
        for (Object obj : list) {
            if (kotlin.jvm.internal.m.a(((l0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override
    public final Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        List list = (List) ze.d.A(this.e, f[1]);
        n30.f fVar = new n30.f();
        for (Object obj : list) {
            if (kotlin.jvm.internal.m.a(((j10.l0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        return null;
    }
}
