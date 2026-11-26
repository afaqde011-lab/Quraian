package ub;

import android.os.Parcel;
import android.os.Parcelable;
import h00.y;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class b implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<b> CREATOR = new le.b(27);
    public final String A;
    public final Map B;

    public b(String str) {
        this(str, y.A);
    }

    public b(String str, Map map) {
        this.A = str;
        this.B = map;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.A, bVar.A) && m.a(this.B, bVar.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + (this.A.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(key=");
        sb2.append(this.A);
        sb2.append(", extras=");
        return w.c.m(sb2, this.B, ')');
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A);
        Map map = this.B;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
