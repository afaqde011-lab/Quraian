package mt;

import android.app.LocaleManager;
import java.util.Locale;

public final class a {
    public final LocaleManager a;

    public a(LocaleManager localeManager) {
        this.a = localeManager;
    }

    public final String a() {
        String language;
        LocaleManager localeManager = this.a;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        return (locale == null || (language = locale.getLanguage()) == null) ? "en" : language;
    }
}
