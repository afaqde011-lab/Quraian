package androidx.mediarouter.app;

import android.view.View;

public final class a0 implements View.OnClickListener {
    public final o9.b0 A;
    public final b0 B;

    public a0(b0 b0Var, o9.b0 b0Var2) {
        this.B = b0Var;
        this.A = b0Var2;
    }

    @Override
    public final void onClick(View view) {
        b0 b0Var = this.B;
        d0 d0Var = b0Var.f1718y.f1725g;
        o9.b0 b0Var2 = this.A;
        d0Var.O = b0Var2;
        b0Var2.l(true);
        b0Var.f1715v.setVisibility(4);
        b0Var.f1716w.setVisibility(0);
    }
}
