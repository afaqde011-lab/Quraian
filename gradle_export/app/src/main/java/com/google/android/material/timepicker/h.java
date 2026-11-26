package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public abstract class h extends ConstraintLayout {
    public final g S;
    public int T;
    public final sg.i U;

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969504);
        LayoutInflater.from(context).inflate(2131559072, this);
        sg.i iVar = new sg.i();
        this.U = iVar;
        sg.j jVar = new sg.j(0.5f);
        sg.l lVarF = iVar.B.f14150a.f();
        lVarF.f14174e = jVar;
        lVarF.f14175f = jVar;
        lVarF.f14176g = jVar;
        lVarF.f14177h = jVar;
        iVar.setShapeAppearanceModel(lVarF.a());
        this.U.m(ColorStateList.valueOf(-1));
        setBackground(this.U);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17447w, 2130969504, 0);
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.S = new Runnable() {
            @Override
            public final void run() {
                this.A.m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.S;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    public abstract void m();

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            g gVar = this.S;
            handler.removeCallbacks(gVar);
            handler.post(gVar);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        this.U.m(ColorStateList.valueOf(i10));
    }
}
