package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lvo/a0;", "", "", "a", "Ljava/lang/String;", "getSignupToken", "()Ljava/lang/String;", "signupToken", "b", "getCode", "code", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 {

    @ck.b("signup_token")
    private final String signupToken;

    @ck.b("code")
    private final String code;

    public a0(String signupToken, String code) {
        kotlin.jvm.internal.m.e(signupToken, "signupToken");
        kotlin.jvm.internal.m.e(code, "code");
        this.signupToken = signupToken;
        this.code = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.signupToken, a0Var.signupToken) && kotlin.jvm.internal.m.a(this.code, a0Var.code);
    }

    public final int hashCode() {
        return this.code.hashCode() + (this.signupToken.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("VerifyCodeRequestApiModel(signupToken=", this.signupToken, ", code=", this.code, ")");
    }
}
