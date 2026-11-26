package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;

public final class o extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Serializable E;

    public o(Object obj, Object obj2, Object obj3, Serializable serializable, int i10) {
        super(0);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = serializable;
    }

    public final Object invoke() throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.C;
                p pVar = (p) this.B;
                if (i1.K(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                b2 b2Var = pVar.f791f;
                Object obj = this.D;
                Object objI = b2Var.i(viewGroup, obj);
                pVar.f800q = objI;
                if (objI == null) {
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    pVar.f801r = true;
                } else {
                    this.E.A = new n(pVar, obj, viewGroup);
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + pVar.f789d + " to " + pVar.f790e);
                    }
                }
                break;
            default:
                ((c4.x) this.B).d((u00.a) this.C, (c4.v) this.D, (y3.m) this.E);
                break;
        }
        return g00.b0.a;
    }
}
