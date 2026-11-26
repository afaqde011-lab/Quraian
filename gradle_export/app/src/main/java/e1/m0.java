package e1;

import android.view.textclassifier.TextClassification;

public final class m0 {

    public final CharSequence f4972a;

    public final long f4973b;

    public final TextClassification f4974c;

    public m0(CharSequence charSequence, long j9, TextClassification textClassification) {
        this.f4972a = charSequence;
        this.f4973b = j9;
        this.f4974c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.m.a(this.f4972a, m0Var.f4972a) && m3.q0.c(this.f4973b, m0Var.f4973b) && kotlin.jvm.internal.m.a(this.f4974c, m0Var.f4974c);
    }

    public final int hashCode() {
        int iHashCode = this.f4972a.hashCode() * 31;
        int i10 = m3.q0.f10519c;
        return this.f4974c.hashCode() + w.c.f(iHashCode, this.f4973b, 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f4972a) + ", selection=" + ((Object) m3.q0.i(this.f4973b)) + ", textClassification=" + this.f4974c + ')';
    }
}
