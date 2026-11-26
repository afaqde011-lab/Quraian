package ta;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

public final class f extends t {

    public static final String[] f14447e0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    public static final b f14448f0 = new b(PointF.class, "topLeft", 0);

    public static final b f14449g0 = new b(PointF.class, "bottomRight", 1);

    public static final b f14450h0 = new b(PointF.class, "bottomRight", 2);

    public static final b f14451i0 = new b(PointF.class, "topLeft", 3);

    public static final b f14452j0 = new b(PointF.class, "position", 4);

    public static void Q(a0 a0Var) {
        View view = a0Var.f14426b;
        HashMap map = a0Var.f14425a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override
    public final void d(a0 a0Var) {
        Q(a0Var);
    }

    @Override
    public final void g(a0 a0Var) {
        Q(a0Var);
    }

    @Override
    public final Animator m(ViewGroup viewGroup, a0 a0Var, a0 a0Var2) {
        int i10;
        f fVar;
        Animator animatorOfObject;
        if (a0Var == null) {
            return null;
        }
        HashMap map = a0Var.f14425a;
        if (a0Var2 == null) {
            return null;
        }
        HashMap map2 = a0Var2.f14425a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = a0Var2.f14426b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i10 = 0;
        } else {
            i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        int i23 = i10;
        if (i23 <= 0) {
            return null;
        }
        b bVar = b0.f14429a;
        view.setLeftTopRightBottom(i11, i13, i15, i17);
        if (i23 != 2) {
            fVar = this;
            if (i11 == i12 && i13 == i14) {
                fVar.W.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f14450h0, (TypeConverter) null, rp.m.a(i15, i17, i16, i18));
            } else {
                fVar.W.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f14451i0, (TypeConverter) null, rp.m.a(i11, i13, i12, i14));
            }
        } else if (i19 == i21 && i20 == i22) {
            fVar = this;
            fVar.W.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, f14452j0, (TypeConverter) null, rp.m.a(i11, i13, i12, i14));
        } else {
            fVar = this;
            e eVar = new e(view);
            fVar.W.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(eVar, f14448f0, (TypeConverter) null, rp.m.a(i11, i13, i12, i14));
            fVar.W.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, f14449g0, (TypeConverter) null, rp.m.a(i15, i17, i16, i18));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new c(eVar));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            viewGroup4.suppressLayout(true);
            fVar.q().a(new d(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override
    public final String[] t() {
        return f14447e0;
    }

    @Override
    public final boolean w() {
        return true;
    }
}
