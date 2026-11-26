package hk;

import bk.a0;
import bk.b0;
import bk.m;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public final class a extends a0 {

    public static final C0000a f7069b = new C0000a();

    public final SimpleDateFormat f7070a;

    public class C0000a implements b0 {
        @Override
        public final a0 a(m mVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    private a() {
        this.f7070a = new SimpleDateFormat("MMM d, yyyy");
    }

    public a(int i10) {
        this();
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        Date date;
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        String strR0 = aVar.r0();
        synchronized (this) {
            TimeZone timeZone = this.f7070a.getTimeZone();
            try {
                try {
                    date = new Date(this.f7070a.parse(strR0).getTime());
                    this.f7070a.setTimeZone(timeZone);
                } catch (ParseException e3) {
                    throw new JsonSyntaxException("Failed parsing '" + strR0 + "' as SQL Date; at path " + aVar.F(true), e3);
                }
            } catch (Throwable th2) {
                this.f7070a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return date;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.G();
            return;
        }
        synchronized (this) {
            str = this.f7070a.format((java.util.Date) date);
        }
        bVar.o0(str);
    }
}
