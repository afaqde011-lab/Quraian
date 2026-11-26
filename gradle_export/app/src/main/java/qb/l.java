package qb;

import a1.v2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.network.HttpException;
import g00.p;
import java.io.IOException;
import java.util.Map;
import k50.c0;
import k50.o;
import k50.z;
import nb.n;
import nb.q;
import qd.s0;
import r30.r;
import ri.t1;
import x40.a0;
import x40.b0;
import x40.d0;
import x40.s;

public final class l implements g {

    public static final x40.d f12817f = new x40.d(true, true, -1, -1, false, false, false, -1, -1, false, false, false, (String) null);

    public static final x40.d f12818g = new x40.d(true, false, -1, -1, false, false, false, -1, -1, true, false, false, (String) null);

    public final String f12819a;

    public final wb.l f12820b;

    public final p f12821c;

    public final p f12822d;

    public final boolean f12823e;

    public l(String str, wb.l lVar, p pVar, p pVar2, boolean z10) {
        this.f12819a = str;
        this.f12820b = lVar;
        this.f12821c = pVar;
        this.f12822d = pVar2;
        this.f12823e = z10;
    }

    public static String d(String str, s sVar) {
        String strB;
        String str2 = sVar != null ? sVar.a : null;
        if ((str2 == null || r.x0(str2, "text/plain", false)) && (strB = bc.d.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return r30.k.d1(str2, ';');
        }
        return null;
    }

    @Override
    public final Object a(k00.c cVar) throws Exception {
        k kVar;
        ob.g gVar;
        vb.d dVarA;
        Object objB;
        ob.a aVar;
        ob.g gVar2;
        b0 b0Var;
        l lVar;
        b0 b0Var2;
        d0 d0Var;
        nb.e eVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.F = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, (m00.c) cVar);
            }
        } else {
            kVar = new k(this, (m00.c) cVar);
        }
        Object obj = kVar.D;
        l00.a aVar2 = l00.a.A;
        ?? r4 = kVar.F;
        try {
            if (r4 == 0) {
                t1.O(obj);
                wb.l lVar2 = this.f12820b;
                boolean z10 = lVar2.f15971n.A;
                String str = this.f12819a;
                if (!z10 || (aVar = (ob.a) this.f12822d.getValue()) == null) {
                    gVar = null;
                } else {
                    String str2 = lVar2.f15968i;
                    if (str2 == null) {
                        str2 = str;
                    }
                    ob.e eVar2 = ((ob.h) aVar).f11918b;
                    k50.l lVar3 = k50.l.D;
                    ob.c cVarL = eVar2.l(sg.f.I(str2).c("SHA-256").e());
                    if (cVarL != null) {
                        gVar = new ob.g(cVarL);
                    } else {
                        gVar = null;
                    }
                }
                if (gVar != null) {
                    o oVarC = c();
                    ob.c cVar2 = gVar.A;
                    if (cVar2.B) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l = (Long) oVarC.i((z) cVar2.A.f11909c.get(0)).f3068e;
                    if (l != null && l.longValue() == 0) {
                        return new m(g(gVar), d(str, null), nb.e.C);
                    }
                    if (!this.f12823e) {
                        n nVarG = g(gVar);
                        vb.b bVarF = f(gVar);
                        return new m(nVarG, d(str, bVarF != null ? (s) bVarF.f15585b.getValue() : null), nb.e.C);
                    }
                    dVarA = new vb.c(e(), f(gVar)).a();
                    vb.b bVar = dVarA.f15602b;
                    if (dVarA.f15601a == null && bVar != null) {
                        return new m(g(gVar), d(str, (s) bVar.f15585b.getValue()), nb.e.C);
                    }
                } else {
                    dVarA = new vb.c(e(), null).a();
                }
                th.o oVar = dVarA.f15601a;
                kotlin.jvm.internal.m.b(oVar);
                kVar.A = this;
                kVar.B = gVar;
                kVar.C = dVarA;
                kVar.F = 1;
                objB = b(oVar, kVar);
                if (objB == aVar2) {
                }
                return aVar2;
            }
            if (r4 != 1) {
                if (r4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = (b0) kVar.C;
                gVar2 = kVar.B;
                lVar = kVar.A;
                try {
                    t1.O(obj);
                    b0Var2 = (b0) obj;
                    try {
                        Bitmap.Config[] configArr = bc.d.f2480a;
                        d0Var = b0Var2.G;
                        if (d0Var != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        lVar.getClass();
                        k50.k kVarV = d0Var.v();
                        Context context = lVar.f12820b.f15960a;
                        q qVar = new q(kVarV, null);
                        String strD = d(lVar.f12819a, d0Var.r());
                        if (b0Var2.H != null) {
                            eVar = nb.e.D;
                        } else {
                            eVar = nb.e.C;
                        }
                        return new m(qVar, strD, eVar);
                    } catch (Exception e3) {
                        e = e3;
                        b0Var = b0Var2;
                        try {
                            bc.d.a(b0Var);
                            throw e;
                        } catch (Exception e10) {
                            e = e10;
                            r4 = gVar2;
                            if (r4 != 0) {
                                bc.d.a(r4);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    bc.d.a(b0Var);
                    throw e;
                }
            }
            vb.d dVar = (vb.d) kVar.C;
            gVar = kVar.B;
            l lVar4 = kVar.A;
            t1.O(obj);
            dVarA = dVar;
            this = lVar4;
            objB = obj;
            b0 b0Var3 = (b0) objB;
            Bitmap.Config[] configArr2 = bc.d.f2480a;
            d0 d0Var2 = b0Var3.G;
            if (d0Var2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                ob.g gVarH = this.h(gVar, dVarA.f15601a, b0Var3, dVarA.f15602b);
                String str3 = this.f12819a;
                try {
                    if (gVarH != null) {
                        n nVarG2 = this.g(gVarH);
                        vb.b bVarF2 = this.f(gVarH);
                        return new m(nVarG2, d(str3, bVarF2 != null ? (s) bVarF2.f15585b.getValue() : null), nb.e.D);
                    }
                    if (d0Var2.l() > 0) {
                        k50.k kVarV2 = d0Var2.v();
                        Context context2 = this.f12820b.f15960a;
                        return new m(new q(kVarV2, null), d(str3, d0Var2.r()), b0Var3.H != null ? nb.e.D : nb.e.C);
                    }
                    bc.d.a(b0Var3);
                    th.o oVarE = this.e();
                    kVar.A = this;
                    kVar.B = gVarH;
                    kVar.C = b0Var3;
                    kVar.F = 2;
                    Object objB2 = this.b(oVarE, kVar);
                    if (objB2 != aVar2) {
                        gVar2 = gVarH;
                        obj = objB2;
                        lVar = this;
                        b0Var = b0Var3;
                        b0Var2 = (b0) obj;
                        Bitmap.Config[] configArr3 = bc.d.f2480a;
                        d0Var = b0Var2.G;
                        if (d0Var != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        lVar.getClass();
                        k50.k kVarV3 = d0Var.v();
                        Context context3 = lVar.f12820b.f15960a;
                        q qVar2 = new q(kVarV3, null);
                        String strD2 = d(lVar.f12819a, d0Var.r());
                        if (b0Var2.H != null) {
                            eVar = nb.e.D;
                        } else {
                            eVar = nb.e.C;
                        }
                        return new m(qVar2, strD2, eVar);
                    }
                    return aVar2;
                } catch (Exception e12) {
                    gVar2 = gVarH;
                    e = e12;
                    b0Var = b0Var3;
                    bc.d.a(b0Var);
                    throw e;
                }
            } catch (Exception e13) {
                e = e13;
                gVar2 = gVar;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    public final Object b(th.o oVar, m00.c cVar) {
        j jVar;
        b0 b0VarF;
        boolean zI;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.C = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objQ = jVar.A;
        l00.a aVar = l00.a.A;
        int i11 = jVar.C;
        if (i11 == 0) {
            t1.O(objQ);
            Bitmap.Config[] configArr = bc.d.f2480a;
            boolean zA = kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper());
            p pVar = this.f12821c;
            if (!zA) {
                b50.j jVarA = ((x40.e) pVar.getValue()).a(oVar);
                jVar.C = 1;
                a40.k kVar = new a40.k(1, s0.j0(jVar));
                kVar.r();
                v2 v2Var = new v2(jVarA, kVar, 7);
                jVarA.e(v2Var);
                kVar.u(v2Var);
                objQ = kVar.q();
                if (objQ == aVar) {
                    return aVar;
                }
            } else {
                if (this.f12820b.f15972o.A) {
                    throw new NetworkOnMainThreadException();
                }
                b0VarF = ((x40.e) pVar.getValue()).a(oVar).f();
            }
            zI = b0VarF.i();
            int i12 = b0VarF.D;
            if (!zI || i12 == 304) {
                return b0VarF;
            }
            d0 d0Var = b0VarF.G;
            if (d0Var != null) {
                bc.d.a(d0Var);
            }
            StringBuilder sbQ = oi.k.q("HTTP ", i12, ": ");
            sbQ.append(b0VarF.C);
            throw new HttpException(sbQ.toString());
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(objQ);
        b0VarF = (b0) objQ;
        zI = b0VarF.i();
        int i13 = b0VarF.D;
        if (zI) {
        }
        return b0VarF;
    }

    public final o c() {
        Object value = this.f12822d.getValue();
        kotlin.jvm.internal.m.b(value);
        return ((ob.h) ((ob.a) value)).f11917a;
    }

    public final th.o e() {
        ce.c cVar = new ce.c(18);
        cVar.H(this.f12819a);
        wb.l lVar = this.f12820b;
        x40.p pVar = lVar.f15969j;
        kotlin.jvm.internal.m.e(pVar, "headers");
        cVar.D = pVar.e();
        for (Map.Entry entry : lVar.f15970k.f15983a.entrySet()) {
            Object key = entry.getKey();
            kotlin.jvm.internal.m.c(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            cVar.G((Class) key, entry.getValue());
        }
        wb.b bVar = lVar.f15971n;
        boolean z10 = bVar.A;
        boolean z11 = lVar.f15972o.A;
        if (!z11 && z10) {
            cVar.s(x40.d.o);
        } else if (!z11 || z10) {
            if (!z11 && !z10) {
                cVar.s(f12818g);
            }
        } else if (bVar.B) {
            cVar.s(x40.d.n);
        } else {
            cVar.s(f12817f);
        }
        return cVar.r();
    }

    public final vb.b f(ob.g gVar) throws Throwable {
        Throwable th2;
        vb.b bVar;
        try {
            o oVarC = c();
            ob.c cVar = gVar.A;
            if (cVar.B) {
                throw new IllegalStateException("snapshot is closed");
            }
            c0 c0VarR = bi.b.r(oVarC.n((z) cVar.A.f11909c.get(0)));
            try {
                bVar = new vb.b(c0VarR);
                try {
                    c0VarR.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c0VarR.close();
                } catch (Throwable th5) {
                    s0.V(th4, th5);
                }
                th2 = th4;
                bVar = null;
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.m.b(bVar);
            return bVar;
        } catch (IOException unused) {
            return null;
        }
    }

    public final n g(ob.g gVar) {
        ob.c cVar = gVar.A;
        if (cVar.B) {
            throw new IllegalStateException("snapshot is closed");
        }
        z zVar = (z) cVar.A.f11909c.get(1);
        o oVarC = c();
        String str = this.f12820b.f15968i;
        if (str == null) {
            str = this.f12819a;
        }
        return new n(zVar, oVarC, str, gVar);
    }

    public final ob.g h(ob.g gVar, th.o oVar, b0 b0Var, vb.b bVar) {
        o10.b bVar2;
        Throwable th2;
        g00.b0 b0Var2;
        Long lValueOf;
        g00.b0 b0Var3;
        c7.c cVarI;
        Throwable th3 = null;
        if (this.f12820b.f15971n.B) {
            if (this.f12823e) {
                if (!oVar.q().b) {
                    x40.d dVarM0 = b0Var.N;
                    if (dVarM0 == null) {
                        x40.d dVar = x40.d.n;
                        dVarM0 = s0.m0(b0Var.F);
                        b0Var.N = dVarM0;
                    }
                    if (dVarM0.b || kotlin.jvm.internal.m.a(b0Var.F.a("Vary"), "*")) {
                    }
                }
                if (gVar != null) {
                    bc.d.a(gVar);
                }
            }
            if (gVar != null) {
                ob.c cVar = gVar.A;
                ob.e eVar = cVar.C;
                synchronized (eVar) {
                    cVar.close();
                    cVarI = eVar.i(cVar.A.f11907a);
                }
                if (cVarI != null) {
                    bVar2 = new o10.b(cVarI, 2);
                } else {
                    bVar2 = null;
                }
            } else {
                ob.a aVar = (ob.a) this.f12822d.getValue();
                if (aVar == null) {
                    bVar2 = null;
                } else {
                    String str = this.f12820b.f15968i;
                    if (str == null) {
                        str = this.f12819a;
                    }
                    ob.e eVar2 = ((ob.h) aVar).f11918b;
                    k50.l lVar = k50.l.D;
                    c7.c cVarI2 = eVar2.i(sg.f.I(str).c("SHA-256").e());
                    if (cVarI2 != null) {
                        bVar2 = new o10.b(cVarI2, 2);
                    } else {
                        bVar2 = null;
                    }
                }
            }
            if (bVar2 != null) {
                try {
                    try {
                        if (b0Var.D != 304 || bVar == null) {
                            k50.b0 b0VarQ = bi.b.q(c().m(((c7.c) bVar2.B).i(0)));
                            try {
                                new vb.b(b0Var).a(b0VarQ);
                                b0Var2 = g00.b0.a;
                                try {
                                    b0VarQ.close();
                                    th2 = null;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                }
                            } catch (Throwable th5) {
                                try {
                                    b0VarQ.close();
                                } catch (Throwable th6) {
                                    s0.V(th5, th6);
                                }
                                th2 = th5;
                                b0Var2 = null;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            kotlin.jvm.internal.m.b(b0Var2);
                            k50.b0 b0VarQ2 = bi.b.q(c().m(((c7.c) bVar2.B).i(1)));
                            try {
                                d0 d0Var = b0Var.G;
                                kotlin.jvm.internal.m.b(d0Var);
                                lValueOf = Long.valueOf(d0Var.v().a0(b0VarQ2));
                                try {
                                    b0VarQ2.close();
                                } catch (Throwable th7) {
                                    th3 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    b0VarQ2.close();
                                } catch (Throwable th9) {
                                    s0.V(th8, th9);
                                }
                                th3 = th8;
                                lValueOf = null;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                            kotlin.jvm.internal.m.b(lValueOf);
                        } else {
                            a0 a0VarL = b0Var.l();
                            a0VarL.f = a.a.m(bVar.f15589f, b0Var.F).e();
                            b0 b0VarA = a0VarL.a();
                            k50.b0 b0VarQ3 = bi.b.q(c().m(((c7.c) bVar2.B).i(0)));
                            try {
                                new vb.b(b0VarA).a(b0VarQ3);
                                b0Var3 = g00.b0.a;
                                try {
                                    b0VarQ3.close();
                                } catch (Throwable th10) {
                                    th3 = th10;
                                }
                            } catch (Throwable th11) {
                                try {
                                    b0VarQ3.close();
                                } catch (Throwable th12) {
                                    s0.V(th11, th12);
                                }
                                th3 = th11;
                                b0Var3 = null;
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                            kotlin.jvm.internal.m.b(b0Var3);
                        }
                        ob.g gVarL = bVar2.l();
                        bc.d.a(b0Var);
                        return gVarL;
                    } catch (Throwable th13) {
                        bc.d.a(b0Var);
                        throw th13;
                    }
                } catch (Exception e3) {
                    Bitmap.Config[] configArr = bc.d.f2480a;
                    try {
                        ((c7.c) bVar2.B).d(false);
                    } catch (Exception unused) {
                    }
                    throw e3;
                }
            }
        } else if (gVar != null) {
            bc.d.a(gVar);
        }
        return null;
    }
}
