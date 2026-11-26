package a1;

import android.view.KeyEvent;
import androidx.work.impl.WorkerStoppedException;
import com.google.protobuf.RuntimeVersion;
import g1.j7;
import g1.k8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

public final class v2 implements u00.k, x40.f {
    public final int A;
    public final Object B;
    public final Object C;

    public v2(e00.m mVar, d00.r0 r0Var, e00.w wVar) {
        this.A = 10;
        this.B = mVar;
        this.C = r0Var;
    }

    public v2(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public void f(x40.b0 b0Var) {
        ((a40.k) this.C).resumeWith(b0Var);
    }

    public void h(b50.j jVar, IOException iOException) {
        if (jVar.M) {
            return;
        }
        ((a40.k) this.C).resumeWith(ri.t1.s(iOException));
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        me.i iVarC;
        String str;
        Class clsF;
        o10.c cVarU;
        j10.h hVarG;
        f20.e eVar;
        boolean z10 = true;
        switch (this.A) {
            case 0:
                ((w2) this.B).f135a.f16999g.j((m) this.C);
                return g00.b0.a;
            case 1:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof WorkerStoppedException) {
                    ((za.u) this.B).f17399d.compareAndSet(-256, ((WorkerStoppedException) th2).A);
                }
                ((kh.v) this.C).cancel(false);
                return g00.b0.a;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                return ((a40.t) this.B).invoke(Integer.valueOf(iIntValue), ((List) this.C).get(iIntValue));
            case 3:
                return ((s0) this.B).invoke(((ArrayList) this.C).get(((Number) obj).intValue()));
            case 4:
                b20.n nVar = (b20.n) this.B;
                oj.q qVar = (oj.q) this.C;
                n20.e eVar2 = (n20.e) obj;
                kotlin.jvm.internal.m.e(eVar2, "name");
                d30.i iVar = nVar.r;
                j10.e eVar3 = nVar.n;
                if (((Set) iVar.invoke()).contains(eVar2)) {
                    o10.b bVar = ((a20.b) qVar.B).b;
                    n20.b bVarF = u20.d.f(eVar3);
                    kotlin.jvm.internal.m.b(bVarF);
                    n20.b bVarD = bVarF.d(eVar2);
                    bVar.getClass();
                    n20.c cVar = bVarD.a;
                    String strU0 = r30.r.u0(bVarD.b.a.a, '.', '$');
                    if (!cVar.a.c()) {
                        strU0 = cVar.a.a + '.' + strU0;
                    }
                    Class clsF2 = f50.k.F((ClassLoader) bVar.B, strU0);
                    p10.o oVar = clsF2 != null ? new p10.o(clsF2) : null;
                    if (oVar == null) {
                        return null;
                    }
                    b20.i iVar2 = new b20.i(qVar, eVar3, oVar, (j10.e) null);
                    ((a20.b) qVar.B).s.getClass();
                    return iVar2;
                }
                if (!((Set) nVar.s.invoke()).contains(eVar2)) {
                    p10.u uVar = (p10.u) ((Map) nVar.t.invoke()).get(eVar2);
                    if (uVar == null) {
                        return null;
                    }
                    a20.b bVar2 = (a20.b) qVar.B;
                    d30.l lVar = bVar2.a;
                    b20.k kVar = new b20.k(nVar, 2);
                    d30.l lVar2 = lVar;
                    lVar2.getClass();
                    return m10.q.e0(bVar2.a, nVar.n, eVar2, new d30.i(lVar2, kVar), ca.v.F(qVar, uVar), bVar2.j.b(uVar));
                }
                i00.b bVarS = va.a.s();
                ((a20.b) qVar.B).x.getClass();
                kotlin.jvm.internal.m.e(eVar3, "thisDescriptor");
                kotlin.jvm.internal.m.e(eVar2, "name");
                kotlin.jvm.internal.m.e(qVar, "c");
                i00.b bVarK = va.a.k(bVarS);
                int iA = bVarK.a();
                if (iA == 0) {
                    return null;
                }
                if (iA == 1) {
                    return (j10.e) h00.q.d1(bVarK);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + bVarK).toString());
            case 5:
                m10.l0 l0Var = (m10.l0) this.B;
                b20.n nVar2 = (b20.n) this.C;
                n20.e eVar4 = (n20.e) obj;
                kotlin.jvm.internal.m.e(eVar4, "accessorName");
                return kotlin.jvm.internal.m.a(l0Var.getName(), eVar4) ? va.a.R(l0Var) : h00.q.Y0(nVar2.O(eVar4), nVar2.N(eVar4));
            case 6:
                b20.u uVar2 = (b20.u) this.B;
                oj.q qVar2 = ((b20.a0) uVar2).b;
                oj.q qVar3 = (oj.q) this.C;
                a20.b bVar3 = (a20.b) qVar3.B;
                b20.q qVar4 = (b20.q) obj;
                kotlin.jvm.internal.m.e(qVar4, "request");
                b20.p pVar = uVar2.o;
                n20.b bVar4 = new n20.b(((m10.c0) pVar).F, qVar4.a);
                p10.o oVar2 = qVar4.b;
                if (oVar2 != null) {
                    hf.c cVar2 = bVar3.c;
                    ((a20.b) qVar2.B).d.c().c.getClass();
                    k20.f fVar = k20.f.g;
                    cVar2.getClass();
                    kotlin.jvm.internal.m.e(fVar, "metadataVersion");
                    n20.c cVarC = oVar2.c();
                    iVarC = (cVarC == null || (str = cVarC.a.a) == null || (clsF = f50.k.F((ClassLoader) cVar2.B, str)) == null || (cVarU = k00.f.u(clsF)) == null) ? null : new me.i(cVarU, 28);
                } else {
                    hf.c cVar3 = bVar3.c;
                    ((a20.b) qVar2.B).d.c().c.getClass();
                    iVarC = cVar3.C(bVar4, k20.f.g);
                }
                o10.c cVar4 = iVarC != null ? (o10.c) iVarC.B : null;
                n20.b bVarA = cVar4 != null ? p10.d.a(cVar4.a) : null;
                if (bVarA != null && (bVarA.g() || bVarA.c)) {
                    return null;
                }
                b20.r rVar = b20.s.a;
                if (cVar4 != null) {
                    if (((h20.a) cVar4.b.c) == h20.a.E) {
                        g20.e eVar5 = ((a20.b) qVar2.B).d;
                        eVar5.getClass();
                        a30.d dVarG = eVar5.g(cVar4);
                        j10.e eVarA = dVarG == null ? null : eVar5.c().t.a(p10.d.a(cVar4.a), dVarG);
                        if (eVarA != null) {
                            rVar = new b20.r(eVarA);
                        }
                    } else {
                        rVar = b20.t.a;
                    }
                }
                if (rVar instanceof b20.r) {
                    return rVar.a;
                }
                if (rVar instanceof b20.t) {
                    return null;
                }
                if (!(rVar instanceof b20.s)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (oVar2 == null) {
                    o10.b bVar5 = bVar3.b;
                    bVar5.getClass();
                    n20.c cVar5 = bVar4.a;
                    String strU1 = r30.r.u0(bVar4.b.a.a, '.', '$');
                    if (!cVar5.a.c()) {
                        strU1 = cVar5.a.a + '.' + strU1;
                    }
                    Class clsF3 = f50.k.F((ClassLoader) bVar5.B, strU1);
                    oVar2 = clsF3 != null ? new p10.o(clsF3) : null;
                }
                e20.f[] fVarArr = e20.f.A;
                n20.c cVarC2 = oVar2 != null ? oVar2.c() : null;
                if (cVarC2 == null || cVarC2.a.c() || !cVarC2.b().equals(((m10.c0) pVar).F)) {
                    return null;
                }
                b20.i iVar3 = new b20.i(qVar3, pVar, oVar2, (j10.e) null);
                bVar3.s.getClass();
                return iVar3;
            case 7:
                try {
                    ((b50.j) this.B).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return g00.b0.a;
            case 8:
                return ((bw.b) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 9:
                oj.q qVar5 = (oj.q) this.B;
                c30.i iVar4 = (c30.i) this.C;
                a30.k kVar2 = iVar4.L;
                n20.e eVar6 = (n20.e) obj;
                kotlin.jvm.internal.m.e(eVar6, "name");
                i20.w wVar = (i20.w) ((LinkedHashMap) qVar5.B).get(eVar6);
                if (wVar != null) {
                    return m10.q.e0(((a30.i) kVar2.a).a, iVar4, eVar6, (d30.i) qVar5.D, new c30.a(((a30.i) kVar2.a).a, new a20.a(iVar4, wVar, 12)), j10.n0.n);
                }
                return null;
            case 10:
                k2.d dVar = (k2.d) obj;
                kotlin.jvm.internal.m.e(dVar, "$this$record");
                w00.a.q(dVar, (e00.m) this.B, (d00.r0) this.C, 0L, dVar.b());
                return g00.b0.a;
            case 11:
                return ((e6.c) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 12:
                e7.l0 l0Var2 = (e7.l0) this.B;
                oj.q qVar6 = (oj.q) l0Var2.f5150d;
                f20.b bVar6 = (f20.b) this.C;
                kotlin.jvm.internal.m.e(obj, "$this$extractNullability");
                e30.w wVar2 = bVar6.a;
                b20.f fVar2 = (k10.b) obj;
                if (fVar2 instanceof b20.f) {
                    ((a20.b) qVar6.B).t.getClass();
                    if (!fVar2.g && ((x10.a) l0Var2.f5151e) != x10.a.F) {
                        if (wVar2 != null) {
                            n20.e eVar7 = g10.i.e;
                            hVarG = wVar2.m0().g();
                            if (hVarG != null || g10.i.s(hVarG) == null) {
                                z10 = false;
                            } else {
                                ((a20.b) qVar6.B).q.getClass();
                                Object objC = x10.b.c(fVar2, g10.o.t);
                                if (objC == null) {
                                    z10 = false;
                                } else {
                                    ArrayList arrayListA = x10.b.a(objC, false);
                                    if (arrayListA.isEmpty()) {
                                        z10 = false;
                                    } else {
                                        Iterator it = arrayListA.iterator();
                                        while (it.hasNext()) {
                                            if (kotlin.jvm.internal.m.a((String) it.next(), "TYPE")) {
                                                ((a20.b) qVar6.B).t.getClass();
                                            }
                                        }
                                        z10 = false;
                                    }
                                }
                            }
                        } else {
                            z10 = false;
                        }
                    }
                } else if (wVar2 != null) {
                    n20.e eVar8 = g10.i.e;
                    hVarG = wVar2.m0().g();
                    if (hVarG != null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 13:
                f20.r rVar2 = (f20.r) this.B;
                f20.e[] eVarArr = (f20.e[]) this.C;
                int iIntValue2 = ((Number) obj).intValue();
                if (rVar2 == null || (eVar = (f20.e) rVar2.a.get(Integer.valueOf(iIntValue2))) == null) {
                    return (iIntValue2 < 0 || iIntValue2 >= eVarArr.length) ? f20.e.e : eVarArr[iIntValue2];
                }
                return eVar;
            case 14:
                KeyEvent keyEvent = ((t2.b) obj).f14351a;
                l1.z0 z0Var = (l1.z0) this.C;
                if (!((k8) this.B).b()) {
                    z0Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 15:
                return ((j7) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 16:
                int iIntValue3 = ((Number) obj).intValue();
                return ((eu.n) this.B).invoke(Integer.valueOf(iIntValue3), ((List) this.C).get(iIntValue3));
            case 17:
                return ((hx.t) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case TYPE_SINT64_VALUE:
                int iIntValue4 = ((Number) obj).intValue();
                return ((ir.b) this.B).invoke(Integer.valueOf(iIntValue4), ((List) this.C).get(iIntValue4));
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return ((hx.t) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return ((hx.t) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return ((ks.e) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return ((ks.e) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 23:
                c7.c cVar6 = (c7.c) this.B;
                Object obj2 = cVar6.B;
                a40.k kVar3 = (a40.k) this.C;
                synchronized (obj2) {
                    ((ArrayList) cVar6.C).remove(kVar3);
                }
                return g00.b0.a;
            case 24:
                return ((m3.c0) this.B).invoke(((ArrayList) this.C).get(((Number) obj).intValue()));
            case 25:
                int iIntValue5 = ((Number) obj).intValue();
                return ((m3.b0) this.B).invoke(Integer.valueOf(iIntValue5), ((List) this.C).get(iIntValue5));
            case RuntimeVersion.MINOR:
                int iIntValue6 = ((Number) obj).intValue();
                return ((m3.b0) this.B).invoke(Integer.valueOf(iIntValue6), ((List) this.C).get(iIntValue6));
            case 27:
                return ((m3.c0) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 28:
                int iIntValue7 = ((Number) obj).intValue();
                return ((ou.a) this.B).invoke(Integer.valueOf(iIntValue7), ((List) this.C).get(iIntValue7));
            default:
                return ((pp.d) this.B).invoke(((ArrayList) this.C).get(((Number) obj).intValue()));
        }
    }
}
