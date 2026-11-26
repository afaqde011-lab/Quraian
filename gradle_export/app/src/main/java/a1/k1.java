package a1;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
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
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

public final class k1 implements InputConnection {

    public final n f74a;

    public final m1.e f75b = new m1.e(0, new u00.k[16]);

    public final b5.b f76c;

    public k1(n nVar, EditorInfo editorInfo) {
        this.f74a = nVar;
        j1 j1Var = new j1(this, false);
        i1 i1Var = new i1(this);
        if (editorInfo == null) {
            throw new NullPointerException("editorInfo must be non-null");
        }
        this.f76c = new b5.b(j1Var, i1Var);
    }

    public final z0.b a() {
        return ((w2) this.f74a.D).d();
    }

    public final void b(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override
    public final boolean beginBatchEdit() {
        ((oe.o) this.f74a.B).A++;
        return true;
    }

    @Override
    public final boolean clearMetaKeyStates(int i10) {
        return false;
    }

    @Override
    public final void closeConnection() {
        this.f75b.g();
    }

    @Override
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return this.f76c.commitContent(inputContentInfo, i10, bundle);
    }

    @Override
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override
    public final boolean commitText(CharSequence charSequence, int i10) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.f74a.i(new r0(charSequence.toString(), i10, 0));
        return true;
    }

    @Override
    public final boolean deleteSurroundingText(int i10, int i11) {
        n nVar = this.f74a;
        nVar.i(new p0(i10, i11, nVar, 1));
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        this.f74a.i(new o0(i10, i11, 0));
        return true;
    }

    @Override
    public final boolean endBatchEdit() {
        return ((oe.o) this.f74a.B).e();
    }

    @Override
    public final boolean finishComposingText() {
        this.f74a.i(new s0(0));
        return true;
    }

    @Override
    public final int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(a(), m3.q0.g(a().D), i10);
    }

    @Override
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        Objects.toString(extractedTextRequest);
        z0.b bVarA = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = bVarA;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = bVarA.C.length();
        extractedText.partialStartOffset = -1;
        long j9 = bVarA.D;
        extractedText.selectionStart = m3.q0.g(j9);
        extractedText.selectionEnd = m3.q0.f(j9);
        extractedText.flags = !r30.k.B0(bVarA, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override
    public final Handler getHandler() {
        return null;
    }

    @Override
    public final CharSequence getSelectedText(int i10) {
        if (m3.q0.d(a().D)) {
            return null;
        }
        z0.b bVarA = a();
        return bVarA.C.subSequence(m3.q0.g(bVarA.D), m3.q0.f(bVarA.D)).toString();
    }

    @Override
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        z0.b bVarA = a();
        long j9 = bVarA.D;
        CharSequence charSequence = bVarA.C;
        int iF = m3.q0.f(j9);
        int iF2 = m3.q0.f(bVarA.D);
        int length = iF2 + i10;
        if (((iF2 ^ length) & (i10 ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iF, Math.min(length, charSequence.length())).toString();
    }

    @Override
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        z0.b bVarA = a();
        int iG = m3.q0.g(bVarA.D);
        int i12 = iG - i10;
        if (((i10 ^ iG) & (iG ^ i12)) < 0) {
            i12 = 0;
        }
        return bVarA.C.subSequence(Math.max(0, i12), m3.q0.g(bVarA.D)).toString();
    }

    @Override
    public final boolean performContextMenuAction(int i10) {
        int i11 = 0;
        switch (i10) {
            case R.id.selectAll:
                n nVar = this.f74a;
                nVar.i(new p0(nVar, i11, a().C.length(), 0));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    @Override
    public final boolean performEditorAction(int i10) {
        int i11;
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
                    i11 = 1;
                    break;
            }
        } else {
            i11 = 1;
        }
        u00.k kVar = (u00.k) this.f74a.F;
        if (kVar != null) {
            kVar.invoke(new r3.i(i11));
        }
        return true;
    }

    @Override
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i10;
        m3.n0 n0VarC;
        int i11;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 34) {
            return;
        }
        int iM = 2;
        if (i12 >= 34) {
            n nVar = this.f74a;
            w2 w2Var = (w2) nVar.D;
            s2 s2Var = (s2) nVar.I;
            u00.a aVar = (u00.a) nVar.J;
            c3 c3Var = (c3) nVar.K;
            if (y.s(handwritingGesture)) {
                SelectGesture selectGestureN = y.n(handwritingGesture);
                long jR = x0.r(s2Var, i2.b0.E(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() == 1 ? 1 : 0);
                if (m3.q0.d(jR)) {
                    iM = x0.m(w2Var, y.j(selectGestureN));
                } else {
                    w2Var.j(jR);
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    iM = 1;
                }
            } else if (j0.w(handwritingGesture)) {
                DeleteGesture deleteGestureO = j0.o(handwritingGesture);
                i11 = deleteGestureO.getGranularity() == 1 ? 1 : 0;
                long jR2 = x0.r(s2Var, i2.b0.E(deleteGestureO.getDeletionArea()), i11);
                if (m3.q0.d(jR2)) {
                    iM = x0.m(w2Var, y.j(deleteGestureO));
                } else {
                    if (i11 == 1) {
                        jR2 = x0.a(jR2, w2Var.d());
                    }
                    w2.i(w2Var, RuntimeVersion.SUFFIX, jR2, false, 12);
                    iM = 1;
                }
            } else if (j0.B(handwritingGesture)) {
                SelectRangeGesture selectRangeGestureQ = j0.q(handwritingGesture);
                long jC = x0.c(s2Var, i2.b0.E(selectRangeGestureQ.getSelectionStartArea()), i2.b0.E(selectRangeGestureQ.getSelectionEndArea()), selectRangeGestureQ.getGranularity() == 1 ? 1 : 0);
                if (m3.q0.d(jC)) {
                    iM = x0.m(w2Var, y.j(selectRangeGestureQ));
                } else {
                    w2Var.j(jC);
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    iM = 1;
                }
            } else if (j0.D(handwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureP = j0.p(handwritingGesture);
                i11 = deleteRangeGestureP.getGranularity() == 1 ? 1 : 0;
                long jC2 = x0.c(s2Var, i2.b0.E(deleteRangeGestureP.getDeletionStartArea()), i2.b0.E(deleteRangeGestureP.getDeletionEndArea()), i11);
                if (m3.q0.d(jC2)) {
                    iM = x0.m(w2Var, y.j(deleteRangeGestureP));
                } else {
                    if (i11 == 1) {
                        jC2 = x0.a(jC2, w2Var.d());
                    }
                    w2.i(w2Var, RuntimeVersion.SUFFIX, jC2, false, 12);
                    iM = 1;
                }
            } else if (y.A(handwritingGesture)) {
                JoinOrSplitGesture joinOrSplitGestureL = y.l(handwritingGesture);
                if (w2Var.f135a.d() != w2Var.f135a.d()) {
                    iM = 3;
                } else {
                    long jH = x0.h(joinOrSplitGestureL.getJoinOrSplitPoint());
                    m3.n0 n0VarC2 = s2Var.c();
                    int iQ = n0VarC2 != null ? x0.q(n0VarC2.f10497b, jH, s2Var.e(), c3Var) : -1;
                    if (iQ == -1 || ((n0VarC = s2Var.c()) != null && x0.e(n0VarC, iQ))) {
                        iM = x0.m(w2Var, y.j(joinOrSplitGestureL));
                    } else {
                        long jF = x0.f(w2Var.d(), iQ);
                        if (m3.q0.d(jF)) {
                            w2.i(w2Var, " ", jF, false, 12);
                        } else {
                            w2.i(w2Var, RuntimeVersion.SUFFIX, jF, false, 12);
                        }
                        iM = 1;
                    }
                }
            } else if (y.w(handwritingGesture)) {
                InsertGesture insertGestureK = y.k(handwritingGesture);
                long jH2 = x0.h(insertGestureK.getInsertionPoint());
                m3.n0 n0VarC3 = s2Var.c();
                int iQ2 = n0VarC3 != null ? x0.q(n0VarC3.f10497b, jH2, s2Var.e(), c3Var) : -1;
                if (iQ2 == -1) {
                    iM = x0.m(w2Var, y.j(insertGestureK));
                } else {
                    w2.i(w2Var, insertGestureK.getTextToInsert(), m3.h0.b(iQ2, iQ2), false, 12);
                    iM = 1;
                }
            } else if (y.y(handwritingGesture)) {
                RemoveSpaceGesture removeSpaceGestureM = y.m(handwritingGesture);
                long jB = x0.b(s2Var.c(), x0.h(removeSpaceGestureM.getStartPoint()), x0.h(removeSpaceGestureM.getEndPoint()), s2Var.e(), c3Var);
                if (m3.q0.d(jB)) {
                    iM = x0.m(w2Var, y.j(removeSpaceGestureM));
                } else {
                    kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                    xVar.A = -1;
                    kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                    xVar2.A = -1;
                    String strD = new r30.j("\\s+").d(m3.h0.k(jB, w2Var.d()), new l0(xVar, xVar2, 0));
                    int i13 = xVar.A;
                    if (i13 == -1 || (i10 = xVar2.A) == -1) {
                        iM = x0.m(w2Var, y.j(removeSpaceGestureM));
                    } else {
                        int i14 = (int) (jB >> 32);
                        long jB2 = m3.h0.b(i13 + i14, i14 + i10);
                        String strSubstring = strD.substring(xVar.A, strD.length() - (m3.q0.e(jB) - xVar2.A));
                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                        w2.i(w2Var, strSubstring, jB2, false, 12);
                        iM = 1;
                    }
                }
            }
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new p(intConsumer, iM, 1));
        } else {
            intConsumer.accept(iM);
        }
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.f76c.performPrivateCommand(str, bundle);
    }

    @Override
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34 && i10 >= 34) {
            n nVar = this.f74a;
            w2 w2Var = (w2) nVar.D;
            s2 s2Var = (s2) nVar.I;
            if (y.s(previewableHandwritingGesture)) {
                SelectGesture selectGestureN = y.n(previewableHandwritingGesture);
                x0.t(w2Var, x0.r(s2Var, i2.b0.E(selectGestureN.getSelectionArea()), selectGestureN.getGranularity() != 1 ? 0 : 1), 0);
            } else if (j0.w(previewableHandwritingGesture)) {
                DeleteGesture deleteGestureO = j0.o(previewableHandwritingGesture);
                x0.t(w2Var, x0.r(s2Var, i2.b0.E(deleteGestureO.getDeletionArea()), deleteGestureO.getGranularity() == 1 ? 1 : 0), 1);
            } else if (j0.B(previewableHandwritingGesture)) {
                SelectRangeGesture selectRangeGestureQ = j0.q(previewableHandwritingGesture);
                x0.t(w2Var, x0.c(s2Var, i2.b0.E(selectRangeGestureQ.getSelectionStartArea()), i2.b0.E(selectRangeGestureQ.getSelectionEndArea()), selectRangeGestureQ.getGranularity() != 1 ? 0 : 1), 0);
            } else if (j0.D(previewableHandwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureP = j0.p(previewableHandwritingGesture);
                x0.t(w2Var, x0.c(s2Var, i2.b0.E(deleteRangeGestureP.getDeletionStartArea()), i2.b0.E(deleteRangeGestureP.getDeletionEndArea()), deleteRangeGestureP.getGranularity() == 1 ? 1 : 0), 1);
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new k0(w2Var, 0));
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override
    public final boolean requestCursorUpdates(int i10) {
        CursorAnchorInfo cursorAnchorInfoA;
        b0 b0Var = (b0) this.f74a.H;
        boolean z10 = false;
        boolean z11 = (i10 & 1) != 0;
        boolean z12 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        boolean z13 = (i10 & 16) != 0;
        boolean z14 = (i10 & 8) != 0;
        boolean z15 = (i10 & 4) != 0;
        if (i11 >= 34 && (i10 & 32) != 0) {
            z10 = true;
        }
        if (!z13 && !z14 && !z15 && !z10) {
            if (i11 >= 34) {
                z10 = true;
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = z13;
            z15 = z14;
        }
        b0Var.f5a = z13;
        b0Var.f6b = z14;
        b0Var.f7c = z15;
        b0Var.f8d = z10;
        if (z11 && (cursorAnchorInfoA = b0Var.a()) != null) {
            l9.f0 f0Var = (l9.f0) b0Var.f11g;
            f0Var.p().updateCursorAnchorInfo((View) f0Var.B, cursorAnchorInfoA);
        }
        k00.c cVar = null;
        if (!z12) {
            a40.u1 u1Var = (a40.u1) b0Var.f13i;
            if (u1Var != null) {
                u1Var.i((CancellationException) null);
            }
            b0Var.f13i = null;
            return true;
        }
        a40.u1 u1Var2 = (a40.u1) b0Var.f13i;
        if (u1Var2 != null && u1Var2.a()) {
            return true;
        }
        b0Var.f13i = a40.c0.y((a40.z) b0Var.f12h, (k00.i) null, a40.a0.D, new a0(b0Var, cVar, 0), 1);
        return true;
    }

    @Override
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        l9.f0 f0Var = (l9.f0) this.f74a.E;
        f0Var.p().dispatchKeyEventFromInputMethod((View) f0Var.B, keyEvent);
        return true;
    }

    @Override
    public final boolean setComposingRegion(int i10, int i11) {
        n nVar = this.f74a;
        nVar.i(new p0(i10, i11, nVar, 2));
        return true;
    }

    @Override
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        m3.i0 i0Var;
        q3.i xVar;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String string = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj instanceof BackgroundColorSpan) {
                    i0Var = new m3.i0(0L, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, i2.b0.c(((BackgroundColorSpan) obj).getBackgroundColor()), (x3.l) null, (i2.s0) null, 63487);
                } else if (obj instanceof ForegroundColorSpan) {
                    i0Var = new m3.i0(i2.b0.c(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (i2.s0) null, 65534);
                } else if (obj instanceof StrikethroughSpan) {
                    i0Var = new m3.i0(0L, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, x3.l.f16419d, (i2.s0) null, 61439);
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        i0Var = new m3.i0(0L, 0L, q3.u.M, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (i2.s0) null, 65531);
                    } else if (style == 2) {
                        i0Var = new m3.i0(0L, 0L, (q3.u) null, new q3.o(1), (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (i2.s0) null, 65527);
                    } else if (style != 3) {
                        i0Var = null;
                    } else {
                        i0Var = new m3.i0(0L, 0L, q3.u.M, new q3.o(1), (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (i2.s0) null, 65523);
                    }
                } else if (obj instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                    String family = typefaceSpan.getFamily();
                    if (kotlin.jvm.internal.m.a(family, "cursive")) {
                        xVar = q3.i.E;
                    } else if (kotlin.jvm.internal.m.a(family, "monospace")) {
                        xVar = q3.i.D;
                    } else if (kotlin.jvm.internal.m.a(family, "sans-serif")) {
                        xVar = q3.i.B;
                    } else if (kotlin.jvm.internal.m.a(family, "serif")) {
                        xVar = q3.i.C;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 == null || family2.length() == 0) {
                            xVar = null;
                        } else {
                            Typeface typefaceCreate = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (kotlin.jvm.internal.m.a(typefaceCreate, typeface) || kotlin.jvm.internal.m.a(typefaceCreate, Typeface.create(typeface, 0))) {
                                typefaceCreate = null;
                            }
                            if (typefaceCreate != null) {
                                xVar = new q3.x(new o10.b(typefaceCreate, 21));
                            } else {
                                xVar = null;
                            }
                        }
                    }
                    i0Var = new m3.i0(0L, 0L, (q3.u) null, (q3.o) null, (q3.p) null, xVar, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (i2.s0) null, 65503);
                } else if (obj instanceof UnderlineSpan) {
                    i0Var = new m3.i0(0L, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, x3.l.f16418c, (i2.s0) null, 61439);
                } else {
                    i0Var = null;
                }
                if (i0Var != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new m3.f(i0Var, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
                }
            }
            arrayList = arrayList2;
        }
        this.f74a.i(new q0(string, arrayList, i10, 0));
        return true;
    }

    @Override
    public final boolean setSelection(int i10, int i11) {
        n nVar = this.f74a;
        nVar.i(new p0(nVar, i10, i11, 0));
        ((u00.k) nVar.G).invoke(Boolean.FALSE);
        return true;
    }
}
