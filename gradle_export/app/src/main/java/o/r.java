package o;

import android.view.MenuItem;

public final class r implements MenuItem.OnMenuItemClickListener {

    public final MenuItem.OnMenuItemClickListener f11452a;

    public final s f11453b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11453b = sVar;
        this.f11452a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f11452a.onMenuItemClick(this.f11453b.i(menuItem));
    }
}
