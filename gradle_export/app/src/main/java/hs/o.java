package hs;

import com.revenuecat.purchases.common.verification.SigningManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lhs/o;", "", "", "a", "Ljava/lang/String;", "getImportId", "()Ljava/lang/String;", "importId", "b", "getPlatform", "platform", "c", "getTimezone", "timezone", "", "d", "I", "getDailyGoalMinutes", "()I", "dailyGoalMinutes", "e", "getSha256", SigningManager.POST_PARAMS_ALGORITHM, "", "f", "Ljava/lang/Long;", "getByteSize", "()Ljava/lang/Long;", "byteSize", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    @ck.b("import_id")
    private final String importId;

    @ck.b("platform")
    private final String platform;

    @ck.b("timezone")
    private final String timezone;

    @ck.b("daily_goal_minutes")
    private final int dailyGoalMinutes;

    @ck.b(SigningManager.POST_PARAMS_ALGORITHM)
    private final String sha256;

    @ck.b("byte_size")
    private final Long byteSize;

    public o(String importId, String timezone, int i, String str, Long l) {
        kotlin.jvm.internal.m.e(importId, "importId");
        kotlin.jvm.internal.m.e(timezone, "timezone");
        this.importId = importId;
        this.platform = "android";
        this.timezone = timezone;
        this.dailyGoalMinutes = i;
        this.sha256 = str;
        this.byteSize = l;
    }
}
