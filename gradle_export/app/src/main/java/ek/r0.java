package ek;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class r0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        aVar.i();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (aVar.t0() == 4) {
                aVar.x();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }
            String strN0 = aVar.n0();
            int iB0 = aVar.b0();
            strN0.getClass();
            switch (strN0) {
                case "dayOfMonth":
                    i12 = iB0;
                    break;
                case "minute":
                    i14 = iB0;
                    break;
                case "second":
                    i15 = iB0;
                    break;
                case "year":
                    i10 = iB0;
                    break;
                case "month":
                    i11 = iB0;
                    break;
                case "hourOfDay":
                    i13 = iB0;
                    break;
            }
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            bVar.G();
            return;
        }
        bVar.l();
        bVar.A("year");
        bVar.f0(calendar.get(1));
        bVar.A("month");
        bVar.f0(calendar.get(2));
        bVar.A("dayOfMonth");
        bVar.f0(calendar.get(5));
        bVar.A("hourOfDay");
        bVar.f0(calendar.get(11));
        bVar.A("minute");
        bVar.f0(calendar.get(12));
        bVar.A("second");
        bVar.f0(calendar.get(13));
        bVar.x();
    }
}
