package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class d0 extends l implements SubMenu {
    public final n A;

    public final l f11397z;

    public d0(Context context, l lVar, n nVar) {
        super(context);
        this.f11397z = lVar;
        this.A = nVar;
    }

    @Override
    public final boolean d(n nVar) {
        return this.f11397z.d(nVar);
    }

    @Override
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f11397z.e(lVar, menuItem);
    }

    @Override
    public final boolean f(n nVar) {
        return this.f11397z.f(nVar);
    }

    @Override
    public final MenuItem getItem() {
        return this.A;
    }

    @Override
    public final String j() {
        n nVar = this.A;
        int i10 = nVar != null ? nVar.f11424a : 0;
        if (i10 == 0) {
            return null;
        }
        return g4.c.f(i10, "android:menu:actionviewstates:");
    }

    @Override
    public final l k() {
        return this.f11397z.k();
    }

    @Override
    public final boolean m() {
        return this.f11397z.m();
    }

    @Override
    public final boolean n() {
        return this.f11397z.n();
    }

    @Override
    public final boolean o() {
        return this.f11397z.o();
    }

    @Override
    public final void setGroupDividerEnabled(boolean z10) {
        this.f11397z.setGroupDividerEnabled(z10);
    }

    @Override
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }

    @Override
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override
    public final void setQwertyMode(boolean z10) {
        this.f11397z.setQwertyMode(z10);
    }
}
