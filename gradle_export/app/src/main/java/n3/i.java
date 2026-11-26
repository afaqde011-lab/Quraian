package n3;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.q1;
import h00.n;
import kotlin.jvm.internal.m;

public final class i {

    public final TextPaint f11038a;

    public final TextUtils.TruncateAt f11039b;

    public final boolean f11040c;

    public final boolean f11041d;

    public q1 f11042e;

    public final Layout f11043f;

    public final int f11044g;

    public final int f11045h;

    public final int f11046i;

    public final float f11047j;

    public final float f11048k;
    public final boolean l;
    public final Paint.FontMetricsInt m;

    public final int f11049n;

    public final p3.h[] f11050o;

    public final Rect f11051p = new Rect();

    public ce.c f11052q;

    public i(CharSequence charSequence, float f3, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, boolean z10, int i12, int i13, int i14, int i15, int i16, int i17, e eVar) {
        p3.h[] hVarArr;
        int i18;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        p3.h[] hVarArr2;
        int i19;
        int i20;
        int i21;
        char c10;
        long j9;
        int i22;
        long jA;
        long jA2;
        int i23;
        ?? r11;
        p3.h hVar;
        p3.h hVar2;
        int i24;
        this.f11038a = textPaint;
        this.f11039b = truncateAt;
        this.f11040c = z10;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = j.b(i11);
        Layout.Alignment alignment = g.f11035a;
        Layout.Alignment alignment2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : g.f11036b : g.f11035a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z11 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, p3.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            if (!eVar.f11032g) {
                eVar.f11031f = BoringLayout.isBoring(eVar.f11026a, eVar.f11027b, j.b(eVar.f11028c), true, null);
                eVar.f11032g = true;
            }
            BoringLayout.Metrics metrics = eVar.f11031f;
            double d3 = f3;
            int iCeil = (int) Math.ceil(d3);
            if (metrics == null || eVar.b() > f3 || z11) {
                hVarArr = null;
                this.l = false;
                i18 = i12;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutA = f.a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i18, truncateAt, (int) Math.ceil(d3), i17, z10, i13, i14, i15, i16);
            } else {
                this.l = true;
                if (iCeil < 0) {
                    s3.a.a("negative width");
                }
                if (iCeil < 0) {
                    s3.a.a("negative ellipsized width");
                }
                hVarArr = null;
                layoutA = new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metrics, z10, truncateAt, iCeil, true);
                i18 = i12;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.f11043f = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i18);
            this.f11044g = iMin;
            int i25 = iMin - 1;
            this.f11041d = iMin >= i18 && (layoutA.getEllipsisCount(i25) > 0 || layoutA.getLineEnd(i25) != charSequence.length());
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text = layoutA.getText();
                m.c(text, "null cannot be cast to non-null type android.text.Spanned");
                if (f.f((Spanned) text, p3.h.class) || layoutA.getText().length() <= 0) {
                    CharSequence text2 = layoutA.getText();
                    m.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                    i19 = 0;
                    hVarArr2 = (p3.h[]) ((Spanned) text2).getSpans(0, layoutA.getText().length(), p3.h.class);
                } else {
                    hVarArr2 = hVarArr;
                    i19 = 0;
                }
            } else {
                hVarArr2 = hVarArr;
                i19 = 0;
            }
            this.f11050o = hVarArr2;
            if (hVarArr2 == null || (hVar2 = (p3.h) n.E0(hVarArr2)) == null) {
                i20 = 2;
                i21 = i19;
            } else {
                if (hVar2.C) {
                    i20 = 2;
                    i24 = hVar2.F == 2 ? 1 : i24;
                    i21 = i24;
                } else {
                    i20 = 2;
                }
                i24 = i19;
                i21 = i24;
            }
            int i26 = (hVarArr2 == null || (hVar = (p3.h) n.E0(hVarArr2)) == null || !hVar.D || hVar.F != i20) ? i19 : 1;
            if (i21 == 0 || i26 == 0) {
                long jA3 = j.f11054b;
                if (z10) {
                    c10 = ' ';
                    j9 = 4294967295L;
                    i22 = 1;
                } else if (this.l ? ((BoringLayout) layoutA).isFallbackLineSpacingEnabled() : ((StaticLayout) layoutA).isFallbackLineSpacingEnabled()) {
                    c10 = ' ';
                    j9 = 4294967295L;
                    i22 = 1;
                } else {
                    TextPaint paint = layoutA.getPaint();
                    CharSequence text3 = layoutA.getText();
                    c10 = ' ';
                    j9 = 4294967295L;
                    Rect rectB = f.b(paint, text3, layoutA.getLineStart(i19), layoutA.getLineEnd(i19));
                    int lineAscent = layoutA.getLineAscent(i19);
                    int i27 = rectB.top;
                    int topPadding = i27 < lineAscent ? lineAscent - i27 : layoutA.getTopPadding();
                    i22 = 1;
                    rectB = iMin != 1 ? f.b(paint, text3, layoutA.getLineStart(i25), layoutA.getLineEnd(i25)) : rectB;
                    int lineDescent = layoutA.getLineDescent(i25);
                    int i28 = rectB.bottom;
                    int bottomPadding = i28 > lineDescent ? i28 - lineDescent : layoutA.getBottomPadding();
                    if (topPadding != 0 || bottomPadding != 0) {
                        jA3 = j.a(topPadding, bottomPadding);
                    }
                }
                jA = j.a(i21 != 0 ? i19 : (int) (jA3 >> c10), i26 != 0 ? i19 : (int) (jA3 & j9));
            } else {
                jA = j.f11054b;
                c10 = ' ';
                j9 = 4294967295L;
                i22 = 1;
            }
            if (hVarArr2 != null) {
                int length2 = hVarArr2.length;
                int iMax = i19;
                int iMax2 = iMax;
                for (int i29 = iMax2; i29 < length2; i29++) {
                    p3.h hVar3 = hVarArr2[i29];
                    int i30 = hVar3.K;
                    iMax = i30 < 0 ? Math.max(iMax, Math.abs(i30)) : iMax;
                    int i31 = hVar3.L;
                    if (i31 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i31));
                    }
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? j.f11054b : j.a(iMax, iMax2);
            } else {
                jA2 = j.f11054b;
            }
            this.f11045h = Math.max((int) (jA >> c10), (int) (jA2 >> c10));
            this.f11046i = Math.max((int) (jA & j9), (int) (jA2 & j9));
            TextPaint textPaint2 = this.f11038a;
            p3.h[] hVarArr3 = this.f11050o;
            int i32 = this.f11044g - i22;
            Layout layout = this.f11043f;
            if (layout.getLineStart(i32) != layout.getLineEnd(i32) || hVarArr3 == null || hVarArr3.length == 0) {
                i23 = i19;
                r11 = hVarArr;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                p3.h hVar4 = (p3.h) n.D0(hVarArr3);
                spannableString.setSpan(new p3.h(hVar4.A, spannableString.length(), (i32 == 0 || !hVar4.D) ? hVar4.D : i19, hVar4.D, hVar4.E, hVar4.F), i19, spannableString.length(), 33);
                i23 = i19;
                StaticLayout staticLayoutA = f.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, c.f11022a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f11040c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(i23);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(i23);
                fontMetricsInt.top = staticLayoutA.getLineTop(i23);
                fontMetricsInt.bottom = staticLayoutA.getLineBottom(i23);
                r11 = fontMetricsInt;
            }
            this.f11049n = r11 != 0 ? ((Paint.FontMetricsInt) r11).bottom - ((int) (e(i25) - g(i25))) : i23;
            this.m = r11;
            Layout layout2 = this.f11043f;
            this.f11047j = w00.a.s(layout2, i25, layout2.getPaint());
            Layout layout3 = this.f11043f;
            this.f11048k = w00.a.t(layout3, i25, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        boolean z10 = this.f11041d;
        Layout layout = this.f11043f;
        return (z10 ? layout.getLineBottom(this.f11044g - 1) : layout.getHeight()) + this.f11045h + this.f11046i + this.f11049n;
    }

    public final float b(int i10) {
        if (i10 == this.f11044g - 1) {
            return this.f11047j + this.f11048k;
        }
        return 0.0f;
    }

    public final ce.c c() {
        ce.c cVar = this.f11052q;
        if (cVar != null) {
            return cVar;
        }
        ce.c cVar2 = new ce.c(this.f11043f);
        this.f11052q = cVar2;
        return cVar2;
    }

    public final float d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f11045h + ((i10 != this.f11044g + (-1) || (fontMetricsInt = this.m) == null) ? this.f11043f.getLineBaseline(i10) : g(i10) - fontMetricsInt.ascent);
    }

    public final float e(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f11044g;
        int i12 = i11 - 1;
        Layout layout = this.f11043f;
        if (i10 != i12 || (fontMetricsInt = this.m) == null) {
            return this.f11045h + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f11046i : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i10) {
        ThreadLocal threadLocal = j.f11053a;
        Layout layout = this.f11043f;
        return (layout.getEllipsisCount(i10) <= 0 || this.f11039b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final float g(int i10) {
        return this.f11043f.getLineTop(i10) + (i10 == 0 ? 0 : this.f11045h);
    }

    public final float h(int i10, boolean z10) {
        return b(this.f11043f.getLineForOffset(i10)) + c().w(i10, true, z10);
    }

    public final float i(int i10, boolean z10) {
        return b(this.f11043f.getLineForOffset(i10)) + c().w(i10, false, z10);
    }

    public final q1 j() {
        q1 q1Var = this.f11042e;
        if (q1Var != null) {
            return q1Var;
        }
        Layout layout = this.f11043f;
        q1 q1Var2 = new q1(layout.getText(), layout.getText().length(), this.f11038a.getTextLocale());
        this.f11042e = q1Var2;
        return q1Var2;
    }
}
