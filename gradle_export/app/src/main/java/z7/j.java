package z7;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.gms.internal.play_billing.q1;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import oi.p;

public final class j implements GLSurfaceView.Renderer, c {
    public final i A;
    public final float[] D;
    public final float[] E;
    public final float[] F;
    public float G;
    public float H;
    public final k K;
    public final float[] B = new float[16];
    public final float[] C = new float[16];
    public final float[] I = new float[16];
    public final float[] J = new float[16];

    public j(k kVar, i iVar) {
        this.K = kVar;
        float[] fArr = new float[16];
        this.D = fArr;
        float[] fArr2 = new float[16];
        this.E = fArr2;
        float[] fArr3 = new float[16];
        this.F = fArr3;
        this.A = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.H = 3.1415927f;
    }

    @Override
    public final synchronized void a(float[] fArr, float f3) {
        float[] fArr2 = this.D;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f10 = -f3;
        this.H = f10;
        Matrix.setRotateM(this.E, 0, -this.G, (float) Math.cos(f10), (float) Math.sin(this.H), 0.0f);
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objS;
        synchronized (this) {
            Matrix.multiplyMM(this.J, 0, this.D, 0, this.F, 0);
            Matrix.multiplyMM(this.I, 0, this.E, 0, this.J, 0);
        }
        Matrix.multiplyMM(this.C, 0, this.B, 0, this.I, 0);
        i iVar = this.A;
        float[] fArr2 = this.C;
        GLES20.glClear(16384);
        try {
            e7.d.b();
        } catch (GlUtil$GlException e3) {
            e7.a.e("SceneRenderer", "Failed to draw a frame", e3);
        }
        if (iVar.A.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.J;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                e7.d.b();
            } catch (GlUtil$GlException e10) {
                e7.a.e("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (iVar.B.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.G, 0);
            }
            long timestamp = iVar.J.getTimestamp();
            q1 q1Var = iVar.E;
            synchronized (q1Var) {
                objS = q1Var.S(false, timestamp);
            }
            Long l = (Long) objS;
            if (l != null) {
                c7.c cVar = iVar.D;
                float[] fArr3 = iVar.G;
                float[] fArr4 = (float[]) ((q1) cVar.D).U(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) cVar.C;
                    float f3 = fArr4[0];
                    float f10 = -fArr4[1];
                    float f11 = -fArr4[2];
                    float length = Matrix.length(f3, f10, f11);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f3 / length, f10 / length, f11 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!cVar.A) {
                        c7.c.e((float[]) cVar.B, (float[]) cVar.C);
                        cVar.A = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) cVar.B, 0, (float[]) cVar.C, 0);
                }
            }
            f fVar = (f) iVar.F.U(timestamp);
            if (fVar != null) {
                g gVar = iVar.C;
                gVar.getClass();
                if (g.b(fVar)) {
                    gVar.f17268a = fVar.f17263c;
                    gVar.f17269b = new q1(fVar.f17261a.f17260a[0]);
                    if (!fVar.f17264d) {
                        q1 q1Var2 = fVar.f17262b.f17260a[0];
                        float[] fArr6 = (float[]) q1Var2.f4032d;
                        int length2 = fArr6.length;
                        e7.d.d(fArr6);
                        e7.d.d((float[]) q1Var2.f4033e);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.H, 0, fArr2, 0, iVar.G, 0);
        g gVar2 = iVar.C;
        int i10 = iVar.I;
        float[] fArr7 = iVar.H;
        q1 q1Var3 = gVar2.f17269b;
        if (q1Var3 == null) {
            return;
        }
        int i11 = gVar2.f17268a;
        if (i11 == 1) {
            fArr = g.f17266j;
        } else {
            fArr = i11 == 2 ? g.f17267k : g.f17265i;
        }
        GLES20.glUniformMatrix3fv(gVar2.f17272e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(gVar2.f17271d, 1, false, fArr7, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(gVar2.f17275h, 0);
        try {
            e7.d.b();
        } catch (GlUtil$GlException e11) {
            e7.a.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(gVar2.f17273f, 3, 5126, false, 12, (Buffer) q1Var3.f4032d);
        try {
            e7.d.b();
        } catch (GlUtil$GlException e12) {
            e7.a.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(gVar2.f17274g, 2, 5126, false, 8, (Buffer) q1Var3.f4033e);
        try {
            e7.d.b();
        } catch (GlUtil$GlException e13) {
            e7.a.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(q1Var3.f4031c, 0, q1Var3.f4030b);
        try {
            e7.d.b();
        } catch (GlUtil$GlException e14) {
            e7.a.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        float f3 = i10 / i11;
        Matrix.perspectiveM(this.B, 0, f3 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f3))) * 2.0d) : 90.0f, f3, 0.1f, 100.0f);
    }

    @Override
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.K;
        kVar.E.post(new p(kVar, this.A.d(), 15));
    }
}
