package vn;

import android.app.LocaleManager;
import android.content.SharedPreferences;
import d40.p1;
import java.util.Locale;

public final class u {
    public final SharedPreferences a;
    public final LocaleManager b;
    public final p1 c;

    public u(SharedPreferences sharedPreferences, LocaleManager localeManager) {
        this.a = sharedPreferences;
        this.b = localeManager;
        this.c = d40.o.c(sharedPreferences.getString("audio_stories_audio_language", null));
    }

    public final String a() {
        String language;
        LocaleManager localeManager = this.b;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        return (locale == null || (language = locale.getLanguage()) == null) ? "en" : language;
    }
}
