package v0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public final class j extends ActionMode.Callback2 implements ActionMode.Callback {

    public final d f15328a;

    public j(d dVar) {
        this.f15328a = dVar;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f15328a.getClass();
        return false;
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f15328a.a(menu);
        return menu.size() > 0;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f15328a.f15310a.close();
    }

    @Override
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        h2.c cVar = (h2.c) this.f15328a.f15312c.invoke();
        rect.set(Math.round(cVar.f6546a), Math.round(cVar.f6547b), Math.round(cVar.f6548c), Math.round(cVar.f6549d));
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f15328a.a(menu);
    }
}
