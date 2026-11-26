package p3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class h implements LineHeightSpan {
    public final float A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final float E;
    public final int F;
    public int G = Integer.MIN_VALUE;
    public int H = Integer.MIN_VALUE;
    public int I = Integer.MIN_VALUE;
    public int J = Integer.MIN_VALUE;
    public int K;
    public int L;

    public h(float f3, int i10, boolean z10, boolean z11, float f10, int i11) {
        this.A = f3;
        this.B = i10;
        this.C = z10;
        this.D = z11;
        this.E = f10;
        this.F = i11;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            s3.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == 0;
        boolean z11 = i11 == this.B;
        int i16 = this.F;
        boolean z12 = this.D;
        boolean z13 = this.C;
        if (z10 && z11 && z13 && z12 && i16 != 2) {
            return;
        }
        if (this.G == Integer.MIN_VALUE) {
            int i17 = i14 - i15;
            int iCeil = (int) Math.ceil(this.A);
            int i18 = iCeil - i17;
            if (i16 != 1 || i18 > 0) {
                float fAbs = this.E;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i18 <= 0) {
                    dCeil = Math.ceil(i18 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i18);
                }
                int i19 = (int) dCeil;
                int i20 = fontMetricsInt.descent;
                int i21 = i19 + i20;
                this.I = i21;
                int i22 = i21 - iCeil;
                this.H = i22;
                if (i16 == 0 || i18 >= 0) {
                    if (z13) {
                        i22 = fontMetricsInt.ascent;
                    }
                    this.G = i22;
                    if (z12) {
                        i21 = i20;
                    }
                    this.J = i21;
                    this.K = fontMetricsInt.ascent - i22;
                    this.L = i21 - i20;
                } else if (i16 == 2) {
                    this.G = z13 ? Math.max(fontMetricsInt.ascent, i22) : Math.min(fontMetricsInt.ascent, i22);
                    this.J = z12 ? Math.min(fontMetricsInt.descent, this.I) : Math.max(fontMetricsInt.descent, this.I);
                    this.K = 0;
                    this.L = 0;
                }
            } else {
                int i23 = fontMetricsInt.ascent;
                this.H = i23;
                int i24 = fontMetricsInt.descent;
                this.I = i24;
                this.G = i23;
                this.J = i24;
                this.K = 0;
                this.L = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.G : this.H;
        fontMetricsInt.descent = z11 ? this.J : this.I;
    }
}
