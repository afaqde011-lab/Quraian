package wv;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0004\b\tR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lwv/a;", "", "", "Lwv/a$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "playlists", "b", "c", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    @ck.b("collections")
    private final List<C0026a> playlists;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\fR$\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006!"}, d2 = {"Lwv/a$a;", "", "", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", DiagnosticsEntry.ID_KEY, "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "slug", "g", "title", "e", "subtitle", "", "Ljava/util/List;", "h", "()Ljava/util/List;", "titleOtherLanguages", "f", "description", "coverUrl", "", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "isSpecial", "Lwv/a$b;", "surahs", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0026a {

        @ck.b(DiagnosticsEntry.ID_KEY)
        private final Integer id;

        @ck.b("slug")
        private final String slug;

        @ck.b("title")
        private final String title;

        @ck.b("subtitle")
        private final String subtitle;

        @ck.b("title_other_languages")
        private final List<String> titleOtherLanguages;

        @ck.b("description")
        private final String description;

        @ck.b("cover_url")
        private final String coverUrl;

        @ck.b("is_special")
        private final Boolean isSpecial;

        @ck.b("surahs")
        private final List<b> surahs;

        public final String getCoverUrl() {
            return this.coverUrl;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getId() {
            return this.id;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0026a)) {
                return false;
            }
            C0026a c0026a = (C0026a) obj;
            return m.a(this.id, c0026a.id) && m.a(this.slug, c0026a.slug) && m.a(this.title, c0026a.title) && m.a(this.subtitle, c0026a.subtitle) && m.a(this.titleOtherLanguages, c0026a.titleOtherLanguages) && m.a(this.description, c0026a.description) && m.a(this.coverUrl, c0026a.coverUrl) && m.a(this.isSpecial, c0026a.isSpecial) && m.a(this.surahs, c0026a.surahs);
        }

        public final List getSurahs() {
            return this.surahs;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List getTitleOtherLanguages() {
            return this.titleOtherLanguages;
        }

        public final int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.slug;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<String> list = this.titleOtherLanguages;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.description;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.coverUrl;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.isSpecial;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<b> list2 = this.surahs;
            return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
        }

        public final Boolean getIsSpecial() {
            return this.isSpecial;
        }

        public final String toString() {
            Integer num = this.id;
            String str = this.slug;
            String str2 = this.title;
            String str3 = this.subtitle;
            List<String> list = this.titleOtherLanguages;
            String str4 = this.description;
            String str5 = this.coverUrl;
            Boolean bool = this.isSpecial;
            List<b> list2 = this.surahs;
            StringBuilder sb = new StringBuilder("Playlist(id=");
            sb.append(num);
            sb.append(", slug=");
            sb.append(str);
            sb.append(", title=");
            a1.b.z(sb, str2, ", subtitle=", str3, ", titleOtherLanguages=");
            sb.append(list);
            sb.append(", description=");
            sb.append(str4);
            sb.append(", coverUrl=");
            sb.append(str5);
            sb.append(", isSpecial=");
            sb.append(bool);
            sb.append(", surahs=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"Lwv/a$b;", "", "", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", DiagnosticsEntry.ID_KEY, "", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "title", "", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "titleOtherLanguages", "d", "audioUrl", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "surahNumber", "Lwv/a$c;", "Lwv/a$c;", "()Lwv/a$c;", "reciter", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        @ck.b(DiagnosticsEntry.ID_KEY)
        private final Long id;

        @ck.b("title")
        private final String title;

        @ck.b("title_other_languages")
        private final List<String> titleOtherLanguages;

        @ck.b("audio_URL")
        private final String audioUrl;

        @ck.b("surah_number")
        private final Integer surahNumber;

        @ck.b("reciter")
        private final c reciter;

        public final String getAudioUrl() {
            return this.audioUrl;
        }

        public final Long getId() {
            return this.id;
        }

        public final c getReciter() {
            return this.reciter;
        }

        public final Integer getSurahNumber() {
            return this.surahNumber;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return m.a(this.id, bVar.id) && m.a(this.title, bVar.title) && m.a(this.titleOtherLanguages, bVar.titleOtherLanguages) && m.a(this.audioUrl, bVar.audioUrl) && m.a(this.surahNumber, bVar.surahNumber) && m.a(this.reciter, bVar.reciter);
        }

        public final List getTitleOtherLanguages() {
            return this.titleOtherLanguages;
        }

        public final int hashCode() {
            Long l = this.id;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.titleOtherLanguages;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.audioUrl;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.surahNumber;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            c cVar = this.reciter;
            return iHashCode5 + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            return "PlaylistEntry(id=" + this.id + ", title=" + this.title + ", titleOtherLanguages=" + this.titleOtherLanguages + ", audioUrl=" + this.audioUrl + ", surahNumber=" + this.surahNumber + ", reciter=" + this.reciter + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\nR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lwv/a$c;", "", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", DiagnosticsEntry.ID_KEY, "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", DiagnosticsEntry.NAME_KEY, "c", "photoUrl", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isNew", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        @ck.b(DiagnosticsEntry.ID_KEY)
        private final Integer id;

        @ck.b(DiagnosticsEntry.NAME_KEY)
        private final String name;

        @ck.b("photo_url")
        private final String photoUrl;

        @ck.b("is_new")
        private final Boolean isNew;

        public final Integer getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhotoUrl() {
            return this.photoUrl;
        }

        public final Boolean getIsNew() {
            return this.isNew;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return m.a(this.id, cVar.id) && m.a(this.name, cVar.name) && m.a(this.photoUrl, cVar.photoUrl) && m.a(this.isNew, cVar.isNew);
        }

        public final int hashCode() {
            Integer num = this.id;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.photoUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isNew;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "Reciter(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", isNew=" + this.isNew + ")";
        }
    }

    public final List getPlaylists() {
        return this.playlists;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && m.a(this.playlists, ((a) obj).playlists);
    }

    public final int hashCode() {
        List<C0026a> list = this.playlists;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "PlaylistsApiModel(playlists=" + this.playlists + ")";
    }
}
