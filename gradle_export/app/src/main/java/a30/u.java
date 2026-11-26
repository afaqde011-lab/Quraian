package a30;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import i20.c1;
import i20.i1;
import i20.j0;
import i20.u0;
import j10.n0;
import j10.o0;
import java.util.ArrayList;
import java.util.List;
import l9.f0;
import m10.k0;
import m10.r0;

public final class u {
    public final k a;
    public final f0 b;

    public u(k kVar) {
        this.a = kVar;
        i iVar = (i) kVar.a;
        this.b = new f0(iVar.b, iVar.l);
    }

    public final x a(j10.k kVar) {
        if (kVar instanceof j10.e0) {
            n20.c cVar = ((m10.c0) ((j10.e0) kVar)).F;
            k kVar2 = this.a;
            return new w(cVar, (k20.g) kVar2.b, (h9.f) kVar2.d, (c30.k) kVar2.g);
        }
        if (kVar instanceof c30.i) {
            return ((c30.i) kVar).U;
        }
        return null;
    }

    public final ArrayList b(List list, List list2, o20.l lVar, int i) {
        u uVar = this;
        k kVar = uVar.a;
        j10.k kVar2 = (j10.k) kVar.c;
        kotlin.jvm.internal.m.c(kVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        j10.b bVar = (j10.b) kVar2;
        j10.k kVarL = bVar.l();
        kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
        x xVarA = uVar.a(kVarL);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                va.a.k0();
                throw null;
            }
            u0 u0Var = (u0) obj;
            c1 c1Var = (c1) h00.q.O0(i2, list2);
            m10.u uVarE = q20.k.e(bVar, ((ui.b) kVar.h).F(u0Var), null, (xVarA == null || !k20.e.c.e((c1Var == null || (c1Var.C & 1) != 1) ? 0 : c1Var.D).booleanValue()) ? k10.g.a : new c30.w(((i) kVar.a).a, new t(uVar, xVarA, lVar, i, i2, c1Var, 1)), i2);
            if (uVarE != null) {
                arrayList.add(uVarE);
            }
            uVar = this;
            i2 = i3;
        }
        return arrayList;
    }

    public final k10.h c(o20.l lVar, int i, int i2) {
        return !k20.e.c.e(i).booleanValue() ? k10.g.a : new c30.w(((i) this.a.a).a, new r(this, lVar, i2, 0));
    }

    public final k10.h d(j0 j0Var, boolean z) {
        return !k20.e.c.e(j0Var.D).booleanValue() ? k10.g.a : new c30.w(((i) this.a.a).a, new s(this, z, j0Var));
    }

    public final c30.c e(i20.n nVar, boolean z) {
        k kVar = this.a;
        j10.k kVar2 = (j10.k) kVar.c;
        kotlin.jvm.internal.m.c(kVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        j10.e eVar = (j10.e) kVar2;
        c30.c cVar = new c30.c(eVar, null, c(nVar, nVar.D, 1), z, 1, nVar, (k20.g) kVar.b, (h9.f) kVar.d, (k20.j) kVar.e, (c30.k) kVar.g, null);
        u uVar = (u) kVar.a(cVar, h00.x.A, (k20.g) kVar.b, (h9.f) kVar.d, (k20.j) kVar.e, (k20.a) kVar.f).i;
        List list = nVar.E;
        kotlin.jvm.internal.m.d(list, "getValueParameterList(...)");
        cVar.m1(uVar.h(list, nVar, 1), g4.A((i1) k20.e.d.e(nVar.D)));
        cVar.i1(eVar.n());
        cVar.S = eVar.E();
        cVar.W = !k20.e.o.e(nVar.D).booleanValue();
        return cVar;
    }

    public final c30.t f(i20.b0 proto) {
        int i;
        e30.w wVarF;
        k kVar = this.a;
        k20.g gVar = (k20.g) kVar.b;
        h9.f fVar = (h9.f) kVar.d;
        kotlin.jvm.internal.m.e(proto, "proto");
        int i2 = 1;
        if ((proto.C & 1) == 1) {
            i = proto.D;
        } else {
            int i3 = proto.E;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i;
        k10.h hVarC = c(proto, i4, 1);
        int i5 = proto.C;
        k10.h aVar = ((i5 & 32) == 32 || (i5 & 64) == 64) ? new c30.a(((i) kVar.a).a, new r(this, proto, i2, 1)) : k10.g.a;
        c30.t tVar = new c30.t((j10.k) kVar.c, null, hVarC, z3.A(gVar, proto.F), g4.V((i20.c0) k20.e.p.e(i4)), proto, (k20.g) kVar.b, fVar, u20.d.g((j10.k) kVar.c).a(z3.A(gVar, proto.F)).equals(a0.a) ? k20.j.b : (k20.j) kVar.e, (c30.k) kVar.g, null);
        List list = proto.I;
        kotlin.jvm.internal.m.d(list, "getTypeParameterList(...)");
        k kVarA = kVar.a(tVar, list, (k20.g) kVar.b, (h9.f) kVar.d, (k20.j) kVar.e, (k20.a) kVar.f);
        u uVar = (u) kVarA.i;
        ui.b bVar = (ui.b) kVarA.h;
        u0 u0VarB0 = w50.c.b0(proto, fVar);
        m10.u uVarK = (u0VarB0 == null || (wVarF = bVar.F(u0VarB0)) == null) ? null : q20.k.k(tVar, wVarF, aVar);
        j10.k kVar2 = (j10.k) kVar.c;
        j10.e eVar = kVar2 instanceof j10.e ? (j10.e) kVar2 : null;
        m10.u uVarX0 = eVar != null ? eVar.x0() : null;
        List listU = w50.c.u(proto, fVar);
        List list2 = proto.O;
        kotlin.jvm.internal.m.d(list2, "getContextParameterList(...)");
        ArrayList arrayListB = uVar.b(listU, list2, proto, 1);
        List listO = bVar.o();
        List list3 = proto.P;
        kotlin.jvm.internal.m.d(list3, "getValueParameterList(...)");
        tVar.m1(uVarK, uVarX0, arrayListB, listO, uVar.h(list3, proto, 1), bVar.F(w50.c.e0(proto, fVar)), j.e((i20.d0) k20.e.e.e(i4)), g4.A((i1) k20.e.d.e(i4)), h00.y.A);
        tVar.N = k20.e.q.e(i4).booleanValue();
        tVar.O = k20.e.r.e(i4).booleanValue();
        tVar.P = k20.e.u.e(i4).booleanValue();
        tVar.Q = k20.e.s.e(i4).booleanValue();
        tVar.R = k20.e.t.e(i4).booleanValue();
        tVar.V = k20.e.v.e(i4).booleanValue();
        tVar.S = k20.e.w.e(i4).booleanValue();
        tVar.W = !k20.e.x.e(i4).booleanValue();
        ((i) kVar.a).m.getClass();
        return tVar;
    }

    public final c30.s g(j0 proto, boolean z) {
        int i;
        k10.h hVarC;
        u uVar;
        k10.h aVar;
        boolean z2;
        m10.j0 j0VarF;
        c30.s sVar;
        d30.h hVar;
        k0 k0VarG;
        e30.w wVarF;
        k kVar = this.a;
        k20.g gVar = (k20.g) kVar.b;
        h9.f fVar = (h9.f) kVar.d;
        kotlin.jvm.internal.m.e(proto, "proto");
        if ((proto.C & 1) == 1) {
            i = proto.D;
        } else {
            int i2 = proto.E;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        k10.f fVar2 = k10.g.a;
        if (z) {
            List<i20.h> list = proto.U;
            kotlin.jvm.internal.m.d(list, "getAnnotationList(...)");
            ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
            for (i20.h hVar2 : list) {
                kotlin.jvm.internal.m.b(hVar2);
                arrayList.add(this.b.f(hVar2, gVar));
            }
            hVarC = arrayList.isEmpty() ? fVar2 : new k10.i(0, arrayList);
        } else {
            hVarC = null;
        }
        j10.k kVar2 = (j10.k) kVar.c;
        if (hVarC == null) {
            hVarC = c(proto, i, 2);
        }
        k20.c cVar = k20.e.e;
        j10.y yVarE = j.e((i20.d0) cVar.e(i));
        k20.c cVar2 = k20.e.d;
        int i3 = i;
        c30.s sVar2 = new c30.s(kVar2, null, hVarC, yVarE, g4.A((i1) cVar2.e(i)), k20.e.y.e(i).booleanValue(), z3.A(gVar, proto.F), g4.V((i20.c0) k20.e.p.e(i)), k20.e.C.e(i).booleanValue(), k20.e.B.e(i).booleanValue(), k20.e.E.e(i).booleanValue(), k20.e.F.e(i).booleanValue(), k20.e.G.e(i).booleanValue(), proto, (k20.g) kVar.b, fVar, (k20.j) kVar.e, (c30.k) kVar.g);
        List list2 = proto.I;
        kotlin.jvm.internal.m.d(list2, "getTypeParameterList(...)");
        k kVarA = kVar.a(sVar2, list2, (k20.g) kVar.b, (h9.f) kVar.d, (k20.j) kVar.e, (k20.a) kVar.f);
        ui.b bVar = (ui.b) kVarA.h;
        boolean zBooleanValue = k20.e.z.e(i3).booleanValue();
        int i4 = 3;
        if (zBooleanValue) {
            int i5 = proto.C;
            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                uVar = this;
                aVar = new c30.a(((i) kVar.a).a, new r(uVar, proto, i4, 1));
            } else {
                uVar = this;
                aVar = fVar2;
            }
        } else {
            uVar = this;
            aVar = fVar2;
        }
        e30.w wVarF2 = bVar.F(w50.c.f0(proto, fVar));
        List listO = bVar.o();
        j10.k kVar3 = (j10.k) kVar.c;
        j10.e eVar = kVar3 instanceof j10.e ? (j10.e) kVar3 : null;
        m10.u uVarX0 = eVar != null ? eVar.x0() : null;
        u0 u0VarC0 = w50.c.c0(proto, fVar);
        m10.u uVarK = (u0VarC0 == null || (wVarF = bVar.F(u0VarC0)) == null) ? null : q20.k.k(sVar2, wVarF, aVar);
        u uVar2 = (u) kVarA.i;
        List listV = w50.c.v(proto, fVar);
        List list3 = proto.O;
        kotlin.jvm.internal.m.d(list3, "getContextParameterList(...)");
        sVar2.f1(wVarF2, listO, uVarX0, uVarK, uVar2.b(listV, list3, proto, 3));
        int iB = k20.e.b(k20.e.c.e(i3).booleanValue(), (i1) cVar2.e(i3), (i20.d0) cVar.e(i3));
        o0 o0Var = n0.n;
        if (zBooleanValue) {
            int i6 = (proto.C & 256) == 256 ? proto.Q : iB;
            boolean zBooleanValue2 = k20.e.K.e(i6).booleanValue();
            boolean zBooleanValue3 = k20.e.L.e(i6).booleanValue();
            boolean zBooleanValue4 = k20.e.M.e(i6).booleanValue();
            k10.h hVarC2 = uVar.c(proto, i6, 3);
            if (zBooleanValue2) {
                j10.y yVarE2 = j.e((i20.d0) cVar.e(i6));
                j10.o oVarA = g4.A((i1) cVar2.e(i6));
                z2 = true;
                j0VarF = new m10.j0(sVar2, hVarC2, yVarE2, oVarA, !zBooleanValue2, zBooleanValue3, zBooleanValue4, sVar2.getKind(), null, o0Var);
            } else {
                z2 = true;
                j0VarF = q20.k.f(sVar2, hVarC2);
            }
            j0VarF.b1(sVar2.getReturnType());
        } else {
            z2 = true;
            j0VarF = null;
        }
        if (k20.e.A.e(i3).booleanValue()) {
            if ((proto.C & 512) == 512) {
                iB = proto.R;
            }
            boolean zBooleanValue5 = k20.e.K.e(iB).booleanValue();
            boolean zBooleanValue6 = k20.e.L.e(iB).booleanValue();
            boolean zBooleanValue7 = k20.e.M.e(iB).booleanValue();
            k10.h hVarC3 = uVar.c(proto, iB, 4);
            if (zBooleanValue5) {
                k0 k0Var = new k0(sVar2, hVarC3, j.e((i20.d0) cVar.e(iB)), g4.A((i1) cVar2.e(iB)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, sVar2.getKind(), null, o0Var);
                sVar = sVar2;
                r0 r0Var = (r0) h00.q.d1(((u) kVarA.a(k0Var, h00.x.A, (k20.g) kVarA.b, (h9.f) kVarA.d, (k20.j) kVarA.e, (k20.a) kVarA.f).i).h(va.a.R(proto.P), proto, 4));
                if (r0Var == null) {
                    k0.y0(6);
                    throw null;
                }
                k0Var.N = r0Var;
                k0VarG = k0Var;
                hVar = null;
            } else {
                sVar = sVar2;
                hVar = null;
                k0VarG = q20.k.g(sVar, hVarC3);
            }
        } else {
            sVar = sVar2;
            hVar = null;
            k0VarG = null;
        }
        if (k20.e.D.e(i3).booleanValue()) {
            sVar.d1(hVar, new q(uVar, proto, sVar, 0));
        }
        j10.k kVar4 = (j10.k) kVar.c;
        ?? r0 = kVar4 instanceof j10.e ? (j10.e) kVar4 : hVar;
        if ((r0 != 0 ? r0.getKind() : hVar) == j10.f.E) {
            sVar.d1(hVar, new q(uVar, proto, sVar, 1));
        }
        sVar.c1(j0VarF, k0VarG, new m10.r(uVar.d(proto, false)), new m10.r(uVar.d(proto, z2)));
        return sVar;
    }

    public final List h(List list, o20.l lVar, int i) {
        int i2;
        e30.w wVar;
        k10.h wVar2;
        u uVar = this;
        k kVar = uVar.a;
        h9.f fVar = (h9.f) kVar.d;
        ui.b bVar = (ui.b) kVar.h;
        j10.k kVar2 = (j10.k) kVar.c;
        kotlin.jvm.internal.m.c(kVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        j10.b bVar2 = (j10.b) kVar2;
        j10.k kVarL = bVar2.l();
        kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
        x xVarA = uVar.a(kVarL);
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                va.a.k0();
                throw null;
            }
            c1 c1Var = (c1) obj;
            int i5 = (c1Var.C & 1) == 1 ? c1Var.D : 0;
            if (xVarA == null || !k20.e.c.e(i5).booleanValue()) {
                i2 = i3;
                wVar = null;
                wVar2 = k10.g.a;
            } else {
                i2 = i3;
                wVar = null;
                wVar2 = new c30.w(((i) kVar.a).a, new t(uVar, xVarA, lVar, i, i2, c1Var, 0));
            }
            n20.e eVarA = z3.A((k20.g) kVar.b, c1Var.E);
            e30.w wVarF = bVar.F(w50.c.k0(c1Var, fVar));
            boolean zBooleanValue = k20.e.H.e(i5).booleanValue();
            boolean zBooleanValue2 = k20.e.I.e(i5).booleanValue();
            boolean zBooleanValue3 = k20.e.J.e(i5).booleanValue();
            u0 u0VarN0 = w50.c.n0(c1Var, fVar);
            e30.w wVarF2 = u0VarN0 != null ? bVar.F(u0VarN0) : wVar;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new r0(bVar2, null, i2, wVar2, eVarA, wVarF, zBooleanValue, zBooleanValue2, zBooleanValue3, wVarF2, n0.n));
            arrayList = arrayList2;
            i3 = i4;
            uVar = this;
        }
        return h00.q.n1(arrayList);
    }
}
