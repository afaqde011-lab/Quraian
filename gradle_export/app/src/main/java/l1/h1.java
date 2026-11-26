package l1;

import android.os.Parcel;
import android.os.Parcelable;

public final class h1 implements Parcelable.ClassLoaderCreator {
    public static i1 a(Parcel parcel, ClassLoader classLoader) {
        c cVar;
        if (classLoader == null) {
            classLoader = h1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            cVar = c.D;
        } else if (i10 == 1) {
            cVar = c.G;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(g4.c.i("Unsupported MutableState policy ", i10, " was restored"));
            }
            cVar = c.E;
        }
        return new i1(value, cVar);
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override
    public final Object[] newArray(int i10) {
        return new i1[i10];
    }
}
