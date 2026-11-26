package oc;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.google.android.gms.internal.measurement.y3;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class c extends ValueAnimator implements Choreographer.FrameCallback {
    public cc.a L;
    public final CopyOnWriteArraySet A = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet B = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet C = new CopyOnWriteArraySet();
    public float D = 1.0f;
    public boolean E = false;
    public long F = 0;
    public float G = 0.0f;
    public float H = 0.0f;
    public int I = 0;
    public float J = -2.1474836E9f;
    public float K = 2.1474836E9f;
    public boolean M = false;

    public final float a() {
        cc.a aVar = this.L;
        if (aVar == null) {
            return 0.0f;
        }
        float f3 = this.K;
        return f3 == 2.1474836E9f ? aVar.f3116k : f3;
    }

    @Override
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.B.add(animatorListener);
    }

    @Override
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.C.add(animatorPauseListener);
    }

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A.add(animatorUpdateListener);
    }

    public final float b() {
        cc.a aVar = this.L;
        if (aVar == null) {
            return 0.0f;
        }
        float f3 = this.J;
        return f3 == -2.1474836E9f ? aVar.f3115j : f3;
    }

    public final boolean c() {
        return this.D < 0.0f;
    }

    @Override
    public final void cancel() {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        d(c());
        f(true);
    }

    public final void d(boolean z10) {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z10);
        }
    }

    @Override
    public final void doFrame(long j9) {
        boolean z10 = false;
        if (this.M) {
            f(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        cc.a aVar = this.L;
        if (aVar == null || !this.M) {
            return;
        }
        long j10 = this.F;
        float fAbs = (j10 != 0 ? j9 - j10 : 0L) / ((1.0E9f / aVar.l) / Math.abs(this.D));
        float f3 = this.G;
        if (c()) {
            fAbs = -fAbs;
        }
        float f10 = f3 + fAbs;
        float fB = b();
        float fA = a();
        PointF pointF = d.f11921a;
        if (f10 >= fB && f10 <= fA) {
            z10 = true;
        }
        float fB2 = d.b(f10, b(), a());
        this.G = fB2;
        this.H = fB2;
        this.F = j9;
        e();
        if (!z10) {
            if (getRepeatCount() == -1 || this.I < getRepeatCount()) {
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.I++;
                if (getRepeatMode() == 2) {
                    this.E = !this.E;
                    this.D = -this.D;
                } else {
                    float fA2 = c() ? a() : b();
                    this.G = fA2;
                    this.H = fA2;
                }
                this.F = j9;
            } else {
                float fB3 = this.D < 0.0f ? b() : a();
                this.G = fB3;
                this.H = fB3;
                f(true);
                d(c());
            }
        }
        if (this.L != null) {
            float f11 = this.H;
            if (f11 < this.J || f11 > this.K) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.J), Float.valueOf(this.K), Float.valueOf(this.H)));
            }
        }
        y3.D();
    }

    public final void e() {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void f(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.M = false;
        }
    }

    public final void g(float f3) {
        if (this.G == f3) {
            return;
        }
        float fB = d.b(f3, b(), a());
        this.G = fB;
        this.H = fB;
        this.F = 0L;
        e();
    }

    @Override
    public final float getAnimatedFraction() {
        float fB;
        float fA;
        float fB2;
        if (this.L == null) {
            return 0.0f;
        }
        if (c()) {
            fB = a() - this.H;
            fA = a();
            fB2 = b();
        } else {
            fB = this.H - b();
            fA = a();
            fB2 = b();
        }
        return fB / (fA - fB2);
    }

    @Override
    public final Object getAnimatedValue() {
        float f3;
        cc.a aVar = this.L;
        if (aVar == null) {
            f3 = 0.0f;
        } else {
            float f10 = this.H;
            float f11 = aVar.f3115j;
            f3 = (f10 - f11) / (aVar.f3116k - f11);
        }
        return Float.valueOf(f3);
    }

    @Override
    public final long getDuration() {
        cc.a aVar = this.L;
        if (aVar == null) {
            return 0L;
        }
        return (long) aVar.b();
    }

    @Override
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f3, float f10) {
        if (f3 > f10) {
            throw new IllegalArgumentException("minFrame (" + f3 + ") must be <= maxFrame (" + f10 + ")");
        }
        cc.a aVar = this.L;
        float f11 = aVar == null ? -3.4028235E38f : aVar.f3115j;
        float f12 = aVar == null ? Float.MAX_VALUE : aVar.f3116k;
        float fB = d.b(f3, f11, f12);
        float fB2 = d.b(f10, f11, f12);
        if (fB == this.J && fB2 == this.K) {
            return;
        }
        this.J = fB;
        this.K = fB2;
        g((int) d.b(this.H, fB, fB2));
    }

    @Override
    public final boolean isRunning() {
        return this.M;
    }

    @Override
    public final void removeAllListeners() {
        this.B.clear();
    }

    @Override
    public final void removeAllUpdateListeners() {
        this.A.clear();
    }

    @Override
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.B.remove(animatorListener);
    }

    @Override
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.C.remove(animatorPauseListener);
    }

    @Override
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A.remove(animatorUpdateListener);
    }

    @Override
    public final Animator setDuration(long j9) {
        setDuration(j9);
        throw null;
    }

    @Override
    public final ValueAnimator setDuration(long j9) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.E) {
            return;
        }
        this.E = false;
        this.D = -this.D;
    }

    @Override
    public final void setStartDelay(long j9) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
