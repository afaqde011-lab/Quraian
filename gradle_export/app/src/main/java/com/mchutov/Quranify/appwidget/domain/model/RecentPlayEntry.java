package com.mchutov.quranify.appwidget.domain.model;

import a1.b;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import w.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJd\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0015¨\u00061"}, d2 = {"Lcom/mchutov/quranify/appwidget/domain/model/RecentPlayEntry;", "", "surahNumber", "", "surahId", "", "surahName", "", "reciterId", "reciterName", "reciterPhotoUrl", "playedAt", "collectionId", "<init>", "(ILjava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)V", "getSurahNumber", "()I", "getSurahId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSurahName", "()Ljava/lang/String;", "getReciterId", "getReciterName", "getReciterPhotoUrl", "getPlayedAt", "()J", "getCollectionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "sourceKey", "getSourceKey", DiagnosticsEntry.ID_KEY, "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)Lcom/mchutov/quranify/appwidget/domain/model/RecentPlayEntry;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecentPlayEntry {
    public static final int $stable = 0;
    private final Integer collectionId;
    private final long playedAt;
    private final int reciterId;
    private final String reciterName;
    private final String reciterPhotoUrl;
    private final Long surahId;
    private final String surahName;
    private final int surahNumber;

    public RecentPlayEntry(int i, Long l, String surahName, int i2, String reciterName, String str, long j, Integer num) {
        m.e(surahName, "surahName");
        m.e(reciterName, "reciterName");
        this.surahNumber = i;
        this.surahId = l;
        this.surahName = surahName;
        this.reciterId = i2;
        this.reciterName = reciterName;
        this.reciterPhotoUrl = str;
        this.playedAt = j;
        this.collectionId = num;
    }

    public RecentPlayEntry(int i, Long l, String str, int i2, String str2, String str3, long j, Integer num, int i3, f fVar) {
        this(i, (i3 & 2) != 0 ? null : l, str, i2, str2, str3, j, (i3 & 128) != 0 ? null : num);
    }

    public static RecentPlayEntry copy$default(RecentPlayEntry recentPlayEntry, int i, Long l, String str, int i2, String str2, String str3, long j, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = recentPlayEntry.surahNumber;
        }
        if ((i3 & 2) != 0) {
            l = recentPlayEntry.surahId;
        }
        if ((i3 & 4) != 0) {
            str = recentPlayEntry.surahName;
        }
        if ((i3 & 8) != 0) {
            i2 = recentPlayEntry.reciterId;
        }
        if ((i3 & 16) != 0) {
            str2 = recentPlayEntry.reciterName;
        }
        if ((i3 & 32) != 0) {
            str3 = recentPlayEntry.reciterPhotoUrl;
        }
        if ((i3 & 64) != 0) {
            j = recentPlayEntry.playedAt;
        }
        if ((i3 & 128) != 0) {
            num = recentPlayEntry.collectionId;
        }
        Integer num2 = num;
        long j2 = j;
        String str4 = str2;
        String str5 = str3;
        return recentPlayEntry.copy(i, l, str, i2, str4, str5, j2, num2);
    }

    public final int getSurahNumber() {
        return this.surahNumber;
    }

    public final Long getSurahId() {
        return this.surahId;
    }

    public final String getSurahName() {
        return this.surahName;
    }

    public final int getReciterId() {
        return this.reciterId;
    }

    public final String getReciterName() {
        return this.reciterName;
    }

    public final String getReciterPhotoUrl() {
        return this.reciterPhotoUrl;
    }

    public final long getPlayedAt() {
        return this.playedAt;
    }

    public final Integer getCollectionId() {
        return this.collectionId;
    }

    public final RecentPlayEntry copy(int surahNumber, Long surahId, String surahName, int reciterId, String reciterName, String reciterPhotoUrl, long playedAt, Integer collectionId) {
        m.e(surahName, "surahName");
        m.e(reciterName, "reciterName");
        return new RecentPlayEntry(surahNumber, surahId, surahName, reciterId, reciterName, reciterPhotoUrl, playedAt, collectionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentPlayEntry)) {
            return false;
        }
        RecentPlayEntry recentPlayEntry = (RecentPlayEntry) other;
        return this.surahNumber == recentPlayEntry.surahNumber && m.a(this.surahId, recentPlayEntry.surahId) && m.a(this.surahName, recentPlayEntry.surahName) && this.reciterId == recentPlayEntry.reciterId && m.a(this.reciterName, recentPlayEntry.reciterName) && m.a(this.reciterPhotoUrl, recentPlayEntry.reciterPhotoUrl) && this.playedAt == recentPlayEntry.playedAt && m.a(this.collectionId, recentPlayEntry.collectionId);
    }

    public final Integer getCollectionId() {
        return this.collectionId;
    }

    public final String getId() {
        return getSourceKey() + "-" + this.surahNumber;
    }

    public final long getPlayedAt() {
        return this.playedAt;
    }

    public final int getReciterId() {
        return this.reciterId;
    }

    public final String getReciterName() {
        return this.reciterName;
    }

    public final String getReciterPhotoUrl() {
        return this.reciterPhotoUrl;
    }

    public final String getSourceKey() {
        return b5.I(this.reciterId, this.collectionId);
    }

    public final Long getSurahId() {
        return this.surahId;
    }

    public final String getSurahName() {
        return this.surahName;
    }

    public final int getSurahNumber() {
        return this.surahNumber;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.surahNumber) * 31;
        Long l = this.surahId;
        int iE = x5.e(c.d(this.reciterId, x5.e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.surahName, 31), 31), this.reciterName, 31);
        String str = this.reciterPhotoUrl;
        int iF = c.f((iE + (str == null ? 0 : str.hashCode())) * 31, this.playedAt, 31);
        Integer num = this.collectionId;
        return iF + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        int i = this.surahNumber;
        Long l = this.surahId;
        String str = this.surahName;
        int i2 = this.reciterId;
        String str2 = this.reciterName;
        String str3 = this.reciterPhotoUrl;
        long j = this.playedAt;
        Integer num = this.collectionId;
        StringBuilder sb = new StringBuilder("RecentPlayEntry(surahNumber=");
        sb.append(i);
        sb.append(", surahId=");
        sb.append(l);
        sb.append(", surahName=");
        sb.append(str);
        sb.append(", reciterId=");
        sb.append(i2);
        sb.append(", reciterName=");
        b.z(sb, str2, ", reciterPhotoUrl=", str3, ", playedAt=");
        sb.append(j);
        sb.append(", collectionId=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }
}
