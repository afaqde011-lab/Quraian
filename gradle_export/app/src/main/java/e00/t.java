package e00;

import a40.c0;
import a40.m0;
import a40.u1;
import a40.z;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Trace;
import android.renderscript.RenderScript;
import android.view.Surface;
import b3.o0;
import c3.o1;
import d00.b1;
import d00.n0;
import d00.r0;
import d00.s0;
import g00.b0;
import i2.y;
import l1.q2;
import ri.t1;

public final class t implements c {
    public static boolean k = true;
    public final d a;
    public final y b;
    public final Context c;
    public volatile RenderScript d;
    public volatile v e;
    public final k2.b f;
    public u1 g;
    public boolean h;
    public volatile int i;
    public final l2.b j;

    public t(d dVar, y graphicsContext, Context platformContext) {
        kotlin.jvm.internal.m.e(graphicsContext, "graphicsContext");
        kotlin.jvm.internal.m.e(platformContext, "platformContext");
        this.a = dVar;
        this.b = graphicsContext;
        this.c = platformContext;
        this.d = RenderScript.create(platformContext.getApplicationContext());
        this.f = new k2.b();
        this.j = graphicsContext.c();
    }

    public static final Object d(t tVar, l2.b bVar, float f, r0 r0Var, y3.c cVar, m00.c cVar2) {
        r rVar;
        long j;
        char c;
        int i;
        l2.b bVarC;
        y3.c cVar3;
        int i2;
        String str;
        int i3;
        v vVar;
        v vVar2;
        String str2;
        String str3;
        String str4;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object objK;
        String str5;
        String str6;
        v vVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        l00.a aVar;
        String str7;
        l2.b bVar2;
        String str8;
        int i16;
        l2.b bVar3;
        h40.e eVar;
        s sVar;
        r0 r0Var2;
        y3.c cVar4;
        v vVar4;
        t tVar2 = tVar;
        l2.b bVar4 = bVar;
        r0 r0Var3 = r0Var;
        b0 b0Var = b0.a;
        if (cVar2 instanceof r) {
            rVar = (r) cVar2;
            int i17 = rVar.Q;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                rVar.Q = i17 - Integer.MIN_VALUE;
            } else {
                rVar = new r(tVar2, cVar2);
            }
        } else {
            rVar = new r(tVar2, cVar2);
        }
        r rVar2 = rVar;
        Object obj = rVar2.O;
        l00.a aVar2 = l00.a.A;
        int i18 = rVar2.Q;
        if (i18 == 0) {
            j = 4294967295L;
            c = ' ';
            t1.O(obj);
            i = tVar2.i;
            long j2 = bVar4.u;
            int i19 = (int) (j2 >> 32);
            int i21 = ((i19 + 3) / 4) * 4;
            int i22 = (int) (j2 & 4294967295L);
            int i23 = ((i22 + 3) / 4) * 4;
            if (i21 == i19 && i23 == i22) {
                cVar3 = cVar;
                bVarC = bVar4;
                i2 = 0;
            } else {
                bVarC = tVar2.b.c();
                long j3 = tVar2.a.j();
                q2 local = o1.n;
                r0Var3.getClass();
                kotlin.jvm.internal.m.e(local, "local");
                y3.m mVar = (y3.m) b3.m.h(r0Var3.a, local);
                long j4 = (((long) i21) << 32) | (((long) i23) & 4294967295L);
                cl.b bVar5 = new cl.b(j3, bVar4, 1);
                cVar3 = cVar;
                i2 = 0;
                bVarC.e(cVar3, mVar, j4, bVar5);
            }
            try {
                str = "Haze-RenderScriptBlurEffect-updateSurface";
                kh.o.m(i2, "Haze-RenderScriptBlurEffect-updateSurface");
                try {
                    if (tVar2.i == i) {
                        long j5 = bVarC.u;
                        v vVar5 = tVar2.e;
                        if (vVar5 == null) {
                            if (vVar5 != null) {
                                vVar5.a();
                            }
                            RenderScript renderScript = tVar2.d;
                            kotlin.jvm.internal.m.d(renderScript, "renderScript");
                            vVar5 = new v(renderScript, j5);
                            tVar2.e = vVar5;
                            vVar = vVar5;
                            if (tVar2.i == i) {
                                str2 = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                i3 = 0;
                                kh.o.m(0, "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface");
                                Surface surface = vVar.c.getSurface();
                                kotlin.jvm.internal.m.d(surface, "getSurface(...)");
                                ze.d.f(surface, bVarC, cVar3, tVar2.f);
                                rVar2.A = bVar4;
                                rVar2.B = r0Var3;
                                rVar2.C = cVar3;
                                rVar2.D = bVarC;
                                rVar2.E = "Haze-RenderScriptBlurEffect-updateSurface";
                                rVar2.F = vVar;
                                rVar2.G = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                f2 = f;
                                rVar2.H = f2;
                                rVar2.I = i;
                                rVar2.J = 0;
                                rVar2.K = 0;
                                rVar2.L = 0;
                                rVar2.M = 0;
                                rVar2.N = 0;
                                rVar2.Q = 1;
                                objK = vVar.f.k(rVar2);
                                if (objK == aVar2) {
                                    objK = b0Var;
                                }
                                if (objK == aVar2) {
                                    aVar = aVar2;
                                } else {
                                    str5 = "Haze-RenderScriptBlurEffect-updateSurface";
                                    str6 = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                    vVar3 = vVar;
                                    i11 = 0;
                                    i12 = 0;
                                    i13 = 0;
                                    i14 = 0;
                                    i15 = 0;
                                    int i24 = i13;
                                    i5 = i11;
                                    str = str5;
                                    i9 = i15;
                                    i8 = i24;
                                    i6 = i14;
                                    vVar = vVar3;
                                    i4 = i;
                                    i7 = i12;
                                    str2 = str6;
                                    str7 = "local";
                                    kh.o.u(0, str2);
                                    if (tVar2.i != i4) {
                                        i3 = i5;
                                    } else {
                                        if (f2 > 0.0f) {
                                            kh.o.m(0, "Haze-RenderScriptBlurEffect-updateSurface-applyBlur");
                                            eVar = m0.a;
                                            sVar = new s(vVar, f2, null);
                                            rVar2.A = bVar4;
                                            rVar2.B = r0Var3;
                                            rVar2.C = cVar3;
                                            rVar2.D = bVarC;
                                            rVar2.E = str;
                                            rVar2.F = vVar;
                                            rVar2.G = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                            rVar2.H = f2;
                                            rVar2.I = i4;
                                            rVar2.J = i7;
                                            rVar2.K = i8;
                                            rVar2.L = i5;
                                            rVar2.M = i6;
                                            rVar2.N = i9;
                                            rVar2.Q = 2;
                                            aVar = aVar2;
                                            if (c0.J(sVar, eVar, rVar2) != aVar) {
                                                r0Var2 = r0Var3;
                                                bVar2 = bVar4;
                                                cVar4 = cVar3;
                                                str8 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                                i3 = i5;
                                                vVar4 = vVar;
                                                bVar3 = bVarC;
                                                kh.o.u(0, str8);
                                                kh.o.n("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer");
                                                Bitmap bitmap = vVar4.e;
                                                tVar2 = tVar;
                                                l2.b bVar6 = tVar2.j;
                                                q2 q2Var = o1.n;
                                                r0Var2.getClass();
                                                kotlin.jvm.internal.m.e(q2Var, str7);
                                                bVar6.e(cVar4, (y3.m) b3.m.h(r0Var2.a, q2Var), (((long) bitmap.getWidth()) << c) | (((long) bitmap.getHeight()) & j), new a20.d(bitmap, 9));
                                                Trace.endSection();
                                                bVarC = bVar3;
                                            }
                                        } else {
                                            l2.b bVar7 = tVar2.j;
                                            q2 q2Var2 = o1.n;
                                            r0Var3.getClass();
                                            kotlin.jvm.internal.m.e(q2Var2, str7);
                                            bVar7.e(cVar3, (y3.m) b3.m.h(r0Var3.a, q2Var2), bVarC.u, new a20.d(bVarC, 10));
                                            bVar2 = bVar4;
                                            i3 = i5;
                                        }
                                        bVar4 = bVar2;
                                    }
                                }
                                return aVar;
                            }
                            vVar2 = tVar2.e;
                            if (vVar2 != null) {
                                vVar2.a();
                            }
                            tVar2.e = null;
                            b0Var = b0Var;
                            i3 = 0;
                            kh.o.u(i3, str);
                            throw th;
                        }
                        try {
                            if (!y3.l.b(vVar5.a, j5)) {
                                if (vVar5 != null) {
                                    vVar5.a();
                                }
                                RenderScript renderScript2 = tVar2.d;
                                kotlin.jvm.internal.m.d(renderScript2, "renderScript");
                                vVar5 = new v(renderScript2, j5);
                                tVar2.e = vVar5;
                            }
                            vVar = vVar5;
                            if (tVar2.i == i) {
                                try {
                                    vVar2 = tVar2.e;
                                    if (vVar2 != null) {
                                        vVar2.a();
                                    }
                                    tVar2.e = null;
                                    b0Var = b0Var;
                                    i3 = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    i3 = 0;
                                }
                            } else {
                                str2 = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                i3 = 0;
                                try {
                                    try {
                                        kh.o.m(0, "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface");
                                        try {
                                            Surface surface2 = vVar.c.getSurface();
                                            kotlin.jvm.internal.m.d(surface2, "getSurface(...)");
                                            ze.d.f(surface2, bVarC, cVar3, tVar2.f);
                                            rVar2.A = bVar4;
                                            rVar2.B = r0Var3;
                                            rVar2.C = cVar3;
                                            rVar2.D = bVarC;
                                            rVar2.E = "Haze-RenderScriptBlurEffect-updateSurface";
                                            rVar2.F = vVar;
                                            rVar2.G = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                            f2 = f;
                                            rVar2.H = f2;
                                            rVar2.I = i;
                                            rVar2.J = 0;
                                            rVar2.K = 0;
                                            rVar2.L = 0;
                                            rVar2.M = 0;
                                            rVar2.N = 0;
                                            rVar2.Q = 1;
                                            objK = vVar.f.k(rVar2);
                                            if (objK == aVar2) {
                                                objK = b0Var;
                                            }
                                            if (objK == aVar2) {
                                                aVar = aVar2;
                                            } else {
                                                str5 = "Haze-RenderScriptBlurEffect-updateSurface";
                                                str6 = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                                vVar3 = vVar;
                                                i11 = 0;
                                                i12 = 0;
                                                i13 = 0;
                                                i14 = 0;
                                                i15 = 0;
                                                int i25 = i13;
                                                i5 = i11;
                                                str = str5;
                                                i9 = i15;
                                                i8 = i25;
                                                i6 = i14;
                                                vVar = vVar3;
                                                i4 = i;
                                                i7 = i12;
                                                str2 = str6;
                                                str7 = "local";
                                                kh.o.u(0, str2);
                                                if (tVar2.i != i4) {
                                                    i3 = i5;
                                                } else {
                                                    if (f2 > 0.0f) {
                                                        kh.o.m(0, "Haze-RenderScriptBlurEffect-updateSurface-applyBlur");
                                                        eVar = m0.a;
                                                        sVar = new s(vVar, f2, null);
                                                        rVar2.A = bVar4;
                                                        rVar2.B = r0Var3;
                                                        rVar2.C = cVar3;
                                                        rVar2.D = bVarC;
                                                        rVar2.E = str;
                                                        rVar2.F = vVar;
                                                        rVar2.G = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                                        rVar2.H = f2;
                                                        rVar2.I = i4;
                                                        rVar2.J = i7;
                                                        rVar2.K = i8;
                                                        rVar2.L = i5;
                                                        rVar2.M = i6;
                                                        rVar2.N = i9;
                                                        rVar2.Q = 2;
                                                        aVar = aVar2;
                                                        if (c0.J(sVar, eVar, rVar2) != aVar) {
                                                            r0Var2 = r0Var3;
                                                            bVar2 = bVar4;
                                                            cVar4 = cVar3;
                                                            str8 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                                            i3 = i5;
                                                            vVar4 = vVar;
                                                            bVar3 = bVarC;
                                                            kh.o.u(0, str8);
                                                            kh.o.n("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer");
                                                            Bitmap bitmap2 = vVar4.e;
                                                            tVar2 = tVar;
                                                            l2.b bVar8 = tVar2.j;
                                                            q2 q2Var3 = o1.n;
                                                            r0Var2.getClass();
                                                            kotlin.jvm.internal.m.e(q2Var3, str7);
                                                            bVar8.e(cVar4, (y3.m) b3.m.h(r0Var2.a, q2Var3), (((long) bitmap2.getWidth()) << c) | (((long) bitmap2.getHeight()) & j), new a20.d(bitmap2, 9));
                                                            Trace.endSection();
                                                            bVarC = bVar3;
                                                        }
                                                    } else {
                                                        l2.b bVar9 = tVar2.j;
                                                        q2 q2Var4 = o1.n;
                                                        r0Var3.getClass();
                                                        kotlin.jvm.internal.m.e(q2Var4, str7);
                                                        bVar9.e(cVar3, (y3.m) b3.m.h(r0Var3.a, q2Var4), bVarC.u, new a20.d(bVarC, 10));
                                                        bVar2 = bVar4;
                                                        i3 = i5;
                                                    }
                                                    bVar4 = bVar2;
                                                }
                                            }
                                        } catch (IllegalStateException unused) {
                                            f2 = f;
                                            v vVar6 = tVar2.e;
                                            if (vVar6 != null) {
                                                vVar6.a();
                                            }
                                            tVar2.e = null;
                                            i4 = i;
                                            i5 = 0;
                                            i6 = 0;
                                            i7 = 0;
                                            i8 = 0;
                                            i9 = 0;
                                        }
                                        return aVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str3 = "Haze-RenderScriptBlurEffect-updateSurface";
                                    str4 = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                    i3 = 0;
                                    kh.o.u(0, str4);
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i2 = 0;
                            i3 = i2;
                        }
                        kh.o.u(i3, str);
                        throw th;
                    }
                    b0Var = b0Var;
                    i3 = i2;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                if (bVarC != bVar4) {
                    tVar2.b.a(bVarC);
                }
                throw th6;
            }
        } else if (i18 == 1) {
            int i26 = rVar2.N;
            int i27 = rVar2.M;
            int i28 = rVar2.L;
            int i29 = rVar2.K;
            int i31 = rVar2.J;
            int i32 = rVar2.I;
            float f3 = rVar2.H;
            j = 4294967295L;
            str4 = rVar2.G;
            v vVar7 = rVar2.F;
            c = ' ';
            str3 = rVar2.E;
            l2.b bVar10 = rVar2.D;
            y3.c cVar5 = rVar2.C;
            r0Var3 = rVar2.B;
            bVar4 = rVar2.A;
            try {
                t1.O(obj);
                bVarC = bVar10;
                str6 = str4;
                vVar3 = vVar7;
                str5 = str3;
                i14 = i27;
                i15 = i26;
                i = i32;
                f2 = f3;
                i13 = i29;
                i12 = i31;
                i11 = i28;
                cVar3 = cVar5;
                int i210 = i13;
                i5 = i11;
                str = str5;
                i9 = i15;
                i8 = i210;
                i6 = i14;
                vVar = vVar3;
                i4 = i;
                i7 = i12;
                str2 = str6;
                str7 = "local";
                try {
                    kh.o.u(0, str2);
                    if (tVar2.i != i4) {
                        i3 = i5;
                    } else {
                        if (f2 > 0.0f) {
                            kh.o.m(0, "Haze-RenderScriptBlurEffect-updateSurface-applyBlur");
                            try {
                                eVar = m0.a;
                                try {
                                    sVar = new s(vVar, f2, null);
                                    rVar2.A = bVar4;
                                    rVar2.B = r0Var3;
                                    rVar2.C = cVar3;
                                    rVar2.D = bVarC;
                                    rVar2.E = str;
                                    rVar2.F = vVar;
                                    rVar2.G = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                    rVar2.H = f2;
                                    rVar2.I = i4;
                                    rVar2.J = i7;
                                    rVar2.K = i8;
                                    rVar2.L = i5;
                                    rVar2.M = i6;
                                    rVar2.N = i9;
                                    rVar2.Q = 2;
                                    aVar = aVar2;
                                    if (c0.J(sVar, eVar, rVar2) != aVar) {
                                        r0Var2 = r0Var3;
                                        bVar2 = bVar4;
                                        cVar4 = cVar3;
                                        str8 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                        i3 = i5;
                                        vVar4 = vVar;
                                        bVar3 = bVarC;
                                        kh.o.u(0, str8);
                                        kh.o.n("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer");
                                        Bitmap bitmap3 = vVar4.e;
                                        tVar2 = tVar;
                                        l2.b bVar11 = tVar2.j;
                                        q2 q2Var5 = o1.n;
                                        r0Var2.getClass();
                                        kotlin.jvm.internal.m.e(q2Var5, str7);
                                        bVar11.e(cVar4, (y3.m) b3.m.h(r0Var2.a, q2Var5), (((long) bitmap3.getWidth()) << c) | (((long) bitmap3.getHeight()) & j), new a20.d(bitmap3, 9));
                                        Trace.endSection();
                                        bVarC = bVar3;
                                    }
                                    return aVar;
                                } catch (Throwable th7) {
                                    th = th7;
                                    str8 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                    i3 = i5;
                                    i16 = 0;
                                    bVar3 = bVarC;
                                    kh.o.u(i16, str8);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        } else {
                            l2.b bVar12 = tVar2.j;
                            q2 q2Var6 = o1.n;
                            r0Var3.getClass();
                            kotlin.jvm.internal.m.e(q2Var6, str7);
                            bVar12.e(cVar3, (y3.m) b3.m.h(r0Var3.a, q2Var6), bVarC.u, new a20.d(bVarC, 10));
                            bVar2 = bVar4;
                            i3 = i5;
                        }
                        bVar4 = bVar2;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    i3 = i5;
                }
            } catch (Throwable th10) {
                th = th10;
                i3 = i28;
                try {
                    kh.o.u(0, str4);
                    throw th;
                } catch (Throwable th11) {
                    th = th11;
                    str = str3;
                }
            }
        } else {
            if (i18 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i33 = rVar2.L;
            str8 = rVar2.G;
            vVar4 = rVar2.F;
            str = rVar2.E;
            bVar3 = rVar2.D;
            y3.c cVar6 = rVar2.C;
            r0Var2 = rVar2.B;
            bVar2 = rVar2.A;
            try {
                t1.O(obj);
                i3 = i33;
                b0Var = b0Var;
                str7 = "local";
                j = 4294967295L;
                c = ' ';
                cVar4 = cVar6;
                try {
                    try {
                        kh.o.u(0, str8);
                        kh.o.n("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer");
                        try {
                            Bitmap bitmap4 = vVar4.e;
                            tVar2 = tVar;
                            try {
                                l2.b bVar13 = tVar2.j;
                                q2 q2Var7 = o1.n;
                                r0Var2.getClass();
                                kotlin.jvm.internal.m.e(q2Var7, str7);
                                bVar13.e(cVar4, (y3.m) b3.m.h(r0Var2.a, q2Var7), (((long) bitmap4.getWidth()) << c) | (((long) bitmap4.getHeight()) & j), new a20.d(bitmap4, 9));
                                Trace.endSection();
                                bVarC = bVar3;
                                bVar4 = bVar2;
                            } catch (Throwable th12) {
                                th = th12;
                                Trace.endSection();
                                throw th;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        kh.o.u(i3, str);
                        throw th;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    kh.o.u(i3, str);
                    throw th;
                }
            } catch (Throwable th16) {
                th = th16;
                i3 = i33;
                i16 = 0;
                try {
                    kh.o.u(i16, str8);
                    throw th;
                } catch (Throwable th17) {
                    th = th17;
                }
            }
        }
        kh.o.u(i3, str);
        if (bVarC != bVar4) {
            tVar2.b.a(bVarC);
        }
        return b0Var;
    }

    @Override
    public final void a(r0 context, b1 level) {
        Object objS;
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(level, "level");
        int i = level.A;
        b1 b1Var = b1.UI_HIDDEN;
        if (i >= 40) {
            u1 u1Var = this.g;
            if (u1Var != null) {
                u1Var.i(null);
            }
            v vVar = this.e;
            if (vVar != null) {
                vVar.a();
            }
            this.e = null;
            try {
                objS = RenderScript.create(this.c.getApplicationContext());
            } catch (Throwable th) {
                objS = t1.s(th);
            }
            if (!(objS instanceof g00.m)) {
                RenderScript renderScript = this.d;
                this.d = (RenderScript) objS;
                try {
                    renderScript.destroy();
                } catch (Throwable th2) {
                    t1.s(th2);
                }
            }
            this.i++;
            this.h = true;
            b3.m.m(context.a);
        }
    }

    @Override
    public final void b(o0 o0Var, r0 context) {
        o0 o0Var2;
        u1 u1Var;
        kotlin.jvm.internal.m.e(context, "context");
        n0 n0Var = context.a;
        y3.c cVar = b3.m.y(n0Var).Z;
        long j = n0Var.Y;
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        s0 s0Var = n0Var.S;
        d dVar = this.a;
        dVar.o(s0Var);
        wVar.A = 1.0f;
        kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
        float fK = dVar.k();
        if (Float.isNaN(fK)) {
            fK = 0;
        }
        float fA0 = cVar.A0(fK) * 1.0f;
        wVar2.A = fA0;
        if (fA0 > 25.0f) {
            wVar.A = (25.0f / fA0) * wVar.A;
            wVar2.A = 25.0f;
        }
        if (y3.l.b(this.j.u, 0L) || (u1Var = this.g) == null || !u1Var.a()) {
            this.h = false;
            l2.b bVarO = w00.a.o(o0Var, context, dVar.j(), wVar.A, n0Var.X, j, null);
            o0Var2 = o0Var;
            if (bVarO != null) {
                bVarO.h(dVar.f());
                z zVarP1 = n0Var.p1();
                h40.e eVar = m0.a;
                this.g = c0.y(zVarP1, f40.m.a.F, null, new a1.f(this, bVarO, wVar2, context, cVar, (k00.c) null, 3), 2);
            }
        } else {
            this.h = true;
            o0Var2 = o0Var;
        }
        y yVarW = b3.m.w(n0Var);
        l2.b bVarC = yVarW.c();
        try {
            bVarC.f(dVar.j);
            bVarC.h(dVar.f());
            o0Var2.M0(kh.n.k0(o0Var2.A.b()), bVarC, new q(j, wVar, this, context));
            rd.a.x(o0Var2, bVarC);
        } finally {
            yVarW.a(bVarC);
        }
    }

    @Override
    public final void c() {
        u1 u1Var = this.g;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.b.a(this.j);
        v vVar = this.e;
        if (vVar != null) {
            vVar.a();
        }
        try {
            this.d.destroy();
        } catch (Throwable th) {
            t1.s(th);
        }
    }
}
