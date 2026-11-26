package androidx.datastore.core.okio;

import gj.e;
import k50.z;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l50.c;
import u00.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lk50/z;", "invoke", "()Lk50/z;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OkioStorage$canonicalPath$2 extends n implements a {
    final OkioStorage<T> this$0;

    public OkioStorage$canonicalPath$2(OkioStorage<T> okioStorage) {
        super(0);
        this.this$0 = okioStorage;
    }

    public final z invoke() {
        z zVar = (z) ((OkioStorage) this.this$0).producePath.invoke();
        zVar.getClass();
        boolean z10 = c.a(zVar) != -1;
        OkioStorage<T> okioStorage = this.this$0;
        if (z10) {
            return e.i(zVar.A.q(), true);
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((OkioStorage) okioStorage).producePath + ", instead got " + zVar).toString());
    }
}
