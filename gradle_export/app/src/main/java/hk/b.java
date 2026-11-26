package hk;

import bk.a0;
import bk.b0;
import bk.m;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class b extends a0 {

    public static final a f7071b = new a();

    public final SimpleDateFormat f7072a;

    public class a implements b0 {
        @Override
        public final a0 a(m mVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    private b() {
        this.f7072a = new SimpleDateFormat("hh:mm:ss a");
    }

    public b(int i10) {
        this();
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        Time time;
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        String strR0 = aVar.r0();
        synchronized (this) {
            TimeZone timeZone = this.f7072a.getTimeZone();
            try {
                try {
                    time = new Time(this.f7072a.parse(strR0).getTime());
                    this.f7072a.setTimeZone(timeZone);
                } catch (ParseException e3) {
                    throw new JsonSyntaxException("Failed parsing '" + strR0 + "' as SQL Time; at path " + aVar.F(true), e3);
                }
            } catch (Throwable th2) {
                this.f7072a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.G();
            return;
        }
        synchronized (this) {
            str = this.f7072a.format((Date) time);
        }
        bVar.o0(str);
    }
}
