package z7;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.gms.internal.play_billing.q1;

public final class g {

    public static final float[] f17265i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    public static final float[] f17266j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    public static final float[] f17267k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    public int f17268a;

    public q1 f17269b;

    public a20.g f17270c;

    public int f17271d;

    public int f17272e;

    public int f17273f;

    public int f17274g;

    public int f17275h;

    public static boolean b(f fVar) {
        e eVar = fVar.f17261a;
        e eVar2 = fVar.f17262b;
        q1[] q1VarArr = eVar.f17260a;
        if (q1VarArr.length == 1 && q1VarArr[0].f4030b == 0) {
            q1[] q1VarArr2 = eVar2.f17260a;
            if (q1VarArr2.length == 1 && q1VarArr2[0].f4030b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            a20.g gVar = new a20.g("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f17270c = gVar;
            this.f17271d = GLES20.glGetUniformLocation(gVar.B, "uMvpMatrix");
            this.f17272e = GLES20.glGetUniformLocation(this.f17270c.B, "uTexMatrix");
            this.f17273f = this.f17270c.x("aPosition");
            this.f17274g = this.f17270c.x("aTexCoords");
            this.f17275h = GLES20.glGetUniformLocation(this.f17270c.B, "uTexture");
        } catch (GlUtil$GlException e3) {
            e7.a.e("ProjectionRenderer", "Failed to initialize the program", e3);
        }
    }
}
