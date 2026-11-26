package c3;

import android.view.Choreographer;

public final class v0 implements Choreographer.FrameCallback {
    public final a40.k A;
    public final u00.k B;

    public v0(a40.k kVar, w0 w0Var, u00.k kVar2) {
        this.A = kVar;
        this.B = kVar2;
    }

    @Override
    public final void doFrame(long j9) {
        Object objS;
        try {
            objS = this.B.invoke(Long.valueOf(j9));
        } catch (Throwable th2) {
            objS = ri.t1.s(th2);
        }
        this.A.resumeWith(objS);
    }
}
