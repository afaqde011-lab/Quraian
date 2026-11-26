package c2;

import android.view.ViewStructure;
import g00.b0;
import u00.p;

public final class n extends kotlin.jvm.internal.n implements p {
    public final ViewStructure A;

    public n(ViewStructure viewStructure) {
        super(4);
        this.A = viewStructure;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.A.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return b0.a;
    }
}
