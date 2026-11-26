package a1;

public final class e extends kotlin.jvm.internal.j implements u00.k {
    public final w0 A;

    public e(w0 w0Var) {
        super(1, kotlin.jvm.internal.l.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.A = w0Var;
    }

    public final Object invoke(Object obj) {
        float[] fArr = ((i2.h0) obj).f7137a;
        z2.a0 a0Var = (z2.a0) this.A.R.getValue();
        if (a0Var != null) {
            if (!a0Var.A()) {
                a0Var = null;
            }
            if (a0Var != null) {
                a0Var.k(fArr);
            }
        }
        return g00.b0.a;
    }
}
