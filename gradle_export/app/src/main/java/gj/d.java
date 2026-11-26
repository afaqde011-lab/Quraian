package gj;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.RuntimeVersion;
import f50.k;
import ii.l;
import java.util.Set;
import java.util.concurrent.Executor;
import xf.n;

public final class d implements f, g {

    public final l f6348a;

    public final Context f6349b;

    public final ij.b f6350c;

    public final Set f6351d;

    public final Executor f6352e;

    public d(Context context, String str, Set set, ij.b bVar, Executor executor) {
        this.f6348a = new l(new bi.c(context, str));
        this.f6351d = set;
        this.f6352e = executor;
        this.f6350c = bVar;
        this.f6349b = context;
    }

    public final n a() {
        if (!k.s(this.f6349b)) {
            return Tasks.d(RuntimeVersion.SUFFIX);
        }
        return Tasks.b(this.f6352e, new c(this, 0));
    }

    public final void b() {
        if (this.f6351d.size() <= 0) {
            Tasks.d(null);
        } else if (!k.s(this.f6349b)) {
            Tasks.d(null);
        } else {
            Tasks.b(this.f6352e, new c(this, 1));
        }
    }
}
