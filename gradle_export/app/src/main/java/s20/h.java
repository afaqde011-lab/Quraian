package s20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m10.a0;

public final class h {
    public static b a(List list, j10.z zVar, g10.k kVar) {
        List listN1 = h00.q.n1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listN1.iterator();
        while (it.hasNext()) {
            g gVarB = b(it.next(), null);
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return zVar != null ? new y(arrayList, zVar.d().r(kVar)) : new b(new a20.d(kVar, 28), arrayList);
    }

    public static g b(Object obj, a0 a0Var) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e((Character) obj);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c((Boolean) obj);
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        boolean z = obj instanceof byte[];
        ?? R = h00.x.A;
        int i = 0;
        if (z) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    R = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i < length2) {
                        R.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                } else {
                    R = va.a.R(Byte.valueOf(bArr[0]));
                }
            }
            return a(R, a0Var, g10.k.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    R = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i < length4) {
                        R.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    R = va.a.R(Short.valueOf(sArr[0]));
                }
            }
            return a(R, a0Var, g10.k.SHORT);
        }
        if (obj instanceof int[]) {
            return a(h00.n.U0((int[]) obj), a0Var, g10.k.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length5 = jArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    R = new ArrayList(jArr.length);
                    int length6 = jArr.length;
                    while (i < length6) {
                        R.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else {
                    R = va.a.R(Long.valueOf(jArr[0]));
                }
            }
            return a(R, a0Var, g10.k.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    R = new ArrayList(cArr.length);
                    int length8 = cArr.length;
                    while (i < length8) {
                        R.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    R = va.a.R(Character.valueOf(cArr[0]));
                }
            }
            return a(R, a0Var, g10.k.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length9 = fArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    R = new ArrayList(fArr.length);
                    int length10 = fArr.length;
                    while (i < length10) {
                        R.add(Float.valueOf(fArr[i]));
                        i++;
                    }
                } else {
                    R = va.a.R(Float.valueOf(fArr[0]));
                }
            }
            return a(R, a0Var, g10.k.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length11 = dArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    R = new ArrayList(dArr.length);
                    int length12 = dArr.length;
                    while (i < length12) {
                        R.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else {
                    R = va.a.R(Double.valueOf(dArr[0]));
                }
            }
            return a(R, a0Var, g10.k.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new v(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length13 = zArr.length;
        if (length13 != 0) {
            if (length13 != 1) {
                R = new ArrayList(zArr.length);
                int length14 = zArr.length;
                while (i < length14) {
                    R.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                R = va.a.R(Boolean.valueOf(zArr[0]));
            }
        }
        return a(R, a0Var, g10.k.BOOLEAN);
    }
}
