package androidx.appcompat.widget;

import a50.d;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import p.h2;
import p.n;

public class SearchView$SearchAutoComplete extends n {
    public int E;
    public boolean F;
    public final d G;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = new d(this, 15);
        this.E = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i10 < 600) {
            return (i10 < 640 || i11 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override
    public final boolean enoughToFilter() {
        return this.E <= 0 || super.enoughToFilter();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.F) {
            d dVar = this.G;
            removeCallbacks(dVar);
            post(dVar);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        throw null;
    }

    @Override
    public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i10, keyEvent);
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            throw null;
        }
    }

    @Override
    public final void performCompletion() {
    }

    @Override
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z10) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        d dVar = this.G;
        if (!z10) {
            this.F = false;
            removeCallbacks(dVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.F = true;
                return;
            }
            this.F = false;
            removeCallbacks(dVar);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(h2 h2Var) {
    }

    @Override
    public void setThreshold(int i10) {
        super.setThreshold(i10);
        this.E = i10;
    }
}
