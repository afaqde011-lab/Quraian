package d10;

public final class y0 extends qd.s0 {
    public final j10.l0 b;
    public final i20.j0 c;
    public final l20.d d;
    public final k20.g e;
    public final h9.f f;
    public final String g;

    public y0(j10.l0 l0Var, i20.j0 proto, l20.d dVar, k20.g nameResolver, h9.f typeTable) {
        String string;
        String strL;
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(typeTable, "typeTable");
        this.b = l0Var;
        this.c = proto;
        this.d = dVar;
        this.e = nameResolver;
        this.f = typeTable;
        if (dVar.g()) {
            strL = nameResolver.getString(dVar.E.C).concat(nameResolver.getString(dVar.E.D));
        } else {
            m20.d dVarB = m20.g.b(proto, nameResolver, typeTable, true);
            if (dVarB == null) {
                throw new a40.b0("No field signature for property: " + l0Var);
            }
            String str = dVarB.b;
            String str2 = dVarB.c;
            StringBuilder sb = new StringBuilder();
            sb.append(x10.u.a(str));
            j10.k kVarL = l0Var.l();
            kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
            if (kotlin.jvm.internal.m.a(l0Var.getVisibility(), j10.p.d) && (kVarL instanceof c30.i)) {
                i20.k kVar = ((c30.i) kVarL).E;
                o20.n classModuleName = l20.j.g;
                kotlin.jvm.internal.m.d(classModuleName, "classModuleName");
                Integer num = (Integer) w00.a.u(kVar, classModuleName);
                string = "$".concat(n20.f.a.c(num != null ? nameResolver.getString(num.intValue()) : "main", "_"));
            } else if (kotlin.jvm.internal.m.a(l0Var.getVisibility(), j10.p.a) && (kVarL instanceof j10.e0)) {
                c30.k kVar2 = ((c30.s) l0Var).f0;
                if (kVar2 instanceof g20.g) {
                    g20.g gVar = (g20.g) kVar2;
                    if (gVar.B != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        String strD = gVar.A.d();
                        kotlin.jvm.internal.m.d(strD, "getInternalName(...)");
                        sb2.append(n20.e.e(r30.k.b1('/', strD, strD)).b());
                        string = sb2.toString();
                    } else {
                        string = "";
                    }
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            strL = w.c.l(sb, string, "()", str2);
        }
        this.g = strL;
    }

    public final String W() {
        return this.g;
    }
}
