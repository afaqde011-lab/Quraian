package ta;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import i7.j1;
import java.util.HashMap;

public final class h extends t {

    public static final String[] f14460f0 = {"android:visibility:visibility", "android:visibility:parent"};

    public final int f14461e0;

    public h() {
        this.f14461e0 = 3;
    }

    public h(int i10) {
        this();
        this.f14461e0 = i10;
    }

    public static void Q(a0 a0Var) {
        View view = a0Var.f14426b;
        int visibility = view.getVisibility();
        HashMap map = a0Var.f14425a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float S(a0 a0Var, float f3) {
        Float f10;
        return (a0Var == null || (f10 = (Float) a0Var.f14425a.get("android:fade:transitionAlpha")) == null) ? f3 : f10.floatValue();
    }

    public static j1 T(a0 a0Var, a0 a0Var2) {
        j1 j1Var = new j1();
        j1Var.f7380a = false;
        j1Var.f7381b = false;
        if (a0Var != null) {
            HashMap map = a0Var.f14425a;
            if (map.containsKey("android:visibility:visibility")) {
                j1Var.f7382c = ((Integer) map.get("android:visibility:visibility")).intValue();
                j1Var.f7384e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                j1Var.f7382c = -1;
                j1Var.f7384e = null;
            }
        } else {
            j1Var.f7382c = -1;
            j1Var.f7384e = null;
        }
        if (a0Var2 != null) {
            HashMap map2 = a0Var2.f14425a;
            if (map2.containsKey("android:visibility:visibility")) {
                j1Var.f7383d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                j1Var.f7385f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                j1Var.f7383d = -1;
                j1Var.f7385f = null;
            }
        } else {
            j1Var.f7383d = -1;
            j1Var.f7385f = null;
        }
        if (a0Var != null && a0Var2 != null) {
            int i10 = j1Var.f7382c;
            int i11 = j1Var.f7383d;
            if (i10 != i11 || ((ViewGroup) j1Var.f7384e) != ((ViewGroup) j1Var.f7385f)) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        j1Var.f7381b = false;
                        j1Var.f7380a = true;
                        return j1Var;
                    }
                    if (i11 == 0) {
                        j1Var.f7381b = true;
                        j1Var.f7380a = true;
                        return j1Var;
                    }
                } else {
                    if (((ViewGroup) j1Var.f7385f) == null) {
                        j1Var.f7381b = false;
                        j1Var.f7380a = true;
                        return j1Var;
                    }
                    if (((ViewGroup) j1Var.f7384e) == null) {
                        j1Var.f7381b = true;
                        j1Var.f7380a = true;
                        return j1Var;
                    }
                }
            }
        } else {
            if (a0Var == null && j1Var.f7383d == 0) {
                j1Var.f7381b = true;
                j1Var.f7380a = true;
                return j1Var;
            }
            if (a0Var2 == null && j1Var.f7382c == 0) {
                j1Var.f7381b = false;
                j1Var.f7380a = true;
            }
        }
        return j1Var;
    }

    public final ObjectAnimator R(View view, float f3, float f10) {
        if (f3 == f10) {
            return null;
        }
        b bVar = b0.f14429a;
        view.setTransitionAlpha(f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, b0.f14429a, f10);
        g gVar = new g(view);
        objectAnimatorOfFloat.addListener(gVar);
        q().a(gVar);
        return objectAnimatorOfFloat;
    }

    @Override
    public final void d(a0 a0Var) {
        Q(a0Var);
    }

    @Override
    public final void g(a0 a0Var) {
        Q(a0Var);
        View view = a0Var.f14426b;
        Float fValueOf = (Float) view.getTag(2131363113);
        if (fValueOf == null) {
            if (view.getVisibility() == 0) {
                b bVar = b0.f14429a;
                fValueOf = Float.valueOf(view.getTransitionAlpha());
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        a0Var.f14425a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override
    public final android.animation.Animator m(android.view.ViewGroup r25, ta.a0 r26, ta.a0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: ta.h.m(android.view.ViewGroup, ta.a0, ta.a0):android.animation.Animator");
    }

    @Override
    public final String[] t() {
        return f14460f0;
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final boolean x(a0 a0Var, a0 a0Var2) {
        if (a0Var == null && a0Var2 == null) {
            return false;
        }
        if (a0Var != null && a0Var2 != null && a0Var2.f14425a.containsKey("android:visibility:visibility") != a0Var.f14425a.containsKey("android:visibility:visibility")) {
            return false;
        }
        j1 j1VarT = T(a0Var, a0Var2);
        if (j1VarT.f7380a) {
            return j1VarT.f7382c == 0 || j1VarT.f7383d == 0;
        }
        return false;
    }
}
