package r30;

import ab.a0;
import h00.g0;
import java.util.List;
import java.util.regex.Matcher;

public final class h {
    public final Matcher a;
    public final CharSequence b;
    public final g c;
    public g0 d;

    public h(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        this.a = matcher;
        this.b = input;
        this.c = new g(this, 0);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new g0(this);
        }
        g0 g0Var = this.d;
        kotlin.jvm.internal.m.b(g0Var);
        return g0Var;
    }

    public final z00.e b() {
        Matcher matcher = this.a;
        return a0.I0(matcher.start(), matcher.end());
    }

    public final h c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.m.d(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new h(matcher2, charSequence);
        }
        return null;
    }
}
