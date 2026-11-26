package gv;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.g3;

public final class b1 implements PointerInputEventHandler {
    public final l1.z0 a;
    public final l1.z0 b;
    public final l1.z0 c;
    public final l1.z0 d;
    public final float e;
    public final boolean f;
    public final z00.a g;
    public final float h;
    public final View i;
    public final l1.z0 j;

    public b1(l1.z0 z0Var, l1.z0 z0Var2, l1.z0 z0Var3, l1.z0 z0Var4, float f, boolean z, z00.a aVar, float f2, View view, l1.z0 z0Var5) {
        this.a = z0Var;
        this.b = z0Var2;
        this.c = z0Var3;
        this.d = z0Var4;
        this.e = f;
        this.f = z;
        this.g = aVar;
        this.h = f2;
        this.i = view;
        this.j = z0Var5;
    }

    public final Object invoke(v2.v vVar, k00.c cVar) {
        final kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
        final kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        l1.z0 z0Var = this.a;
        wVar.A = ((Number) z0Var.getValue()).floatValue();
        final kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
        l1.z0 z0Var2 = this.b;
        l1.z0 z0Var3 = this.c;
        cz.f fVar = new cz.f(vVar2, wVar, vVar3, z0Var, z0Var2, z0Var3, 1);
        g1.a1 a1Var = new g1.a1(vVar2, wVar, z0Var2, z0Var3, this.d);
        z0 z0Var4 = new z0(z0Var2, z0Var3, 0);
        final float f = this.e;
        final boolean z = this.f;
        final z00.a aVar = this.g;
        final float f2 = this.h;
        final View view = this.i;
        final l1.z0 z0Var5 = this.j;
        ?? r0 = new u00.n() {
            @Override
            public final Object invoke(Object obj, Object obj2) {
                v2.s change = (v2.s) obj;
                ((Float) obj2).getClass();
                kotlin.jvm.internal.m.e(change, "change");
                change.a();
                boolean z2 = true;
                vVar2.A = true;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (change.c >> 32));
                float f3 = f;
                boolean z3 = z;
                z00.a aVar2 = aVar;
                float fI = p.I(fIntBitsToFloat, f3, z3, aVar2, f2);
                kotlin.jvm.internal.w wVar2 = wVar;
                wVar2.A = fI;
                if (fI > aVar2.A && fI < aVar2.B) {
                    z2 = false;
                }
                kotlin.jvm.internal.v vVar4 = vVar3;
                if (z2 && !vVar4.A) {
                    view.performHapticFeedback(4);
                }
                vVar4.A = z2;
                ((u00.k) z0Var5.getValue()).invoke(Float.valueOf(wVar2.A));
                return g00.b0.a;
            }
        };
        float f3 = d0.i0.a;
        Object objE = g3.e(vVar, new d0.e0(fVar, (a1) r0, a1Var, z0Var4, (k00.c) null), cVar);
        l00.a aVar2 = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objE != aVar2) {
            objE = b0Var;
        }
        return objE == aVar2 ? objE : b0Var;
    }
}
