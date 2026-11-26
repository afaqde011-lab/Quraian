package p3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class a extends MetricAffectingSpan {
    public final int A;
    public final float B;

    public a(float f3, int i10) {
        this.A = i10;
        this.B = f3;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.B);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.B);
                break;
        }
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.B);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.B);
                break;
        }
    }
}
