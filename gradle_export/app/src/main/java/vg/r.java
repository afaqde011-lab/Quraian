package vg;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public final class r extends ArrayAdapter {
    public ColorStateList A;
    public ColorStateList B;
    public final s C;

    public r(s sVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.C = sVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        s sVar = this.C;
        ColorStateList colorStateList2 = sVar.L;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.B = colorStateList;
        if (sVar.K != 0 && sVar.L != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{q4.a.f(sVar.L.getColorForState(iArr3, 0), sVar.K), q4.a.f(sVar.L.getColorForState(iArr2, 0), sVar.K), sVar.K});
        }
        this.A = colorStateList3;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            s sVar = this.C;
            Drawable rippleDrawable = null;
            if (sVar.getText().toString().contentEquals(textView.getText()) && sVar.K != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(sVar.K);
                if (this.B != null) {
                    colorDrawable.setTintList(this.A);
                    rippleDrawable = new RippleDrawable(this.B, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
