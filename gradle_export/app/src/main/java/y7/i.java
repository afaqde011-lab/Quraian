package y7;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import e7.i0;
import java.util.Locale;

public final class i extends HandlerThread implements Handler.Callback {
    public e7.j A;
    public Handler B;
    public Error C;
    public RuntimeException D;
    public j E;

    public final void a(int i10) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.A.getClass();
        e7.j jVar = this.A;
        int[] iArr = jVar.B;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        e7.d.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        e7.d.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        jVar.C = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, e7.j.G, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z10 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = i0.f5136a;
        e7.d.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(jVar.C, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        e7.d.c("eglCreateContext failed", eGLContextEglCreateContext != null);
        jVar.D = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = jVar.C;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            e7.d.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        e7.d.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        jVar.E = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        e7.d.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        jVar.F = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(jVar);
        SurfaceTexture surfaceTexture2 = this.A.F;
        surfaceTexture2.getClass();
        this.E = new j(this, surfaceTexture2, i10 != 0);
    }

    public final void b() {
        this.A.getClass();
        e7.j jVar = this.A;
        jVar.A.removeCallbacks(jVar);
        try {
            SurfaceTexture surfaceTexture = jVar.F;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, jVar.B, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = jVar.C;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = jVar.C;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = jVar.E;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(jVar.C, jVar.E);
            }
            EGLContext eGLContext = jVar.D;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(jVar.C, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = jVar.C;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(jVar.C);
            }
            jVar.C = null;
            jVar.D = null;
            jVar.E = null;
            jVar.F = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (GlUtil$GlException e3) {
                    e7.a.e("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.D = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    e7.a.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.C = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    e7.a.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.D = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th2) {
                    try {
                        e7.a.e("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
