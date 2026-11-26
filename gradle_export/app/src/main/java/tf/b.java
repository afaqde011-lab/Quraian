package tf;

import android.util.Log;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.r7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class b {

    public final String f14536a;

    public final int f14537b;

    public Boolean f14538c;

    public Boolean f14539d;

    public Long f14540e;

    public Long f14541f;

    public final int f14542g;

    public final c f14543h;

    public final e5 f14544i;

    public b(c cVar, String str, int i10, e5 e5Var, int i11) {
        this.f14542g = i11;
        this.f14543h = cVar;
        this.f14536a = str;
        this.f14537b = i10;
        this.f14544i = e5Var;
    }

    public static Boolean c(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public static Boolean d(String str, com.google.android.gms.internal.measurement.v1 v1Var, q0 q0Var) {
        List listU;
        com.google.android.gms.common.internal.d0.h(v1Var);
        if (str != null && v1Var.p() && v1Var.x() != 1 && (v1Var.x() != 7 ? v1Var.q() : v1Var.v() != 0)) {
            int iX = v1Var.x();
            boolean zT = v1Var.t();
            String strR = (zT || iX == 2 || iX == 7) ? v1Var.r() : v1Var.r().toUpperCase(Locale.ENGLISH);
            if (v1Var.v() == 0) {
                listU = null;
            } else {
                listU = v1Var.u();
                if (!zT) {
                    ArrayList arrayList = new ArrayList(listU.size());
                    Iterator it = listU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listU = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iX == 2 ? strR : null;
            if (iX != 7 ? strR != null : listU != null && !listU.isEmpty()) {
                if (!zT && iX != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iX - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zT ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (q0Var != null) {
                                    q0Var.J.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strR));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strR));
                    case 4:
                        return Boolean.valueOf(str.contains(strR));
                    case 5:
                        return Boolean.valueOf(str.equals(strR));
                    case 6:
                        if (listU != null) {
                            return Boolean.valueOf(listU.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.s1 s1Var, double d3) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i10;
        com.google.android.gms.common.internal.d0.h(s1Var);
        if (s1Var.p()) {
            if (s1Var.z() != 1 && (s1Var.z() != 5 ? s1Var.s() : s1Var.u() && s1Var.w())) {
                int iZ = s1Var.z();
                try {
                    if (s1Var.z() == 5) {
                        if (t0.B1(s1Var.v()) && t0.B1(s1Var.x())) {
                            BigDecimal bigDecimal5 = new BigDecimal(s1Var.v());
                            bigDecimal4 = new BigDecimal(s1Var.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iZ == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i10 = iZ - 1;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d3 != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d3).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d3).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (t0.B1(s1Var.t())) {
                        bigDecimal2 = new BigDecimal(s1Var.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iZ == 5) {
                            i10 = iZ - 1;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d3 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d3).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d3).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i10 = iZ - 1;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d3 != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d3).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d3).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public boolean a(Long l, Long l10, com.google.android.gms.internal.measurement.a3 a3Var, long j9, q qVar, boolean z10) {
        HashSet hashSet;
        Iterator it;
        u.e eVar;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.p1 p1Var;
        boolean z11;
        String strW;
        Object obj;
        Boolean boolE;
        Boolean boolE2;
        String str;
        com.google.android.gms.internal.measurement.s1 s1VarS;
        long j10;
        Boolean boolE3;
        com.google.android.gms.internal.measurement.d3 d3Var;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.p1 p1Var2;
        Boolean boolE4;
        int i10;
        r7.a();
        c cVar = this.f14543h;
        h1 h1Var = (h1) cVar.B;
        g gVar = h1Var.D;
        q0 q0Var = h1Var.F;
        m0 m0Var = h1Var.J;
        a0 a0Var = b0.F0;
        String str2 = this.f14536a;
        boolean zF1 = gVar.f1(str2, a0Var);
        com.google.android.gms.internal.measurement.n1 n1Var = (com.google.android.gms.internal.measurement.n1) this.f14544i;
        long j11 = n1Var.A() ? qVar.f14687e : j9;
        h1.g(q0Var);
        b50.b bVar = q0Var.O;
        b50.b bVar2 = q0Var.J;
        boolean zIsLoggable = Log.isLoggable(q0Var.f1(), 2);
        int i11 = this.f14537b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            h1.g(q0Var);
            bVar.e("Evaluating filter. audience, filter, event", Integer.valueOf(i11), n1Var.p() ? Integer.valueOf(n1Var.q()) : null, m0Var.a(n1Var.r()));
            h1.g(q0Var);
            t0 t0Var = cVar.C.G;
            y3.R(t0Var);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (n1Var.p()) {
                i10 = 0;
                t0.n1(sb2, 0, "filter_id", Integer.valueOf(n1Var.q()));
            } else {
                i10 = 0;
            }
            t0.n1(sb2, i10, "event_name", ((h1) t0Var.B).J.a(n1Var.r()));
            String strJ1 = t0.j1(n1Var.x(), n1Var.y(), n1Var.A());
            if (!strJ1.isEmpty()) {
                t0.n1(sb2, 0, "filter_type", strJ1);
            }
            if (n1Var.v()) {
                t0.o1(sb2, 1, "event_count_filter", n1Var.w());
            }
            if (n1Var.t() > 0) {
                sb2.append("  filters {\n");
                Iterator it4 = n1Var.s().iterator();
                while (it4.hasNext()) {
                    t0Var.g1(sb2, 2, (com.google.android.gms.internal.measurement.p1) it4.next());
                }
            }
            t0.h1(1, sb2);
            sb2.append("}\n}\n");
            bVar.c(sb2.toString(), "Filter definition");
        }
        if (!n1Var.p() || n1Var.q() > 256) {
            h1.g(q0Var);
            bVar2.d("Invalid event filter ID. appId, id", q0.d1(str2), String.valueOf(n1Var.p() ? Integer.valueOf(n1Var.q()) : null));
            return false;
        }
        boolean z12 = n1Var.x() || n1Var.y() || n1Var.A();
        if (z10 && !z12) {
            h1.g(q0Var);
            bVar.d("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i11), n1Var.p() ? Integer.valueOf(n1Var.q()) : null);
            return true;
        }
        String strS = a3Var.s();
        if (!n1Var.v()) {
            hashSet = new HashSet();
            it = n1Var.s().iterator();
            while (true) {
                if (it.hasNext()) {
                    eVar = new u.e(0);
                    it2 = a3Var.p().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = n1Var.s().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zF1 = zF1;
                                    q0Var = q0Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                p1Var = (com.google.android.gms.internal.measurement.p1) it3.next();
                                if (p1Var.t()) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                strW = p1Var.w();
                                if (strW.isEmpty()) {
                                    obj = eVar.get(strW);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zF1 = zF1;
                                                q0Var = q0Var;
                                                if (obj == null) {
                                                    h1.g(q0Var);
                                                    bVar2.d("Unknown param type. event, param", m0Var.a(strS), m0Var.b(strW));
                                                    break;
                                                }
                                                h1.g(q0Var);
                                                bVar.d("Missing param for filter. event, param", m0Var.a(strS), m0Var.b(strW));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (p1Var.p()) {
                                                if (p1Var.r()) {
                                                    zF1 = zF1;
                                                    q0Var = q0Var;
                                                    h1.g(q0Var);
                                                    bVar2.d("No filter for String param. event, param", m0Var.a(strS), m0Var.b(strW));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (t0.B1(str)) {
                                                    zF1 = zF1;
                                                    q0Var = q0Var;
                                                    h1.g(q0Var);
                                                    bVar2.d("Invalid param value for number filter. event, param", m0Var.a(strS), m0Var.b(strW));
                                                    break;
                                                }
                                                s1VarS = p1Var.s();
                                                if (t0.B1(str)) {
                                                    zF1 = zF1;
                                                    q0Var = q0Var;
                                                    j10 = 0;
                                                    boolE3 = e(new BigDecimal(str), s1VarS, 0.0d);
                                                } else {
                                                    boolE3 = null;
                                                }
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                q0Var = q0Var;
                                                zF1 = zF1;
                                            } else {
                                                com.google.android.gms.internal.measurement.v1 v1VarQ = p1Var.q();
                                                h1.g(q0Var);
                                                boolE3 = d((String) obj, v1VarQ, q0Var);
                                            }
                                            j10 = 0;
                                            if (boolE3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolE3.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            q0Var = q0Var;
                                            zF1 = zF1;
                                        } else if (p1Var.r()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolE2 = e(new BigDecimal(dDoubleValue), p1Var.s(), Math.ulp(dDoubleValue));
                                            if (boolE2 != null) {
                                                if (boolE2.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            h1.g(q0Var);
                                            bVar2.d("No number filter for double param. event, param", m0Var.a(strS), m0Var.b(strW));
                                        }
                                    } else if (p1Var.r()) {
                                        boolE = e(new BigDecimal(((Long) obj).longValue()), p1Var.s(), 0.0d);
                                        if (boolE != null) {
                                            if (boolE.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        h1.g(q0Var);
                                        bVar2.d("No number filter for long param. event, param", m0Var.a(strS), m0Var.b(strW));
                                    }
                                } else {
                                    h1.g(q0Var);
                                    bVar2.c(m0Var.a(strS), "Event has empty param name. event");
                                }
                            }
                        } else {
                            d3Var = (com.google.android.gms.internal.measurement.d3) it2.next();
                            if (!hashSet.contains(d3Var.q())) {
                                if (d3Var.t()) {
                                    String strQ = d3Var.q();
                                    if (d3Var.t()) {
                                        lValueOf = Long.valueOf(d3Var.u());
                                    } else {
                                        lValueOf = null;
                                    }
                                    eVar.put(strQ, lValueOf);
                                } else if (d3Var.x()) {
                                    String strQ2 = d3Var.q();
                                    if (d3Var.x()) {
                                        dValueOf = Double.valueOf(d3Var.y());
                                    } else {
                                        dValueOf = null;
                                    }
                                    eVar.put(strQ2, dValueOf);
                                } else if (d3Var.r()) {
                                    eVar.put(d3Var.q(), d3Var.s());
                                } else {
                                    h1.g(q0Var);
                                    bVar2.d("Unknown value for param. event, param", m0Var.a(strS), m0Var.b(d3Var.q()));
                                }
                            }
                        }
                    }
                } else {
                    p1Var2 = (com.google.android.gms.internal.measurement.p1) it.next();
                    if (p1Var2.w().isEmpty()) {
                        h1.g(q0Var);
                        bVar2.c(m0Var.a(strS), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(p1Var2.w());
                    }
                }
                zF1 = zF1;
                q0Var = q0Var;
                break;
            }
        }
        try {
            boolE4 = e(new BigDecimal(j11), n1Var.w(), 0.0d);
        } catch (NumberFormatException unused) {
            boolE4 = null;
        }
        if (boolE4 != null) {
            if (boolE4.booleanValue()) {
                hashSet = new HashSet();
                it = n1Var.s().iterator();
                while (true) {
                    if (it.hasNext()) {
                        eVar = new u.e(0);
                        it2 = a3Var.p().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = n1Var.s().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zF1 = zF1;
                                        q0Var = q0Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    p1Var = (com.google.android.gms.internal.measurement.p1) it3.next();
                                    if (p1Var.t() || !p1Var.u()) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    strW = p1Var.w();
                                    if (strW.isEmpty()) {
                                        obj = eVar.get(strW);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zF1 = zF1;
                                                    q0Var = q0Var;
                                                    if (obj == null) {
                                                        h1.g(q0Var);
                                                        bVar2.d("Unknown param type. event, param", m0Var.a(strS), m0Var.b(strW));
                                                        break;
                                                    }
                                                    h1.g(q0Var);
                                                    bVar.d("Missing param for filter. event, param", m0Var.a(strS), m0Var.b(strW));
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (p1Var.p()) {
                                                    if (p1Var.r()) {
                                                        zF1 = zF1;
                                                        q0Var = q0Var;
                                                        h1.g(q0Var);
                                                        bVar2.d("No filter for String param. event, param", m0Var.a(strS), m0Var.b(strW));
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (t0.B1(str)) {
                                                        zF1 = zF1;
                                                        q0Var = q0Var;
                                                        h1.g(q0Var);
                                                        bVar2.d("Invalid param value for number filter. event, param", m0Var.a(strS), m0Var.b(strW));
                                                        break;
                                                    }
                                                    s1VarS = p1Var.s();
                                                    if (t0.B1(str)) {
                                                        boolE3 = null;
                                                    } else {
                                                        try {
                                                            zF1 = zF1;
                                                            q0Var = q0Var;
                                                            j10 = 0;
                                                            try {
                                                                boolE3 = e(new BigDecimal(str), s1VarS, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolE3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zF1 = zF1;
                                                            q0Var = q0Var;
                                                            j10 = 0;
                                                        }
                                                    }
                                                    if (boolE3 != null) {
                                                        break;
                                                    }
                                                    if (boolE3.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    q0Var = q0Var;
                                                    zF1 = zF1;
                                                } else {
                                                    com.google.android.gms.internal.measurement.v1 v1VarQ2 = p1Var.q();
                                                    h1.g(q0Var);
                                                    boolE3 = d((String) obj, v1VarQ2, q0Var);
                                                }
                                                j10 = 0;
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                q0Var = q0Var;
                                                zF1 = zF1;
                                            } else if (p1Var.r()) {
                                                h1.g(q0Var);
                                                bVar2.d("No number filter for double param. event, param", m0Var.a(strS), m0Var.b(strW));
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolE2 = e(new BigDecimal(dDoubleValue2), p1Var.s(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolE2 = null;
                                                }
                                                if (boolE2 != null) {
                                                    if (boolE2.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (p1Var.r()) {
                                            h1.g(q0Var);
                                            bVar2.d("No number filter for long param. event, param", m0Var.a(strS), m0Var.b(strW));
                                        } else {
                                            try {
                                                boolE = e(new BigDecimal(((Long) obj).longValue()), p1Var.s(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolE = null;
                                            }
                                            if (boolE != null) {
                                                if (boolE.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        h1.g(q0Var);
                                        bVar2.c(m0Var.a(strS), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                d3Var = (com.google.android.gms.internal.measurement.d3) it2.next();
                                if (!hashSet.contains(d3Var.q())) {
                                    if (d3Var.t()) {
                                        String strQ3 = d3Var.q();
                                        if (d3Var.t()) {
                                            lValueOf = Long.valueOf(d3Var.u());
                                        } else {
                                            lValueOf = null;
                                        }
                                        eVar.put(strQ3, lValueOf);
                                    } else if (d3Var.x()) {
                                        String strQ4 = d3Var.q();
                                        if (d3Var.x()) {
                                            dValueOf = Double.valueOf(d3Var.y());
                                        } else {
                                            dValueOf = null;
                                        }
                                        eVar.put(strQ4, dValueOf);
                                    } else if (d3Var.r()) {
                                        eVar.put(d3Var.q(), d3Var.s());
                                    } else {
                                        h1.g(q0Var);
                                        bVar2.d("Unknown value for param. event, param", m0Var.a(strS), m0Var.b(d3Var.q()));
                                    }
                                }
                            }
                        }
                    } else {
                        p1Var2 = (com.google.android.gms.internal.measurement.p1) it.next();
                        if (p1Var2.w().isEmpty()) {
                            h1.g(q0Var);
                            bVar2.c(m0Var.a(strS), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(p1Var2.w());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zF1 = zF1;
        q0Var = q0Var;
        break;
        h1.g(q0Var);
        bVar.c(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f14538c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f14539d = bool2;
        if (!z12 || !a3Var.t()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(a3Var.u());
        if (n1Var.y()) {
            if (zF1 && n1Var.v()) {
                lValueOf2 = l;
            }
            this.f14541f = lValueOf2;
            return true;
        }
        if (zF1 && n1Var.v()) {
            lValueOf2 = l10;
        }
        this.f14540e = lValueOf2;
        return true;
    }

    public boolean b(Long l, Long l10, com.google.android.gms.internal.measurement.r3 r3Var, boolean z10) {
        boolean z11;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        r7.a();
        h1 h1Var = (h1) this.f14543h.B;
        g gVar = h1Var.D;
        m0 m0Var = h1Var.J;
        q0 q0Var = h1Var.F;
        boolean zF1 = gVar.f1(this.f14536a, b0.D0);
        com.google.android.gms.internal.measurement.u1 u1Var = (com.google.android.gms.internal.measurement.u1) this.f14544i;
        boolean zT = u1Var.t();
        boolean zU = u1Var.u();
        boolean zW = u1Var.w();
        boolean z12 = zT || zU || zW;
        if (z10 && !z12) {
            h1.g(q0Var);
            q0Var.O.d("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f14537b), u1Var.p() ? Integer.valueOf(u1Var.q()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.p1 p1VarS = u1Var.s();
        boolean zU2 = p1VarS.u();
        if (!r3Var.u()) {
            z11 = zW;
            if (!r3Var.y()) {
                if (!r3Var.s()) {
                    h1.g(q0Var);
                    q0Var.J.c(m0Var.c(r3Var.r()), "User property has no value, property");
                } else if (p1VarS.p()) {
                    String strT = r3Var.t();
                    com.google.android.gms.internal.measurement.v1 v1VarQ = p1VarS.q();
                    h1.g(q0Var);
                    boolC = c(d(strT, v1VarQ, q0Var), zU2);
                } else if (!p1VarS.r()) {
                    h1.g(q0Var);
                    q0Var.J.c(m0Var.c(r3Var.r()), "No string or number filter defined. property");
                } else if (t0.B1(r3Var.t())) {
                    String strT2 = r3Var.t();
                    com.google.android.gms.internal.measurement.s1 s1VarS = p1VarS.s();
                    if (t0.B1(strT2)) {
                        try {
                            boolE = e(new BigDecimal(strT2), s1VarS, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                    } else {
                        boolE = null;
                    }
                    boolC = c(boolE, zU2);
                } else {
                    h1.g(q0Var);
                    q0Var.J.d("Invalid user property value for Numeric number filter. property, value", m0Var.c(r3Var.r()), r3Var.t());
                }
                boolC = null;
            } else if (p1VarS.r()) {
                double dZ = r3Var.z();
                try {
                    boolE2 = e(new BigDecimal(dZ), p1VarS.s(), Math.ulp(dZ));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zU2);
            } else {
                h1.g(q0Var);
                q0Var.J.c(m0Var.c(r3Var.r()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (p1VarS.r()) {
            z11 = zW;
            try {
                boolE3 = e(new BigDecimal(r3Var.v()), p1VarS.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zU2);
        } else {
            h1.g(q0Var);
            q0Var.J.c(m0Var.c(r3Var.r()), "No number filter for long property. property");
            z11 = zW;
            boolC = null;
        }
        h1.g(q0Var);
        q0Var.O.c(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f14538c = Boolean.TRUE;
        if (!z11 || boolC.booleanValue()) {
            if (!z10 || u1Var.t()) {
                this.f14539d = boolC;
            }
            if (boolC.booleanValue() && z12 && r3Var.p()) {
                long jQ = r3Var.q();
                if (l != null) {
                    jQ = l.longValue();
                }
                if (zF1 && u1Var.t() && !u1Var.u() && l10 != null) {
                    jQ = l10.longValue();
                }
                if (u1Var.u()) {
                    this.f14541f = Long.valueOf(jQ);
                } else {
                    this.f14540e = Long.valueOf(jQ);
                }
            }
        }
        return true;
    }
}
