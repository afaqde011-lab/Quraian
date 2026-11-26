package q40;

import kotlinx.serialization.json.internal.JsonDecodingException;
import p40.b1;
import p40.o0;

public abstract class m {
    public static final p40.a0 a = o0.a("kotlinx.serialization.json.JsonUnquotedLiteral", b1.a);

    public static final b0 a(Number number) {
        return new r(number, false, null);
    }

    public static final b0 b(String str) {
        return str == null ? u.INSTANCE : new r(str, true, null);
    }

    public static final void c(String str, l lVar) {
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.a0.a.b(lVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(b0 b0Var) {
        String strA = b0Var.a();
        String[] strArr = r40.w.a;
        kotlin.jvm.internal.m.e(strA, "<this>");
        if (strA.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strA.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int e(b0 b0Var) {
        try {
            long jO = new a20.g(b0Var.a()).o();
            if (-2147483648L <= jO && jO <= 2147483647L) {
                return (int) jO;
            }
            throw new NumberFormatException(b0Var.a() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final e f(l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        e eVar = lVar instanceof e ? (e) lVar : null;
        if (eVar != null) {
            return eVar;
        }
        c("JsonArray", lVar);
        throw null;
    }

    public static final x g(l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        x xVar = lVar instanceof x ? (x) lVar : null;
        if (xVar != null) {
            return xVar;
        }
        c("JsonObject", lVar);
        throw null;
    }

    public static final b0 h(l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        b0 b0Var = lVar instanceof b0 ? (b0) lVar : null;
        if (b0Var != null) {
            return b0Var;
        }
        c("JsonPrimitive", lVar);
        throw null;
    }
}
