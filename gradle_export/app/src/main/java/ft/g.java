package ft;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lft/g;", "", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "ayahNumber", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "text", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    @ck.b("ayah_number")
    private final Integer ayahNumber;

    @ck.b("text")
    private final String text;

    public final Integer getAyahNumber() {
        return this.ayahNumber;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.a(this.ayahNumber, gVar.ayahNumber) && m.a(this.text, gVar.text);
    }

    public final int hashCode() {
        Integer num = this.ayahNumber;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TafsirTranslationAyahApiModel(ayahNumber=" + this.ayahNumber + ", text=" + this.text + ")";
    }
}
