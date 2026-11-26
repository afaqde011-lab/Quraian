package l9;

import android.os.Messenger;

public final class k implements Runnable {
    public final l A;

    public k(l lVar) {
        this.A = lVar;
    }

    @Override
    public final void run() {
        l lVar = this.A;
        u.e eVar = lVar.f10166g.E;
        h hVar = lVar.f10164e;
        hVar.getClass();
        eVar.remove(((Messenger) hVar.f10149a).getBinder());
    }
}
