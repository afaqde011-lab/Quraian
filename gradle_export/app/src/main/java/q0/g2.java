package q0;

import c3.w2;
import com.google.android.gms.cast.Cast;
import java.util.ArrayList;
import java.util.List;

public final class g2 {

    public final l1.i1 f12616a = l1.q.z(null);

    public m3.h f12617b;

    public final z1.p f12618c;

    public g2(m3.h hVar) {
        pp.d dVar = new pp.d(13);
        hVar.getClass();
        m3.e eVar = new m3.e(hVar);
        ArrayList arrayList = eVar.C;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            List list = (List) dVar.invoke(((m3.d) arrayList.get(i10)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                m3.f fVar = (m3.f) list.get(i11);
                arrayList3.add(new m3.d(fVar.f10424b, fVar.f10425c, fVar.f10423a, fVar.f10426d));
            }
            h00.v.u0(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f12617b = eVar.f();
        this.f12618c = new z1.p();
    }

    public static m3.f c(m3.f fVar, m3.n0 n0Var) {
        m3.q qVar = n0Var.f10497b;
        int iC = qVar.c(qVar.f10515f - 1, false);
        if (fVar.f10424b < iC) {
            return m3.f.a(fVar, null, 0, Math.min(fVar.f10425c, iC), 11);
        }
        return null;
    }

    public final void a(l1.j jVar, int i10) {
        boolean z10;
        boolean z11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1154651354);
        char c10 = 2;
        int i11 = (g0Var.i(this) ? 4 : 2) | i10;
        boolean z12 = false;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            w2 w2Var = (w2) g0Var.k(c3.o1.f2743s);
            m3.h hVar = this.f12617b;
            List listA = hVar.a(hVar.B.length());
            int size = listA.size();
            int i12 = 0;
            while (i12 < size) {
                m3.f fVar = (m3.f) listA.get(i12);
                int i13 = fVar.f10424b;
                Object obj = fVar.f10423a;
                if (i13 != fVar.f10425c) {
                    g0Var.c0(725478935);
                    Object objN = g0Var.N();
                    l1.c cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = w.c.g(g0Var);
                    }
                    f0.i iVar = (f0.i) objN;
                    b2.r rVarP = i2.b0.p(b2.o.A, new mu.q(this, fVar, 9));
                    Object objN2 = g0Var.N();
                    if (objN2 == cVar) {
                        z11 = true;
                        objN2 = new pp.d(14);
                        g0Var.n0(objN2);
                    } else {
                        z11 = true;
                    }
                    b2.r rVarK = z.n.k(j3.q.c(rVarP, z12, (u00.k) objN2).V(new h2(new ak.a(this, fVar, 27))), iVar);
                    v2.p.f15394a.getClass();
                    b2.r rVarG = v2.r.g(rVarK, v2.r.f15397c);
                    boolean zI = g0Var.i(this) | g0Var.g(fVar) | g0Var.i(w2Var);
                    Object objN3 = g0Var.N();
                    if (zI || objN3 == cVar) {
                        objN3 = new l6.c(this, fVar, w2Var);
                        g0Var.n0(objN3);
                    }
                    h0.o.a(androidx.compose.foundation.b.d(rVarG, iVar, (u00.a) objN3), g0Var, 0);
                    m3.o oVar = (m3.o) obj;
                    m3.o0 o0VarB = oVar.b();
                    if (o0VarB == null || (o0VarB.f10502a == null && o0VarB.f10503b == null && o0VarB.f10504c == null && o0VarB.f10505d == null)) {
                        z10 = false;
                        g0Var.c0(728331710);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(726303039);
                        Object objN4 = g0Var.N();
                        if (objN4 == cVar) {
                            objN4 = new k1(iVar);
                            g0Var.n0(objN4);
                        }
                        k1 k1Var = (k1) objN4;
                        Object objN5 = g0Var.N();
                        m3.i0 i0Var = null;
                        if (objN5 == cVar) {
                            objN5 = new l6.d(k1Var, i0Var, 10);
                            g0Var.n0(objN5);
                        }
                        l1.q.i(g00.b0.a, g0Var, (u00.n) objN5);
                        l1.f1 f1Var = k1Var.f12664b;
                        l1.f1 f1Var2 = k1Var.f12664b;
                        Boolean boolValueOf = Boolean.valueOf((f1Var.h() & 2) != 0 ? z11 : false);
                        Boolean boolValueOf2 = Boolean.valueOf((f1Var2.h() & 1) != 0 ? z11 : false);
                        Boolean boolValueOf3 = Boolean.valueOf((f1Var2.h() & 4) != 0 ? z11 : false);
                        m3.o0 o0VarB2 = oVar.b();
                        m3.i0 i0Var2 = o0VarB2 != null ? o0VarB2.f10502a : null;
                        m3.o0 o0VarB3 = oVar.b();
                        m3.i0 i0Var3 = o0VarB3 != null ? o0VarB3.f10503b : null;
                        m3.o0 o0VarB4 = oVar.b();
                        m3.i0 i0Var4 = o0VarB4 != null ? o0VarB4.f10504c : null;
                        m3.o0 o0VarB5 = oVar.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, i0Var2, i0Var3, i0Var4, o0VarB5 != null ? o0VarB5.f10505d : null};
                        boolean zI2 = g0Var.i(this) | g0Var.g(fVar);
                        Object objN6 = g0Var.N();
                        if (zI2 || objN6 == cVar) {
                            objN6 = new mu.q(this, fVar, k1Var);
                            g0Var.n0(objN6);
                        }
                        b(objArr, (u00.k) objN6, g0Var, (i11 << 6) & 896);
                        z10 = false;
                        g0Var.r(false);
                    }
                    g0Var.r(z10);
                } else {
                    z10 = z12;
                    g0Var.c0(728345598);
                    g0Var.r(z10);
                }
                i12++;
                z12 = z10;
                c10 = c10;
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new m3.a(this, i10, 11);
        }
    }

    public final void b(Object[] objArr, u00.k kVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-2083052099);
        int i11 = (i10 & 48) == 0 ? (g0Var.i(kVar) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(this) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        g0Var.Z(-358306546, Integer.valueOf(objArr.length));
        int i12 = i11 | (g0Var.e(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i12 |= g0Var.i(obj) ? 4 : 0;
        }
        g0Var.r(false);
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if (g0Var.S(i12 & 1, (i12 & 147) != 146)) {
            db.g gVar = new db.g(2);
            ArrayList arrayList = gVar.B;
            gVar.a(kVar);
            gVar.f(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zI = g0Var.i(this) | ((i12 & 112) == 32);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new g0(this, kVar, 1);
                g0Var.n0(objN);
            }
            l1.q.f(array, (u00.k) objN, g0Var);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(i10, 19, this, objArr, kVar);
        }
    }
}
