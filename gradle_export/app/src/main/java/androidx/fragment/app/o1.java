package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.Cast;

public final class o1 implements Parcelable {
    public static final Parcelable.Creator<o1> CREATOR = new ah.c(9);
    public final String A;
    public final String B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;
    public final String G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final int L;
    public final String M;
    public final int N;
    public final boolean O;

    public o1(Parcel parcel) {
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readInt() != 0;
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readString();
        this.H = parcel.readInt() != 0;
        this.I = parcel.readInt() != 0;
        this.J = parcel.readInt() != 0;
        this.K = parcel.readInt() != 0;
        this.L = parcel.readInt();
        this.M = parcel.readString();
        this.N = parcel.readInt();
        this.O = parcel.readInt() != 0;
    }

    public o1(j0 j0Var) {
        this.A = j0Var.getClass().getName();
        this.B = j0Var.mWho;
        this.C = j0Var.mFromLayout;
        this.D = j0Var.mInDynamicContainer;
        this.E = j0Var.mFragmentId;
        this.F = j0Var.mContainerId;
        this.G = j0Var.mTag;
        this.H = j0Var.mRetainInstance;
        this.I = j0Var.mRemoving;
        this.J = j0Var.mDetached;
        this.K = j0Var.mHidden;
        this.L = j0Var.mMaxState.ordinal();
        this.M = j0Var.mTargetWho;
        this.N = j0Var.mTargetRequestCode;
        this.O = j0Var.mUserVisibleHint;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Cast.MAX_NAMESPACE_LENGTH);
        sb2.append("FragmentState{");
        sb2.append(this.A);
        sb2.append(" (");
        sb2.append(this.B);
        sb2.append(")}:");
        if (this.C) {
            sb2.append(" fromLayout");
        }
        if (this.D) {
            sb2.append(" dynamicContainer");
        }
        int i10 = this.F;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.G;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.H) {
            sb2.append(" retainInstance");
        }
        if (this.I) {
            sb2.append(" removing");
        }
        if (this.J) {
            sb2.append(" detached");
        }
        if (this.K) {
            sb2.append(" hidden");
        }
        String str2 = this.M;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.N);
        }
        if (this.O) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L);
        parcel.writeString(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O ? 1 : 0);
    }
}
