package com.mchutov.p000quranify.player.domain.model;

import a1.b;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import w.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u0082\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u00020\tHÖ\u0081\u0004J\n\u00103\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u00064"}, d2 = {"Lcom/mchutov/quranify/player/domain/model/PlayerItem;", RuntimeVersion.SUFFIX, "surahId", RuntimeVersion.SUFFIX, "surahTranscription", RuntimeVersion.SUFFIX, "surahOriginalName", "surahTranslation", "surahNumber", RuntimeVersion.SUFFIX, "reciterId", "collectionId", "reciterName", "reciterPhotoUrl", "playerUri", "playerUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSurahId", "()J", "getSurahTranscription", "()Ljava/lang/String;", "getSurahOriginalName", "getSurahTranslation", "getSurahNumber", "()I", "getReciterId", "getCollectionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReciterName", "getReciterPhotoUrl", "getPlayerUri", "getPlayerUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/mchutov/quranify/player/domain/model/PlayerItem;", "equals", RuntimeVersion.SUFFIX, "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayerItem {
    public static final int $stable = 0;
    private final Integer collectionId;
    private final String playerUri;
    private final String playerUrl;
    private final int reciterId;
    private final String reciterName;
    private final String reciterPhotoUrl;
    private final long surahId;
    private final int surahNumber;
    private final String surahOriginalName;
    private final String surahTranscription;
    private final String surahTranslation;

    public PlayerItem(long j9, String surahTranscription, String surahOriginalName, String surahTranslation, int i11, int i12, Integer num, String reciterName, String str, String str2, String playerUrl) {
        m.e(surahTranscription, "surahTranscription");
        m.e(surahOriginalName, "surahOriginalName");
        m.e(surahTranslation, "surahTranslation");
        m.e(reciterName, "reciterName");
        m.e(playerUrl, "playerUrl");
        this.surahId = j9;
        this.surahTranscription = surahTranscription;
        this.surahOriginalName = surahOriginalName;
        this.surahTranslation = surahTranslation;
        this.surahNumber = i11;
        this.reciterId = i12;
        this.collectionId = num;
        this.reciterName = reciterName;
        this.reciterPhotoUrl = str;
        this.playerUri = str2;
        this.playerUrl = playerUrl;
    }

    public PlayerItem(long j9, String str, String str2, String str3, int i11, int i12, Integer num, String str4, String str5, String str6, String str7, int i13, f fVar) {
        this(j9, str, str2, str3, i11, i12, (i13 & 64) != 0 ? null : num, str4, (i13 & 256) != 0 ? null : str5, str6, str7);
    }

    public static PlayerItem copy$default(PlayerItem playerItem, long j9, String str, String str2, String str3, int i11, int i12, Integer num, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j9 = playerItem.surahId;
        }
        return playerItem.copy(j9, (i13 & 2) != 0 ? playerItem.surahTranscription : str, (i13 & 4) != 0 ? playerItem.surahOriginalName : str2, (i13 & 8) != 0 ? playerItem.surahTranslation : str3, (i13 & 16) != 0 ? playerItem.surahNumber : i11, (i13 & 32) != 0 ? playerItem.reciterId : i12, (i13 & 64) != 0 ? playerItem.collectionId : num, (i13 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? playerItem.reciterName : str4, (i13 & 256) != 0 ? playerItem.reciterPhotoUrl : str5, (i13 & 512) != 0 ? playerItem.playerUri : str6, (i13 & 1024) != 0 ? playerItem.playerUrl : str7);
    }

    public final long getSurahId() {
        return this.surahId;
    }

    public final String getPlayerUri() {
        return this.playerUri;
    }

    public final String getPlayerUrl() {
        return this.playerUrl;
    }

    public final String getSurahTranscription() {
        return this.surahTranscription;
    }

    public final String getSurahOriginalName() {
        return this.surahOriginalName;
    }

    public final String getSurahTranslation() {
        return this.surahTranslation;
    }

    public final int getSurahNumber() {
        return this.surahNumber;
    }

    public final int getReciterId() {
        return this.reciterId;
    }

    public final Integer getCollectionId() {
        return this.collectionId;
    }

    public final String getReciterName() {
        return this.reciterName;
    }

    public final String getReciterPhotoUrl() {
        return this.reciterPhotoUrl;
    }

    public final PlayerItem copy(long surahId, String surahTranscription, String surahOriginalName, String surahTranslation, int surahNumber, int reciterId, Integer collectionId, String reciterName, String reciterPhotoUrl, String playerUri, String playerUrl) {
        m.e(surahTranscription, "surahTranscription");
        m.e(surahOriginalName, "surahOriginalName");
        m.e(surahTranslation, "surahTranslation");
        m.e(reciterName, "reciterName");
        m.e(playerUrl, "playerUrl");
        return new PlayerItem(surahId, surahTranscription, surahOriginalName, surahTranslation, surahNumber, reciterId, collectionId, reciterName, reciterPhotoUrl, playerUri, playerUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerItem)) {
            return false;
        }
        PlayerItem playerItem = (PlayerItem) other;
        return this.surahId == playerItem.surahId && m.a(this.surahTranscription, playerItem.surahTranscription) && m.a(this.surahOriginalName, playerItem.surahOriginalName) && m.a(this.surahTranslation, playerItem.surahTranslation) && this.surahNumber == playerItem.surahNumber && this.reciterId == playerItem.reciterId && m.a(this.collectionId, playerItem.collectionId) && m.a(this.reciterName, playerItem.reciterName) && m.a(this.reciterPhotoUrl, playerItem.reciterPhotoUrl) && m.a(this.playerUri, playerItem.playerUri) && m.a(this.playerUrl, playerItem.playerUrl);
    }

    public final Integer getCollectionId() {
        return this.collectionId;
    }

    public final String getPlayerUri() {
        return this.playerUri;
    }

    public final String getPlayerUrl() {
        return this.playerUrl;
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

    public final long getSurahId() {
        return this.surahId;
    }

    public final int getSurahNumber() {
        return this.surahNumber;
    }

    public final String getSurahOriginalName() {
        return this.surahOriginalName;
    }

    public final String getSurahTranscription() {
        return this.surahTranscription;
    }

    public final String getSurahTranslation() {
        return this.surahTranslation;
    }

    public int hashCode() {
        int iD = c.d(this.reciterId, c.d(this.surahNumber, x5.e(x5.e(x5.e(Long.hashCode(this.surahId) * 31, this.surahTranscription, 31), this.surahOriginalName, 31), this.surahTranslation, 31), 31), 31);
        Integer num = this.collectionId;
        int iE = x5.e((iD + (num == null ? 0 : num.hashCode())) * 31, this.reciterName, 31);
        String str = this.reciterPhotoUrl;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.playerUri;
        return this.playerUrl.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        long j9 = this.surahId;
        String str = this.surahTranscription;
        String str2 = this.surahOriginalName;
        String str3 = this.surahTranslation;
        int i11 = this.surahNumber;
        int i12 = this.reciterId;
        Integer num = this.collectionId;
        String str4 = this.reciterName;
        String str5 = this.reciterPhotoUrl;
        String str6 = this.playerUri;
        String str7 = this.playerUrl;
        StringBuilder sb2 = new StringBuilder("PlayerItem(surahId=");
        sb2.append(j9);
        sb2.append(", surahTranscription=");
        sb2.append(str);
        b.z(sb2, ", surahOriginalName=", str2, ", surahTranslation=", str3);
        c.v(sb2, ", surahNumber=", i11, ", reciterId=", i12);
        sb2.append(", collectionId=");
        sb2.append(num);
        sb2.append(", reciterName=");
        sb2.append(str4);
        b.z(sb2, ", reciterPhotoUrl=", str5, ", playerUri=", str6);
        return c.l(sb2, ", playerUrl=", str7, ")");
    }
}
