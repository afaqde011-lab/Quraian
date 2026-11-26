package wc;

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
import kotlin.jvm.internal.m;

public final class d implements Window.Callback {
    @Override
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onActionModeFinished(ActionMode actionMode) {
    }

    @Override
    public final void onActionModeStarted(ActionMode actionMode) {
    }

    @Override
    public final void onAttachedToWindow() {
    }

    @Override
    public final void onContentChanged() {
    }

    @Override
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        m.e(menu, "menu");
        return false;
    }

    @Override
    public final View onCreatePanelView(int i10) {
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        m.e(menuItem, "item");
        return false;
    }

    @Override
    public final boolean onMenuOpened(int i10, Menu menu) {
        m.e(menu, "menu");
        return false;
    }

    @Override
    public final void onPanelClosed(int i10, Menu menu) {
        m.e(menu, "menu");
    }

    @Override
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        m.e(menu, "menu");
        return false;
    }

    @Override
    public final boolean onSearchRequested() {
        return false;
    }

    @Override
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return false;
    }

    @Override
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return null;
    }
}
