package com.mchutov.p000quranify.reciters.domain.model;

import com.google.protobuf.RuntimeVersion;
import g4.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003JF\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/mchutov/quranify/reciters/domain/model/ReciterCollectionEvent;", RuntimeVersion.SUFFIX, "releaseAtEpochMillis", RuntimeVersion.SUFFIX, "info", RuntimeVersion.SUFFIX, "countries", RuntimeVersion.SUFFIX, "reciterIds", RuntimeVersion.SUFFIX, "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getReleaseAtEpochMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInfo", "()Ljava/lang/String;", "getCountries", "()Ljava/util/List;", "getReciterIds", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/mchutov/quranify/reciters/domain/model/ReciterCollectionEvent;", "equals", RuntimeVersion.SUFFIX, "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ReciterCollectionEvent {
    public static final int $stable = 8;
    private final List<String> countries;
    private final String info;
    private final List<Integer> reciterIds;
    private final Long releaseAtEpochMillis;

    public ReciterCollectionEvent(Long l, String str, List<String> countries, List<Integer> reciterIds) {
        m.e(countries, "countries");
        m.e(reciterIds, "reciterIds");
        this.releaseAtEpochMillis = l;
        this.info = str;
        this.countries = countries;
        this.reciterIds = reciterIds;
    }

    public static ReciterCollectionEvent copy$default(ReciterCollectionEvent reciterCollectionEvent, Long l, String str, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l = reciterCollectionEvent.releaseAtEpochMillis;
        }
        if ((i11 & 2) != 0) {
            str = reciterCollectionEvent.info;
        }
        if ((i11 & 4) != 0) {
            list = reciterCollectionEvent.countries;
        }
        if ((i11 & 8) != 0) {
            list2 = reciterCollectionEvent.reciterIds;
        }
        return reciterCollectionEvent.copy(l, str, list, list2);
    }

    public final Long getReleaseAtEpochMillis() {
        return this.releaseAtEpochMillis;
    }

    public final String getInfo() {
        return this.info;
    }

    public final List<String> component3() {
        return this.countries;
    }

    public final List<Integer> component4() {
        return this.reciterIds;
    }

    public final ReciterCollectionEvent copy(Long releaseAtEpochMillis, String info, List<String> countries, List<Integer> reciterIds) {
        m.e(countries, "countries");
        m.e(reciterIds, "reciterIds");
        return new ReciterCollectionEvent(releaseAtEpochMillis, info, countries, reciterIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReciterCollectionEvent)) {
            return false;
        }
        ReciterCollectionEvent reciterCollectionEvent = (ReciterCollectionEvent) other;
        return m.a(this.releaseAtEpochMillis, reciterCollectionEvent.releaseAtEpochMillis) && m.a(this.info, reciterCollectionEvent.info) && m.a(this.countries, reciterCollectionEvent.countries) && m.a(this.reciterIds, reciterCollectionEvent.reciterIds);
    }

    public final List<String> getCountries() {
        return this.countries;
    }

    public final String getInfo() {
        return this.info;
    }

    public final List<Integer> getReciterIds() {
        return this.reciterIds;
    }

    public final Long getReleaseAtEpochMillis() {
        return this.releaseAtEpochMillis;
    }

    public int hashCode() {
        Long l = this.releaseAtEpochMillis;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.info;
        return this.reciterIds.hashCode() + c.a((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.countries);
    }

    public String toString() {
        return "ReciterCollectionEvent(releaseAtEpochMillis=" + this.releaseAtEpochMillis + ", info=" + this.info + ", countries=" + this.countries + ", reciterIds=" + this.reciterIds + ")";
    }
}
