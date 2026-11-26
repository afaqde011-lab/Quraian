package a5;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.cast.Cast;

public final class c {

    public static final c f171e;

    public static final c f172f;

    public static final c f173g;

    public static final c f174h;

    public static final c f175i;

    public static final c f176j;

    public static final c f177k;
    public static final c l;
    public static final c m;

    public static final c f178n;

    public static final c f179o;

    public static final c f180p;

    public static final c f181q;

    public static final c f182r;

    public final Object f183a;

    public final int f184b;

    public final Class f185c;

    public final p f186d;

    static {
        boolean z10;
        new c(1, (String) null);
        new c(2, (String) null);
        new c(4, (String) null);
        new c(8, (String) null);
        f171e = new c(16, (String) null);
        new c(32, (String) null);
        f172f = new c(64, (String) null);
        f173g = new c(Cast.MAX_NAMESPACE_LENGTH, (String) null);
        new c(256, i.class);
        new c(512, i.class);
        new c(1024, j.class);
        new c(2048, j.class);
        f174h = new c(4096, (String) null);
        f175i = new c(8192, (String) null);
        new c(16384, (String) null);
        new c(32768, (String) null);
        new c(Cast.MAX_MESSAGE_LENGTH, (String) null);
        new c(131072, n.class);
        f176j = new c(262144, (String) null);
        f177k = new c(524288, (String) null);
        l = new c(1048576, (String) null);
        new c(2097152, o.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        m = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, l.class);
        f178n = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f179o = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f180p = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f181q = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i10 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, m.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, k.class);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START, R.id.accessibilityActionDragStart, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP, R.id.accessibilityActionDragDrop, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL, R.id.accessibilityActionDragCancel, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        f182r = new c(i10 >= 34 ? b.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i11 = u4.a.f14938a;
        if (i10 >= 36) {
            z10 = (i10 < 36 ? i10 * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001;
        }
        new c(z10 ? e.a() : null, R.id.ALT, null, null, null);
    }

    public c(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public c(int i10, String str) {
        this(null, i10, str, null, null);
    }

    public c(Object obj, int i10, CharSequence charSequence, p pVar, Class cls) {
        this.f184b = i10;
        this.f186d = pVar;
        if (obj == null) {
            this.f183a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f183a = obj;
        }
        this.f185c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f183a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f183a;
        Object obj3 = this.f183a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f183a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strD = g.d(this.f184b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f183a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strD);
        return sb2.toString();
    }
}
