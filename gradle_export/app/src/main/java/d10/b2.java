package d10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class b2 {
    public static void a(StringBuilder sb, a10.c cVar) throws IOException {
        List parameters = cVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((w) ((w1) obj)).C == a10.n.B) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        h00.q.Q0(arrayList, sb, null, "context(", ") ", b.R, 50);
    }

    public static void b(String str, StringBuilder sb) {
        sb.append(va.a.d0(n20.e.e(str)));
    }

    public static void c(StringBuilder sb, a10.c cVar) {
        Object objInvoke = ((j) ((u1) cVar)).B.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objInvoke) {
            a10.n nVar = ((w) ((w1) obj)).C;
            if (nVar == a10.n.A || nVar == a10.n.C) {
                arrayList.add(obj);
            }
        }
        w1 w1Var = (w1) h00.q.O0(0, arrayList);
        if (w1Var != null) {
            sb.append(f(((w) w1Var).g(), false));
            sb.append(".");
        }
        w1 w1Var2 = (w1) h00.q.O0(1, arrayList);
        if (w1Var2 != null) {
            sb.append("(");
            sb.append(f(((w) w1Var2).g(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    public static String d(a10.g gVar) throws IOException {
        StringBuilder sb = new StringBuilder();
        a(sb, gVar);
        sb.append("fun ");
        c(sb, gVar);
        b(gVar.getName(), sb);
        h00.q.Q0(p30.f.h0(gVar), sb, ", ", "(", ")", b.S, 48);
        sb.append(": ");
        sb.append(f(gVar.getReturnType(), false));
        return sb.toString();
    }

    public static void e(StringBuilder sb, a10.d dVar, n20.d dVar2, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        boolean z3;
        if (dVar.getTypeParameters().size() >= list.size() || k00.f.D(dVar).getDeclaringClass() == null) {
            sb2 = sb;
            z3 = z2;
            sb2.append(va.a.f0(n20.d.f(dVar2)));
        } else {
            Class<?> declaringClass = k00.f.D(dVar).getDeclaringClass();
            kotlin.jvm.internal.m.d(declaringClass, "getDeclaringClass(...)");
            sb2 = sb;
            z3 = z2;
            e(sb2, k00.f.I(declaringClass), dVar2.e(), h00.q.H0(list, dVar.getTypeParameters().size()), false, z3);
            sb2.append(".");
            sb2.append(va.a.d0(dVar2.g()));
        }
        g(sb2, h00.q.j1(list, dVar.getTypeParameters().size()), z, z3);
    }

    public static String f(a10.x type, boolean z) throws IOException {
        n20.d dVar;
        kotlin.jvm.internal.m.e(type, "type");
        p30.a aVar = (p30.a) type;
        if (aVar.v()) {
            p30.a aVarX = aVar.x();
            kotlin.jvm.internal.m.b(aVarX);
            return f(aVarX, true);
        }
        p30.a aVarX2 = aVar.x();
        p30.a aVarA = aVar.A();
        if (aVarX2 != null && aVarA != null) {
            String strF = f(aVarX2, false);
            String strF2 = f(aVarA, false);
            if (kotlin.jvm.internal.m.a(strF, r30.r.v0(strF2, "?", ""))) {
                return r30.r.v0(strF2, "?", "!");
            }
            if (r30.r.p0(strF2, "?", false)) {
                if (kotlin.jvm.internal.m.a(strF + '?', strF2)) {
                    return strF + '!';
                }
            }
            if (kotlin.jvm.internal.m.a("(" + strF + ")?", strF2)) {
                return a1.b.p("(", strF, ")!");
            }
            String strE0 = va.a.e0(strF, strF2, new a2(strF, 0), new a2(strF, 1), p20.d.Q);
            if (strE0 != null) {
                return strE0;
            }
            return "(" + strF + ".." + strF2 + ')';
        }
        StringBuilder sb = new StringBuilder();
        a10.x xVarD = aVar.d();
        if (xVarD != null) {
            sb.append(xVarD);
            sb.append(" /* = ");
        }
        a10.e eVarS = type.s();
        if (eVarS instanceof r1) {
            b(((r1) eVarS).C, sb);
            if (type.f()) {
                sb.append("?");
            } else if (aVar.o()) {
                sb.append(" & Any");
            }
        } else if (eVarS instanceof a10.d) {
            a10.d dVar2 = (a10.d) eVarS;
            if (aVar.t()) {
                dVar = g10.o.b;
            } else {
                a10.d dVarG = aVar.g();
                if (dVarG == null) {
                    dVarG = dVar2;
                }
                String strM = dVarG.m();
                dVar = strM != null ? new n20.d(strM) : null;
            }
            if (dVar == null) {
                dVar = new n20.d(((j1) dVar2).B.getName());
            }
            if (dVar.h(g10.p.k) && kotlin.jvm.internal.m.a(w50.c.L(dVar), h10.g.c) && !type.r().contains(a10.z.c)) {
                if (aVar.f()) {
                    sb.append("(");
                }
                if (aVar.w()) {
                    sb.append("suspend ");
                }
                h00.q.Q0(h00.q.I0(aVar.r()), sb, null, "(", ") -> ", null, 114);
                sb.append(h00.q.T0(aVar.r()));
                if (aVar.f()) {
                    sb.append(")?");
                }
            } else {
                e(sb, dVar2, dVar, type.r(), type.f(), z);
            }
        } else if (eVarS instanceof q1) {
            n20.d dVar3 = ((q1) eVarS).A.a;
            dVar3.getClass();
            h00.q.Q0(n20.d.f(dVar3), sb, ".", null, null, b.U, 60);
            sb = sb;
            g(sb, type.r(), type.f(), z);
        } else {
            sb.append("???");
        }
        if (aVar.d() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    public static void g(StringBuilder sb, List list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            h00.q.Q0(list, sb2, null, "<", ">", new z1(z2), 50);
        }
        if (z) {
            sb2.append("?");
        }
    }
}
