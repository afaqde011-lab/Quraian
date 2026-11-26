package androidx.datastore.preferences.protobuf;

public final class a0 {
    public static w a(Object obj, long j9) {
        w wVar = (w) h1.f615c.h(obj, j9);
        if (((b) wVar).A) {
            return wVar;
        }
        s0 s0Var = (s0) wVar;
        int i10 = s0Var.C;
        s0 s0VarC = s0Var.c(i10 == 0 ? 10 : i10 * 2);
        h1.o(obj, j9, s0VarC);
        return s0VarC;
    }
}
