package l1;

import android.os.Parcel;
import android.os.Parcelable;

public final class g1 extends z1.a0 implements Parcelable, z1.n, z0, p2 {
    public static final Parcelable.Creator<g1> CREATOR = new d1(2);
    public i2 B;

    public g1(long j9) {
        z1.f fVarJ = z1.l.j();
        i2 i2Var = new i2(fVarJ.g(), j9);
        if (!(fVarJ instanceof z1.a)) {
            i2Var.f17010b = new i2(1, j9);
        }
        this.B = i2Var;
    }

    @Override
    public final z1.b0 a() {
        return this.B;
    }

    @Override
    public final z1.b0 c(z1.b0 b0Var, z1.b0 b0Var2, z1.b0 b0Var3) {
        if (((i2) b0Var2).f9875c == ((i2) b0Var3).f9875c) {
            return b0Var2;
        }
        return null;
    }

    @Override
    public final k2 d() {
        return c.G;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void e(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.B = (i2) b0Var;
    }

    @Override
    public Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((i2) z1.l.t(this.B, this)).f9875c;
    }

    public final void i(long j9) {
        z1.f fVarJ;
        i2 i2Var = (i2) z1.l.h(this.B);
        if (i2Var.f9875c != j9) {
            i2 i2Var2 = this.B;
            synchronized (z1.l.f17038c) {
                fVarJ = z1.l.j();
                ((i2) z1.l.o(i2Var2, this, fVarJ, i2Var)).f9875c = j9;
            }
            z1.l.n(fVarJ, this);
        }
    }

    @Override
    public void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((i2) z1.l.h(this.B)).f9875c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(h());
    }
}
