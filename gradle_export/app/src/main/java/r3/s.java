package r3;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.google.android.gms.internal.measurement.y3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m3.q0;

public final class s implements InputConnection {

    public final o9.q f13084a;

    public final boolean f13085b;

    public int f13086c;

    public w f13087d;

    public int f13088e;

    public boolean f13089f;

    public final ArrayList f13090g = new ArrayList();

    public boolean f13091h = true;

    public s(w wVar, o9.q qVar, boolean z10) {
        this.f13084a = qVar;
        this.f13085b = z10;
        this.f13087d = wVar;
    }

    public final void a(g gVar) {
        this.f13086c++;
        try {
            this.f13090g.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i10 = this.f13086c - 1;
        this.f13086c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f13090g;
            if (!arrayList.isEmpty()) {
                ((z) this.f13084a.B).f13108e.invoke(h00.q.o1(arrayList));
                arrayList.clear();
            }
        }
        return this.f13086c > 0;
    }

    @Override
    public final boolean beginBatchEdit() {
        boolean z10 = this.f13091h;
        if (!z10) {
            return z10;
        }
        this.f13086c++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f13091h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override
    public final void closeConnection() {
        this.f13090g.clear();
        this.f13086c = 0;
        this.f13091h = false;
        ArrayList arrayList = ((z) this.f13084a.B).f13112i;
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
        boolean z10 = this.f13091h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f13091h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f13091h;
        return z10 ? this.f13085b : z10;
    }

    @Override
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f13091h;
        if (z10) {
            a(new a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f13091h;
        if (!z10) {
            return z10;
        }
        a(new e(i10, i11));
        return true;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f13091h;
        if (!z10) {
            return z10;
        }
        a(new f(i10, i11));
        return true;
    }

    @Override
    public final boolean endBatchEdit() {
        return b();
    }

    @Override
    public final boolean finishComposingText() {
        boolean z10 = this.f13091h;
        if (!z10) {
            return z10;
        }
        a(new h());
        return true;
    }

    @Override
    public final int getCursorCapsMode(int i10) {
        w wVar = this.f13087d;
        return TextUtils.getCapsMode(wVar.f13099a.B, q0.g(wVar.f13100b), i10);
    }

    @Override
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f13089f = z10;
        if (z10) {
            this.f13088e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ca.v.H(this.f13087d);
    }

    @Override
    public final Handler getHandler() {
        return null;
    }

    @Override
    public final CharSequence getSelectedText(int i10) {
        if (q0.d(this.f13087d.f13100b)) {
            return null;
        }
        return y3.J(this.f13087d).B;
    }

    @Override
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return y3.K(this.f13087d, i10).B;
    }

    @Override
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return y3.L(this.f13087d, i10).B;
    }

    @Override
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f13091h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new v(0, this.f13087d.f13099a.B.length()));
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
        boolean z10 = this.f13091h;
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
            ((z) this.f13084a.B).f13109f.invoke(new i(i11));
        }
        return z10;
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f13091h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override
    public final boolean requestCursorUpdates(int i10) {
        boolean z10 = this.f13091h;
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
        c cVar = ((z) this.f13084a.B).l;
        synchronized (cVar.f13051c) {
            try {
                cVar.f13054f = z14;
                cVar.f13055g = z15;
                cVar.f13056h = z16;
                cVar.f13057i = z11;
                if (z12) {
                    cVar.f13053e = true;
                    if (cVar.f13058j != null) {
                        cVar.a();
                    }
                }
                cVar.f13052d = z13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f13091h;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((z) this.f13084a.B).f13113j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f13091h;
        if (z10) {
            a(new t(i10, i11));
        }
        return z10;
    }

    @Override
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f13091h;
        if (z10) {
            a(new u(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f13091h;
        if (!z10) {
            return z10;
        }
        a(new v(i10, i11));
        return true;
    }
}
