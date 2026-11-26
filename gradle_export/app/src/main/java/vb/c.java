package vb;

import android.graphics.Bitmap;
import bc.i;
import c3.s0;
import db.g;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import r30.r;
import th.o;
import x40.p;
import x40.q;

public final class c {

    public final o f15590a;

    public final b f15591b;

    public final Date f15592c;

    public final String f15593d;

    public final Date f15594e;

    public final String f15595f;

    public final Date f15596g;

    public final long f15597h;

    public final long f15598i;

    public final String f15599j;

    public final int f15600k;

    public c(o oVar, b bVar) {
        int i10;
        int i11;
        Date date;
        Date date2;
        Date date3;
        DateFormat simpleDateFormat;
        this.f15590a = oVar;
        this.f15591b = bVar;
        this.f15600k = -1;
        if (bVar != null) {
            this.f15597h = bVar.f15586c;
            this.f15598i = bVar.f15587d;
            p pVar = bVar.f15589f;
            int size = pVar.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                String strC = pVar.c(i13);
                if (r.q0(strC, "Date")) {
                    String strA = pVar.a("Date");
                    if (strA == null) {
                        date3 = null;
                        break;
                    }
                    s0 s0Var = c50.c.a;
                    if (strA.length() == 0) {
                        date3 = null;
                        break;
                    }
                    ParsePosition parsePosition = new ParsePosition(i12);
                    Date date4 = ((DateFormat) c50.c.a.get()).parse(strA, parsePosition);
                    if (parsePosition.getIndex() == strA.length()) {
                        date3 = date4;
                    } else {
                        String[] strArr = c50.c.b;
                        synchronized (strArr) {
                            try {
                                int length = strArr.length;
                                int i14 = i12;
                                while (true) {
                                    if (i14 >= length) {
                                        date3 = null;
                                        break;
                                    }
                                    DateFormat[] dateFormatArr = c50.c.c;
                                    DateFormat dateFormat = dateFormatArr[i14];
                                    if (dateFormat == null) {
                                        simpleDateFormat = new SimpleDateFormat(c50.c.b[i14], Locale.US);
                                        simpleDateFormat.setTimeZone(y40.b.e);
                                        dateFormatArr[i14] = simpleDateFormat;
                                        i12 = 0;
                                    } else {
                                        simpleDateFormat = dateFormat;
                                    }
                                    parsePosition.setIndex(i12);
                                    Date date5 = simpleDateFormat.parse(strA, parsePosition);
                                    if (parsePosition.getIndex() != 0) {
                                        date3 = date5;
                                        break;
                                    } else {
                                        i14++;
                                        i12 = 0;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    this.f15592c = date3;
                    this.f15593d = pVar.h(i13);
                } else {
                    if (r.q0(strC, "Expires")) {
                        String strA2 = pVar.a("Expires");
                        if (strA2 == null) {
                            date2 = null;
                            break;
                        }
                        s0 s0Var2 = c50.c.a;
                        if (strA2.length() == 0) {
                            date2 = null;
                            break;
                        }
                        ParsePosition parsePosition2 = new ParsePosition(0);
                        Date date6 = ((DateFormat) c50.c.a.get()).parse(strA2, parsePosition2);
                        if (parsePosition2.getIndex() == strA2.length()) {
                            date2 = date6;
                        } else {
                            String[] strArr2 = c50.c.b;
                            synchronized (strArr2) {
                                try {
                                    int length2 = strArr2.length;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= length2) {
                                            date2 = null;
                                            break;
                                        }
                                        DateFormat[] dateFormatArr2 = c50.c.c;
                                        DateFormat simpleDateFormat2 = dateFormatArr2[i15];
                                        if (simpleDateFormat2 == null) {
                                            simpleDateFormat2 = new SimpleDateFormat(c50.c.b[i15], Locale.US);
                                            simpleDateFormat2.setTimeZone(y40.b.e);
                                            dateFormatArr2[i15] = simpleDateFormat2;
                                        }
                                        parsePosition2.setIndex(0);
                                        Date date7 = simpleDateFormat2.parse(strA2, parsePosition2);
                                        if (parsePosition2.getIndex() != 0) {
                                            date2 = date7;
                                            break;
                                        }
                                        i15++;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        this.f15596g = date2;
                    } else if (r.q0(strC, "Last-Modified")) {
                        String strA3 = pVar.a("Last-Modified");
                        if (strA3 != null) {
                            s0 s0Var3 = c50.c.a;
                            if (strA3.length() == 0) {
                                date = null;
                            } else {
                                ParsePosition parsePosition3 = new ParsePosition(0);
                                Date date8 = ((DateFormat) c50.c.a.get()).parse(strA3, parsePosition3);
                                if (parsePosition3.getIndex() == strA3.length()) {
                                    date = date8;
                                } else {
                                    String[] strArr3 = c50.c.b;
                                    synchronized (strArr3) {
                                        try {
                                            int length3 = strArr3.length;
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= length3) {
                                                    i10 = 0;
                                                } else {
                                                    DateFormat[] dateFormatArr3 = c50.c.c;
                                                    DateFormat simpleDateFormat3 = dateFormatArr3[i16];
                                                    if (simpleDateFormat3 == null) {
                                                        simpleDateFormat3 = new SimpleDateFormat(c50.c.b[i16], Locale.US);
                                                        simpleDateFormat3.setTimeZone(y40.b.e);
                                                        dateFormatArr3[i16] = simpleDateFormat3;
                                                    }
                                                    i10 = 0;
                                                    parsePosition3.setIndex(0);
                                                    Date date9 = simpleDateFormat3.parse(strA3, parsePosition3);
                                                    if (parsePosition3.getIndex() != 0) {
                                                        date = date9;
                                                        break;
                                                    }
                                                    i16++;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                }
                                this.f15594e = date;
                                this.f15595f = pVar.h(i13);
                            }
                            i10 = 0;
                            this.f15594e = date;
                            this.f15595f = pVar.h(i13);
                        } else {
                            i10 = 0;
                        }
                        date = null;
                        this.f15594e = date;
                        this.f15595f = pVar.h(i13);
                    } else {
                        i10 = 0;
                        if (r.q0(strC, "ETag")) {
                            this.f15599j = pVar.h(i13);
                        } else if (r.q0(strC, "Age")) {
                            String strH = pVar.h(i13);
                            Bitmap.Config[] configArr = bc.d.f2480a;
                            Long lZ0 = r.z0(strH);
                            if (lZ0 != null) {
                                long jLongValue = lZ0.longValue();
                                i11 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                            } else {
                                i11 = -1;
                            }
                            this.f15600k = i11;
                        }
                    }
                    i13++;
                    i12 = i10;
                }
                i10 = 0;
                i13++;
                i12 = i10;
            }
        }
    }

    public final d a() {
        String string;
        long time;
        String str;
        int i10;
        o oVar = this.f15590a;
        p pVar = (p) oVar.D;
        q qVar = (q) oVar.C;
        b bVar = this.f15591b;
        if (bVar == null) {
            return new d(oVar, null);
        }
        ?? r7 = bVar.f15584a;
        if (qVar.j && !bVar.f15588e) {
            return new d(oVar, null);
        }
        x40.d dVar = (x40.d) r7.getValue();
        if (oVar.q().b || ((x40.d) r7.getValue()).b || m.a(bVar.f15589f.a("Vary"), "*")) {
            return new d(oVar, null);
        }
        x40.d dVarQ = oVar.q();
        if (dVarQ.a || pVar.a("If-Modified-Since") != null || pVar.a("If-None-Match") != null) {
            return new d(oVar, null);
        }
        long time2 = this.f15598i;
        Date date = this.f15592c;
        long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
        long millis = 0;
        int i11 = this.f15600k;
        if (i11 != -1) {
            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i11));
        }
        long time3 = this.f15597h;
        long jLongValue = jMax + (time2 - time3) + (((Number) i.f2490a.invoke()).longValue() - time2);
        int i12 = ((x40.d) r7.getValue()).c;
        Date date2 = this.f15594e;
        if (i12 != -1) {
            time = TimeUnit.SECONDS.toMillis(i12);
        } else {
            Date date3 = this.f15596g;
            if (date3 != null) {
                if (date != null) {
                    time2 = date.getTime();
                }
                time = date3.getTime() - time2;
                if (time <= 0) {
                    time = 0;
                }
            } else if (date2 == null) {
                time = 0;
            } else {
                List list = qVar.g;
                if (list == null) {
                    string = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    x40.m.g(sb2, list);
                    string = sb2.toString();
                }
                if (string != null) {
                    time = 0;
                } else {
                    if (date != null) {
                        time3 = date.getTime();
                    }
                    long time4 = time3 - date2.getTime();
                    if (time4 > 0) {
                        time = time4 / ((long) 10);
                    } else {
                        time = 0;
                    }
                }
            }
        }
        int i13 = dVarQ.c;
        if (i13 != -1) {
            time = Math.min(time, TimeUnit.SECONDS.toMillis(i13));
        }
        int i14 = dVarQ.i;
        long millis2 = i14 != -1 ? TimeUnit.SECONDS.toMillis(i14) : 0L;
        if (!dVar.g && (i10 = dVarQ.h) != -1) {
            millis = TimeUnit.SECONDS.toMillis(i10);
        }
        if (!dVar.a && jLongValue + millis2 < time + millis) {
            return new d(null, bVar);
        }
        String str2 = this.f15599j;
        if (str2 != null) {
            str = "If-None-Match";
        } else {
            if (date2 != null) {
                str2 = this.f15595f;
                m.b(str2);
            } else {
                if (date == null) {
                    return new d(oVar, null);
                }
                str2 = this.f15593d;
                m.b(str2);
            }
            str = "If-Modified-Since";
        }
        ce.c cVarJ = oVar.J();
        ((g) cVarJ.D).b(str, str2);
        return new d(cVarJ.r(), bVar);
    }
}
