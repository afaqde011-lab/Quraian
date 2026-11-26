package ft;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lft/h;", "", "", "Lft/i;", "a", "Ljava/util/List;", "()Ljava/util/List;", "surahs", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    @ck.b("surahs")
    private final List<i> surahs;

    public final List getSurahs() {
        return this.surahs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && m.a(this.surahs, ((h) obj).surahs);
    }

    public final int hashCode() {
        List<i> list = this.surahs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "TafsirTranslationPayloadApiModel(surahs=" + this.surahs + ")";
    }
}
