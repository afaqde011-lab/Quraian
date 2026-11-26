package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lhs/k;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "date", "", "b", "I", "()I", "hour", "", "c", "J", "()J", "quranSeconds", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    @ck.b("date")
    private final String date;

    @ck.b("hour")
    private final int hour;

    @ck.b("quran_seconds")
    private final long quranSeconds;

    public k(String date, long j, int i) {
        kotlin.jvm.internal.m.e(date, "date");
        this.date = date;
        this.hour = i;
        this.quranSeconds = j;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getHour() {
        return this.hour;
    }

    public final long getQuranSeconds() {
        return this.quranSeconds;
    }
}
