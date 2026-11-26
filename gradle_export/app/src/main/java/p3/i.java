package p3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.m;

public final class i extends ReplacementSpan {
    public Paint.FontMetricsInt A;
    public int B;
    public int C;
    public boolean D;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.A;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        m.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.D) {
            s3.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.C;
    }

    public final int c() {
        if (!this.D) {
            s3.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.B;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f3, int i12, int i13, int i14, Paint paint) {
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        this.D = true;
        paint.getTextSize();
        this.A = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            s3.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.B = (int) Math.ceil(0.0f);
        this.C = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }
}
