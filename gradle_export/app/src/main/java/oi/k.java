package oi;

import a8.l0;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.z3;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.b0;
import l1.f1;
import l1.g0;
import org.xml.sax.Attributes;
import sd.e2;

public abstract class k {
    public static int A(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("pad")) {
            return 1;
        }
        if (str.equals("reflect")) {
            return 2;
        }
        if (str.equals("repeat")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(str));
    }

    public static int B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
    }

    public static final boolean a(int i10) {
        return !qh.a.a();
    }

    public static final boolean b(int i10) {
        Boolean bool;
        if (qh.a.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                qh.a.f13005a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int c(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static int d(Attributes attributes, int i10) {
        return e2.a(attributes.getLocalName(i10)).ordinal();
    }

    public static a10.l e(Class cls, String str, String str2, int i10, b0 b0Var) {
        return b0Var.f(new kotlin.jvm.internal.p(cls, str, str2, i10));
    }

    public static Object f(b0 b0Var, Class cls, e60.a aVar, b60.a aVar2, g0 g0Var) {
        a10.d dVarB = b0Var.b(cls);
        aVar.getClass();
        kotlin.jvm.internal.m.e(dVarB, "clazz");
        Object objF = aVar.f(dVarB, (a60.a) null, aVar2);
        g0Var.n0(objF);
        return objF;
    }

    public static String g(char c10, String str, String str2) {
        return str + str2 + c10;
    }

    public static String h(String str, int i10, char c10) {
        return str + i10 + c10;
    }

    public static String i(String str, long j9, String str2) {
        return str + j9 + str2;
    }

    public static String j(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String k(String str, t10.h hVar, String str2) {
        return str + hVar + str2;
    }

    public static String l(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, List list, char c10) {
        sb2.append(list);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String o(g0 g0Var, int i10, int i11, g0 g0Var2, boolean z10) {
        g0Var.c0(i10);
        String strU = z3.U(g0Var2, i11);
        g0Var.r(z10);
        return strU;
    }

    public static StringBuilder p(int i10, int i11, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder q(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static NoWhenBranchMatchedException r(g0 g0Var, int i10, boolean z10) {
        g0Var.c0(i10);
        g0Var.r(z10);
        return new NoWhenBranchMatchedException();
    }

    public static f1 s(int i10, g0 g0Var) {
        f1 f1Var = new f1(i10);
        g0Var.n0(f1Var);
        return f1Var;
    }

    public static y3.f t(float f3, g0 g0Var) {
        y3.f fVar = new y3.f(f3);
        g0Var.n0(fVar);
        return fVar;
    }

    public static void u(int i10, int i11, int i12, int i13, int i14) {
        t2.d.a(i10);
        t2.d.a(i11);
        t2.d.a(i12);
        t2.d.a(i13);
        t2.d.a(i14);
    }

    public static void v(SharedPreferences sharedPreferences, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public static void w(androidx.media3.common.s sVar, l0 l0Var) {
        l0Var.f(new androidx.media3.common.t(sVar));
    }

    public static void x(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    executorService.shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static void y(StringBuilder sb2, boolean z10, String str, boolean z11, String str2) {
        sb2.append(z10);
        sb2.append(str);
        sb2.append(z11);
        sb2.append(str2);
    }

    public static void z(ma.c cVar) throws Exception {
        boolean zIsTerminated;
        if (cVar instanceof AutoCloseable) {
            cVar.close();
            return;
        }
        if (!(cVar instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) cVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    executorService.shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }
}
