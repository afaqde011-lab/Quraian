package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import java.util.Arrays;

public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new k0(19);
    public final Enum A;

    public l(a aVar) {
        this.A = (Enum) aVar;
    }

    public static l a(int i10) throws COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException {
        a aVar;
        if (i10 != -262) {
            for (x xVar : x.values()) {
                if (xVar.A == i10) {
                    aVar = xVar;
                }
            }
            for (m mVar : m.values()) {
                if (mVar.A == i10) {
                    aVar = mVar;
                }
            }
            throw new COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException(g4.c.i("Algorithm with COSE value ", i10, " not supported"));
        }
        aVar = x.RS1;
        return new l(aVar);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && this.A.a() == ((l) obj).A.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A});
    }

    public final String toString() {
        return a1.b.p("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.A), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A.a());
    }
}
