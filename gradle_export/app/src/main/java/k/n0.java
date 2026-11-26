package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public final class n0 extends n.b implements o.j {
    public final Context C;
    public final o.l D;
    public h1.l E;
    public WeakReference F;
    public final o0 G;

    public n0(o0 o0Var, Context context, h1.l lVar) {
        this.G = o0Var;
        this.C = context;
        this.E = lVar;
        o.l lVar2 = new o.l(context);
        lVar2.l = 1;
        this.D = lVar2;
        lVar2.f11406e = this;
    }

    @Override
    public final void a() {
        o0 o0Var = this.G;
        if (o0Var.f8436i != this) {
            return;
        }
        if (o0Var.f8441p) {
            o0Var.f8437j = this;
            o0Var.f8438k = this.E;
        } else {
            this.E.n0(this);
        }
        this.E = null;
        o0Var.t(false);
        ActionBarContextView actionBarContextView = o0Var.f8433f;
        if (actionBarContextView.K == null) {
            actionBarContextView.e();
        }
        o0Var.f8430c.setHideOnContentScrollEnabled(o0Var.f8446u);
        o0Var.f8436i = null;
    }

    @Override
    public final View b() {
        WeakReference weakReference = this.F;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override
    public final o.l c() {
        return this.D;
    }

    @Override
    public final MenuInflater d() {
        return new n.i(this.C);
    }

    @Override
    public final CharSequence e() {
        return this.G.f8433f.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.G.f8433f.getTitle();
    }

    @Override
    public final void g() {
        if (this.G.f8436i != this) {
            return;
        }
        o.l lVar = this.D;
        lVar.w();
        try {
            this.E.L(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override
    public final boolean h() {
        return this.G.f8433f.S;
    }

    @Override
    public final void i(View view) {
        this.G.f8433f.setCustomView(view);
        this.F = new WeakReference(view);
    }

    @Override
    public final void j(int i10) {
        k(this.G.f8428a.getResources().getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.G.f8433f.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.G.f8428a.getResources().getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.G.f8433f.setTitle(charSequence);
    }

    @Override
    public final boolean n(o.l lVar, MenuItem menuItem) {
        h1.l lVar2 = this.E;
        if (lVar2 != null) {
            return ((n.a) lVar2.A).U(this, menuItem);
        }
        return false;
    }

    @Override
    public final void o(boolean z10) {
        this.B = z10;
        this.G.f8433f.setTitleOptional(z10);
    }

    @Override
    public final void w(o.l lVar) {
        if (this.E == null) {
            return;
        }
        g();
        p.j jVar = this.G.f8433f.D;
        if (jVar != null) {
            jVar.l();
        }
    }
}
