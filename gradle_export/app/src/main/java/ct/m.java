package ct;

import ab.l0;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import g1.l4;
import g1.m4;
import g1.m6;
import g1.n6;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import l1.i1;
import l1.t0;
import l1.y0;
import l1.z0;
import x.b1;
import x.h1;

public final class m implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public m(a40.z zVar, z0 z0Var, m6 m6Var, u00.a aVar) {
        this.A = 1;
        this.C = zVar;
        this.B = z0Var;
        this.D = m6Var;
        this.E = aVar;
    }

    public m(cy.e eVar, u00.k kVar, u00.k kVar2, u00.n nVar) {
        this.A = 5;
        this.C = eVar;
        this.E = kVar;
        this.D = kVar2;
        this.B = nVar;
    }

    public m(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.B = obj4;
    }

    public m(u00.k kVar, List list, u00.a aVar, y0 y0Var) {
        this.A = 4;
        this.E = kVar;
        this.C = list;
        this.D = aVar;
        this.B = y0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                ys.c cVar = (ys.c) this.C;
                ys.c cVar2 = (ys.c) this.D;
                u00.k kVar = (u00.k) this.E;
                ((z0) this.B).setValue(Boolean.FALSE);
                if (cVar != cVar2) {
                    kVar.invoke(cVar);
                }
                return g00.b0.a;
            case 1:
                a40.z zVar = (a40.z) this.C;
                z0 z0Var = (z0) this.B;
                m6 m6Var = (m6) this.D;
                u00.a aVar = (u00.a) this.E;
                if (p30.f.I(z0Var)) {
                    ta.c0.M(zVar, (k00.i) null, (u00.n) null, (u00.k) null, new cz.e(m6Var, aVar, null, 5), 31);
                }
                return g00.b0.a;
            case 2:
                m6 m6Var2 = (m6) this.C;
                b1 b1Var = (b1) this.D;
                b1 b1Var2 = (b1) this.E;
                b1 b1Var3 = (b1) this.B;
                m6Var2.e = b1Var;
                m6Var2.f = b1Var2;
                m6Var2.c = b1Var3;
                break;
            case 3:
                m6 m6Var3 = (m6) this.C;
                a40.z zVar2 = (a40.z) this.D;
                x.b bVar = (x.b) this.E;
                u00.a aVar2 = (u00.a) this.B;
                if (((n6) ((i1) m6Var3.d.g).getValue()) == n6.B) {
                    if (m6Var3.d.g().a.containsKey(n6.C)) {
                        a40.c0.y(zVar2, null, null, new l4(bVar, (k00.c) null, 0), 3);
                        a40.c0.y(zVar2, null, null, new m4(m6Var3, (k00.c) null, 0), 3);
                    } else {
                        a40.c0.y(zVar2, null, null, new m4(m6Var3, (k00.c) null, 1), 3).f0(new ca.q(5, aVar2));
                    }
                } else {
                    a40.c0.y(zVar2, null, null, new m4(m6Var3, (k00.c) null, 1), 3).f0(new ca.q(5, aVar2));
                }
                return g00.b0.a;
            case 4:
                u00.k kVar2 = (u00.k) this.E;
                List list = (List) this.C;
                u00.a aVar3 = (u00.a) this.D;
                kVar2.invoke(list.get(ab.a0.z(((y0) this.B).h(), va.a.L(list))));
                aVar3.invoke();
                break;
            case 5:
                cy.e eVar = (cy.e) this.C;
                u00.k kVar3 = (u00.k) this.E;
                u00.k kVar4 = (u00.k) this.D;
                u00.n nVar = (u00.n) this.B;
                int iOrdinal = eVar.b.ordinal();
                if (iOrdinal == 0) {
                    bx.c cVar3 = eVar.d;
                    if (cVar3 != null) {
                        kVar3.invoke(Integer.valueOf(cVar3.a));
                    }
                } else if (iOrdinal == 1) {
                    Integer num = eVar.e;
                    if (num != null) {
                        nVar.invoke(Integer.valueOf(num.intValue()), eVar.i);
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dw.a aVar4 = eVar.j;
                    if (aVar4 != null) {
                        kVar4.invoke(Integer.valueOf(aVar4.a));
                    }
                }
                return g00.b0.a;
            case 6:
                ib.n nVar2 = (ib.n) this.C;
                UUID uuid = (UUID) this.D;
                za.m mVar = (za.m) this.E;
                Context context = (Context) this.B;
                String string = uuid.toString();
                hb.p pVarE = nVar2.c.e(string);
                if (pVarE == null || pVarE.b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ab.g gVar = nVar2.b;
                synchronized (gVar.k) {
                    try {
                        za.v.d().e(ab.g.l, "Moving WorkSpec (" + string + ") to the foreground");
                        l0 l0Var = (l0) gVar.g.remove(string);
                        if (l0Var != null) {
                            if (gVar.a == null) {
                                PowerManager.WakeLock wakeLockA = ib.k.a(gVar.b);
                                gVar.a = wakeLockA;
                                wakeLockA.acquire();
                            }
                            gVar.f.put(string, l0Var);
                            gVar.b.startForegroundService(gb.b.a(gVar.b, bi.b.C(l0Var.a), mVar));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                hb.i iVarC = bi.b.C(pVarE);
                String str = gb.b.J;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", mVar.a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.b);
                intent.putExtra("KEY_NOTIFICATION", mVar.c);
                intent.putExtra("KEY_WORKSPEC_ID", iVarC.a);
                intent.putExtra("KEY_GENERATION", iVarC.b);
                context.startService(intent);
                return null;
            case 7:
                l1.g0 g0Var = (l1.g0) this.C;
                p1.a aVar5 = (p1.a) this.D;
                o1.g gVar2 = (o1.g) this.E;
                t0 t0Var = (t0) this.B;
                p1.b bVar2 = g0Var.M;
                p1.a aVar6 = bVar2.b;
                try {
                    bVar2.b = aVar5;
                    o1.g gVar3 = g0Var.G;
                    int[] iArr = g0Var.o;
                    u.w wVar = g0Var.v;
                    g0Var.o = null;
                    g0Var.v = null;
                    try {
                        g0Var.G = gVar2;
                        boolean z = bVar2.e;
                        try {
                            bVar2.e = false;
                            g0Var.E(t0Var.a, t0Var.g, t0Var.b, true);
                            bVar2.e = z;
                            g0Var.G = gVar3;
                            g0Var.o = iArr;
                            g0Var.v = wVar;
                            bVar2.b = aVar6;
                        } catch (Throwable th2) {
                            bVar2.e = z;
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        g0Var.G = gVar3;
                        g0Var.o = iArr;
                        g0Var.v = wVar;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVar2.b = aVar6;
                    throw th4;
                }
                break;
            case 8:
                t9.d dVar = (t9.d) this.C;
                q9.d dVar2 = (q9.d) this.D;
                List list2 = (List) this.E;
                List list3 = (List) this.B;
                dVar.c.setValue(dVar2);
                dVar.b.setValue(list2);
                dVar.d.setValue(list3);
                break;
            default:
                Float f = (Float) this.C;
                x.e0 e0Var = (x.e0) this.D;
                Float f2 = (Float) this.E;
                x.d0 d0Var = (x.d0) this.B;
                if (!f.equals(e0Var.A) || !f2.equals(e0Var.B)) {
                    e0Var.A = f;
                    e0Var.B = f2;
                    e0Var.D = new h1(d0Var, f, f2);
                    e0Var.H.b.setValue(Boolean.TRUE);
                    e0Var.E = false;
                    e0Var.F = true;
                }
                return g00.b0.a;
        }
        return g00.b0.a;
    }
}
