package gg;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.i0;
import com.google.android.material.carousel.CarouselLayoutManager;
import m9.u;
import m9.v;
import m9.z;

public final class a implements View.OnLayoutChangeListener {

    public final int f6319a;

    public final Object f6320b;

    public a(Object obj, int i10) {
        this.f6319a = i10;
        this.f6320b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int height;
        int height2;
        switch (this.f6319a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f6320b;
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    view.post(new i0(carouselLayoutManager, 18));
                }
                break;
            case 1:
                u uVar = (u) this.f6320b;
                int i18 = uVar.S;
                PopupWindow popupWindow = uVar.R;
                int i19 = i13 - i11;
                int i20 = i17 - i15;
                if ((i12 - i10 != i16 - i14 || i19 != i20) && popupWindow.isShowing()) {
                    uVar.u();
                    popupWindow.update(view, (uVar.getWidth() - popupWindow.getWidth()) - i18, (-popupWindow.getHeight()) - i18, -1, -1);
                }
                break;
            default:
                z zVar = (z) this.f6320b;
                u uVar2 = zVar.f10776a;
                int width = (uVar2.getWidth() - uVar2.getPaddingLeft()) - uVar2.getPaddingRight();
                int height3 = (uVar2.getHeight() - uVar2.getPaddingBottom()) - uVar2.getPaddingTop();
                ViewGroup viewGroup = zVar.f10779d;
                int iC = z.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, z.c(zVar.l) + z.c(zVar.f10785j));
                ViewGroup viewGroup2 = zVar.f10780e;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z10 = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (zVar.B != z10) {
                    zVar.B = z10;
                    view.post(new v(zVar, 1));
                }
                boolean z11 = i12 - i10 != i16 - i14;
                if (!zVar.B && z11) {
                    view.post(new v(zVar, 2));
                    break;
                }
                break;
        }
    }
}
