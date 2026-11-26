package eg;

import ab.a0;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import s10.w0;
import sg.i;
import wb.o;
import z4.j1;
import z4.k1;

public final class e extends b {

    public final Boolean f5377a;

    public final j1 f5378b;

    public Window f5379c;

    public boolean f5380d;

    public e(View view, j1 j1Var) {
        this.f5378b = j1Var;
        i iVar = BottomSheetBehavior.A(view).f4121i;
        ColorStateList backgroundTintList = iVar != null ? iVar.B.f14153d : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.f5377a = Boolean.valueOf(a0.j0(backgroundTintList.getDefaultColor()));
            return;
        }
        Drawable background = view.getBackground();
        ColorStateList colorStateListValueOf = background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : background instanceof ColorStateListDrawable ? ((ColorStateListDrawable) background).getColorStateList() : null;
        Integer numValueOf = colorStateListValueOf != null ? Integer.valueOf(colorStateListValueOf.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.f5377a = Boolean.valueOf(a0.j0(numValueOf.intValue()));
        } else {
            this.f5377a = null;
        }
    }

    @Override
    public final void a(View view) {
        d(view);
    }

    @Override
    public final void b(View view) {
        d(view);
    }

    @Override
    public final void c(View view, int i10) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        j1 j1Var = this.f5378b;
        if (top < j1Var.d()) {
            Window window = this.f5379c;
            if (window != null) {
                Boolean bool = this.f5377a;
                boolean zBooleanValue = bool == null ? this.f5380d : bool.booleanValue();
                o oVar = new o(window.getDecorView());
                (Build.VERSION.SDK_INT >= 35 ? new k1(window, oVar) : new w0(window, oVar)).t(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), j1Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f5379c;
            if (window2 != null) {
                boolean z10 = this.f5380d;
                o oVar2 = new o(window2.getDecorView());
                (Build.VERSION.SDK_INT >= 35 ? new k1(window2, oVar2) : new w0(window2, oVar2)).t(z10);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f5379c == window) {
            return;
        }
        this.f5379c = window;
        if (window != null) {
            o oVar = new o(window.getDecorView());
            this.f5380d = (Build.VERSION.SDK_INT >= 35 ? new k1(window, oVar) : new w0(window, oVar)).l();
        }
    }
}
