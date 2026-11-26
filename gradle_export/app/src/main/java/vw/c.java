package vw;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\rR$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lvw/c;", "", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "releaseAt", "b", "info", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "countries", "", "reciterIds", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    @ck.b("release_at")
    private final String releaseAt;

    @ck.b("info")
    private final String info;

    @ck.b("countries")
    private final List<String> countries;

    @ck.b("reciter_ids")
    private final List<Integer> reciterIds;

    public final List getCountries() {
        return this.countries;
    }

    public final String getInfo() {
        return this.info;
    }

    public final List getReciterIds() {
        return this.reciterIds;
    }

    public final String getReleaseAt() {
        return this.releaseAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.releaseAt, cVar.releaseAt) && m.a(this.info, cVar.info) && m.a(this.countries, cVar.countries) && m.a(this.reciterIds, cVar.reciterIds);
    }

    public final int hashCode() {
        String str = this.releaseAt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.info;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.countries;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.reciterIds;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.releaseAt;
        String str2 = this.info;
        List<String> list = this.countries;
        List<Integer> list2 = this.reciterIds;
        StringBuilder sbS = a1.b.s("ReciterCollectionEventApiModel(releaseAt=", str, ", info=", str2, ", countries=");
        sbS.append(list);
        sbS.append(", reciterIds=");
        sbS.append(list2);
        sbS.append(")");
        return sbS.toString();
    }
}
