package d6;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class r {

    public final String f4681a;

    public final AtomicBoolean f4682b;

    public final AtomicBoolean f4683c;

    public final c40.h f4684d;

    public final p0 f4685e;

    public final h f4686f;

    public final m6.a f4687g;

    public final f2 f4688h;

    public final boolean f4689i;

    public final l1.i1 f4690j;

    public final l1.i1 f4691k;
    public Object l;
    public final a40.f1 m;

    public final d40.p1 f4692n;

    public r(p0 p0Var, h hVar, Bundle bundle) {
        m6.f fVar = m6.f.f10566a;
        f2 f2VarC = p0Var.c();
        this.f4681a = w.i(hVar.f4631a);
        this.f4682b = new AtomicBoolean(true);
        this.f4683c = new AtomicBoolean(false);
        this.f4684d = ri.t1.b(Integer.MAX_VALUE, 6, null);
        this.f4685e = p0Var;
        this.f4686f = hVar;
        this.f4687g = fVar;
        this.f4688h = f2VarC;
        this.f4689i = true;
        if (w.l(hVar)) {
            throw new IllegalArgumentException("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
        }
        l1.c cVar = l1.c.D;
        this.f4690j = new l1.i1(null, cVar);
        this.f4691k = new l1.i1(bundle, cVar);
        this.l = h00.y.A;
        this.m = a40.c0.d();
        this.f4692n = d40.o.c((Object) null);
    }

    public static java.lang.Object b(d6.r r19, android.content.Context r20, b6.j r21, m00.c r22) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: d6.r.b(d6.r, android.content.Context, b6.j, m00.c):java.lang.Object");
    }

    public static Object c(r rVar, Context context, Object obj, m00.c cVar) throws Throwable {
        o oVar;
        z1.b bVarC;
        z1.b bVarC2;
        z1.b bVarC3;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.D = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(rVar, cVar);
            }
        } else {
            oVar = new o(rVar, cVar);
        }
        Object objC = oVar.B;
        l00.a aVar = l00.a.A;
        int i11 = oVar.D;
        g00.b0 b0Var = g00.b0.a;
        g00.b0 b0Var2 = null;
        if (i11 == 0) {
            ri.t1.O(objC);
            if (!(obj instanceof l)) {
                if (obj instanceof k) {
                    z1.f fVarJ = z1.l.j();
                    z1.b bVar = fVarJ instanceof z1.b ? (z1.b) fVarJ : null;
                    if (bVar == null || (bVarC2 = bVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        z1.f fVarJ2 = bVarC2.j();
                        try {
                            rVar.f4691k.setValue(((k) obj).f4658a);
                            z1.f.q(fVarJ2);
                            bVarC2.w().e();
                            bVarC2.c();
                            return b0Var;
                        } catch (Throwable th2) {
                            z1.f.q(fVarJ2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        bVarC2.c();
                        throw th3;
                    }
                }
                if (obj instanceof j) {
                    z1.f fVarJ3 = z1.l.j();
                    z1.b bVar2 = fVarJ3 instanceof z1.b ? (z1.b) fVarJ3 : null;
                    if (bVar2 == null || (bVarC = bVar2.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        z1.f fVarJ4 = bVarC.j();
                        try {
                            List list = (List) rVar.l.get(((j) obj).f4653a);
                            if (list != null) {
                                Iterator it = list.iterator();
                                if (it.hasNext()) {
                                    throw null;
                                }
                                b0Var2 = b0Var;
                            }
                            z1.f.q(fVarJ4);
                            bVarC.w().e();
                            bVarC.c();
                            if (b0Var2 == null) {
                                m00.f.a(Log.w("AppWidgetSession", "Triggering Action(" + ((j) obj).f4653a + ") for session(" + rVar.f4681a + ") failed"));
                                return b0Var;
                            }
                        } catch (Throwable th4) {
                            z1.f.q(fVarJ4);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        bVarC.c();
                        throw th5;
                    }
                } else {
                    if (!(obj instanceof m)) {
                        throw new IllegalArgumentException("Sent unrecognized event type " + obj.getClass() + " to AppWidgetSession");
                    }
                    a40.f1 f1Var = ((m) obj).f4677a;
                    if (f1Var.a()) {
                        f1Var.S(g00.b0.a);
                    }
                }
                return b0Var;
            }
            rVar.f4685e.getClass();
            m6.a aVar2 = rVar.f4687g;
            String str = rVar.f4681a;
            oVar.A = rVar;
            oVar.D = 1;
            objC = ((m6.f) aVar2).c(context, m6.h.f10569a, str, oVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = oVar.A;
            ri.t1.O(objC);
        }
        z1.f fVarJ5 = z1.l.j();
        z1.b bVar3 = fVarJ5 instanceof z1.b ? (z1.b) fVarJ5 : null;
        if (bVar3 == null || (bVarC3 = bVar3.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            z1.f fVarJ6 = bVarC3.j();
            try {
                rVar.f4690j.setValue(objC);
                z1.f.q(fVarJ6);
                bVarC3.w().e();
                bVarC3.c();
                return b0Var;
            } catch (Throwable th6) {
                z1.f.q(fVarJ6);
                throw th6;
            }
        } catch (Throwable th7) {
            bVarC3.c();
            throw th7;
        }
    }

    public static java.lang.Object e(d6.r r6, java.util.ArrayList r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: d6.r.e(d6.r, java.util.ArrayList, m00.c):java.lang.Object");
    }

    public final void a(Context context, Throwable th2) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th2);
        if (!this.f4689i) {
            throw th2;
        }
        int i10 = this.f4686f.f4631a;
        this.f4685e.getClass();
        AppWidgetManager.getInstance(context).updateAppWidget(i10, new RemoteViews(context.getPackageName(), 2131558808));
    }

    public final java.lang.Object d(android.content.Context r7, b1.l r8, m00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: d6.r.d(android.content.Context, b1.l, m00.c):java.lang.Object");
    }

    public final Object f(Object obj, m00.c cVar) {
        Object objM = this.f4684d.m(obj, cVar);
        return objM == l00.a.A ? objM : g00.b0.a;
    }

    public final Object g(m00.c cVar) {
        q qVar;
        m mVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.D = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.B;
        Object obj2 = l00.a.A;
        int i11 = qVar.D;
        if (i11 == 0) {
            ri.t1.O(obj);
            m mVar2 = new m(new a40.f1(this.m));
            qVar.A = mVar2;
            qVar.D = 1;
            if (f(mVar2, qVar) == obj2) {
                return obj2;
            }
            mVar = mVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = qVar.A;
            ri.t1.O(obj);
        }
        return mVar.f4677a;
    }
}
