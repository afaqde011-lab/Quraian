package vg;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class f extends sg.g {

    public final RectF f15649r;

    public f(sg.m mVar, RectF rectF) {
        super(mVar);
        this.f15649r = rectF;
    }

    public f(f fVar) {
        super(fVar);
        this.f15649r = fVar.f15649r;
    }

    @Override
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f15651d0 = this;
        gVar.invalidateSelf();
        return gVar;
    }
}
