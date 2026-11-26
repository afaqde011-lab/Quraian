package c3;

import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;

public final class z2 implements View.OnAttachStateChangeListener {
    public final int A;
    public final a B;

    public z2(a aVar, int i10) {
        this.A = i10;
        this.B = aVar;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.A;
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        switch (this.A) {
            case 0:
                this.B.e();
                break;
            default:
                a aVar = this.B;
                Iterator it = q30.l.n0(aVar.getParent(), z4.l0.A).iterator();
                while (true) {
                    z10 = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            kotlin.jvm.internal.m.e(view2, "<this>");
                            Object tag = view2.getTag(2131362749);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    aVar.e();
                }
                break;
        }
    }
}
