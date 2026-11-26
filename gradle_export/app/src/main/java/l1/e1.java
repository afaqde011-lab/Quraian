package l1;

import android.os.Parcel;
import android.os.Parcelable;

public final class e1 extends z1.a0 implements Parcelable, z1.n, z0, p2 {
    public static final Parcelable.Creator<e1> CREATOR = new d1(0);
    public g2 B;

    public e1(float f3) {
        z1.f fVarJ = z1.l.j();
        g2 g2Var = new g2(f3, fVarJ.g());
        if (!(fVarJ instanceof z1.a)) {
            g2Var.f17010b = new g2(f3, 1);
        }
        this.B = g2Var;
    }

    @Override
    public final z1.b0 a() {
        return this.B;
    }

    @Override
    public final z1.b0 c(z1.b0 b0Var, z1.b0 b0Var2, z1.b0 b0Var3) {
        if (((g2) b0Var2).f9866c == ((g2) b0Var3).f9866c) {
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
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.B = (g2) b0Var;
    }

    @Override
    public Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((g2) z1.l.t(this.B, this)).f9866c;
    }

    public final void i(float f3) {
        z1.f fVarJ;
        g2 g2Var = (g2) z1.l.h(this.B);
        if (g2Var.f9866c == f3) {
            return;
        }
        g2 g2Var2 = this.B;
        synchronized (z1.l.f17038c) {
            fVarJ = z1.l.j();
            ((g2) z1.l.o(g2Var2, this, fVarJ, g2Var)).f9866c = f3;
        }
        z1.l.n(fVarJ, this);
    }

    @Override
    public void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((g2) z1.l.h(this.B)).f9866c + ")@" + hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(h());
    }
}
