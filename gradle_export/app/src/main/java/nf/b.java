package nf;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class b {
    public static volatile a B;
    public static final Object A = new Object();
    public static final b1 C = new b1("id");
    public static final b1 D = new b1("type");

    public static int a(int i10, int i11) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (p0.f11252a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i12;
                }
                if (iAbs2 <= 0) {
                    return i12;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i12 + i14;
    }

    public static int b(q qVar) {
        Iterator it = qVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static String c(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strQ;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strQ = "null";
            } else {
                try {
                    strQ = obj.toString();
                } catch (Exception e3) {
                    String strM = x5.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e3);
                    strQ = a1.b.q("<", strM, " threw ", e3.getClass().getName(), ">");
                }
            }
            objArr[i11] = strQ;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String d(u0 u0Var) {
        StringBuilder sb2 = new StringBuilder(u0Var.e());
        for (int i10 = 0; i10 < u0Var.e(); i10++) {
            byte bA = u0Var.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void e(int i10, int i11) {
        String strC;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strC = c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(g4.c.f(i11, "negative size: "));
                }
                strC = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(a1.b.p("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void g(StringBuilder sb2, Iterator it, hb.f fVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(hb.f.n(entry.getKey()));
            sb2.append(" : ");
            sb2.append(hb.f.n(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(hb.f.n(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(hb.f.n(entry2.getValue()));
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = x.B;
            }
        } else {
            if (!(collection instanceof e0)) {
                return false;
            }
            objComparator = ((u) ((e0) collection)).D;
        }
        return comparator.equals(objComparator);
    }

    public static byte[] j(byte[]... bArr) {
        int i10 = 0;
        int length = 0;
        while (true) {
            if (i10 >= bArr.length) {
                break;
            }
            length += bArr[i10].length;
            i10++;
        }
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length2);
            i11 += length2;
        }
        return bArr2;
    }

    public static final c1 k(e1 e1Var) throws zzhj {
        try {
            d1 d1VarR = e1Var.r();
            if (d1VarR == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte b7 = d1VarR.f11226a;
                byte b10 = d1VarR.f11227b;
                int i10 = 0;
                if (b7 == -128) {
                    long jA = e1Var.a();
                    if (jA > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    l(jA, b10);
                    c1[] c1VarArr = new c1[(int) jA];
                    while (i10 < jA) {
                        c1VarArr[i10] = k(e1Var);
                        i10++;
                    }
                    return new w0(o.m(c1VarArr));
                }
                if (b7 != -96) {
                    if (b7 == -64) {
                        throw new zzhj("Tags are currently unsupported");
                    }
                    if (b7 == -32) {
                        return new x0(e1Var.v());
                    }
                    if (b7 == 0 || b7 == 32) {
                        long jI = e1Var.i();
                        l(jI > 0 ? jI : ~jI, b10);
                        return new z0(jI);
                    }
                    if (b7 == 64) {
                        e1Var.F((byte) 64);
                        byte[] bArrI = e1Var.I();
                        int length = bArrI.length;
                        l(length, b10);
                        return new y0(u0.l(length, bArrI));
                    }
                    if (b7 == 96) {
                        e1Var.F((byte) 96);
                        String str = new String(e1Var.I(), StandardCharsets.UTF_8);
                        l(str.length(), b10);
                        return new b1(str);
                    }
                    throw new zzhj("Unidentifiable major type: " + ((b7 >> 5) & 7));
                }
                long jL = e1Var.l();
                if (jL > 1000) {
                    throw new zzhj("Parser being asked to read a large CBOR map");
                }
                l(jL, b10);
                int i11 = (int) jL;
                h7.b[] bVarArr = new h7.b[i11];
                c1 c1Var = null;
                int i12 = 0;
                while (i12 < jL) {
                    c1 c1VarK = k(e1Var);
                    if (c1Var != null && c1VarK.compareTo(c1Var) <= 0) {
                        throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + c1Var.toString() + "\nCurrent key: " + c1VarK.toString());
                    }
                    bVarArr[i12] = new h7.b(c1VarK, k(e1Var));
                    i12++;
                    c1Var = c1VarK;
                }
                TreeMap treeMap = new TreeMap();
                while (i10 < i11) {
                    h7.b bVar = bVarArr[i10];
                    if (treeMap.containsKey((c1) bVar.A)) {
                        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((c1) bVar.A, (c1) bVar.B);
                    i10++;
                }
                return new a1(t.c(treeMap));
            } catch (IOException | RuntimeException e3) {
                throw new zzhj(e3);
            }
        } catch (IOException e10) {
            throw new zzhj(e10);
        }
    }

    public static final void l(long j9, byte b7) throws zzhf {
        switch (b7) {
            case 24:
                if (j9 < 24) {
                    throw new zzhf(oi.k.i("Integer value ", j9, " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j9 < 256) {
                    throw new zzhf(oi.k.i("Integer value ", j9, " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case RuntimeVersion.MINOR:
                if (j9 < MediaStatus.COMMAND_FOLLOW) {
                    throw new zzhf(oi.k.i("Integer value ", j9, " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j9 < 4294967296L) {
                    throw new zzhf(oi.k.i("Integer value ", j9, " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void m(int i10, int i11, int i12) {
        String strN;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strN = n(i10, "start index", i12);
            } else {
                strN = (i11 < 0 || i11 > i12) ? n(i11, "end index", i12) : c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static String n(int i10, String str, int i11) {
        if (i10 < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(g4.c.f(i11, "negative size: "));
    }
}
