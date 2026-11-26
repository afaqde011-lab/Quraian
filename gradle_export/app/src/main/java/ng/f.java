package ng;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.RuntimeVersion;
import k7.t;

public final class f {

    public CharSequence f11293a;

    public final TextPaint f11294b;

    public final int f11295c;

    public int f11296d;

    public boolean f11303k;
    public t m;

    public Layout.Alignment f11297e = Layout.Alignment.ALIGN_NORMAL;

    public int f11298f = Integer.MAX_VALUE;

    public float f11299g = 0.0f;

    public float f11300h = 1.0f;

    public int f11301i = 1;

    public boolean f11302j = true;
    public TextUtils.TruncateAt l = null;

    public f(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f11293a = charSequence;
        this.f11294b = textPaint;
        this.f11295c = i10;
        this.f11296d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f11293a == null) {
            this.f11293a = RuntimeVersion.SUFFIX;
        }
        int iMax = Math.max(0, this.f11295c);
        CharSequence charSequenceEllipsize = this.f11293a;
        int i10 = this.f11298f;
        TextPaint textPaint = this.f11294b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f11296d);
        this.f11296d = iMin;
        if (this.f11303k && this.f11298f == 1) {
            this.f11297e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f11297e);
        builderObtain.setIncludePad(this.f11302j);
        builderObtain.setTextDirection(this.f11303k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f11298f);
        float f3 = this.f11299g;
        if (f3 != 0.0f || this.f11300h != 1.0f) {
            builderObtain.setLineSpacing(f3, this.f11300h);
        }
        if (this.f11298f > 1) {
            builderObtain.setHyphenationFrequency(this.f11301i);
        }
        t tVar = this.m;
        if (tVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) tVar.B).U.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
