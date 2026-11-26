package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import z4.j0;

final class MaterialCalendarGridView extends GridView {
    public final boolean A;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        y.c(null);
        if (o.l(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(2131361932);
            setNextFocusRightId(2131362063);
        }
        this.A = o.l(getContext(), 2130969633);
        j0.g(this, new g(2));
    }

    public final r a() {
        return (r) super.getAdapter();
    }

    @Override
    public final Adapter getAdapter() {
        return (r) super.getAdapter();
    }

    @Override
    public final ListAdapter getAdapter() {
        return (r) super.getAdapter();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((r) super.getAdapter()).notifyDataSetChanged();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        r rVar = (r) super.getAdapter();
        rVar.getClass();
        int iMax = Math.max(rVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(rVar.c(), getLastVisiblePosition());
        rVar.getItem(iMax);
        rVar.getItem(iMin);
        throw null;
    }

    @Override
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            setSelection(((r) super.getAdapter()).c());
        } else if (i10 == 130) {
            setSelection(((r) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((r) super.getAdapter()).a() && selectedItemPosition <= ((r) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(((r) super.getAdapter()).a());
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.A) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override
    public final void setSelection(int i10) {
        if (i10 < ((r) super.getAdapter()).a()) {
            super.setSelection(((r) super.getAdapter()).a());
        } else {
            super.setSelection(i10);
        }
    }
}
