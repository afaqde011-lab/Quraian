package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public final class q0 extends AnimationSet implements Runnable {
    public final ViewGroup A;
    public final View B;
    public boolean C;
    public boolean D;
    public boolean E;

    public q0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.E = true;
        this.A = viewGroup;
        this.B = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override
    public final boolean getTransformation(long j9, Transformation transformation) {
        this.E = true;
        if (this.C) {
            return !this.D;
        }
        if (!super.getTransformation(j9, transformation)) {
            this.C = true;
            z4.s.a(this.A, this);
        }
        return true;
    }

    @Override
    public final boolean getTransformation(long j9, Transformation transformation, float f3) {
        this.E = true;
        if (this.C) {
            return !this.D;
        }
        if (!super.getTransformation(j9, transformation, f3)) {
            this.C = true;
            z4.s.a(this.A, this);
        }
        return true;
    }

    @Override
    public final void run() {
        boolean z10 = this.C;
        ViewGroup viewGroup = this.A;
        if (z10 || !this.E) {
            viewGroup.endViewTransition(this.B);
            this.D = true;
        } else {
            this.E = false;
            viewGroup.post(this);
        }
    }
}
