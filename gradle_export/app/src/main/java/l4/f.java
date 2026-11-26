package l4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import z1.o;

public final class f extends o5.b {
    public static final Parcelable.Creator<f> CREATOR = new o(5);
    public SparseArray C;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.C = new SparseArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.C.append(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        SparseArray sparseArray = this.C;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.C.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.C.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
