package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class e extends AnimatorListenerAdapter {
    @Override
    public final void onAnimationCancel(Animator animator) {
        animator.end();
    }
}
