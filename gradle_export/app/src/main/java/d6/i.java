package d6;

import android.content.Context;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import l1.m2;
import l1.q2;

public final class i implements u00.n {
    public final int A = 0;
    public final r B;
    public final Context C;

    public i(Context context, r rVar) {
        this.C = context;
        this.B = rVar;
    }

    public i(r rVar, Context context) {
        this.B = rVar;
        this.C = context;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Bundle bundle;
        l1.g0 g0Var;
        Object objN;
        l1.c cVar;
        l1.z0 z0Var;
        Boolean bool;
        r rVar;
        Context context;
        boolean zI;
        Object objN2;
        k00.c cVar2;
        boolean zI2;
        Object objN3;
        Object objN4;
        k00.j jVar;
        d40.i iVar;
        boolean zI3;
        Object objN5;
        u00.n nVar;
        Object objN6;
        l1.z0 z0Var2;
        boolean zI4;
        Object objN7;
        u00.n nVar2;
        switch (this.A) {
            case 0:
                l1.j jVar2 = (l1.j) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    l1.g0 g0Var2 = (l1.g0) jVar2;
                    if (g0Var2.C()) {
                        g0Var2.V();
                    } else {
                        q2 q2Var = b6.g.f2169b;
                        Context context2 = this.C;
                        l1.q1 q1VarA = q2Var.a(context2);
                        q2 q2Var2 = b6.g.f2171d;
                        r rVar2 = this.B;
                        l1.q1 q1VarA2 = q2Var2.a(rVar2.f4686f);
                        l1.t tVar = x.f4712a;
                        bundle = (Bundle) rVar2.f4691k.getValue();
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        l1.q.b(new l1.q1[]{q1VarA, q1VarA2, tVar.a(bundle), b6.g.f2170c.a(rVar2.f4690j.getValue())}, v1.d.d(-1811403166, new i(rVar2, context2), jVar2), jVar2, 56);
                    }
                } else {
                    q2 q2Var3 = b6.g.f2169b;
                    Context context3 = this.C;
                    l1.q1 q1VarA3 = q2Var3.a(context3);
                    q2 q2Var4 = b6.g.f2171d;
                    r rVar3 = this.B;
                    l1.q1 q1VarA4 = q2Var4.a(rVar3.f4686f);
                    l1.t tVar2 = x.f4712a;
                    bundle = (Bundle) rVar3.f4691k.getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    l1.q.b(new l1.q1[]{q1VarA3, q1VarA4, tVar2.a(bundle), b6.g.f2170c.a(rVar3.f4690j.getValue())}, v1.d.d(-1811403166, new i(rVar3, context3), jVar2), jVar2, 56);
                }
                return g00.b0.a;
            default:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue() & 3;
                k00.c cVar3 = g00.b0.a;
                if (iIntValue == 2) {
                    l1.g0 g0Var3 = (l1.g0) jVar3;
                    if (g0Var3.C()) {
                        g0Var3.V();
                    } else {
                        g0Var = (l1.g0) jVar3;
                        objN = g0Var.N();
                        cVar = l1.i.f9868a;
                        if (objN == cVar) {
                            objN = l1.q.z(new y3.h(0L));
                            g0Var.n0(objN);
                        }
                        z0Var = (l1.z0) objN;
                        bool = Boolean.FALSE;
                        rVar = this.B;
                        boolean zI5 = g0Var.i(rVar);
                        context = this.C;
                        zI = g0Var.i(context) | zI5;
                        objN2 = g0Var.N();
                        cVar2 = null;
                        if (zI || objN2 == cVar) {
                            a1.g gVar = new a1.g(rVar, context, z0Var, cVar2, 19);
                            g0Var.n0(gVar);
                            objN2 = gVar;
                        }
                        if (((Boolean) l1.q.C(bool, jVar3, (u00.n) objN2).getValue()).booleanValue()) {
                            g0Var.c0(-1541018146);
                            objN4 = g0Var.N();
                            jVar = k00.j.A;
                            if (objN4 == cVar) {
                                a1.g gVar2 = new a1.g(rVar.f4685e, context, rVar.f4686f, cVar2, 20);
                                cVar2 = null;
                                d40.e eVar = new d40.e(gVar2, jVar, -2, c40.a.A);
                                g0Var.n0(eVar);
                                objN4 = eVar;
                            }
                            iVar = (d40.i) objN4;
                            zI3 = g0Var.i(jVar) | g0Var.i(iVar);
                            objN5 = g0Var.N();
                            if (zI3 || objN5 == cVar) {
                                objN5 = new ev.p(jVar, iVar, cVar2, 20);
                                g0Var.n0(objN5);
                            }
                            nVar = (u00.n) objN5;
                            objN6 = g0Var.N();
                            if (objN6 == cVar) {
                                objN6 = l1.q.z(cVar2);
                                g0Var.n0(objN6);
                            }
                            z0Var2 = (l1.z0) objN6;
                            zI4 = g0Var.i(nVar);
                            objN7 = g0Var.N();
                            if (zI4 || objN7 == cVar) {
                                objN7 = new m2(nVar, z0Var2, cVar2, 2);
                                g0Var.n0(objN7);
                            }
                            l1.q.h(iVar, jVar, (u00.n) objN7, jVar3);
                            nVar2 = (u00.n) z0Var2.getValue();
                            if (nVar2 == null) {
                                g0Var.c0(-1540889931);
                                g0Var.r(false);
                            } else {
                                g0Var.c0(-1540889930);
                                w.a(0, ((y3.h) z0Var.getValue()).f16589a, rVar.f4688h, jVar3, nVar2);
                                g0Var.r(false);
                                cVar2 = cVar3;
                            }
                            if (cVar2 == null) {
                                g0Var.c0(-1296630672);
                                w.b(jVar3, 0);
                                g0Var.r(false);
                            } else {
                                g0Var.c0(-1296636252);
                                g0Var.r(false);
                            }
                            g0Var.r(false);
                        } else {
                            g0Var.c0(-1540810446);
                            w.b(jVar3, 0);
                            g0Var.r(false);
                        }
                        zI2 = g0Var.i(rVar);
                        objN3 = g0Var.N();
                        if (zI2 || objN3 == cVar) {
                            objN3 = new a1.z(rVar, 19);
                            g0Var.n0(objN3);
                        }
                        l1.q.k((u00.a) objN3, jVar3);
                    }
                } else {
                    g0Var = (l1.g0) jVar3;
                    objN = g0Var.N();
                    cVar = l1.i.f9868a;
                    if (objN == cVar) {
                        objN = l1.q.z(new y3.h(0L));
                        g0Var.n0(objN);
                    }
                    z0Var = (l1.z0) objN;
                    bool = Boolean.FALSE;
                    rVar = this.B;
                    boolean zI6 = g0Var.i(rVar);
                    context = this.C;
                    zI = g0Var.i(context) | zI6;
                    objN2 = g0Var.N();
                    cVar2 = null;
                    if (zI) {
                        a1.g gVar3 = new a1.g(rVar, context, z0Var, cVar2, 19);
                        g0Var.n0(gVar3);
                        objN2 = gVar3;
                    } else {
                        a1.g gVar4 = new a1.g(rVar, context, z0Var, cVar2, 19);
                        g0Var.n0(gVar4);
                        objN2 = gVar4;
                    }
                    if (((Boolean) l1.q.C(bool, jVar3, (u00.n) objN2).getValue()).booleanValue()) {
                        g0Var.c0(-1541018146);
                        objN4 = g0Var.N();
                        jVar = k00.j.A;
                        if (objN4 == cVar) {
                            a1.g gVar5 = new a1.g(rVar.f4685e, context, rVar.f4686f, cVar2, 20);
                            cVar2 = null;
                            d40.e eVar2 = new d40.e(gVar5, jVar, -2, c40.a.A);
                            g0Var.n0(eVar2);
                            objN4 = eVar2;
                        }
                        iVar = (d40.i) objN4;
                        zI3 = g0Var.i(jVar) | g0Var.i(iVar);
                        objN5 = g0Var.N();
                        if (zI3) {
                            objN5 = new ev.p(jVar, iVar, cVar2, 20);
                            g0Var.n0(objN5);
                        } else {
                            objN5 = new ev.p(jVar, iVar, cVar2, 20);
                            g0Var.n0(objN5);
                        }
                        nVar = (u00.n) objN5;
                        objN6 = g0Var.N();
                        if (objN6 == cVar) {
                            objN6 = l1.q.z(cVar2);
                            g0Var.n0(objN6);
                        }
                        z0Var2 = (l1.z0) objN6;
                        zI4 = g0Var.i(nVar);
                        objN7 = g0Var.N();
                        if (zI4) {
                            objN7 = new m2(nVar, z0Var2, cVar2, 2);
                            g0Var.n0(objN7);
                        } else {
                            objN7 = new m2(nVar, z0Var2, cVar2, 2);
                            g0Var.n0(objN7);
                        }
                        l1.q.h(iVar, jVar, (u00.n) objN7, jVar3);
                        nVar2 = (u00.n) z0Var2.getValue();
                        if (nVar2 == null) {
                            g0Var.c0(-1540889931);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(-1540889930);
                            w.a(0, ((y3.h) z0Var.getValue()).f16589a, rVar.f4688h, jVar3, nVar2);
                            g0Var.r(false);
                            cVar2 = cVar3;
                        }
                        if (cVar2 == null) {
                            g0Var.c0(-1296630672);
                            w.b(jVar3, 0);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(-1296636252);
                            g0Var.r(false);
                        }
                        g0Var.r(false);
                    } else {
                        g0Var.c0(-1540810446);
                        w.b(jVar3, 0);
                        g0Var.r(false);
                    }
                    zI2 = g0Var.i(rVar);
                    objN3 = g0Var.N();
                    if (zI2) {
                        objN3 = new a1.z(rVar, 19);
                        g0Var.n0(objN3);
                    } else {
                        objN3 = new a1.z(rVar, 19);
                        g0Var.n0(objN3);
                    }
                    l1.q.k((u00.a) objN3, jVar3);
                }
                return cVar3;
        }
    }
}
