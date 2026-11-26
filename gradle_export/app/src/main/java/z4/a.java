package z4;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public final class a extends View.AccessibilityDelegate {

    public final b f17174a;

    public a(b bVar) {
        this.f17174a = bVar;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f17174a.a(view, accessibilityEvent);
    }

    @Override
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        qj.c cVarB = this.f17174a.b(view);
        if (cVarB != null) {
            return (AccessibilityNodeProvider) cVarB.B;
        }
        return null;
    }

    @Override
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f17174a.c(view, accessibilityEvent);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        a5.g gVar = new a5.g(accessibilityNodeInfo);
        WeakHashMap weakHashMap = j0.f17198a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(g0.c(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(g0.b(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(g0.a(view));
        accessibilityNodeInfo.setStateDescription(i0.b(view));
        this.f17174a.d(view, gVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(2131363059);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            gVar.b((a5.c) list.get(i10));
        }
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f17174a.e(view, accessibilityEvent);
    }

    @Override
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f17174a.f(viewGroup, view, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return this.f17174a.g(view, i10, bundle);
    }

    @Override
    public final void sendAccessibilityEvent(View view, int i10) {
        this.f17174a.h(view, i10);
    }

    @Override
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f17174a.i(view, accessibilityEvent);
    }
}
