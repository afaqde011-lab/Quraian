package v4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.v;
import kh.o;
import u.s;
import u.s0;

public abstract class f {

    public static final s f15448a = new s(16);

    public static final ThreadPoolExecutor f15449b;

    public static final Object f15450c;

    public static final s0 f15451d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new i());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f15449b = threadPoolExecutor;
        f15450c = new Object();
        f15451d = new s0(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((c) list.get(i11)).f15440g);
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static e b(String str, Context context, List list, int i10) {
        int i11;
        Typeface typefaceA;
        s sVar = f15448a;
        o.n("getFontSync");
        try {
            Typeface typeface = (Typeface) sVar.c(str);
            if (typeface != null) {
                e eVar = new e(typeface);
                Trace.endSection();
                return eVar;
            }
            try {
                v vVarA = b.a(context, list);
                List list2 = vVarA.f8541b;
                int i12 = vVarA.f8540a;
                if (i12 == 0) {
                    g[] gVarArr = (g[]) list2.get(0);
                    if (gVarArr == null || gVarArr.length == 0) {
                        i11 = 1;
                    } else {
                        int length = gVarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                i11 = 0;
                                break;
                            }
                            int i14 = gVarArr[i13].f15457f;
                            if (i14 != 0) {
                                if (i14 >= 0) {
                                    i11 = i14;
                                    break;
                                }
                                i11 = -3;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        i11 = -3;
                        break;
                    }
                    i11 = -2;
                }
                if (i11 != 0) {
                    e eVar2 = new e(i11);
                    Trace.endSection();
                    return eVar2;
                }
                if (list2.size() > 1) {
                    q4.e eVar3 = q4.d.f12761a;
                    o.n("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceA = q4.d.f12761a.O(context, list2, i10);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } else {
                    typefaceA = q4.d.a(context, (g[]) list2.get(0), i10);
                }
                if (typefaceA == null) {
                    e eVar4 = new e(-3);
                    Trace.endSection();
                    return eVar4;
                }
                sVar.d(str, typefaceA);
                e eVar5 = new e(typefaceA);
                Trace.endSection();
                return eVar5;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar6 = new e(-1);
                Trace.endSection();
                return eVar6;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
