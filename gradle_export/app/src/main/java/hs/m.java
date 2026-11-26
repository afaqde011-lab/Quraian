package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lhs/m;", "", "", "a", "Ljava/lang/String;", "getImportId", "()Ljava/lang/String;", "importId", "", "b", "I", "getPartNumber", "()I", "partNumber", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    @ck.b("import_id")
    private final String importId;

    @ck.b("part_number")
    private final int partNumber;

    public m(String importId, int i) {
        kotlin.jvm.internal.m.e(importId, "importId");
        this.importId = importId;
        this.partNumber = i;
    }
}
