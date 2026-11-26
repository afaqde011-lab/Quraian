package k7;

import android.os.Handler;
import androidx.media3.common.w2;

public final class n {

    public final Handler f9111a;

    public final i7.v f9112b;

    public n(Handler handler, i7.v vVar, int i10) {
        switch (i10) {
            case 1:
                if (vVar != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.f9111a = handler;
                this.f9112b = vVar;
                break;
            default:
                this.f9111a = handler;
                this.f9112b = vVar;
                break;
        }
    }

    public void a(i7.c cVar) {
        synchronized (cVar) {
        }
        Handler handler = this.f9111a;
        if (handler != null) {
            handler.post(new ji.a(this, cVar, 6));
        }
    }

    public void b(w2 w2Var) {
        Handler handler = this.f9111a;
        if (handler != null) {
            handler.post(new oi.p(this, w2Var, 13));
        }
    }
}
