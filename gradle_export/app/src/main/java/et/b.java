package et;

import a10.h0;
import com.google.android.gms.internal.measurement.x5;
import h00.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import ot.o;
import r30.k;

public final class b extends h0 {
    public final xm.a f;

    public b(xm.a aVar) {
        this.f = aVar;
    }

    public final List X(List list) {
        String str;
        String string;
        String string2;
        String string3;
        String languageTitle;
        List<ft.b> list2 = list == null ? x.A : list;
        ArrayList arrayList = new ArrayList();
        for (ft.b bVar : list2) {
            o oVar = null;
            String string4 = (bVar == null || (languageTitle = bVar.getLanguageTitle()) == null) ? null : k.j1(languageTitle).toString();
            String str2 = string4 == null ? "" : string4;
            if (bVar != null) {
                String code = bVar.getCode();
                String string5 = code != null ? k.j1(code).toString() : null;
                if (string5 != null && string5.length() != 0 && str2.length() != 0) {
                    Integer contentVersion = bVar.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.VERSION_KEY java.lang.String();
                    int iIntValue = (contentVersion == null && (contentVersion = bVar.getContentVersion()) == null) ? 0 : contentVersion.intValue();
                    String string6 = k.j1(bVar.getCode()).toString();
                    String languageCode = bVar.getLanguageCode();
                    String str3 = (languageCode == null || (string3 = k.j1(languageCode).toString()) == null || string3.length() <= 0) ? null : string3;
                    String title = bVar.getTitle();
                    String author = bVar.getAuthor();
                    if (author == null) {
                        author = "";
                    }
                    String string7 = title != null ? k.j1(title).toString() : null;
                    String str4 = string7 != null ? string7 : "";
                    if (str4.length() == 0 || str4.equals(author)) {
                        str = author;
                    } else if (author.length() == 0) {
                        str = str4;
                    } else {
                        author = x5.m(str4, " · ", author);
                        str = author;
                    }
                    String strA = this.f.a(bVar.getCountryCode());
                    String imageUrl = bVar.getImageUrl();
                    String str5 = (imageUrl == null || (string2 = k.j1(imageUrl).toString()) == null || string2.length() <= 0) ? null : string2;
                    String fileUrl = bVar.getFileUrl();
                    oVar = new o(string6, str3, str2, str, strA, str5, (fileUrl == null || (string = k.j1(fileUrl).toString()) == null || string.length() <= 0) ? null : string, m.a(bVar.getIsDefault(), Boolean.TRUE), iIntValue, false);
                }
            }
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }
}
