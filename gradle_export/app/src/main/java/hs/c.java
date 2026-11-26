package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lhs/c;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "date", "c", "day", "", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "listenedMs", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "dailyGoalMinutes", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    @ck.b("date")
    private final String date;

    @ck.b("day")
    private final String day;

    @ck.b("listened_ms")
    private final Long listenedMs;

    @ck.b("daily_goal_minutes")
    private final Integer dailyGoalMinutes;

    public c(Integer num, Long l, String str, String str2) {
        this.date = str;
        this.day = str2;
        this.listenedMs = l;
        this.dailyGoalMinutes = num;
    }

    public final Integer getDailyGoalMinutes() {
        return this.dailyGoalMinutes;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDay() {
        return this.day;
    }

    public final Long getListenedMs() {
        return this.listenedMs;
    }
}
