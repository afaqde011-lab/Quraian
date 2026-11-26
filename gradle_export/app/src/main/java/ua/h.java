package ua;

import android.content.res.ColorStateList;
import android.graphics.Paint;

public final class h extends k {

    public c50.h f15181d;

    public float f15182e;

    public c50.h f15183f;

    public float f15184g;

    public float f15185h;

    public float f15186i;

    public float f15187j;

    public float f15188k;
    public Paint.Cap l;
    public Paint.Join m;

    public float f15189n;

    @Override
    public final boolean a() {
        return this.f15183f.r() || this.f15181d.r();
    }

    @Override
    public final boolean b(int[] iArr) {
        boolean z10;
        c50.h hVar = this.f15183f;
        boolean z11 = true;
        if (hVar.r()) {
            ColorStateList colorStateList = (ColorStateList) hVar.D;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != hVar.B) {
                hVar.B = colorForState;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        c50.h hVar2 = this.f15181d;
        if (hVar2.r()) {
            ColorStateList colorStateList2 = (ColorStateList) hVar2.D;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != hVar2.B) {
                hVar2.B = colorForState2;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return z10 | z11;
    }

    public float getFillAlpha() {
        return this.f15185h;
    }

    public int getFillColor() {
        return this.f15183f.B;
    }

    public float getStrokeAlpha() {
        return this.f15184g;
    }

    public int getStrokeColor() {
        return this.f15181d.B;
    }

    public float getStrokeWidth() {
        return this.f15182e;
    }

    public float getTrimPathEnd() {
        return this.f15187j;
    }

    public float getTrimPathOffset() {
        return this.f15188k;
    }

    public float getTrimPathStart() {
        return this.f15186i;
    }

    public void setFillAlpha(float f3) {
        this.f15185h = f3;
    }

    public void setFillColor(int i10) {
        this.f15183f.B = i10;
    }

    public void setStrokeAlpha(float f3) {
        this.f15184g = f3;
    }

    public void setStrokeColor(int i10) {
        this.f15181d.B = i10;
    }

    public void setStrokeWidth(float f3) {
        this.f15182e = f3;
    }

    public void setTrimPathEnd(float f3) {
        this.f15187j = f3;
    }

    public void setTrimPathOffset(float f3) {
        this.f15188k = f3;
    }

    public void setTrimPathStart(float f3) {
        this.f15186i = f3;
    }
}
