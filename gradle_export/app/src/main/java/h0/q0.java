package h0;

import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

public final class q0 extends f7.e implements Runnable, z4.r, View.OnAttachStateChangeListener {
    public final m2 C;
    public boolean D;
    public boolean E;
    public z4.j1 F;

    public q0(m2 m2Var) {
        super(!m2Var.f6441t ? 1 : 0, 3);
        this.C = m2Var;
    }

    @Override
    public final z4.j1 B(View view, z4.j1 j1Var) {
        this.F = j1Var;
        m2 m2Var = this.C;
        i2 i2Var = m2Var.f6439r;
        z4.g1 g1Var = j1Var.f17202a;
        i2Var.f(c.I(g1Var.i(8)));
        if (!this.D && !this.E) {
            m2Var.f6440s.f(c.I(g1Var.i(8)));
            m2.b(m2Var, j1Var);
        }
        return m2Var.f6441t ? z4.j1.f17201b : j1Var;
    }

    @Override
    public final void m(z4.q0 q0Var) {
        this.D = false;
        this.E = false;
        z4.j1 j1Var = this.F;
        if (((WindowInsetsAnimation) q0Var.f17221a.B).getDurationMillis() > 0 && j1Var != null) {
            z4.g1 g1Var = j1Var.f17202a;
            m2 m2Var = this.C;
            m2Var.f6440s.f(c.I(g1Var.i(8)));
            m2Var.f6439r.f(c.I(g1Var.i(8)));
            m2.b(m2Var, j1Var);
        }
        this.F = null;
    }

    @Override
    public final void n(z4.q0 q0Var) {
        this.D = true;
        this.E = true;
    }

    @Override
    public final z4.j1 o(z4.j1 j1Var, List list) {
        m2 m2Var = this.C;
        m2.b(m2Var, j1Var);
        return m2Var.f6441t ? z4.j1.f17201b : j1Var;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override
    public final q3.e0 p(z4.q0 q0Var, q3.e0 e0Var) {
        this.D = false;
        return e0Var;
    }

    @Override
    public final void run() {
        if (this.D) {
            this.D = false;
            this.E = false;
            z4.j1 j1Var = this.F;
            if (j1Var != null) {
                m2 m2Var = this.C;
                m2Var.f6440s.f(c.I(j1Var.f17202a.i(8)));
                m2.b(m2Var, j1Var);
                this.F = null;
            }
        }
    }
}
