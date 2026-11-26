package ba;

import android.view.View;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;

public final class s {

    public final int f2409a = 0;

    public int f2410b;

    public boolean f2411c;

    public boolean f2412d;

    public int f2413e;

    public Object f2414f;

    public s() {
        g();
    }

    public s(int i10) {
        this.f2410b = i10;
        byte[] bArr = new byte[131];
        this.f2414f = bArr;
        bArr[2] = 1;
    }

    public s(i7.c1 c1Var) {
        this.f2414f = c1Var;
    }

    public void a(int i10, int i11, byte[] bArr) {
        if (this.f2411c) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f2414f;
            int length = bArr2.length;
            int i13 = this.f2413e;
            if (length < i13 + i12) {
                this.f2414f = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f2414f, this.f2413e, i12);
            this.f2413e += i12;
        }
    }

    public void b() {
        this.f2413e = this.f2411c ? ((y) this.f2414f).i() : ((y) this.f2414f).m();
    }

    public void c(View view, int i10) {
        if (this.f2411c) {
            int iD = ((y) this.f2414f).d(view);
            y yVar = (y) this.f2414f;
            this.f2413e = (Integer.MIN_VALUE == yVar.f2461a ? 0 : yVar.n() - yVar.f2461a) + iD;
        } else {
            this.f2413e = ((y) this.f2414f).g(view);
        }
        this.f2410b = i10;
    }

    public void d(View view, int i10) {
        y yVar = (y) this.f2414f;
        int iN = Integer.MIN_VALUE == yVar.f2461a ? 0 : yVar.n() - yVar.f2461a;
        if (iN >= 0) {
            c(view, i10);
            return;
        }
        this.f2410b = i10;
        if (!this.f2411c) {
            int iG = ((y) this.f2414f).g(view);
            int iM = iG - ((y) this.f2414f).m();
            this.f2413e = iG;
            if (iM > 0) {
                int i11 = (((y) this.f2414f).i() - Math.min(0, (((y) this.f2414f).i() - iN) - ((y) this.f2414f).d(view))) - (((y) this.f2414f).e(view) + iG);
                if (i11 < 0) {
                    this.f2413e -= Math.min(iM, -i11);
                    return;
                }
                return;
            }
            return;
        }
        int i12 = (((y) this.f2414f).i() - iN) - ((y) this.f2414f).d(view);
        this.f2413e = ((y) this.f2414f).i() - i12;
        if (i12 > 0) {
            int iE = this.f2413e - ((y) this.f2414f).e(view);
            int iM2 = ((y) this.f2414f).m();
            int iMin = iE - (Math.min(((y) this.f2414f).g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.f2413e = Math.min(i12, -iMin) + this.f2413e;
            }
        }
    }

    public boolean e(int i10) {
        if (!this.f2411c) {
            return false;
        }
        this.f2413e -= i10;
        this.f2411c = false;
        this.f2412d = true;
        return true;
    }

    public void f(int i10) {
        this.f2411c |= i10 > 0;
        this.f2410b += i10;
    }

    public void g() {
        switch (this.f2409a) {
            case 0:
                this.f2410b = -1;
                this.f2413e = Integer.MIN_VALUE;
                this.f2411c = false;
                this.f2412d = false;
                break;
            default:
                this.f2411c = false;
                this.f2412d = false;
                break;
        }
    }

    public void h(int i10) {
        ta.c0.A(!this.f2411c);
        boolean z10 = i10 == this.f2410b;
        this.f2411c = z10;
        if (z10) {
            this.f2413e = 3;
            this.f2412d = false;
        }
    }

    public String toString() {
        switch (this.f2409a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
                sb2.append(this.f2410b);
                sb2.append(", mCoordinate=");
                sb2.append(this.f2413e);
                sb2.append(", mLayoutFromEnd=");
                sb2.append(this.f2411c);
                sb2.append(", mValid=");
                return x5.o(sb2, this.f2412d, '}');
            default:
                return super.toString();
        }
    }
}
