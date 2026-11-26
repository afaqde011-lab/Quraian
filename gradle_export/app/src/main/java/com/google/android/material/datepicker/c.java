package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;

public final class c {

    public final sg.f f4156a;

    public final sg.f f4157b;

    public c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(z3.P(2130969496, context, m.class.getCanonicalName()).data, zf.a.m);
        sg.f.E(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        sg.f.E(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        sg.f.E(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        sg.f.E(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListJ = g4.J(context, typedArrayObtainStyledAttributes, 7);
        this.f4156a = sg.f.E(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        sg.f.E(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f4157b = sg.f.E(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListJ.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
