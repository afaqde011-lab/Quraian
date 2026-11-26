package androidx.datastore.preferences.protobuf;

public final class c1 extends a1 {
    @Override
    public final b1 a(Object obj) {
        v vVar = (v) obj;
        b1 b1Var = vVar.unknownFields;
        if (b1Var != b1.f588f) {
            return b1Var;
        }
        b1 b1Var2 = new b1(0, new int[8], new Object[8], true);
        vVar.unknownFields = b1Var2;
        return b1Var2;
    }
}
