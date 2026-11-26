package tf;

public final class a0 {

    public static final Object f14521f = new Object();

    public final String f14522a;

    public final t f14523b;

    public final Object f14524c;

    public final Object f14525d = new Object();

    public volatile Object f14526e = null;

    public a0(String str, Object obj, t tVar) {
        this.f14522a = str;
        this.f14524c = obj;
        this.f14523b = tVar;
    }

    public final Object a(Object obj) {
        synchronized (this.f14525d) {
        }
        if (obj != null) {
            return obj;
        }
        if (u1.f14737k == null) {
            return this.f14524c;
        }
        synchronized (f14521f) {
            try {
                if (ru.c.a()) {
                    return this.f14526e == null ? this.f14524c : this.f14526e;
                }
                try {
                    for (a0 a0Var : b0.f14545a) {
                        if (ru.c.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            t tVar = a0Var.f14523b;
                            if (tVar != null) {
                                objZza = tVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f14521f) {
                            a0Var.f14526e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                t tVar2 = this.f14523b;
                if (tVar2 != null) {
                    try {
                        return tVar2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f14524c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
