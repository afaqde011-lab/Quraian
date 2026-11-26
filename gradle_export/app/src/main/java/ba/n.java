package ba;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public final class n {

    public int[] f2353a;

    public int f2354b;

    public int f2355c;

    public int f2356d;

    public n() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f2356d = iHighestOneBit - 1;
        this.f2353a = new int[iHighestOneBit];
    }

    public void a(int i10) {
        int[] iArr = this.f2353a;
        int i11 = this.f2355c;
        iArr[i11] = i10;
        int i12 = this.f2356d & (i11 + 1);
        this.f2355c = i12;
        int i13 = this.f2354b;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i15];
            h00.n.p0(0, i13, length, iArr, iArr2);
            h00.n.p0(i14, 0, this.f2354b, this.f2353a, iArr2);
            this.f2353a = iArr2;
            this.f2354b = 0;
            this.f2355c = length;
            this.f2356d = i15 - 1;
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f2356d;
        int i13 = i12 * 2;
        int[] iArr = this.f2353a;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2353a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f2353a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2353a;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f2356d++;
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        this.f2356d = 0;
        int[] iArr = this.f2353a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        p0 p0Var = recyclerView.N;
        if (recyclerView.M == null || p0Var == null || !p0Var.f2385i) {
            return;
        }
        if (z10) {
            if (!recyclerView.E.m()) {
                p0Var.i(recyclerView.M.getItemCount(), this);
            }
        } else if (!recyclerView.O()) {
            p0Var.h(this.f2354b, this.f2355c, recyclerView.G0, this);
        }
        int i10 = this.f2356d;
        if (i10 > p0Var.f2386j) {
            p0Var.f2386j = i10;
            p0Var.f2387k = z10;
            recyclerView.C.q();
        }
    }
}
