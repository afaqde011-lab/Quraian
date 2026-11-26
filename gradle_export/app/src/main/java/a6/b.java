package a6;

import android.util.Log;
import androidx.fragment.app.i1;
import androidx.fragment.app.j0;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.m;

public abstract class b {

    public static final a f192a = a.f191a;

    public static a a(j0 j0Var) {
        while (j0Var != null) {
            if (j0Var.isAdded()) {
                m.d(j0Var.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            j0Var = j0Var.getParentFragment();
        }
        return f192a;
    }

    public static void b(Violation violation) {
        if (i1.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.A.getClass().getName()), violation);
        }
    }

    public static final void c(j0 j0Var, String str) {
        m.e(str, "previousFragmentId");
        b(new FragmentReuseViolation(j0Var, "Attempting to reuse fragment " + j0Var + " with previous ID " + str));
        a(j0Var).getClass();
    }
}
