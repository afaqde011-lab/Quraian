package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

public final class e2 implements Runnable {
    public final int A;
    public final s B;
    public final g2 C;

    public e2(s sVar, g2 g2Var, int i10) {
        this.A = i10;
        this.B = sVar;
        this.C = g2Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                s sVar = this.B;
                ArrayList arrayList = sVar.f817b;
                g2 g2Var = this.C;
                if (arrayList.contains(g2Var)) {
                    int i10 = g2Var.f733a;
                    View view = g2Var.f735c.mView;
                    kotlin.jvm.internal.m.d(view, "operation.fragment.mView");
                    a1.b.a(i10, view, sVar.f816a);
                }
                break;
            case 1:
                s sVar2 = this.B;
                kotlin.jvm.internal.m.e(sVar2, "this$0");
                g2 g2Var2 = this.C;
                kotlin.jvm.internal.m.e(g2Var2, "$operation");
                sVar2.a(g2Var2);
                break;
            default:
                s sVar3 = this.B;
                ArrayList arrayList2 = sVar3.f817b;
                g2 g2Var3 = this.C;
                arrayList2.remove(g2Var3);
                sVar3.f818c.remove(g2Var3);
                break;
        }
    }
}
