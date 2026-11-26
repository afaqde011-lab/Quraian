package androidx.media3.common;

public final class m1 implements eh.x {
    public final int A;
    public final b2 B;

    public m1(b2 b2Var, int i10) {
        this.A = i10;
        this.B = b2Var;
    }

    @Override
    public final Object get() {
        switch (this.A) {
            case 0:
                b2 b2Var = this.B;
                a2 a2VarA = b2Var.a();
                a2VarA.b(Math.max(0, b2Var.f1122u - 1));
                return new b2(a2VarA);
            case 1:
                b2 b2Var2 = this.B;
                a2 a2VarA2 = b2Var2.a();
                a2VarA2.f1072f = null;
                a2VarA2.f1070d = b2Var2.f1127z.isEmpty() ? 4 : 2;
                return new b2(a2VarA2);
            default:
                b2 b2Var3 = this.B;
                a2 a2VarA3 = b2Var3.a();
                a2VarA3.b(Math.max(0, b2Var3.f1122u - 1));
                return new b2(a2VarA3);
        }
    }
}
