package v2;

import android.view.MotionEvent;

public final class x extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final y B;

    public x(y yVar, int i10) {
        super(1);
        this.A = i10;
        this.B = yVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                b4.e eVar = this.B.A;
                if (eVar != null) {
                    eVar.invoke(motionEvent);
                    return g00.b0.a;
                }
                kotlin.jvm.internal.m.k("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                b4.e eVar2 = this.B.A;
                if (eVar2 != null) {
                    eVar2.invoke(motionEvent2);
                    return g00.b0.a;
                }
                kotlin.jvm.internal.m.k("onTouchEvent");
                throw null;
        }
    }
}
