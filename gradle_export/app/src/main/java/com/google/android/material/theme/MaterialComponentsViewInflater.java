package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.button.MaterialButton;
import hg.c;
import k.g0;
import ng.j;
import p.a0;
import p.n;
import p.o;
import p.p;
import p.v0;
import pg.a;
import vg.s;

public class MaterialComponentsViewInflater extends g0 {
    @Override
    public final n a(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    @Override
    public final o b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override
    public final p c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override
    public final a0 d(Context context, AttributeSet attributeSet) {
        a aVar = new a(xg.a.a(context, attributeSet, 2130969704, 2131952883), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray typedArrayE = j.e(context2, attributeSet, zf.a.f17441q, 2130969704, 2131952883, new int[0]);
        if (typedArrayE.hasValue(0)) {
            aVar.setButtonTintList(g4.J(context2, typedArrayE, 0));
        }
        aVar.F = typedArrayE.getBoolean(1, false);
        typedArrayE.recycle();
        return aVar;
    }

    @Override
    public final v0 e(Context context, AttributeSet attributeSet) {
        wg.a aVar = new wg.a(xg.a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (z3.O(context2, 2130969957, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = zf.a.f17445u;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iG = wg.a.g(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iG == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, zf.a.f17444t);
                    int iG2 = wg.a.g(aVar.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iG2 >= 0) {
                        aVar.setLineHeight(iG2);
                    }
                }
            }
        }
        return aVar;
    }
}
