package l1;

import android.os.Parcel;
import android.os.Parcelable;

public final class f1 extends z1.a0 implements Parcelable, y0, z1.n {
    public static final Parcelable.Creator<f1> CREATOR = new d1(1);
    public h2 B;

    public f1(int i10) {
        z1.f fVarJ = z1.l.j();
        h2 h2Var = new h2(fVarJ.g(), i10);
        if (!(fVarJ instanceof z1.a)) {
            h2Var.f17010b = new h2(1, i10);
        }
        this.B = h2Var;
    }

    @Override
    public final z1.b0 a() {
        return this.B;
    }

    @Override
    public final z1.b0 c(z1.b0 b0Var, z1.b0 b0Var2, z1.b0 b0Var3) {
        if (((h2) b0Var2).f9867c == ((h2) b0Var3).f9867c) {
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
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.B = (h2) b0Var;
    }

    public final int h() {
        return ((h2) z1.l.t(this.B, this)).f9867c;
    }

    public final void i(int i10) {
        z1.f fVarJ;
        h2 h2Var = (h2) z1.l.h(this.B);
        if (h2Var.f9867c != i10) {
            h2 h2Var2 = this.B;
            synchronized (z1.l.f17038c) {
                fVarJ = z1.l.j();
                ((h2) z1.l.o(h2Var2, this, fVarJ, h2Var)).f9867c = i10;
            }
            z1.l.n(fVarJ, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((h2) z1.l.h(this.B)).f9867c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(h());
    }
}
