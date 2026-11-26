package com.google.android.material.datepicker;

import a1.i0;
import android.view.View;
import com.google.android.gms.internal.play_billing.q1;
import com.google.protobuf.RuntimeVersion;
import java.util.NoSuchElementException;
import m3.h0;
import m3.q0;
import z4.j1;

public final class n implements z4.r, u8.b {
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public Object F;

    public n(int i10) {
        this.A = i10;
    }

    public n(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.A = 2;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        this.E = i14;
        this.F = bArr;
    }

    public n(View view, int i10, int i11, int i12, int i13) {
        this.A = 0;
        this.B = i10;
        this.F = view;
        this.C = i11;
        this.D = i12;
        this.E = i13;
    }

    public n(f7.d dVar) {
        this.A = 5;
        e7.u uVar = dVar.C;
        this.F = uVar;
        uVar.N(12);
        this.C = uVar.E() & 255;
        this.B = uVar.E();
    }

    public n(m3.h hVar, long j9) {
        this.A = 4;
        String str = hVar.B;
        q1 q1Var = new q1(4, (byte) 0);
        q1Var.f4032d = str;
        q1Var.f4030b = -1;
        q1Var.f4031c = -1;
        this.F = q1Var;
        this.B = q0.g(j9);
        this.C = q0.f(j9);
        this.D = -1;
        this.E = -1;
        int iG = q0.g(j9);
        int iF = q0.f(j9);
        if (iG < 0 || iG > str.length()) {
            StringBuilder sbQ = oi.k.q("start (", iG, ") offset is outside of text region ");
            sbQ.append(str.length());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (iF < 0 || iF > str.length()) {
            StringBuilder sbQ2 = oi.k.q("end (", iF, ") offset is outside of text region ");
            sbQ2.append(str.length());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (iG > iF) {
            throw new IllegalArgumentException(w.c.h(iG, iF, "Do not set reversed range: ", " > "));
        }
    }

    @Override
    public j1 B(View view, j1 j1Var) {
        View view2 = (View) this.F;
        q4.b bVarI = j1Var.f17202a.i(519);
        int i10 = this.B;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + bVarI.f12756b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.C + bVarI.f12755a, this.D + bVarI.f12756b, this.E + bVarI.f12757c, view2.getPaddingBottom());
        return j1Var;
    }

    public void a(int i10, int i11) {
        long jB = h0.b(i10, i11);
        ((q1) this.F).Z(i10, RuntimeVersion.SUFFIX, i11);
        long jZ = c7.i.Z(h0.b(this.B, this.C), jB);
        j(q0.g(jZ));
        h(q0.f(jZ));
        int i12 = this.D;
        if (i12 != -1) {
            long jZ2 = c7.i.Z(h0.b(i12, this.E), jB);
            if (q0.d(jZ2)) {
                this.D = -1;
                this.E = -1;
            } else {
                this.D = q0.g(jZ2);
                this.E = q0.f(jZ2);
            }
        }
    }

    public char b(int i10) {
        q1 q1Var = (q1) this.F;
        i0 i0Var = (i0) q1Var.f4033e;
        if (i0Var != null && i10 >= q1Var.f4030b) {
            int iA = i0Var.f55b - i0Var.a();
            int i11 = q1Var.f4030b;
            if (i10 >= iA + i11) {
                return ((String) q1Var.f4032d).charAt(i10 - ((iA - q1Var.f4031c) + i11));
            }
            int i12 = i10 - i11;
            int i13 = i0Var.f57d;
            return i12 < i13 ? i0Var.f56c[i12] : i0Var.f56c[(i12 - i13) + i0Var.f58e];
        }
        return ((String) q1Var.f4032d).charAt(i10);
    }

    public q0 c() {
        int i10 = this.D;
        if (i10 != -1) {
            return new q0(h0.b(i10, this.E));
        }
        return null;
    }

    public long d() {
        int i10 = this.D;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.F;
        int i11 = this.B;
        long j9 = jArr[i11];
        this.B = this.E & (i11 + 1);
        this.D = i10 - 1;
        return j9;
    }

    public void e(int i10, String str, int i11) {
        q1 q1Var = (q1) this.F;
        if (i10 < 0 || i10 > q1Var.B()) {
            StringBuilder sbQ = oi.k.q("start (", i10, ") offset is outside of text region ");
            sbQ.append(q1Var.B());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i11 < 0 || i11 > q1Var.B()) {
            StringBuilder sbQ2 = oi.k.q("end (", i11, ") offset is outside of text region ");
            sbQ2.append(q1Var.B());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(w.c.h(i10, i11, "Do not set reversed range: ", " > "));
        }
        q1Var.Z(i10, str, i11);
        j(str.length() + i10);
        h(str.length() + i10);
        this.D = -1;
        this.E = -1;
    }

    public void f(int i10, int i11) {
        q1 q1Var = (q1) this.F;
        if (i10 < 0 || i10 > q1Var.B()) {
            StringBuilder sbQ = oi.k.q("start (", i10, ") offset is outside of text region ");
            sbQ.append(q1Var.B());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i11 < 0 || i11 > q1Var.B()) {
            StringBuilder sbQ2 = oi.k.q("end (", i11, ") offset is outside of text region ");
            sbQ2.append(q1Var.B());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(w.c.h(i10, i11, "Do not set reversed or empty range: ", " > "));
        }
        this.D = i10;
        this.E = i11;
    }

    public void g(int i10, int i11) {
        q1 q1Var = (q1) this.F;
        if (i10 < 0 || i10 > q1Var.B()) {
            StringBuilder sbQ = oi.k.q("start (", i10, ") offset is outside of text region ");
            sbQ.append(q1Var.B());
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i11 < 0 || i11 > q1Var.B()) {
            StringBuilder sbQ2 = oi.k.q("end (", i11, ") offset is outside of text region ");
            sbQ2.append(q1Var.B());
            throw new IndexOutOfBoundsException(sbQ2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(w.c.h(i10, i11, "Do not set reversed range: ", " > "));
        }
        j(i10);
        h(i11);
    }

    public void h(int i10) {
        if (!(i10 >= 0)) {
            s3.a.a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.C = i10;
    }

    @Override
    public int i() {
        return -1;
    }

    public void j(int i10) {
        if (!(i10 >= 0)) {
            s3.a.a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.B = i10;
    }

    @Override
    public int s() {
        return this.B;
    }

    public String toString() {
        switch (this.A) {
            case 4:
                return ((q1) this.F).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public int u() {
        e7.u uVar = (e7.u) this.F;
        int i10 = this.C;
        if (i10 == 8) {
            return uVar.A();
        }
        if (i10 == 16) {
            return uVar.H();
        }
        int i11 = this.D;
        this.D = i11 + 1;
        if (i11 % 2 != 0) {
            return this.E & 15;
        }
        int iA = uVar.A();
        this.E = iA;
        return (iA & 240) >> 4;
    }
}
