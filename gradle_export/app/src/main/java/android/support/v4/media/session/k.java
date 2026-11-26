package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class k extends Handler {

    public final m f501a;

    public k(m mVar, Looper looper) {
        super(looper);
        this.f501a = mVar;
    }

    @Override
    public final void handleMessage(Message message) {
        n nVar;
        m mVar;
        k kVar;
        if (message.what == 1) {
            synchronized (this.f501a.mLock) {
                nVar = this.f501a.mSessionImpl.get();
                mVar = this.f501a;
                kVar = mVar.mCallbackHandler;
            }
            if (nVar == null || mVar != nVar.a() || kVar == null) {
                return;
            }
            nVar.b((z6.a) message.obj);
            this.f501a.handleMediaPlayPauseIfPendingOnHandler(nVar, kVar);
            nVar.b(null);
        }
    }
}
