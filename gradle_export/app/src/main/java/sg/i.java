package sg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.StateSet;
import i7.b1;
import java.util.BitSet;
import java.util.Objects;

public class i extends Drawable implements v {

    public static final h[] f14166c0;
    public final o9.q A;
    public g B;
    public final t[] C;
    public final t[] D;
    public final BitSet E;
    public boolean F;
    public boolean G;
    public final Matrix H;
    public final Path I;
    public final Path J;
    public final RectF K;
    public final RectF L;
    public final Region M;
    public final Region N;
    public final Paint O;
    public final Paint P;
    public final o10.b Q;
    public final b1 R;
    public PorterDuffColorFilter S;
    public PorterDuffColorFilter T;
    public final RectF U;
    public boolean V;
    public m W;
    public u5.f X;
    public final u5.e[] Y;
    public float[] Z;

    public float[] f14167a0;

    public ab.r f14168b0;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f14166c0 = new h[4];
        int i10 = 0;
        while (true) {
            h[] hVarArr = f14166c0;
            if (i10 >= hVarArr.length) {
                return;
            }
            hVarArr[i10] = new h(i10);
            i10++;
        }
    }

    public i() {
        this(new m());
    }

    public i(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(m.b(context, attributeSet, i10, i11).a());
    }

    public i(g gVar) {
        this.A = new o9.q(this, 14);
        this.C = new t[4];
        this.D = new t[4];
        this.E = new BitSet(8);
        this.H = new Matrix();
        this.I = new Path();
        this.J = new Path();
        this.K = new RectF();
        this.L = new RectF();
        this.M = new Region();
        this.N = new Region();
        Paint paint = new Paint(1);
        this.O = paint;
        Paint paint2 = new Paint(1);
        this.P = paint2;
        new rg.a();
        this.R = Looper.getMainLooper().getThread() == Thread.currentThread() ? n.f14192a : new b1();
        this.U = new RectF();
        this.V = true;
        this.Y = new u5.e[4];
        this.B = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        q();
        o(getState());
        this.Q = new o10.b(this, 15);
    }

    public i(m mVar) {
        this(new g(mVar));
    }

    public static float b(RectF rectF, m mVar, float[] fArr) {
        if (fArr == null) {
            if (mVar.e(rectF)) {
                return mVar.f14185e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f3 = fArr[0];
            for (int i10 = 1; i10 < fArr.length; i10++) {
                if (fArr[i10] != f3) {
                    return -1.0f;
                }
            }
        }
        if (mVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        g gVar = this.B;
        this.R.b(gVar.f14150a, this.Z, gVar.f14159j, rectF, this.Q, path);
        if (this.B.f14158i != 1.0f) {
            Matrix matrix = this.H;
            matrix.reset();
            float f3 = this.B.f14158i;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.U, true);
    }

    public final int c(int i10) {
        int i11;
        g gVar = this.B;
        float f3 = gVar.f14161n + 0.0f + gVar.m;
        mg.a aVar = gVar.f14152c;
        if (aVar == null || !aVar.f10898a || q4.a.h(i10, 255) != aVar.f10901d) {
            return i10;
        }
        float f10 = aVar.f10902e;
        float fMin = (f10 <= 0.0f || f3 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f3 / f10)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iK0 = ab.a0.k0(fMin, q4.a.h(i10, 255), aVar.f10899b);
        if (fMin > 0.0f && (i11 = aVar.f10900c) != 0) {
            iK0 = q4.a.f(q4.a.h(i11, mg.a.f10897f), iK0);
        }
        return q4.a.h(iK0, iAlpha);
    }

    public final void d(Canvas canvas, Paint paint, Path path, m mVar, float[] fArr, RectF rectF) {
        float fB = b(rectF, mVar, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f3 = fB * this.B.f14159j;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.S;
        Paint paint = this.O;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i10 = this.B.l;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.T;
        Paint paint2 = this.P;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.B.f14160k);
        int alpha2 = paint2.getAlpha();
        int i11 = this.B.l;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.B.f14164q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z10 = this.F;
            Path path = this.I;
            if (z10) {
                a(f(), path);
                this.F = false;
            }
            g gVar = this.B;
            gVar.getClass();
            if (gVar.f14162o > 0 && !gVar.f14150a.e(f())) {
                float[] fArr = this.Z;
                if (fArr != null) {
                    int i12 = 1;
                    if (fArr.length > 1) {
                        float f3 = fArr[0];
                        while (true) {
                            if (i12 < fArr.length) {
                                if (fArr[i12] == f3) {
                                    i12++;
                                }
                            } else if (!this.B.f14150a.d()) {
                            }
                            path.isConvex();
                        }
                    } else if (!this.B.f14150a.d()) {
                        path.isConvex();
                    }
                } else {
                    path.isConvex();
                }
            }
            d(canvas, paint, path, this.B.f14150a, this.Z, f());
        }
        if (i()) {
            if (this.G) {
                m mVar = this.B.f14150a;
                l lVarF = mVar.f();
                d dVar = mVar.f14185e;
                o9.q qVar = this.A;
                lVarF.f14174e = qVar.D(dVar);
                lVarF.f14175f = qVar.D(mVar.f14186f);
                lVarF.f14177h = qVar.D(mVar.f14188h);
                lVarF.f14176g = qVar.D(mVar.f14187g);
                this.W = lVarF.a();
                float[] fArr2 = this.Z;
                if (fArr2 != null) {
                    if (this.f14167a0 == null) {
                        this.f14167a0 = new float[fArr2.length];
                    }
                    float fH = h();
                    int i13 = 0;
                    while (true) {
                        float[] fArr3 = this.Z;
                        if (i13 >= fArr3.length) {
                            break;
                        }
                        this.f14167a0[i13] = Math.max(0.0f, fArr3[i13] - fH);
                        i13++;
                    }
                } else {
                    this.f14167a0 = null;
                }
                m mVar2 = this.W;
                float[] fArr4 = this.f14167a0;
                float f10 = this.B.f14159j;
                RectF rectFF = f();
                RectF rectF = this.L;
                rectF.set(rectFF);
                float fH2 = h();
                rectF.inset(fH2, fH2);
                this.R.b(mVar2, fArr4, f10, rectF, null, this.J);
                this.G = false;
            }
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        m mVar = this.W;
        float[] fArr = this.f14167a0;
        RectF rectFF = f();
        RectF rectF = this.L;
        rectF.set(rectFF);
        float fH = h();
        rectF.inset(fH, fH);
        d(canvas, this.P, this.J, mVar, fArr, rectF);
    }

    public final RectF f() {
        Rect bounds = getBounds();
        RectF rectF = this.K;
        rectF.set(bounds);
        return rectF;
    }

    public final float g() {
        float[] fArr = this.Z;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFF = f();
        m mVar = this.B.f14150a;
        b1 b1Var = this.R;
        b1Var.getClass();
        float fA = mVar.f14185e.a(rectFF);
        m mVar2 = this.B.f14150a;
        b1Var.getClass();
        float fA2 = mVar2.f14188h.a(rectFF) + fA;
        m mVar3 = this.B.f14150a;
        b1Var.getClass();
        float fA3 = fA2 - mVar3.f14187g.a(rectFF);
        m mVar4 = this.B.f14150a;
        b1Var.getClass();
        return (fA3 - mVar4.f14186f.a(rectFF)) / 2.0f;
    }

    @Override
    public int getAlpha() {
        return this.B.l;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        return this.B;
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void getOutline(Outline outline) {
        this.B.getClass();
        RectF rectFF = f();
        if (rectFF.isEmpty()) {
            return;
        }
        float fB = b(rectFF, this.B.f14150a, this.Z);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.B.f14159j);
            return;
        }
        boolean z10 = this.F;
        Path path = this.I;
        if (z10) {
            a(rectFF, path);
            this.F = false;
        }
        lg.a.a(outline, path);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.B.f14157h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.M;
        region.set(bounds);
        RectF rectFF = f();
        Path path = this.I;
        a(rectFF, path);
        Region region2 = this.N;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        if (i()) {
            return this.P.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean i() {
        Paint.Style style = this.B.f14164q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.P.getStrokeWidth() > 0.0f;
    }

    @Override
    public final void invalidateSelf() {
        this.F = true;
        this.G = true;
        super.invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.B.f14155f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.B.getClass();
        ColorStateList colorStateList2 = this.B.f14154e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.B.f14153d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        y yVar = this.B.f14151b;
        return yVar != null && yVar.d();
    }

    public final void j(Context context) {
        this.B.f14152c = new mg.a(context);
        r();
    }

    public final void k(u5.f fVar) {
        if (this.X == fVar) {
            return;
        }
        this.X = fVar;
        int i10 = 0;
        while (true) {
            u5.e[] eVarArr = this.Y;
            if (i10 >= eVarArr.length) {
                p(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i10] == null) {
                eVarArr[i10] = new u5.e(this, f14166c0[i10]);
            }
            u5.e eVar = eVarArr[i10];
            u5.f fVar2 = new u5.f();
            fVar2.a((float) fVar.f14977b);
            double d3 = fVar.f14976a;
            fVar2.b((float) (d3 * d3));
            eVar.m = fVar2;
            i10++;
        }
    }

    public final void l(float f3) {
        g gVar = this.B;
        if (gVar.f14161n != f3) {
            gVar.f14161n = f3;
            r();
        }
    }

    public final void m(ColorStateList colorStateList) {
        g gVar = this.B;
        if (gVar.f14153d != colorStateList) {
            gVar.f14153d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override
    public Drawable mutate() {
        this.B = new g(this.B);
        return this;
    }

    public final void n(y yVar) {
        g gVar = this.B;
        if (gVar.f14151b != yVar) {
            gVar.f14151b = yVar;
            p(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean o(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.B.f14153d == null || color2 == (colorForState2 = this.B.f14153d.getColorForState(iArr, (color2 = (paint2 = this.O).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.B.f14154e == null || color == (colorForState = this.B.f14154e.getColorForState(iArr, (color = (paint = this.P).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.F = true;
        this.G = true;
        super.onBoundsChange(rect);
        if (this.B.f14151b != null && !rect.isEmpty()) {
            p(getState(), this.V);
        }
        this.V = rect.isEmpty();
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        if (this.B.f14151b != null) {
            p(iArr, false);
        }
        boolean z10 = o(iArr) || q();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(int[] iArr, boolean z10) {
        m mVarA;
        d dVar;
        int i10;
        RectF rectFF = f();
        if (this.B.f14151b == null || rectFF.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.X == null);
        if (this.Z == null) {
            this.Z = new float[4];
        }
        y yVar = this.B.f14151b;
        m[] mVarArr = yVar.f14229d;
        int i11 = yVar.f14226a;
        int[][] iArr2 = yVar.f14228c;
        w wVar = yVar.f14233h;
        w wVar2 = yVar.f14232g;
        w wVar3 = yVar.f14231f;
        w wVar4 = yVar.f14230e;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                i12 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    i10 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i13], iArr3)) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
            }
            i12 = i10;
        }
        if (wVar4 == null && wVar3 == null && wVar2 == null && wVar == null) {
            mVarA = mVarArr[i12];
        } else {
            l lVarF = mVarArr[i12].f();
            if (wVar4 != null) {
                lVarF.f14174e = wVar4.c(iArr);
            }
            if (wVar3 != null) {
                lVarF.f14175f = wVar3.c(iArr);
            }
            if (wVar2 != null) {
                lVarF.f14177h = wVar2.c(iArr);
            }
            if (wVar != null) {
                lVarF.f14176g = wVar.c(iArr);
            }
            mVarA = lVarF.a();
        }
        int i14 = 0;
        while (i14 < 4) {
            this.R.getClass();
            if (i14 == 1) {
                dVar = mVarA.f14187g;
            } else if (i14 != 2) {
                dVar = i14 != 3 ? mVarA.f14186f : mVarA.f14185e;
            } else {
                dVar = mVarA.f14188h;
            }
            float fA = dVar.a(rectFF);
            if (z11) {
                this.Z[i14] = fA;
            }
            u5.e[] eVarArr = this.Y;
            u5.e eVar = eVarArr[i14];
            if (eVar != null) {
                eVar.a(fA);
                if (z11) {
                    eVarArr[i14].d();
                }
            }
            i14++;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final boolean q() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.S;
        PorterDuffColorFilter porterDuffColorFilter3 = this.T;
        g gVar = this.B;
        ColorStateList colorStateList = gVar.f14155f;
        PorterDuff.Mode mode = gVar.f14156g;
        if (colorStateList == null || mode == null) {
            int color = this.O.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.S = porterDuffColorFilter;
        this.B.getClass();
        this.T = null;
        this.B.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.S) && Objects.equals(porterDuffColorFilter3, this.T)) ? false : true;
    }

    public final void r() {
        g gVar = this.B;
        float f3 = gVar.f14161n + 0.0f;
        gVar.f14162o = (int) Math.ceil(0.75f * f3);
        this.B.f14163p = (int) Math.ceil(f3 * 0.25f);
        q();
        super.invalidateSelf();
    }

    @Override
    public void setAlpha(int i10) {
        g gVar = this.B;
        if (gVar.l != i10) {
            gVar.l = i10;
            super.invalidateSelf();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.getClass();
        super.invalidateSelf();
    }

    @Override
    public final void setShapeAppearanceModel(m mVar) {
        g gVar = this.B;
        gVar.f14150a = mVar;
        gVar.f14151b = null;
        this.Z = null;
        this.f14167a0 = null;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        this.B.f14155f = colorStateList;
        q();
        super.invalidateSelf();
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.B;
        if (gVar.f14156g != mode) {
            gVar.f14156g = mode;
            q();
            super.invalidateSelf();
        }
    }
}
