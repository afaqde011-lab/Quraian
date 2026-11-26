package hs;

import com.revenuecat.purchases.common.verification.SigningManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lhs/s;", "", "", "a", "Ljava/lang/String;", "getImportId", "()Ljava/lang/String;", "importId", "b", "getPlatform", "platform", "", "c", "J", "getByteSize", "()J", "byteSize", "d", "getSha256", SigningManager.POST_PARAMS_ALGORITHM, "", "e", "I", "getPartSize", "()I", "partSize", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    @ck.b("import_id")
    private final String importId;

    @ck.b("platform")
    private final String platform;

    @ck.b("byte_size")
    private final long byteSize;

    @ck.b(SigningManager.POST_PARAMS_ALGORITHM)
    private final String sha256;

    @ck.b("part_size")
    private final int partSize;

    public s(String importId, long j, String sha256) {
        kotlin.jvm.internal.m.e(importId, "importId");
        kotlin.jvm.internal.m.e(sha256, "sha256");
        this.importId = importId;
        this.platform = "android";
        this.byteSize = j;
        this.sha256 = sha256;
        this.partSize = 524288;
    }
}
