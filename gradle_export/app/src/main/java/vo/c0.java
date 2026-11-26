package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lvo/c0;", "", "", "a", "Ljava/lang/String;", "getResetToken", "()Ljava/lang/String;", "resetToken", "b", "getCode", "code", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    @ck.b("reset_token")
    private final String resetToken;

    @ck.b("code")
    private final String code;

    public c0(String resetToken, String code) {
        kotlin.jvm.internal.m.e(resetToken, "resetToken");
        kotlin.jvm.internal.m.e(code, "code");
        this.resetToken = resetToken;
        this.code = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.resetToken, c0Var.resetToken) && kotlin.jvm.internal.m.a(this.code, c0Var.code);
    }

    public final int hashCode() {
        return this.code.hashCode() + (this.resetToken.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("VerifyResetCodeRequestApiModel(resetToken=", this.resetToken, ", code=", this.code, ")");
    }
}
