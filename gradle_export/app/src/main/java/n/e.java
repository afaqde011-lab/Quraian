package n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public final class e extends b implements o.j {
    public Context C;
    public ActionBarContextView D;
    public h1.l E;
    public WeakReference F;
    public boolean G;
    public o.l H;

    @Override
    public final void a() {
        if (this.G) {
            return;
        }
        this.G = true;
        this.E.n0(this);
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
        return this.H;
    }

    @Override
    public final MenuInflater d() {
        return new i(this.D.getContext());
    }

    @Override
    public final CharSequence e() {
        return this.D.getSubtitle();
    }

    @Override
    public final CharSequence f() {
        return this.D.getTitle();
    }

    @Override
    public final void g() {
        this.E.L(this, this.H);
    }

    @Override
    public final boolean h() {
        return this.D.S;
    }

    @Override
    public final void i(View view) {
        this.D.setCustomView(view);
        this.F = view != null ? new WeakReference(view) : null;
    }

    @Override
    public final void j(int i10) {
        k(this.C.getString(i10));
    }

    @Override
    public final void k(CharSequence charSequence) {
        this.D.setSubtitle(charSequence);
    }

    @Override
    public final void l(int i10) {
        m(this.C.getString(i10));
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.D.setTitle(charSequence);
    }

    @Override
    public final boolean n(o.l lVar, MenuItem menuItem) {
        return ((a) this.E.A).U(this, menuItem);
    }

    @Override
    public final void o(boolean z10) {
        this.B = z10;
        this.D.setTitleOptional(z10);
    }

    @Override
    public final void w(o.l lVar) {
        g();
        p.j jVar = this.D.D;
        if (jVar != null) {
            jVar.l();
        }
    }
}
