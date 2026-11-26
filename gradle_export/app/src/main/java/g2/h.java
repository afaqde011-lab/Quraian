package g2;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

public abstract class h {

    public static final int[] f6064a = new int[2];

    public static final Rect f6065b = new Rect();

    public static final h2.c a(View view, View view2) {
        int[] iArr = f6064a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i12 = iArr[0];
        float f3 = i11 - iArr[1];
        Rect rect = f6065b;
        view.getFocusedRect(rect);
        float f10 = (i10 - i12) + rect.left;
        return new h2.c(f10, rect.top + f3, rect.width() + f10, f3 + rect.top + rect.height());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof c3.z) {
            return ((c3.z) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i10) {
        if (i10 == 5) {
            return 33;
        }
        if (i10 == 6) {
            return 130;
        }
        if (i10 == 3) {
            return 17;
        }
        if (i10 == 4) {
            return 66;
        }
        if (i10 == 1) {
            return 2;
        }
        return i10 == 2 ? 1 : null;
    }

    public static final f d(int i10) {
        if (i10 == 1) {
            return new f(2);
        }
        if (i10 == 2) {
            return new f(1);
        }
        if (i10 == 17) {
            return new f(3);
        }
        if (i10 == 33) {
            return new f(5);
        }
        if (i10 == 66) {
            return new f(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new f(6);
    }
}
