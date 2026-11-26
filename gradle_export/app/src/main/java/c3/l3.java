package c3;

import android.view.View;
import android.view.ViewGroup;

public final class l3 implements View.OnAttachStateChangeListener {
    public final int A;
    public final View B;
    public final Object C;

    public l3(View view, Object obj, int i10) {
        this.A = i10;
        this.B = view;
        this.C = obj;
    }

    private final void a(View view) {
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.A) {
            case 0:
                break;
            default:
                ((ViewGroup) this.B).addView((c5.e) this.C, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.A) {
            case 0:
                this.B.removeOnAttachStateChangeListener(this);
                ((l1.x1) this.C).A();
                break;
            default:
                ((ViewGroup) this.B).addView((c5.e) this.C, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
