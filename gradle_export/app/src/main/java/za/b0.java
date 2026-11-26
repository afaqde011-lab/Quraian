package za;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b0 {

    public static final a0 f17348b = new a0(1);

    public static final a0 f17349c = new a0(0);

    public final Object f17350a;

    public b0() {
        this.f17350a = new LinkedHashMap();
    }

    public b0(androidx.lifecycle.f0 f0Var, d4.k kVar) {
        this.f17350a = kVar;
    }

    public g a() {
        g gVar = new g((LinkedHashMap) this.f17350a);
        kh.n.f0(gVar);
        return gVar;
    }

    public void b(Object obj, String str) {
        Object[] objArr;
        kotlin.jvm.internal.m.e(str, "key");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f17350a;
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            a10.d dVarB = b0Var.b(cls);
            if (!dVarB.equals(b0Var.b(Boolean.TYPE)) && !dVarB.equals(b0Var.b(Byte.TYPE)) && !dVarB.equals(b0Var.b(Integer.TYPE)) && !dVarB.equals(b0Var.b(Long.TYPE)) && !dVarB.equals(b0Var.b(Float.TYPE)) && !dVarB.equals(b0Var.b(Double.TYPE)) && !dVarB.equals(b0Var.b(String.class)) && !dVarB.equals(b0Var.b(Boolean[].class)) && !dVarB.equals(b0Var.b(Byte[].class)) && !dVarB.equals(b0Var.b(Integer[].class)) && !dVarB.equals(b0Var.b(Long[].class)) && !dVarB.equals(b0Var.b(Float[].class)) && !dVarB.equals(b0Var.b(Double[].class)) && !dVarB.equals(b0Var.b(String[].class))) {
                int i10 = 0;
                if (dVarB.equals(b0Var.b(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = h.f17369a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i10 < length) {
                        objArr[i10] = Boolean.valueOf(zArr[i10]);
                        i10++;
                    }
                } else if (dVarB.equals(b0Var.b(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = h.f17369a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i10 < length2) {
                        objArr[i10] = Byte.valueOf(bArr[i10]);
                        i10++;
                    }
                } else if (dVarB.equals(b0Var.b(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = h.f17369a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i10 < length3) {
                        objArr[i10] = Integer.valueOf(iArr[i10]);
                        i10++;
                    }
                } else if (dVarB.equals(b0Var.b(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = h.f17369a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i10 < length4) {
                        objArr[i10] = Long.valueOf(jArr[i10]);
                        i10++;
                    }
                } else if (dVarB.equals(b0Var.b(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = h.f17369a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i10 < length5) {
                        objArr[i10] = Float.valueOf(fArr[i10]);
                        i10++;
                    }
                } else {
                    if (!dVarB.equals(b0Var.b(double[].class))) {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + dVarB);
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = h.f17369a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i10 < length6) {
                        objArr[i10] = Double.valueOf(dArr[i10]);
                        i10++;
                    }
                }
                obj = objArr;
            }
        }
        linkedHashMap.put(str, obj);
    }

    public void c(HashMap map) {
        kotlin.jvm.internal.m.e(map, "values");
        for (Map.Entry entry : map.entrySet()) {
            b(entry.getValue(), (String) entry.getKey());
        }
    }
}
