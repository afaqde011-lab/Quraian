package ba;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public final class p implements Runnable {
    public static final ThreadLocal E = new ThreadLocal();
    public static final m F = new m(0);
    public long B;
    public long C;
    public final ArrayList A = new ArrayList();
    public final ArrayList D = new ArrayList();

    public static f1 c(RecyclerView recyclerView, int i10, long j9) {
        int iC = recyclerView.F.C();
        for (int i11 = 0; i11 < iC; i11++) {
            f1 f1VarM = RecyclerView.M(recyclerView.F.B(i11));
            if (f1VarM.f2277c == i10 && !f1VarM.f()) {
                return null;
            }
        }
        v0 v0Var = recyclerView.C;
        if (j9 == Long.MAX_VALUE) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.U(false);
                Trace.endSection();
            }
        }
        recyclerView.T();
        f1 f1VarO = v0Var.o(i10, j9);
        if (f1VarO != null) {
            if (!f1VarO.e() || f1VarO.f()) {
                v0Var.a(f1VarO, false);
            } else {
                v0Var.l(f1VarO.f2275a);
            }
        }
        return f1VarO;
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.S) {
            if (RecyclerView.f1852b1 && !this.A.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.B == 0) {
                this.B = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        n nVar = recyclerView.F0;
        nVar.f2354b = i10;
        nVar.f2355c = i11;
    }

    public final void b(long j9) {
        o oVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        o oVar2;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            n nVar = recyclerView3.F0;
            if (windowVisibility == 0) {
                nVar.c(recyclerView3, false);
                i10 += nVar.f2356d;
            }
        }
        ArrayList arrayList2 = this.D;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                n nVar2 = recyclerView4.F0;
                int iAbs = Math.abs(nVar2.f2355c) + Math.abs(nVar2.f2354b);
                for (?? r11 = z10; r11 < nVar2.f2356d * 2; r11 += 2) {
                    if (i13 >= arrayList2.size()) {
                        oVar2 = new o();
                        arrayList2.add(oVar2);
                    } else {
                        oVar2 = (o) arrayList2.get(i13);
                    }
                    int[] iArr = nVar2.f2353a;
                    int i14 = iArr[r11 + 1];
                    if (i14 <= iAbs) {
                        z10 = true;
                    }
                    oVar2.f2363a = z10;
                    oVar2.f2364b = iAbs;
                    oVar2.f2365c = i14;
                    oVar2.f2366d = recyclerView4;
                    oVar2.f2367e = iArr[r11];
                    i13++;
                    z10 = false;
                }
            }
            i12++;
            z10 = false;
        }
        Collections.sort(arrayList2, F);
        for (int i15 = 0; i15 < arrayList2.size() && (recyclerView = (oVar = (o) arrayList2.get(i15)).f2366d) != null; i15++) {
            f1 f1VarC = c(recyclerView, oVar.f2367e, oVar.f2363a ? Long.MAX_VALUE : j9);
            if (f1VarC != null && f1VarC.f2276b != null && f1VarC.e() && !f1VarC.f() && (recyclerView2 = (RecyclerView) f1VarC.f2276b.get()) != null) {
                if (recyclerView2.f1867f0 && recyclerView2.F.C() != 0) {
                    v0 v0Var = recyclerView2.C;
                    m0 m0Var = recyclerView2.f1876o0;
                    if (m0Var != null) {
                        m0Var.e();
                    }
                    p0 p0Var = recyclerView2.N;
                    if (p0Var != null) {
                        p0Var.j0(v0Var);
                        recyclerView2.N.k0(v0Var);
                    }
                    ((ArrayList) v0Var.f2440d).clear();
                    v0Var.j();
                }
                n nVar3 = recyclerView2.F0;
                nVar3.c(recyclerView2, true);
                if (nVar3.f2356d != 0) {
                    try {
                        Trace.beginSection(j9 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        b1 b1Var = recyclerView2.G0;
                        g0 g0Var = recyclerView2.M;
                        b1Var.f2241d = 1;
                        b1Var.f2242e = g0Var.getItemCount();
                        b1Var.f2244g = false;
                        b1Var.f2245h = false;
                        b1Var.f2246i = false;
                        for (int i16 = 0; i16 < nVar3.f2356d * 2; i16 += 2) {
                            c(recyclerView2, nVar3.f2353a[i16], j9);
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            oVar.f2363a = false;
            oVar.f2364b = 0;
            oVar.f2365c = 0;
            oVar.f2366d = null;
            oVar.f2367e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.A;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.C);
                }
            }
        } finally {
            this.B = 0L;
            Trace.endSection();
        }
    }
}
