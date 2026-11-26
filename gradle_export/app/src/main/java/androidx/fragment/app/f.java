package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class f extends k {

    public final boolean f699b;

    public boolean f700c;

    public p0 f701d;

    public f(g2 g2Var, boolean z10) {
        super(g2Var);
        kotlin.jvm.internal.m.e(g2Var, "operation");
        this.f699b = z10;
    }

    public final p0 b(Context context) {
        int enterAnim;
        p0 p0Var;
        Animator animatorLoadAnimator;
        int iF0;
        if (this.f700c) {
            return this.f701d;
        }
        g2 g2Var = this.f774a;
        j0 j0Var = g2Var.f735c;
        boolean z10 = g2Var.f733a == 2;
        int nextTransition = j0Var.getNextTransition();
        if (this.f699b) {
            enterAnim = z10 ? j0Var.getPopEnterAnim() : j0Var.getPopExitAnim();
        } else {
            enterAnim = z10 ? j0Var.getEnterAnim() : j0Var.getExitAnim();
        }
        j0Var.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = j0Var.mContainer;
        p0 p0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(2131363134) != null) {
            j0Var.mContainer.setTag(2131363134, null);
        }
        ViewGroup viewGroup2 = j0Var.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = j0Var.onCreateAnimation(nextTransition, z10, enterAnim);
            if (animationOnCreateAnimation != null) {
                p0Var2 = new p0(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = j0Var.onCreateAnimator(nextTransition, z10, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    p0Var2 = new p0(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iF0 = z10 ? 2130837513 : 2130837514;
                        } else if (nextTransition == 8194) {
                            iF0 = z10 ? 2130837509 : 2130837510;
                        } else if (nextTransition == 8197) {
                            iF0 = z10 ? a.a.f0(context, R.attr.activityCloseEnterAnimation) : a.a.f0(context, R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            iF0 = z10 ? 2130837511 : 2130837512;
                        } else if (nextTransition != 4100) {
                            iF0 = -1;
                        } else {
                            iF0 = z10 ? a.a.f0(context, R.attr.activityOpenEnterAnimation) : a.a.f0(context, R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = iF0;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    p0Var = new p0(animationLoadAnimation);
                                    p0Var2 = p0Var;
                                }
                            } catch (Resources.NotFoundException e3) {
                                throw e3;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        p0Var = new p0(animatorLoadAnimator);
                                        p0Var2 = p0Var;
                                    }
                                } catch (RuntimeException e10) {
                                    if (zEquals) {
                                        throw e10;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        p0Var2 = new p0(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                p0Var = new p0(animatorLoadAnimator);
                                p0Var2 = p0Var;
                            }
                        }
                    }
                }
            }
        }
        this.f701d = p0Var2;
        this.f700c = true;
        return p0Var2;
    }
}
