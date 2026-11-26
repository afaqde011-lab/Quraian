package o20;

import com.google.android.gms.internal.play_billing.q1;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class i {
    public static final i c = new i(0);
    public final z a = new z(16);
    public boolean b;

    public i() {
    }

    public i(int i) {
        f();
    }

    public static int c(l0 l0Var, Object obj) {
        switch (l0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return q1.s(((Long) obj).longValue());
            case 3:
                return q1.s(((Long) obj).longValue());
            case 4:
                return q1.o(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return q1.r(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((b) obj).a();
            case 10:
                return q1.q((b) obj);
            case 11:
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return eVar.size() + q1.r(eVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return q1.r(bArr.length) + bArr.length;
            case 12:
                return q1.r(((Integer) obj).intValue());
            case 13:
                return obj instanceof p ? q1.o(((p) obj).getNumber()) : q1.o(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                int iIntValue = ((Integer) obj).intValue();
                return q1.r((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return q1.s((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(m mVar, Object obj) {
        l0 l0Var = mVar.B;
        int i = mVar.A;
        if (!mVar.C) {
            int iT = q1.t(i);
            if (l0Var == l0.E) {
                iT *= 2;
            }
            return c(l0Var, obj) + iT;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iT2 = q1.t(i);
            if (l0Var == l0.E) {
                iT2 *= 2;
            }
            iC += c(l0Var, obj2) + iT2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        m mVar = (m) entry.getKey();
        if (mVar.B.A != m0.MESSAGE) {
            return true;
        }
        if (!mVar.C) {
            Object value = entry.getValue();
            if (value instanceof b) {
                return ((b) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((b) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(f fVar, l0 l0Var) {
        switch (l0Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(fVar.k()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(fVar.j()));
            case 2:
                return Long.valueOf(fVar.m());
            case 3:
                return Long.valueOf(fVar.m());
            case 4:
                return Integer.valueOf(fVar.l());
            case 5:
                return Long.valueOf(fVar.k());
            case 6:
                return Integer.valueOf(fVar.j());
            case 7:
                return Boolean.valueOf(fVar.m() != 0);
            case 8:
                int iL = fVar.l();
                int i = fVar.b;
                int i2 = fVar.d;
                if (iL > i - i2 || iL <= 0) {
                    return iL == 0 ? "" : new String(fVar.i(iL), "UTF-8");
                }
                String str = new String(fVar.a, i2, iL, "UTF-8");
                fVar.d += iL;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return fVar.f();
            case 12:
                return Integer.valueOf(fVar.l());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(fVar.j());
            case 15:
                return Long.valueOf(fVar.k());
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                int iL2 = fVar.l();
                return Integer.valueOf((-(iL2 & 1)) ^ (iL2 >>> 1));
            case 17:
                long jM = fVar.m();
                return Long.valueOf((-(jM & 1)) ^ (jM >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void j(l0 l0Var, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (l0Var.A) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof e) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof p)) {
                    z = false;
                }
                z2 = z;
                break;
            case MESSAGE:
                z2 = obj instanceof b;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(q1 q1Var, l0 l0Var, Object obj) throws UnsupportedEncodingException {
        switch (l0Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                q1Var.getClass();
                q1Var.m0(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                q1Var.getClass();
                q1Var.l0(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                q1Var.o0(((Long) obj).longValue());
                break;
            case 3:
                q1Var.o0(((Long) obj).longValue());
                break;
            case 4:
                q1Var.f0(((Integer) obj).intValue());
                break;
            case 5:
                q1Var.m0(((Long) obj).longValue());
                break;
            case 6:
                q1Var.l0(((Integer) obj).intValue());
                break;
            case 7:
                q1Var.i0(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                q1Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                q1Var.n0(bytes.length);
                q1Var.k0(bytes);
                break;
            case 9:
                q1Var.getClass();
                ((b) obj).d(q1Var);
                break;
            case 10:
                q1Var.h0((b) obj);
                break;
            case 11:
                if (!(obj instanceof e)) {
                    byte[] bArr = (byte[]) obj;
                    q1Var.getClass();
                    q1Var.n0(bArr.length);
                    q1Var.k0(bArr);
                } else {
                    e eVar = (e) obj;
                    q1Var.getClass();
                    q1Var.n0(eVar.size());
                    q1Var.j0(eVar);
                }
                break;
            case 12:
                q1Var.n0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof p)) {
                    q1Var.f0(((Integer) obj).intValue());
                } else {
                    q1Var.f0(((p) obj).getNumber());
                }
                break;
            case 14:
                q1Var.l0(((Integer) obj).intValue());
                break;
            case 15:
                q1Var.m0(((Long) obj).longValue());
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                int iIntValue = ((Integer) obj).intValue();
                q1Var.n0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                q1Var.o0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(m mVar, Object obj) {
        List arrayList;
        if (!mVar.C) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(mVar.B, obj);
        z zVar = this.a;
        Object obj2 = zVar.get(mVar);
        if (obj2 == null) {
            arrayList = new ArrayList();
            zVar.put(mVar, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    public final i clone() {
        z zVar;
        i iVar = new i();
        int i = 0;
        while (true) {
            zVar = this.a;
            if (i >= zVar.B.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) zVar.B.get(i);
            iVar.i((m) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : zVar.d()) {
            iVar.i((m) entry2.getKey(), entry2.getValue());
        }
        return iVar;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        z zVar = this.a;
        if (!zVar.D) {
            for (int i = 0; i < zVar.B.size(); i++) {
                Map.Entry entry = (Map.Entry) zVar.B.get(i);
                if (((m) entry.getKey()).C) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : zVar.d()) {
                if (((m) entry2.getKey()).C) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!zVar.D) {
            zVar.C = zVar.C.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(zVar.C);
            zVar.D = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        m mVar = (m) entry.getKey();
        Object value = entry.getValue();
        boolean z = mVar.C;
        z zVar = this.a;
        if (z) {
            Object arrayList = zVar.get(mVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            zVar.put(mVar, arrayList);
            return;
        }
        if (mVar.B.A != m0.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            zVar.put(mVar, value);
            return;
        }
        Object obj2 = zVar.get(mVar);
        if (obj2 != null) {
            zVar.put(mVar, ((b) obj2).c().c((o) ((b) value)).a());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        zVar.put(mVar, value);
    }

    public final void i(m mVar, Object obj) {
        boolean z = mVar.C;
        l0 l0Var = mVar.B;
        if (!z) {
            j(l0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(l0Var, it.next());
            }
            obj = arrayList;
        }
        this.a.put(mVar, obj);
    }
}
