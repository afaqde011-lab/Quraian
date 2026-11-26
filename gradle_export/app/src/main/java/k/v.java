package k;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;

public abstract class v {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static u4.d b(Configuration configuration) {
        String languageTags = configuration.getLocales().toLanguageTags();
        if (languageTags != null) {
            u4.d dVar = u4.d.f14942b;
            if (!languageTags.isEmpty()) {
                String[] strArrSplit = languageTags.split(",", -1);
                int length = strArrSplit.length;
                Locale[] localeArr = new Locale[length];
                for (int i10 = 0; i10 < length; i10++) {
                    localeArr[i10] = Locale.forLanguageTag(strArrSplit[i10]);
                }
                return new u4.d(new u4.e(new LocaleList(localeArr)));
            }
        }
        return u4.d.f14942b;
    }

    public static void c(u4.d dVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(dVar.f14943a.f14944a.toLanguageTags()));
    }

    public static void d(Configuration configuration, u4.d dVar) {
        configuration.setLocales(LocaleList.forLanguageTags(dVar.f14943a.f14944a.toLanguageTags()));
    }
}
