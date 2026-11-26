package l60;

import java.lang.reflect.Method;

public final class d0 extends w0 {
    public final int d;
    public final Method e;
    public final int f;

    public d0(Method method, int i, int i2) {
        this.d = i2;
        this.e = method;
        this.f = i;
    }

    @Override
    public final void a(m0 m0Var, Object obj) {
        switch (this.d) {
            case 0:
                x40.p pVar = (x40.p) obj;
                if (pVar == null) {
                    throw w0.n(this.e, this.f, "Headers parameter must not be null.", new Object[0]);
                }
                db.g gVar = m0Var.f;
                gVar.getClass();
                int size = pVar.size();
                for (int i = 0; i < size; i++) {
                    gVar.e(pVar.c(i), pVar.h(i));
                }
                return;
            default:
                if (obj == null) {
                    throw w0.n(this.e, this.f, "@Url parameter is null.", new Object[0]);
                }
                m0Var.c = obj.toString();
                return;
        }
    }
}
