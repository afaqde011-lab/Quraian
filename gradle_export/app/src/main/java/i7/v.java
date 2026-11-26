package i7;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

public final class v implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final z A;

    public v(z zVar) {
        this.A = zVar;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Surface surface = new Surface(surfaceTexture);
        z zVar = this.A;
        zVar.u(surface);
        zVar.W = surface;
        zVar.o(i10, i11);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        z zVar = this.A;
        zVar.u(null);
        zVar.o(0, 0);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.A.o(i10, i11);
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.A.o(i11, i12);
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        z zVar = this.A;
        if (zVar.Z) {
            zVar.u(surfaceHolder.getSurface());
        }
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        z zVar = this.A;
        if (zVar.Z) {
            zVar.u(null);
        }
        zVar.o(0, 0);
    }
}
