package l6;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import ri.t1;

public final class m {

    public final LinkedHashMap f10037a = new LinkedHashMap();

    public final n f10038b;

    public m(n nVar) {
        this.f10038b = nVar;
    }

    public final Object a(Context context, String str, m00.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.D = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objA = jVar.B;
        l00.a aVar = l00.a.A;
        int i11 = jVar.D;
        if (i11 == 0) {
            t1.O(objA);
            w wVar = this.f10038b.f10041c;
            jVar.A = str;
            jVar.D = 1;
            objA = wVar.a(context, str, jVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = jVar.A;
            t1.O(objA);
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        d6.r rVar = (d6.r) this.f10037a.get(str);
        return Boolean.valueOf((rVar != null ? rVar.f4682b.get() : false) && zBooleanValue);
    }

    public final java.lang.Object b(d6.r r13, m00.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: l6.m.b(d6.r, m00.c):java.lang.Object");
    }

    public final Object c(Context context, d6.r rVar, m00.c cVar) throws Throwable {
        l lVar;
        Context context2;
        n nVar = this.f10038b;
        w wVar = nVar.f10041c;
        Class cls = nVar.f10039a;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.D = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.B;
        l00.a aVar = l00.a.A;
        int i11 = lVar.D;
        g00.b0 b0Var = g00.b0.a;
        if (i11 == 0) {
            t1.O(obj);
            d6.r rVar2 = (d6.r) this.f10037a.put(rVar.f4681a, rVar);
            if (rVar2 != null) {
                rVar2.f4684d.f((Throwable) null);
                rVar2.f4682b.set(false);
                rVar2.m.i((CancellationException) null);
            }
            za.y yVar = (za.y) ((za.x) new za.x(cls).h((za.g) nVar.f10040b.invoke(nVar, rVar))).b();
            String str = rVar.f4681a;
            za.l lVar2 = za.l.A;
            lVar.A = context;
            lVar.D = 1;
            wVar.getClass();
            kotlin.jvm.internal.m.e(context, "context");
            Object objQ = ab.a0.q((d4.k) ab.y.l0(context).x(str, lVar2, yVar).f17350a, lVar);
            if (objQ != aVar) {
                objQ = b0Var;
            }
            if (objQ != aVar) {
                context2 = context;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        context2 = lVar.A;
        t1.O(obj);
        lVar.A = null;
        lVar.D = 2;
        za.l lVar3 = za.l.B;
        za.x xVar = (za.x) new za.x(cls).g(3650L, TimeUnit.DAYS);
        xVar.f17385c.f7013j = new za.e(new ib.f(null), za.w.A, true, false, false, false, -1L, -1L, h00.q.r1(new LinkedHashSet()));
        za.y yVar2 = (za.y) xVar.b();
        wVar.getClass();
        kotlin.jvm.internal.m.e(context2, "context");
        Object objQ2 = ab.a0.q((d4.k) ab.y.l0(context2).x("sessionWorkerKeepEnabled", lVar3, yVar2).f17350a, lVar);
        if (objQ2 != aVar) {
            objQ2 = b0Var;
        }
        if (objQ2 != aVar) {
            objQ2 = b0Var;
        }
        return objQ2 == aVar ? aVar : b0Var;
    }
}
