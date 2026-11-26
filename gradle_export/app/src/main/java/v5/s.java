package v5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

public final class s extends ReplacementSpan {
    public final r B;
    public TextPaint E;
    public final Paint.FontMetricsInt A = new Paint.FontMetricsInt();
    public short C = -1;
    public float D = 1.0f;

    public s(r rVar) {
        rd.a.i(rVar, "rasterizer cannot be null");
        this.B = rVar;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f3, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.E;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.E = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f3, i12, f3 + this.C, i14, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        g.a().getClass();
        float f10 = i13;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        r rVar = this.B;
        p10.a aVar = rVar.f15479b;
        Typeface typeface = (Typeface) aVar.D;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) aVar.B, rVar.f15478a * 2, 2, f3, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.A;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        r rVar = this.B;
        w5.a aVarB = rVar.b();
        int iA = aVarB.a(14);
        this.D = fAbs / (iA != 0 ? ((ByteBuffer) ((i00.e) aVarB).D).getShort(iA + ((i00.e) aVarB).A) : (short) 0);
        w5.a aVarB2 = rVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) ((i00.e) aVarB2).D).getShort(iA2 + ((i00.e) aVarB2).A);
        }
        w5.a aVarB3 = rVar.b();
        int iA3 = aVarB3.a(12);
        short s6 = (short) ((iA3 != 0 ? ((ByteBuffer) ((i00.e) aVarB3).D).getShort(iA3 + ((i00.e) aVarB3).A) : (short) 0) * this.D);
        this.C = s6;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s6;
    }
}
