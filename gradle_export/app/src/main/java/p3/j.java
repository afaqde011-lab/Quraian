package p3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class j extends CharacterStyle {

    public final int f12309a;

    public final float f12310b;

    public final float f12311c;

    public final float f12312d;

    public j(float f3, float f10, float f11, int i10) {
        this.f12309a = i10;
        this.f12310b = f3;
        this.f12311c = f10;
        this.f12312d = f11;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f12312d, this.f12310b, this.f12311c, this.f12309a);
    }
}
