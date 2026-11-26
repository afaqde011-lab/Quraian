package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;

public abstract class o0 {
    public static void a(Activity activity, o oVar) {
        kotlin.jvm.internal.m.e(oVar, "event");
        if (activity instanceof w) {
            q lifecycle = ((w) activity).getLifecycle();
            if (lifecycle instanceof y) {
                ((y) lifecycle).g(oVar);
            }
        }
    }

    public static void b(Activity activity) {
        q0.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new q0.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new q0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
