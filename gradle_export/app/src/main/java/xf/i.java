package xf;

import java.util.concurrent.ExecutionException;

public final class i implements e, d, b {
    public final Object A = new Object();
    public final int B;
    public final n C;
    public int D;
    public int E;
    public int F;
    public Exception G;
    public boolean H;

    public i(int i10, n nVar) {
        this.B = i10;
        this.C = nVar;
    }

    public final void a() {
        int i10 = this.D + this.E + this.F;
        int i11 = this.B;
        if (i10 == i11) {
            Exception exc = this.G;
            n nVar = this.C;
            if (exc == null) {
                if (this.H) {
                    nVar.t();
                    return;
                } else {
                    nVar.q(null);
                    return;
                }
            }
            int i12 = this.E;
            int length = String.valueOf(i12).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + length + 8 + 24);
            sb2.append(i12);
            sb2.append(" out of ");
            sb2.append(i11);
            sb2.append(" underlying tasks failed");
            nVar.s(new ExecutionException(sb2.toString(), this.G));
        }
    }

    @Override
    public final void f() {
        synchronized (this.A) {
            this.F++;
            this.H = true;
            a();
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        synchronized (this.A) {
            this.E++;
            this.G = exc;
            a();
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        synchronized (this.A) {
            this.D++;
            a();
        }
    }
}
