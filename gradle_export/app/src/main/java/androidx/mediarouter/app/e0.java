package androidx.mediarouter.app;

import android.view.View;

public final class e0 implements View.OnClickListener {
    public final int A;
    public final q0 B;

    public e0(q0 q0Var, int i10) {
        this.A = i10;
        this.B = q0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.A) {
            case 0:
                this.B.dismiss();
                break;
            default:
                q0 q0Var = this.B;
                if (q0Var.J.g()) {
                    q0Var.G.getClass();
                    o9.c0.j(2);
                }
                q0Var.dismiss();
                break;
        }
    }
}
