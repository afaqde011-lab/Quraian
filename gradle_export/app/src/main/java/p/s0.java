package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class s0 {

    public final TextView f12197a;

    public bd.f f12198b;

    public bd.f f12199c;

    public bd.f f12200d;

    public bd.f f12201e;

    public bd.f f12202f;

    public bd.f f12203g;

    public bd.f f12204h;

    public final z0 f12205i;

    public int f12206j = 0;

    public int f12207k = -1;
    public Typeface l;
    public boolean m;

    public s0(TextView textView) {
        this.f12197a = textView;
        this.f12205i = new z0(textView);
    }

    public static bd.f c(Context context, r rVar, int i10) {
        ColorStateList colorStateListF;
        synchronized (rVar) {
            colorStateListF = rVar.f12195a.f(context, i10);
        }
        if (colorStateListF == null) {
            return null;
        }
        bd.f fVar = new bd.f();
        fVar.B = true;
        fVar.C = colorStateListF;
        return fVar;
    }

    public final void a(Drawable drawable, bd.f fVar) {
        if (drawable == null || fVar == null) {
            return;
        }
        r.e(drawable, fVar, this.f12197a.getDrawableState());
    }

    public final void b() {
        bd.f fVar = this.f12198b;
        TextView textView = this.f12197a;
        if (fVar != null || this.f12199c != null || this.f12200d != null || this.f12201e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f12198b);
            a(compoundDrawables[1], this.f12199c);
            a(compoundDrawables[2], this.f12200d);
            a(compoundDrawables[3], this.f12201e);
        }
        if (this.f12202f == null && this.f12203g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f12202f);
        a(compoundDrawablesRelative[2], this.f12203g);
    }

    public final ColorStateList d() {
        bd.f fVar = this.f12204h;
        if (fVar != null) {
            return (ColorStateList) fVar.C;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        bd.f fVar = this.f12204h;
        if (fVar != null) {
            return (PorterDuff.Mode) fVar.D;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String string;
        String string2;
        int i11;
        float dimensionPixelSize;
        int i12;
        Paint.FontMetricsInt fontMetricsInt;
        int i13;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.f12197a;
        Context context = textView.getContext();
        r rVarA = r.a();
        int[] iArr = j.a.f7723h;
        k9.x0 x0VarK = k9.x0.K(context, attributeSet, iArr, i10);
        Context context2 = textView.getContext();
        TypedArray typedArray = (TypedArray) x0VarK.C;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.h0.b(textView, context2, iArr, attributeSet, typedArray, i10, 0);
        TypedArray typedArray2 = (TypedArray) x0VarK.C;
        int resourceId3 = typedArray2.getResourceId(0, -1);
        if (typedArray2.hasValue(3)) {
            this.f12198b = c(context, rVarA, typedArray2.getResourceId(3, 0));
        }
        if (typedArray2.hasValue(1)) {
            this.f12199c = c(context, rVarA, typedArray2.getResourceId(1, 0));
        }
        if (typedArray2.hasValue(4)) {
            this.f12200d = c(context, rVarA, typedArray2.getResourceId(4, 0));
        }
        if (typedArray2.hasValue(2)) {
            this.f12201e = c(context, rVarA, typedArray2.getResourceId(2, 0));
        }
        if (typedArray2.hasValue(5)) {
            this.f12202f = c(context, rVarA, typedArray2.getResourceId(5, 0));
        }
        if (typedArray2.hasValue(6)) {
            this.f12203g = c(context, rVarA, typedArray2.getResourceId(6, 0));
        }
        x0VarK.O();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = j.a.f7735v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            k9.x0 x0Var = new k9.x0(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            j(context, x0Var);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            x0Var.O();
        } else {
            z10 = false;
            z11 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        k9.x0 x0Var2 = new k9.x0(context, typedArrayObtainStyledAttributes2);
        if (!z12 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z11 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, x0Var2);
        x0Var2.O();
        if (!z12 && z10) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.f12207k == -1) {
                textView.setTypeface(typeface, this.f12206j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            q0.d(textView, string);
        }
        if (string2 != null) {
            p0.b(textView, p0.a(string2));
        }
        z0 z0Var = this.f12205i;
        Context context3 = z0Var.f12238h;
        int[] iArr3 = j.a.f7724i;
        TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = z0Var.f12237g;
        z4.h0.b(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i10, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            z0Var.f12231a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i11 = 0;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                i11 = 0;
                for (int i14 = 0; i14 < length; i14++) {
                    iArr4[i14] = typedArrayObtainTypedArray.getDimensionPixelSize(i14, -1);
                }
                int[] iArrA = z0.a(iArr4);
                z0Var.f12235e = iArrA;
                int length2 = iArrA.length;
                boolean z14 = length2 > 0;
                z0Var.f12236f = z14;
                if (z14) {
                    z0Var.f12231a = 1;
                    z0Var.f12233c = iArrA[0];
                    z0Var.f12234d = iArrA[length2 - 1];
                    z0Var.f12232b = -1.0f;
                }
            } else {
                i11 = 0;
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!z0Var.b()) {
            z0Var.f12231a = i11;
        } else if (z0Var.f12231a == 1) {
            if (!z0Var.f12236f) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f3 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (f3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                z0Var.f12231a = 1;
                z0Var.f12233c = dimension2;
                z0Var.f12234d = f3;
                z0Var.f12232b = dimension;
                z0Var.f12236f = i11;
            }
            if (z0Var.b() && z0Var.f12231a == 1 && (!z0Var.f12236f || z0Var.f12235e.length == 0)) {
                int iFloor = ((int) Math.floor((z0Var.f12234d - z0Var.f12233c) / z0Var.f12232b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i15 = 0; i15 < iFloor; i15++) {
                    iArr5[i15] = Math.round((i15 * z0Var.f12232b) + z0Var.f12233c);
                }
                z0Var.f12235e = z0.a(iArr5);
            }
        }
        if (z0Var.f12231a != 0) {
            int[] iArr6 = z0Var.f12235e;
            if (iArr6.length > 0) {
                if (q0.a(textView) != -1.0f) {
                    q0.b(textView, Math.round(z0Var.f12233c), Math.round(z0Var.f12234d), Math.round(z0Var.f12232b), 0);
                } else {
                    q0.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? rVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? rVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? rVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? rVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? rVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? rVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = n4.b.b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(e1.a(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i16 = typedValuePeekValue.data;
                i12 = i16 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i16);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                rd.a.h(dimensionPixelSize2);
                textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                rd.a.h(dimensionPixelSize3);
                fontMetricsInt = textView.getPaint().getFontMetricsInt();
                if (textView.getIncludeFontPadding()) {
                    i13 = fontMetricsInt.bottom;
                } else {
                    i13 = fontMetricsInt.descent;
                }
                if (dimensionPixelSize3 > Math.abs(i13)) {
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i13);
                }
            }
            if (dimensionPixelSize != -1.0f) {
                if (i12 == -1) {
                    qd.s0.q0(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    a5.b.m(textView, i12, dimensionPixelSize);
                } else {
                    qd.s0.q0(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = -1.0f;
        i12 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            rd.a.h(dimensionPixelSize2);
            textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            rd.a.h(dimensionPixelSize3);
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i13 = fontMetricsInt.bottom;
            } else {
                i13 = fontMetricsInt.descent;
            }
            if (dimensionPixelSize3 > Math.abs(i13)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i13);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i12 == -1) {
                qd.s0.q0(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                a5.b.m(textView, i12, dimensionPixelSize);
            } else {
                qd.s0.q0(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.a.f7735v);
        k9.x0 x0Var = new k9.x0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f12197a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        j(context, x0Var);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            q0.d(textView, string);
        }
        x0Var.O();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f12206j);
        }
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f12204h == null) {
            this.f12204h = new bd.f();
        }
        bd.f fVar = this.f12204h;
        fVar.C = colorStateList;
        fVar.B = colorStateList != null;
        this.f12198b = fVar;
        this.f12199c = fVar;
        this.f12200d = fVar;
        this.f12201e = fVar;
        this.f12202f = fVar;
        this.f12203g = fVar;
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f12204h == null) {
            this.f12204h = new bd.f();
        }
        bd.f fVar = this.f12204h;
        fVar.D = mode;
        fVar.A = mode != null;
        this.f12198b = fVar;
        this.f12199c = fVar;
        this.f12200d = fVar;
        this.f12201e = fVar;
        this.f12202f = fVar;
        this.f12203g = fVar;
    }

    public final void j(Context context, k9.x0 x0Var) {
        String string;
        int i10 = this.f12206j;
        TypedArray typedArray = (TypedArray) x0Var.C;
        this.f12206j = typedArray.getInt(2, i10);
        int i11 = typedArray.getInt(11, -1);
        this.f12207k = i11;
        if (i11 != -1) {
            this.f12206j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f12207k;
        int i15 = this.f12206j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceY = x0Var.y(i13, this.f12206j, new o0(this, i14, i15, new WeakReference(this.f12197a)));
                if (typefaceY != null) {
                    if (this.f12207k != -1) {
                        this.l = r0.a(Typeface.create(typefaceY, 0), this.f12207k, (this.f12206j & 2) != 0);
                    } else {
                        this.l = typefaceY;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (this.f12207k != -1) {
            this.l = r0.a(Typeface.create(string, 0), this.f12207k, (this.f12206j & 2) != 0);
        } else {
            this.l = Typeface.create(string, this.f12206j);
        }
    }
}
