package ba;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class q0 extends ViewGroup.MarginLayoutParams {

    public f1 f2392a;

    public final Rect f2393b;

    public boolean f2394c;

    public boolean f2395d;

    public q0(int i10, int i11) {
        super(i10, i11);
        this.f2393b = new Rect();
        this.f2394c = true;
        this.f2395d = false;
    }

    public q0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2393b = new Rect();
        this.f2394c = true;
        this.f2395d = false;
    }

    public q0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2393b = new Rect();
        this.f2394c = true;
        this.f2395d = false;
    }

    public q0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2393b = new Rect();
        this.f2394c = true;
        this.f2395d = false;
    }

    public q0(q0 q0Var) {
        super((ViewGroup.LayoutParams) q0Var);
        this.f2393b = new Rect();
        this.f2394c = true;
        this.f2395d = false;
    }
}
