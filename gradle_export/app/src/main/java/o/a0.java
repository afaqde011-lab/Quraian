package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import u.s0;

public class a0 extends c3.b implements Menu {

    public final l f11396c;

    public a0(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f11396c = lVar;
    }

    @Override
    public final MenuItem add(int i10) {
        return i(this.f11396c.add(i10));
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return i(this.f11396c.add(i10, i11, i12, i13));
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return i(this.f11396c.a(i10, i11, i12, charSequence));
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return i(this.f11396c.a(0, 0, 0, charSequence));
    }

    @Override
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f11396c.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = i(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override
    public final SubMenu addSubMenu(int i10) {
        return this.f11396c.addSubMenu(i10);
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f11396c.addSubMenu(i10, i11, i12, i13);
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f11396c.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f11396c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override
    public final void clear() {
        s0 s0Var = (s0) this.f2625b;
        if (s0Var != null) {
            s0Var.clear();
        }
        this.f11396c.clear();
    }

    @Override
    public final void close() {
        this.f11396c.close();
    }

    @Override
    public final MenuItem findItem(int i10) {
        return i(this.f11396c.findItem(i10));
    }

    @Override
    public final MenuItem getItem(int i10) {
        return i(this.f11396c.getItem(i10));
    }

    @Override
    public final boolean hasVisibleItems() {
        return this.f11396c.hasVisibleItems();
    }

    @Override
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f11396c.isShortcutKey(i10, keyEvent);
    }

    @Override
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f11396c.performIdentifierAction(i10, i11);
    }

    @Override
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f11396c.performShortcut(i10, keyEvent, i11);
    }

    @Override
    public final void removeGroup(int i10) {
        if (((s0) this.f2625b) != null) {
            int i11 = 0;
            while (true) {
                s0 s0Var = (s0) this.f2625b;
                if (i11 >= s0Var.C) {
                    break;
                }
                if (((s4.a) s0Var.g(i11)).getGroupId() == i10) {
                    ((s0) this.f2625b).h(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f11396c.removeGroup(i10);
    }

    @Override
    public final void removeItem(int i10) {
        if (((s0) this.f2625b) != null) {
            int i11 = 0;
            while (true) {
                s0 s0Var = (s0) this.f2625b;
                if (i11 >= s0Var.C) {
                    break;
                }
                if (((s4.a) s0Var.g(i11)).getItemId() == i10) {
                    ((s0) this.f2625b).h(i11);
                    break;
                }
                i11++;
            }
        }
        this.f11396c.removeItem(i10);
    }

    @Override
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f11396c.setGroupCheckable(i10, z10, z11);
    }

    @Override
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f11396c.setGroupEnabled(i10, z10);
    }

    @Override
    public final void setGroupVisible(int i10, boolean z10) {
        this.f11396c.setGroupVisible(i10, z10);
    }

    @Override
    public final void setQwertyMode(boolean z10) {
        this.f11396c.setQwertyMode(z10);
    }

    @Override
    public final int size() {
        return this.f11396c.size();
    }
}
