package g30;

import e30.m0;
import h00.x;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class l {
    public static final l a = new l();
    public static final e b = e.A;
    public static final a c;
    public static final i d;
    public static final i e;
    public static final Set f;

    static {
        b[] bVarArr = b.A;
        c = new a(n20.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        d = c(k.H, new String[0]);
        e = c(k.U, new String[0]);
        f = w50.c.g0(new f());
    }

    public static final g a(h hVar, boolean z, String... formatParams) {
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        if (!z) {
            return new g(hVar, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        kotlin.jvm.internal.m.e(formatParams2, "formatParams");
        return new m(hVar, (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static final g b(h hVar, String... strArr) {
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i c(k kind, String... strArr) {
        kotlin.jvm.internal.m.e(kind, "kind");
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return e(kind, x.A, d(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static j d(k kind, String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static i e(k kind, List list, m0 m0Var, String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return new i(m0Var, b(h.ERROR_TYPE_SCOPE, m0Var.toString()), kind, list, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(j10.k kVar) {
        if (kVar != null) {
            return (kVar instanceof a) || (kVar.l() instanceof a) || kVar == b;
        }
        return false;
    }
}
