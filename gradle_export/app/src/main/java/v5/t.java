package v5;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

public final class t implements Spannable {
    public boolean A = false;
    public Spannable B;

    public t(Spannable spannable) {
        this.B = spannable;
    }

    @Override
    public final char charAt(int i10) {
        return this.B.charAt(i10);
    }

    @Override
    public final IntStream chars() {
        return this.B.chars();
    }

    @Override
    public final IntStream codePoints() {
        return this.B.codePoints();
    }

    @Override
    public final int getSpanEnd(Object obj) {
        return this.B.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        return this.B.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        return this.B.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.B.getSpans(i10, i11, cls);
    }

    @Override
    public final int length() {
        return this.B.length();
    }

    @Override
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.B.nextSpanTransition(i10, i11, cls);
    }

    @Override
    public final void removeSpan(Object obj) {
        Spannable spannable = this.B;
        if (!this.A && (spannable instanceof PrecomputedText)) {
            this.B = new SpannableString(spannable);
        }
        this.A = true;
        this.B.removeSpan(obj);
    }

    @Override
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        Spannable spannable = this.B;
        if (!this.A && (spannable instanceof PrecomputedText)) {
            this.B = new SpannableString(spannable);
        }
        this.A = true;
        this.B.setSpan(obj, i10, i11, i12);
    }

    @Override
    public final CharSequence subSequence(int i10, int i11) {
        return this.B.subSequence(i10, i11);
    }

    @Override
    public final String toString() {
        return this.B.toString();
    }
}
