package n3;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.m;

public final class e {

    public final CharSequence f11026a;

    public final TextPaint f11027b;

    public final int f11028c;

    public float f11029d = Float.NaN;

    public float f11030e = Float.NaN;

    public BoringLayout.Metrics f11031f;

    public boolean f11032g;

    public CharSequence f11033h;

    public e(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f11026a = charSequence;
        this.f11027b = textPaint;
        this.f11028c = i10;
    }

    public final CharSequence a() {
        CharSequence charSequence = this.f11033h;
        if (charSequence != null) {
            m.b(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f11026a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (f.f(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f11033h = charSequence2;
        return charSequence2;
    }

    public final float b() {
        if (!Float.isNaN(this.f11029d)) {
            return this.f11029d;
        }
        boolean z10 = this.f11032g;
        CharSequence charSequence = this.f11026a;
        TextPaint textPaint = this.f11027b;
        if (!z10) {
            this.f11031f = BoringLayout.isBoring(charSequence, textPaint, j.b(this.f11028c), true, null);
            this.f11032g = true;
        }
        BoringLayout.Metrics metrics = this.f11031f;
        float fCeil = metrics != null ? metrics.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(a(), 0, a().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (f.f(spanned, p3.f.class) || f.f(spanned, p3.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f11029d = fCeil;
        return fCeil;
    }
}
