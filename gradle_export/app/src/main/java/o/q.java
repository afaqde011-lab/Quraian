package o;

import android.view.MenuItem;

public final class q implements MenuItem.OnActionExpandListener {

    public final MenuItem.OnActionExpandListener f11450a;

    public final s f11451b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11451b = sVar;
        this.f11450a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f11450a.onMenuItemActionCollapse(this.f11451b.i(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f11450a.onMenuItemActionExpand(this.f11451b.i(menuItem));
    }
}
