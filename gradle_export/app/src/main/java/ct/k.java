package ct;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l0.j0;
import l1.z0;

public final class k implements u00.a {
    public final int A;
    public final z0 B;

    public k(z0 z0Var, int i) {
        this.A = i;
        this.B = z0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.setValue(Boolean.TRUE);
                return g00.b0.a;
            case 1:
                this.B.setValue(Boolean.FALSE);
                return g00.b0.a;
            case 2:
                z0 z0Var = this.B;
                z0Var.setValue(Boolean.valueOf(!p30.f.I(z0Var)));
                return g00.b0.a;
            case 3:
                z0 z0Var2 = this.B;
                z0Var2.setValue(Boolean.valueOf(!((Boolean) z0Var2.getValue()).booleanValue()));
                return g00.b0.a;
            case 4:
                z0 z0Var3 = this.B;
                z0Var3.setValue(Boolean.valueOf(!((Boolean) z0Var3.getValue()).booleanValue()));
                return g00.b0.a;
            case 5:
                return (z2.a0) this.B.getValue();
            case 6:
                ((u00.a) this.B.getValue()).invoke();
                return g00.b0.a;
            case 7:
                ((u00.a) this.B.getValue()).invoke();
                return g00.b0.a;
            case 8:
                return new j0.h((u00.k) this.B.getValue());
            case 9:
                return new k0.i((u00.k) this.B.getValue());
            case 10:
                return (j0) ((u00.a) this.B.getValue()).invoke();
            case 11:
                return Integer.valueOf(((h00.b) ((lu.a0) this.B.getValue()).a).a());
            case 12:
                z2.a0 a0Var = (z2.a0) this.B.getValue();
                if (a0Var == null || !a0Var.A()) {
                    return null;
                }
                return a0Var;
            case 13:
                z0 z0Var4 = this.B;
                z0Var4.setValue(Boolean.valueOf(!((Boolean) z0Var4.getValue()).booleanValue()));
                return g00.b0.a;
            case 14:
                this.B.setValue(Boolean.FALSE);
                return g00.b0.a;
            case 15:
                this.B.setValue(Boolean.FALSE);
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                z0 z0Var5 = this.B;
                if (z0Var5 != null) {
                    return (List) z0Var5.getValue();
                }
                return null;
            case 17:
                Boolean bool = (Boolean) this.B.getValue();
                bool.booleanValue();
                return bool;
            case 18:
                ((u00.a) this.B.getValue()).invoke();
                return g00.b0.a;
            case 19:
                Boolean bool2 = (Boolean) this.B.getValue();
                bool2.booleanValue();
                return bool2;
            case 20:
                this.B.setValue(Boolean.FALSE);
                return g00.b0.a;
            case 21:
                this.B.setValue(Boolean.TRUE);
                return g00.b0.a;
            case 22:
                this.B.setValue(Boolean.FALSE);
                return g00.b0.a;
            case 23:
                this.B.setValue(Boolean.TRUE);
                return g00.b0.a;
            case 24:
                z0 z0Var6 = this.B;
                z0Var6.setValue(Boolean.valueOf(!((Boolean) z0Var6.getValue()).booleanValue()));
                return g00.b0.a;
            case 25:
                this.B.setValue(Boolean.TRUE);
                return g00.b0.a;
            case 26:
                z2.a0 a0Var2 = (z2.a0) this.B.getValue();
                if (a0Var2 != null) {
                    return a0Var2;
                }
                g0.a.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 27:
                z2.a0 a0Var3 = (z2.a0) this.B.getValue();
                if (a0Var3 != null) {
                    return a0Var3;
                }
                g0.a.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 28:
                this.B.setValue(Boolean.TRUE);
                return g00.b0.a;
            default:
                this.B.setValue(Boolean.FALSE);
                return g00.b0.a;
        }
    }
}
