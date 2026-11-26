package p3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class g implements LineHeightSpan {
    public final float A;

    public g(float f3) {
        this.A = f3;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i14 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.A);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i14)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
