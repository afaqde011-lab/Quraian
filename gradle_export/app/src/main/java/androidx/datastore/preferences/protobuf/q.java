package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class q {

    public static final int f669c = 0;

    public final w0 f670a = w0.g();

    public boolean f671b;

    static {
        new q(0);
    }

    public q() {
    }

    public q(int i10) {
        a();
        a();
    }

    public static void b(l lVar, p1 p1Var, int i10, Object obj) {
        if (p1Var == p1.D) {
            lVar.o0(i10, 3);
            ((a) obj).b(lVar);
            lVar.o0(i10, 4);
        }
        lVar.o0(i10, p1Var.B);
        switch (p1Var.ordinal()) {
            case 0:
                lVar.i0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                lVar.g0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                lVar.s0(((Long) obj).longValue());
                break;
            case 3:
                lVar.s0(((Long) obj).longValue());
                break;
            case 4:
                lVar.k0(((Integer) obj).intValue());
                break;
            case 5:
                lVar.i0(((Long) obj).longValue());
                break;
            case 6:
                lVar.g0(((Integer) obj).intValue());
                break;
            case 7:
                lVar.a0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof g)) {
                    lVar.n0((String) obj);
                } else {
                    lVar.e0((g) obj);
                }
                break;
            case 9:
                ((a) obj).b(lVar);
                break;
            case 10:
                a aVar = (a) obj;
                lVar.getClass();
                lVar.q0(((v) aVar).a(null));
                aVar.b(lVar);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    lVar.q0(length);
                    lVar.b0(bArr, 0, length);
                } else {
                    lVar.e0((g) obj);
                }
                break;
            case 12:
                lVar.q0(((Integer) obj).intValue());
                break;
            case 13:
                lVar.k0(((Integer) obj).intValue());
                break;
            case 14:
                lVar.g0(((Integer) obj).intValue());
                break;
            case 15:
                lVar.i0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                lVar.q0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                lVar.s0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f671b) {
            return;
        }
        w0 w0Var = this.f670a;
        int size = w0Var.A.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry entryD = w0Var.d(i10);
            if (entryD.getValue() instanceof v) {
                v vVar = (v) entryD.getValue();
                vVar.getClass();
                r0 r0Var = r0.f672c;
                r0Var.getClass();
                r0Var.a(vVar.getClass()).makeImmutable(vVar);
                vVar.h();
            }
        }
        if (!w0Var.C) {
            if (w0Var.A.size() > 0) {
                w0Var.d(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = w0Var.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!w0Var.C) {
            w0Var.B = w0Var.B.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(w0Var.B);
            w0Var.E = w0Var.E.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(w0Var.E);
            w0Var.C = true;
        }
        this.f671b = true;
    }

    public final Object clone() {
        q qVar = new q();
        w0 w0Var = this.f670a;
        if (w0Var.A.size() > 0) {
            Map.Entry entryD = w0Var.d(0);
            if (entryD.getKey() != null) {
                throw new ClassCastException();
            }
            entryD.getValue();
            throw null;
        }
        Iterator it = w0Var.e().iterator();
        if (!it.hasNext()) {
            return qVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f670a.equals(((q) obj).f670a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f670a.hashCode();
    }
}
