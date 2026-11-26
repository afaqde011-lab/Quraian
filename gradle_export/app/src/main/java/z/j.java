package z;

import a1.g2;
import android.content.Context;
import android.widget.EdgeEffect;

public final class j implements h1 {

    public final y3.c f16928a;

    public long f16929b = 9205357640488583168L;

    public final d0 f16930c;

    public final l1.i1 f16931d;

    public final boolean f16932e;

    public boolean f16933f;

    public long f16934g;

    public long f16935h;

    public final t1 f16936i;

    public j(Context context, y3.c cVar, long j9) {
        this.f16928a = cVar;
        d0 d0Var = new d0(context, i2.b0.C(j9));
        this.f16930c = d0Var;
        this.f16931d = new l1.i1(g00.b0.a, l1.c.D);
        this.f16932e = true;
        this.f16934g = 0L;
        this.f16935h = -1L;
        this.f16936i = new t1(v2.f0.a(new g2(this, 9)), this, d0Var);
    }

    @Override
    public final long a(long j9, int i10, u00.k kVar) {
        long j10;
        float fIntBitsToFloat;
        int i11;
        float fJ;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jE;
        long jE2;
        boolean z10;
        boolean zF;
        int i12;
        long j11;
        boolean z11;
        int i13;
        boolean z12;
        if (h2.e.f(this.f16934g)) {
            return ((h2.b) kVar.invoke(new h2.b(j9))).f6544a;
        }
        boolean z13 = this.f16933f;
        boolean z14 = true;
        d0 d0Var = this.f16930c;
        if (!z13) {
            if (d0.g(d0Var.f16905f)) {
                i(0L);
            }
            if (d0.g(d0Var.f16906g)) {
                j(0L);
            }
            if (d0.g(d0Var.f16903d)) {
                k(0L);
            }
            if (d0.g(d0Var.f16904e)) {
                h(0L);
            }
            this.f16933f = true;
        }
        int i14 = l.f16944a;
        float f3 = i10 == 2 ? 4.0f : 1.0f;
        long jG = h2.b.g(f3, j9);
        int i15 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i15) != 0.0f) {
            if (!d0.g(d0Var.f16903d) || Float.intBitsToFloat(i15) >= 0.0f) {
                j10 = 4294967295L;
                if (d0.g(d0Var.f16904e) && Float.intBitsToFloat(i15) > 0.0f) {
                    float fH = h(jG);
                    if (!d0.g(d0Var.f16904e)) {
                        d0Var.b().finish();
                    }
                    fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jG & 4294967295L)) ? Float.intBitsToFloat(i15) : fH / f3;
                }
            } else {
                float fK = k(jG);
                j10 = 4294967295L;
                if (!d0.g(d0Var.f16903d)) {
                    d0Var.e().finish();
                }
                fIntBitsToFloat = fK == Float.intBitsToFloat((int) (jG & 4294967295L)) ? Float.intBitsToFloat(i15) : fK / f3;
            }
            i11 = (int) (j9 >> 32);
            if (Float.intBitsToFloat(i11) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!d0.g(d0Var.f16905f) && Float.intBitsToFloat(i11) < 0.0f) {
                fJ = i(jG);
                if (!d0.g(d0Var.f16905f)) {
                    d0Var.c().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jG >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i11);
                } else {
                    fIntBitsToFloat2 = fJ / f3;
                }
            } else if (d0.g(d0Var.f16906g) || Float.intBitsToFloat(i11) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fJ = j(jG);
                if (!d0.g(d0Var.f16906g)) {
                    d0Var.d().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jG >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i11);
                } else {
                    fIntBitsToFloat2 = fJ / f3;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j10);
            if (!h2.b.b(jFloatToRawIntBits, 0L)) {
                g();
            }
            jE = h2.b.e(j9, jFloatToRawIntBits);
            long j12 = ((h2.b) kVar.invoke(new h2.b(jE))).f6544a;
            jE2 = h2.b.e(jE, j12);
            if ((Float.intBitsToFloat((int) (jE >> 32)) == 0.0f || Float.intBitsToFloat((int) (jE & j10)) != 0.0f) && ((Float.intBitsToFloat((int) (j12 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j12 & j10)) != 0.0f) && (d0.g(d0Var.f16905f) || d0.g(d0Var.f16903d) || d0.g(d0Var.f16906g) || d0.g(d0Var.f16904e)))) {
                e();
            }
            if (i10 == 1) {
                i12 = (int) (jE2 >> 32);
                if (Float.intBitsToFloat(i12) > 0.5f) {
                    j11 = jE2;
                    i(j11);
                } else {
                    j11 = jE2;
                    if (Float.intBitsToFloat(i12) < -0.5f) {
                        j(j11);
                    } else {
                        z11 = false;
                    }
                    i13 = (int) (j11 & j10);
                    if (Float.intBitsToFloat(i13) > 1056964608) {
                        k(j11);
                    } else {
                        if (Float.intBitsToFloat(i13) < -1090519040) {
                            h(j11);
                        } else {
                            z12 = false;
                        }
                        if (!z11 || z12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    z12 = true;
                    if (z11) {
                    }
                    z10 = true;
                }
                z11 = true;
                i13 = (int) (j11 & j10);
                if (Float.intBitsToFloat(i13) > 1056964608) {
                    k(j11);
                } else {
                    if (Float.intBitsToFloat(i13) < -1090519040) {
                        h(j11);
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                    }
                    z10 = true;
                }
                z12 = true;
                if (z11) {
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!h2.b.b(jE, 0L)) {
                if (d0.f(d0Var.f16905f) || Float.intBitsToFloat(i11) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = d0Var.c();
                    Float.intBitsToFloat(i11);
                    edgeEffectC.onRelease();
                    zF = d0.f(d0Var.f16905f);
                }
                if (d0.f(d0Var.f16906g) && Float.intBitsToFloat(i11) > 0.0f) {
                    EdgeEffect edgeEffectD = d0Var.d();
                    Float.intBitsToFloat(i11);
                    edgeEffectD.onRelease();
                    if (!zF || d0.f(d0Var.f16906g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (d0.f(d0Var.f16903d) && Float.intBitsToFloat(i15) < 0.0f) {
                    EdgeEffect edgeEffectE = d0Var.e();
                    Float.intBitsToFloat(i15);
                    edgeEffectE.onRelease();
                    if (!zF || d0.f(d0Var.f16903d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (d0.f(d0Var.f16904e) && Float.intBitsToFloat(i15) > 0.0f) {
                    EdgeEffect edgeEffectB = d0Var.b();
                    Float.intBitsToFloat(i15);
                    edgeEffectB.onRelease();
                    if (!zF || d0.f(d0Var.f16904e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF && !z10) {
                    z14 = false;
                }
                z10 = z14;
            }
            if (z10) {
                g();
            }
            return h2.b.f(jFloatToRawIntBits, j12);
        }
        j10 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i11 = (int) (j9 >> 32);
        if (Float.intBitsToFloat(i11) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!d0.g(d0Var.f16905f)) {
            if (d0.g(d0Var.f16906g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (d0.g(d0Var.f16906g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j10);
        if (!h2.b.b(jFloatToRawIntBits, 0L)) {
            g();
        }
        jE = h2.b.e(j9, jFloatToRawIntBits);
        long j13 = ((h2.b) kVar.invoke(new h2.b(jE))).f6544a;
        jE2 = h2.b.e(jE, j13);
        if (Float.intBitsToFloat((int) (jE >> 32)) == 0.0f) {
            e();
        } else {
            e();
        }
        if (i10 == 1) {
            i12 = (int) (jE2 >> 32);
            if (Float.intBitsToFloat(i12) > 0.5f) {
                j11 = jE2;
                i(j11);
            } else {
                j11 = jE2;
                if (Float.intBitsToFloat(i12) < -0.5f) {
                    j(j11);
                } else {
                    z11 = false;
                }
                i13 = (int) (j11 & j10);
                if (Float.intBitsToFloat(i13) > 1056964608) {
                    k(j11);
                } else {
                    if (Float.intBitsToFloat(i13) < -1090519040) {
                        h(j11);
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                    }
                    z10 = true;
                }
                z12 = true;
                if (z11) {
                }
                z10 = true;
            }
            z11 = true;
            i13 = (int) (j11 & j10);
            if (Float.intBitsToFloat(i13) > 1056964608) {
                k(j11);
            } else {
                if (Float.intBitsToFloat(i13) < -1090519040) {
                    h(j11);
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                z10 = true;
            }
            z12 = true;
            if (z11) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (!h2.b.b(jE, 0L)) {
            if (d0.f(d0Var.f16905f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (d0.f(d0Var.f16906g)) {
                EdgeEffect edgeEffectD2 = d0Var.d();
                Float.intBitsToFloat(i11);
                edgeEffectD2.onRelease();
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (d0.f(d0Var.f16903d)) {
                EdgeEffect edgeEffectE2 = d0Var.e();
                Float.intBitsToFloat(i15);
                edgeEffectE2.onRelease();
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (d0.f(d0Var.f16904e)) {
                EdgeEffect edgeEffectB2 = d0Var.b();
                Float.intBitsToFloat(i15);
                edgeEffectB2.onRelease();
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (!zF) {
                z14 = false;
            }
            z10 = z14;
        }
        if (z10) {
            g();
        }
        return h2.b.f(jFloatToRawIntBits, j13);
    }

    @Override
    public final java.lang.Object b(long r19, d0.t2 r21, k00.c r22) {
        throw new UnsupportedOperationException("Method not decompiled: z.j.b(long, d0.t2, k00.c):java.lang.Object");
    }

    @Override
    public final b3.k c() {
        return this.f16936i;
    }

    @Override
    public final boolean d() {
        float distance;
        float distance2;
        float distance3;
        float distance4;
        d0 d0Var = this.f16930c;
        EdgeEffect edgeEffect = d0Var.f16903d;
        if (edgeEffect != null) {
            try {
                distance = edgeEffect.getDistance();
            } catch (Throwable unused) {
                distance = 0.0f;
            }
            if (distance != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = d0Var.f16904e;
        if (edgeEffect2 != null) {
            try {
                distance2 = edgeEffect2.getDistance();
            } catch (Throwable unused2) {
                distance2 = 0.0f;
            }
            if (distance2 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = d0Var.f16905f;
        if (edgeEffect3 != null) {
            try {
                distance3 = edgeEffect3.getDistance();
            } catch (Throwable unused3) {
                distance3 = 0.0f;
            }
            if (distance3 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = d0Var.f16906g;
        if (edgeEffect4 == null) {
            return false;
        }
        try {
            distance4 = edgeEffect4.getDistance();
        } catch (Throwable unused4) {
            distance4 = 0.0f;
        }
        return distance4 != 0.0f;
    }

    public final void e() {
        boolean z10;
        d0 d0Var = this.f16930c;
        EdgeEffect edgeEffect = d0Var.f16903d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = d0Var.f16904e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = d0Var.f16905f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = d0Var.f16906g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            g();
        }
    }

    public final long f() {
        long jX = this.f16929b;
        if ((9223372034707292159L & jX) == 9205357640488583168L) {
            jX = ca.v.x(this.f16934g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32)) / Float.intBitsToFloat((int) (this.f16934g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jX & 4294967295L)) / Float.intBitsToFloat((int) (this.f16934g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void g() {
        if (this.f16932e) {
            this.f16931d.setValue(g00.b0.a);
        }
    }

    public final float h(long j9) {
        float fOnPullDistance;
        float distance;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i10 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f16934g & 4294967295L));
        EdgeEffect edgeEffectB = this.f16930c.b();
        float f3 = -fIntBitsToFloat2;
        float f10 = 1 - fIntBitsToFloat;
        try {
            fOnPullDistance = edgeEffectB.onPullDistance(f3, f10);
        } catch (Throwable unused) {
            edgeEffectB.onPull(f3, f10);
            fOnPullDistance = 0.0f;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.f16934g)) * (-fOnPullDistance);
        try {
            distance = edgeEffectB.getDistance();
        } catch (Throwable unused2) {
            distance = 0.0f;
        }
        return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i10);
    }

    public final float i(long j9) {
        float fOnPullDistance;
        float distance;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i10 = (int) (j9 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f16934g >> 32));
        EdgeEffect edgeEffectC = this.f16930c.c();
        float f3 = 1 - fIntBitsToFloat;
        try {
            fOnPullDistance = edgeEffectC.onPullDistance(fIntBitsToFloat2, f3);
        } catch (Throwable unused) {
            edgeEffectC.onPull(fIntBitsToFloat2, f3);
            fOnPullDistance = 0.0f;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f16934g >> 32)) * fOnPullDistance;
        try {
            distance = edgeEffectC.getDistance();
        } catch (Throwable unused2) {
            distance = 0.0f;
        }
        return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i10);
    }

    public final float j(long j9) {
        float fOnPullDistance;
        float distance;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i10 = (int) (j9 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f16934g >> 32));
        EdgeEffect edgeEffectD = this.f16930c.d();
        float f3 = -fIntBitsToFloat2;
        try {
            fOnPullDistance = edgeEffectD.onPullDistance(f3, fIntBitsToFloat);
        } catch (Throwable unused) {
            edgeEffectD.onPull(f3, fIntBitsToFloat);
            fOnPullDistance = 0.0f;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f16934g >> 32)) * (-fOnPullDistance);
        try {
            distance = edgeEffectD.getDistance();
        } catch (Throwable unused2) {
            distance = 0.0f;
        }
        return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i10);
    }

    public final float k(long j9) {
        float fOnPullDistance;
        float distance;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i10 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f16934g & 4294967295L));
        EdgeEffect edgeEffectE = this.f16930c.e();
        try {
            fOnPullDistance = edgeEffectE.onPullDistance(fIntBitsToFloat2, fIntBitsToFloat);
        } catch (Throwable unused) {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
            fOnPullDistance = 0.0f;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f16934g & 4294967295L)) * fOnPullDistance;
        try {
            distance = edgeEffectE.getDistance();
        } catch (Throwable unused2) {
            distance = 0.0f;
        }
        return distance == 0.0f ? fIntBitsToFloat3 : Float.intBitsToFloat(i10);
    }
}
