package rc;

import a40.c0;
import a40.g0;
import d0.i2;
import d40.y0;
import h00.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import ri.t1;

public final class c {

    public final g f13151a;

    public final a1.i f13152b;

    public final a40.z f13153c;

    public final a40.v f13154d;

    public final a40.v f13155e;

    public final a40.v f13156f;

    public final a0 f13157g;

    public fd.d f13159i;

    public h1.l f13160j;
    public od.c l;
    public final g0 m;

    public final h7.b f13162n;

    public final y0 f13163o;

    public bd.c f13164p;

    public final g00.p f13158h = rd.a.J(new fd.a(this, 2));

    public final g00.p f13161k = rd.a.J(new fd.a(this, 0));

    public c(g gVar, a1.i iVar, a40.z zVar, a40.v vVar, a40.v vVar2, a40.v vVar3) {
        this.f13151a = gVar;
        this.f13152b = iVar;
        this.f13153c = zVar;
        this.f13154d = vVar;
        this.f13155e = vVar2;
        this.f13156f = vVar3;
        h7.b bVar = new h7.b();
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        kotlin.jvm.internal.m.d(setSynchronizedSet, "synchronizedSet(...)");
        bVar.B = setSynchronizedSet;
        this.f13162n = bVar;
        rd.a.J(new fd.a(this, 1));
        this.f13163o = new y0(d40.o.a(0, 1000, c40.a.B));
        if (r30.k.L0(gVar.f13172a) || gVar.f13174c <= 0 || gVar.f13175d <= 0) {
            throw new IllegalArgumentException("invalid configuration");
        }
        a0 a0Var = new a0();
        a0Var.B = this;
        this.f13157g = a0Var;
        this.f13164p = new bd.c(0);
        g0 g0VarF = c0.f(this.f13153c, this.f13154d, a40.a0.B, new i2(this, this, (k00.c) null, 24));
        this.m = g0VarF;
        g0VarF.start();
    }

    public static Object b(c cVar, od.b bVar, m00.c cVar2) {
        a aVar;
        od.c cVar3;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i10 = aVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.E = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar, cVar2);
            }
        } else {
            aVar = new a(cVar, cVar2);
        }
        Object obj = aVar.C;
        l00.a aVar2 = l00.a.A;
        int i11 = aVar.E;
        if (i11 == 0) {
            t1.O(obj);
            oe.o oVar = new oe.o(cVar);
            aVar.A = cVar;
            aVar.B = bVar;
            aVar.E = 1;
            Object obj2 = g00.b0.a;
            int i12 = oVar.A;
            ad.g[] gVarArr = ad.g.A;
            if (i12 < 3) {
                ((cd.b) oVar.D).b("Migrating storage to version 3");
                Object objG = oVar.g(aVar);
                if (objG == aVar2) {
                    obj2 = objG;
                }
            } else {
                cVar.f().b("Storage already at version 3");
            }
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = aVar.B;
            cVar = aVar.A;
            t1.O(obj);
        }
        cVar.getClass();
        kotlin.jvm.internal.m.e(bVar, "identityConfiguration");
        synchronized (od.c.f11935b) {
            try {
                LinkedHashMap linkedHashMap = od.c.f11936c;
                String str = bVar.f11929a;
                Object cVar4 = linkedHashMap.get(str);
                if (cVar4 == null) {
                    cVar4 = new od.c(bVar);
                    linkedHashMap.put(str, cVar4);
                }
                cVar3 = (od.c) cVar4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        cVar.l = cVar3;
        a1.i iVar = cVar.f13152b;
        ld.a aVar3 = new ld.a(iVar);
        a2.o oVar2 = cVar.c().f11937a;
        oVar2.getClass();
        synchronized (oVar2.E) {
            ((LinkedHashSet) oVar2.F).add(aVar3);
        }
        if (cVar.c().f11937a.C) {
            od.a aVarB = cVar.c().f11937a.b();
            od.d dVar = od.d.A;
            kotlin.jvm.internal.m.e(aVarB, "identity");
            iVar.D(aVarB.f11927a);
            iVar.A(aVarB.f11928b);
        }
        if (!kotlin.jvm.internal.m.a(cVar.f13151a.f13186q, (Object) null)) {
            cVar.a(new zc.d());
        }
        cVar.a(new b(cVar));
        cVar.a(new jd.b());
        bd.c cVar5 = cVar.f13164p;
        if (cVar5 == null) {
            kotlin.jvm.internal.m.k("activityLifecycleCallbacks");
            throw null;
        }
        cVar.a(new zc.c(cVar5));
        cVar.a(new zc.a());
        cVar.a(new jd.c(1));
        cVar.a(new jd.a());
        a0 a0Var = cVar.f13157g;
        kotlin.jvm.internal.m.c(a0Var, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        c cVarP0 = a0Var.P0();
        c0.y(cVarP0.f13153c, cVarP0.f13156f, (a40.a0) null, new pz.k(cVarP0, a0Var, (k00.c) null, 5), 2);
        return g00.b0.a;
    }

    public static void i(c cVar, String str, Map map, int i10) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        cVar.getClass();
        kotlin.jvm.internal.m.e(str, "eventType");
        gd.a aVar = new gd.a();
        aVar.M = str;
        aVar.N = map != null ? d0.b0(map) : null;
        cVar.h(aVar);
    }

    public final void a(hd.c cVar) {
        if (!(cVar instanceof zc.a)) {
            this.f13157g.J0(cVar);
            return;
        }
        a1.i iVar = this.f13152b;
        zc.a aVar = (zc.a) cVar;
        synchronized (((ArrayList) iVar.D)) {
            aVar.a(this);
            ((ArrayList) iVar.D).add(aVar);
        }
    }

    public final od.c c() {
        od.c cVar = this.l;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.m.k("idContainer");
        throw null;
    }

    public final fd.d d() {
        fd.d dVar = this.f13159i;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.m.k("identifyInterceptStorage");
        throw null;
    }

    public final h1.l e() {
        h1.l lVar = this.f13160j;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.m.k("identityStorage");
        throw null;
    }

    public final cd.b f() {
        return (cd.b) this.f13161k.getValue();
    }

    public final fd.d g() {
        return (fd.d) this.f13158h.getValue();
    }

    public final void h(gd.a aVar) {
        if (aVar.f6291c == null) {
            aVar.f6291c = Long.valueOf(System.currentTimeMillis());
        }
        f().b("Logged event with type: " + aVar.a());
        a0 a0Var = this.f13157g;
        a0Var.getClass();
        if (aVar.f6291c == null) {
            aVar.f6291c = Long.valueOf(System.currentTimeMillis());
        }
        if (a0Var.C.j(new k(aVar)) instanceof c40.n) {
            a0Var.P0().f().a("Failed to enqueue event: " + aVar.a() + ". Channel is closed or full.");
        }
    }
}
