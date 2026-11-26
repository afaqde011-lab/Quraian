package ek;

import com.google.android.gms.internal.measurement.x5;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

public final class h extends bk.a0 {

    public static final e f5428c = new e();

    public final g f5429a;

    public final ArrayList f5430b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f5430b = arrayList;
        Objects.requireNonNull(gVar);
        this.f5429a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (dk.i.f4922a >= 9) {
            arrayList.add(new SimpleDateFormat(x5.m("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        Date dateC;
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        String strR0 = aVar.r0();
        synchronized (this.f5430b) {
            try {
                for (DateFormat dateFormat : this.f5430b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateC = dateFormat.parse(strR0);
                            dateFormat.setTimeZone(timeZone);
                        } catch (Throwable th2) {
                            dateFormat.setTimeZone(timeZone);
                            throw th2;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    dateC = fk.a.c(strR0, new ParsePosition(0));
                } catch (ParseException e3) {
                    StringBuilder sbN = g4.c.n("Failed parsing '", strR0, "' as Date; at path ");
                    sbN.append(aVar.F(true));
                    throw new JsonSyntaxException(sbN.toString(), e3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return this.f5429a.a(dateC);
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.G();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f5430b.get(0);
        synchronized (this.f5430b) {
            str = dateFormat.format(date);
        }
        bVar.o0(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f5430b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
