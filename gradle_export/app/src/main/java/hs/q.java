package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u0015"}, d2 = {"Lhs/q;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "date", "", "b", "I", "c", "()I", "reciterId", "e", "surahNumber", "", "d", "J", "()J", "seconds", "playCount", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    @ck.b("date")
    private final String date;

    @ck.b("reciter_id")
    private final int reciterId;

    @ck.b("surah_number")
    private final int surahNumber;

    @ck.b("seconds")
    private final long seconds;

    @ck.b("play_count")
    private final int playCount;

    public q(int i, int i2, int i3, long j, String date) {
        kotlin.jvm.internal.m.e(date, "date");
        this.date = date;
        this.reciterId = i;
        this.surahNumber = i2;
        this.seconds = j;
        this.playCount = i3;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getPlayCount() {
        return this.playCount;
    }

    public final int getReciterId() {
        return this.reciterId;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final int getSurahNumber() {
        return this.surahNumber;
    }
}
