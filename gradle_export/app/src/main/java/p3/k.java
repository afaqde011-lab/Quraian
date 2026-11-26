package p3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class k extends CharacterStyle {

    public final boolean f12313a;

    public final boolean f12314b;

    public k(boolean z10, boolean z11) {
        this.f12313a = z10;
        this.f12314b = z11;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f12313a);
        textPaint.setStrikeThruText(this.f12314b);
    }
}
