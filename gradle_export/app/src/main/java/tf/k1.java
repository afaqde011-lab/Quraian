package tf;

import android.os.Bundle;
import java.util.Objects;

public final class k1 implements Runnable {
    public final int A;
    public final Object B;
    public final Object C;
    public final long D;
    public final Object E;
    public final Object F;

    public k1(Object obj, String str, String str2, Object obj2, long j9, int i10) {
        this.A = i10;
        this.B = str;
        this.C = str2;
        this.E = obj2;
        this.D = j9;
        this.F = obj;
    }

    public k1(t2 t2Var, Bundle bundle, q2 q2Var, q2 q2Var2, long j9) {
        this.A = 2;
        this.B = bundle;
        this.C = q2Var;
        this.E = q2Var2;
        this.D = j9;
        Objects.requireNonNull(t2Var);
        this.F = t2Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                String str = (String) this.C;
                n1 n1Var = (n1) this.F;
                String str2 = (String) this.B;
                if (str2 != null) {
                    q2 q2Var = new q2((String) this.E, this.D, str2);
                    y3 y3Var = n1Var.f14673e;
                    y3Var.C().V0();
                    String str3 = y3Var.f14774g0;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    y3Var.f14774g0 = str;
                    y3Var.f14773f0 = q2Var;
                } else {
                    y3 y3Var2 = n1Var.f14673e;
                    y3Var2.C().V0();
                    String str4 = y3Var2.f14774g0;
                    if (str4 == null || str4.equals(str)) {
                        y3Var2.f14774g0 = str;
                        y3Var2.f14773f0 = null;
                    }
                }
                break;
            case 1:
                i2 i2Var = (i2) this.F;
                String str5 = (String) this.B;
                String str6 = (String) this.C;
                i2Var.g1(this.D, this.E, str5, str6);
                break;
            default:
                t2 t2Var = (t2) this.F;
                Bundle bundle = (Bundle) this.B;
                q2 q2Var2 = (q2) this.C;
                q2 q2Var3 = (q2) this.E;
                t2Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                e4 e4Var = ((h1) t2Var.B).I;
                h1.e(e4Var);
                t2Var.f1(q2Var2, q2Var3, this.D, true, e4Var.d1("screen_view", bundle, null, false));
                break;
        }
    }
}
