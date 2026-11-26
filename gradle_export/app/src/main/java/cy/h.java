package cy;

import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;

public final class h {
    public final int a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public h(int i, String surahNumberText, ArrayList arrayList, ArrayList arrayList2) {
        kotlin.jvm.internal.m.e(surahNumberText, "surahNumberText");
        this.a = i;
        this.b = surahNumberText;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && kotlin.jvm.internal.m.a(this.b, hVar.b) && this.c.equals(hVar.c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + x5.e(Integer.hashCode(this.a) * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("PlaylistEntrySearchData(surahNumber=", this.a, ", surahNumberText=", this.b, ", normalizedSurahTexts=");
        sbM.append(this.c);
        sbM.append(", normalizedEntryTexts=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
