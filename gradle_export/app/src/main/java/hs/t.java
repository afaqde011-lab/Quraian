package hs;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\b\u0010\u001bR$\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u0013\u0010\"R$\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b\u001d\u0010\"R$\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b%\u0010\"R$\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b(\u0010\"R$\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\u0003\u0010\"¨\u0006."}, d2 = {"Lhs/t;", "", "", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "dailyGoalMinutes", "b", "c", "currentStreak", "h", "longestStreak", "Lhs/a0;", "Lhs/a0;", "k", "()Lhs/a0;", "today", "", "e", "Ljava/lang/Long;", "l", "()Ljava/lang/Long;", "totalListenedMs", "", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "deviceImport", "g", "clearedAt", "", "Lhs/c;", "Ljava/util/List;", "()Ljava/util/List;", "days", "Lhs/g;", "i", "hours", "Lhs/w;", "j", "reciters", "Lhs/z;", "surahs", "Lhs/b;", "background", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    @ck.b("daily_goal_minutes")
    private final Integer dailyGoalMinutes;

    @ck.b("current_streak")
    private final Integer currentStreak;

    @ck.b("longest_streak")
    private final Integer longestStreak;

    @ck.b("today")
    private final a0 today;

    @ck.b("total_listened_ms")
    private final Long totalListenedMs;

    @ck.b("device_import")
    private final String deviceImport;

    @ck.b("cleared_at")
    private final String clearedAt;

    @ck.b("days")
    private final List<c> days;

    @ck.b("hours")
    private final List<g> hours;

    @ck.b("reciters")
    private final List<w> reciters;

    @ck.b("surahs")
    private final List<z> surahs;

    @ck.b("background")
    private final List<b> background;

    public t(Integer num, Integer num2, Integer num3, a0 a0Var, Long l, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.dailyGoalMinutes = num;
        this.currentStreak = num2;
        this.longestStreak = num3;
        this.today = a0Var;
        this.totalListenedMs = l;
        this.deviceImport = str;
        this.clearedAt = str2;
        this.days = arrayList;
        this.hours = arrayList2;
        this.reciters = arrayList3;
        this.surahs = arrayList4;
        this.background = arrayList5;
    }

    public final List getBackground() {
        return this.background;
    }

    public final String getClearedAt() {
        return this.clearedAt;
    }

    public final Integer getCurrentStreak() {
        return this.currentStreak;
    }

    public final Integer getDailyGoalMinutes() {
        return this.dailyGoalMinutes;
    }

    public final List getDays() {
        return this.days;
    }

    public final String getDeviceImport() {
        return this.deviceImport;
    }

    public final List getHours() {
        return this.hours;
    }

    public final Integer getLongestStreak() {
        return this.longestStreak;
    }

    public final List getReciters() {
        return this.reciters;
    }

    public final List getSurahs() {
        return this.surahs;
    }

    public final a0 getToday() {
        return this.today;
    }

    public final Long getTotalListenedMs() {
        return this.totalListenedMs;
    }
}
