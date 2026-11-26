package a1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.r9;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;

public abstract class b {
    public static int A(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static int B(int i10, int i11, int i12, int i13) {
        return r9.L(i10) + i11 + i12 + i13;
    }

    public static String C(int i10) {
        switch (i10) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static String D(int i10) {
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static String E(int i10) {
        if (i10 == 1) {
            return "REMOVED";
        }
        if (i10 == 2) {
            return "VISIBLE";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static final void a(int i10, View view, ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(view, "view");
        kotlin.jvm.internal.m.e(viewGroup, "container");
        if (androidx.fragment.app.i1.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iB = e4.f.b(i10);
        if (iB == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (androidx.fragment.app.i1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iB == 1) {
            if (androidx.fragment.app.i1.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (androidx.fragment.app.i1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iB == 2) {
            if (androidx.fragment.app.i1.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iB != 3) {
            return;
        }
        if (androidx.fragment.app.i1.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i10) {
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        return 10;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        return 11;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static int c(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int d(int i10, int i11, int i12) {
        return r9.L(i10) + i11 + i12;
    }

    public static int e(int i10, int i11, int i12, int i13) {
        return ((i10 / i11) * i12) + i13;
    }

    public static int f(int i10, int i11, int i12, int i13, int i14) {
        return Math.max(((i10 * i11) / i12) + i13, i14);
    }

    public static int g(m3.r0 r0Var, int i10, int i11) {
        return (r0Var.hashCode() + i10) * i11;
    }

    public static a10.t h(Class cls, String str, String str2, int i10, kotlin.jvm.internal.b0 b0Var) {
        return b0Var.h(new kotlin.jvm.internal.s(cls, str, str2, i10));
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String k(long j9, String str, StringBuilder sb2) {
        sb2.append(j9);
        sb2.append(str);
        return sb2.toString();
    }

    public static String l(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.B());
        return sb2.toString();
    }

    public static String m(Class cls, StringBuilder sb2) {
        sb2.append(cls.getCanonicalName());
        return sb2.toString();
    }

    public static String n(String str, androidx.fragment.app.j0 j0Var, String str2) {
        return str + j0Var + str2;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String r(Object[] objArr, int i10, String str, StringBuilder sb2) {
        sb2.append(String.format(str, Arrays.copyOf(objArr, i10)));
        return sb2.toString();
    }

    public static StringBuilder s(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static KotlinNothingValueException t(Object obj) {
        ri.t1.O(obj);
        return new KotlinNothingValueException();
    }

    public static KotlinNothingValueException u(String str) {
        y2.a.d(str);
        return new KotlinNothingValueException();
    }

    public static void v(int i10, l1.g0 g0Var, b3.f fVar, l1.g0 g0Var2, b3.e eVar) {
        l1.q.I(Integer.valueOf(i10), g0Var, fVar);
        l1.q.E(g0Var2, eVar);
    }

    public static void w(androidx.media3.common.c2 c2Var, kh.v vVar, androidx.media3.common.p1 p1Var) {
        vVar.a(p1Var, new androidx.media3.common.q1(c2Var, 0));
    }

    public static void x(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void y(String str, int i10, String str2) {
        e7.a.m(str2, str + i10);
    }

    public static void z(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }
}
