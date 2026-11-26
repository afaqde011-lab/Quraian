package e1;

import android.view.MotionEvent;

public abstract class d0 {

    public static final du.w f4957a = v.f5011f;

    public static final boolean a(v2.k kVar) {
        MotionEvent motionEventA;
        ?? r4 = kVar.f15387a;
        int size = r4.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((v2.s) r4.get(i10)).f15407i != 2) {
                MotionEvent motionEventA2 = kVar.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = kVar.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
