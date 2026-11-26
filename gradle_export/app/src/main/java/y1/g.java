package y1;

import com.google.android.gms.internal.measurement.z3;
import h00.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sd.p1;
import u.i0;
import u.q0;

public final class g implements f {
    public final u00.k A;
    public final i0 B;
    public i0 C;

    public g(Map map, u00.k kVar) {
        i0 i0Var;
        this.A = kVar;
        if (map == null || map.isEmpty()) {
            i0Var = null;
        } else {
            i0Var = new i0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                i0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.B = i0Var;
    }

    @Override
    public final boolean a(Object obj) {
        return ((Boolean) this.A.invoke(obj)).booleanValue();
    }

    @Override
    public final Map b() {
        char c10;
        long j9;
        long j10;
        long j11;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        i0 i0Var = this.B;
        if (i0Var == null && this.C == null) {
            return y.A;
        }
        int i12 = 0;
        int i13 = i0Var != null ? i0Var.f14860e : 0;
        i0 i0Var2 = this.C;
        HashMap map = new HashMap(i13 + (i0Var2 != null ? i0Var2.f14860e : 0));
        char c11 = 7;
        long j12 = -9187201950435737472L;
        int i14 = 8;
        if (i0Var != null) {
            Object[] objArr = i0Var.f14857b;
            Object[] objArr2 = i0Var.f14858c;
            long[] jArr3 = i0Var.f14856a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                j10 = 128;
                while (true) {
                    long j13 = jArr3[i15];
                    j11 = 255;
                    if ((((~j13) << c11) & j13 & j12) != j12) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j13 & 255) < 128) {
                                int i18 = (i15 << 3) + i17;
                                map.put((String) objArr[i18], (List) objArr2[i18]);
                            }
                            j13 >>= 8;
                            i17++;
                            c11 = c11;
                            j12 = j12;
                        }
                        c10 = c11;
                        j9 = j12;
                        if (i16 != 8) {
                            break;
                        }
                    } else {
                        c10 = c11;
                        j9 = j12;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    c11 = c10;
                    j12 = j9;
                }
            } else {
                c10 = 7;
                j9 = -9187201950435737472L;
                j10 = 128;
                j11 = 255;
            }
        } else {
            c10 = 7;
            j9 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        i0 i0Var3 = this.C;
        if (i0Var3 != null) {
            Object[] objArr3 = i0Var3.f14857b;
            Object[] objArr4 = i0Var3.f14858c;
            long[] jArr4 = i0Var3.f14856a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i19 = 0;
                while (true) {
                    long j14 = jArr4[i19];
                    if ((((~j14) << c10) & j14 & j9) != j9) {
                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                        int i21 = i12;
                        while (i21 < i20) {
                            if ((j14 & j11) < j10) {
                                int i22 = (i19 << 3) + i21;
                                Object obj = objArr3[i22];
                                List list = (List) objArr4[i22];
                                String str = (String) obj;
                                i11 = i14;
                                if (list.size() == 1) {
                                    Object objInvoke = ((u00.a) list.get(i12)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            throw new IllegalStateException(k.a(objInvoke).toString());
                                        }
                                        map.put(str, va.a.i(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i12 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((u00.a) list.get(i12)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            throw new IllegalStateException(k.a(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i12++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i11 = i14;
                            }
                            j14 >>= i11;
                            i21++;
                            i14 = i11;
                            jArr4 = jArr2;
                            i12 = 0;
                        }
                        jArr = jArr4;
                        i10 = i14;
                        if (i20 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i10 = i14;
                    }
                    if (i19 == length2) {
                        break;
                    }
                    i19++;
                    i14 = i10;
                    jArr4 = jArr;
                    i12 = 0;
                }
            }
        }
        return map;
    }

    @Override
    public final Object c(String str) {
        i0 i0Var = this.B;
        List list = i0Var != null ? (List) i0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && i0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = i0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = i0Var.f14858c;
            Object obj = objArr[iF];
            i0Var.f14857b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override
    public final e d(String str, u00.a aVar) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!z3.J(str.charAt(i10))) {
                i0 i0Var = this.C;
                if (i0Var == null) {
                    long[] jArr = q0.f14885a;
                    i0Var = new i0();
                    this.C = i0Var;
                }
                Object objG = i0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    i0Var.m(str, objG);
                }
                ((List) objG).add(aVar);
                return new p1(i0Var, str, aVar, 23);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
