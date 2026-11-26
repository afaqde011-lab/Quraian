package z7;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.gms.internal.play_billing.q1;
import e7.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import y7.t;

public final class i implements t, a {
    public int I;
    public SurfaceTexture J;
    public byte[] M;
    public final AtomicBoolean A = new AtomicBoolean();
    public final AtomicBoolean B = new AtomicBoolean(true);
    public final g C = new g();
    public final c7.c D = new c7.c(12);
    public final q1 E = new q1();
    public final q1 F = new q1();
    public final float[] G = new float[16];
    public final float[] H = new float[16];
    public volatile int K = 0;
    public int L = -1;

    @Override
    public final void a() {
        this.E.l();
        c7.c cVar = this.D;
        ((q1) cVar.D).l();
        cVar.A = false;
        this.B.set(true);
    }

    @Override
    public final void b(long j9, long j10, androidx.media3.common.t tVar, MediaFormat mediaFormat) {
        int i10;
        ArrayList arrayListX;
        this.E.f(Long.valueOf(j9), j10);
        byte[] bArr = tVar.B;
        int i11 = tVar.C;
        byte[] bArr2 = this.M;
        int i12 = this.L;
        this.M = bArr;
        if (i11 == -1) {
            i11 = this.K;
        }
        this.L = i11;
        if (i12 == i11 && Arrays.equals(bArr2, this.M)) {
            return;
        }
        byte[] bArr3 = this.M;
        f fVar = null;
        if (bArr3 != null) {
            int i13 = this.L;
            u uVar = new u(bArr3);
            try {
                uVar.O(4);
                int iM = uVar.m();
                uVar.N(0);
                if (iM == 1886547818) {
                    uVar.O(8);
                    int i14 = uVar.f5183b;
                    int i15 = uVar.f5184c;
                    while (true) {
                        if (i14 < i15) {
                            int iM2 = uVar.m() + i14;
                            if (iM2 > i14 && iM2 <= i15) {
                                int iM3 = uVar.m();
                                if (iM3 != 2037673328 && iM3 != 1836279920) {
                                    uVar.N(iM2);
                                    i14 = iM2;
                                }
                                uVar.M(iM2);
                                arrayListX = f50.k.x(uVar);
                            }
                        }
                        arrayListX = null;
                    }
                } else {
                    arrayListX = f50.k.x(uVar);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListX != null) {
                int size = arrayListX.size();
                if (size == 1) {
                    e eVar = (e) arrayListX.get(0);
                    fVar = new f(eVar, eVar, i13);
                } else if (size == 2) {
                    fVar = new f((e) arrayListX.get(0), (e) arrayListX.get(1), i13);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i16 = this.L;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f3 = radians / 36;
            float f10 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 36; i17 < i20; i20 = 36) {
                float f11 = radians / 2.0f;
                float f12 = (i17 * f3) - f11;
                int i21 = i17 + 1;
                float f13 = (i21 * f3) - f11;
                int i22 = 0;
                while (i22 < 73) {
                    int i23 = i21;
                    float f14 = f13;
                    float f15 = radians;
                    int i24 = i18;
                    int i25 = i19;
                    int i26 = 0;
                    int i27 = 2;
                    while (i26 < i27) {
                        float f16 = i26 == 0 ? f12 : f14;
                        float f17 = radians2;
                        float f18 = i22 * f10;
                        float f19 = f12;
                        float f20 = f3;
                        double d3 = 50.0f;
                        double d5 = (f18 + 3.1415927f) - (f17 / 2.0f);
                        double d10 = f16;
                        fArr[i24] = -((float) (Math.cos(d10) * Math.sin(d5) * d3));
                        fArr[i24 + 1] = (float) (Math.sin(d10) * d3);
                        int i28 = i24 + 3;
                        fArr[i24 + 2] = (float) (Math.cos(d10) * Math.cos(d5) * d3);
                        fArr2[i25] = f18 / f17;
                        int i29 = i25 + 2;
                        fArr2[i25 + 1] = ((i17 + i26) * f20) / f15;
                        if ((i22 == 0 && i26 == 0) || (i22 == 72 && i26 == 1)) {
                            System.arraycopy(fArr, i24, fArr, i28, 3);
                            i24 += 6;
                            i10 = 2;
                            System.arraycopy(fArr2, i25, fArr2, i29, 2);
                            i25 += 4;
                        } else {
                            i10 = 2;
                            i24 = i28;
                            i25 = i29;
                        }
                        i26++;
                        i27 = i10;
                        radians2 = f17;
                        f12 = f19;
                        f3 = f20;
                    }
                    i22++;
                    i18 = i24;
                    i19 = i25;
                    i21 = i23;
                    f13 = f14;
                    radians = f15;
                    radians2 = radians2;
                    f3 = f3;
                }
                i17 = i21;
            }
            e eVar2 = new e(new q1(0, 1, fArr, fArr2));
            fVar = new f(eVar2, eVar2, i16);
        }
        this.F.f(fVar, j10);
    }

    @Override
    public final void c(float[] fArr, long j9) {
        ((q1) this.D.D).f(fArr, j9);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            e7.d.b();
            this.C.a();
            e7.d.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            e7.d.b();
            int i10 = iArr[0];
            e7.d.a(36197, i10);
            this.I = i10;
        } catch (GlUtil$GlException e3) {
            e7.a.e("SceneRenderer", "Failed to initialize the renderer", e3);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.I);
        this.J = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
            @Override
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.A.A.set(true);
            }
        });
        return this.J;
    }
}
