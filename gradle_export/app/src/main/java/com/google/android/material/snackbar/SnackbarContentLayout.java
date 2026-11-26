package com.google.android.material.snackbar;

import ag.a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ze.d;

public class SnackbarContentLayout extends LinearLayout {
    public TextView A;
    public Button B;
    public int C;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d.Q(context, 2130969594, a.f466b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.A.getPaddingTop() == i11 && this.A.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.A;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.B;
    }

    public TextView getMessageView() {
        return this.A;
    }

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.A = (TextView) findViewById(2131363016);
        this.B = (Button) findViewById(2131363015);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165359);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165358);
        Layout layout = this.A.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.C <= 0 || this.B.getMeasuredWidth() <= this.C) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.C = i10;
    }
}
