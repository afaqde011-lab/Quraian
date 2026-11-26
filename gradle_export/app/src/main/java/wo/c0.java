package wo;

import com.mchutov.quranify.auth.data.source.local.AuthLocalDataSource;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import d40.p1;

public final class c0 {
    public final AuthLocalDataSource a;
    public final AuthAnalytics b;
    public final p1 c;

    public c0(AuthLocalDataSource authLocalDataSource, AuthAnalytics authAnalytics) {
        this.a = authLocalDataSource;
        this.b = authAnalytics;
        this.c = d40.o.c(Boolean.valueOf(authLocalDataSource.isAuthorized()));
    }

    public final void a() {
        Boolean boolValueOf = Boolean.valueOf(this.a.isAuthorized());
        p1 p1Var = this.c;
        p1Var.getClass();
        p1Var.k(null, boolValueOf);
    }

    public final void b(ep.g tokens) {
        kotlin.jvm.internal.m.e(tokens, "tokens");
        this.a.saveSession(tokens);
        a();
        this.b.setUserProperties(tokens.e);
    }

    public final void c(String version) {
        kotlin.jvm.internal.m.e(version, "version");
        this.a.setPremiumAuthPromptLastSeenVersion(version);
    }
}
