package sd;

import java.util.Iterator;

public final class k implements e {

    public final boolean f14001a;

    public final String f14002b;

    public k(String str, boolean z10) {
        this.f14001a = z10;
        this.f14002b = str;
    }

    @Override
    public final boolean a(w0 w0Var) {
        int i10;
        boolean z10 = this.f14001a;
        String strO = this.f14002b;
        if (z10 && strO == null) {
            strO = w0Var.o();
        }
        u0 u0Var = w0Var.f14130b;
        if (u0Var != null) {
            Iterator it = u0Var.a().iterator();
            i10 = 0;
            while (it.hasNext()) {
                w0 w0Var2 = (w0) ((y0) it.next());
                if (strO == null || w0Var2.o().equals(strO)) {
                    i10++;
                }
            }
        } else {
            i10 = 1;
        }
        return i10 == 1;
    }

    public final String toString() {
        return this.f14001a ? a1.b.p("only-of-type <", this.f14002b, ">") : "only-child";
    }
}
