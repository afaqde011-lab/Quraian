package k9;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public final class a4 {

    public static final a4 f9211b = new a4(new HashSet());

    public static final String f9212c;

    public final fh.e1 f9213a;

    static {
        String str = e7.i0.f5136a;
        f9212c = Integer.toString(0, 36);
    }

    public a4(HashSet hashSet) {
        this.f9213a = fh.e1.n(hashSet);
    }

    public static a4 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f9212c);
        if (parcelableArrayList == null) {
            e7.a.m("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return f9211b;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
            hashSet.add(z3.a((Bundle) parcelableArrayList.get(i10)));
        }
        return new a4(hashSet);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        fh.s2 s2VarK = this.f9213a.iterator();
        while (s2VarK.hasNext()) {
            arrayList.add(((z3) s2VarK.next()).b());
        }
        bundle.putParcelableArrayList(f9212c, arrayList);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a4) {
            return this.f9213a.equals(((a4) obj).f9213a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9213a);
    }
}
