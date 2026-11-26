package wy;

import androidx.lifecycle.f1;
import androidx.lifecycle.w;
import b2.r;
import c3.o1;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import gz.e1;
import kotlin.jvm.internal.a0;
import l1.g0;
import l1.p1;
import l1.p2;
import l1.q1;
import l1.r1;
import l1.z0;
import l6.v;
import ur.d1;

public abstract class q {
    public static final v1.c a = new v1.c(new k(1), -1346774209, false);

    public static final void a(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1119067902);
        if (g0Var.S(i & 1, i != 0)) {
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            p pVar = (p) c7.i.S(a0.a.b(p.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), (u00.a) null);
            u00.a aVarA = cq.l.a(g0Var);
            m mVar = (m) g0Var.k(g.a);
            z0 z0VarQ = k00.f.q(pVar.c.d, g0Var, 0);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            boolean zG = g0Var.g(pVar) | g0Var.i(mVar) | g0Var.g(aVarA) | g0Var.g(bVar);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                v vVar = new v(pVar, mVar, aVarA, bVar, (k00.c) null, 9);
                g0Var.n0(vVar);
                objN = vVar;
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN);
            o oVar = (o) z0VarQ.getValue();
            boolean zG2 = g0Var.g(pVar);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                e1 e1Var = new e1(1, pVar, p.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/changepassword/ChangePasswordAction;)V", 0, 25);
                g0Var.n0(e1Var);
                objN2 = e1Var;
            }
            b(oVar, (u00.k) ((a10.g) objN2), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k(i, 0);
        }
    }

    public static final void b(o oVar, u00.k kVar, l1.j jVar, int i) {
        o oVar2;
        u00.k kVar2;
        l1.j jVar2;
        String str;
        String strO;
        Integer numValueOf;
        boolean z;
        boolean zI;
        Object objN;
        boolean z2;
        Integer num;
        int i2;
        boolean z3;
        Object objN2;
        Object objN3;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-1113301034);
        int i3 = (jVar3.g(oVar) ? 4 : 2) | i | (jVar3.i(kVar) ? 32 : 16);
        if (jVar3.S(i3 & 1, (i3 & 19) != 18)) {
            g2.l lVar = (g2.l) jVar3.k(o1.i);
            xk.d dVarR = c7.i.R(jVar3);
            q2.a aVar = (q2.a) jVar3.k(o1.l);
            boolean zBooleanValue = ((Boolean) jVar3.k(tp.h.a)).booleanValue();
            String str2 = oVar.c;
            boolean z4 = oVar.e;
            String str3 = oVar.d;
            boolean zG = jVar3.g(str2);
            Object objN4 = jVar3.N();
            Object obj = l1.i.a;
            if (zG || objN4 == obj) {
                objN4 = oVar.c();
                jVar3.n0(objN4);
            }
            u30.f fVar = (u30.f) objN4;
            boolean zG2 = jVar3.g(oVar.a) | jVar3.g(str2) | jVar3.g(str3) | jVar3.h(z4) | jVar3.h(z3.E(str2)) | jVar3.h(oVar.b());
            Object objN5 = jVar3.N();
            if (zG2 || objN5 == obj) {
                objN5 = l1.q.r(new l6.c(oVar, fVar, 26));
                jVar3.n0(objN5);
            }
            p2 p2Var = (p2) objN5;
            boolean z5 = (str3.length() <= 0 || str3.length() == 0 || str2.equals(str3)) ? false : true;
            boolean zE = z3.E(str2);
            if (zE) {
                strO = oi.k.o(jVar3, -435395484, 2131886206, jVar3, false);
            } else if (z5) {
                strO = oi.k.o(jVar3, -435393051, 2131886209, jVar3, false);
            } else {
                if (oVar.b()) {
                    strO = oi.k.o(jVar3, -435390139, 2131887252, jVar3, false);
                } else {
                    jVar3.c0(-612130265);
                    jVar3.r(false);
                    str = null;
                }
                numValueOf = Integer.valueOf(oVar.g);
                if ((i3 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                zI = z | jVar3.i(aVar) | jVar3.i(dVarR);
                objN = jVar3.N();
                if (!zI || objN == obj) {
                    z2 = false;
                    num = numValueOf;
                    pz.k kVar3 = new pz.k(oVar, aVar, dVarR, null, 20);
                    jVar3.n0(kVar3);
                    objN = kVar3;
                } else {
                    z2 = false;
                    num = numValueOf;
                }
                l1.q.i(num, jVar3, (u00.n) objN);
                String strU = z3.U(jVar3, 2131887247);
                boolean zBooleanValue2 = ((Boolean) p2Var.getValue()).booleanValue();
                i2 = i3 & 112;
                if (i2 == 32) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                objN2 = jVar3.N();
                if (z3 || objN2 == obj) {
                    objN2 = new d1(29, kVar);
                    jVar3.n0(objN2);
                }
                ip.a aVar2 = new ip.a(strU, zBooleanValue2, z4, (u00.a) objN2);
                r rVarV = c7.i.V(b2.o.A, dVarR, jVar3);
                if (i2 == 32) {
                    z2 = true;
                }
                objN3 = jVar3.N();
                if (z2 || objN3 == obj) {
                    objN3 = new l(0, kVar);
                    jVar3.n0(objN3);
                }
                u00.a aVar3 = (u00.a) objN3;
                lp.a aVar4 = new lp.a(zBooleanValue, oVar, kVar, lVar, zE, z5, p2Var, fVar, str);
                oVar2 = oVar;
                kVar2 = kVar;
                jVar2 = jVar3;
                up.f.a(aVar3, null, rVarV, aVar2, false, v1.d.d(891033834, aVar4, jVar3), jVar2, 196608, 18);
            }
            str = strO;
            numValueOf = Integer.valueOf(oVar.g);
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            zI = z | jVar3.i(aVar) | jVar3.i(dVarR);
            objN = jVar3.N();
            if (zI) {
                z2 = false;
                num = numValueOf;
                pz.k kVar4 = new pz.k(oVar, aVar, dVarR, null, 20);
                jVar3.n0(kVar4);
                objN = kVar4;
            } else {
                z2 = false;
                num = numValueOf;
                pz.k kVar5 = new pz.k(oVar, aVar, dVarR, null, 20);
                jVar3.n0(kVar5);
                objN = kVar5;
            }
            l1.q.i(num, jVar3, (u00.n) objN);
            String strU2 = z3.U(jVar3, 2131887247);
            boolean zBooleanValue3 = ((Boolean) p2Var.getValue()).booleanValue();
            i2 = i3 & 112;
            if (i2 == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            objN2 = jVar3.N();
            if (z3) {
                objN2 = new d1(29, kVar);
                jVar3.n0(objN2);
            } else {
                objN2 = new d1(29, kVar);
                jVar3.n0(objN2);
            }
            ip.a aVar5 = new ip.a(strU2, zBooleanValue3, z4, (u00.a) objN2);
            r rVarV2 = c7.i.V(b2.o.A, dVarR, jVar3);
            if (i2 == 32) {
                z2 = true;
            }
            objN3 = jVar3.N();
            if (z2) {
                objN3 = new l(0, kVar);
                jVar3.n0(objN3);
            } else {
                objN3 = new l(0, kVar);
                jVar3.n0(objN3);
            }
            u00.a aVar6 = (u00.a) objN3;
            lp.a aVar7 = new lp.a(zBooleanValue, oVar, kVar, lVar, zE, z5, p2Var, fVar, str);
            oVar2 = oVar;
            kVar2 = kVar;
            jVar2 = jVar3;
            up.f.a(aVar6, null, rVarV2, aVar5, false, v1.d.d(891033834, aVar7, jVar3), jVar2, 196608, 18);
        } else {
            oVar2 = oVar;
            kVar2 = kVar;
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(oVar2, kVar2, i, 29);
        }
    }

    public static final void c(u00.a onDismiss, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(444333992);
        int i2 = (g0Var.i(onDismiss) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new n();
                g0Var.n0(objN);
            }
            n nVar = (n) objN;
            boolean zI = g0Var.i(nVar);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                objN2 = new q0.a(nVar, 20);
                g0Var.n0(objN2);
            }
            l1.q.e(b0.a, (u00.k) objN2, g0Var);
            p1 p1Var = r6.d.a;
            w wVar = (w) g0Var.k(p1Var);
            p1 p1Var2 = ja.a.a;
            ia.g gVar = (ia.g) g0Var.k(p1Var2);
            boolean z = (i2 & 14) == 4;
            Object objN3 = g0Var.N();
            if (z || objN3 == obj) {
                objN3 = new m(onDismiss);
                g0Var.n0(objN3);
            }
            l1.q.b(new q1[]{u6.a.a.a(nVar), p1Var.a(wVar), p1Var2.a(gVar), tp.h.a.a(Boolean.TRUE), g.a.a((m) objN3)}, v1.d.d(-1318955928, new eu.d(24, onDismiss), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(onDismiss, i, 25);
        }
    }
}
