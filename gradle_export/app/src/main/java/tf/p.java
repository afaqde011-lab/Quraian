package tf;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class p extends o1 {
    public long D;
    public String E;

    @Override
    public final boolean W0() {
        Calendar calendar = Calendar.getInstance();
        this.D = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.E = w.c.l(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long Z0() {
        X0();
        return this.D;
    }

    public final String a1() {
        X0();
        return this.E;
    }
}
