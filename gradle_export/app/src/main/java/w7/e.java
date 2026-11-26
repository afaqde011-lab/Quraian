package w7;

import com.google.android.gms.cast.Cast;
import e7.i0;
import java.util.Arrays;
import s7.w0;

public final class e {

    public int f15849c;

    public int f15850d;

    public final boolean f15847a = true;

    public final int f15848b = Cast.MAX_MESSAGE_LENGTH;

    public int f15851e = 0;

    public a[] f15852f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i10 = this.f15850d + 1;
            this.f15850d = i10;
            int i11 = this.f15851e;
            if (i11 > 0) {
                a[] aVarArr = this.f15852f;
                int i12 = i11 - 1;
                this.f15851e = i12;
                aVar = aVarArr[i12];
                aVar.getClass();
                this.f15852f[this.f15851e] = null;
            } else {
                a aVar2 = new a(0, new byte[this.f15848b]);
                a[] aVarArr2 = this.f15852f;
                if (i10 > aVarArr2.length) {
                    this.f15852f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(w0 w0Var) {
        while (w0Var != null) {
            try {
                a[] aVarArr = this.f15852f;
                int i10 = this.f15851e;
                this.f15851e = i10 + 1;
                a aVar = (a) w0Var.C;
                aVar.getClass();
                aVarArr[i10] = aVar;
                this.f15850d--;
                w0Var = (w0) w0Var.D;
                if (w0Var == null || ((a) w0Var.C) == null) {
                    w0Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public final synchronized void c(int i10) {
        boolean z10 = i10 < this.f15849c;
        this.f15849c = i10;
        if (z10) {
            d();
        }
    }

    public final synchronized void d() {
        int iMax = Math.max(0, i0.f(this.f15849c, this.f15848b) - this.f15850d);
        int i10 = this.f15851e;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.f15852f, iMax, i10, (Object) null);
        this.f15851e = iMax;
    }
}
