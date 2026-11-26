package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

public final class k0 extends w1 implements m0 {

    public CharSequence f12176a0;

    public h0 f12177b0;

    public final Rect f12178c0;

    public int f12179d0;

    public final n0 f12180e0;

    public k0(n0 n0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969817, 0);
        this.f12180e0 = n0Var;
        this.f12178c0 = new Rect();
        this.O = n0Var;
        this.Y = true;
        this.Z.setFocusable(true);
        this.P = new i0(this, 0);
    }

    @Override
    public final CharSequence e() {
        return this.f12176a0;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f12176a0 = charSequence;
    }

    @Override
    public final void l(int i10) {
        this.f12179d0 = i10;
    }

    @Override
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.Z;
        boolean zIsShowing = yVar.isShowing();
        r();
        yVar.setInputMethodMode(2);
        show();
        j1 j1Var = this.C;
        j1Var.setChoiceMode(1);
        j1Var.setTextDirection(i10);
        j1Var.setTextAlignment(i11);
        n0 n0Var = this.f12180e0;
        int selectedItemPosition = n0Var.getSelectedItemPosition();
        j1 j1Var2 = this.C;
        if (yVar.isShowing() && j1Var2 != null) {
            j1Var2.setListSelectionHidden(false);
            j1Var2.setSelection(selectedItemPosition);
            if (j1Var2.getChoiceMode() != 0) {
                j1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = n0Var.getViewTreeObserver()) == null) {
            return;
        }
        o.d dVar = new o.d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        yVar.setOnDismissListener(new j0(this, dVar));
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f12177b0 = (h0) listAdapter;
    }

    public final void r() {
        int i10;
        n0 n0Var = this.f12180e0;
        Rect rect = n0Var.H;
        y yVar = this.Z;
        Drawable background = yVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i10 = n0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = n0Var.getPaddingLeft();
        int paddingRight = n0Var.getPaddingRight();
        int width = n0Var.getWidth();
        int i11 = n0Var.G;
        if (i11 == -2) {
            int iA = n0Var.a(this.f12177b0, yVar.getBackground());
            int i12 = (n0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i12) {
                iA = i12;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i11);
        }
        this.F = n0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.E) - this.f12179d0) + i10 : paddingLeft + this.f12179d0 + i10;
    }
}
