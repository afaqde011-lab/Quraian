package z4;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class j0 {

    public static WeakHashMap f17198a;

    public static final int[] f17199b = {2131361808, 2131361809, 2131361820, 2131361831, 2131361834, 2131361835, 2131361836, 2131361837, 2131361838, 2131361839, 2131361810, 2131361811, 2131361812, 2131361813, 2131361814, 2131361815, 2131361816, 2131361817, 2131361818, 2131361819, 2131361821, 2131361822, 2131361823, 2131361824, 2131361825, 2131361826, 2131361827, 2131361828, 2131361829, 2131361830, 2131361832, 2131361833};

    public static final b0 f17200c = new b0();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        kotlin.jvm.internal.m.e(view2, "<this>");
        view2.setTag(2131363127, viewGroup);
    }

    public static n0 b(View view) {
        if (f17198a == null) {
            f17198a = new WeakHashMap();
        }
        n0 n0Var = (n0) f17198a.get(view);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(view);
        f17198a.put(view, n0Var2);
        return n0Var2;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131363059);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131363059, arrayList2);
        return arrayList2;
    }

    public static void d(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = g0.a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(g0.a(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e3);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(g0.a(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void e(View view, int i10) {
        ArrayList arrayListC = c(view);
        for (int i11 = 0; i11 < arrayListC.size(); i11++) {
            if (((a5.c) arrayListC.get(i11)).a() == i10) {
                arrayListC.remove(i11);
                return;
            }
        }
    }

    public static void f(View view, a5.c cVar, a5.p pVar) {
        b bVar;
        a5.c cVar2 = new a5.c(null, cVar.f184b, null, pVar, cVar.f185c);
        View.AccessibilityDelegate accessibilityDelegateA = h0.a(view);
        if (accessibilityDelegateA == null) {
            bVar = null;
        } else {
            bVar = accessibilityDelegateA instanceof a ? ((a) accessibilityDelegateA).f17174a : new b(accessibilityDelegateA);
        }
        if (bVar == null) {
            bVar = new b();
        }
        g(view, bVar);
        e(view, cVar2.a());
        c(view).add(cVar2);
        d(view, 0);
    }

    public static void g(View view, b bVar) {
        if (bVar == null && (h0.a(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.B);
    }

    public static void h(View view, CharSequence charSequence) {
        new a0(2131363062, CharSequence.class, 8, 28, 0).i(view, charSequence);
        b0 b0Var = f17200c;
        if (charSequence == null) {
            b0Var.A.remove(view);
            view.removeOnAttachStateChangeListener(b0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(b0Var);
        } else {
            b0Var.A.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(b0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b0Var);
            }
        }
    }

    public static void i(View view, f7.e eVar) {
        view.setWindowInsetsAnimationCallback(eVar != null ? new p0(eVar) : null);
    }
}
