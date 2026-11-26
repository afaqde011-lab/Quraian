package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015¨\u0006\u0017"}, d2 = {"Lhs/h;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "date", "", "I", "c", "()I", "hour", "e", "soundId", "", "d", "J", "()J", "seconds", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "avgVolumeTimes1000", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    @ck.b("date")
    private final String date;

    @ck.b("hour")
    private final int hour;

    @ck.b("sound_id")
    private final String soundId;

    @ck.b("seconds")
    private final long seconds;

    @ck.b("avg_volume_times_1000")
    private final Integer avgVolumeTimes1000;

    public h(String date, int i, String soundId, long j, Integer num) {
        kotlin.jvm.internal.m.e(date, "date");
        kotlin.jvm.internal.m.e(soundId, "soundId");
        this.date = date;
        this.hour = i;
        this.soundId = soundId;
        this.seconds = j;
        this.avgVolumeTimes1000 = num;
    }

    public final Integer getAvgVolumeTimes1000() {
        return this.avgVolumeTimes1000;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getHour() {
        return this.hour;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final String getSoundId() {
        return this.soundId;
    }
}
