package p3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class e extends MetricAffectingSpan {
    public final float A;

    public e(float f3) {
        this.A = f3;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A);
    }
}
