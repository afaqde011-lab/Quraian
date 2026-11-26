package androidx.glance.appwidget.protobuf;

public final class m0 {
    public static l0 a(Object obj, Object obj2) {
        l0 l0VarD = (l0) obj;
        l0 l0Var = (l0) obj2;
        if (!l0Var.isEmpty()) {
            if (!l0VarD.A) {
                l0VarD = l0VarD.d();
            }
            l0VarD.c();
            if (!l0Var.isEmpty()) {
                l0VarD.putAll(l0Var);
            }
        }
        return l0VarD;
    }
}
