package androidx.datastore.core;

import a40.o0;
import android.content.Context;
import b40.c;
import d00.a1;
import u00.k;

public final class a implements o0 {
    public final int A;
    public final Object B;
    public final Object C;

    public a(Object obj, Object obj2, int i11) {
        this.A = i11;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public final void dispose() {
        switch (this.A) {
            case 0:
                MulticastFileObserver.Companion.observe$lambda$4((String) this.B, (k) this.C);
                break;
            case 1:
                c cVar = (c) this.B;
                cVar.C.removeCallbacks((Runnable) this.C);
                break;
            default:
                ((Context) this.B).unregisterComponentCallbacks((a1) this.C);
                break;
        }
    }
}
