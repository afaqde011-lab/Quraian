package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/q0;", "Landroid/app/Fragment;", "<init>", "()V", "a", "androidx/lifecycle/o0", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class q0 extends Fragment {
    public static final int A = 0;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final p0 Companion = new p0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.m.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i10 = q0.A;
            o0.a(activity, o.ON_CREATE);
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i10 = q0.A;
            o0.a(activity, o.ON_RESUME);
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i10 = q0.A;
            o0.a(activity, o.ON_START);
        }

        @Override
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i10 = q0.A;
            o0.a(activity, o.ON_DESTROY);
        }

        @Override
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i10 = q0.A;
            o0.a(activity, o.ON_PAUSE);
        }

        @Override
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            int i10 = q0.A;
            o0.a(activity, o.ON_STOP);
        }

        @Override
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.m.e(activity, "activity");
            kotlin.jvm.internal.m.e(bundle, "bundle");
        }

        @Override
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }

        @Override
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
        }
    }

    @Override
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m mVar = o.Companion;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        m mVar = o.Companion;
    }

    @Override
    public final void onPause() {
        super.onPause();
        m mVar = o.Companion;
    }

    @Override
    public final void onResume() {
        super.onResume();
        m mVar = o.Companion;
    }

    @Override
    public final void onStart() {
        super.onStart();
        m mVar = o.Companion;
    }

    @Override
    public final void onStop() {
        super.onStop();
        m mVar = o.Companion;
    }
}
