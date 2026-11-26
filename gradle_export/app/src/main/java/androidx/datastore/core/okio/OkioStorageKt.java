package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import gj.e;
import k50.z;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk50/z;", "path", "Landroidx/datastore/core/InterProcessCoordinator;", "createSingleProcessCoordinator", "(Lk50/z;)Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core-okio"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(z zVar) {
        m.e(zVar, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(e.i(zVar.A.q(), true).A.q());
    }
}
