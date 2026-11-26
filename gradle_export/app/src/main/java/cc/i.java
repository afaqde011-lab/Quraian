package cc;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.Iterator;

public final class i extends Drawable implements Drawable.Callback, Animatable {
    public a A;
    public final oc.c B;
    public final boolean C;
    public final ArrayList D;
    public hc.a E;
    public ce.c F;
    public boolean G;
    public lc.c H;
    public int I;
    public boolean J;
    public final Matrix K;
    public Bitmap L;
    public Canvas M;
    public Rect N;
    public RectF O;
    public dc.a P;
    public Rect Q;
    public Rect R;
    public RectF S;
    public RectF T;
    public Matrix U;
    public Matrix V;
    public boolean W;
    public int X;
    public int Y;

    public i() {
        oc.c cVar = new oc.c();
        this.B = cVar;
        this.C = true;
        this.X = 1;
        this.D = new ArrayList();
        ba.k kVar = new ba.k(this, 1);
        this.G = true;
        this.I = 255;
        this.Y = 1;
        this.J = false;
        this.K = new Matrix();
        this.W = false;
        cVar.addUpdateListener(kVar);
    }

    public static void b(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a() {
        a aVar = this.A;
        if (aVar == null) {
            return;
        }
        int i10 = this.Y;
        int i11 = aVar.m;
        int iB = e4.f.b(i10);
        boolean z10 = false;
        if (iB != 1 && (iB == 2 || i11 > 4)) {
            z10 = true;
        }
        this.J = z10;
    }

    public final void c() {
        if (this.H == null) {
            this.D.add(new f(this, 1));
            return;
        }
        a();
        boolean z10 = this.C;
        oc.c cVar = this.B;
        if (z10 || cVar.getRepeatCount() == 0) {
            if (isVisible()) {
                cVar.M = true;
                boolean zC = cVar.c();
                Iterator it = cVar.B.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(cVar, zC);
                }
                cVar.g((int) (cVar.c() ? cVar.a() : cVar.b()));
                cVar.F = 0L;
                cVar.I = 0;
                if (cVar.M) {
                    cVar.f(false);
                    Choreographer.getInstance().postFrameCallback(cVar);
                }
                this.X = 1;
            } else {
                this.X = 2;
            }
        }
        if (z10) {
            return;
        }
        f((int) (cVar.D < 0.0f ? cVar.b() : cVar.a()));
        cVar.f(true);
        cVar.d(cVar.c());
        if (isVisible()) {
            return;
        }
        this.X = 1;
    }

    public final void d(Canvas canvas, lc.c cVar) {
        boolean z10;
        if (this.A == null || cVar == null) {
            return;
        }
        if (this.M == null) {
            this.M = new Canvas();
            this.T = new RectF();
            this.U = new Matrix();
            this.V = new Matrix();
            this.N = new Rect();
            this.O = new RectF();
            this.P = new dc.a();
            this.Q = new Rect();
            this.R = new Rect();
            this.S = new RectF();
        }
        canvas.getMatrix(this.U);
        canvas.getClipBounds(this.N);
        Rect rect = this.N;
        this.O.set(rect.left, rect.top, rect.right, rect.bottom);
        this.U.mapRect(this.O);
        b(this.N, this.O);
        if (this.G) {
            this.T.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.c(this.T, null, false);
        }
        this.U.mapRect(this.T);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.T;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z10 = !((ViewGroup) parent).getClipChildren();
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            RectF rectF2 = this.T;
            Rect rect2 = this.N;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.T.width());
        int iCeil2 = (int) Math.ceil(this.T.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        Bitmap bitmap = this.L;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.L.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.L = bitmapCreateBitmap;
            this.M.setBitmap(bitmapCreateBitmap);
            this.W = true;
        } else if (this.L.getWidth() > iCeil || this.L.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.L, 0, 0, iCeil, iCeil2);
            this.L = bitmapCreateBitmap2;
            this.M.setBitmap(bitmapCreateBitmap2);
            this.W = true;
        }
        if (this.W) {
            Matrix matrix = this.U;
            Matrix matrix2 = this.K;
            matrix2.set(matrix);
            matrix2.preScale(fWidth, fHeight);
            RectF rectF3 = this.T;
            matrix2.postTranslate(-rectF3.left, -rectF3.top);
            this.L.eraseColor(0);
            cVar.d(this.M, matrix2, this.I);
            this.U.invert(this.V);
            this.V.mapRect(this.S, this.T);
            b(this.R, this.S);
        }
        this.Q.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.L, this.Q, this.R, this.P);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.J) {
            d(canvas, this.H);
        } else {
            lc.c cVar = this.H;
            a aVar = this.A;
            if (cVar != null && aVar != null) {
                Matrix matrix = this.K;
                matrix.reset();
                Rect bounds = getBounds();
                if (!bounds.isEmpty()) {
                    matrix.preScale(bounds.width() / aVar.f3114i.width(), bounds.height() / aVar.f3114i.height());
                    matrix.preTranslate(bounds.left, bounds.top);
                }
                cVar.d(canvas, matrix, this.I);
            }
        }
        this.W = false;
        y3.D();
    }

    public final void e() {
        if (this.H == null) {
            this.D.add(new f(this, 0));
            return;
        }
        a();
        boolean z10 = this.C;
        oc.c cVar = this.B;
        if (z10 || cVar.getRepeatCount() == 0) {
            if (isVisible()) {
                cVar.M = true;
                cVar.f(false);
                Choreographer.getInstance().postFrameCallback(cVar);
                cVar.F = 0L;
                if (cVar.c() && cVar.H == cVar.b()) {
                    cVar.g(cVar.a());
                } else if (!cVar.c() && cVar.H == cVar.a()) {
                    cVar.g(cVar.b());
                }
                Iterator it = cVar.C.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(cVar);
                }
                this.X = 1;
            } else {
                this.X = 3;
            }
        }
        if (z10) {
            return;
        }
        f((int) (cVar.D < 0.0f ? cVar.b() : cVar.a()));
        cVar.f(true);
        cVar.d(cVar.c());
        if (isVisible()) {
            return;
        }
        this.X = 1;
    }

    public final void f(final int i10) {
        if (this.A != null) {
            this.B.g(i10);
        } else {
            this.D.add(new h() {
                @Override
                public final void run() {
                    this.f3125a.f(i10);
                }
            });
        }
    }

    public final void g(final float f3) {
        a aVar = this.A;
        if (aVar == null) {
            this.D.add(new h() {
                @Override
                public final void run() {
                    this.f3129a.g(f3);
                }
            });
        } else {
            this.B.g(oc.d.d(aVar.f3115j, aVar.f3116k, f3));
            y3.D();
        }
    }

    @Override
    public final int getAlpha() {
        return this.I;
    }

    @Override
    public final int getIntrinsicHeight() {
        a aVar = this.A;
        if (aVar == null) {
            return -1;
        }
        return aVar.f3114i.height();
    }

    @Override
    public final int getIntrinsicWidth() {
        a aVar = this.A;
        if (aVar == null) {
            return -1;
        }
        return aVar.f3114i.width();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override
    public final void invalidateSelf() {
        if (this.W) {
            return;
        }
        this.W = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isRunning() {
        oc.c cVar = this.B;
        if (cVar == null) {
            return false;
        }
        return cVar.M;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j9);
    }

    @Override
    public final void setAlpha(int i10) {
        this.I = i10;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        oc.b.a("Use addColorFilter instead.");
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            int i10 = this.X;
            if (i10 == 2) {
                c();
                return visible;
            }
            if (i10 == 3) {
                e();
                return visible;
            }
        } else {
            oc.c cVar = this.B;
            if (cVar.M) {
                this.D.clear();
                cVar.f(true);
                Iterator it = cVar.C.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(cVar);
                }
                if (!isVisible()) {
                    this.X = 1;
                }
                this.X = 3;
                return visible;
            }
            if (zIsVisible) {
                this.X = 1;
            }
        }
        return visible;
    }

    @Override
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        c();
    }

    @Override
    public final void stop() {
        this.D.clear();
        oc.c cVar = this.B;
        cVar.f(true);
        cVar.d(cVar.c());
        if (isVisible()) {
            return;
        }
        this.X = 1;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
