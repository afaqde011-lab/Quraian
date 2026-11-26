package tf;

import android.util.Log;
import com.google.android.gms.cast.Cast;

public final class y0 {

    public final int f14763a = 1;

    public final h1 f14764b;

    public y0(w1 w1Var, h1 h1Var) {
        this.f14764b = h1Var;
    }

    public y0(y3 y3Var) {
        this.f14764b = y3Var.L;
    }

    public final boolean a() {
        switch (this.f14763a) {
            case 0:
                h1 h1Var = this.f14764b;
                boolean z10 = false;
                try {
                    z3 z3VarA = xe.b.a(h1Var.A);
                    if (z3VarA == null) {
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        q0Var.O.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        h1Var = h1Var;
                    } else {
                        int i10 = z3VarA.b(Cast.MAX_NAMESPACE_LENGTH, "com.android.vending").versionCode;
                        h1Var = i10;
                        if (i10 >= 80837300) {
                            z10 = true;
                            h1Var = i10;
                        }
                    }
                    break;
                } catch (Exception e3) {
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.O.c(e3, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z10;
            default:
                q0 q0Var3 = this.f14764b.F;
                h1.g(q0Var3);
                return Log.isLoggable(q0Var3.f1(), 3);
        }
    }
}
