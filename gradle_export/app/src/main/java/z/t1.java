package z;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

public final class t1 extends b3.l implements b3.o {
    public final j Q;
    public final d0 R;
    public RenderNode S;

    public t1(v2.j0 j0Var, j jVar, d0 d0Var) {
        this.Q = jVar;
        this.R = d0Var;
        B1(j0Var);
    }

    public static boolean E1(float f3, EdgeEffect edgeEffect, Canvas canvas) {
        if (f3 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f3);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode F1() {
        RenderNode renderNode = this.S;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.S = renderNode2;
        return renderNode2;
    }

    @Override
    public final void i(b3.o0 o0Var) {
        char c10;
        boolean zE1;
        float f3;
        float distance;
        float distance2;
        float distance3;
        float distance4;
        k2.b bVar = o0Var.A;
        long jB = bVar.b();
        j jVar = this.Q;
        boolean zA = h2.e.a(jVar.f16934g, 0L);
        boolean zA2 = h2.e.a(jB, jVar.f16934g);
        jVar.f16934g = jB;
        if (!zA2) {
            d0 d0Var = jVar.f16930c;
            long jF = (((long) w00.a.F(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (((long) w00.a.F(Float.intBitsToFloat((int) (jB >> 32)))) << 32);
            d0Var.f16902c = jF;
            EdgeEffect edgeEffect = d0Var.f16903d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jF >> 32), (int) (jF & 4294967295L));
            }
            EdgeEffect edgeEffect2 = d0Var.f16904e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jF >> 32), (int) (jF & 4294967295L));
            }
            EdgeEffect edgeEffect3 = d0Var.f16905f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jF & 4294967295L), (int) (jF >> 32));
            }
            EdgeEffect edgeEffect4 = d0Var.f16906g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jF & 4294967295L), (int) (jF >> 32));
            }
            EdgeEffect edgeEffect5 = d0Var.f16907h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jF >> 32), (int) (jF & 4294967295L));
            }
            EdgeEffect edgeEffect6 = d0Var.f16908i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jF >> 32), (int) (jF & 4294967295L));
            }
            EdgeEffect edgeEffect7 = d0Var.f16909j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jF & 4294967295L), (int) (jF >> 32));
            }
            EdgeEffect edgeEffect8 = d0Var.f16910k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jF & 4294967295L), (int) (jF >> 32));
            }
        }
        if (!zA && !zA2) {
            jVar.e();
        }
        Canvas canvasA = i2.b.a(bVar.B.n());
        jVar.f16931d.getValue();
        if (h2.e.f(bVar.b())) {
            o0Var.a();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        d0 d0Var2 = this.R;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect9 = d0Var2.f16903d;
            if (edgeEffect9 != null) {
                edgeEffect9.finish();
            }
            EdgeEffect edgeEffect10 = d0Var2.f16904e;
            if (edgeEffect10 != null) {
                edgeEffect10.finish();
            }
            EdgeEffect edgeEffect11 = d0Var2.f16905f;
            if (edgeEffect11 != null) {
                edgeEffect11.finish();
            }
            EdgeEffect edgeEffect12 = d0Var2.f16906g;
            if (edgeEffect12 != null) {
                edgeEffect12.finish();
            }
            EdgeEffect edgeEffect13 = d0Var2.f16907h;
            if (edgeEffect13 != null) {
                edgeEffect13.finish();
            }
            EdgeEffect edgeEffect14 = d0Var2.f16908i;
            if (edgeEffect14 != null) {
                edgeEffect14.finish();
            }
            EdgeEffect edgeEffect15 = d0Var2.f16909j;
            if (edgeEffect15 != null) {
                edgeEffect15.finish();
            }
            EdgeEffect edgeEffect16 = d0Var2.f16910k;
            if (edgeEffect16 != null) {
                edgeEffect16.finish();
            }
            o0Var.a();
            return;
        }
        float fA0 = o0Var.A0(x.f16972a);
        boolean z10 = d0.f(d0Var2.f16903d) || d0.g(d0Var2.f16907h) || d0.f(d0Var2.f16904e) || d0.g(d0Var2.f16908i);
        boolean z11 = d0.f(d0Var2.f16905f) || d0.g(d0Var2.f16909j) || d0.f(d0Var2.f16906g) || d0.g(d0Var2.f16910k);
        if (z10 && z11) {
            c10 = ' ';
            F1().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else {
            c10 = ' ';
            if (z10) {
                F1().setPosition(0, 0, (w00.a.F(fA0) * 2) + canvasA.getWidth(), canvasA.getHeight());
            } else {
                if (!z11) {
                    o0Var.a();
                    return;
                }
                F1().setPosition(0, 0, canvasA.getWidth(), (w00.a.F(fA0) * 2) + canvasA.getHeight());
            }
        }
        RecordingCanvas recordingCanvasBeginRecording = F1().beginRecording();
        if (d0.g(d0Var2.f16909j)) {
            EdgeEffect edgeEffectA = d0Var2.f16909j;
            if (edgeEffectA == null) {
                edgeEffectA = d0Var2.a(d0.q1.B);
                d0Var2.f16909j = edgeEffectA;
            }
            E1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (d0.f(d0Var2.f16905f)) {
            EdgeEffect edgeEffectC = d0Var2.c();
            zE1 = E1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (d0.g(d0Var2.f16905f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jVar.f() & 4294967295L));
                EdgeEffect edgeEffectA2 = d0Var2.f16909j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = d0Var2.a(d0.q1.B);
                    d0Var2.f16909j = edgeEffectA2;
                }
                try {
                    distance4 = edgeEffectC.getDistance();
                } catch (Throwable unused) {
                    distance4 = 0.0f;
                }
                float f10 = 1 - fIntBitsToFloat;
                try {
                    edgeEffectA2.onPullDistance(distance4, f10);
                } catch (Throwable unused2) {
                    edgeEffectA2.onPull(distance4, f10);
                }
            }
        } else {
            zE1 = false;
        }
        if (d0.g(d0Var2.f16907h)) {
            EdgeEffect edgeEffectA3 = d0Var2.f16907h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = d0Var2.a(d0.q1.A);
                d0Var2.f16907h = edgeEffectA3;
            }
            E1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (d0.f(d0Var2.f16903d)) {
            EdgeEffect edgeEffectE = d0Var2.e();
            zE1 = E1(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zE1;
            if (d0.g(d0Var2.f16903d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jVar.f() >> c10));
                EdgeEffect edgeEffectA4 = d0Var2.f16907h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = d0Var2.a(d0.q1.A);
                    d0Var2.f16907h = edgeEffectA4;
                }
                try {
                    distance3 = edgeEffectE.getDistance();
                } catch (Throwable unused3) {
                    distance3 = 0.0f;
                }
                try {
                    edgeEffectA4.onPullDistance(distance3, fIntBitsToFloat2);
                } catch (Throwable unused4) {
                    edgeEffectA4.onPull(distance3, fIntBitsToFloat2);
                }
            }
        }
        if (d0.g(d0Var2.f16910k)) {
            EdgeEffect edgeEffectA5 = d0Var2.f16910k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = d0Var2.a(d0.q1.B);
                d0Var2.f16910k = edgeEffectA5;
            }
            E1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (d0.f(d0Var2.f16906g)) {
            EdgeEffect edgeEffectD = d0Var2.d();
            zE1 = E1(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zE1;
            if (d0.g(d0Var2.f16906g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jVar.f() & 4294967295L));
                EdgeEffect edgeEffectA6 = d0Var2.f16910k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = d0Var2.a(d0.q1.B);
                    d0Var2.f16910k = edgeEffectA6;
                }
                try {
                    distance2 = edgeEffectD.getDistance();
                } catch (Throwable unused5) {
                    distance2 = 0.0f;
                }
                try {
                    edgeEffectA6.onPullDistance(distance2, fIntBitsToFloat3);
                } catch (Throwable unused6) {
                    edgeEffectA6.onPull(distance2, fIntBitsToFloat3);
                }
            }
        }
        if (d0.g(d0Var2.f16908i)) {
            EdgeEffect edgeEffectA7 = d0Var2.f16908i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = d0Var2.a(d0.q1.A);
                d0Var2.f16908i = edgeEffectA7;
            }
            f3 = 0.0f;
            E1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f3 = 0.0f;
        }
        if (d0.f(d0Var2.f16904e)) {
            EdgeEffect edgeEffectB = d0Var2.b();
            boolean z12 = E1(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zE1;
            if (d0.g(d0Var2.f16904e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jVar.f() >> c10));
                EdgeEffect edgeEffectA8 = d0Var2.f16908i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = d0Var2.a(d0.q1.A);
                    d0Var2.f16908i = edgeEffectA8;
                }
                try {
                    distance = edgeEffectB.getDistance();
                } catch (Throwable unused7) {
                    distance = f3;
                }
                float f11 = 1 - fIntBitsToFloat4;
                try {
                    edgeEffectA8.onPullDistance(distance, f11);
                } catch (Throwable unused8) {
                    edgeEffectA8.onPull(distance, f11);
                }
            }
            zE1 = z12;
        }
        if (zE1) {
            jVar.g();
        }
        float f12 = z11 ? f3 : fA0;
        if (z10) {
            fA0 = f3;
        }
        y3.m layoutDirection = o0Var.getLayoutDirection();
        i2.a aVar = new i2.a();
        aVar.f7106a = recordingCanvasBeginRecording;
        long jB2 = bVar.b();
        y3.c cVarO = bVar.B.o();
        y3.m mVarP = bVar.B.p();
        i2.s sVarN = bVar.B.n();
        long jQ = bVar.B.q();
        a1.i iVar = bVar.B;
        l2.b bVar2 = (l2.b) iVar.C;
        iVar.z(o0Var);
        iVar.B(layoutDirection);
        iVar.y(aVar);
        iVar.C(jB2);
        iVar.C = null;
        aVar.i();
        try {
            ((hf.c) o0Var.A.B.B).I(f12, fA0);
            try {
                o0Var.a();
                float f13 = -f12;
                float f14 = -fA0;
                ((hf.c) o0Var.A.B.B).I(f13, f14);
                aVar.q();
                a1.i iVar2 = bVar.B;
                iVar2.z(cVarO);
                iVar2.B(mVarP);
                iVar2.y(sVarN);
                iVar2.C(jQ);
                iVar2.C = bVar2;
                F1().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f13, f14);
                canvasA.drawRenderNode(F1());
                canvasA.restoreToCount(iSave);
            } catch (Throwable th2) {
                ((hf.c) o0Var.A.B.B).I(-f12, -fA0);
                throw th2;
            }
        } catch (Throwable th3) {
            aVar.q();
            a1.i iVar3 = bVar.B;
            iVar3.z(cVarO);
            iVar3.B(mVarP);
            iVar3.y(sVarN);
            iVar3.C(jQ);
            iVar3.C = bVar2;
            throw th3;
        }
    }
}
