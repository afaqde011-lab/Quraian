package g20;

import i20.f0;

public final class g implements c30.k {
    public final v20.b A;
    public final v20.b B;
    public final o10.c C;

    public g(o10.c kotlinClass, f0 packageProto, m20.f nameResolver, boolean z, c30.j jVar) {
        kotlin.jvm.internal.m.e(kotlinClass, "kotlinClass");
        kotlin.jvm.internal.m.e(packageProto, "packageProto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        v20.b bVar = new v20.b(v20.b.e(p10.d.a(kotlinClass.a)));
        d50.g gVar = kotlinClass.b;
        v20.b bVarC = null;
        String str = ((h20.a) gVar.c) != h20.a.MULTIFILE_CLASS_PART ? null : (String) gVar.h;
        if (str != null && str.length() > 0) {
            bVarC = v20.b.c(str);
        }
        this.A = bVar;
        this.B = bVarC;
        this.C = kotlinClass;
        o20.n packageModuleName = l20.j.k;
        kotlin.jvm.internal.m.d(packageModuleName, "packageModuleName");
        Integer num = (Integer) w00.a.u(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    @Override
    public final String a() {
        return g4.c.k(new StringBuilder("Class '"), b().a().a.a, '\'');
    }

    public final n20.b b() {
        n20.c cVar;
        v20.b bVar = this.A;
        String str = bVar.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = n20.c.c;
            if (cVar == null) {
                v20.b.a(9);
                throw null;
            }
        } else {
            cVar = new n20.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strD = bVar.d();
        kotlin.jvm.internal.m.d(strD, "getInternalName(...)");
        return new n20.b(cVar, n20.e.e(r30.k.b1('/', strD, strD)));
    }

    public final String toString() {
        return g.class.getSimpleName() + ": " + this.A;
    }
}
