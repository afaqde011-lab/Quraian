package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\b\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0003\u0010\r¨\u0006\u0010"}, d2 = {"Lvo/z;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "signupToken", "b", "d", "stage", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "signupExpiresIn", "resendIn", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z {

    @ck.b("signup_token")
    private final String signupToken;

    @ck.b("stage")
    private final String stage;

    @ck.b("signup_expires_in")
    private final Integer signupExpiresIn;

    @ck.b("resend_in")
    private final Integer resendIn;

    public final Integer getResendIn() {
        return this.resendIn;
    }

    public final Integer getSignupExpiresIn() {
        return this.signupExpiresIn;
    }

    public final String getSignupToken() {
        return this.signupToken;
    }

    public final String getStage() {
        return this.stage;
    }
}
