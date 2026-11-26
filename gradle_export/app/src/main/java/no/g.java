package no;

import android.view.WindowManager;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import d40.p1;
import java.util.function.Consumer;

public final class g {
    public WindowManager b;
    public q c;
    public final p1 a = d40.o.c(Boolean.FALSE);
    public final f d = new Consumer() {
        @Override
        public final void accept(Object obj) {
            boolean z;
            q qVar;
            p pVarB;
            Integer num = (Integer) obj;
            if (num != null) {
                z = num.intValue() == 1;
            }
            g gVar = this.a;
            if (z || !((qVar = gVar.c) == null || (pVarB = qVar.b()) == null || pVarB.compareTo(p.E) < 0)) {
                p1 p1Var = gVar.a;
                Boolean boolValueOf = Boolean.valueOf(z);
                p1Var.getClass();
                p1Var.k(null, boolValueOf);
            }
        }
    };
}
