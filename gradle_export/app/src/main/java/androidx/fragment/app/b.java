package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new ah.c(5);
    public final int[] A;
    public final ArrayList B;
    public final int[] C;
    public final int[] D;
    public final int E;
    public final String F;
    public final int G;
    public final int H;
    public final CharSequence I;
    public final int J;
    public final CharSequence K;
    public final ArrayList L;
    public final ArrayList M;
    public final boolean N;

    public b(Parcel parcel) {
        this.A = parcel.createIntArray();
        this.B = parcel.createStringArrayList();
        this.C = parcel.createIntArray();
        this.D = parcel.createIntArray();
        this.E = parcel.readInt();
        this.F = parcel.readString();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.I = (CharSequence) creator.createFromParcel(parcel);
        this.J = parcel.readInt();
        this.K = (CharSequence) creator.createFromParcel(parcel);
        this.L = parcel.createStringArrayList();
        this.M = parcel.createStringArrayList();
        this.N = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f832a.size();
        this.A = new int[size * 6];
        if (!aVar.f838g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.B = new ArrayList(size);
        this.C = new int[size];
        this.D = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            s1 s1Var = (s1) aVar.f832a.get(i11);
            int i12 = i10 + 1;
            this.A[i10] = s1Var.f823a;
            ArrayList arrayList = this.B;
            j0 j0Var = s1Var.f824b;
            arrayList.add(j0Var != null ? j0Var.mWho : null);
            int[] iArr = this.A;
            iArr[i12] = s1Var.f825c ? 1 : 0;
            iArr[i10 + 2] = s1Var.f826d;
            iArr[i10 + 3] = s1Var.f827e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = s1Var.f828f;
            i10 += 6;
            iArr[i13] = s1Var.f829g;
            this.C[i11] = s1Var.f830h.ordinal();
            this.D[i11] = s1Var.f831i.ordinal();
        }
        this.E = aVar.f837f;
        this.F = aVar.f839h;
        this.G = aVar.f688s;
        this.H = aVar.f840i;
        this.I = aVar.f841j;
        this.J = aVar.f842k;
        this.K = aVar.l;
        this.L = aVar.m;
        this.M = aVar.f843n;
        this.N = aVar.f844o;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.A);
        parcel.writeStringList(this.B);
        parcel.writeIntArray(this.C);
        parcel.writeIntArray(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        TextUtils.writeToParcel(this.I, parcel, 0);
        parcel.writeInt(this.J);
        TextUtils.writeToParcel(this.K, parcel, 0);
        parcel.writeStringList(this.L);
        parcel.writeStringList(this.M);
        parcel.writeInt(this.N ? 1 : 0);
    }
}
