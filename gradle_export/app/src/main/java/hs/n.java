package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0005¨\u0006\u000f"}, d2 = {"Lhs/n;", "", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "partNumber", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "url", "c", "getExpiresIn", "expiresIn", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    @ck.b("part_number")
    private final Integer partNumber;

    @ck.b("url")
    private final String url;

    @ck.b("expires_in")
    private final Integer expiresIn;

    public final Integer getPartNumber() {
        return this.partNumber;
    }

    public final String getUrl() {
        return this.url;
    }
}
