package e7;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] G = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler A;
    public final int[] B = new int[1];
    public EGLDisplay C;
    public EGLContext D;
    public EGLSurface E;
    public SurfaceTexture F;

    public j(Handler handler) {
        this.A = handler;
    }

    @Override
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A.post(this);
    }

    @Override
    public final void run() {
        SurfaceTexture surfaceTexture = this.F;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
