package i10;

import a10.w;
import h00.z;
import java.util.Collection;
import kotlin.jvm.internal.s;
import m10.a0;

public final class g implements l10.c {
    public static final n20.e g;
    public static final n20.b h;
    public final a0 a;
    public final u00.k b = f.B;
    public final d30.i c;
    public static final w[] e = {kotlin.jvm.internal.a0.a.h(new s(g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};
    public static final e d = new e();
    public static final n20.c f = g10.p.l;

    static {
        n20.d dVar = g10.o.c;
        g = dVar.g();
        n20.c cVarI = dVar.i();
        h = new n20.b(cVarI.b(), cVarI.a.g());
    }

    public g(d30.l lVar, a0 a0Var) {
        this.a = a0Var;
        this.c = new d30.i(lVar, new a20.a(this, lVar, 20));
    }

    @Override
    public final boolean a(n20.c packageFqName, n20.e name) {
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        kotlin.jvm.internal.m.e(name, "name");
        return name.equals(g) && packageFqName.equals(f);
    }

    @Override
    public final Collection b(n20.c packageFqName) {
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        if (!packageFqName.equals(f)) {
            return z.A;
        }
        return w50.c.g0((m10.k) ze.d.A(this.c, e[0]));
    }

    @Override
    public final j10.e c(n20.b classId) {
        kotlin.jvm.internal.m.e(classId, "classId");
        if (!classId.equals(h)) {
            return null;
        }
        return (m10.k) ze.d.A(this.c, e[0]);
    }
}
