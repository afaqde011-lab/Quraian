package h00;

import c3.y2;
import com.google.android.gms.internal.measurement.g4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import ri.t1;

public abstract class n extends t1 {
    public static void A0(int[] iArr, int i) {
        int length = iArr.length;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i);
    }

    public static void B0(long[] jArr, long j) {
        int length = jArr.length;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static List C0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object D0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object E0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static z00.e F0(int[] iArr) {
        return new z00.e(0, iArr.length - 1, 1);
    }

    public static int G0(long[] jArr) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Integer H0(int[] iArr, int i) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object I0(int i, Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int J0(Object obj, Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void K0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, u00.k kVar) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            g4.q(sb, obj, kVar);
        }
        sb.append(charSequence3);
    }

    public static String L0(byte[] bArr, String str, u00.k kVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        int i2 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            kVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (kVar != null) {
                sb.append((CharSequence) kVar.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String M0(Object[] objArr, String str, String str2, String str3, u00.k kVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        if ((i & 32) != 0) {
            kVar = null;
        }
        kotlin.jvm.internal.m.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        K0(objArr, sb, str4, str2, str3, "...", kVar);
        return sb.toString();
    }

    public static Object N0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int O0(Object obj, Object[] objArr) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static byte[] P0(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.m.b(bArrCopyOf);
        return bArrCopyOf;
    }

    public static char Q0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object R0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List S0(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.d(objArr, "copyOf(...)");
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return k0(objArr);
    }

    public static final void T0(Object[] objArr, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List U0(int[] iArr) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return x.A;
        }
        if (length == 1) {
            return va.a.R(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List V0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return x.A;
        }
        if (length == 1) {
            return va.a.R(objArr[0]);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        return k0(objArrCopyOf);
    }

    public static Set W0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return z.A;
        }
        if (length == 1) {
            return w50.c.g0(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(d0.P(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    public static Set X0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return z.A;
        }
        if (length == 1) {
            return w50.c.g0(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(d0.P(objArr.length));
        T0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList Y0(Object[] objArr, Object[] other) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new g00.k(objArr[i], other[i]));
        }
        return arrayList;
    }

    public static Iterable j0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return objArr.length == 0 ? x.A : new p(objArr, 0);
    }

    public static List k0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.m.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static q30.j l0(Object[] objArr) {
        return objArr.length == 0 ? q30.d.a : new y2(objArr, 1);
    }

    public static boolean m0(Object obj, Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return J0(obj, objArr) >= 0;
    }

    public static boolean n0(int[] iArr, int i) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean o0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!o0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof g00.t) && (obj2 instanceof g00.t)) {
                            if (!Arrays.equals(((g00.t) obj).A, ((g00.t) obj2).A)) {
                            }
                        } else if ((obj instanceof g00.a0) && (obj2 instanceof g00.a0)) {
                            if (!Arrays.equals(((g00.a0) obj).A, ((g00.a0) obj2).A)) {
                            }
                        } else if ((obj instanceof g00.v) && (obj2 instanceof g00.v)) {
                            if (!Arrays.equals(((g00.v) obj).A, ((g00.v) obj2).A)) {
                            }
                        } else if ((obj instanceof g00.x) && (obj2 instanceof g00.x)) {
                            if (!Arrays.equals(((g00.x) obj).A, ((g00.x) obj2).A)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void p0(int i, int i2, int i3, int[] iArr, int[] destination) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
    }

    public static void q0(int i, int i2, int i3, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(objArr, i2, destination, i, i3 - i2);
    }

    public static void r0(byte[] bArr, int i, byte[] destination, int i2, int i3) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(bArr, i2, destination, i, i3 - i2);
    }

    public static void s0(char[] cArr, char[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.m.e(cArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(cArr, i2, destination, i, i3 - i2);
    }

    public static void t0(long[] jArr, long[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(jArr, i2, destination, i, i3 - i2);
    }

    public static void u0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        p0(i, 0, i2, iArr, iArr2);
    }

    public static void v0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        q0(0, i, i2, objArr, objArr2);
    }

    public static byte[] w0(int i, int i2, byte[] bArr) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        t1.r(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        kotlin.jvm.internal.m.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] x0(Object[] objArr, int i, int i2) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        t1.r(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        kotlin.jvm.internal.m.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void y0(int i, int i2, Object obj, Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }
}
