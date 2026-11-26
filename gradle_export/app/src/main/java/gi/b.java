package gi;

import a1.u0;
import android.os.Bundle;
import fh.e1;
import java.util.HashSet;
import tf.u1;
import tf.v1;

public final class b implements v1 {

    public final int f6342a;

    public final Object f6343b;

    public b(Object obj, int i10) {
        this.f6342a = i10;
        this.f6343b = obj;
    }

    @Override
    public final void a(long j9, Bundle bundle, String str, String str2) {
        int i10 = this.f6342a;
        Object obj = this.f6343b;
        switch (i10) {
            case 0:
                u0 u0Var = (u0) obj;
                if (((HashSet) u0Var.B).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    e1 e1Var = a.f6336a;
                    String strG = u1.g(str2, u1.f14729c, u1.f14727a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((h7.b) u0Var.C).u(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.f6336a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j9);
                    bundle3.putBundle("params", bundle);
                    ((h7.b) ((c) obj).B).u(3, bundle3);
                    break;
                }
                break;
        }
    }
}
