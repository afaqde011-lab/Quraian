package i2;

import android.graphics.RenderEffect;

public final class p extends p0 {

    public final float f7151b;

    public final float f7152c;

    public final int f7153d;

    public p(float f3, float f10, int i10) {
        this.f7151b = f3;
        this.f7152c = f10;
        this.f7153d = i10;
    }

    @Override
    public final RenderEffect a() {
        float f3 = this.f7151b;
        float f10 = this.f7152c;
        return (f3 == 0.0f && f10 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f3, f10, b0.B(this.f7153d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f7151b == pVar.f7151b && this.f7152c == pVar.f7152c && this.f7153d == pVar.f7153d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7153d) + w.c.c(this.f7152c, Float.hashCode(this.f7151b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f7151b + ", radiusY=" + this.f7152c + ", edgeTreatment=" + ((Object) b0.F(this.f7153d)) + ')';
    }
}
