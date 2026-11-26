package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvo/n;", "", "", "a", "Ljava/lang/String;", "getIdToken", "()Ljava/lang/String;", "idToken", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    @ck.b("id_token")
    private final String idToken;

    public n(String idToken) {
        kotlin.jvm.internal.m.e(idToken, "idToken");
        this.idToken = idToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && kotlin.jvm.internal.m.a(this.idToken, ((n) obj).idToken);
    }

    public final int hashCode() {
        return this.idToken.hashCode();
    }

    public final String toString() {
        return a1.b.p("OAuthLookupRequestApiModel(idToken=", this.idToken, ")");
    }
}
