package c2;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import g00.b0;
import u00.p;

public final class a extends kotlin.jvm.internal.n implements p {
    public final c A;
    public final int B;

    public a(c cVar, int i10) {
        super(4);
        this.A = cVar;
        this.B = i10;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        c cVar = this.A;
        me.i iVar = cVar.A;
        ((AutofillManager) iVar.B).notifyViewEntered(cVar.C, this.B, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return b0.a;
    }
}
