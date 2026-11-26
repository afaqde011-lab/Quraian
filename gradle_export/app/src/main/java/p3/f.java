package p3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class f extends MetricAffectingSpan {
    public final float A;

    public f(float f3) {
        this.A = f3;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.A / textScaleX);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.A / textScaleX);
    }
}
