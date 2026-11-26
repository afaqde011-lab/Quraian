package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.j;
import ng.a;
import p.v;
import z4.j0;

public class CheckableImageButton extends v implements Checkable {
    public static final int[] G = {R.attr.state_checked};
    public boolean D;
    public boolean E;
    public boolean F;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969276);
        this.E = true;
        this.F = true;
        j0.g(this, new j(this, 3));
    }

    @Override
    public final boolean isChecked() {
        return this.D;
    }

    @Override
    public final int[] onCreateDrawableState(int i10) {
        return this.D ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), G) : super.onCreateDrawableState(i10);
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.A);
        setChecked(aVar.C);
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.C = this.D;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override
    public void setChecked(boolean z10) {
        if (!this.E || this.D == z10) {
            return;
        }
        this.D = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.F = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        if (this.F) {
            super.setPressed(z10);
        }
    }

    @Override
    public final void toggle() {
        setChecked(!this.D);
    }
}
