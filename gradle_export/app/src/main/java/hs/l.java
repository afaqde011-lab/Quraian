package hs;

import com.revenuecat.purchases.common.verification.SigningManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, d2 = {"Lhs/l;", "", "", "a", "Ljava/lang/String;", "getImportId", "()Ljava/lang/String;", "importId", "", "b", "I", "getPartNumber", "()I", "partNumber", "c", "getSha256", SigningManager.POST_PARAMS_ALGORITHM, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    @ck.b("import_id")
    private final String importId;

    @ck.b("part_number")
    private final int partNumber;

    @ck.b(SigningManager.POST_PARAMS_ALGORITHM)
    private final String sha256;

    public l(String importId, int i, String sha256) {
        kotlin.jvm.internal.m.e(importId, "importId");
        kotlin.jvm.internal.m.e(sha256, "sha256");
        this.importId = importId;
        this.partNumber = i;
        this.sha256 = sha256;
    }
}
