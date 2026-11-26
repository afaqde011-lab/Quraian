package p5;

import a5.g;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import c3.a0;
import com.google.android.gms.cast.Cast;
import com.google.android.material.chip.Chip;
import gj.e;
import hb.f;
import ig.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import ta.c0;
import u.t0;
import z4.j0;

public abstract class a extends z4.b {
    public static final Rect N = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final e O = new e(26);
    public static final f P = new f();
    public final AccessibilityManager H;
    public final Chip I;
    public a0 J;
    public final Rect D = new Rect();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public final int[] G = new int[2];
    public int K = Integer.MIN_VALUE;
    public int L = Integer.MIN_VALUE;
    public int M = Integer.MIN_VALUE;

    public a(Chip chip) {
        this.I = chip;
        this.H = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = j0.f17198a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override
    public final qj.c b(View view) {
        if (this.J == null) {
            this.J = new a0(this, 1);
        }
        return this.J;
    }

    @Override
    public final void d(View view, g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((d) this).Q;
        ig.f fVar = chip.E;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f7662w0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        gVar.g(chip.getAccessibilityClassName());
        gVar.k(chip.getText());
    }

    public final boolean j(int i10) {
        if (this.L != i10) {
            return false;
        }
        this.L = Integer.MIN_VALUE;
        p(i10, false);
        r(i10, 8);
        return true;
    }

    public final g k(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        gVar.g("android.view.View");
        Rect rect = N;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        gVar.f188b = -1;
        Chip chip = this.I;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i10, gVar);
        if (gVar.f() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.E;
        gVar.e(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & Cast.MAX_NAMESPACE_LENGTH) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        gVar.f189c = i10;
        accessibilityNodeInfoObtain.setSource(chip, i10);
        if (this.K == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            gVar.a(Cast.MAX_NAMESPACE_LENGTH);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            gVar.a(64);
        }
        boolean z10 = this.L == i10;
        if (z10) {
            gVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            gVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z10);
        int[] iArr = this.G;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.D;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            gVar.e(rect3);
            if (gVar.f188b != -1) {
                g gVar2 = new g(AccessibilityNodeInfo.obtain());
                for (int i11 = gVar.f188b; i11 != -1; i11 = gVar2.f188b) {
                    gVar2.f188b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = gVar2.f187a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i11, gVar2);
                    gVar2.e(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.F;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f187a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo2.setVisibleToUser(true);
                    }
                }
            }
        }
        return gVar;
    }

    public abstract void l(ArrayList arrayList);

    public final boolean m(int i10, Rect rect) {
        int i11;
        int i12;
        Object obj;
        g gVar;
        int i13;
        int iD;
        int i14;
        Rect rect2;
        int i15;
        Rect rect3;
        int i16;
        g gVar2;
        int i17;
        int iN;
        int iO;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        t0 t0Var = new t0(0);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            t0Var.e(((Integer) arrayList.get(i18)).intValue(), k(((Integer) arrayList.get(i18)).intValue()));
        }
        int i19 = this.L;
        g gVar3 = i19 == Integer.MIN_VALUE ? null : (g) t0Var.c(i19);
        e eVar = O;
        f fVar = P;
        Chip chip = this.I;
        if (i10 == 1 || i10 == 2) {
            i11 = 0;
            i12 = -1;
            WeakHashMap weakHashMap = j0.f17198a;
            boolean z10 = chip.getLayoutDirection() == 1;
            fVar.getClass();
            int i20 = t0Var.C;
            ArrayList arrayList2 = new ArrayList(i20);
            for (int i21 = 0; i21 < i20; i21++) {
                arrayList2.add((g) t0Var.f(i21));
            }
            Collections.sort(arrayList2, new b(z10, eVar));
            if (i10 == 1) {
                int size = arrayList2.size();
                if (gVar3 != null) {
                    size = arrayList2.indexOf(gVar3);
                }
                int i22 = size - 1;
                if (i22 >= 0) {
                    obj = arrayList2.get(i22);
                } else {
                    obj = null;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (gVar3 == null ? -1 : arrayList2.lastIndexOf(gVar3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            gVar = (g) obj;
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i23 = this.L;
            if (i23 != Integer.MIN_VALUE) {
                n(i23).e(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i10 == 17) {
                        i14 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i10 == 33) {
                        i14 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i10 == 66) {
                        i14 = -1;
                        rect4.set(-1, 0, -1, height);
                    } else {
                        if (i10 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i14 = -1;
                        rect4.set(0, -1, width, -1);
                    }
                }
                rect2 = new Rect(rect4);
                if (i10 != 17) {
                    i11 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i10 != 33) {
                    i11 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i10 != 66) {
                    i11 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                fVar.getClass();
                i15 = t0Var.C;
                rect3 = new Rect();
                gVar = null;
                for (i16 = i11; i16 < i15; i16++) {
                    gVar2 = (g) t0Var.f(i16);
                    if (gVar2 == gVar3) {
                        eVar.getClass();
                        gVar2.e(rect3);
                        if (c0.I(i10, rect4, rect3)) {
                            if (c0.I(i10, rect4, rect2) || c0.l(i10, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                gVar = gVar2;
                            } else if (c0.l(i10, rect4, rect2, rect3)) {
                                int iN2 = c0.N(i10, rect4, rect3);
                                int iO2 = c0.O(i10, rect4, rect3);
                                i17 = (iO2 * iO2) + (iN2 * 13 * iN2);
                                iN = c0.N(i10, rect4, rect2);
                                iO = c0.O(i10, rect4, rect2);
                                if (i17 < (iO * iO) + (iN * 13 * iN)) {
                                    rect2.set(rect3);
                                    gVar = gVar2;
                                }
                            }
                        }
                    }
                }
                i12 = i14;
            }
            i14 = -1;
            rect2 = new Rect(rect4);
            if (i10 != 17) {
                i11 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i10 != 33) {
                i11 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i10 != 66) {
                i11 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i10 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i11 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            fVar.getClass();
            i15 = t0Var.C;
            rect3 = new Rect();
            gVar = null;
            while (i16 < i15) {
                gVar2 = (g) t0Var.f(i16);
                if (gVar2 == gVar3) {
                    eVar.getClass();
                    gVar2.e(rect3);
                    if (c0.I(i10, rect4, rect3)) {
                        if (c0.I(i10, rect4, rect2)) {
                            rect2.set(rect3);
                            gVar = gVar2;
                        } else if (c0.l(i10, rect4, rect2, rect3)) {
                            int iN3 = c0.N(i10, rect4, rect3);
                            int iO3 = c0.O(i10, rect4, rect3);
                            i17 = (iO3 * iO3) + (iN3 * 13 * iN3);
                            iN = c0.N(i10, rect4, rect2);
                            iO = c0.O(i10, rect4, rect2);
                            if (i17 < (iO * iO) + (iN * 13 * iN)) {
                                rect2.set(rect3);
                                gVar = gVar2;
                            }
                        }
                    }
                }
            }
            i12 = i14;
        }
        g gVar4 = gVar;
        if (gVar4 == null) {
            iD = Integer.MIN_VALUE;
        } else {
            int i24 = t0Var.C;
            int i25 = i11;
            while (true) {
                if (i25 >= i24) {
                    i13 = i12;
                    break;
                }
                if (t0Var.B[i25] == gVar4) {
                    i13 = i25;
                    break;
                }
                i25++;
            }
            iD = t0Var.d(i13);
        }
        return q(iD);
    }

    public final g n(int i10) {
        if (i10 != -1) {
            return k(i10);
        }
        Chip chip = this.I;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        g gVar = new g(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = j0.f17198a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            gVar.f187a.addChild(chip, ((Integer) arrayList.get(i11)).intValue());
        }
        return gVar;
    }

    public abstract void o(int i10, g gVar);

    public abstract void p(int i10, boolean z10);

    public final boolean q(int i10) {
        int i11;
        Chip chip = this.I;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i11 = this.L) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.L = i10;
        p(i10, true);
        r(i10, 8);
        return true;
    }

    public final void r(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i10 == Integer.MIN_VALUE || !this.H.isEnabled() || (parent = (view = this.I).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            g gVarN = n(i10);
            accessibilityEventObtain.getText().add(gVarN.f());
            AccessibilityNodeInfo accessibilityNodeInfo = gVarN.f187a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i10);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
