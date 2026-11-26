package rw;

import ab.y;
import android.net.NetworkRequest;
import com.mchutov.quranify.push.data.worker.PushTokenSyncWorker;
import h00.q;
import ib.f;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import za.e;
import za.j0;
import za.l;
import za.w;
import za.x;

public final class a {
    public final y a;

    public a(y yVar) {
        this.a = yVar;
    }

    public final void a() {
        w wVar = w.A;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e eVar = new e(new f((NetworkRequest) null), w.B, false, false, false, false, -1L, -1L, q.r1(linkedHashSet));
        x xVar = new x(PushTokenSyncWorker.class);
        ((j0) xVar).c.j = eVar;
        this.a.x("push_token_sync_work", l.D, xVar.e(za.a.A, 10000L, TimeUnit.MILLISECONDS).a("push_token_sync_work").b());
    }
}
