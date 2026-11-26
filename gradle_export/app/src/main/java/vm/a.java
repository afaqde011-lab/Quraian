package vm;

import androidx.lifecycle.a1;
import bt.a2;
import d40.d1;
import d40.i;
import d40.n;
import d40.p1;
import k00.c;
import kotlin.jvm.internal.m;
import pm.b;
import pm.d;
import r9.e;

public abstract class a extends a1 implements d {
    public final b c;

    public a(Object obj) {
        this.c = new b(obj);
    }

    @Override
    public final Object a(Object obj, c cVar) {
        return this.c.a(obj, cVar);
    }

    public final i h() {
        d1 d1Var = this.c.c;
        m.e(d1Var, "<this>");
        return new a2(new n(new e(3), d1Var, null), 5);
    }

    public final void i(Object uiState) {
        m.e(uiState, "uiState");
        b bVar = this.c;
        bVar.getClass();
        p1 p1Var = bVar.d;
        while (!p1Var.i(p1Var.getValue(), uiState)) {
        }
    }
}
