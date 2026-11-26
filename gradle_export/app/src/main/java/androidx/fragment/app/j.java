package androidx.fragment.app;

import android.animation.AnimatorSet;

public final class j {

    public static final j f773a = new j();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.m.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j9) {
        kotlin.jvm.internal.m.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j9);
    }
}
