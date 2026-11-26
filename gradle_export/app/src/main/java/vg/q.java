package vg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.r3;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import p.v0;

public final class q {
    public ColorStateList A;
    public Typeface B;

    public final int f15671a;

    public final int f15672b;

    public final int f15673c;

    public final TimeInterpolator f15674d;

    public final TimeInterpolator f15675e;

    public final TimeInterpolator f15676f;

    public final Context f15677g;

    public final TextInputLayout f15678h;

    public LinearLayout f15679i;

    public int f15680j;

    public FrameLayout f15681k;
    public AnimatorSet l;
    public final float m;

    public int f15682n;

    public int f15683o;

    public CharSequence f15684p;

    public boolean f15685q;

    public v0 f15686r;

    public CharSequence f15687s;

    public int f15688t;

    public int f15689u;

    public ColorStateList f15690v;

    public CharSequence f15691w;

    public boolean f15692x;

    public v0 f15693y;

    public int f15694z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f15677g = context;
        this.f15678h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(2131165365);
        this.f15671a = ze.d.P(context, 2130969588, 217);
        this.f15672b = ze.d.P(context, 2130969584, 167);
        this.f15673c = ze.d.P(context, 2130969588, 167);
        this.f15674d = ze.d.Q(context, 2130969593, ag.a.f468d);
        LinearInterpolator linearInterpolator = ag.a.f465a;
        this.f15675e = ze.d.Q(context, 2130969593, linearInterpolator);
        this.f15676f = ze.d.Q(context, 2130969596, linearInterpolator);
    }

    public final void a(v0 v0Var, int i10) {
        if (this.f15679i == null && this.f15681k == null) {
            Context context = this.f15677g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f15679i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f15679i;
            TextInputLayout textInputLayout = this.f15678h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f15681k = new FrameLayout(context);
            this.f15679i.addView(this.f15681k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f15681k.setVisibility(0);
            this.f15681k.addView(v0Var);
        } else {
            this.f15679i.addView(v0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f15679i.setVisibility(0);
        this.f15680j++;
    }

    public final void b() {
        if (this.f15679i != null) {
            TextInputLayout textInputLayout = this.f15678h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f15677g;
                boolean zQ = g4.Q(context);
                LinearLayout linearLayout = this.f15679i;
                int paddingStart = editText.getPaddingStart();
                if (zQ) {
                    paddingStart = context.getResources().getDimensionPixelSize(2131166063);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166062);
                if (zQ) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166064);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zQ) {
                    paddingEnd = context.getResources().getDimensionPixelSize(2131166063);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, v0 v0Var, int i10, int i11, int i12) {
        if (v0Var == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z11 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
            int i13 = this.f15673c;
            objectAnimatorOfFloat.setDuration(z11 ? this.f15672b : i13);
            objectAnimatorOfFloat.setInterpolator(z11 ? this.f15675e : this.f15676f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(v0Var, (Property<v0, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f15671a);
            objectAnimatorOfFloat2.setInterpolator(this.f15674d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f15686r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f15693y;
    }

    public final void f() {
        this.f15684p = null;
        c();
        if (this.f15682n == 1) {
            if (!this.f15692x || TextUtils.isEmpty(this.f15691w)) {
                this.f15683o = 0;
            } else {
                this.f15683o = 2;
            }
        }
        i(this.f15682n, this.f15683o, h(this.f15686r, RuntimeVersion.SUFFIX));
    }

    public final void g(v0 v0Var, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f15679i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f15681k) != null) {
            frameLayout.removeView(v0Var);
        } else {
            linearLayout.removeView(v0Var);
        }
        int i11 = this.f15680j - 1;
        this.f15680j = i11;
        LinearLayout linearLayout2 = this.f15679i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(v0 v0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f15678h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f15683o == this.f15682n && v0Var != null && TextUtils.equals(v0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView textViewE;
        TextView textViewE2;
        q qVar = this;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            qVar.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            qVar.d(arrayList, qVar.f15692x, qVar.f15693y, 2, i10, i11);
            qVar.d(arrayList, qVar.f15685q, qVar.f15686r, 1, i10, i11);
            int size = arrayList.size();
            long jMax = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Animator animator = (Animator) arrayList.get(i12);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            r3 r3Var = new r3(this, i11, e(i10), i10, qVar.e(i11));
            qVar = this;
            animatorSet.addListener(r3Var);
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = qVar.e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            qVar.f15682n = i11;
        }
        TextInputLayout textInputLayout = qVar.f15678h;
        textInputLayout.t();
        textInputLayout.w(z10, false);
        textInputLayout.z();
    }
}
