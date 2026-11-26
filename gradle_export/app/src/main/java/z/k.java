package z;

import android.content.Context;

public final class k {

    public final Context f16937a;

    public final y3.c f16938b;

    public final long f16939c;

    public final h0.n1 f16940d;

    public k(Context context, y3.c cVar, long j9, h0.n1 n1Var) {
        this.f16937a = context;
        this.f16938b = cVar;
        this.f16939c = j9;
        this.f16940d = n1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f16937a, kVar.f16937a) && kotlin.jvm.internal.m.a(this.f16938b, kVar.f16938b) && i2.t.c(this.f16939c, kVar.f16939c) && kotlin.jvm.internal.m.a(this.f16940d, kVar.f16940d);
    }

    public final int hashCode() {
        int iHashCode = (this.f16938b.hashCode() + (this.f16937a.hashCode() * 31)) * 31;
        int i10 = i2.t.f7168h;
        return this.f16940d.hashCode() + w.c.f(iHashCode, this.f16939c, 31);
    }
}
