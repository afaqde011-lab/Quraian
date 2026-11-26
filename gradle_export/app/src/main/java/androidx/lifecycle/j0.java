package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public final class j0 extends g {
    final k0 this$0;

    public static final class a extends g {
        final k0 this$0;

        public a(k0 k0Var) {
            this.this$0 = k0Var;
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            k0 k0Var = this.this$0;
            int i10 = k0Var.B + 1;
            k0Var.B = i10;
            if (i10 == 1) {
                if (k0Var.C) {
                    k0Var.F.g(o.ON_RESUME);
                    k0Var.C = false;
                } else {
                    Handler handler = k0Var.E;
                    kotlin.jvm.internal.m.b(handler);
                    handler.removeCallbacks(k0Var.G);
                }
            }
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            k0 k0Var = this.this$0;
            int i10 = k0Var.A + 1;
            k0Var.A = i10;
            if (i10 == 1 && k0Var.D) {
                k0Var.F.g(o.ON_START);
                k0Var.D = false;
            }
        }
    }

    public j0(k0 k0Var) {
        this.this$0 = k0Var;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        k0 k0Var = this.this$0;
        int i10 = k0Var.B - 1;
        k0Var.B = i10;
        if (i10 == 0) {
            Handler handler = k0Var.E;
            kotlin.jvm.internal.m.b(handler);
            handler.postDelayed(k0Var.G, 700L);
        }
    }

    @Override
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new a(this.this$0));
    }

    @Override
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        k0 k0Var = this.this$0;
        int i10 = k0Var.A - 1;
        k0Var.A = i10;
        if (i10 == 0 && k0Var.C) {
            k0Var.F.g(o.ON_STOP);
            k0Var.D = true;
        }
    }
}
