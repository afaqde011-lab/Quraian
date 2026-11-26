package l60;

import com.google.android.gms.internal.measurement.x5;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

public final class e0 extends w0 {
    public final int d = 1;
    public final Method e;
    public final int f;
    public final m g;
    public final Object h;

    public e0(Method method, int i, m mVar, String str) {
        this.e = method;
        this.f = i;
        this.g = mVar;
        this.h = str;
    }

    public e0(Method method, int i, x40.p pVar, m mVar) {
        this.e = method;
        this.f = i;
        this.h = pVar;
        this.g = mVar;
    }

    @Override
    public final void a(m0 m0Var, Object obj) {
        switch (this.d) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    m0Var.c((x40.p) this.h, (x40.z) this.g.convert(obj));
                    return;
                } catch (IOException e) {
                    throw w0.n(this.e, this.f, x5.l(obj, "Unable to convert ", " to RequestBody"), e);
                }
            default:
                Map map = (Map) obj;
                int i = this.f;
                Method method = this.e;
                if (map == null) {
                    throw w0.n(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw w0.n(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw w0.n(method, i, a1.b.p("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    m0Var.c(w00.a.B("Content-Disposition", a1.b.p("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) this.h), (x40.z) this.g.convert(value));
                }
                return;
        }
    }
}
