package j3;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import b3.j2;
import b3.l0;
import b3.p1;
import java.util.List;
import u.i0;
import z2.d0;

public abstract class v {

    public static final h2.c f7977a = new h2.c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final s a(l0 l0Var, boolean z10) {
        b2.q qVar = (b2.q) l0Var.f2059g0.G;
        b3.k kVar = null;
        if ((qVar.D & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.C & 8) == 0) {
                    if ((qVar.D & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.F;
                } else {
                    b2.q qVarE = qVar;
                    m1.e eVar = null;
                    while (qVarE != null) {
                        if (qVarE instanceof j2) {
                            kVar = qVarE;
                            break loop0;
                        }
                        if ((qVarE.C & 8) != 0 && (qVarE instanceof b3.l)) {
                            int i10 = 0;
                            for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                if ((qVar2.C & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        qVarE = qVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new m1.e(0, new b2.q[16]);
                                        }
                                        if (qVarE != null) {
                                            eVar.b(qVarE);
                                            qVarE = null;
                                        }
                                        eVar.b(qVar2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        qVarE = b3.m.e(eVar);
                    }
                    if ((qVar.D & 8) != 0) {
                        break;
                    }
                    qVar = qVar.F;
                }
            }
        }
        kotlin.jvm.internal.m.b(kVar);
        b2.q qVar3 = ((b2.q) ((j2) kVar)).A;
        o oVarZ = l0Var.z();
        if (oVarZ == null) {
            oVarZ = new o();
        }
        return new s(qVar3, z10, l0Var, oVarZ);
    }

    public static final u.w b(u uVar, u00.k kVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            s sVarA = uVar.a();
            l0 l0Var = sVarA.f7967c;
            if (l0Var.K() && l0Var.J()) {
                h2.c cVarG = sVarA.g();
                u.w wVar = new u.w(48);
                gi.c cVar = new gi.c(9);
                cVar.v(k00.f.Q(cVarG));
                e(new gi.c(9), cVar, sVarA, sVarA, wVar, kVar);
                return wVar;
            }
            u.w wVar2 = u.m.f14876a;
            kotlin.jvm.internal.m.c(wVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return wVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(gi.c cVar, gi.c cVar2, s sVar, s sVar2, u.w wVar, u00.k kVar) {
        gi.c cVar3 = cVar;
        Region region = (Region) cVar3.B;
        gi.c cVar4 = cVar2;
        Region region2 = (Region) cVar4.B;
        l0 l0Var = sVar2.f7967c;
        l0 l0Var2 = sVar2.f7967c;
        if (!l0Var.K() || !l0Var2.J() || region2.isEmpty()) {
            if (sVar2.o()) {
                d(wVar, sVar, sVar2);
                return;
            }
            return;
        }
        h2.c cVarM = sVar2.m();
        if (cVarM.g()) {
            b3.k kVarF = sVar2.f();
            if (kVarF == null) {
                b3.u uVar = (b3.u) l0Var2.f2059g0.D;
                cVarM = d0.i(uVar).F(uVar, false);
            } else {
                b2.q qVar = ((b2.q) kVarF).A;
                Object objG = sVar2.f7968d.A.g(n.f7941b);
                if (objG == null) {
                    objG = null;
                }
                cVarM = b3.m.i(qVar, objG != null, false);
            }
        }
        y3.k kVarQ = k00.f.Q(cVarM);
        cVar3.v(kVarQ);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i10 = sVar2.f7970f;
            if (i10 == sVar.f7970f) {
                i10 = -1;
            }
            Rect bounds = region.getBounds();
            wVar.i(i10, new t(sVar2, new y3.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listJ = s.j(4, sVar2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) kVar.invoke(listJ.get(size))).booleanValue()) {
                    c(cVar3, cVar4, sVar, (s) listJ.get(size), wVar, kVar);
                }
                size--;
                cVar3 = cVar;
                cVar4 = cVar2;
            }
            if (h(sVar2)) {
                region2.op(kVarQ.f16592a, kVarQ.f16593b, kVarQ.f16594c, kVarQ.f16595d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void d(u.w wVar, s sVar, s sVar2) {
        l0 l0Var;
        s sVarL = sVar2.l();
        h2.c cVarG = (sVarL == null || (l0Var = sVarL.f7967c) == null || !l0Var.K()) ? f7977a : sVarL.g();
        int i10 = sVar2.f7970f;
        if (i10 == sVar.f7970f) {
            i10 = -1;
        }
        wVar.i(i10, new t(sVar2, k00.f.Q(cVarG)));
    }

    public static final void e(gi.c cVar, gi.c cVar2, s sVar, s sVar2, u.w wVar, u00.k kVar) {
        boolean z10;
        h2.c cVarI;
        boolean z11;
        u.w wVar2 = wVar;
        u00.k kVar2 = kVar;
        int i10 = sVar.f7970f;
        Region region = (Region) cVar.B;
        gi.c cVar3 = cVar2;
        Region region2 = (Region) cVar3.B;
        l0 l0Var = sVar2.f7967c;
        o oVar = sVar2.f7968d;
        l0 l0Var2 = sVar2.f7967c;
        int i11 = sVar2.f7970f;
        boolean z12 = (l0Var.K() && l0Var2.J()) ? false : true;
        if (!region2.isEmpty() || i11 == i10) {
            if (!z12 || sVar2.o()) {
                y3.k kVarQ = k00.f.Q(sVar2.m());
                cVar.v(kVarQ);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (sVar2.o()) {
                        d(wVar2, sVar, sVar2);
                        return;
                    } else {
                        if (i11 == -1) {
                            Rect bounds = region.getBounds();
                            wVar2.i(i11, new t(sVar2, new y3.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                wVar2.i(i11, new t(sVar2, new y3.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = s.j(4, sVar2);
                if (oVar.C) {
                    s sVarL = sVar2.l();
                    while (true) {
                        if (sVarL == null) {
                            sVarL = null;
                            break;
                        }
                        i0 i0Var = sVarL.f7968d.A;
                        if (i0Var.c(w.f7998w) || i0Var.c(w.f7997v)) {
                            break;
                        } else {
                            sVarL = sVarL.l();
                        }
                    }
                    if (sVarL == null) {
                        z11 = false;
                    } else {
                        p1 p1VarD = sVar2.d();
                        if (p1VarD == null) {
                            p1VarD = null;
                        } else {
                            if (!p1VarD.z1().N) {
                                p1VarD = null;
                            }
                            if (p1VarD == null) {
                                p1VarD = null;
                            }
                        }
                        p1 p1VarD2 = sVarL.d();
                        if (p1VarD2 == null) {
                            p1VarD2 = null;
                        } else {
                            if (!p1VarD2.z1().N) {
                                p1VarD2 = null;
                            }
                            if (p1VarD2 == null) {
                                p1VarD2 = null;
                            }
                        }
                        if (p1VarD == null || p1VarD2 == null) {
                            z11 = false;
                        } else {
                            h2.c cVarF = p1VarD2.F(p1VarD, false);
                            z11 = !cVarF.equals(cVarF.f(bi.b.g(0L, kh.n.m0(p1VarD2.C))));
                        }
                    }
                    if (z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    gi.c cVar4 = new gi.c(9);
                    b3.k kVarF = sVar2.f();
                    if (kVarF == null) {
                        b3.u uVar = (b3.u) l0Var2.f2059g0.D;
                        cVarI = d0.i(uVar).F(uVar, false);
                    } else {
                        b2.q qVar = ((b2.q) kVarF).A;
                        Object objG = oVar.A.g(n.f7941b);
                        cVarI = b3.m.i(qVar, (objG == null ? null : objG) != null, false);
                    }
                    cVar4.v(k00.f.Q(cVarI));
                    int size = listJ.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) kVar2.invoke(listJ.get(size))).booleanValue()) {
                            c(new gi.c(9), cVar4, sVar, (s) listJ.get(size), wVar2, kVar2);
                        }
                        size--;
                        wVar2 = wVar;
                    }
                } else {
                    int size2 = listJ.size() - 1;
                    while (-1 < size2) {
                        if (!((Boolean) kVar2.invoke(listJ.get(size2))).booleanValue()) {
                            e(cVar, cVar3, sVar, (s) listJ.get(size2), wVar, kVar2);
                        }
                        size2--;
                        cVar3 = cVar2;
                        kVar2 = kVar;
                    }
                }
                if (h(sVar2)) {
                    region2.op(kVarQ.f16592a, kVarQ.f16593b, kVarQ.f16594c, kVarQ.f16595d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object f(o oVar, z zVar) {
        Object objG = oVar.A.g(zVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean g(s sVar) {
        p1 p1VarD = sVar.d();
        o oVar = sVar.f7968d;
        if (p1VarD != null ? p1VarD.H1() : false) {
            return true;
        }
        z zVar = w.f7978a;
        if (oVar.A.c(w.f7992q)) {
            return true;
        }
        return oVar.A.c(w.f7991p);
    }

    public static final boolean h(s sVar) {
        if (!g(sVar)) {
            o oVar = sVar.f7968d;
            if (oVar.C) {
                return true;
            }
            i0 i0Var = oVar.A;
            Object[] objArr = i0Var.f14857b;
            Object[] objArr2 = i0Var.f14858c;
            long[] jArr = i0Var.f14856a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j9) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr[i13];
                                Object obj2 = objArr2[i13];
                                if (((z) obj).f8007c) {
                                    return true;
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i11 == 8) {
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    } else if (i10 != length) {
                        i10++;
                    }
                }
            }
        }
        return false;
    }
}
