package m9;

import a40.e1;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.ui.PlayerView;
import c3.x1;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k9.x0;
import kotlin.NoWhenBranchMatchedException;
import s10.w0;
import u.s0;

public final class f implements Runnable {
    public final int A;
    public final Object B;

    public f(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    private final void a() {
        c7.c cVar = (c7.c) this.B;
        Map mapUnmodifiableMap = null;
        ((AtomicReference) cVar.C).set(null);
        synchronized (cVar) {
            if (((AtomicMarkableReference) cVar.B).isMarked()) {
                qi.e eVar = (qi.e) ((AtomicMarkableReference) cVar.B).getReference();
                synchronized (eVar) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.f13021a));
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) cVar.B;
                atomicMarkableReference.set((qi.e) atomicMarkableReference.getReference(), false);
            }
        }
        if (mapUnmodifiableMap != null) {
            ui.b bVar = (ui.b) cVar.D;
            ((qi.h) bVar.C).h((String) bVar.B, mapUnmodifiableMap, cVar.A);
        }
    }

    private final void b() {
        v5.m mVar = (v5.m) this.B;
        synchronized (mVar.D) {
            try {
                if (mVar.H == null) {
                    return;
                }
                try {
                    v4.g gVarC = mVar.c();
                    int i10 = gVarC.f15457f;
                    if (i10 == 2) {
                        synchronized (mVar.D) {
                        }
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                    }
                    try {
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        tf.x xVar = mVar.C;
                        Context context = mVar.A;
                        xVar.getClass();
                        Typeface typefaceA = q4.d.a(context, new v4.g[]{gVarC}, 0);
                        MappedByteBuffer mappedByteBufferW = w50.c.W(mVar.A, gVarC.f15452a);
                        if (mappedByteBufferW == null || typefaceA == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            p10.a aVar = new p10.a(typefaceA, ta.c0.R(mappedByteBufferW));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (mVar.D) {
                                try {
                                    w00.a aVar2 = mVar.H;
                                    if (aVar2 != null) {
                                        aVar2.D(aVar);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            mVar.b();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    synchronized (mVar.D) {
                        try {
                            w00.a aVar3 = mVar.H;
                            if (aVar3 != null) {
                                aVar3.C(th5);
                            }
                            mVar.b();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    @Override
    public final void run() throws NoWhenBranchMatchedException {
        View viewFindViewById;
        View viewFindFocus;
        long j9;
        long j10;
        float f3;
        long j11;
        long j12;
        float f10;
        u5.f fVar;
        int i10;
        boolean z10;
        long j13;
        long j14;
        ArrayList arrayList;
        u5.b bVarB;
        ArrayList arrayList2;
        int iIndexOf;
        int i11;
        int size;
        long j15;
        long j16;
        int i12;
        u5.e eVar;
        float f11;
        ta.q qVar;
        ta.s sVar;
        ta.z zVar;
        ta.t tVar;
        Runnable runnable;
        float f12;
        switch (this.A) {
            case 0:
                ((h) this.B).d(false);
                return;
            case 1:
                ((u) this.B).s();
                return;
            case 2:
                ((PlayerView) this.B).invalidate();
                return;
            case 3:
                n7.c cVar = (n7.c) this.B;
                if (cVar.C) {
                    return;
                }
                n7.e eVar2 = cVar.B;
                if (eVar2 != null) {
                    eVar2.c(cVar.A);
                }
                cVar.D.f11155n.remove(cVar);
                cVar.C = true;
                return;
            case 4:
                ((n7.b) this.B).c(null);
                return;
            case 5:
                ((o9.f) this.B).n();
                return;
            case 6:
                ((o9.h) this.B).f11811n = -1;
                return;
            case 7:
                ((o9.z) this.B).b();
                return;
            case 8:
                ce.c cVar2 = (ce.c) this.B;
                synchronized (((ArrayDeque) cVar2.E)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar2.B).edit();
                    String str = (String) cVar2.C;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar2.E).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar2.D);
                    }
                    editorEdit.putString(str, sb2.toString()).commit();
                    break;
                }
                return;
            case 9:
                oj.b0 b0Var = (oj.b0) this.B;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + b0Var.f12086a.getAction() + " finishing.");
                b0Var.f12087b.d(null);
                return;
            case 10:
                p7.e eVar3 = (p7.e) this.B;
                synchronized (eVar3.f12381a) {
                    try {
                        if (eVar3.m) {
                            return;
                        }
                        long j17 = eVar3.l - 1;
                        eVar3.l = j17;
                        if (j17 > 0) {
                            return;
                        }
                        if (j17 >= 0) {
                            eVar3.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (eVar3.f12381a) {
                            eVar3.f12392n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 11:
                a();
                return;
            case 12:
                r3.z zVar2 = (r3.z) this.B;
                x0 x0Var = zVar2.f13105b;
                Boolean bool = null;
                zVar2.f13115n = null;
                m1.e eVar4 = zVar2.m;
                View view = zVar2.f13104a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    eVar4.g();
                    return;
                }
                Object[] objArr = eVar4.A;
                int i13 = eVar4.C;
                Boolean boolValueOf = null;
                for (int i14 = 0; i14 < i13; i14++) {
                    r3.y yVar = (r3.y) objArr[i14];
                    int iOrdinal = yVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!kotlin.jvm.internal.m.a(bool, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(yVar == r3.y.C);
                            }
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                eVar4.g();
                if (kotlin.jvm.internal.m.a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) x0Var.C.getValue()).restartInput((View) x0Var.B);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        w0 w0Var = (w0) ((wb.o) x0Var.D).A;
                        View view2 = (View) w0Var.C;
                        WindowInsetsController windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
                        if (windowInsetsController != null) {
                            windowInsetsController.show(WindowInsets.Type.ime());
                        }
                        View view3 = (View) w0Var.B;
                        if (view3 != null) {
                            if (view3.isInEditMode() || view3.onCheckIsTextEditor()) {
                                view3.requestFocus();
                                viewFindViewById = view3;
                            } else {
                                viewFindViewById = view3.getRootView().findFocus();
                            }
                            if (viewFindViewById == null) {
                                viewFindViewById = view3.getRootView().findViewById(R.id.content);
                            }
                            if (viewFindViewById != null && viewFindViewById.hasWindowFocus()) {
                                viewFindViewById.post(new ng.k(viewFindViewById, 1));
                            }
                        }
                    } else {
                        w0 w0Var2 = (w0) ((wb.o) x0Var.D).A;
                        View view4 = (View) w0Var2.C;
                        WindowInsetsController windowInsetsController2 = view4 != null ? view4.getWindowInsetsController() : null;
                        if (windowInsetsController2 != null) {
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() {
                                @Override
                                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController3, int i15) {
                                    atomicBoolean.set((i15 & 8) != 0);
                                }
                            };
                            windowInsetsController2.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                            if (!atomicBoolean.get() && view4 != null) {
                                ((InputMethodManager) view4.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view4.getWindowToken(), 0);
                            }
                            windowInsetsController2.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                            windowInsetsController2.hide(WindowInsets.Type.ime());
                        } else {
                            View view5 = (View) w0Var2.B;
                            if (view5 != null) {
                                ((InputMethodManager) view5.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view5.getWindowToken(), 0);
                            }
                        }
                    }
                }
                if (kotlin.jvm.internal.m.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) x0Var.C.getValue()).restartInput((View) x0Var.B);
                    return;
                }
                return;
            case 13:
                x1 x1Var = (x1) this.B;
                x1Var.f2769b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) x1Var.f2772e;
                p5.c cVar3 = sideSheetBehavior.f4186i;
                if (cVar3 != null && cVar3.f()) {
                    x1Var.b(x1Var.f2770c);
                    return;
                } else {
                    if (sideSheetBehavior.f4185h == 2) {
                        sideSheetBehavior.w(x1Var.f2770c);
                        return;
                    }
                    return;
                }
            case 14:
                u5.b bVar = (u5.b) ((u5.b) this.B).f14949c.B;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = bVar.f14948b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                boolean z11 = false;
                int i15 = 0;
                while (i15 < arrayList3.size()) {
                    u5.e eVar5 = (u5.e) arrayList3.get(i15);
                    if (eVar5 == null) {
                        j13 = jUptimeMillis;
                        j14 = jUptimeMillis2;
                        i10 = i15;
                    } else {
                        s0 s0Var = bVar.f14947a;
                        Long l = (Long) s0Var.get(eVar5);
                        if (l == null) {
                            j9 = eVar5.f14971i;
                            if (j9 == 0) {
                                eVar5.f14971i = jUptimeMillis;
                                eVar5.c(eVar5.f14964b);
                                j13 = jUptimeMillis;
                                j14 = jUptimeMillis2;
                                i10 = i15;
                            } else {
                                j10 = jUptimeMillis - j9;
                                eVar5.f14971i = jUptimeMillis;
                                f3 = u5.e.b().f14953g;
                                if (f3 == 0.0f) {
                                    j11 = 2147483647L;
                                } else {
                                    j11 = (long) (j10 / f3);
                                }
                                j12 = j11;
                                if (eVar5.f14975o) {
                                    f12 = eVar5.f14974n;
                                    if (f12 != Float.MAX_VALUE) {
                                        eVar5.m.f14984i = f12;
                                        eVar5.f14974n = Float.MAX_VALUE;
                                    }
                                    eVar5.f14964b = (float) eVar5.m.f14984i;
                                    eVar5.f14963a = 0.0f;
                                    eVar5.f14975o = z11;
                                    i10 = i15;
                                } else {
                                    if (eVar5.f14974n != Float.MAX_VALUE) {
                                        long j18 = j12 / 2;
                                        gg.e eVarC = eVar5.m.c(eVar5.f14964b, eVar5.f14963a, j18);
                                        u5.f fVar2 = eVar5.m;
                                        fVar2.f14984i = eVar5.f14974n;
                                        eVar5.f14974n = Float.MAX_VALUE;
                                        gg.e eVarC2 = fVar2.c(eVarC.A, eVarC.B, j18);
                                        eVar5.f14964b = eVarC2.A;
                                        eVar5.f14963a = eVarC2.B;
                                    } else {
                                        gg.e eVarC3 = eVar5.m.c(eVar5.f14964b, eVar5.f14963a, j12);
                                        eVar5.f14964b = eVarC3.A;
                                        eVar5.f14963a = eVarC3.B;
                                    }
                                    float fMax = Math.max(eVar5.f14964b, eVar5.f14970h);
                                    eVar5.f14964b = fMax;
                                    float fMin = Math.min(fMax, eVar5.f14969g);
                                    eVar5.f14964b = fMin;
                                    f10 = eVar5.f14963a;
                                    fVar = eVar5.m;
                                    fVar.getClass();
                                    i10 = i15;
                                    if (Math.abs(f10) < fVar.f14980e) {
                                    }
                                    z10 = false;
                                    float fMin2 = Math.min(eVar5.f14964b, eVar5.f14969g);
                                    eVar5.f14964b = fMin2;
                                    float fMax2 = Math.max(fMin2, eVar5.f14970h);
                                    eVar5.f14964b = fMax2;
                                    eVar5.c(fMax2);
                                    if (z10) {
                                        arrayList = eVar5.f14973k;
                                        eVar5.f14968f = false;
                                        bVarB = u5.e.b();
                                        bVarB.f14947a.remove(eVar5);
                                        arrayList2 = bVarB.f14948b;
                                        iIndexOf = arrayList2.indexOf(eVar5);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            bVarB.f14952f = true;
                                        }
                                        eVar5.f14971i = 0L;
                                        eVar5.f14965c = false;
                                        i11 = 0;
                                        while (i11 < arrayList.size()) {
                                            if (arrayList.get(i11) != null) {
                                                ta.p pVar = (ta.p) arrayList.get(i11);
                                                f11 = eVar5.f14964b;
                                                qVar = pVar.f14479a;
                                                sVar = ta.s.f14489t;
                                                zVar = qVar.f14487h;
                                                if (f11 < 1.0f) {
                                                    long j19 = zVar.X;
                                                    j15 = jUptimeMillis;
                                                    ta.t tVarR = zVar.R(0);
                                                    tVar = tVarR.S;
                                                    tVarR.S = null;
                                                    j16 = jUptimeMillis2;
                                                    i12 = i11;
                                                    eVar = eVar5;
                                                    zVar.H(-1L, qVar.f14480a);
                                                    zVar.H(j19, -1L);
                                                    qVar.f14480a = j19;
                                                    runnable = qVar.f14486g;
                                                    if (runnable != null) {
                                                        runnable.run();
                                                    }
                                                    zVar.U.clear();
                                                    if (tVar != null) {
                                                        tVar.A(tVar, sVar, true);
                                                    }
                                                } else {
                                                    j15 = jUptimeMillis;
                                                    j16 = jUptimeMillis2;
                                                    i12 = i11;
                                                    eVar = eVar5;
                                                    zVar.A(zVar, sVar, false);
                                                }
                                                i11 = i12 + 1;
                                                eVar5 = eVar;
                                                jUptimeMillis = j15;
                                                jUptimeMillis2 = j16;
                                            } else {
                                                j15 = jUptimeMillis;
                                                j16 = jUptimeMillis2;
                                                i12 = i11;
                                                eVar = eVar5;
                                            }
                                            i11 = i12 + 1;
                                            eVar5 = eVar;
                                            jUptimeMillis = j15;
                                            jUptimeMillis2 = j16;
                                        }
                                        j13 = jUptimeMillis;
                                        j14 = jUptimeMillis2;
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        j13 = jUptimeMillis;
                                        j14 = jUptimeMillis2;
                                    }
                                }
                                z10 = true;
                                float fMin3 = Math.min(eVar5.f14964b, eVar5.f14969g);
                                eVar5.f14964b = fMin3;
                                float fMax3 = Math.max(fMin3, eVar5.f14970h);
                                eVar5.f14964b = fMax3;
                                eVar5.c(fMax3);
                                if (z10) {
                                    arrayList = eVar5.f14973k;
                                    eVar5.f14968f = false;
                                    bVarB = u5.e.b();
                                    bVarB.f14947a.remove(eVar5);
                                    arrayList2 = bVarB.f14948b;
                                    iIndexOf = arrayList2.indexOf(eVar5);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        bVarB.f14952f = true;
                                    }
                                    eVar5.f14971i = 0L;
                                    eVar5.f14965c = false;
                                    i11 = 0;
                                    while (i11 < arrayList.size()) {
                                        if (arrayList.get(i11) != null) {
                                            ta.p pVar2 = (ta.p) arrayList.get(i11);
                                            f11 = eVar5.f14964b;
                                            qVar = pVar2.f14479a;
                                            sVar = ta.s.f14489t;
                                            zVar = qVar.f14487h;
                                            if (f11 < 1.0f) {
                                                long j110 = zVar.X;
                                                j15 = jUptimeMillis;
                                                ta.t tVarR2 = zVar.R(0);
                                                tVar = tVarR2.S;
                                                tVarR2.S = null;
                                                j16 = jUptimeMillis2;
                                                i12 = i11;
                                                eVar = eVar5;
                                                zVar.H(-1L, qVar.f14480a);
                                                zVar.H(j110, -1L);
                                                qVar.f14480a = j110;
                                                runnable = qVar.f14486g;
                                                if (runnable != null) {
                                                    runnable.run();
                                                }
                                                zVar.U.clear();
                                                if (tVar != null) {
                                                    tVar.A(tVar, sVar, true);
                                                }
                                            } else {
                                                j15 = jUptimeMillis;
                                                j16 = jUptimeMillis2;
                                                i12 = i11;
                                                eVar = eVar5;
                                                zVar.A(zVar, sVar, false);
                                            }
                                            i11 = i12 + 1;
                                            eVar5 = eVar;
                                            jUptimeMillis = j15;
                                            jUptimeMillis2 = j16;
                                        } else {
                                            j15 = jUptimeMillis;
                                            j16 = jUptimeMillis2;
                                            i12 = i11;
                                            eVar = eVar5;
                                        }
                                        i11 = i12 + 1;
                                        eVar5 = eVar;
                                        jUptimeMillis = j15;
                                        jUptimeMillis2 = j16;
                                    }
                                    j13 = jUptimeMillis;
                                    j14 = jUptimeMillis2;
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    j13 = jUptimeMillis;
                                    j14 = jUptimeMillis2;
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            s0Var.remove(eVar5);
                            j9 = eVar5.f14971i;
                            if (j9 == 0) {
                                eVar5.f14971i = jUptimeMillis;
                                eVar5.c(eVar5.f14964b);
                                j13 = jUptimeMillis;
                                j14 = jUptimeMillis2;
                                i10 = i15;
                            } else {
                                j10 = jUptimeMillis - j9;
                                eVar5.f14971i = jUptimeMillis;
                                f3 = u5.e.b().f14953g;
                                if (f3 == 0.0f) {
                                    j11 = 2147483647L;
                                } else {
                                    j11 = (long) (j10 / f3);
                                }
                                j12 = j11;
                                if (eVar5.f14975o) {
                                    f12 = eVar5.f14974n;
                                    if (f12 != Float.MAX_VALUE) {
                                        eVar5.m.f14984i = f12;
                                        eVar5.f14974n = Float.MAX_VALUE;
                                    }
                                    eVar5.f14964b = (float) eVar5.m.f14984i;
                                    eVar5.f14963a = 0.0f;
                                    eVar5.f14975o = z11;
                                    i10 = i15;
                                } else {
                                    if (eVar5.f14974n != Float.MAX_VALUE) {
                                        long j111 = j12 / 2;
                                        gg.e eVarC4 = eVar5.m.c(eVar5.f14964b, eVar5.f14963a, j111);
                                        u5.f fVar3 = eVar5.m;
                                        fVar3.f14984i = eVar5.f14974n;
                                        eVar5.f14974n = Float.MAX_VALUE;
                                        gg.e eVarC5 = fVar3.c(eVarC4.A, eVarC4.B, j111);
                                        eVar5.f14964b = eVarC5.A;
                                        eVar5.f14963a = eVarC5.B;
                                    } else {
                                        gg.e eVarC6 = eVar5.m.c(eVar5.f14964b, eVar5.f14963a, j12);
                                        eVar5.f14964b = eVarC6.A;
                                        eVar5.f14963a = eVarC6.B;
                                    }
                                    float fMax4 = Math.max(eVar5.f14964b, eVar5.f14970h);
                                    eVar5.f14964b = fMax4;
                                    float fMin4 = Math.min(fMax4, eVar5.f14969g);
                                    eVar5.f14964b = fMin4;
                                    f10 = eVar5.f14963a;
                                    fVar = eVar5.m;
                                    fVar.getClass();
                                    i10 = i15;
                                    if (Math.abs(f10) < fVar.f14980e || Math.abs(fMin4 - ((float) fVar.f14984i)) >= fVar.f14979d) {
                                        z10 = false;
                                    } else {
                                        eVar5.f14964b = (float) eVar5.m.f14984i;
                                        eVar5.f14963a = 0.0f;
                                    }
                                    float fMin5 = Math.min(eVar5.f14964b, eVar5.f14969g);
                                    eVar5.f14964b = fMin5;
                                    float fMax5 = Math.max(fMin5, eVar5.f14970h);
                                    eVar5.f14964b = fMax5;
                                    eVar5.c(fMax5);
                                    if (z10) {
                                        arrayList = eVar5.f14973k;
                                        eVar5.f14968f = false;
                                        bVarB = u5.e.b();
                                        bVarB.f14947a.remove(eVar5);
                                        arrayList2 = bVarB.f14948b;
                                        iIndexOf = arrayList2.indexOf(eVar5);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            bVarB.f14952f = true;
                                        }
                                        eVar5.f14971i = 0L;
                                        eVar5.f14965c = false;
                                        i11 = 0;
                                        while (i11 < arrayList.size()) {
                                            if (arrayList.get(i11) != null) {
                                                ta.p pVar3 = (ta.p) arrayList.get(i11);
                                                f11 = eVar5.f14964b;
                                                qVar = pVar3.f14479a;
                                                sVar = ta.s.f14489t;
                                                zVar = qVar.f14487h;
                                                if (f11 < 1.0f) {
                                                    long j112 = zVar.X;
                                                    j15 = jUptimeMillis;
                                                    ta.t tVarR3 = zVar.R(0);
                                                    tVar = tVarR3.S;
                                                    tVarR3.S = null;
                                                    j16 = jUptimeMillis2;
                                                    i12 = i11;
                                                    eVar = eVar5;
                                                    zVar.H(-1L, qVar.f14480a);
                                                    zVar.H(j112, -1L);
                                                    qVar.f14480a = j112;
                                                    runnable = qVar.f14486g;
                                                    if (runnable != null) {
                                                        runnable.run();
                                                    }
                                                    zVar.U.clear();
                                                    if (tVar != null) {
                                                        tVar.A(tVar, sVar, true);
                                                    }
                                                } else {
                                                    j15 = jUptimeMillis;
                                                    j16 = jUptimeMillis2;
                                                    i12 = i11;
                                                    eVar = eVar5;
                                                    zVar.A(zVar, sVar, false);
                                                }
                                                i11 = i12 + 1;
                                                eVar5 = eVar;
                                                jUptimeMillis = j15;
                                                jUptimeMillis2 = j16;
                                            } else {
                                                j15 = jUptimeMillis;
                                                j16 = jUptimeMillis2;
                                                i12 = i11;
                                                eVar = eVar5;
                                            }
                                            i11 = i12 + 1;
                                            eVar5 = eVar;
                                            jUptimeMillis = j15;
                                            jUptimeMillis2 = j16;
                                        }
                                        j13 = jUptimeMillis;
                                        j14 = jUptimeMillis2;
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        j13 = jUptimeMillis;
                                        j14 = jUptimeMillis2;
                                    }
                                }
                                z10 = true;
                                float fMin6 = Math.min(eVar5.f14964b, eVar5.f14969g);
                                eVar5.f14964b = fMin6;
                                float fMax6 = Math.max(fMin6, eVar5.f14970h);
                                eVar5.f14964b = fMax6;
                                eVar5.c(fMax6);
                                if (z10) {
                                    arrayList = eVar5.f14973k;
                                    eVar5.f14968f = false;
                                    bVarB = u5.e.b();
                                    bVarB.f14947a.remove(eVar5);
                                    arrayList2 = bVarB.f14948b;
                                    iIndexOf = arrayList2.indexOf(eVar5);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        bVarB.f14952f = true;
                                    }
                                    eVar5.f14971i = 0L;
                                    eVar5.f14965c = false;
                                    i11 = 0;
                                    while (i11 < arrayList.size()) {
                                        if (arrayList.get(i11) != null) {
                                            ta.p pVar4 = (ta.p) arrayList.get(i11);
                                            f11 = eVar5.f14964b;
                                            qVar = pVar4.f14479a;
                                            sVar = ta.s.f14489t;
                                            zVar = qVar.f14487h;
                                            if (f11 < 1.0f) {
                                                long j113 = zVar.X;
                                                j15 = jUptimeMillis;
                                                ta.t tVarR4 = zVar.R(0);
                                                tVar = tVarR4.S;
                                                tVarR4.S = null;
                                                j16 = jUptimeMillis2;
                                                i12 = i11;
                                                eVar = eVar5;
                                                zVar.H(-1L, qVar.f14480a);
                                                zVar.H(j113, -1L);
                                                qVar.f14480a = j113;
                                                runnable = qVar.f14486g;
                                                if (runnable != null) {
                                                    runnable.run();
                                                }
                                                zVar.U.clear();
                                                if (tVar != null) {
                                                    tVar.A(tVar, sVar, true);
                                                }
                                            } else {
                                                j15 = jUptimeMillis;
                                                j16 = jUptimeMillis2;
                                                i12 = i11;
                                                eVar = eVar5;
                                                zVar.A(zVar, sVar, false);
                                            }
                                            i11 = i12 + 1;
                                            eVar5 = eVar;
                                            jUptimeMillis = j15;
                                            jUptimeMillis2 = j16;
                                        } else {
                                            j15 = jUptimeMillis;
                                            j16 = jUptimeMillis2;
                                            i12 = i11;
                                            eVar = eVar5;
                                        }
                                        i11 = i12 + 1;
                                        eVar5 = eVar;
                                        jUptimeMillis = j15;
                                        jUptimeMillis2 = j16;
                                    }
                                    j13 = jUptimeMillis;
                                    j14 = jUptimeMillis2;
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    j13 = jUptimeMillis;
                                    j14 = jUptimeMillis2;
                                }
                            }
                        } else {
                            j13 = jUptimeMillis;
                            j14 = jUptimeMillis2;
                            i10 = i15;
                        }
                    }
                    i15 = i10 + 1;
                    jUptimeMillis = j13;
                    jUptimeMillis2 = j14;
                    z11 = false;
                }
                if (bVar.f14952f) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0) {
                        w0 w0Var3 = bVar.f14954h;
                        ValueAnimator.unregisterDurationScaleChangeListener((u5.a) w0Var3.B);
                        w0Var3.B = null;
                    }
                    bVar.f14952f = false;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) bVar.f14951e.B).postFrameCallback(new r3.a0(bVar.f14950d, 1));
                    return;
                }
                return;
            case 15:
                ActionMode actionMode = ((v0.f) this.B).f15322h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 16:
                b();
                return;
            case 17:
                ((vg.d) this.B).s(true);
                return;
            case TYPE_SINT64_VALUE:
                vg.k kVar = (vg.k) this.B;
                boolean zIsPopupShowing = kVar.f15656h.isPopupShowing();
                kVar.s(zIsPopupShowing);
                kVar.m = zIsPopupShowing;
                return;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ((TextInputLayout) this.B).E.requestLayout();
                return;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((y7.c) this.B).f16650h.d();
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ((y7.p) this.B).m--;
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                y7.w wVar = (y7.w) this.B;
                wVar.f16741a.postVsyncCallback(wVar);
                return;
            case 23:
                z7.k kVar2 = (z7.k) this.B;
                Surface surface = kVar2.H;
                if (surface != null) {
                    Iterator it2 = kVar2.A.iterator();
                    while (it2.hasNext()) {
                        ((i7.v) it2.next()).A.u(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar2.G;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar2.G = null;
                kVar2.H = null;
                return;
            default:
                e1 e1Var = (e1) this.B;
                if (e1Var != null) {
                    e1Var.i((CancellationException) null);
                    return;
                }
                return;
        }
    }
}
