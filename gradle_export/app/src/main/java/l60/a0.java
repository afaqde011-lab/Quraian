package l60;

import com.google.android.gms.internal.measurement.x5;
import java.io.IOException;
import java.lang.reflect.Method;

public final class a0 extends w0 {
    public final Method d;
    public final int e;
    public final m f;

    public a0(Method method, int i, m mVar) {
        this.d = method;
        this.e = i;
        this.f = mVar;
    }

    @Override
    public final void a(m0 m0Var, Object obj) {
        int i = this.e;
        Method method = this.d;
        if (obj == null) {
            throw w0.n(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            m0Var.k = (x40.z) this.f.convert(obj);
        } catch (IOException e) {
            throw w0.o(method, e, i, x5.l(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
