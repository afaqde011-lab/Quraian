package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lvo/r;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "accessToken", "b", "c", "refreshToken", "d", "tokenType", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "expiresIn", "Lvo/t;", "e", "Lvo/t;", "()Lvo/t;", "user", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    @ck.b("access_token")
    private final String accessToken;

    @ck.b("refresh_token")
    private final String refreshToken;

    @ck.b("token_type")
    private final String tokenType;

    @ck.b("expires_in")
    private final Integer expiresIn;

    @ck.b("user")
    private final t user;

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final t getUser() {
        return this.user;
    }
}
