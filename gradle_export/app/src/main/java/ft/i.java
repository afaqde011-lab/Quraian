package ft;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lft/i;", "", "", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "surahNumber", "", "Lft/g;", "Ljava/util/List;", "()Ljava/util/List;", "ayahs", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    @ck.b("surah_number")
    private final Integer surahNumber;

    @ck.b("ayahs")
    private final List<g> ayahs;

    public final List getAyahs() {
        return this.ayahs;
    }

    public final Integer getSurahNumber() {
        return this.surahNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m.a(this.surahNumber, iVar.surahNumber) && m.a(this.ayahs, iVar.ayahs);
    }

    public final int hashCode() {
        Integer num = this.surahNumber;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<g> list = this.ayahs;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TafsirTranslationSurahApiModel(surahNumber=" + this.surahNumber + ", ayahs=" + this.ayahs + ")";
    }
}
