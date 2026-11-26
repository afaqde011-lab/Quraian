package p3;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class b extends MetricAffectingSpan {
    public final int A;
    public final Object B;

    public b(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.B);
                break;
            default:
                textPaint.setTypeface((Typeface) this.B);
                break;
        }
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.A) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.B);
                break;
            default:
                textPaint.setTypeface((Typeface) this.B);
                break;
        }
    }
}
