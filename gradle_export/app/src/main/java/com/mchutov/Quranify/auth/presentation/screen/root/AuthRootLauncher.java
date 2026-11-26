package com.mchutov.quranify.auth.presentation.screen.root;

import ep.e;
import g00.h;
import g00.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p40.o0;
import p40.x0;
import rd.a;
import tp.b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/mchutov/quranify/auth/presentation/screen/root/AuthRootLauncher;", "", "Lep/e;", "authMethod", "<init>", "(Lep/e;)V", "", "seen0", "Lp40/x0;", "serializationConstructorMarker", "(ILep/e;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$app_release", "(Lcom/mchutov/quranify/auth/presentation/screen/root/AuthRootLauncher;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lep/e;", "copy", "(Lep/e;)Lcom/mchutov/quranify/auth/presentation/screen/root/AuthRootLauncher;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lep/e;", "getAuthMethod", "Companion", "tp/a", "tp/b", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthRootLauncher {
    public static final int $stable = 0;
    private final e authMethod;
    public static final b Companion = new b();
    private static final h[] $childSerializers = {a.I(i.B, new sy.e(11))};

    public AuthRootLauncher(int i, e eVar, x0 x0Var) {
        if (1 == (i & 1)) {
            this.authMethod = eVar;
        } else {
            o0.g(i, 1, tp.a.a.getDescriptor());
            throw null;
        }
    }

    public AuthRootLauncher(e authMethod) {
        m.e(authMethod, "authMethod");
        this.authMethod = authMethod;
    }

    public static final l40.a _childSerializers$_anonymous_() {
        return e.Companion.serializer();
    }

    public static AuthRootLauncher copy$default(AuthRootLauncher authRootLauncher, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = authRootLauncher.authMethod;
        }
        return authRootLauncher.copy(eVar);
    }

    public final e getAuthMethod() {
        return this.authMethod;
    }

    public final AuthRootLauncher copy(e authMethod) {
        m.e(authMethod, "authMethod");
        return new AuthRootLauncher(authMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthRootLauncher) && this.authMethod == ((AuthRootLauncher) other).authMethod;
    }

    public final e getAuthMethod() {
        return this.authMethod;
    }

    public int hashCode() {
        return this.authMethod.hashCode();
    }

    public String toString() {
        return "AuthRootLauncher(authMethod=" + this.authMethod + ")";
    }
}
