package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

public final class j extends z4.b {
    public final int D;
    public final Object E;

    public j(Object obj, int i10) {
        this.D = i10;
        this.E = obj;
    }

    @Override
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.D) {
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.E).D);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override
    public final void d(View view, a5.g gVar) {
        int i10 = this.D;
        Object obj = this.E;
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f187a);
                m mVar = (m) obj;
                gVar.b(new a5.c(16, mVar.L.getVisibility() == 0 ? mVar.getString(2131886893) : mVar.getString(2131886891)));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((eg.f) obj).K) {
                    gVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                }
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f187a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i11 = MaterialButtonToggleGroup.Q;
                int i12 = -1;
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < materialButtonToggleGroup.getChildCount(); i14++) {
                        if (materialButtonToggleGroup.getChildAt(i14) == view) {
                            i12 = i13;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i14) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i14).getVisibility() != 8) {
                                i13++;
                            }
                        }
                    }
                }
                gVar.i(a5.f.a(((MaterialButton) view).O, 0, 1, i12, 1));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f187a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.E);
                accessibilityNodeInfo2.setChecked(checkableImageButton.D);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = gVar.f187a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f4169a0);
                break;
        }
    }

    @Override
    public boolean g(View view, int i10, Bundle bundle) {
        switch (this.D) {
            case 1:
                if (i10 == 1048576) {
                    eg.f fVar = (eg.f) this.E;
                    if (fVar.K) {
                        fVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i10, bundle);
            default:
                return super.g(view, i10, bundle);
        }
    }
}
