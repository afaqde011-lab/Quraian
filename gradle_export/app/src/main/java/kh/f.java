package kh;

import com.google.android.gms.internal.measurement.g4;

public final class f extends g4 {
    @Override
    public final c H(l lVar) {
        c cVar;
        c cVar2 = c.f9665d;
        synchronized (lVar) {
            try {
                cVar = lVar.B;
                if (cVar != cVar2) {
                    lVar.B = cVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override
    public final k I(l lVar) {
        k kVar;
        k kVar2 = k.f9676c;
        synchronized (lVar) {
            try {
                kVar = lVar.C;
                if (kVar != kVar2) {
                    lVar.C = kVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override
    public final void Y(k kVar, k kVar2) {
        kVar.f9678b = kVar2;
    }

    @Override
    public final void Z(k kVar, Thread thread) {
        kVar.f9677a = thread;
    }

    @Override
    public final boolean s(l lVar, c cVar, c cVar2) {
        synchronized (lVar) {
            try {
                if (lVar.B != cVar) {
                    return false;
                }
                lVar.B = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean t(l lVar, Object obj, Object obj2) {
        synchronized (lVar) {
            try {
                if (lVar.A != obj) {
                    return false;
                }
                lVar.A = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean u(l lVar, k kVar, k kVar2) {
        synchronized (lVar) {
            try {
                if (lVar.C != kVar) {
                    return false;
                }
                lVar.C = kVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
