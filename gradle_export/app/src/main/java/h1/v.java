package h1;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;

public final class v extends t {

    public static final ZoneId f6531e = ZoneId.of("UTC");

    public final int f6532c;

    public final ArrayList f6533d;

    public v(Locale locale) {
        super(locale);
        this.f6532c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        n00.b bVar = u.f6530a;
        ArrayList arrayList = new ArrayList(bVar.a());
        int iA = bVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            DayOfWeek dayOfWeek = (DayOfWeek) bVar.get(i10);
            arrayList.add(new g00.k(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.f6533d = arrayList;
    }

    @Override
    public final w a(long j9) {
        return e(Instant.ofEpochMilli(j9).atZone(f6531e).withDayOfMonth(1).toLocalDate());
    }

    @Override
    public final s b() {
        LocalDate localDateNow = LocalDate.now();
        return new s(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(f6531e).toInstant().toEpochMilli());
    }

    @Override
    public final s c(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, f.j(str2, locale, this.f6529b));
            return new s(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f6531e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final s d(long j9) {
        LocalDate localDate = Instant.ofEpochMilli(j9).atZone(f6531e).toLocalDate();
        return new s(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), ((long) 1000) * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    public final w e(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f6532c;
        if (value < 0) {
            value += 7;
        }
        return new w(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f6531e).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
