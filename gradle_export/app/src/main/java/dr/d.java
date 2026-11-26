package dr;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Ldr/d;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "sessionToken", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    @ck.b("session_token")
    private final String sessionToken;

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && m.a(this.sessionToken, ((d) obj).sessionToken);
    }

    public final int hashCode() {
        String str = this.sessionToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a1.b.p("SessionResponseApiModel(sessionToken=", this.sessionToken, ")");
    }
}
