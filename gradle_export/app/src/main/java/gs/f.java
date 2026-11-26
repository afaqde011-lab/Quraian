package gs;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\b\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006!"}, d2 = {"Lgs/f;", "", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "importId", "b", "f", "timezone", "", "c", "I", "()I", "dailyGoalMinutes", "e", SigningManager.POST_PARAMS_ALGORITHM, "", "J", "()J", "byteSize", "", "Ljava/util/List;", "()Ljava/util/List;", "confirmedParts", "", "g", "Z", "h", "()Z", "isStarted", "isAddedToSummary", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    @ck.b("import_id")
    private final String importId;

    @ck.b("timezone")
    private final String timezone;

    @ck.b("daily_goal_minutes")
    private final int dailyGoalMinutes;

    @ck.b(SigningManager.POST_PARAMS_ALGORITHM)
    private final String sha256;

    @ck.b("byte_size")
    private final long byteSize;

    @ck.b("confirmed_parts")
    private final List<Integer> confirmedParts;

    @ck.b("is_started")
    private final boolean isStarted;

    @ck.b("is_added_to_summary")
    private final boolean isAddedToSummary;

    public f(String importId, String timezone, int i, String sha256, long j, List list, boolean z, boolean z2) {
        m.e(importId, "importId");
        m.e(timezone, "timezone");
        m.e(sha256, "sha256");
        this.importId = importId;
        this.timezone = timezone;
        this.dailyGoalMinutes = i;
        this.sha256 = sha256;
        this.byteSize = j;
        this.confirmedParts = list;
        this.isStarted = z;
        this.isAddedToSummary = z2;
    }

    public final long getByteSize() {
        return this.byteSize;
    }

    public final List getConfirmedParts() {
        return this.confirmedParts;
    }

    public final int getDailyGoalMinutes() {
        return this.dailyGoalMinutes;
    }

    public final String getImportId() {
        return this.importId;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final boolean getIsAddedToSummary() {
        return this.isAddedToSummary;
    }

    public final boolean getIsStarted() {
        return this.isStarted;
    }
}
