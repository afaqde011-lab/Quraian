package a1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import com.google.android.gms.internal.measurement.y3;

public final class b0 {

    public boolean f5a;

    public boolean f6b;

    public boolean f7c;

    public boolean f8d;

    public final Object f9e;

    public final Object f10f;

    public final Object f11g;

    public final Object f12h;

    public Object f13i;

    public final Object f14j;

    public final Object f15k;
    public final Object l;

    public b0(w2 w2Var, s2 s2Var, l9.f0 f0Var, a40.z zVar) {
        this.f9e = w2Var;
        this.f10f = s2Var;
        this.f11g = f0Var;
        this.f12h = zVar;
        this.f14j = new CursorAnchorInfo.Builder();
        this.f15k = i2.h0.a();
        this.l = new Matrix();
    }

    public b0(l60.n0 n0Var) {
        this.f9e = n0Var.b;
        this.f10f = n0Var.c;
        this.f11g = n0Var.a.c;
        this.f12h = n0Var.o;
        this.f13i = n0Var.s;
        this.f14j = n0Var.t;
        this.f15k = n0Var.u;
        this.f5a = n0Var.p;
        this.f6b = n0Var.q;
        this.f7c = n0Var.r;
        this.l = n0Var.w;
        this.f8d = n0Var.x;
    }

    public CursorAnchorInfo a() {
        z2.a0 a0Var;
        z2.a0 a0VarB;
        m3.n0 n0VarC;
        Matrix matrix = (Matrix) this.l;
        float[] fArr = (float[]) this.f15k;
        s2 s2Var = (s2) this.f10f;
        z2.a0 a0VarE = s2Var.e();
        if (a0VarE != null) {
            if (!a0VarE.A()) {
                a0VarE = null;
            }
            if (a0VarE != null && (a0Var = (z2.a0) s2Var.f119d.getValue()) != null) {
                if (!a0Var.A()) {
                    a0Var = null;
                }
                if (a0Var != null && (a0VarB = s2Var.b()) != null) {
                    if (!a0VarB.A()) {
                        a0VarB = null;
                    }
                    if (a0VarB != null && (n0VarC = s2Var.c()) != null) {
                        z0.b bVarD = ((w2) this.f9e).d();
                        i2.h0.d(fArr);
                        a0VarE.k(fArr);
                        i2.b0.w(matrix, fArr);
                        h2.c cVarJ = y3.Y(a0Var).j(a0VarE.V(a0Var, 0L));
                        h2.c cVarJ2 = y3.Y(a0VarB).j(a0VarE.V(a0VarB, 0L));
                        CursorAnchorInfo.Builder builder = (CursorAnchorInfo.Builder) this.f14j;
                        long j9 = bVarD.D;
                        m3.q0 q0Var = bVarD.E;
                        boolean z10 = this.f5a;
                        boolean z11 = this.f6b;
                        boolean z12 = this.f7c;
                        boolean z13 = this.f8d;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iG = m3.q0.g(j9);
                        builder.setSelectionRange(iG, m3.q0.f(j9));
                        if (z10 && iG >= 0) {
                            h2.c cVarC = n0VarC.c(iG);
                            float fX = ab.a0.x(cVarC.f6546a, 0.0f, (int) (n0VarC.f10498c >> 32));
                            boolean zK = x0.k(cVarJ, fX, cVarC.f6547b);
                            boolean zK2 = x0.k(cVarJ, fX, cVarC.f6549d);
                            boolean z14 = n0VarC.a(iG) == x3.j.B;
                            int i10 = (zK || zK2) ? 1 : 0;
                            if (!zK || !zK2) {
                                i10 |= 2;
                            }
                            if (z14) {
                                i10 |= 4;
                            }
                            float f3 = cVarC.f6547b;
                            float f10 = cVarC.f6549d;
                            builder.setInsertionMarkerLocation(fX, f3, f10, f10, i10);
                        }
                        if (z11) {
                            int iG2 = q0Var != null ? m3.q0.g(q0Var.f10520a) : -1;
                            int iF = q0Var != null ? m3.q0.f(q0Var.f10520a) : -1;
                            if (iG2 >= 0 && iG2 < iF) {
                                builder.setComposingText(iG2, bVarD.C.subSequence(iG2, iF));
                                float[] fArr2 = new float[(iF - iG2) * 4];
                                n0VarC.f10497b.a(fArr2, m3.h0.b(iG2, iF));
                                int i11 = iG2;
                                while (iG2 < iF) {
                                    int i12 = (iG2 - i11) * 4;
                                    float f11 = fArr2[i12];
                                    float f12 = fArr2[i12 + 1];
                                    float f13 = fArr2[i12 + 2];
                                    float f14 = fArr2[i12 + 3];
                                    int i13 = (cVarJ.f6546a < f13 ? 1 : 0) & (f11 < cVarJ.f6548c ? 1 : 0) & (cVarJ.f6547b < f14 ? 1 : 0) & (f12 < cVarJ.f6549d ? 1 : 0);
                                    if (!x0.k(cVarJ, f11, f12) || !x0.k(cVarJ, f13, f14)) {
                                        i13 |= 2;
                                    }
                                    boolean z15 = z13;
                                    if (n0VarC.a(iG2) == x3.j.B) {
                                        i13 |= 4;
                                    }
                                    builder.addCharacterBounds(iG2, f11, f12, f13, f14, i13);
                                    iG2++;
                                    z13 = z15;
                                }
                            }
                        }
                        boolean z16 = z13;
                        int i14 = Build.VERSION.SDK_INT;
                        if (z12) {
                            builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(i2.b0.A(cVarJ2)).setHandwritingBounds(i2.b0.A(cVarJ2)).build());
                        }
                        if (i14 >= 34 && z16) {
                            x0.i(builder, n0VarC, cVarJ);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
