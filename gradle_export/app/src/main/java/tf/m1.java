package tf;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class m1 implements Callable {

    public final int f14664a;

    public final g4 f14665b;

    public final Bundle f14666c;

    public final n1 f14667d;

    public m1(n1 n1Var, g4 g4Var, Bundle bundle, int i10) {
        this.f14664a = i10;
        this.f14665b = g4Var;
        this.f14666c = bundle;
        this.f14667d = n1Var;
    }

    @Override
    public final Object call() {
        switch (this.f14664a) {
            case 0:
                n1 n1Var = this.f14667d;
                n1Var.f14673e.x();
                return n1Var.f14673e.a0(this.f14666c, this.f14665b);
            default:
                n1 n1Var2 = this.f14667d;
                n1Var2.f14673e.x();
                return n1Var2.f14673e.a0(this.f14666c, this.f14665b);
        }
    }
}
