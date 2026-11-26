package a1;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import c3.c3;
import com.google.android.gms.internal.measurement.y3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

public final class f1 implements InputConnection {

    public final me.i f34a;

    public final boolean f35b;

    public final q0.j1 f36c;

    public final e1.v0 f37d;

    public final c3 f38e;

    public int f39f;

    public r3.w f40g;

    public int f41h;

    public boolean f42i;

    public final ArrayList f43j = new ArrayList();

    public boolean f44k = true;

    public f1(r3.w wVar, me.i iVar, boolean z10, q0.j1 j1Var, e1.v0 v0Var, c3 c3Var) {
        this.f34a = iVar;
        this.f35b = z10;
        this.f36c = j1Var;
        this.f37d = v0Var;
        this.f38e = c3Var;
        this.f40g = wVar;
    }

    public final void a(r3.g gVar) {
        this.f39f++;
        try {
            this.f43j.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i10 = this.f39f - 1;
        this.f39f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f43j;
            if (!arrayList.isEmpty()) {
                ((b1) this.f34a.B).f18c.invoke(h00.q.o1(arrayList));
                arrayList.clear();
            }
        }
        return this.f39f > 0;
    }

    @Override
    public final boolean beginBatchEdit() {
        boolean z10 = this.f44k;
        if (!z10) {
            return z10;
        }
        this.f39f++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f44k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override
    public final void closeConnection() {
        this.f43j.clear();
        this.f39f = 0;
        this.f44k = false;
        ArrayList arrayList = ((b1) this.f34a.B).f25j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.m.a(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f44k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f44k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f44k;
        return z10 ? this.f35b : z10;
    }

    @Override
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f44k;
        if (z10) {
            a(new r3.a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f44k;
        if (!z10) {
            return z10;
        }
        a(new r3.e(i10, i11));
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f44k;
        if (!z10) {
            return z10;
        }
        a(new r3.f(i10, i11));
        return true;
    }

    @Override
    public final boolean endBatchEdit() {
        return b();
    }

    @Override
    public final boolean finishComposingText() {
        boolean z10 = this.f44k;
        if (!z10) {
            return z10;
        }
        a(new r3.h());
        return true;
    }

    @Override
    public final int getCursorCapsMode(int i10) {
        r3.w wVar = this.f40g;
        return TextUtils.getCapsMode(wVar.f13099a.B, m3.q0.g(wVar.f13100b), i10);
    }

    @Override
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f42i = z10;
        if (z10) {
            this.f41h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return x0.g(this.f40g);
    }

    @Override
    public final Handler getHandler() {
        return null;
    }

    @Override
    public final CharSequence getSelectedText(int i10) {
        if (m3.q0.d(this.f40g.f13100b)) {
            return null;
        }
        return y3.J(this.f40g).B;
    }

    @Override
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return y3.K(this.f40g, i10).B;
    }

    @Override
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return y3.L(this.f40g, i10).B;
    }

    @Override
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f44k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new r3.v(0, this.f40g.f13099a.B.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f44k;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
            } else {
                i11 = 1;
            }
            ((b1) this.f34a.B).f19d.invoke(new r3.i(i11));
        }
        return z10;
    }

    @Override
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        m3.h hVar;
        int i10;
        q0.e2 e2VarD;
        q0.e2 e2VarD2;
        if (Build.VERSION.SDK_INT >= 34) {
            e1 e1Var = new e1(this, 0);
            q0.j1 j1Var = this.f36c;
            int iN = 3;
            if (j1Var != null && (hVar = j1Var.f12647j) != null) {
                q0.e2 e2VarD3 = j1Var.d();
                if (hVar.equals(e2VarD3 != null ? e2VarD3.f12608a.f10496a.f10483a : null)) {
                    boolean zS = y.s(handwritingGesture);
                    e1.v0 v0Var = this.f37d;
                    if (zS) {
                        SelectGesture selectGestureN = y.n(handwritingGesture);
                        long jS = x0.s(j1Var, i2.b0.E(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1);
                        if (m3.q0.d(jS)) {
                            iN = x0.n(y.j(selectGestureN), e1Var);
                        } else {
                            e1Var.invoke(new r3.v((int) (jS >> 32), (int) (jS & 4294967295L)));
                            if (v0Var != null) {
                                v0Var.h(true);
                            }
                            iN = 1;
                        }
                    } else if (j0.w(handwritingGesture)) {
                        DeleteGesture deleteGestureO = j0.o(handwritingGesture);
                        int i11 = deleteGestureO.getGranularity() != 1 ? 0 : 1;
                        long jS2 = x0.s(j1Var, i2.b0.E(deleteGestureO.getDeletionArea()), i11);
                        if (m3.q0.d(jS2)) {
                            iN = x0.n(y.j(deleteGestureO), e1Var);
                        } else {
                            x0.B(jS2, hVar, i11 == 1, e1Var);
                            iN = 1;
                        }
                    } else if (j0.B(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureQ = j0.q(handwritingGesture);
                        long jD = x0.d(j1Var, i2.b0.E(selectRangeGestureQ.getSelectionStartArea()), i2.b0.E(selectRangeGestureQ.getSelectionEndArea()), selectRangeGestureQ.getGranularity() != 1 ? 0 : 1);
                        if (m3.q0.d(jD)) {
                            iN = x0.n(y.j(selectRangeGestureQ), e1Var);
                        } else {
                            e1Var.invoke(new r3.v((int) (jD >> 32), (int) (jD & 4294967295L)));
                            if (v0Var != null) {
                                v0Var.h(true);
                            }
                            iN = 1;
                        }
                    } else if (j0.D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureP = j0.p(handwritingGesture);
                        int i12 = deleteRangeGestureP.getGranularity() != 1 ? 0 : 1;
                        long jD2 = x0.d(j1Var, i2.b0.E(deleteRangeGestureP.getDeletionStartArea()), i2.b0.E(deleteRangeGestureP.getDeletionEndArea()), i12);
                        if (m3.q0.d(jD2)) {
                            iN = x0.n(y.j(deleteRangeGestureP), e1Var);
                        } else {
                            x0.B(jD2, hVar, i12 == 1, e1Var);
                            iN = 1;
                        }
                    } else {
                        boolean zA = y.A(handwritingGesture);
                        c3 c3Var = this.f38e;
                        if (zA) {
                            JoinOrSplitGesture joinOrSplitGestureL = y.l(handwritingGesture);
                            if (c3Var == null) {
                                iN = x0.n(y.j(joinOrSplitGestureL), e1Var);
                            } else {
                                long jH = x0.h(joinOrSplitGestureL.getJoinOrSplitPoint());
                                q0.e2 e2VarD4 = j1Var.d();
                                int iQ = e2VarD4 != null ? x0.q(e2VarD4.f12608a.f10497b, jH, j1Var.c(), c3Var) : -1;
                                if (iQ == -1 || ((e2VarD2 = j1Var.d()) != null && x0.e(e2VarD2.f12608a, iQ))) {
                                    iN = x0.n(y.j(joinOrSplitGestureL), e1Var);
                                } else {
                                    long jF = x0.f(hVar, iQ);
                                    if (m3.q0.d(jF)) {
                                        int i13 = (int) (jF >> 32);
                                        e1Var.invoke(new m0(new r3.g[]{new r3.v(i13, i13), new r3.a(" ", 1)}));
                                    } else {
                                        x0.B(jF, hVar, false, e1Var);
                                    }
                                    iN = 1;
                                }
                            }
                        } else if (y.w(handwritingGesture)) {
                            InsertGesture insertGestureK = y.k(handwritingGesture);
                            if (c3Var == null) {
                                iN = x0.n(y.j(insertGestureK), e1Var);
                            } else {
                                long jH2 = x0.h(insertGestureK.getInsertionPoint());
                                q0.e2 e2VarD5 = j1Var.d();
                                int iQ2 = e2VarD5 != null ? x0.q(e2VarD5.f12608a.f10497b, jH2, j1Var.c(), c3Var) : -1;
                                if (iQ2 == -1 || ((e2VarD = j1Var.d()) != null && x0.e(e2VarD.f12608a, iQ2))) {
                                    iN = x0.n(y.j(insertGestureK), e1Var);
                                } else {
                                    e1Var.invoke(new m0(new r3.g[]{new r3.v(iQ2, iQ2), new r3.a(insertGestureK.getTextToInsert(), 1)}));
                                    iN = 1;
                                }
                            }
                        } else if (y.y(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureM = y.m(handwritingGesture);
                            q0.e2 e2VarD6 = j1Var.d();
                            long jB = x0.b(e2VarD6 != null ? e2VarD6.f12608a : null, x0.h(removeSpaceGestureM.getStartPoint()), x0.h(removeSpaceGestureM.getEndPoint()), j1Var.c(), c3Var);
                            if (m3.q0.d(jB)) {
                                iN = x0.n(y.j(removeSpaceGestureM), e1Var);
                            } else {
                                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                                xVar.A = -1;
                                kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                                xVar2.A = -1;
                                String strD = new r30.j("\\s+").d(m3.h0.k(jB, hVar), new l0(xVar, xVar2, 1));
                                int i14 = xVar.A;
                                if (i14 == -1 || (i10 = xVar2.A) == -1) {
                                    iN = x0.n(y.j(removeSpaceGestureM), e1Var);
                                } else {
                                    int i15 = (int) (jB >> 32);
                                    String strSubstring = strD.substring(i14, strD.length() - (m3.q0.e(jB) - xVar2.A));
                                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                    e1Var.invoke(new m0(new r3.g[]{new r3.v(i15 + i14, i15 + i10), new r3.a(strSubstring, 1)}));
                                    iN = 1;
                                }
                            }
                        } else {
                            iN = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new p(intConsumer, iN, 0));
            } else {
                intConsumer.accept(iN);
            }
        }
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f44k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        q0.j1 j1Var;
        m3.h hVar;
        if (Build.VERSION.SDK_INT >= 34 && (j1Var = this.f36c) != null && (hVar = j1Var.f12647j) != null) {
            q0.e2 e2VarD = j1Var.d();
            if (hVar.equals(e2VarD != null ? e2VarD.f12608a.f10496a.f10483a : null)) {
                boolean zS = y.s(previewableHandwritingGesture);
                e1.v0 v0Var = this.f37d;
                if (zS) {
                    SelectGesture selectGestureN = y.n(previewableHandwritingGesture);
                    if (v0Var != null) {
                        long jS = x0.s(j1Var, i2.b0.E(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1);
                        q0.j1 j1Var2 = v0Var.f5018d;
                        if (j1Var2 != null) {
                            j1Var2.f(jS);
                        }
                        q0.j1 j1Var3 = v0Var.f5018d;
                        if (j1Var3 != null) {
                            j1Var3.e(m3.q0.f10518b);
                        }
                        if (!m3.q0.d(jS)) {
                            v0Var.t(false);
                            v0Var.q(q0.z0.A);
                        }
                    }
                } else if (j0.w(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureO = j0.o(previewableHandwritingGesture);
                    if (v0Var != null) {
                        long jS2 = x0.s(j1Var, i2.b0.E(deleteGestureO.getDeletionArea()), deleteGestureO.getGranularity() != 1 ? 0 : 1);
                        q0.j1 j1Var4 = v0Var.f5018d;
                        if (j1Var4 != null) {
                            j1Var4.e(jS2);
                        }
                        q0.j1 j1Var5 = v0Var.f5018d;
                        if (j1Var5 != null) {
                            j1Var5.f(m3.q0.f10518b);
                        }
                        if (!m3.q0.d(jS2)) {
                            v0Var.t(false);
                            v0Var.q(q0.z0.A);
                        }
                    }
                } else if (j0.B(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureQ = j0.q(previewableHandwritingGesture);
                    if (v0Var != null) {
                        long jD = x0.d(j1Var, i2.b0.E(selectRangeGestureQ.getSelectionStartArea()), i2.b0.E(selectRangeGestureQ.getSelectionEndArea()), selectRangeGestureQ.getGranularity() != 1 ? 0 : 1);
                        q0.j1 j1Var6 = v0Var.f5018d;
                        if (j1Var6 != null) {
                            j1Var6.f(jD);
                        }
                        q0.j1 j1Var7 = v0Var.f5018d;
                        if (j1Var7 != null) {
                            j1Var7.e(m3.q0.f10518b);
                        }
                        if (!m3.q0.d(jD)) {
                            v0Var.t(false);
                            v0Var.q(q0.z0.A);
                        }
                    }
                } else if (j0.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureP = j0.p(previewableHandwritingGesture);
                    if (v0Var != null) {
                        long jD2 = x0.d(j1Var, i2.b0.E(deleteRangeGestureP.getDeletionStartArea()), i2.b0.E(deleteRangeGestureP.getDeletionEndArea()), deleteRangeGestureP.getGranularity() != 1 ? 0 : 1);
                        q0.j1 j1Var8 = v0Var.f5018d;
                        if (j1Var8 != null) {
                            j1Var8.e(jD2);
                        }
                        q0.j1 j1Var9 = v0Var.f5018d;
                        if (j1Var9 != null) {
                            j1Var9.f(m3.q0.f10518b);
                        }
                        if (!m3.q0.d(jD2)) {
                            v0Var.t(false);
                            v0Var.q(q0.z0.A);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new k0(v0Var, 1));
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override
    public final boolean requestCursorUpdates(int i10) {
        boolean z10 = this.f44k;
        if (!z10) {
            return z10;
        }
        boolean z11 = false;
        boolean z12 = (i10 & 1) != 0;
        boolean z13 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        boolean z14 = (i10 & 16) != 0;
        boolean z15 = (i10 & 8) != 0;
        boolean z16 = (i10 & 4) != 0;
        if (i11 >= 34 && (i10 & 32) != 0) {
            z11 = true;
        }
        if (!z14 && !z15 && !z16 && !z11) {
            if (i11 >= 34) {
                z11 = true;
                z14 = true;
            } else {
                z14 = true;
            }
            z15 = z14;
            z16 = z15;
        }
        y0 y0Var = ((b1) this.f34a.B).m;
        synchronized (y0Var.f142c) {
            try {
                y0Var.f145f = z14;
                y0Var.f146g = z15;
                y0Var.f147h = z16;
                y0Var.f148i = z11;
                if (z12) {
                    y0Var.f144e = true;
                    if (y0Var.f149j != null) {
                        y0Var.a();
                    }
                }
                y0Var.f143d = z13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f44k;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((b1) this.f34a.B).f26k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f44k;
        if (z10) {
            a(new r3.t(i10, i11));
        }
        return z10;
    }

    @Override
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f44k;
        if (z10) {
            a(new r3.u(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f44k;
        if (!z10) {
            return z10;
        }
        a(new r3.v(i10, i11));
        return true;
    }
}
