package ba;

import androidx.recyclerview.widget.RecyclerView;

public final class i extends s0 {

    public final l f2308a;

    public i(l lVar) {
        this.f2308a = lVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        l lVar = this.f2308a;
        int i12 = lVar.f2323a;
        int iComputeVerticalScrollRange = lVar.f2339s.computeVerticalScrollRange();
        int i13 = lVar.f2338r;
        lVar.f2340t = iComputeVerticalScrollRange - i13 > 0 && i13 >= i12;
        int iComputeHorizontalScrollRange = lVar.f2339s.computeHorizontalScrollRange();
        int i14 = lVar.f2337q;
        boolean z10 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i12;
        lVar.f2341u = z10;
        boolean z11 = lVar.f2340t;
        if (!z11 && !z10) {
            if (lVar.f2342v != 0) {
                lVar.f(0);
                return;
            }
            return;
        }
        if (z11) {
            float f3 = i13;
            lVar.l = (int) ((((f3 / 2.0f) + iComputeVerticalScrollOffset) * f3) / iComputeVerticalScrollRange);
            lVar.f2333k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
        }
        if (lVar.f2341u) {
            float f10 = iComputeHorizontalScrollOffset;
            float f11 = i14;
            lVar.f2335o = (int) ((((f11 / 2.0f) + f10) * f11) / iComputeHorizontalScrollRange);
            lVar.f2334n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = lVar.f2342v;
        if (i15 == 0 || i15 == 1) {
            lVar.f(1);
        }
    }
}
