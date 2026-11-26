package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0003\u0010\r¨\u0006\u0017"}, d2 = {"Lhs/b;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "date", "c", "day", "", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "hour", "f", "soundId", "", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "ms", "avgVolumeTimes1000", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    @ck.b("date")
    private final String date;

    @ck.b("day")
    private final String day;

    @ck.b("hour")
    private final Integer hour;

    @ck.b("sound_id")
    private final String soundId;

    @ck.b("ms")
    private final Long ms;

    @ck.b("avg_volume_times_1000")
    private final Integer avgVolumeTimes1000;

    public b(String str, String str2, Integer num, String str3, Long l, Integer num2) {
        this.date = str;
        this.day = str2;
        this.hour = num;
        this.soundId = str3;
        this.ms = l;
        this.avgVolumeTimes1000 = num2;
    }

    public final Integer getAvgVolumeTimes1000() {
        return this.avgVolumeTimes1000;
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

    public final Long getMs() {
        return this.ms;
    }

    public final String getSoundId() {
        return this.soundId;
    }
}
