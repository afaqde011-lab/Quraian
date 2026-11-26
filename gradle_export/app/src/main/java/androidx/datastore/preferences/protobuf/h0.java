package androidx.datastore.preferences.protobuf;

public final class h0 {
    public static g0 a(Object obj, Object obj2) {
        g0 g0VarC = (g0) obj;
        g0 g0Var = (g0) obj2;
        if (!g0Var.isEmpty()) {
            if (!g0VarC.A) {
                g0VarC = g0VarC.c();
            }
            g0VarC.a();
            if (!g0Var.isEmpty()) {
                g0VarC.putAll(g0Var);
            }
        }
        return g0VarC;
    }
}
