package ng;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.textfield.TextInputLayout;

public final class b {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    public final TextInputLayout f11256a;

    public float f11257a0;

    public float f11258b;

    public float f11259b0;

    public final Rect f11260c;

    public float f11261c0;

    public final Rect f11262d;

    public CharSequence f11263d0;

    public final RectF f11264e;

    public ColorStateList f11274j;

    public ColorStateList f11276k;

    public boolean f11277k0;
    public int l;
    public float m;

    public float f11278n;

    public float f11279o;

    public float f11280p;

    public float f11281q;

    public float f11282r;

    public Typeface f11283s;

    public Typeface f11284t;

    public Typeface f11285u;

    public Typeface f11286v;

    public Typeface f11287w;

    public Typeface f11288x;

    public Typeface f11289y;

    public qg.a f11290z;

    public int f11266f = 16;

    public int f11268g = 16;

    public float f11270h = 15.0f;

    public float f11272i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    public int f11265e0 = 1;

    public int f11267f0 = 1;

    public final float f11269g0 = 1.0f;

    public final int f11271h0 = 1;

    public int f11273i0 = -1;

    public int f11275j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f11256a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f11262d = new Rect();
        this.f11260c = new Rect();
        this.f11264e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f3, int i10, int i11) {
        float f10 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i11) * f3) + (Color.alpha(i10) * f10)), Math.round((Color.red(i11) * f3) + (Color.red(i10) * f10)), Math.round((Color.green(i11) * f3) + (Color.green(i10) * f10)), Math.round((Color.blue(i11) * f3) + (Color.blue(i10) * f10)));
    }

    public static float h(float f3, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return ag.a.a(f3, f10, f11);
    }

    public final void b() {
        float f3 = this.f11258b;
        Rect rect = this.f11260c;
        float f10 = rect.left;
        Rect rect2 = this.f11262d;
        float fH = h(f10, rect2.left, f3, this.Q);
        RectF rectF = this.f11264e;
        rectF.left = fH;
        rectF.top = h(this.m, this.f11278n, f3, this.Q);
        rectF.right = h(rect.right, rect2.right, f3, this.Q);
        rectF.bottom = h(rect.bottom, rect2.bottom, f3, this.Q);
        this.f11281q = h(this.f11279o, this.f11280p, f3, this.Q);
        this.f11282r = h(this.m, this.f11278n, f3, this.Q);
        d(f3, false);
        TextInputLayout textInputLayout = this.f11256a;
        textInputLayout.postInvalidateOnAnimation();
        p6.a aVar = ag.a.f466b;
        this.f11259b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f11261c0 = h(1.0f, 0.0f, f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f11276k;
        ColorStateList colorStateList2 = this.f11274j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f3, g(colorStateList2), g(this.f11276k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f11 = this.W;
        float f12 = this.X;
        if (f11 != f12) {
            textPaint.setLetterSpacing(h(f12, f11, f3, aVar));
        } else {
            textPaint.setLetterSpacing(f11);
        }
        this.H = ag.a.a(0.0f, this.S, f3);
        this.I = ag.a.a(0.0f, this.T, f3);
        this.J = ag.a.a(0.0f, this.U, f3);
        int iA = a(f3, 0, g(this.V));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z10 = this.f11256a.getLayoutDirection() == 1;
        if (this.E) {
            return (z10 ? x4.f.f16452d : x4.f.f16451c).i(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void d(float f3, boolean z10) {
        float f10;
        Typeface typeface;
        float f11;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f11262d.width();
        float fWidth2 = this.f11260c.width();
        if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
            f10 = o() ? this.f11272i : this.f11270h;
            f11 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f11270h, this.f11272i, f3, this.R) / this.f11270h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f11283s;
            fWidth2 = fWidth;
        } else {
            f10 = this.f11270h;
            float f12 = this.X;
            typeface = this.f11286v;
            if (Math.abs(f3 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f11270h, this.f11272i, f3, this.R) / this.f11270h;
            }
            float f13 = this.f11272i / this.f11270h;
            float f14 = fWidth2 * f13;
            if (!z10 && f14 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f13, fWidth2);
            }
            f11 = f12;
        }
        int i10 = f3 < 0.5f ? this.f11265e0 : this.f11267f0;
        TextPaint textPaint = this.O;
        boolean z11 = false;
        if (fWidth2 > 0.0f) {
            boolean z12 = this.G != f10;
            boolean z13 = this.Y != f11;
            boolean z14 = this.f11289y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || (this.L != i10) || this.N;
            this.G = f10;
            this.Y = f11;
            this.f11289y = typeface;
            this.N = false;
            this.L = i10;
            textPaint.setLinearText(this.F != 1.0f);
            z11 = z15;
        }
        if (this.C == null || z11) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f11289y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f11265e0 > 1 || this.f11267f0 > 1) && !zC) ? i10 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i10, TextPaint textPaint, CharSequence charSequence, float f3, boolean z10) {
        Layout.Alignment alignment;
        StaticLayout staticLayoutA = null;
        try {
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f11266f, this.D ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            f fVar = new f(charSequence, textPaint, (int) f3);
            fVar.l = this.A;
            fVar.f11303k = z10;
            fVar.f11297e = alignment;
            fVar.f11302j = false;
            fVar.f11298f = i10;
            float f10 = this.f11269g0;
            fVar.f11299g = 0.0f;
            fVar.f11300h = f10;
            fVar.f11301i = this.f11271h0;
            fVar.m = null;
            staticLayoutA = fVar.a();
        } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e3) {
            Log.e("CollapsingTextHelper", e3.getCause().getMessage(), e3);
        }
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i10 = this.f11273i0;
        if (i10 != -1) {
            return i10;
        }
        float f3 = this.f11272i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f3);
        textPaint.setTypeface(this.f11283s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        Typeface typeface = this.f11285u;
        if (typeface != null) {
            this.f11284t = f50.c.P(configuration, typeface);
        }
        Typeface typeface2 = this.f11288x;
        if (typeface2 != null) {
            this.f11287w = f50.c.P(configuration, typeface2);
        }
        Typeface typeface3 = this.f11284t;
        if (typeface3 == null) {
            typeface3 = this.f11285u;
        }
        this.f11283s = typeface3;
        Typeface typeface4 = this.f11287w;
        if (typeface4 == null) {
            typeface4 = this.f11288x;
        }
        this.f11286v = typeface4;
        j(true);
    }

    public final void j(boolean z10) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f11256a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z10) {
            return;
        }
        d(1.0f, z10);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f11263d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f11263d0;
        if (charSequence2 != null) {
            this.f11257a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f11257a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f11268g, this.D ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f11262d;
        if (i10 == 48) {
            this.f11278n = rect.top;
        } else if (i10 != 80) {
            this.f11278n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f11278n = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f11280p = rect.centerX() - (this.f11257a0 / 2.0f);
        } else if (i11 != 5) {
            this.f11280p = rect.left;
        } else {
            this.f11280p = rect.right - this.f11257a0;
        }
        if (this.f11257a0 <= rect.width()) {
            float f3 = this.f11280p;
            float fMax = Math.max(0.0f, rect.left - f3) + f3;
            this.f11280p = fMax;
            this.f11280p = Math.min(0.0f, rect.right - (this.f11257a0 + fMax)) + fMax;
        }
        float f10 = this.f11272i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f10);
        textPaint2.setTypeface(this.f11283s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f11 = this.f11278n;
            float fMax2 = Math.max(0.0f, rect.top - f11) + f11;
            this.f11278n = fMax2;
            this.f11278n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z10);
        StaticLayout staticLayout = this.Z;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Z;
        if (staticLayout2 == null || this.f11265e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Z;
        this.l = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f11266f, this.D ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f11260c;
        if (i12 == 48) {
            this.m = rect2.top;
        } else if (i12 != 80) {
            this.m = rect2.centerY() - (height / 2.0f);
        } else {
            this.m = (rect2.bottom - height) + (this.f11277k0 ? textPaint.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f11279o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f11279o = rect2.left;
        } else {
            this.f11279o = rect2.right - fMeasureText;
        }
        d(this.f11258b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f11276k == colorStateList && this.f11274j == colorStateList) {
            return;
        }
        this.f11276k = colorStateList;
        this.f11274j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        qg.a aVar = this.f11290z;
        if (aVar != null) {
            aVar.f12984d = true;
        }
        if (this.f11285u == typeface) {
            return false;
        }
        this.f11285u = typeface;
        Typeface typefaceP = f50.c.P(this.f11256a.getContext().getResources().getConfiguration(), typeface);
        this.f11284t = typefaceP;
        if (typefaceP == null) {
            typefaceP = this.f11285u;
        }
        this.f11283s = typefaceP;
        return true;
    }

    public final void m(float f3) {
        float f10 = 0.0f;
        if (f3 < 0.0f) {
            f3 = f10;
        } else {
            f10 = 1.0f;
            if (f3 > 1.0f) {
                f3 = f10;
            }
        }
        if (f3 != this.f11258b) {
            this.f11258b = f3;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z10;
        boolean zL = l(typeface);
        if (this.f11288x != typeface) {
            this.f11288x = typeface;
            Typeface typefaceP = f50.c.P(this.f11256a.getContext().getResources().getConfiguration(), typeface);
            this.f11287w = typefaceP;
            if (typefaceP == null) {
                typefaceP = this.f11288x;
            }
            this.f11286v = typefaceP;
            z10 = true;
        } else {
            z10 = false;
        }
        if (zL || z10) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f11267f0 == 1;
    }
}
