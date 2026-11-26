package hs;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\b\u0010\u0011R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016¨\u0006!"}, d2 = {"Lhs/j;", "", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "importId", "b", "getPlatform", "platform", "c", "getTimezone", "timezone", "", "d", "I", "()I", "dailyGoalMinutes", "", "Lhs/i;", "Ljava/util/List;", "()Ljava/util/List;", "days", "Lhs/k;", "f", "hours", "Lhs/q;", "g", "surahs", "Lhs/h;", "h", "background", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    @ck.b("import_id")
    private final String importId;

    @ck.b("platform")
    private final String platform;

    @ck.b("timezone")
    private final String timezone;

    @ck.b("daily_goal_minutes")
    private final int dailyGoalMinutes;

    @ck.b("days")
    private final List<i> days;

    @ck.b("hours")
    private final List<k> hours;

    @ck.b("surahs")
    private final List<q> surahs;

    @ck.b("background")
    private final List<h> background;

    public j(String importId, String str, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        kotlin.jvm.internal.m.e(importId, "importId");
        this.importId = importId;
        this.platform = "android";
        this.timezone = str;
        this.dailyGoalMinutes = i;
        this.days = arrayList;
        this.hours = arrayList2;
        this.surahs = arrayList3;
        this.background = arrayList4;
    }

    public final List getBackground() {
        return this.background;
    }

    public final int getDailyGoalMinutes() {
        return this.dailyGoalMinutes;
    }

    public final List getDays() {
        return this.days;
    }

    public final List getHours() {
        return this.hours;
    }

    public final String getImportId() {
        return this.importId;
    }

    public final List getSurahs() {
        return this.surahs;
    }
}
