package c3;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

public final class i0 implements ViewTranslationCallback {

    public static final i0 f2681a = new i0();

    @Override
    public final boolean onClearTranslation(View view) {
        u00.a aVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        d2.d contentCaptureManager$ui = ((z) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.F = d2.a.A;
        u.l lVarE = contentCaptureManager$ui.e();
        Object[] objArr = lVarE.f14873c;
        long[] jArr = lVarE.f14871a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        u.i0 i0Var = ((j3.t) objArr[(i10 << 3) + i12]).f7971a.f7968d.A;
                        Object objG = i0Var.g(j3.w.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = i0Var.g(j3.n.f7951n);
                            j3.a aVar2 = (j3.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = aVar2.f7927b) != null) {
                            }
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final boolean onHideTranslation(View view) {
        u00.k kVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        d2.d contentCaptureManager$ui = ((z) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.F = d2.a.A;
        u.l lVarE = contentCaptureManager$ui.e();
        Object[] objArr = lVarE.f14873c;
        long[] jArr = lVarE.f14871a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        u.i0 i0Var = ((j3.t) objArr[(i10 << 3) + i12]).f7971a.f7968d.A;
                        Object objG = i0Var.g(j3.w.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, Boolean.TRUE)) {
                            Object objG2 = i0Var.g(j3.n.m);
                            j3.a aVar = (j3.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (kVar = aVar.f7927b) != null) {
                            }
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final boolean onShowTranslation(View view) {
        u00.k kVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        d2.d contentCaptureManager$ui = ((z) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.F = d2.a.B;
        u.l lVarE = contentCaptureManager$ui.e();
        Object[] objArr = lVarE.f14873c;
        long[] jArr = lVarE.f14871a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        u.i0 i0Var = ((j3.t) objArr[(i10 << 3) + i12]).f7971a.f7968d.A;
                        Object objG = i0Var.g(j3.w.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, Boolean.FALSE)) {
                            Object objG2 = i0Var.g(j3.n.m);
                            j3.a aVar = (j3.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (kVar = aVar.f7927b) != null) {
                            }
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
