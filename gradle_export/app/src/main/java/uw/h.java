package uw;

import a10.h0;
import android.app.LocaleManager;
import android.content.Context;
import bk.m;
import com.google.android.gms.internal.measurement.g4;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

public final class h extends h0 {
    public final m f;
    public final Context g;
    public final LocaleManager h;

    public h(m mVar, Context context, LocaleManager localeManager) {
        this.f = mVar;
        this.g = context;
        this.h = localeManager;
    }

    public final u30.b X(boolean z) {
        String language;
        InputStream inputStreamOpenRawResource;
        LocaleManager localeManager = this.h;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        String str = null;
        if (locale != null) {
            try {
                language = locale.getLanguage();
            } catch (IOException unused) {
            }
        } else {
            language = null;
        }
        Context context = this.g;
        if (!z && language != null) {
            int iHashCode = language.hashCode();
            if (iHashCode != 3121) {
                if (iHashCode != 3201) {
                    if (iHashCode != 3241) {
                        if (iHashCode != 3246) {
                            if (iHashCode != 3276) {
                                if (iHashCode != 3355) {
                                    if (iHashCode != 3494) {
                                        inputStreamOpenRawResource = (iHashCode == 3651 && language.equals("ru")) ? context.getResources().openRawResource(2131820557) : context.getResources().openRawResource(2131820550);
                                    } else if (language.equals("ms")) {
                                        inputStreamOpenRawResource = context.getResources().openRawResource(2131820556);
                                    }
                                } else if (language.equals(DiagnosticsEntry.ID_KEY)) {
                                    inputStreamOpenRawResource = context.getResources().openRawResource(2131820555);
                                }
                            } else if (language.equals("fr")) {
                                inputStreamOpenRawResource = context.getResources().openRawResource(2131820554);
                            }
                        } else if (language.equals("es")) {
                            inputStreamOpenRawResource = context.getResources().openRawResource(2131820553);
                        }
                    } else if (language.equals("en")) {
                        inputStreamOpenRawResource = context.getResources().openRawResource(2131820552);
                    }
                } else if (language.equals("de")) {
                    inputStreamOpenRawResource = context.getResources().openRawResource(2131820551);
                }
            } else if (language.equals("ar")) {
                inputStreamOpenRawResource = context.getResources().openRawResource(2131820550);
            }
        }
        kotlin.jvm.internal.m.b(inputStreamOpenRawResource);
        byte[] bArr = new byte[inputStreamOpenRawResource.available()];
        inputStreamOpenRawResource.read(bArr);
        inputStreamOpenRawResource.close();
        str = new String(bArr, r30.a.a);
        Object objE = this.f.e(str, new g().getType());
        kotlin.jvm.internal.m.d(objE, "fromJson(...)");
        Map map = (Map) objE;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            String str2 = (String) entry.getValue();
            arrayList.add(new mr.h(str2, iIntValue, str2));
        }
        return g4.d0(arrayList);
    }
}
