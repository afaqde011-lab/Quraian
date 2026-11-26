package a1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;

public final class y0 {

    public final e f140a;

    public final u0 f141b;

    public boolean f143d;

    public boolean f144e;

    public boolean f145f;

    public boolean f146g;

    public boolean f147h;

    public boolean f148i;

    public r3.w f149j;

    public m3.n0 f150k;
    public r3.p l;
    public h2.c m;

    public h2.c f151n;

    public final Object f142c = new Object();

    public final CursorAnchorInfo.Builder f152o = new CursorAnchorInfo.Builder();

    public final float[] f153p = i2.h0.a();

    public final Matrix f154q = new Matrix();

    public y0(e eVar, u0 u0Var) {
        this.f140a = eVar;
        this.f141b = u0Var;
    }

    public final void a() {
        u0 u0Var = this.f141b;
        InputMethodManager inputMethodManagerI = u0Var.I();
        View view = (View) u0Var.B;
        if (!inputMethodManagerI.isActive(view) || this.f149j == null || this.l == null || this.f150k == null || this.m == null || this.f151n == null) {
            return;
        }
        float[] fArr = this.f153p;
        i2.h0.d(fArr);
        z2.a0 a0Var = (z2.a0) this.f140a.A.R.getValue();
        if (a0Var != null) {
            if (!a0Var.A()) {
                a0Var = null;
            }
            if (a0Var != null) {
                a0Var.k(fArr);
            }
        }
        h2.c cVar = this.f151n;
        kotlin.jvm.internal.m.b(cVar);
        float f3 = -cVar.f6546a;
        h2.c cVar2 = this.f151n;
        kotlin.jvm.internal.m.b(cVar2);
        i2.h0.f(fArr, f3, -cVar2.f6547b);
        Matrix matrix = this.f154q;
        i2.b0.w(matrix, fArr);
        r3.w wVar = this.f149j;
        kotlin.jvm.internal.m.b(wVar);
        long j9 = wVar.f13100b;
        r3.p pVar = this.l;
        kotlin.jvm.internal.m.b(pVar);
        m3.n0 n0Var = this.f150k;
        kotlin.jvm.internal.m.b(n0Var);
        h2.c cVar3 = this.m;
        kotlin.jvm.internal.m.b(cVar3);
        h2.c cVar4 = this.f151n;
        kotlin.jvm.internal.m.b(cVar4);
        boolean z10 = this.f145f;
        boolean z11 = this.f146g;
        boolean z12 = this.f147h;
        boolean z13 = this.f148i;
        CursorAnchorInfo.Builder builder = this.f152o;
        builder.reset();
        builder.setMatrix(matrix);
        m3.q0 q0Var = wVar.f13101c;
        int iG = m3.q0.g(j9);
        builder.setSelectionRange(iG, m3.q0.f(j9));
        if (z10 && iG >= 0) {
            int iZ = pVar.z(iG);
            h2.c cVarC = n0Var.c(iZ);
            float fX = ab.a0.x(cVarC.f6546a, 0.0f, (int) (n0Var.f10498c >> 32));
            boolean zK = x0.k(cVar3, fX, cVarC.f6547b);
            boolean zK2 = x0.k(cVar3, fX, cVarC.f6549d);
            boolean z14 = n0Var.a(iZ) == x3.j.B;
            int i10 = (zK || zK2) ? 1 : 0;
            if (!zK || !zK2) {
                i10 |= 2;
            }
            if (z14) {
                i10 |= 4;
            }
            int i11 = i10;
            float f10 = cVarC.f6547b;
            float f11 = cVarC.f6549d;
            builder.setInsertionMarkerLocation(fX, f10, f11, f11, i11);
        }
        if (z11) {
            int iG2 = q0Var != null ? m3.q0.g(q0Var.f10520a) : -1;
            int iF = q0Var != null ? m3.q0.f(q0Var.f10520a) : -1;
            if (iG2 >= 0 && iG2 < iF) {
                builder.setComposingText(iG2, wVar.f13099a.B.subSequence(iG2, iF));
                int iZ2 = pVar.z(iG2);
                int iZ3 = pVar.z(iF);
                float[] fArr2 = new float[(iZ3 - iZ2) * 4];
                n0Var.f10497b.a(fArr2, m3.h0.b(iZ2, iZ3));
                while (iG2 < iF) {
                    int iZ4 = pVar.z(iG2);
                    int i12 = (iZ4 - iZ2) * 4;
                    float f12 = fArr2[i12];
                    float f13 = fArr2[i12 + 1];
                    int i13 = iF;
                    float f14 = fArr2[i12 + 2];
                    float f15 = fArr2[i12 + 3];
                    int i14 = iZ2;
                    int i15 = (cVar3.f6546a < f14 ? 1 : 0) & (f12 < cVar3.f6548c ? 1 : 0) & (cVar3.f6547b < f15 ? 1 : 0) & (f13 < cVar3.f6549d ? 1 : 0);
                    if (!x0.k(cVar3, f12, f13) || !x0.k(cVar3, f14, f15)) {
                        i15 |= 2;
                    }
                    if (n0Var.a(iZ4) == x3.j.B) {
                        i15 |= 4;
                    }
                    int i16 = iG2;
                    builder.addCharacterBounds(i16, f12, f13, f14, f15, i15);
                    iG2 = i16 + 1;
                    iF = i13;
                    iZ2 = i14;
                }
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (z12) {
            builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(i2.b0.A(cVar4)).setHandwritingBounds(i2.b0.A(cVar4)).build());
        }
        if (i17 >= 34 && z13) {
            x0.i(builder, n0Var, cVar3);
        }
        u0Var.I().updateCursorAnchorInfo(view, builder.build());
        this.f144e = false;
    }
}
