package s30;

import ab.a0;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import kotlin.jvm.internal.m;
import r30.k;

public final class b implements Comparable {
    public static final a B = new a();
    public static final long C = g4.C(4611686018427387903L);
    public static final long D = g4.C(-4611686018427387903L);
    public static final long E = 9223372036854759646L;
    public final long A;

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long jP = g4.p(j, j4);
        if (-4611686018426L > jP || jP >= 4611686018427L) {
            return g4.C(jP);
        }
        return g4.D((jP * j3) + (j2 - (j4 * j3)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strP0 = k.P0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strP0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strP0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strP0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strP0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return m.g(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final long e(long j) {
        return ((((int) j) & 1) != 1 || g(j)) ? i(j, d.MILLISECONDS) : j >> 1;
    }

    public static final int f(long j) {
        if (g(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
    }

    public static final boolean g(long j) {
        return j == C || j == D;
    }

    public static final long h(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? g4.C(j3 / ((long) 1000000)) : g4.D(j3);
        }
        long jP = g4.p(j >> 1, j2 >> 1);
        if (jP == 9223372036854759646L) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jP == 4611686018427387903L || jP == -4611686018427387903L) {
            return g4.C(jP);
        }
        return (-4611686018426L > jP || jP >= 4611686018427L) ? g4.C(a0.A(jP, -4611686018427387903L, 4611686018427387903L)) : g4.D(jP * ((long) 1000000));
    }

    public static final long i(long j, d unit) {
        m.e(unit, "unit");
        if (j == C) {
            return Long.MAX_VALUE;
        }
        if (j == D) {
            return Long.MIN_VALUE;
        }
        return b5.o(j >> 1, (((int) j) & 1) == 0 ? d.NANOSECONDS : d.MILLISECONDS, unit);
    }

    public static String j(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == C) {
            return "Infinity";
        }
        if (j == D) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long jK = j < 0 ? k(j) : j;
        long jI = i(jK, d.DAYS);
        int i2 = g(jK) ? 0 : (int) (i(jK, d.HOURS) % ((long) 24));
        int i3 = g(jK) ? 0 : (int) (i(jK, d.MINUTES) % ((long) 60));
        int i4 = g(jK) ? 0 : (int) (i(jK, d.SECONDS) % ((long) 60));
        int iF = f(jK);
        boolean z2 = jI != 0;
        boolean z3 = i2 != 0;
        boolean z4 = i3 != 0;
        boolean z5 = (i4 == 0 && iF == 0) ? false : true;
        if (z2) {
            sb.append(jI);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i2);
            sb.append('h');
            i = i5;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i6 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(i3);
            sb.append('m');
            i = i6;
        }
        if (z5) {
            int i7 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (i4 != 0 || z2 || z3 || z4) {
                b(sb, i4, iF, 9, "s", false);
            } else if (iF >= 1000000) {
                b(sb, iF / 1000000, iF % 1000000, 6, "ms", false);
            } else if (iF >= 1000) {
                b(sb, iF / 1000, iF % 1000, 3, "us", false);
            } else {
                sb.append(iF);
                sb.append("ns");
            }
            i = i7;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long k(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = c.a;
        return j2;
    }

    @Override
    public final int compareTo(Object obj) {
        return c(this.A, ((b) obj).A);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.A == ((b) obj).A;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.A);
    }

    public final String toString() {
        return j(this.A);
    }
}
