package bb;

import a1.u0;
import a40.e1;
import a8.l;
import ab.g;
import ab.i;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import db.e;
import db.h;
import hb.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kh.r;
import kotlin.jvm.internal.m;
import l9.f0;
import za.g0;
import za.v;

public final class c implements i, e, ab.b {
    public static final String O = v.f("GreedyScheduler");
    public final Context A;
    public final a C;
    public boolean D;
    public final g G;
    public final f0 H;
    public final za.b I;
    public Boolean K;
    public final db.g L;
    public final jb.b M;
    public final d N;
    public final HashMap B = new HashMap();
    public final Object E = new Object();
    public final u0 F = new u0(new l(1));
    public final HashMap J = new HashMap();

    public c(Context context, za.b bVar, fb.g gVar, g gVar2, f0 f0Var, jb.b bVar2) {
        this.A = context;
        me.i iVar = bVar.f17343g;
        this.C = new a(this, iVar, bVar.f17340d);
        this.N = new d(iVar, f0Var);
        this.M = bVar2;
        this.L = new db.g(gVar);
        this.I = bVar;
        this.G = gVar2;
        this.H = f0Var;
    }

    @Override
    public final void a(p... pVarArr) {
        long jMax;
        if (this.K == null) {
            this.K = Boolean.valueOf(ib.i.a(this.A, this.I));
        }
        if (!this.K.booleanValue()) {
            v.d().e(O, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.D) {
            this.G.a(this);
            this.D = true;
        }
        HashSet<p> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            if (!this.F.x(bi.b.C(pVar))) {
                synchronized (this.E) {
                    try {
                        hb.i iVarC = bi.b.C(pVar);
                        b bVar = (b) this.J.get(iVarC);
                        if (bVar == null) {
                            int i10 = pVar.f7014k;
                            this.I.f17340d.getClass();
                            bVar = new b(i10, System.currentTimeMillis());
                            this.J.put(iVarC, bVar);
                        }
                        jMax = (((long) Math.max((pVar.f7014k - bVar.f2477a) - 5, 0)) * NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) + bVar.f2478b;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long jMax2 = Math.max(pVar.a(), jMax);
                this.I.f17340d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (pVar.f7005b == g0.A) {
                    if (jCurrentTimeMillis < jMax2) {
                        a aVar = this.C;
                        if (aVar != null) {
                            me.i iVar = aVar.f2474b;
                            HashMap map = aVar.f2476d;
                            Runnable runnable = (Runnable) map.remove(pVar.f7004a);
                            if (runnable != null) {
                                ((Handler) iVar.B).removeCallbacks(runnable);
                            }
                            r rVar = new r(3, aVar, pVar, false);
                            map.put(pVar.f7004a, rVar);
                            aVar.f2475c.getClass();
                            ((Handler) iVar.B).postDelayed(rVar, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!m.a(za.e.f17355j, pVar.f7013j)) {
                        za.e eVar = pVar.f7013j;
                        if (eVar.f17359d) {
                            v.d().a(O, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (eVar.b()) {
                            v.d().a(O, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f7004a);
                        }
                    } else if (!this.F.x(bi.b.C(pVar))) {
                        v.d().a(O, "Starting work for " + pVar.f7004a);
                        u0 u0Var = this.F;
                        u0Var.getClass();
                        ab.m mVarV = u0Var.V(bi.b.C(pVar));
                        this.N.w(mVarV);
                        f0 f0Var = this.H;
                        ((jb.b) f0Var.C).f8258a.execute(new ab.e(f0Var, mVarV, (Object) null, 1));
                    }
                }
            }
        }
        synchronized (this.E) {
            try {
                if (!hashSet.isEmpty()) {
                    v.d().a(O, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (p pVar2 : hashSet) {
                        hb.i iVarC2 = bi.b.C(pVar2);
                        if (!this.B.containsKey(iVarC2)) {
                            this.B.put(iVarC2, h.a(this.L, pVar2, this.M.f8259b, this));
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final void c(String str) {
        List<ab.m> listD;
        Runnable runnable;
        String str2 = O;
        if (this.K == null) {
            this.K = Boolean.valueOf(ib.i.a(this.A, this.I));
        }
        if (!this.K.booleanValue()) {
            v.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.D) {
            this.G.a(this);
            this.D = true;
        }
        v.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.C;
        if (aVar != null && (runnable = (Runnable) aVar.f2476d.remove(str)) != null) {
            ((Handler) aVar.f2474b.B).removeCallbacks(runnable);
        }
        u0 u0Var = this.F;
        u0Var.getClass();
        m.e(str, "workSpecId");
        synchronized (u0Var.C) {
            listD = ((l) u0Var.B).d(str);
        }
        for (ab.m mVar : listD) {
            this.N.c(mVar);
            f0 f0Var = this.H;
            f0Var.getClass();
            f0Var.u(mVar, -512);
        }
    }

    @Override
    public final void d(hb.i iVar, boolean z10) {
        e1 e1Var;
        ab.m mVarR = this.F.R(iVar);
        if (mVarR != null) {
            this.N.c(mVarR);
        }
        synchronized (this.E) {
            e1Var = (e1) this.B.remove(iVar);
        }
        if (e1Var != null) {
            v.d().a(O, "Stopping tracking for " + iVar);
            e1Var.i((CancellationException) null);
        }
        if (z10) {
            return;
        }
        synchronized (this.E) {
            this.J.remove(iVar);
        }
    }

    @Override
    public final void e(p pVar, db.c cVar) {
        hb.i iVarC = bi.b.C(pVar);
        boolean z10 = cVar instanceof db.a;
        f0 f0Var = this.H;
        d dVar = this.N;
        String str = O;
        u0 u0Var = this.F;
        if (!z10) {
            v.d().a(str, "Constraints not met: Cancelling work ID " + iVarC);
            ab.m mVarR = u0Var.R(iVarC);
            if (mVarR != null) {
                dVar.c(mVarR);
                int i10 = ((db.b) cVar).f4845a;
                f0Var.getClass();
                f0Var.u(mVarR, i10);
                return;
            }
            return;
        }
        if (u0Var.x(iVarC)) {
            return;
        }
        v.d().a(str, "Constraints met: Scheduling work ID " + iVarC);
        ab.m mVarV = u0Var.V(iVarC);
        dVar.w(mVarV);
        ((jb.b) f0Var.C).f8258a.execute(new ab.e(f0Var, mVarV, (Object) null, 1));
    }
}
