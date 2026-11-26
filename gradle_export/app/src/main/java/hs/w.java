package hs;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lhs/w;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "date", "", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "reciterId", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "ms", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    @ck.b("date")
    private final String date;

    @ck.b("reciter_id")
    private final Integer reciterId;

    @ck.b("ms")
    private final Long ms;

    public w(Integer num, Long l, String str) {
        this.date = str;
        this.reciterId = num;
        this.ms = l;
    }

    public final String getDate() {
        return this.date;
    }

    public final Long getMs() {
        return this.ms;
    }

    public final Integer getReciterId() {
        return this.reciterId;
    }
}
