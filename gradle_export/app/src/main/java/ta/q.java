package ta;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;

public final class q extends u {

    public boolean f14481b;

    public boolean f14482c;

    public u5.e f14484e;

    public final c50.h f14485f;

    public Runnable f14486g;

    public final z f14487h;

    public long f14480a = -1;

    public int f14483d = 0;

    public q(z zVar) {
        this.f14487h = zVar;
        c50.h hVar = new c50.h((char) 0, 22);
        long[] jArr = new long[20];
        hVar.C = jArr;
        hVar.D = new float[20];
        hVar.B = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f14485f = hVar;
    }

    @Override
    public final void b(t tVar) {
        this.f14482c = true;
    }

    public final void g() {
        if (this.f14481b) {
            h();
            this.f14484e.a(this.f14487h.X + 1);
        } else {
            this.f14483d = 1;
            this.f14486g = null;
        }
    }

    public final void h() {
        int i10;
        if (this.f14484e != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f3 = this.f14480a;
        c50.h hVar = this.f14485f;
        int i11 = hVar.B;
        float[] fArr = (float[]) hVar.D;
        long[] jArr = (long[]) hVar.C;
        char c10 = 20;
        int i12 = (i11 + 1) % 20;
        hVar.B = i12;
        jArr[i12] = jCurrentAnimationTimeMillis;
        fArr[i12] = f3;
        b1.i iVar = new b1.i(5, false);
        float fSqrt = 0.0f;
        iVar.f1965b = 0.0f;
        this.f14484e = new u5.e(iVar);
        u5.f fVar = new u5.f();
        fVar.a(1.0f);
        fVar.b(200.0f);
        u5.e eVar = this.f14484e;
        eVar.m = fVar;
        eVar.f14964b = this.f14480a;
        eVar.f14965c = true;
        ArrayList arrayList = eVar.l;
        if (eVar.f14968f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        u5.e eVar2 = this.f14484e;
        int i13 = hVar.B;
        long j9 = Long.MIN_VALUE;
        if (i13 != 0 || jArr[i13] != Long.MIN_VALUE) {
            long j10 = jArr[i13];
            int i14 = 0;
            long j11 = j10;
            while (true) {
                long j12 = jArr[i13];
                if (j12 == j9) {
                    break;
                }
                float f10 = j10 - j12;
                float fAbs = Math.abs(j12 - j11);
                if (f10 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i13 == 0) {
                    i13 = 20;
                }
                i13--;
                i14++;
                if (i14 >= 20) {
                    break;
                }
                j11 = j12;
                j9 = Long.MIN_VALUE;
            }
            if (i14 >= 2) {
                float f11 = 1000.0f;
                if (i14 == 2) {
                    int i15 = hVar.B;
                    int i16 = i15 == 0 ? 19 : i15 - 1;
                    float f12 = jArr[i15] - jArr[i16];
                    if (f12 != 0.0f) {
                        fSqrt = ((fArr[i15] - fArr[i16]) / f12) * 1000.0f;
                    }
                } else {
                    int i17 = hVar.B;
                    int i18 = ((i17 - i14) + 21) % 20;
                    int i19 = (i17 + 21) % 20;
                    long j13 = jArr[i18];
                    float f13 = fArr[i18];
                    int i20 = i18 + 1;
                    int i21 = i20 % 20;
                    float f14 = 0.0f;
                    while (i21 != i19) {
                        long j14 = jArr[i21];
                        char c11 = c10;
                        float f15 = f11;
                        float f16 = j14 - j13;
                        if (f16 == fSqrt) {
                            i10 = i20;
                        } else {
                            float f17 = fArr[i21];
                            int i22 = i20;
                            float f18 = (f17 - f13) / f16;
                            float fAbs2 = (Math.abs(f18) * (f18 - ((float) (Math.sqrt(2.0f * Math.abs(f14)) * ((double) Math.signum(f14)))))) + f14;
                            i10 = i22;
                            if (i21 == i10) {
                                fAbs2 *= 0.5f;
                            }
                            f14 = fAbs2;
                            f13 = f17;
                            j13 = j14;
                        }
                        i21 = (i21 + 1) % 20;
                        i20 = i10;
                        c10 = c11;
                        f11 = f15;
                        fSqrt = 0.0f;
                    }
                    fSqrt = ((float) (Math.sqrt(Math.abs(f14) * 2.0f) * ((double) Math.signum(f14)))) * f11;
                }
            }
        }
        eVar2.f14963a = fSqrt;
        u5.e eVar3 = this.f14484e;
        eVar3.f14969g = this.f14487h.X + 1;
        eVar3.f14970h = -1.0f;
        eVar3.f14972j = 4.0f;
        p pVar = new p(this);
        ArrayList arrayList2 = eVar3.f14973k;
        if (arrayList2.contains(pVar)) {
            return;
        }
        arrayList2.add(pVar);
    }
}
