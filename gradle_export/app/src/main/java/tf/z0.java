package tf;

import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.internal.measurement.p5;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class z0 implements Callable {

    public final int f14778a;

    public final a1 f14779b;

    public final String f14780c;

    public z0(a1 a1Var, String str, int i10) {
        this.f14778a = i10;
        this.f14779b = a1Var;
        this.f14780c = str;
    }

    @Override
    public final Object call() throws Throwable {
        switch (this.f14778a) {
            case 0:
                return new com.google.android.gms.internal.measurement.h4(new z0(this.f14779b, this.f14780c, 1));
            case 1:
                a1 a1Var = this.f14779b;
                m mVar = a1Var.C.C;
                y3.R(mVar);
                String str = this.f14780c;
                u0 u0VarX1 = mVar.X1(str);
                HashMap map = new HashMap();
                map.put("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
                map.put("package_name", str);
                ((h1) a1Var.B).D.a1();
                map.put("gmp_version", 133005L);
                if (u0VarX1 != null) {
                    String strN = u0VarX1.N();
                    if (strN != null) {
                        map.put("app_version", strN);
                    }
                    map.put("app_version_int", Long.valueOf(u0VarX1.P()));
                    map.put("dynamite_version", Long.valueOf(u0VarX1.b()));
                }
                return map;
            default:
                s10.w0 w0Var = new s10.w0(5, this.f14779b, this.f14780c, false);
                p5 p5Var = new p5("internal.remoteConfig", 0);
                p5Var.B.put("getValue", new com.google.android.gms.internal.measurement.h4(p5Var, w0Var));
                return p5Var;
        }
    }
}
