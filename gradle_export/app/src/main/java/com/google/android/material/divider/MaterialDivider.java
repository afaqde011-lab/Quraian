package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.measurement.g4;
import ng.j;
import sg.i;
import xg.a;

public class MaterialDivider extends View {
    public final i A;
    public int B;
    public int C;
    public int D;
    public int E;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969507, 2131952915), attributeSet, 2130969507);
        Context context2 = getContext();
        this.A = new i();
        TypedArray typedArrayE = j.e(context2, attributeSet, zf.a.f17440p, 2130969507, 2131952915, new int[0]);
        this.B = typedArrayE.getDimensionPixelSize(3, getResources().getDimensionPixelSize(2131166051));
        this.D = typedArrayE.getDimensionPixelOffset(2, 0);
        this.E = typedArrayE.getDimensionPixelOffset(1, 0);
        setDividerColor(g4.J(context2, typedArrayE, 0).getDefaultColor());
        typedArrayE.recycle();
    }

    public int getDividerColor() {
        return this.C;
    }

    public int getDividerInsetEnd() {
        return this.E;
    }

    public int getDividerInsetStart() {
        return this.D;
    }

    public int getDividerThickness() {
        return this.B;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.E : this.D;
        if (z10) {
            width = getWidth();
            i10 = this.D;
        } else {
            width = getWidth();
            i10 = this.E;
        }
        int i12 = width - i10;
        int bottom = getBottom() - getTop();
        i iVar = this.A;
        iVar.setBounds(i11, 0, i12, bottom);
        iVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.B;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.C != i10) {
            this.C = i10;
            this.A.m(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(getContext().getColor(i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.E = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.D = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.B != i10) {
            this.B = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
