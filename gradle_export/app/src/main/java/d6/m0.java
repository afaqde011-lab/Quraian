package d6;

import android.content.Context;
import android.os.Bundle;

public final class m0 extends m00.i implements u00.n {
    public boolean A;
    public int B;
    public Object C;
    public final Context D;
    public final h E;
    public final p0 F;
    public final Bundle G;
    public final m00.i H;

    public m0(Context context, h hVar, p0 p0Var, Bundle bundle, u00.p pVar, k00.c cVar) {
        super(2, cVar);
        this.D = context;
        this.E = hVar;
        this.F = p0Var;
        this.G = bundle;
        this.H = (m00.i) pVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        m0 m0Var = new m0(this.D, this.E, this.F, this.G, this.H, cVar);
        m0Var.C = obj;
        return m0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l6.m) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l6.m mVar;
        boolean zBooleanValue;
        l6.m mVar2;
        boolean z10;
        Object objInvoke;
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        h hVar = this.E;
        Context context = this.D;
        if (i10 == 0) {
            ri.t1.O(obj);
            l6.m mVar3 = (l6.m) this.C;
            String strI = w.i(hVar.f4631a);
            this.C = mVar3;
            this.B = 1;
            Object objA = mVar3.a(context, strI, this);
            if (objA != aVar) {
                mVar = mVar3;
                obj = objA;
            }
            return aVar;
        }
        if (i10 == 1) {
            mVar = (l6.m) this.C;
            ri.t1.O(obj);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri.t1.O(obj);
                return obj;
            }
            z10 = this.A;
            mVar2 = (l6.m) this.C;
            ri.t1.O(obj);
        }
        zBooleanValue = z10;
        mVar = mVar2;
        r rVar = (r) mVar.f10037a.get(w.i(hVar.f4631a));
        kotlin.jvm.internal.m.c(rVar, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        this.C = null;
        this.B = 3;
        objInvoke = this.H.invoke(mVar, rVar, boolValueOf, this);
        if (objInvoke == aVar) {
            return aVar;
        }
        return objInvoke;
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            r rVar2 = (r) mVar.f10037a.get(w.i(hVar.f4631a));
            kotlin.jvm.internal.m.c(rVar2, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            this.C = null;
            this.B = 3;
            objInvoke = this.H.invoke(mVar, rVar2, boolValueOf2, this);
            if (objInvoke == aVar) {
                return objInvoke;
            }
        } else {
            r rVar3 = new r(this.F, hVar, this.G);
            this.C = mVar;
            this.A = zBooleanValue;
            this.B = 2;
            if (mVar.c(context, rVar3, this) != aVar) {
                mVar2 = mVar;
                z10 = zBooleanValue;
                zBooleanValue = z10;
                mVar = mVar2;
                r rVar4 = (r) mVar.f10037a.get(w.i(hVar.f4631a));
                kotlin.jvm.internal.m.c(rVar4, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession");
                Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                this.C = null;
                this.B = 3;
                objInvoke = this.H.invoke(mVar, rVar4, boolValueOf3, this);
                if (objInvoke == aVar) {
                    return objInvoke;
                }
            }
        }
        return aVar;
    }
}
