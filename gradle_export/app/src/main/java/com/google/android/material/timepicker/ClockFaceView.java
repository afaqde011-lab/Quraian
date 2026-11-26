package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.g4;
import com.google.protobuf.RuntimeVersion;
import j4.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z4.j0;

class ClockFaceView extends h implements f {
    public final ClockHandView V;
    public final Rect W;

    public final RectF f4230a0;

    public final Rect f4231b0;

    public final SparseArray f4232c0;

    public final c f4233d0;

    public final int[] f4234e0;

    public final float[] f4235f0;

    public final int f4236g0;

    public final int f4237h0;

    public final int f4238i0;

    public final int f4239j0;

    public final String[] f4240k0;

    public float f4241l0;

    public final ColorStateList f4242m0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new Rect();
        this.f4230a0 = new RectF();
        this.f4231b0 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f4232c0 = sparseArray;
        this.f4235f0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17430d, 2130969504, 2131952950);
        Resources resources = getResources();
        ColorStateList colorStateListJ = g4.J(context, typedArrayObtainStyledAttributes, 1);
        this.f4242m0 = colorStateListJ;
        LayoutInflater.from(context).inflate(2131559071, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131362781);
        this.V = clockHandView;
        this.f4236g0 = resources.getDimensionPixelSize(2131166041);
        int colorForState = colorStateListJ.getColorForState(new int[]{R.attr.state_selected}, colorStateListJ.getDefaultColor());
        this.f4234e0 = new int[]{colorForState, colorForState, colorStateListJ.getDefaultColor()};
        clockHandView.C.add(this);
        int defaultColor = n4.b.b(context, 2131100599).getDefaultColor();
        ColorStateList colorStateListJ2 = g4.J(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListJ2 != null ? colorStateListJ2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f4233d0 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, RuntimeVersion.SUFFIX);
        this.f4240k0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.max(this.f4240k0.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.f4240k0.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(2131559070, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f4240k0[i10]);
                textView.setTag(2131362797, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(2131362782, Integer.valueOf(i11));
                z10 = i11 > 1 ? true : z10;
                j0.g(textView, this.f4233d0);
                textView.setTextColor(this.f4242m0);
            }
        }
        ClockHandView clockHandView2 = this.V;
        if (clockHandView2.B && !z10) {
            clockHandView2.M = 1;
        }
        clockHandView2.B = z10;
        clockHandView2.invalidate();
        this.f4237h0 = resources.getDimensionPixelSize(2131166070);
        this.f4238i0 = resources.getDimensionPixelSize(2131166071);
        this.f4239j0 = resources.getDimensionPixelSize(2131166048);
    }

    @Override
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != 2131362051 && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(2131362782);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.T * 0.66f) : this.T;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id2);
                HashMap map2 = nVar.f8155c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id2), new j4.i());
                }
                j4.j jVar = ((j4.i) map2.get(Integer.valueOf(id2))).f8082d;
                jVar.f8122y = 2131362051;
                jVar.f8123z = iRound;
                jVar.A = size;
                size += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.f4232c0;
            if (i12 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i12)).setVisibility(0);
            i12++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.V.G;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f4232c0;
            int size = sparseArray.size();
            rect = this.W;
            rectF = this.f4230a0;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f3) {
                    textView = textView2;
                    f3 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f4231b0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f4234e0, this.f4235f0, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f4240k0.length, false, 1));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f4239j0 / Math.max(Math.max(this.f4237h0 / displayMetrics.heightPixels, this.f4238i0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
