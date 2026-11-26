package l1;

import android.os.Parcel;
import android.os.Parcelable;

public final class i1 extends z1.a0 implements Parcelable, z1.n {
    public static final Parcelable.Creator<i1> CREATOR = new h1();
    public final k2 B;
    public j2 C;

    public i1(Object obj, k2 k2Var) {
        this.B = k2Var;
        z1.f fVarJ = z1.l.j();
        j2 j2Var = new j2(obj, fVarJ.g());
        if (!(fVarJ instanceof z1.a)) {
            j2Var.f17010b = new j2(obj, 1);
        }
        this.C = j2Var;
    }

    @Override
    public final z1.b0 a() {
        return this.C;
    }

    @Override
    public final z1.b0 c(z1.b0 b0Var, z1.b0 b0Var2, z1.b0 b0Var3) {
        if (this.B.a(((j2) b0Var2).f9878c, ((j2) b0Var3).f9878c)) {
            return b0Var2;
        }
        return null;
    }

    @Override
    public final k2 d() {
        return this.B;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.C = (j2) b0Var;
    }

    @Override
    public final Object getValue() {
        return ((j2) z1.l.t(this.C, this)).f9878c;
    }

    @Override
    public final void setValue(Object obj) {
        z1.f fVarJ;
        j2 j2Var = (j2) z1.l.h(this.C);
        if (this.B.a(j2Var.f9878c, obj)) {
            return;
        }
        j2 j2Var2 = this.C;
        synchronized (z1.l.f17038c) {
            fVarJ = z1.l.j();
            ((j2) z1.l.o(j2Var2, this, fVarJ, j2Var)).f9878c = obj;
        }
        z1.l.n(fVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((j2) z1.l.h(this.C)).f9878c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        c cVar = c.D;
        k2 k2Var = this.B;
        if (kotlin.jvm.internal.m.a(k2Var, cVar)) {
            i11 = 0;
        } else if (kotlin.jvm.internal.m.a(k2Var, c.G)) {
            i11 = 1;
        } else {
            if (!kotlin.jvm.internal.m.a(k2Var, c.E)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
