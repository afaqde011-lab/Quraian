package hp;

import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import d40.o;
import d40.p1;
import d40.z0;
import dp.d;
import ep.e;
import kotlin.jvm.internal.m;

public final class b {
    public final p1 a;
    public final z0 b;
    public String c;

    public b() {
        p1 p1VarC = o.c(dp.b.a);
        this.a = p1VarC;
        this.b = new z0(p1VarC);
        this.c = AuthAnalyticsSource.PREMIUM;
    }

    public final void a() {
        p1 p1Var = this.a;
        p1Var.getClass();
        p1Var.k(null, dp.b.a);
    }

    public final void b(e method, String idToken, String name, String source, String code) {
        m.e(method, "method");
        m.e(idToken, "idToken");
        m.e(name, "name");
        m.e(source, "source");
        m.e(code, "code");
        this.c = source;
        d dVar = new d(method, idToken, code, name);
        p1 p1Var = this.a;
        p1Var.getClass();
        p1Var.k(null, dVar);
    }
}
