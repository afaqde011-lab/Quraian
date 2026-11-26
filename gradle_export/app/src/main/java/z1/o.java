package z1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.i0;
import ba.y0;
import p.q2;

public final class o implements Parcelable.ClassLoaderCreator {

    public final int f17047a;

    public o(int i10) {
        this.f17047a = i10;
    }

    public static p a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o.class.getClassLoader();
        }
        int i10 = parcel.readInt();
        if (i10 == 0) {
            return new p();
        }
        r1.f fVarI = r1.i.B.i();
        for (int i11 = 0; i11 < i10; i11++) {
            fVarI.add(parcel.readValue(classLoader));
        }
        return new p(fVarI.e());
    }

    public static v b(Parcel parcel, ClassLoader classLoader) {
        v vVar = new v();
        if (classLoader == null) {
            classLoader = v.class.getClassLoader();
        }
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            vVar.add(parcel.readValue(classLoader));
        }
        return vVar;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f17047a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new i0(parcel, null);
            case 2:
                return new y0(parcel, null);
            case 3:
                return new eg.c(parcel, null);
            case 4:
                return new fg.c(parcel, null);
            case 5:
                return new l4.f(parcel, null);
            case 6:
                return new ng.a(parcel, null);
            case 7:
                if (parcel.readParcelable(null) == null) {
                    return o5.b.B;
                }
                throw new IllegalStateException("superState must be null");
            case 8:
                return new q2(parcel, null);
            case 9:
                return new tg.c(parcel, null);
            case 10:
                return new vg.y(parcel, null);
            default:
                return b(parcel, null);
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f17047a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new i0(parcel, classLoader);
            case 2:
                return new y0(parcel, classLoader);
            case 3:
                return new eg.c(parcel, classLoader);
            case 4:
                return new fg.c(parcel, classLoader);
            case 5:
                return new l4.f(parcel, classLoader);
            case 6:
                return new ng.a(parcel, classLoader);
            case 7:
                if (parcel.readParcelable(classLoader) == null) {
                    return o5.b.B;
                }
                throw new IllegalStateException("superState must be null");
            case 8:
                return new q2(parcel, classLoader);
            case 9:
                return new tg.c(parcel, classLoader);
            case 10:
                return new vg.y(parcel, classLoader);
            default:
                return b(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f17047a) {
            case 0:
                return new p[i10];
            case 1:
                return new i0[i10];
            case 2:
                return new y0[i10];
            case 3:
                return new eg.c[i10];
            case 4:
                return new fg.c[i10];
            case 5:
                return new l4.f[i10];
            case 6:
                return new ng.a[i10];
            case 7:
                return new o5.b[i10];
            case 8:
                return new q2[i10];
            case 9:
                return new tg.c[i10];
            case 10:
                return new vg.y[i10];
            default:
                return new v[i10];
        }
    }
}
