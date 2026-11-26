package sg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import qd.s0;

public final class m {

    public s0 f14181a = new k();

    public s0 f14182b = new k();

    public s0 f14183c = new k();

    public s0 f14184d = new k();

    public d f14185e = new a(0.0f);

    public d f14186f = new a(0.0f);

    public d f14187g = new a(0.0f);

    public d f14188h = new a(0.0f);

    public f f14189i = new f();

    public f f14190j = new f();

    public f f14191k = new f();
    public f l = new f();

    public static l a(Context context, int i10, int i11, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(zf.a.f17449y);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            d dVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            d dVarC2 = c(typedArrayObtainStyledAttributes, 8, dVarC);
            d dVarC3 = c(typedArrayObtainStyledAttributes, 9, dVarC);
            d dVarC4 = c(typedArrayObtainStyledAttributes, 7, dVarC);
            d dVarC5 = c(typedArrayObtainStyledAttributes, 6, dVarC);
            l lVar = new l();
            lVar.f14170a = rd.a.n(i13);
            lVar.f14174e = dVarC2;
            lVar.f14171b = rd.a.n(i14);
            lVar.f14175f = dVarC3;
            lVar.f14172c = rd.a.n(i15);
            lVar.f14176g = dVarC4;
            lVar.f14173d = rd.a.n(i16);
            lVar.f14177h = dVarC5;
            return lVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static l b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf.a.f17442r, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        return (this.f14182b instanceof k) && (this.f14181a instanceof k) && (this.f14183c instanceof k) && (this.f14184d instanceof k);
    }

    public final boolean e(RectF rectF) {
        boolean z10 = this.l.getClass().equals(f.class) && this.f14190j.getClass().equals(f.class) && this.f14189i.getClass().equals(f.class) && this.f14191k.getClass().equals(f.class);
        float fA = this.f14185e.a(rectF);
        return z10 && ((this.f14186f.a(rectF) > fA ? 1 : (this.f14186f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14188h.a(rectF) > fA ? 1 : (this.f14188h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14187g.a(rectF) > fA ? 1 : (this.f14187g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final l f() {
        l lVar = new l();
        lVar.f14170a = this.f14181a;
        lVar.f14171b = this.f14182b;
        lVar.f14172c = this.f14183c;
        lVar.f14173d = this.f14184d;
        lVar.f14174e = this.f14185e;
        lVar.f14175f = this.f14186f;
        lVar.f14176g = this.f14187g;
        lVar.f14177h = this.f14188h;
        lVar.f14178i = this.f14189i;
        lVar.f14179j = this.f14190j;
        lVar.f14180k = this.f14191k;
        lVar.l = this.l;
        return lVar;
    }

    public final String toString() {
        return "[" + this.f14185e + ", " + this.f14186f + ", " + this.f14187g + ", " + this.f14188h + "]";
    }
}
