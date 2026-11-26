package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import ri.t1;

public final class d0 extends re.a {
    public static final Parcelable.Creator<d0> CREATOR = new k0(8);
    public final List A;

    public d0(ArrayList arrayList) {
        this.A = arrayList;
    }

    public final JSONArray a() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.A;
            if (list != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    e0 e0Var = (e0) list.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) e0Var.C);
                    jSONArray2.put((int) e0Var.B);
                    jSONArray2.put((int) e0Var.C);
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e3) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        List list = ((d0) obj).A;
        List list2 = this.A;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.A;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.e0(parcel, 1, this.A);
        t1.h0(iG0, parcel);
    }
}
