package gv;

import android.view.View;

public final class a1 implements u00.n {
    public final kotlin.jvm.internal.v A;
    public final kotlin.jvm.internal.w B;
    public final float C;
    public final boolean D;
    public final z00.a E;
    public final float F;
    public final kotlin.jvm.internal.v G;
    public final View H;
    public final l1.z0 I;

    public a1(kotlin.jvm.internal.v vVar, kotlin.jvm.internal.w wVar, float f3, boolean z11, z00.a aVar, float f11, kotlin.jvm.internal.v vVar2, View view, l1.z0 z0Var) {
        this.A = vVar;
        this.B = wVar;
        this.C = f3;
        this.D = z11;
        this.E = aVar;
        this.F = f11;
        this.G = vVar2;
        this.H = view;
        this.I = z0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        v2.s change = (v2.s) obj;
        ((Float) obj2).getClass();
        kotlin.jvm.internal.m.e(change, "change");
        change.a();
        boolean z11 = true;
        this.A.A = true;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (change.f21253c >> 32));
        float f3 = this.C;
        boolean z12 = this.D;
        z00.a aVar = this.E;
        float fI = p.I(fIntBitsToFloat, f3, z12, aVar, this.F);
        kotlin.jvm.internal.w wVar = this.B;
        wVar.A = fI;
        if (fI > aVar.A && fI < aVar.B) {
            z11 = false;
        }
        kotlin.jvm.internal.v vVar = this.G;
        if (z11 && !vVar.A) {
            this.H.performHapticFeedback(4);
        }
        vVar.A = z11;
        ((u00.k) this.I.getValue()).invoke(Float.valueOf(wVar.A));
        return g00.b0.f7770a;
    }
}
