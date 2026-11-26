package e4;

import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;

public final class g implements Comparable {
    public boolean A;
    public float E;
    public int L;
    public int B = -1;
    public int C = -1;
    public int D = 0;
    public boolean F = false;
    public final float[] G = new float[9];
    public final float[] H = new float[9];
    public b[] I = new b[16];
    public int J = 0;
    public int K = 0;

    public g(int i10) {
        this.L = i10;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.J;
            if (i10 >= i11) {
                b[] bVarArr = this.I;
                if (i11 >= bVarArr.length) {
                    this.I = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.I;
                int i12 = this.J;
                bVarArr2[i12] = bVar;
                this.J = i12 + 1;
                return;
            }
            if (this.I[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.J;
        int i11 = 0;
        while (i11 < i10) {
            if (this.I[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.I;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.J--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.L = 5;
        this.D = 0;
        this.B = -1;
        this.C = -1;
        this.E = 0.0f;
        this.F = false;
        int i10 = this.J;
        for (int i11 = 0; i11 < i10; i11++) {
            this.I[i11] = null;
        }
        this.J = 0;
        this.K = 0;
        this.A = false;
        Arrays.fill(this.H, 0.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return this.B - ((g) obj).B;
    }

    public final void d(c cVar, float f3) {
        this.E = f3;
        this.F = true;
        int i10 = this.J;
        this.C = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.I[i11].h(cVar, this, false);
        }
        this.J = 0;
    }

    public final void e(c cVar, b bVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < i10; i11++) {
            this.I[i11].i(cVar, bVar, false);
        }
        this.J = 0;
    }

    public final String toString() {
        return RuntimeVersion.SUFFIX + this.B;
    }
}
