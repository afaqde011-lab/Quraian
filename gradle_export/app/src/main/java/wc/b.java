package wc;

import android.app.Activity;
import android.view.ActionMode;
import android.view.GestureDetector;
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
import kotlin.jvm.internal.m;
import rc.f;
import tf.x;
import u00.n;

public class b implements Window.Callback {
    public final Window.Callback A;
    public final Activity B;
    public final List C;
    public final cd.b D;
    public final x E;
    public final GestureDetector F;
    public tc.c G;

    public b(Window.Callback callback, Activity activity, n nVar, List list, cd.b bVar, f fVar) {
        x xVar = new x(17);
        a aVar = new a(activity, nVar, bVar, list, fVar);
        GestureDetector gestureDetector = new GestureDetector(activity, aVar);
        m.e(list, "viewTargetLocators");
        m.e(bVar, "logger");
        m.e(fVar, "autocaptureState");
        this.A = callback;
        this.B = activity;
        this.C = list;
        this.D = bVar;
        this.E = xVar;
        this.F = gestureDetector;
        aVar.E = new b3.a(this, 29);
    }

    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.A.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.E.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            m.d(motionEventObtain, "obtain(...)");
            try {
                try {
                    this.F.onTouchEvent(motionEventObtain);
                } catch (Exception e3) {
                    this.D.a("Error handling touch event: " + e3);
                }
            } finally {
                motionEventObtain.recycle();
            }
        }
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
        this.A.onContentChanged();
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        m.e(menu, "menu");
        return this.A.onCreatePanelMenu(i10, menu);
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return this.A.onCreatePanelView(i10);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.A.onDetachedFromWindow();
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        m.e(menuItem, "item");
        return this.A.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        m.e(menu, "menu");
        return this.A.onMenuOpened(i10, menu);
    }

    @Override
    public final void onPanelClosed(int i10, Menu menu) {
        m.e(menu, "menu");
        this.A.onPanelClosed(i10, menu);
    }

    @Override
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        m.e(menu, "menu");
        return this.A.onPreparePanel(i10, view, menu);
    }

    @Override
    public final boolean onSearchRequested() {
        return this.A.onSearchRequested();
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.A.onSearchRequested(searchEvent);
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
        return this.A.onWindowStartingActionMode(callback);
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.A.onWindowStartingActionMode(callback, i10);
    }
}
