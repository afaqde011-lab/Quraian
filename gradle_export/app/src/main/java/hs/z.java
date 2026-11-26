package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\n\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0017"}, d2 = {"Lhs/z;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "date", "b", "day", "", "c", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "reciterId", "d", "f", "surahNumber", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "ms", "playCount", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z {

    @ck.b("date")
    private final String date;

    @ck.b("day")
    private final String day;

    @ck.b("reciter_id")
    private final Integer reciterId;

    @ck.b("surah_number")
    private final Integer surahNumber;

    @ck.b("ms")
    private final Long ms;

    @ck.b("play_count")
    private final Integer playCount;

    public z(String str, String str2, Integer num, Integer num2, Long l, Integer num3) {
        this.date = str;
        this.day = str2;
        this.reciterId = num;
        this.surahNumber = num2;
        this.ms = l;
        this.playCount = num3;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDay() {
        return this.day;
    }

    public final Long getMs() {
        return this.ms;
    }

    public final Integer getPlayCount() {
        return this.playCount;
    }

    public final Integer getReciterId() {
        return this.reciterId;
    }

    public final Integer getSurahNumber() {
        return this.surahNumber;
    }
}
