package y7;

import android.content.Context;
import android.opengl.GLSurfaceView;

public final class r extends GLSurfaceView implements s {
    public static final int B = 0;
    public final q A;

    public r(Context context) {
        super(context, null);
        q qVar = new q(this);
        this.A = qVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(qVar);
        setRenderMode(0);
    }

    @Deprecated
    public s getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(h7.i iVar) {
        q qVar = this.A;
        if (qVar.F.getAndSet(iVar) != null) {
            throw new ClassCastException();
        }
        qVar.A.requestRender();
    }
}
