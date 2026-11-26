package r3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import i2.h0;
import k9.x0;
import m3.n0;
import m3.q0;

public final class c {

    public final c3.z f13049a;

    public final x0 f13050b;

    public boolean f13052d;

    public boolean f13053e;

    public boolean f13054f;

    public boolean f13055g;

    public boolean f13056h;

    public boolean f13057i;

    public w f13058j;

    public n0 f13059k;
    public p l;

    public h2.c f13060n;

    public h2.c f13061o;

    public final Object f13051c = new Object();
    public u00.k m = b.C;

    public final CursorAnchorInfo.Builder f13062p = new CursorAnchorInfo.Builder();

    public final float[] f13063q = h0.a();

    public final Matrix f13064r = new Matrix();

    public c(c3.z zVar, x0 x0Var) {
        this.f13049a = zVar;
        this.f13050b = x0Var;
    }

    public final void a() {
        CursorAnchorInfo.Builder builder;
        x0 x0Var = this.f13050b;
        ?? r4 = x0Var.C;
        InputMethodManager inputMethodManager = (InputMethodManager) r4.getValue();
        View view = (View) x0Var.B;
        if (inputMethodManager.isActive(view)) {
            u00.k kVar = this.m;
            float[] fArr = this.f13063q;
            kVar.invoke(new h0(fArr));
            this.f13049a.r(fArr);
            Matrix matrix = this.f13064r;
            i2.b0.w(matrix, fArr);
            w wVar = this.f13058j;
            kotlin.jvm.internal.m.b(wVar);
            long j9 = wVar.f13100b;
            p pVar = this.l;
            kotlin.jvm.internal.m.b(pVar);
            n0 n0Var = this.f13059k;
            kotlin.jvm.internal.m.b(n0Var);
            m3.q qVar = n0Var.f10497b;
            h2.c cVar = this.f13060n;
            kotlin.jvm.internal.m.b(cVar);
            float f3 = cVar.f6549d;
            float f10 = cVar.f6547b;
            h2.c cVar2 = this.f13061o;
            kotlin.jvm.internal.m.b(cVar2);
            boolean z10 = this.f13054f;
            boolean z11 = this.f13055g;
            boolean z12 = this.f13056h;
            boolean z13 = this.f13057i;
            CursorAnchorInfo.Builder builder2 = this.f13062p;
            builder2.reset();
            builder2.setMatrix(matrix);
            q0 q0Var = wVar.f13101c;
            int iG = q0.g(j9);
            builder2.setSelectionRange(iG, q0.f(j9));
            if (!z10 || iG < 0) {
                builder = builder2;
            } else {
                int iZ = pVar.z(iG);
                h2.c cVarC = n0Var.c(iZ);
                float fX = ab.a0.x(cVarC.f6546a, 0.0f, (int) (n0Var.f10498c >> 32));
                boolean zV = bi.b.v(cVar, fX, cVarC.f6547b);
                boolean zV2 = bi.b.v(cVar, fX, cVarC.f6549d);
                boolean z14 = n0Var.a(iZ) == x3.j.B;
                int i10 = (zV || zV2) ? 1 : 0;
                if (!zV || !zV2) {
                    i10 |= 2;
                }
                if (z14) {
                    i10 |= 4;
                }
                float f11 = cVarC.f6547b;
                float f12 = cVarC.f6549d;
                builder2.setInsertionMarkerLocation(fX, f11, f12, f12, i10);
                builder = builder2;
            }
            if (z11) {
                int iG2 = q0Var != null ? q0.g(q0Var.f10520a) : -1;
                int iF = q0Var != null ? q0.f(q0Var.f10520a) : -1;
                if (iG2 >= 0 && iG2 < iF) {
                    builder.setComposingText(iG2, wVar.f13099a.B.subSequence(iG2, iF));
                    int iZ2 = pVar.z(iG2);
                    int iZ3 = pVar.z(iF);
                    float[] fArr2 = new float[(iZ3 - iZ2) * 4];
                    qVar.a(fArr2, m3.h0.b(iZ2, iZ3));
                    while (iG2 < iF) {
                        int iZ4 = pVar.z(iG2);
                        int i11 = (iZ4 - iZ2) * 4;
                        float f13 = fArr2[i11];
                        float f14 = fArr2[i11 + 1];
                        CursorAnchorInfo.Builder builder3 = builder;
                        float f15 = fArr2[i11 + 2];
                        float f16 = fArr2[i11 + 3];
                        int i12 = iF;
                        int i13 = (cVar.f6546a < f15 ? 1 : 0) & (f13 < cVar.f6548c ? 1 : 0) & (f10 < f16 ? 1 : 0) & (f14 < f3 ? 1 : 0);
                        if (!bi.b.v(cVar, f13, f14) || !bi.b.v(cVar, f15, f16)) {
                            i13 |= 2;
                        }
                        if (n0Var.a(iZ4) == x3.j.B) {
                            i13 |= 4;
                        }
                        int i14 = iG2;
                        builder3.addCharacterBounds(i14, f13, f14, f15, f16, i13);
                        builder = builder3;
                        iG2 = i14 + 1;
                        iF = i12;
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (z12) {
                builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(i2.b0.A(cVar2)).setHandwritingBounds(i2.b0.A(cVar2)).build());
            }
            if (i15 >= 34 && z13 && !cVar.g()) {
                int i16 = qVar.f10515f - 1;
                if (i16 < 0) {
                    i16 = 0;
                }
                int iY = ab.a0.y(qVar.e(f10), 0, i16);
                int iY2 = ab.a0.y(qVar.e(f3), 0, i16);
                if (iY <= iY2) {
                    while (true) {
                        builder.addVisibleLineBounds(n0Var.f(iY), qVar.f(iY), n0Var.g(iY), qVar.b(iY));
                        if (iY == iY2) {
                            break;
                        } else {
                            iY++;
                        }
                    }
                }
            }
            ((InputMethodManager) r4.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f13053e = false;
        }
    }
}
