package k9;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

public final class s0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final t0 A;

    public s0(t0 t0Var) {
        this.A = t0Var;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        t0 t0Var = this.A;
        TextureView textureView = t0Var.C;
        if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
            return;
        }
        t0Var.A = new Surface(surfaceTexture);
        t0Var.I(t0Var.A, i10, i11);
        t0Var.x(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t0 t0Var = this.A;
        TextureView textureView = t0Var.C;
        if (textureView != null && textureView.getSurfaceTexture() == surfaceTexture) {
            t0Var.A = null;
            t0Var.I(null, 0, 0);
            t0Var.x(0, 0);
        }
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        t0 t0Var = this.A;
        TextureView textureView = t0Var.C;
        if (textureView != null && textureView.getSurfaceTexture() == surfaceTexture && t0Var.isConnected()) {
            f4 f4Var = t0Var.f9449n;
            f4Var.getClass();
            if (f4Var.f9293a.f() >= 8) {
                t0Var.l(new r0(this, i10, i11, 1));
            }
            t0Var.x(i10, i11);
        }
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        t0 t0Var = this.A;
        if (t0Var.B == surfaceHolder && t0Var.isConnected()) {
            f4 f4Var = t0Var.f9449n;
            f4Var.getClass();
            if (f4Var.f9293a.f() >= 8) {
                t0Var.l(new r0(this, i11, i12, 0));
            }
            t0Var.x(i11, i12);
        }
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        t0 t0Var = this.A;
        if (t0Var.B != surfaceHolder) {
            return;
        }
        t0Var.A = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        t0Var.I(t0Var.A, surfaceFrame.width(), surfaceFrame.height());
        t0Var.x(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        t0 t0Var = this.A;
        if (t0Var.B != surfaceHolder) {
            return;
        }
        t0Var.A = null;
        t0Var.I(null, 0, 0);
        t0Var.x(0, 0);
    }
}
