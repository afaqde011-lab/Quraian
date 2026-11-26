package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import java.util.concurrent.CancellationException;

public abstract class p0 {
    public static Object f(p0 p0Var, Context context, int i10, m00.c cVar) {
        p0Var.getClass();
        if (h2.f4638a.get()) {
            Trace.beginAsyncSection("GlanceAppWidget::update", 0);
        }
        Object objB = p0Var.b(context, new h(i10), null, new o0(4, null, 0), cVar);
        return objB == l00.a.A ? objB : g00.b0.a;
    }

    public final Object a(Context context, int i10, m00.c cVar) throws Throwable {
        l0 l0Var;
        h hVar;
        h hVar2;
        Throwable th2;
        Context context2;
        int i11;
        h hVar3;
        Throwable th3;
        Context context3;
        m6.f fVar;
        String strI;
        Context context4;
        m6.f fVar2;
        String strI2;
        Context context5;
        m6.f fVar3;
        String strI3;
        Context context6;
        StringBuilder sb2;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i12 = l0Var.G;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                l0Var.G = i12 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object obj = l0Var.E;
        g00.b0 b0Var = l00.a.A;
        int i13 = l0Var.G;
        g00.b0 b0Var2 = g00.b0.a;
        m6.h hVar4 = m6.h.f10569a;
        switch (i13) {
            case 0:
                ri.t1.O(obj);
                hVar = new h(i10);
                l6.n nVar = l6.o.f10044a;
                d0.i2 i2Var = new d0.i2(hVar, (k00.c) null, 7);
                l0Var.A = context;
                l0Var.B = hVar;
                l0Var.D = i10;
                l0Var.G = 1;
                nVar.getClass();
                if (l6.n.a(nVar, i2Var, l0Var) != b0Var) {
                    try {
                        l0Var.A = context;
                        l0Var.B = hVar;
                        l0Var.D = i10;
                        l0Var.G = 2;
                        if (b0Var2 != b0Var) {
                            context2 = context;
                            hVar3 = hVar;
                            fVar3 = m6.f.f10566a;
                            strI3 = w.i(i10);
                            l0Var.A = context2;
                            l0Var.B = hVar3;
                            l0Var.G = 3;
                            if (fVar3.a(context2, hVar4, strI3, l0Var) != b0Var) {
                                context6 = context2;
                                if (hVar3 != null && !w.l(hVar3)) {
                                    try {
                                        a10.h0.r(context6, w.n(hVar3.f4631a)).delete();
                                    } catch (Exception e3) {
                                        e = e3;
                                        sb2 = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                        sb2.append(hVar3);
                                        Log.d("GlanceAppWidget", sb2.toString(), e);
                                    }
                                    break;
                                }
                                return b0Var2;
                            }
                        }
                    } catch (CancellationException unused) {
                        context2 = context;
                        hVar3 = hVar;
                        fVar2 = m6.f.f10566a;
                        strI2 = w.i(i10);
                        l0Var.A = context2;
                        l0Var.B = hVar3;
                        l0Var.G = 4;
                        if (fVar2.a(context2, hVar4, strI2, l0Var) != b0Var) {
                            context5 = context2;
                            if (hVar3 != null) {
                                try {
                                    a10.h0.r(context5, w.n(hVar3.f4631a)).delete();
                                } catch (Exception e10) {
                                    e = e10;
                                    sb2 = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                    sb2.append(hVar3);
                                    Log.d("GlanceAppWidget", sb2.toString(), e);
                                }
                                break;
                            }
                            return b0Var2;
                        }
                    } catch (Throwable th4) {
                        int i14 = i10;
                        hVar2 = hVar;
                        th2 = th4;
                        context2 = context;
                        i11 = i14;
                        try {
                            Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th2);
                            fVar = m6.f.f10566a;
                            strI = w.i(i11);
                            l0Var.A = context2;
                            l0Var.B = hVar2;
                            l0Var.G = 5;
                            if (fVar.a(context2, hVar4, strI, l0Var) != b0Var) {
                                hVar3 = hVar2;
                                context4 = context2;
                                if (hVar3 != null) {
                                    try {
                                        a10.h0.r(context4, w.n(hVar3.f4631a)).delete();
                                    } catch (Exception e11) {
                                        e = e11;
                                        sb2 = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                        sb2.append(hVar3);
                                        Log.d("GlanceAppWidget", sb2.toString(), e);
                                    }
                                    break;
                                }
                                return b0Var2;
                            }
                        } catch (Throwable th5) {
                            m6.f fVar4 = m6.f.f10566a;
                            String strI4 = w.i(i11);
                            l0Var.A = context2;
                            l0Var.B = hVar2;
                            l0Var.C = th5;
                            l0Var.G = 6;
                            if (fVar4.a(context2, hVar4, strI4, l0Var) != b0Var) {
                                th3 = th5;
                                context3 = context2;
                                if (hVar2 != null) {
                                    throw th3;
                                }
                                throw th3;
                            }
                        }
                    }
                }
                return b0Var;
            case 1:
                i10 = l0Var.D;
                h hVar5 = l0Var.B;
                Context context7 = l0Var.A;
                ri.t1.O(obj);
                hVar = hVar5;
                context = context7;
                l0Var.A = context;
                l0Var.B = hVar;
                l0Var.D = i10;
                l0Var.G = 2;
                if (b0Var2 != b0Var) {
                    context2 = context;
                    hVar3 = hVar;
                    fVar3 = m6.f.f10566a;
                    strI3 = w.i(i10);
                    l0Var.A = context2;
                    l0Var.B = hVar3;
                    l0Var.G = 3;
                    if (fVar3.a(context2, hVar4, strI3, l0Var) != b0Var) {
                        context6 = context2;
                        if (hVar3 != null) {
                            a10.h0.r(context6, w.n(hVar3.f4631a)).delete();
                            break;
                        }
                        return b0Var2;
                    }
                }
                return b0Var;
            case 2:
                i11 = l0Var.D;
                hVar2 = l0Var.B;
                context2 = l0Var.A;
                try {
                    ri.t1.O(obj);
                    i10 = i11;
                    hVar3 = hVar2;
                    fVar3 = m6.f.f10566a;
                    strI3 = w.i(i10);
                    l0Var.A = context2;
                    l0Var.B = hVar3;
                    l0Var.G = 3;
                    if (fVar3.a(context2, hVar4, strI3, l0Var) != b0Var) {
                        context6 = context2;
                        if (hVar3 != null) {
                            a10.h0.r(context6, w.n(hVar3.f4631a)).delete();
                            break;
                        }
                        return b0Var2;
                    }
                } catch (CancellationException unused2) {
                    i10 = i11;
                    hVar3 = hVar2;
                    fVar2 = m6.f.f10566a;
                    strI2 = w.i(i10);
                    l0Var.A = context2;
                    l0Var.B = hVar3;
                    l0Var.G = 4;
                    if (fVar2.a(context2, hVar4, strI2, l0Var) != b0Var) {
                        context5 = context2;
                        if (hVar3 != null) {
                            a10.h0.r(context5, w.n(hVar3.f4631a)).delete();
                            break;
                        }
                        return b0Var2;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th2);
                    fVar = m6.f.f10566a;
                    strI = w.i(i11);
                    l0Var.A = context2;
                    l0Var.B = hVar2;
                    l0Var.G = 5;
                    if (fVar.a(context2, hVar4, strI, l0Var) != b0Var) {
                        hVar3 = hVar2;
                        context4 = context2;
                        if (hVar3 != null) {
                            a10.h0.r(context4, w.n(hVar3.f4631a)).delete();
                            break;
                        }
                        return b0Var2;
                    }
                }
                return b0Var;
            case 3:
                hVar3 = l0Var.B;
                context6 = l0Var.A;
                ri.t1.O(obj);
                if (hVar3 != null) {
                    a10.h0.r(context6, w.n(hVar3.f4631a)).delete();
                    break;
                }
                return b0Var2;
            case 4:
                hVar3 = l0Var.B;
                context5 = l0Var.A;
                ri.t1.O(obj);
                if (hVar3 != null && !w.l(hVar3)) {
                    a10.h0.r(context5, w.n(hVar3.f4631a)).delete();
                    break;
                }
                return b0Var2;
            case 5:
                hVar3 = l0Var.B;
                context4 = l0Var.A;
                ri.t1.O(obj);
                if (hVar3 != null && !w.l(hVar3)) {
                    a10.h0.r(context4, w.n(hVar3.f4631a)).delete();
                    break;
                }
                return b0Var2;
            case 6:
                th3 = l0Var.C;
                hVar2 = l0Var.B;
                context3 = l0Var.A;
                ri.t1.O(obj);
                if (hVar2 != null || w.l(hVar2)) {
                    throw th3;
                }
                try {
                    a10.h0.r(context3, w.n(hVar2.f4631a)).delete();
                    throw th3;
                } catch (Exception e12) {
                    Log.d("GlanceAppWidget", "Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id " + hVar2, e12);
                    throw th3;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object b(Context context, h hVar, Bundle bundle, u00.p pVar, m00.c cVar) {
        l6.n nVar = l6.o.f10044a;
        m0 m0Var = new m0(context, hVar, this, bundle, pVar, null);
        nVar.getClass();
        return l6.n.a(nVar, m0Var, cVar);
    }

    public abstract f2 c();

    public abstract void d(Context context, h hVar, a1.e2 e2Var);

    public abstract void e(Context context, int i10, e eVar);
}
