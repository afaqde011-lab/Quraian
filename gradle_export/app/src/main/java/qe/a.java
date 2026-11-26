package qe;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import java.util.Arrays;
import java.util.Locale;
import le.b;
import oi.k;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;

public final class a extends re.a {
    public static final Parcelable.Creator<a> CREATOR = new b(15);
    public final int A;
    public final Uri B;
    public final int C;
    public final int D;

    public a(int i10, Uri uri, int i11, int i12) {
        this.A = i10;
        this.B = uri;
        this.C = i11;
        this.D = i12;
    }

    public a(Uri uri, int i10, int i11) {
        this(1, uri, i10, i11);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public a(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (d0.k(this.B, aVar.B) && this.C == aVar.C && this.D == aVar.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.B, Integer.valueOf(this.C), Integer.valueOf(this.D)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String string = this.B.toString();
        StringBuilder sbP = k.p(this.C, this.D, "Image ", "x", " ");
        sbP.append(string);
        return sbP.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A);
        t1.a0(parcel, 2, this.B, i10);
        t1.f0(parcel, 3, 4);
        parcel.writeInt(this.C);
        t1.f0(parcel, 4, 4);
        parcel.writeInt(this.D);
        t1.h0(iG0, parcel);
    }
}
