package y7;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class q implements GLSurfaceView.Renderer {
    public static final String[] H = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer I = e7.d.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    public final r A;
    public final int[] B = new int[3];
    public final int[] C = new int[3];
    public final int[] D = new int[3];
    public final int[] E = new int[3];
    public final AtomicReference F = new AtomicReference();
    public a20.g G;

    public q(r rVar) {
        this.A = rVar;
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = this.D;
            this.E[i10] = -1;
            iArr[i10] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.B;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                a20.g gVar = this.G;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(gVar.B, H[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                e7.d.a(3553, iArr[i10]);
            }
            e7.d.b();
        } catch (GlUtil$GlException e3) {
            e7.a.e("VideoDecoderGLSV", "Failed to set up the textures", e3);
        }
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        if (this.F.getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.C;
        try {
            a20.g gVar = new a20.g("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.G = gVar;
            GLES20.glVertexAttribPointer(gVar.x("in_pos"), 2, 5126, false, 0, (Buffer) I);
            iArr[0] = this.G.x("in_tc_y");
            iArr[1] = this.G.x("in_tc_u");
            iArr[2] = this.G.x("in_tc_v");
            GLES20.glGetUniformLocation(this.G.B, "mColorConversion");
            e7.d.b();
            a();
            e7.d.b();
        } catch (GlUtil$GlException e3) {
            e7.a.e("VideoDecoderGLSV", "Failed to set up the textures and program", e3);
        }
    }
}
