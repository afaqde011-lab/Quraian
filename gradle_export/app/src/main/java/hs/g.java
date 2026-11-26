package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lhs/g;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "date", "b", "day", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "hour", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "quranMs", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    @ck.b("date")
    private final String date;

    @ck.b("day")
    private final String day;

    @ck.b("hour")
    private final Integer hour;

    @ck.b("quran_ms")
    private final Long quranMs;

    public g(Integer num, Long l, String str, String str2) {
        this.date = str;
        this.day = str2;
        this.hour = num;
        this.quranMs = l;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDay() {
        return this.day;
    }

    public final Integer getHour() {
        return this.hour;
    }

    public final Long getQuranMs() {
        return this.quranMs;
    }
}
