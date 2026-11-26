package s9;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import d40.p1;

public final class n implements OnBackAnimationCallback {

    public final m f13944a;

    public n(m mVar) {
        this.f13944a = mVar;
    }

    public final void onBackCancelled() {
        m mVar = this.f13944a;
        c cVar = mVar.f13923a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!mVar.f13924b) {
            cVar.d(mVar, null);
        }
        i iVar = cVar.f13911b;
        iVar.getClass();
        if (mVar.equals(iVar.f13932h) && -1 == iVar.f13931g) {
            e eVarC = iVar.f13930f;
            if (eVarC == null) {
                eVarC = iVar.c(-1);
            }
            iVar.f13930f = null;
            iVar.f13931g = 0;
            iVar.f13932h = null;
            j jVar = j.f13937a;
            if (eVarC != null) {
                eVarC.f13917d = jVar;
                eVarC.a();
            }
            p1 p1Var = iVar.f13925a;
            p1Var.getClass();
            p1Var.k((Object) null, jVar);
        }
        mVar.f13924b = false;
    }

    @Override
    public final void onBackInvoked() {
        this.f13944a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
        b bVarM = kh.n.m(backEvent);
        m mVar = this.f13944a;
        c cVar = mVar.f13923a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (mVar.f13924b) {
            i iVar = cVar.f13911b;
            iVar.getClass();
            if (mVar.equals(iVar.f13932h) && -1 == iVar.f13931g) {
                e eVarC = iVar.f13930f;
                if (eVarC == null) {
                    eVarC = iVar.c(-1);
                }
                if (eVarC != null) {
                    eVarC.f13917d = new k(bVarM, -1);
                    eVarC.c(bVarM);
                }
                p1 p1Var = iVar.f13925a;
                k kVar = new k(bVarM, -1);
                p1Var.getClass();
                p1Var.k((Object) null, kVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
        b bVarM = kh.n.m(backEvent);
        m mVar = this.f13944a;
        c cVar = mVar.f13923a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (mVar.f13924b) {
            return;
        }
        cVar.d(mVar, bVarM);
        mVar.f13924b = true;
    }
}
