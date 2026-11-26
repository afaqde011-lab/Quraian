package vf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
import java.util.ArrayList;

public final class f implements Parcelable.Creator {

    public final int f15636a;

    public f(int i10) {
        this.f15636a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15636a) {
            case 0:
                int iJ0 = rd.a.j0(parcel);
                ArrayList arrayListU = null;
                String strT = null;
                while (parcel.dataPosition() < iJ0) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        arrayListU = rd.a.u(i10, parcel);
                    } else if (c10 != 2) {
                        rd.a.h0(i10, parcel);
                    } else {
                        strT = rd.a.t(i10, parcel);
                    }
                }
                rd.a.A(iJ0, parcel);
                return new e(strT, arrayListU);
            case 1:
                int iJ1 = rd.a.j0(parcel);
                w wVar = null;
                int iU = 0;
                while (parcel.dataPosition() < iJ1) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        iU = rd.a.U(i11, parcel);
                    } else if (c11 != 2) {
                        rd.a.h0(i11, parcel);
                    } else {
                        wVar = (w) rd.a.s(parcel, i11, w.CREATOR);
                    }
                }
                rd.a.A(iJ1, parcel);
                return new g(iU, wVar);
            default:
                int iJ2 = rd.a.j0(parcel);
                pe.b bVar = null;
                int iU2 = 0;
                x xVar = null;
                while (parcel.dataPosition() < iJ2) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        iU2 = rd.a.U(i12, parcel);
                    } else if (c12 == 2) {
                        bVar = (pe.b) rd.a.s(parcel, i12, pe.b.CREATOR);
                    } else if (c12 != 3) {
                        rd.a.h0(i12, parcel);
                    } else {
                        xVar = (x) rd.a.s(parcel, i12, x.CREATOR);
                    }
                }
                rd.a.A(iJ2, parcel);
                return new h(iU2, bVar, xVar);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f15636a) {
            case 0:
                return new e[i10];
            case 1:
                return new g[i10];
            default:
                return new h[i10];
        }
    }
}
