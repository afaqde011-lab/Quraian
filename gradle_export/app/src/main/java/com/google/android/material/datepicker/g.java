package com.google.android.material.datepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

public final class g extends z4.b {
    public final int D;

    public g(int i10) {
        this.D = i10;
    }

    @Override
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.D) {
            case 3:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override
    public final void d(View view, a5.g gVar) {
        int scrollRange;
        switch (this.D) {
            case 0:
                this.A.onInitializeAccessibilityNodeInfo(view, gVar.f187a);
                gVar.h(null);
                break;
            case 1:
                this.A.onInitializeAccessibilityNodeInfo(view, gVar.f187a);
                gVar.j(false);
                break;
            case 2:
                this.A.onInitializeAccessibilityNodeInfo(view, gVar.f187a);
                gVar.h(null);
                break;
            case 3:
                this.A.onInitializeAccessibilityNodeInfo(view, gVar.f187a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                gVar.g(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    gVar.j(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        gVar.b(a5.c.f175i);
                        gVar.b(a5.c.f178n);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        gVar.b(a5.c.f174h);
                        gVar.b(a5.c.f180p);
                    }
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
                this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                break;
        }
    }

    @Override
    public boolean g(View view, int i10, Bundle bundle) {
        int iMin;
        switch (this.D) {
            case 3:
                if (super.g(view, i10, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i10 == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i10 == 8192 || i10 == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i10 == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.g(view, i10, bundle);
        }
    }
}
