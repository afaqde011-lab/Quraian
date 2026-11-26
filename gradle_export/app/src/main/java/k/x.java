package k;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public final class x implements Window.Callback {
    public final Window.Callback A;
    public j0 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final b0 F;

    public x(b0 b0Var, Window.Callback callback) {
        this.F = b0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.A = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.C = true;
            callback.onContentChanged();
        } finally {
            this.C = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.A.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.A.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        n.m.a(this.A, list, menu, i10);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.D;
        Window.Callback callback = this.A;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.F.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.A.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            b0 b0Var = this.F;
            b0Var.A();
            a aVar = b0Var.M;
            if (aVar == null || !aVar.i(keyCode, keyEvent)) {
                a0 a0Var = b0Var.f8350k0;
                if (a0Var == null || !b0Var.F(a0Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (b0Var.f8350k0 == null) {
                        a0 a0VarZ = b0Var.z(0);
                        b0Var.G(a0VarZ, keyEvent);
                        boolean zF = b0Var.F(a0VarZ, keyEvent.getKeyCode(), keyEvent);
                        a0VarZ.f8336k = false;
                        if (zF) {
                        }
                    }
                    return false;
                }
                a0 a0Var2 = b0Var.f8350k0;
                if (a0Var2 != null) {
                    a0Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.A.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
        this.A.onActionModeFinished(actionMode);
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
        this.A.onActionModeStarted(actionMode);
    }

    @Override
    public final void onAttachedToWindow() {
        this.A.onAttachedToWindow();
    }

    @Override
    public final void onContentChanged() {
        if (this.C) {
            this.A.onContentChanged();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof o.l)) {
            return this.A.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override
    public final View onCreatePanelView(int i10) {
        j0 j0Var = this.B;
        if (j0Var != null) {
            View view = i10 == 0 ? new View(j0Var.f8413a.f8414a.f12208a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.A.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.A.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.A.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        b(i10, menu);
        b0 b0Var = this.F;
        if (i10 == 108) {
            b0Var.A();
            a aVar = b0Var.M;
            if (aVar != null) {
                aVar.c(true);
            }
        } else {
            b0Var.getClass();
        }
        return true;
    }

    @Override
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.E) {
            this.A.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        b0 b0Var = this.F;
        if (i10 == 108) {
            b0Var.A();
            a aVar = b0Var.M;
            if (aVar != null) {
                aVar.c(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            a0 a0VarZ = b0Var.z(i10);
            if (a0VarZ.m) {
                b0Var.r(a0VarZ, false);
            }
        }
    }

    @Override
    public final void onPointerCaptureChanged(boolean z10) {
        n.n.a(this.A, z10);
    }

    @Override
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        o.l lVar = menu instanceof o.l ? (o.l) menu : null;
        if (i10 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f11423x = true;
        }
        j0 j0Var = this.B;
        if (j0Var != null && i10 == 0) {
            k0 k0Var = j0Var.f8413a;
            if (!k0Var.f8417d) {
                k0Var.f8414a.l = true;
                k0Var.f8417d = true;
            }
        }
        boolean zOnPreparePanel = this.A.onPreparePanel(i10, view, menu);
        if (lVar != null) {
            lVar.f11423x = false;
        }
        return zOnPreparePanel;
    }

    @Override
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        o.l lVar = this.F.z(0).f8333h;
        if (lVar != null) {
            d(list, lVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override
    public final boolean onSearchRequested() {
        return this.A.onSearchRequested();
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n.l.a(this.A, searchEvent);
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.A.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        this.A.onWindowFocusChanged(z10);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return n.l.b(this.A, callback, i10);
        }
        b0 b0Var = this.F;
        oj.q qVar = new oj.q(b0Var.I, callback);
        n.b bVarL = b0Var.l(qVar);
        if (bVarL != null) {
            return qVar.z(bVarL);
        }
        return null;
    }
}
