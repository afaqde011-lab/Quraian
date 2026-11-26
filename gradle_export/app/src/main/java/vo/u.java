package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvo/u;", "", "", "a", "Ljava/lang/String;", "getSignupToken", "()Ljava/lang/String;", "signupToken", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    @ck.b("signup_token")
    private final String signupToken;

    public u(String signupToken) {
        kotlin.jvm.internal.m.e(signupToken, "signupToken");
        this.signupToken = signupToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.m.a(this.signupToken, ((u) obj).signupToken);
    }

    public final int hashCode() {
        return this.signupToken.hashCode();
    }

    public final String toString() {
        return a1.b.p("ResendSignupCodeRequestApiModel(signupToken=", this.signupToken, ")");
    }
}
