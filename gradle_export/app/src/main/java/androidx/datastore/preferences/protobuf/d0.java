package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

public final class d0 {

    public static final s f597b = new s(1);

    public final Object f598a;

    public d0() {
        j0 j0Var;
        r0 r0Var = r0.f672c;
        try {
            j0Var = (j0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            j0Var = f597b;
        }
        j0[] j0VarArr = {s.f675b, j0Var};
        c0 c0Var = new c0();
        c0Var.f596a = j0VarArr;
        Charset charset = x.f684a;
        this.f598a = c0Var;
    }

    public d0(l lVar) {
        x.a(lVar, "output");
        this.f598a = lVar;
        lVar.f641b = this;
    }

    public void a(int i10, Object obj, u0 u0Var) {
        l lVar = (l) this.f598a;
        lVar.o0(i10, 3);
        u0Var.a((a) obj, lVar.f641b);
        lVar.o0(i10, 4);
    }
}
