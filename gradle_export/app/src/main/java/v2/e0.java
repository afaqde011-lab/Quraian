package v2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b3.e1;
import c3.d2;
import c3.y2;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv2/e0;", "Lb3/e1;", "Lv2/j0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 extends e1 {
    public final Object B;
    public final Object C;
    public final Object[] D;
    public final PointerInputEventHandler E;

    public e0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i10) {
        obj = (i10 & 1) != 0 ? null : obj;
        obj2 = (i10 & 2) != 0 ? null : obj2;
        objArr = (i10 & 4) != 0 ? null : objArr;
        this.B = obj;
        this.C = obj2;
        this.D = objArr;
        this.E = pointerInputEventHandler;
    }

    @Override
    public final b2.q d() {
        return new j0(this.B, this.C, this.D, this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        Object[] objArr = e0Var.D;
        if (!kotlin.jvm.internal.m.a(this.B, e0Var.B) || !kotlin.jvm.internal.m.a(this.C, e0Var.C)) {
            return false;
        }
        Object[] objArr2 = this.D;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.E == e0Var.E;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "pointerInput";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "key1");
        y2Var.c(this.C, "key2");
        y2Var.c(this.D, "keys");
        y2Var.c(this.E, "pointerInputEventHandler");
    }

    public final int hashCode() {
        Object obj = this.B;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.C;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.D;
        return this.E.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        j0 j0Var = (j0) qVar;
        Object obj = j0Var.O;
        Object obj2 = this.B;
        boolean z10 = !kotlin.jvm.internal.m.a(obj, obj2);
        j0Var.O = obj2;
        Object obj3 = j0Var.P;
        Object obj4 = this.C;
        if (!kotlin.jvm.internal.m.a(obj3, obj4)) {
            z10 = true;
        }
        j0Var.P = obj4;
        Object[] objArr = j0Var.Q;
        Object[] objArr2 = this.D;
        if (objArr != null && objArr2 == null) {
            z10 = true;
        }
        if (objArr == null && objArr2 != null) {
            z10 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z10 = true;
        }
        j0Var.Q = objArr2;
        Class<?> cls = j0Var.R.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.E;
        if (cls == pointerInputEventHandler.getClass() ? z10 : true) {
            j0Var.D1();
        }
        j0Var.R = pointerInputEventHandler;
    }
}
