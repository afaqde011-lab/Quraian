package v5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.common.api.internal.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q3.e0;
import sd.p1;
import tf.w;

public final class g {

    public static final Object f15461j = new Object();

    public static volatile g f15462k;

    public final ReentrantReadWriteLock f15463a;

    public final u.f f15464b;

    public volatile int f15465c;

    public final Handler f15466d;

    public final ki.b f15467e;

    public final f f15468f;

    public final w f15469g;

    public final int f15470h;

    public final b f15471i;

    public g(n nVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f15463a = reentrantReadWriteLock;
        this.f15465c = 3;
        f fVar = (f) nVar.f2462b;
        this.f15468f = fVar;
        int i10 = nVar.f2461a;
        this.f15470h = i10;
        this.f15471i = (b) nVar.f2463c;
        this.f15466d = new Handler(Looper.getMainLooper());
        this.f15464b = new u.f(null);
        this.f15469g = new w(14);
        ki.b bVar = new ki.b(this);
        this.f15467e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f15465c = 0;
            } catch (Throwable th2) {
                this.f15463a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                fVar.a(new c(bVar));
            } catch (Throwable th3) {
                f(th3);
            }
        }
    }

    public static g a() {
        g gVar;
        synchronized (f15461j) {
            try {
                gVar = f15462k;
                if (!(gVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static boolean d() {
        return f15462k != null;
    }

    public final int b(CharSequence charSequence, int i10) {
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        rd.a.i(charSequence, "charSequence cannot be null");
        p1 p1Var = (p1) this.f15467e.f9679a;
        p1Var.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            s[] sVarArr = (s[]) spanned.getSpans(i10, i10 + 1, s.class);
            if (sVarArr.length > 0) {
                return spanned.getSpanStart(sVarArr[0]);
            }
        }
        return ((l) p1Var.C(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new l(i10))).B;
    }

    public final int c() {
        this.f15463a.readLock().lock();
        try {
            return this.f15465c;
        } finally {
            this.f15463a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.f15470h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (c() == 1) {
            return;
        }
        this.f15463a.writeLock().lock();
        try {
            if (this.f15465c == 0) {
                this.f15463a.writeLock().unlock();
                return;
            }
            this.f15465c = 0;
            this.f15463a.writeLock().unlock();
            ki.b bVar = this.f15467e;
            g gVar = (g) bVar.f9680b;
            try {
                gVar.f15468f.a(new c(bVar));
            } catch (Throwable th2) {
                gVar.f(th2);
            }
        } catch (Throwable th3) {
            this.f15463a.writeLock().unlock();
            throw th3;
        }
    }

    public final void f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f15463a.writeLock().lock();
        try {
            this.f15465c = 2;
            arrayList.addAll(this.f15464b);
            this.f15464b.clear();
            this.f15463a.writeLock().unlock();
            this.f15466d.post(new y(arrayList, this.f15465c, th2));
        } catch (Throwable th3) {
            this.f15463a.writeLock().unlock();
            throw th3;
        }
    }

    public final CharSequence g(int i10, int i11, int i12, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th2;
        int i13;
        int i14;
        s[] sVarArr;
        int spanStart;
        if (!(c() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        rd.a.g("start should be <= than end", i10 <= i11);
        t tVar = null;
        if (charSequence == null) {
            return null;
        }
        rd.a.g("start should be < than charSequence length", i10 <= charSequence.length());
        rd.a.g("end should be < than charSequence length", i11 <= charSequence.length());
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        boolean z10 = i12 == 1;
        p1 p1Var = (p1) this.f15467e.f9679a;
        p1Var.getClass();
        boolean z11 = charSequence instanceof q;
        if (z11) {
            ((q) charSequence).a();
        }
        if (z11) {
            tVar = new t((Spannable) charSequence);
            if (tVar != null) {
                for (s sVar : sVarArr) {
                    spanStart = tVar.B.getSpanStart(sVar);
                    int spanEnd = tVar.B.getSpanEnd(sVar);
                    if (spanStart != i11) {
                        tVar.removeSpan(sVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 != i14) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            }
            ((q) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    tVar = new t((Spannable) charSequence);
                } catch (Throwable th3) {
                    th = th3;
                    charSequence2 = charSequence;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((q) charSequence2).b();
                    throw th2;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, s.class) <= i11) {
                tVar = new t();
                tVar.A = false;
                tVar.B = new SpannableString(charSequence);
            }
            if (tVar != null && (sVarArr = (s[]) tVar.B.getSpans(i10, i11, s.class)) != null && sVarArr.length > 0) {
                while (i < r2) {
                    spanStart = tVar.B.getSpanStart(sVar);
                    int spanEnd2 = tVar.B.getSpanEnd(sVar);
                    if (spanStart != i11) {
                        tVar.removeSpan(sVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 != i14 || i13 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    t tVar2 = (t) p1Var.C(charSequence2, i13, i14, Integer.MAX_VALUE, z10, new e0(tVar, (w) p1Var.B, 14));
                    if (tVar2 != null) {
                        Spannable spannable = tVar2.B;
                        if (z11) {
                            ((q) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z11) {
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    if (!z11) {
                        throw th2;
                    }
                    ((q) charSequence2).b();
                    throw th2;
                }
            }
            ((q) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th2 = th5;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th2;
        }
        ((q) charSequence2).b();
        throw th2;
    }

    public final void h(e eVar) {
        rd.a.i(eVar, "initCallback cannot be null");
        this.f15463a.writeLock().lock();
        try {
            if (this.f15465c == 1 || this.f15465c == 2) {
                this.f15466d.post(new y(Arrays.asList(eVar), this.f15465c, (Throwable) null));
            } else {
                this.f15464b.add(eVar);
            }
        } finally {
            this.f15463a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        ki.b bVar = this.f15467e;
        bVar.getClass();
        Bundle bundle = editorInfo.extras;
        w5.b bVar2 = (w5.b) ((p10.a) bVar.f9681c).A;
        int iA = bVar2.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) ((i00.e) bVar2).D).getInt(iA + ((i00.e) bVar2).A) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
