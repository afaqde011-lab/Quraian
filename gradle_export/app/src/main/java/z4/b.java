package z4;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class b {
    public static final View.AccessibilityDelegate C = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A;
    public final a B;

    public b() {
        this(C);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.A = accessibilityDelegate;
        this.B = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.A.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public qj.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.A.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new qj.c(accessibilityNodeProvider, 3);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.A.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, a5.g gVar) {
        this.A.onInitializeAccessibilityNodeInfo(view, gVar.f187a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.A.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(2131363059);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 < list.size()) {
                a5.c cVar = (a5.c) list.get(i11);
                if (cVar.a() == i10) {
                    Class cls = cVar.f185c;
                    a5.p pVar = cVar.f186d;
                    if (pVar != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e3) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e3);
                            }
                        }
                        zPerformAccessibilityAction = pVar.b(view);
                        break;
                    }
                } else {
                    i11++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.A.performAccessibilityAction(view, i10, bundle);
        }
        if (zPerformAccessibilityAction || i10 != 2131361807 || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131363060);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.A.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.A.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
