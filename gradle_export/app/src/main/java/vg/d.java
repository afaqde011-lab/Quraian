package vg;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

public final class d extends o {

    public final int f15641e;

    public final int f15642f;

    public final TimeInterpolator f15643g;

    public final TimeInterpolator f15644h;

    public EditText f15645i;

    public final androidx.mediarouter.app.c f15646j;

    public final a f15647k;
    public AnimatorSet l;
    public ValueAnimator m;

    public d(n nVar) {
        super(nVar);
        this.f15646j = new androidx.mediarouter.app.c(this, 7);
        this.f15647k = new a(this, 0);
        this.f15641e = ze.d.P(nVar.getContext(), 2130969587, 100);
        this.f15642f = ze.d.P(nVar.getContext(), 2130969587, 150);
        this.f15643g = ze.d.Q(nVar.getContext(), 2130969596, ag.a.f465a);
        this.f15644h = ze.d.Q(nVar.getContext(), 2130969594, ag.a.f468d);
    }

    @Override
    public final void a() {
        if (this.f15667b.P != null) {
            return;
        }
        s(t());
    }

    @Override
    public final int c() {
        return 2131886338;
    }

    @Override
    public final int d() {
        return 2131231579;
    }

    @Override
    public final View.OnFocusChangeListener e() {
        return this.f15647k;
    }

    @Override
    public final View.OnClickListener f() {
        return this.f15646j;
    }

    @Override
    public final View.OnFocusChangeListener g() {
        return this.f15647k;
    }

    @Override
    public final void l(EditText editText) {
        this.f15645i = editText;
        this.f15666a.setEndIconVisible(t());
    }

    @Override
    public final void o(boolean z10) {
        if (this.f15667b.P == null) {
            return;
        }
        s(z10);
    }

    @Override
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f15644h);
        valueAnimatorOfFloat.setDuration(this.f15642f);
        final int i10 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final d f15638b;

            {
                this.f15638b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i11 = i10;
                d dVar = this.f15638b;
                dVar.getClass();
                switch (i11) {
                    case 0:
                        dVar.f15669d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f15669d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15643g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f15641e;
        valueAnimatorOfFloat2.setDuration(i11);
        final int i12 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final d f15638b;

            {
                this.f15638b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i13 = i12;
                d dVar = this.f15638b;
                dVar.getClass();
                switch (i13) {
                    case 0:
                        dVar.f15669d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f15669d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new c(this, i12));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i11);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

            public final d f15638b;

            {
                this.f15638b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i13 = i12;
                d dVar = this.f15638b;
                dVar.getClass();
                switch (i13) {
                    case 0:
                        dVar.f15669d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f15669d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i10));
    }

    @Override
    public final void r() {
        EditText editText = this.f15645i;
        if (editText != null) {
            editText.post(new m9.f(this, 17));
        }
    }

    public final void s(boolean z10) {
        boolean z11 = this.f15667b.d() == z10;
        if (z10 && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z11) {
                this.l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z11) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.f15645i;
        if (editText != null) {
            return (editText.hasFocus() || this.f15669d.hasFocus()) && this.f15645i.getText().length() > 0;
        }
        return false;
    }
}
