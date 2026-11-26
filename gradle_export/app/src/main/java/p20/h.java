package p20;

import com.google.android.gms.internal.measurement.z3;
import e30.a0;
import e30.m0;
import e30.p0;
import e30.v;
import e30.w;
import e30.x0;
import e30.z0;
import gz.e1;
import j10.d0;
import j10.e0;
import j10.i0;
import j10.l0;
import j10.q0;
import j10.u0;
import j10.x;
import j10.y;
import j10.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import m10.k0;
import m10.r0;
import m10.u;
import ri.t1;

public final class h implements j {
    public static final h c;
    public static final h d;
    public static final h e;
    public final l a;
    public final g00.p b = rd.a.J(new eo.p(this, 14));

    static {
        t1.R(d.B);
        t1.R(d.D);
        t1.R(d.E);
        t1.R(d.F);
        t1.R(d.G);
        t1.R(d.H);
        c = t1.R(d.I);
        t1.R(d.J);
        d = t1.R(d.K);
        e = t1.R(d.L);
        t1.R(d.C);
    }

    public h(l lVar) {
        this.a = lVar;
    }

    public static void W(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean i0(w wVar) {
        if (!w50.c.S(wVar)) {
            return false;
        }
        List listE0 = wVar.e0();
        if (listE0 != null && listE0.isEmpty()) {
            return true;
        }
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            if (((p0) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void n(h hVar, l0 l0Var, StringBuilder sb) throws IOException {
        boolean zR = hVar.r();
        l lVar = hVar.a;
        if (!zR) {
            k kVar = lVar.g;
            a10.w[] wVarArr = l.Y;
            if (!((Boolean) kVar.a(wVarArr[5], lVar)).booleanValue()) {
                List listB0 = l0Var.b0();
                kotlin.jvm.internal.m.d(listB0, "getContextReceiverParameters(...)");
                hVar.C(sb, listB0);
                if (hVar.q().contains(i.ANNOTATIONS)) {
                    hVar.y(sb, l0Var, null);
                    f5.c cVarA0 = l0Var.a0();
                    if (cVarA0 != null) {
                        hVar.y(sb, cVarA0, k10.d.FIELD);
                    }
                    f5.c cVarY = l0Var.Y();
                    if (cVarY != null) {
                        hVar.y(sb, cVarY, k10.d.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((q) lVar.H.a(wVarArr[32], lVar)) == q.B) {
                        k10.a aVarB = l0Var.b();
                        if (aVarB != null) {
                            hVar.y(sb, aVarB, k10.d.PROPERTY_GETTER);
                        }
                        k0 k0VarC = l0Var.c();
                        if (k0VarC != null) {
                            hVar.y(sb, k0VarC, k10.d.PROPERTY_SETTER);
                            List listO = k0VarC.O();
                            kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                            k10.a aVar = (r0) h00.q.d1(listO);
                            kotlin.jvm.internal.m.b(aVar);
                            hVar.y(sb, aVar, k10.d.SETTER_PARAMETER);
                        }
                    }
                }
                j10.o visibility = l0Var.getVisibility();
                kotlin.jvm.internal.m.d(visibility, "getVisibility(...)");
                hVar.g0(visibility, sb);
                hVar.N(sb, hVar.q().contains(i.CONST) && l0Var.u(), "const");
                hVar.K(l0Var, sb);
                hVar.M(l0Var, sb);
                hVar.S(l0Var, sb);
                hVar.N(sb, hVar.q().contains(i.LATEINIT) && l0Var.c0(), "lateinit");
                hVar.J(l0Var, sb);
            }
            hVar.d0(l0Var, sb, false);
            List typeParameters = l0Var.getTypeParameters();
            kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
            hVar.c0(sb, typeParameters, true);
            hVar.U(l0Var, sb);
        }
        hVar.P(l0Var, sb, true);
        sb.append(": ");
        w type = l0Var.getType();
        kotlin.jvm.internal.m.d(type, "getType(...)");
        sb.append(hVar.X(type));
        hVar.V(l0Var, sb);
        hVar.H(l0Var, sb);
        List typeParameters2 = l0Var.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters2, "getTypeParameters(...)");
        hVar.h0(sb, typeParameters2);
    }

    public static y v(x xVar) {
        if (xVar instanceof j10.e) {
            return ((j10.e) xVar).getKind() == j10.f.B ? y.E : y.B;
        }
        j10.k kVarL = xVar.l();
        j10.e eVar = kVarL instanceof j10.e ? (j10.e) kVarL : null;
        if (eVar != null && (xVar instanceof j10.c)) {
            j10.c cVar = (j10.c) xVar;
            Collection collectionM = cVar.m();
            kotlin.jvm.internal.m.d(collectionM, "getOverriddenDescriptors(...)");
            if (!collectionM.isEmpty() && eVar.g() != y.B) {
                return y.D;
            }
            if (eVar.getKind() != j10.f.B || kotlin.jvm.internal.m.a(cVar.getVisibility(), j10.p.a)) {
                return y.B;
            }
            y yVarG = cVar.g();
            y yVar = y.E;
            return yVarG == yVar ? yVar : y.D;
        }
        return y.B;
    }

    public final void A(j10.i iVar, StringBuilder sb) {
        List listP = iVar.p();
        kotlin.jvm.internal.m.d(listP, "getDeclaredTypeParameters(...)");
        List parameters = iVar.f().getParameters();
        kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
        if (u() && iVar.k() && parameters.size() > listP.size()) {
            sb.append(" /*captured type parameters: ");
            b0(sb, parameters.subList(listP.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String B(s20.g gVar) {
        l lVar = this.a;
        u00.k kVar = (u00.k) lVar.v.a(l.Y[20], lVar);
        if (kVar != null) {
            return (String) kVar.invoke(gVar);
        }
        if (gVar instanceof s20.b) {
            Iterable iterable = (Iterable) ((s20.b) gVar).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strB = B((s20.g) it.next());
                if (strB != null) {
                    arrayList.add(strB);
                }
            }
            return h00.q.R0(arrayList, ", ", "{", "}", null, 56);
        }
        if (gVar instanceof s20.a) {
            return r30.k.R0(x((k10.b) ((s20.a) gVar).a, null), "@");
        }
        if (!(gVar instanceof s20.t)) {
            return gVar.toString();
        }
        s20.s sVar = (s20.s) ((s20.t) gVar).a;
        if (sVar instanceof s20.q) {
            return ((s20.q) sVar).a + "::class";
        }
        if (!(sVar instanceof s20.r)) {
            throw new NoWhenBranchMatchedException();
        }
        s20.f fVar = ((s20.r) sVar).a;
        String strG = fVar.a.a().a.a;
        int i = fVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            strG = oi.k.g('>', "kotlin.Array<", strG);
        }
        return w.c.j(strG, "::class");
    }

    public final void C(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            w type = ((u) it.next()).getType();
            kotlin.jvm.internal.m.d(type, "getType(...)");
            sb.append(G(type, true));
            if (i == va.a.M(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    public final void D(StringBuilder sb, a0 a0Var) {
        y(sb, a0Var, null);
        if (e30.c.k(a0Var)) {
            boolean z = a0Var instanceof g30.i;
            l lVar = this.a;
            if (z && ((g30.i) a0Var).D.B && ((Boolean) lVar.V.a(l.Y[47], lVar)).booleanValue()) {
                g30.l lVar2 = g30.l.a;
                if (z) {
                    boolean z2 = ((g30.i) a0Var).D.B;
                }
                m0 m0VarM0 = a0Var.m0();
                kotlin.jvm.internal.m.c(m0VarM0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(E(((g30.j) m0VarM0).B[0]));
            } else {
                if (!z || ((Boolean) lVar.X.a(l.Y[49], lVar)).booleanValue()) {
                    sb.append(a0Var.m0().toString());
                } else {
                    sb.append(((g30.i) a0Var).H);
                }
                sb.append(Y(a0Var.e0()));
            }
        } else {
            m0 m0VarM1 = a0Var.m0();
            j10.h hVarG = a0Var.m0().g();
            a1.i iVarA = j10.w.a(a0Var, hVarG instanceof j10.i ? (j10.i) hVarG : null, 0);
            if (iVarA == null) {
                sb.append(Z(m0VarM1));
                sb.append(Y(a0Var.e0()));
            } else {
                T(sb, iVarA);
            }
        }
        if (a0Var.t0()) {
            sb.append("?");
        }
        if (a0Var instanceof e30.l) {
            sb.append(" & Any");
        }
    }

    public final String E(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return a1.b.p("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String F(String lowerRendered, String upperRendered, g10.i iVar) {
        kotlin.jvm.internal.m.e(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.m.e(upperRendered, "upperRendered");
        if (va.a.n0(lowerRendered, upperRendered)) {
            return r30.r.x0(upperRendered, "(", false) ? a1.b.p("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        String strE0 = va.a.e0(lowerRendered, upperRendered, new f(this, iVar, 0), new f(this, iVar, 1), new e1(1, this, h.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 13));
        if (strE0 != null) {
            return strE0;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    public final String G(w wVar, boolean z) throws IOException {
        String strX = X(wVar);
        return ((!i0(wVar) || x0.e(wVar)) && !(wVar instanceof e30.l) && (!z || wVar.getAnnotations().isEmpty())) ? strX : oi.k.g(')', "(", strX);
    }

    public final void H(u0 u0Var, StringBuilder sb) {
        s20.g gVarM;
        String strB;
        l lVar = this.a;
        if (!((Boolean) lVar.u.a(l.Y[19], lVar)).booleanValue() || (gVarM = u0Var.M()) == null || (strB = B(gVarM)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(o(strB));
    }

    public final String I(String str) {
        int iOrdinal = s().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            l lVar = this.a;
            if (!((Boolean) lVar.W.a(l.Y[48], lVar)).booleanValue()) {
                return a1.b.p("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void J(j10.c cVar, StringBuilder sb) {
        String str;
        if (q().contains(i.MEMBER_KIND) && u() && cVar.getKind() != 1) {
            sb.append("/*");
            int kind = cVar.getKind();
            if (kind == 1) {
                str = "DECLARATION";
            } else if (kind == 2) {
                str = "FAKE_OVERRIDE";
            } else if (kind == 3) {
                str = "DELEGATION";
            } else {
                if (kind != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(t1.Q(str));
            sb.append("*/ ");
        }
    }

    public final void K(x xVar, StringBuilder sb) {
        N(sb, xVar.isExternal(), "external");
        boolean z = false;
        N(sb, q().contains(i.EXPECT) && xVar.E(), "expect");
        if (q().contains(i.ACTUAL) && xVar.p0()) {
            z = true;
        }
        N(sb, z, "actual");
    }

    public final void L(y yVar, StringBuilder sb, y yVar2) {
        l lVar = this.a;
        if (((Boolean) lVar.p.a(l.Y[14], lVar)).booleanValue() || yVar != yVar2) {
            N(sb, q().contains(i.MODALITY), t1.Q(yVar.name()));
        }
    }

    public final void M(j10.c cVar, StringBuilder sb) {
        if (q20.d.q(cVar) && cVar.g() == y.B) {
            return;
        }
        l lVar = this.a;
        if (((o) lVar.B.a(l.Y[26], lVar)) == o.A && cVar.g() == y.D && !cVar.m().isEmpty()) {
            return;
        }
        y yVarG = cVar.g();
        kotlin.jvm.internal.m.d(yVarG, "getModality(...)");
        L(yVarG, sb, v(cVar));
    }

    public final void N(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(I(str));
            sb.append(" ");
        }
    }

    public final String O(n20.e eVar, boolean z) {
        String strO = o(va.a.d0(eVar));
        l lVar = this.a;
        return (((Boolean) lVar.W.a(l.Y[48], lVar)).booleanValue() && s() == t.B && z) ? a1.b.p("<b>", strO, "</b>") : strO;
    }

    public final void P(j10.k kVar, StringBuilder sb, boolean z) {
        n20.e name = kVar.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        sb.append(O(name, z));
    }

    public final void Q(StringBuilder sb, w wVar) throws IOException {
        z0 z0VarY0 = wVar.y0();
        e30.a aVar = z0VarY0 instanceof e30.a ? (e30.a) z0VarY0 : null;
        if (aVar == null) {
            R(sb, wVar);
            return;
        }
        a0 a0Var = aVar.C;
        a0 a0Var2 = aVar.B;
        l lVar = this.a;
        k kVar = lVar.R;
        a10.w[] wVarArr = l.Y;
        if (((Boolean) kVar.a(wVarArr[42], lVar)).booleanValue()) {
            R(sb, a0Var2);
            if (((Boolean) lVar.S.a(wVarArr[43], lVar)).booleanValue()) {
                t tVarS = s();
                r rVar = t.B;
                if (tVarS == rVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                R(sb, a0Var);
                sb.append(" */");
                if (s() == rVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        R(sb, a0Var);
        if (((Boolean) lVar.Q.a(wVarArr[41], lVar)).booleanValue()) {
            t tVarS2 = s();
            r rVar2 = t.B;
            if (tVarS2 == rVar2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            R(sb, a0Var2);
            sb.append(" */");
            if (s() == rVar2) {
                sb.append("</i></font>");
            }
        }
    }

    public final void R(StringBuilder sb, w wVar) throws IOException {
        n20.e eVarF;
        String strO;
        l lVar = this.a;
        if ((wVar instanceof e30.y) && lVar.n()) {
            d30.i iVar = ((e30.y) wVar).D;
            if (iVar.C == d30.k.A || iVar.C == d30.k.B) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        z0 z0VarY0 = wVar.y0();
        if (z0VarY0 instanceof e30.q) {
            sb.append(((e30.q) z0VarY0).D0(this, this));
            return;
        }
        if (!(z0VarY0 instanceof a0)) {
            throw new NoWhenBranchMatchedException();
        }
        a0 a0Var = (a0) z0VarY0;
        if (a0Var.equals(x0.b) || a0Var.m0() == x0.a.B) {
            sb.append("???");
            return;
        }
        m0 m0VarM0 = a0Var.m0();
        if ((m0VarM0 instanceof g30.j) && ((g30.j) m0VarM0).A == g30.k.J) {
            if (!((Boolean) lVar.t.a(l.Y[18], lVar)).booleanValue()) {
                sb.append("???");
                return;
            }
            m0 m0VarM1 = a0Var.m0();
            kotlin.jvm.internal.m.c(m0VarM1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(E(((g30.j) m0VarM1).B[0]));
            return;
        }
        if (e30.c.k(a0Var)) {
            D(sb, a0Var);
            return;
        }
        if (!i0(a0Var)) {
            D(sb, a0Var);
            return;
        }
        int length = sb.length();
        ((h) this.b.getValue()).y(sb, a0Var, null);
        boolean z = sb.length() != length;
        w wVarP = w50.c.P(a0Var);
        List listJ = w50.c.J(a0Var);
        boolean zU = w50.c.U(a0Var);
        boolean zT0 = a0Var.t0();
        boolean z2 = zT0 || (z && wVarP != null);
        if (z2) {
            if (zU) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    z3.J(r30.k.M0(sb));
                    if (sb.charAt(r30.k.F0(sb) - 1) != ')') {
                        sb.insert(r30.k.F0(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        N(sb, zU, "suspend");
        if (!listJ.isEmpty()) {
            sb.append("context(");
            Iterator it = listJ.subList(0, va.a.M(listJ)).iterator();
            while (it.hasNext()) {
                Q(sb, (w) it.next());
                sb.append(", ");
            }
            Q(sb, (w) h00.q.T0(listJ));
            sb.append(") ");
        }
        if (wVarP != null) {
            boolean z3 = (i0(wVarP) && !wVarP.t0()) || w50.c.U(wVarP) || !wVarP.getAnnotations().isEmpty() || (wVarP instanceof e30.l);
            if (z3) {
                sb.append("(");
            }
            Q(sb, wVarP);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!w50.c.S(a0Var) || a0Var.getAnnotations().f(g10.o.p) == null || a0Var.e0().size() > 1) {
            int i = 0;
            for (p0 typeProjection : w50.c.Q(a0Var)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (((Boolean) lVar.U.a(l.Y[45], lVar)).booleanValue()) {
                    w wVarB = typeProjection.b();
                    kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                    eVarF = w50.c.F(wVarB);
                } else {
                    eVarF = null;
                }
                if (eVarF != null) {
                    sb.append(O(eVarF, false));
                    sb.append(": ");
                }
                kotlin.jvm.internal.m.e(typeProjection, "typeProjection");
                StringBuilder sb2 = new StringBuilder();
                h00.q.Q0(va.a.R(typeProjection), sb2, ", ", null, null, new g(this, 0), 60);
                sb.append(sb2.toString());
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            strO = o("->");
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            strO = "&rarr;";
        }
        sb.append(strO);
        sb.append(" ");
        w50.c.S(a0Var);
        w wVarB2 = ((p0) h00.q.T0(a0Var.e0())).b();
        kotlin.jvm.internal.m.d(wVarB2, "getType(...)");
        Q(sb, wVarB2);
        if (z2) {
            sb.append(")");
        }
        if (zT0) {
            sb.append("?");
        }
    }

    public final void S(j10.c cVar, StringBuilder sb) {
        if (q().contains(i.OVERRIDE) && !cVar.m().isEmpty()) {
            l lVar = this.a;
            if (((o) lVar.B.a(l.Y[26], lVar)) != o.B) {
                N(sb, true, "override");
                if (u()) {
                    sb.append("/*");
                    sb.append(cVar.m().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void T(StringBuilder sb, a1.i iVar) {
        a1.i iVar2 = (a1.i) iVar.D;
        j10.i iVar3 = (j10.i) iVar.B;
        if (iVar2 != null) {
            T(sb, iVar2);
            sb.append('.');
            n20.e name = iVar3.getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            sb.append(O(name, false));
        } else {
            m0 m0VarF = iVar3.f();
            kotlin.jvm.internal.m.d(m0VarF, "getTypeConstructor(...)");
            sb.append(Z(m0VarF));
        }
        sb.append(Y((List) iVar.C));
    }

    public final void U(j10.c cVar, StringBuilder sb) {
        u uVarX = cVar.X();
        if (uVarX != null) {
            y(sb, uVarX, k10.d.RECEIVER);
            w type = uVarX.getType();
            kotlin.jvm.internal.m.d(type, "getType(...)");
            sb.append(G(type, false));
            sb.append(".");
        }
    }

    public final void V(j10.c cVar, StringBuilder sb) {
        u uVarX;
        l lVar = this.a;
        if (((Boolean) lVar.F.a(l.Y[30], lVar)).booleanValue() && (uVarX = cVar.X()) != null) {
            sb.append(" on ");
            w type = uVarX.getType();
            kotlin.jvm.internal.m.d(type, "getType(...)");
            sb.append(X(type));
        }
    }

    public final String X(w type) throws IOException {
        kotlin.jvm.internal.m.e(type, "type");
        StringBuilder sb = new StringBuilder();
        l lVar = this.a;
        Q(sb, (w) ((u00.k) lVar.y.a(l.Y[23], lVar)).invoke(type));
        return sb.toString();
    }

    public final String Y(List typeArguments) throws IOException {
        kotlin.jvm.internal.m.e(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o("<"));
        h00.q.Q0(typeArguments, sb, ", ", null, null, new g(this, 0), 60);
        sb.append(o(">"));
        return sb.toString();
    }

    public final String Z(m0 typeConstructor) {
        kotlin.jvm.internal.m.e(typeConstructor, "typeConstructor");
        j10.h klass = typeConstructor.g();
        if ((klass instanceof j10.r0) || (klass instanceof j10.e) || (klass instanceof q0)) {
            kotlin.jvm.internal.m.e(klass, "klass");
            return g30.l.f(klass) ? klass.f().toString() : p().a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof v ? ((v) typeConstructor).b(d.M) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override
    public final void a() {
        this.a.a();
    }

    public final void a0(j10.r0 r0Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(o("<"));
        }
        if (u()) {
            sb.append("/*");
            sb.append(r0Var.getIndex());
            sb.append("*/ ");
        }
        N(sb, r0Var.A(), "reified");
        String str = r0Var.F().A;
        boolean z2 = true;
        N(sb, str.length() > 0, str);
        y(sb, r0Var, null);
        P(r0Var, sb, z);
        int size = r0Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            w wVar = (w) r0Var.getUpperBounds().iterator().next();
            if (wVar == null) {
                g10.i.a(141);
                throw null;
            }
            if (!g10.i.y(wVar) || !wVar.t0()) {
                sb.append(" : ");
                sb.append(X(wVar));
            }
        } else if (z) {
            for (w wVar2 : r0Var.getUpperBounds()) {
                if (wVar2 == null) {
                    g10.i.a(141);
                    throw null;
                }
                if (!g10.i.y(wVar2) || !wVar2.t0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(X(wVar2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(o(">"));
        }
    }

    @Override
    public final void b() {
        this.a.b();
    }

    public final void b0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0((j10.r0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override
    public final void c() {
        this.a.c();
    }

    public final void c0(StringBuilder sb, List list, boolean z) {
        l lVar = this.a;
        if (((Boolean) lVar.w.a(l.Y[21], lVar)).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(o("<"));
        b0(sb, list);
        sb.append(o(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override
    public final void d(c cVar) {
        this.a.d(cVar);
    }

    public final void d0(u0 u0Var, StringBuilder sb, boolean z) {
        if (z || !(u0Var instanceof r0)) {
            sb.append(I(u0Var.W() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override
    public final void e(Set set) {
        kotlin.jvm.internal.m.e(set, "<set-?>");
        this.a.e(set);
    }

    public final void e0(r0 r0Var, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(I("value-parameter"));
            sb.append(" ");
        }
        if (u()) {
            sb.append("/*");
            sb.append(r0Var.G);
            sb.append("*/ ");
        }
        y(sb, r0Var, null);
        N(sb, r0Var.I, "crossinline");
        N(sb, r0Var.J, "noinline");
        l lVar = this.a;
        k kVar = lVar.r;
        a10.w[] wVarArr = l.Y;
        boolean z4 = false;
        if (((Boolean) kVar.a(wVarArr[16], lVar)).booleanValue()) {
            j10.b bVarA1 = r0Var.l();
            m10.i iVar = bVarA1 instanceof m10.i ? (m10.i) bVarA1 : null;
            if (iVar == null || !iVar.e0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            N(sb, ((Boolean) lVar.s.a(wVarArr[17], lVar)).booleanValue(), "actual");
        }
        w type = r0Var.getType();
        kotlin.jvm.internal.m.d(type, "getType(...)");
        w wVar = r0Var.K;
        w wVar2 = wVar == null ? type : wVar;
        N(sb, wVar != null, "vararg");
        if (z3 || (z2 && !r())) {
            d0(r0Var, sb, z3);
        }
        if (z) {
            P(r0Var, sb, z2);
            sb.append(": ");
        }
        sb.append(X(wVar2));
        H(r0Var, sb);
        if (u() && wVar != null) {
            sb.append(" /*");
            sb.append(X(type));
            sb.append("*/");
        }
        if (((u00.k) lVar.z.a(wVarArr[24], lVar)) != null) {
            if (lVar.n() ? r0Var.Z0() : u20.d.a(r0Var)) {
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder sb2 = new StringBuilder(" = ");
            u00.k kVar2 = (u00.k) lVar.z.a(wVarArr[24], lVar);
            kotlin.jvm.internal.m.b(kVar2);
            sb2.append((String) kVar2.invoke(r0Var));
            sb.append(sb2.toString());
        }
    }

    @Override
    public final void f(p pVar) {
        this.a.f(pVar);
    }

    public final void f0(StringBuilder builder, List list, boolean z) {
        boolean z2;
        l lVar = this.a;
        int iOrdinal = ((p) lVar.E.a(l.Y[29], lVar)).ordinal();
        if (iOrdinal == 0) {
            z2 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z) {
                z2 = true;
            }
            z2 = false;
        }
        int size = list.size();
        t().getClass();
        kotlin.jvm.internal.m.e(builder, "builder");
        builder.append("(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            r0 parameter = (r0) it.next();
            t().getClass();
            kotlin.jvm.internal.m.e(parameter, "parameter");
            e0(parameter, z2, builder, false);
            t().getClass();
            if (i != size - 1) {
                builder.append(", ");
            }
            i = i2;
        }
        t().getClass();
        builder.append(")");
    }

    @Override
    public final void g(LinkedHashSet linkedHashSet) {
        this.a.g(linkedHashSet);
    }

    public final boolean g0(j10.o oVar, StringBuilder sb) {
        if (!q().contains(i.VISIBILITY)) {
            return false;
        }
        l lVar = this.a;
        k kVar = lVar.n;
        a10.w[] wVarArr = l.Y;
        if (((Boolean) kVar.a(wVarArr[12], lVar)).booleanValue()) {
            oVar = j10.p.f(oVar.a.c());
        }
        if (!((Boolean) lVar.o.a(wVarArr[13], lVar)).booleanValue() && kotlin.jvm.internal.m.a(oVar, j10.p.j)) {
            return false;
        }
        sb.append(I(oVar.a.b()));
        sb.append(" ");
        return true;
    }

    @Override
    public final void h() {
        this.a.h();
    }

    public final void h0(StringBuilder sb, List list) throws IOException {
        l lVar = this.a;
        if (((Boolean) lVar.w.a(l.Y[21], lVar)).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j10.r0 r0Var = (j10.r0) it.next();
            List upperBounds = r0Var.getUpperBounds();
            kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
            for (w wVar : h00.q.H0(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                n20.e name = r0Var.getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                sb2.append(O(name, false));
                sb2.append(" : ");
                kotlin.jvm.internal.m.b(wVar);
                sb2.append(X(wVar));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(I("where"));
        sb.append(" ");
        h00.q.Q0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override
    public final void i() {
        this.a.i();
    }

    @Override
    public final void j() {
        this.a.j();
    }

    @Override
    public final Set k() {
        return this.a.k();
    }

    @Override
    public final void l() {
        s sVar = t.A;
        this.a.l();
    }

    @Override
    public final void m() {
        this.a.m();
    }

    public final String o(String str) {
        return s().a(str);
    }

    public final c p() {
        l lVar = this.a;
        return (c) lVar.b.a(l.Y[0], lVar);
    }

    public final Set q() {
        l lVar = this.a;
        return (Set) lVar.e.a(l.Y[3], lVar);
    }

    public final boolean r() {
        l lVar = this.a;
        return ((Boolean) lVar.f.a(l.Y[4], lVar)).booleanValue();
    }

    public final t s() {
        l lVar = this.a;
        return (t) lVar.D.a(l.Y[28], lVar);
    }

    public final e t() {
        l lVar = this.a;
        return (e) lVar.C.a(l.Y[27], lVar);
    }

    public final boolean u() {
        l lVar = this.a;
        return ((Boolean) lVar.j.a(l.Y[8], lVar)).booleanValue();
    }

    public final String w(j10.k declarationDescriptor) {
        j10.k kVarL;
        String str;
        kotlin.jvm.internal.m.e(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.G(new o9.q(this, 6), sb);
        l lVar = this.a;
        k kVar = lVar.c;
        a10.w[] wVarArr = l.Y;
        if (((Boolean) kVar.a(wVarArr[1], lVar)).booleanValue() && !(declarationDescriptor instanceof e0) && !(declarationDescriptor instanceof i0) && (kVarL = declarationDescriptor.l()) != null && !(kVarL instanceof z)) {
            sb.append(" ");
            int iOrdinal = s().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            n20.d dVarF = q20.d.f(kVarL);
            kotlin.jvm.internal.m.d(dVarF, "getFqName(...)");
            sb.append(dVarF.c() ? "root package" : o(va.a.f0(n20.d.f(dVarF))));
            if (((Boolean) lVar.d.a(wVarArr[2], lVar)).booleanValue() && (kVarL instanceof e0) && (declarationDescriptor instanceof j10.l)) {
                ((j10.l) declarationDescriptor).o().getClass();
            }
        }
        return sb.toString();
    }

    public final String x(k10.b annotation, k10.d dVar) throws IOException {
        m10.i iVarJ;
        List listO;
        l lVar = this.a;
        k kVar = lVar.N;
        kotlin.jvm.internal.m.e(annotation, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (dVar != null) {
            sb.append(dVar.A + ':');
        }
        w type = annotation.getType();
        sb.append(X(type));
        a10.w[] wVarArr = l.Y;
        if (((a) kVar.a(wVarArr[38], lVar)).A) {
            Map mapB = annotation.b();
            List list = null;
            j10.e eVarD = ((Boolean) lVar.I.a(wVarArr[33], lVar)).booleanValue() ? u20.d.d(annotation) : null;
            if (eVarD != null && (iVarJ = eVarD.J()) != null && (listO = iVarJ.O()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listO) {
                    if (((r0) obj).Z0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((r0) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = h00.x.A;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapB.containsKey((n20.e) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(h00.r.q0(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((n20.e) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapB.entrySet();
            ArrayList arrayList5 = new ArrayList(h00.r.q0(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                n20.e eVar = (n20.e) entry.getKey();
                s20.g gVar = (s20.g) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eVar.b());
                sb2.append(" = ");
                sb2.append(!list.contains(eVar) ? B(gVar) : "...");
                arrayList5.add(sb2.toString());
            }
            List listH1 = h00.q.h1(h00.q.Y0(arrayList5, arrayList4));
            if (((a) kVar.a(l.Y[38], lVar)).B || !listH1.isEmpty()) {
                h00.q.Q0(listH1, sb, ", ", "(", ")", null, 112);
            }
        }
        if (u() && (e30.c.k(type) || (type.m0().g() instanceof d0))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void y(StringBuilder sb, k10.a aVar, k10.d dVar) {
        if (q().contains(i.ANNOTATIONS)) {
            boolean z = aVar instanceof w;
            l lVar = this.a;
            Set setK = z ? lVar.k() : (Set) lVar.K.a(l.Y[35], lVar);
            u00.k kVar = (u00.k) lVar.M.a(l.Y[37], lVar);
            for (k10.b bVar : aVar.getAnnotations()) {
                if (!h00.q.F0(setK, bVar.a()) && !kotlin.jvm.internal.m.a(bVar.a(), g10.o.r) && (kVar == null || ((Boolean) kVar.invoke(bVar)).booleanValue())) {
                    sb.append(x(bVar, dVar));
                    if (((Boolean) lVar.J.a(l.Y[34], lVar)).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }
}
