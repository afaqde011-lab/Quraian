package y7;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;

public final class j extends Surface {
    public static int D;
    public static boolean E;
    public final boolean A;
    public final i B;
    public boolean C;

    public j(i iVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.B = iVar;
        this.A = z10;
    }

    public static synchronized boolean a() {
        int i10;
        try {
            if (!E) {
                try {
                    if (e7.d.g("EGL_EXT_protected_content")) {
                        i10 = e7.d.g("EGL_KHR_surfaceless_context") ? 1 : 2;
                    } else {
                        i10 = 0;
                    }
                } catch (GlUtil$GlException e3) {
                    e7.a.d("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e3.getMessage());
                }
                D = i10;
                E = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return D != 0;
    }

    @Override
    public final void release() {
        super.release();
        synchronized (this.B) {
            try {
                if (!this.C) {
                    i iVar = this.B;
                    iVar.B.getClass();
                    iVar.B.sendEmptyMessage(2);
                    this.C = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
