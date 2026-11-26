package pp;

import a1.w;
import ab.a0;
import al.l;
import android.content.res.Configuration;
import b1.n;
import b2.r;
import c3.o0;
import c4.v;
import com.google.android.gms.internal.measurement.z3;
import g1.a1;
import g1.a3;
import g1.b3;
import g1.h1;
import g1.l1;
import g1.q1;
import gv.y;
import i2.t0;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.q;
import l1.r1;
import l1.z0;
import m3.c0;
import s10.w0;
import u00.k;

public abstract class c {
    public static final v1.c a = new v1.c(new lu.a(27), -1602173228, false);
    public static final v1.c b = new v1.c(new lu.a(28), 155453910, false);
    public static final v1.c c = new v1.c(new ou.a(13), 421217627, false);
    public static final v1.c d = new v1.c(new ou.a(14), -264667596, false);

    public static final void a(LocalDate localDate, k kVar, u00.a aVar, j jVar, int i) {
        int i2;
        b bVar;
        j jVar2 = (g0) jVar;
        jVar2.e0(-1115689915);
        if ((i & 6) == 0) {
            i2 = (jVar2.i(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar2.i(kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= jVar2.i(aVar) ? 256 : 128;
        }
        if (jVar2.S(i2 & 1, (i2 & 147) != 146)) {
            Object objN = jVar2.N();
            Object obj = i.a;
            if (objN == obj) {
                objN = LocalDate.now();
                jVar2.n0(objN);
            }
            LocalDate localDate2 = (LocalDate) objN;
            boolean zG = jVar2.g(localDate2);
            Object objN2 = jVar2.N();
            if (zG || objN2 == obj) {
                objN2 = localDate2.minusYears(150L);
                jVar2.n0(objN2);
            }
            LocalDate localDate3 = (LocalDate) objN2;
            boolean zG2 = jVar2.g(localDate2);
            Object objN3 = jVar2.N();
            if (zG2 || objN3 == obj) {
                objN3 = localDate2.minusYears(4L);
                jVar2.n0(objN3);
            }
            LocalDate localDate4 = (LocalDate) objN3;
            boolean zG3 = jVar2.g(localDate3);
            Object objN4 = jVar2.N();
            if (zG3 || objN4 == obj) {
                m.b(localDate3);
                objN4 = Long.valueOf(localDate3.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli());
                jVar2.n0(objN4);
            }
            long jLongValue = ((Number) objN4).longValue();
            boolean zG4 = jVar2.g(localDate4);
            Object objN5 = jVar2.N();
            if (zG4 || objN5 == obj) {
                m.b(localDate4);
                objN5 = Long.valueOf(localDate4.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli());
                jVar2.n0(objN5);
            }
            long jLongValue2 = ((Number) objN5).longValue();
            int year = localDate3.getYear();
            int year2 = localDate4.getYear();
            boolean zG5 = jVar2.g(localDate) | jVar2.g(localDate3) | jVar2.g(localDate4);
            Object objN6 = jVar2.N();
            if (zG5 || objN6 == obj) {
                objN6 = Long.valueOf(((LocalDate) a0.C(localDate == null ? localDate4 : localDate, localDate3, localDate4)).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli());
                jVar2.n0(objN6);
            }
            long jLongValue3 = ((Number) objN6).longValue();
            boolean zF = jVar2.f(jLongValue) | jVar2.f(jLongValue2) | jVar2.e(year) | jVar2.e(year2);
            Object objN7 = jVar2.N();
            if (zF || objN7 == obj) {
                b bVar2 = new b(jLongValue, year, year2, jLongValue2);
                jVar2.n0(bVar2);
                objN7 = bVar2;
            }
            b bVar3 = (b) objN7;
            Long lValueOf = Long.valueOf(jLongValue3);
            float f = a3.a;
            z00.e eVar = l1.b;
            jVar2.c0(2088426481);
            Locale locale = ((Configuration) jVar2.k(o0.a)).getLocales().get(0);
            jVar2.r(false);
            Object[] objArr = new Object[0];
            w0 w0VarB = y1.k.b(new fo.b(24, (byte) 0), new l(bVar3, locale, 14));
            boolean zG6 = jVar2.g(lValueOf) | jVar2.g(lValueOf) | jVar2.i(eVar) | jVar2.e(0) | jVar2.g(bVar3) | jVar2.i(locale);
            Object objN8 = jVar2.N();
            if (zG6 || objN8 == obj) {
                a1 a1Var = new a1(lValueOf, lValueOf, eVar, bVar3, locale);
                bVar = bVar3;
                jVar2.n0(a1Var);
                objN8 = a1Var;
            } else {
                bVar = bVar3;
            }
            b3 b3Var = (b3) y1.k.f(objArr, w0VarB, (u00.a) objN8, jVar2, 0);
            b3Var.d.setValue(bVar);
            l1 l1Var = l1.a;
            h1 h1VarB = l1.b(dl.a.M, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, jVar2, 33554430);
            jVar2 = jVar2;
            q1.a(aVar, v1.d.d(779081687, new n(b3Var, kVar, aVar, 28), jVar2), (r) null, v1.d.d(-1758258471, new eu.d(16, aVar), jVar2), (t0) null, 0.0f, h1VarB, (v) null, v1.d.d(-539428370, new w(b3Var, 14), jVar2), jVar2, ((i2 >> 6) & 14) | 100666416);
        } else {
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(localDate, kVar, aVar, i, 18);
        }
    }

    public static final void b(LocalDate localDate, k onBirthDateSelected, r rVar, boolean z, j jVar, int i, int i2) {
        boolean z2;
        boolean z3;
        g0 g0Var;
        boolean z4;
        r1 r1VarT;
        boolean z5;
        Object objN;
        Object obj;
        z0 z0Var;
        boolean zG;
        Object objN2;
        String str;
        Object objN3;
        boolean z6;
        Object objN4;
        Object objN5;
        m.e(onBirthDateSelected, "onBirthDateSelected");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-203401787);
        int i3 = (g0Var2.i(localDate) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= g0Var2.i(onBirthDateSelected) ? 32 : 16;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= g0Var2.h(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var2.S(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                objN = g0Var2.N();
                obj = i.a;
                if (objN == obj) {
                    objN = q.z(Boolean.FALSE);
                    g0Var2.n0(objN);
                }
                z0Var = (z0) objN;
                zG = g0Var2.g(localDate);
                objN2 = g0Var2.N();
                if (zG || objN2 == obj) {
                    if (localDate != null) {
                        str = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    objN2 = str;
                    g0Var2.n0(objN2);
                }
                String str2 = (String) objN2;
                String strU = z3.U(g0Var2, 2131886157);
                objN3 = g0Var2.N();
                if (objN3 == obj) {
                    objN3 = new c0(29);
                    g0Var2.n0(objN3);
                }
                k kVar = (k) objN3;
                z6 = (i3 & 7168) == 2048;
                objN4 = g0Var2.N();
                if (z6 || objN4 == obj) {
                    objN4 = new a(z5, z0Var, 0);
                    g0Var2.n0(objN4);
                }
                up.i.e(str2, kVar, rVar, strU, null, false, false, z5, false, null, null, null, null, (u00.a) objN4, null, g0Var2, 432 | ((i3 << 15) & 234881024), 0, 48880);
                g0Var = g0Var2;
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    g0Var.c0(656916509);
                    objN5 = g0Var.N();
                    if (objN5 == obj) {
                        objN5 = new ct.k(z0Var, 14);
                        g0Var.n0(objN5);
                    }
                    a(localDate, onBirthDateSelected, (u00.a) objN5, g0Var, (i3 & 14) | 384 | (i3 & 112));
                    g0Var.r(false);
                } else {
                    g0Var.c0(657101021);
                    g0Var.r(false);
                }
                z4 = z5;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                z4 = z2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new y(localDate, onBirthDateSelected, rVar, z4, i, i2, 5);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var2.S(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            objN = g0Var2.N();
            obj = i.a;
            if (objN == obj) {
                objN = q.z(Boolean.FALSE);
                g0Var2.n0(objN);
            }
            z0Var = (z0) objN;
            zG = g0Var2.g(localDate);
            objN2 = g0Var2.N();
            if (zG) {
                if (localDate != null) {
                    str = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                objN2 = str;
                g0Var2.n0(objN2);
            } else {
                if (localDate != null) {
                    str = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                objN2 = str;
                g0Var2.n0(objN2);
            }
            String str3 = (String) objN2;
            String strU2 = z3.U(g0Var2, 2131886157);
            objN3 = g0Var2.N();
            if (objN3 == obj) {
                objN3 = new c0(29);
                g0Var2.n0(objN3);
            }
            k kVar2 = (k) objN3;
            if ((i3 & 7168) == 2048) {
            }
            objN4 = g0Var2.N();
            if (z6) {
                objN4 = new a(z5, z0Var, 0);
                g0Var2.n0(objN4);
            } else {
                objN4 = new a(z5, z0Var, 0);
                g0Var2.n0(objN4);
            }
            up.i.e(str3, kVar2, rVar, strU2, null, false, false, z5, false, null, null, null, null, (u00.a) objN4, null, g0Var2, 432 | ((i3 << 15) & 234881024), 0, 48880);
            g0Var = g0Var2;
            if (((Boolean) z0Var.getValue()).booleanValue()) {
                g0Var.c0(656916509);
                objN5 = g0Var.N();
                if (objN5 == obj) {
                    objN5 = new ct.k(z0Var, 14);
                    g0Var.n0(objN5);
                }
                a(localDate, onBirthDateSelected, (u00.a) objN5, g0Var, (i3 & 14) | 384 | (i3 & 112));
                g0Var.r(false);
            } else {
                g0Var.c0(657101021);
                g0Var.r(false);
            }
            z4 = z5;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            z4 = z2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y(localDate, onBirthDateSelected, rVar, z4, i, i2, 5);
        }
    }
}
