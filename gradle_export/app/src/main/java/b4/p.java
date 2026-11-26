package b4;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.Owner;
import l1.e0;

public final class p extends kotlin.jvm.internal.n implements u00.a {
    public final Context A;
    public final u00.k B;
    public final e0 C;
    public final y1.f D;
    public final int E;
    public final View F;

    public p(Context context, u00.k kVar, e0 e0Var, y1.f fVar, int i10, View view) {
        super(0);
        this.A = context;
        this.B = kVar;
        this.C = e0Var;
        this.D = fVar;
        this.E = i10;
        this.F = view;
    }

    public final Object invoke() {
        KeyEvent.Callback callback = this.F;
        kotlin.jvm.internal.m.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new z(this.A, this.B, this.C, this.D, this.E, (Owner) callback).getLayoutNode();
    }
}
