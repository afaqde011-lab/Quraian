package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class y0 implements Iterator {
    public final int A;
    public int B;
    public boolean C;
    public Iterator D;
    public final AbstractMap E;

    public y0(h6 h6Var) {
        this.A = 1;
        Objects.requireNonNull(h6Var);
        this.E = h6Var;
        this.B = -1;
    }

    public y0(t2 t2Var) {
        this.A = 2;
        Objects.requireNonNull(t2Var);
        this.E = t2Var;
        this.B = -1;
    }

    public y0(AbstractMap abstractMap, int i10) {
        this.A = i10;
        this.E = abstractMap;
        this.B = -1;
    }

    public Iterator a() {
        switch (this.A) {
            case 0:
                if (this.D == null) {
                    this.D = ((w0) this.E).B.entrySet().iterator();
                }
                break;
            default:
                if (this.D == null) {
                    this.D = this.E.C.entrySet().iterator();
                }
                break;
        }
        return this.D;
    }

    public Iterator b() {
        switch (this.A) {
            case 1:
                if (this.D == null) {
                    this.D = ((h6) this.E).C.entrySet().iterator();
                }
                break;
            default:
                if (this.D == null) {
                    this.D = ((t2) this.E).C.entrySet().iterator();
                }
                break;
        }
        return this.D;
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                int i10 = this.B + 1;
                w0 w0Var = (w0) this.E;
                if (i10 >= w0Var.A.size()) {
                    return !w0Var.B.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                int i11 = this.B + 1;
                h6 h6Var = (h6) this.E;
                if (i11 >= h6Var.B) {
                    return !h6Var.C.isEmpty() && b().hasNext();
                }
                return true;
            case 2:
                int i12 = this.B + 1;
                t2 t2Var = (t2) this.E;
                if (i12 >= t2Var.B) {
                    return !t2Var.C.isEmpty() && b().hasNext();
                }
                return true;
            default:
                return this.B + 1 < this.E.B.size() || a().hasNext();
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                this.C = true;
                int i10 = this.B + 1;
                this.B = i10;
                w0 w0Var = (w0) this.E;
                return i10 < w0Var.A.size() ? (Map.Entry) w0Var.A.get(this.B) : (Map.Entry) a().next();
            case 1:
                this.C = true;
                int i11 = this.B + 1;
                this.B = i11;
                h6 h6Var = (h6) this.E;
                return i11 < h6Var.B ? (i6) h6Var.A[i11] : (Map.Entry) b().next();
            case 2:
                this.C = true;
                int i12 = this.B + 1;
                this.B = i12;
                t2 t2Var = (t2) this.E;
                return i12 < t2Var.B ? (u2) t2Var.A[i12] : (Map.Entry) b().next();
            default:
                this.C = true;
                int i13 = this.B + 1;
                this.B = i13;
                o20.z zVar = this.E;
                return i13 < zVar.B.size() ? (Map.Entry) zVar.B.get(this.B) : (Map.Entry) a().next();
        }
    }

    @Override
    public final void remove() {
        int i10 = this.A;
        o20.z zVar = this.E;
        switch (i10) {
            case 0:
                w0 w0Var = (w0) zVar;
                if (!this.C) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.C = false;
                int i11 = w0.F;
                w0Var.c();
                if (this.B >= w0Var.A.size()) {
                    a().remove();
                    return;
                }
                int i12 = this.B;
                this.B = i12 - 1;
                w0Var.i(i12);
                return;
            case 1:
                if (!this.C) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.C = false;
                h6 h6Var = (h6) zVar;
                h6Var.g();
                int i13 = this.B;
                if (i13 >= h6Var.B) {
                    b().remove();
                    return;
                } else {
                    this.B = i13 - 1;
                    h6Var.e(i13);
                    return;
                }
            case 2:
                if (!this.C) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.C = false;
                t2 t2Var = (t2) zVar;
                int i14 = t2.G;
                t2Var.g();
                int i15 = this.B;
                if (i15 >= t2Var.B) {
                    b().remove();
                    return;
                }
                this.B = i15 - 1;
                t2Var.g();
                Object[] objArr = t2Var.A;
                Object obj = ((u2) objArr[i15]).A;
                System.arraycopy(objArr, i15 + 1, objArr, i15, (t2Var.B - i15) - 1);
                t2Var.B--;
                if (t2Var.C.isEmpty()) {
                    return;
                }
                Iterator it = t2Var.f().entrySet().iterator();
                Object[] objArr2 = t2Var.A;
                int i16 = t2Var.B;
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                objArr2[i16] = new u2(t2Var, entry.getValue());
                t2Var.B++;
                it.remove();
                return;
            default:
                o20.z zVar2 = zVar;
                if (!this.C) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.C = false;
                int i17 = o20.z.F;
                zVar2.c();
                if (this.B >= zVar2.B.size()) {
                    a().remove();
                    return;
                }
                int i18 = this.B;
                this.B = i18 - 1;
                zVar2.g(i18);
                return;
        }
    }
}
