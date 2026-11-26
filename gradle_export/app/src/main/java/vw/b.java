package vw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import oi.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0004\bR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\t"}, d2 = {"Lvw/b;", "", "", "Lvw/b$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "collections", "b", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    @ck.b("collections")
    private final List<a> collections;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lvw/b$a;", "", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", DiagnosticsEntry.ID_KEY, "", "Lvw/b$b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "reciters", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "slug", "d", "title", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        @ck.b(DiagnosticsEntry.ID_KEY)
        private final Integer id;

        @ck.b("reciters")
        private final List<C0025b> reciters;

        @ck.b("slug")
        private final String slug;

        @ck.b("title")
        private final String title;

        public final Integer getId() {
            return this.id;
        }

        public final List getReciters() {
            return this.reciters;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m.a(this.id, aVar.id) && m.a(this.reciters, aVar.reciters) && m.a(this.slug, aVar.slug) && m.a(this.title, aVar.title);
        }

        public final int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<C0025b> list = this.reciters;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.slug;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            Integer num = this.id;
            List<C0025b> list = this.reciters;
            String str = this.slug;
            String str2 = this.title;
            StringBuilder sb = new StringBuilder("Collection(id=");
            sb.append(num);
            sb.append(", reciters=");
            sb.append(list);
            sb.append(", slug=");
            return k.m(sb, str, ", title=", str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lvw/b$b;", "", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", DiagnosticsEntry.ID_KEY, "b", "requestsCount", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0025b {

        @ck.b(DiagnosticsEntry.ID_KEY)
        private final Integer id;

        @ck.b("requests_count")
        private final Integer requestsCount;

        public final Integer getId() {
            return this.id;
        }

        public final Integer getRequestsCount() {
            return this.requestsCount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0025b)) {
                return false;
            }
            C0025b c0025b = (C0025b) obj;
            return m.a(this.id, c0025b.id) && m.a(this.requestsCount, c0025b.requestsCount);
        }

        public final int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.requestsCount;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            return "Reciter(id=" + this.id + ", requestsCount=" + this.requestsCount + ")";
        }
    }

    public final List getCollections() {
        return this.collections;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && m.a(this.collections, ((b) obj).collections);
    }

    public final int hashCode() {
        List<a> list = this.collections;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "ReciterCollectionApiModel(collections=" + this.collections + ")";
    }
}
