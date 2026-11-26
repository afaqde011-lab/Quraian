package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

public final class k0 {

    public static final w f916b = new w(1);

    public final Object f917a;

    public k0() {
        o0 o0Var;
        w0 w0Var = w0.f961c;
        try {
            o0Var = (o0) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o0Var = f916b;
        }
        o0[] o0VarArr = {w.f959b, o0Var};
        j0 j0Var = new j0();
        j0Var.f906a = o0VarArr;
        Charset charset = e0.f885a;
        this.f917a = j0Var;
    }

    public k0(o oVar) {
        Charset charset = e0.f885a;
        this.f917a = oVar;
        oVar.f934b = this;
    }

    public void a(int i10, Object obj, z0 z0Var) {
        o oVar = (o) this.f917a;
        oVar.x0(i10, 3);
        z0Var.d((a) obj, oVar.f934b);
        oVar.x0(i10, 4);
    }
}
