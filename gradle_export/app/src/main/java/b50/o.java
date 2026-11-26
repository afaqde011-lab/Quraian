package b50;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class o {
    public final ArrayList a;
    public int b;

    public o() {
        this.a = new ArrayList();
        this.b = 128;
    }

    public o(ArrayList arrayList) {
        this.a = arrayList;
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }

    public boolean b() {
        return this.b < this.a.size();
    }

    public synchronized boolean c(List list) {
        this.a.clear();
        if (list.size() <= this.b) {
            return this.a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.b, null);
        return this.a.addAll(list.subList(0, this.b));
    }
}
