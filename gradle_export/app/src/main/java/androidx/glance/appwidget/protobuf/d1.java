package androidx.glance.appwidget.protobuf;

public final class d1 extends b1 {
    @Override
    public final c1 a(Object obj) {
        z zVar = (z) obj;
        c1 c1Var = zVar.unknownFields;
        if (c1Var != c1.f875f) {
            return c1Var;
        }
        c1 c1VarC = c1.c();
        zVar.unknownFields = c1VarC;
        return c1VarC;
    }
}
