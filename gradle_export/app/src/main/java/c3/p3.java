package c3;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.c4;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class p3 extends ContentObserver {

    public final int f2750a = 0;

    public final Object f2751b;

    public p3(c40.h hVar, Handler handler) {
        super(handler);
        this.f2751b = hVar;
    }

    public p3(c4 c4Var) {
        super(null);
        this.f2751b = c4Var;
    }

    public p3(ui.b bVar) {
        super(null);
        Objects.requireNonNull(bVar);
        this.f2751b = bVar;
    }

    @Override
    public void onChange(boolean z10) {
        switch (this.f2750a) {
            case 1:
                ((AtomicBoolean) ((ui.b) this.f2751b).B).set(true);
                return;
            case 2:
                c4 c4Var = (c4) this.f2751b;
                synchronized (c4Var.f3733f) {
                    c4Var.f3734g = null;
                    c4Var.f3730c.run();
                    break;
                }
                synchronized (c4Var) {
                    try {
                        Iterator it = c4Var.f3735h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                super.onChange(z10);
                return;
        }
    }

    @Override
    public void onChange(boolean z10, Uri uri) {
        switch (this.f2750a) {
            case 0:
                ((c40.h) this.f2751b).j(g00.b0.a);
                break;
            default:
                super.onChange(z10, uri);
                break;
        }
    }
}
