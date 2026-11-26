package zx;

import android.app.Application;
import android.app.LocaleManager;
import bk.m;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import h00.y;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import ri.t1;
import ta.c0;

public final class b {
    public final Application a;
    public final m b;
    public final LocaleManager c;
    public ArrayList d;

    public b(Application application, m mVar, LocaleManager localeManager) {
        this.a = application;
        this.b = mVar;
        this.c = localeManager;
    }

    public final Map a(boolean z) {
        Object objS;
        LocaleManager localeManager = this.c;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        int i = 2131820550;
        if (!z) {
            String language = locale != null ? locale.getLanguage() : null;
            if (language == null) {
                i = 2131820552;
            } else {
                int iHashCode = language.hashCode();
                if (iHashCode != 3121) {
                    if (iHashCode != 3201) {
                        if (iHashCode == 3241) {
                            language.equals("en");
                        } else if (iHashCode != 3246) {
                            if (iHashCode != 3276) {
                                if (iHashCode != 3355) {
                                    if (iHashCode != 3494) {
                                        if (iHashCode == 3651 && language.equals("ru")) {
                                            i = 2131820557;
                                        }
                                    } else if (language.equals("ms")) {
                                        i = 2131820556;
                                    }
                                } else if (language.equals(DiagnosticsEntry.ID_KEY)) {
                                    i = 2131820555;
                                }
                            } else if (language.equals("fr")) {
                                i = 2131820554;
                            }
                        } else if (language.equals("es")) {
                            i = 2131820553;
                        }
                        i = 2131820552;
                    } else if (language.equals("de")) {
                        i = 2131820551;
                    } else {
                        i = 2131820552;
                    }
                } else if (!language.equals("ar")) {
                    i = 2131820552;
                }
            }
        }
        try {
            InputStream inputStreamOpenRawResource = this.a.getResources().openRawResource(i);
            try {
                kotlin.jvm.internal.m.b(inputStreamOpenRawResource);
                objS = (Map) this.b.e(a.a.Y(new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, r30.a.a), 8192)), new a().getType());
                inputStreamOpenRawResource.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0.C(inputStreamOpenRawResource, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            objS = t1.s(th3);
        }
        if (objS instanceof g00.m) {
            objS = y.A;
        }
        return (Map) objS;
    }
}
