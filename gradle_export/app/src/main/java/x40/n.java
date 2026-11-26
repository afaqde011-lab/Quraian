package x40;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class n extends z {
    public static final s c;
    public final List a;
    public final List b;

    static {
        Pattern pattern = s.d;
        c = w50.c.H("application/x-www-form-urlencoded");
    }

    public n(ArrayList encodedNames, ArrayList encodedValues) {
        kotlin.jvm.internal.m.e(encodedNames, "encodedNames");
        kotlin.jvm.internal.m.e(encodedValues, "encodedValues");
        this.a = y40.b.w(encodedNames);
        this.b = y40.b.w(encodedValues);
    }

    @Override
    public final long a() {
        return d(null, true);
    }

    @Override
    public final s b() {
        return c;
    }

    @Override
    public final void c(k50.j jVar) throws EOFException {
        d(jVar, false);
    }

    public final long d(k50.j jVar, boolean z) throws EOFException {
        k50.i iVarB;
        if (z) {
            iVarB = new k50.i();
        } else {
            kotlin.jvm.internal.m.b(jVar);
            iVarB = jVar.b();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                iVarB.q0(38);
            }
            iVarB.w0((String) list.get(i));
            iVarB.q0(61);
            iVarB.w0((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = iVarB.B;
        iVarB.a();
        return j;
    }
}
