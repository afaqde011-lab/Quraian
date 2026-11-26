package un;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R$\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006¨\u0006\u001f"}, d2 = {"Lun/a;", "", "", "a", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", DiagnosticsEntry.ID_KEY, "", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "slug", "c", "g", "title", "d", "description", "coverUrl", "Lun/b;", "Lun/b;", "()Lun/b;", "author", "", "Lun/d;", "Ljava/util/List;", "()Ljava/util/List;", "episodes", "h", DiagnosticsEntry.VERSION_KEY, "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    @ck.b(DiagnosticsEntry.ID_KEY)
    private final Integer id;

    @ck.b("slug")
    private final String slug;

    @ck.b("title")
    private final String title;

    @ck.b("description")
    private final String description;

    @ck.b("cover_url")
    private final String coverUrl;

    @ck.b("author")
    private final b author;

    @ck.b("episodes")
    private final List<d> episodes;

    @ck.b(DiagnosticsEntry.VERSION_KEY)
    private final Integer version;

    public final b getAuthor() {
        return this.author;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List getEpisodes() {
        return this.episodes;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getVersion() {
        return this.version;
    }
}
