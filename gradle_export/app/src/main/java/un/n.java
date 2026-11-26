package un;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lun/n;", "", "", "a", "J", "getPositionMs", "()J", "positionMs", "", "b", "Ljava/lang/Boolean;", "isCompleted", "()Ljava/lang/Boolean;", "", "c", "Ljava/lang/String;", "getLanguage", "()Ljava/lang/String;", "language", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    @ck.b("position_ms")
    private final long positionMs;

    @ck.b("is_completed")
    private final Boolean isCompleted;

    @ck.b("language")
    private final String language;

    public n(long j, Boolean bool, String str) {
        this.positionMs = j;
        this.isCompleted = bool;
        this.language = str;
    }
}
