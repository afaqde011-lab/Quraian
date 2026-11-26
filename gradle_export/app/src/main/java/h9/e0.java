package h9;

import a8.n0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import qd.s0;

public final class e0 implements a8.q {

    public final int f6712a;

    public final List f6713b;

    public final e7.u f6714c = new e7.u(0, new byte[9400]);

    public final SparseIntArray f6715d;

    public final f f6716e;

    public final x8.i f6717f;

    public final SparseArray f6718g;

    public final SparseBooleanArray f6719h;

    public final SparseBooleanArray f6720i;

    public final y f6721j;

    public f8.b f6722k;
    public a8.s l;
    public int m;

    public boolean f6723n;

    public boolean f6724o;

    public boolean f6725p;

    public int f6726q;

    public e0(int i10, x8.i iVar, e7.e0 e0Var, f fVar) {
        this.f6716e = fVar;
        this.f6712a = i10;
        this.f6717f = iVar;
        this.f6713b = Collections.singletonList(e0Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f6719h = sparseBooleanArray;
        this.f6720i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f6718g = sparseArray;
        this.f6715d = new SparseIntArray();
        this.f6721j = new y(1);
        this.l = a8.s.f306a;
        this.f6726q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (g0) sparseArray2.valueAt(i11));
        }
        h7.b bVar = new h7.b();
        bVar.B = this;
        bVar.A = new n0(4, new byte[4]);
        sparseArray.put(0, new c0(bVar));
    }

    @Override
    public final void a(a8.s sVar) {
        if ((this.f6712a & 1) == 0) {
            sVar = new c7.c(sVar, this.f6717f);
        }
        this.l = sVar;
    }

    @Override
    public final void b(long j9, long j10) {
        f8.b bVar;
        long j11;
        SparseArray sparseArray = this.f6718g;
        List list = this.f6713b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            e7.e0 e0Var = (e7.e0) list.get(i10);
            synchronized (e0Var) {
                j11 = e0Var.f5125b;
            }
            boolean z10 = j11 == -9223372036854775807L;
            if (!z10) {
                long jD = e0Var.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j10) ? false : true;
            }
            if (z10) {
                e0Var.e(j10);
            }
        }
        if (j10 != 0 && (bVar = this.f6722k) != null) {
            bVar.d(j10);
        }
        this.f6714c.K(0);
        this.f6715d.clear();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((g0) sparseArray.valueAt(i11)).a();
        }
    }

    @Override
    public final int d(a8.r rVar, a8.u uVar) {
        a8.r rVar2;
        int i10;
        ?? r4;
        boolean z10;
        long length = rVar.getLength();
        if (this.f6723n) {
            long j9 = -9223372036854775807L;
            y yVar = this.f6721j;
            if (length != -1 && !yVar.f6929d) {
                int i11 = this.f6726q;
                e7.e0 e0Var = yVar.f6927b;
                e7.u uVar2 = yVar.f6928c;
                if (i11 <= 0) {
                    yVar.a(rVar);
                    return 0;
                }
                if (yVar.f6931f) {
                    if (yVar.f6933h == -9223372036854775807L) {
                        yVar.a(rVar);
                        return 0;
                    }
                    if (yVar.f6930e) {
                        long j10 = yVar.f6932g;
                        if (j10 == -9223372036854775807L) {
                            yVar.a(rVar);
                            return 0;
                        }
                        yVar.f6934i = e0Var.c(yVar.f6933h) - e0Var.b(j10);
                        yVar.a(rVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, rVar.getLength());
                    long j11 = 0;
                    if (rVar.getPosition() != j11) {
                        uVar.f307a = j11;
                        return 1;
                    }
                    uVar2.K(iMin);
                    rVar.t();
                    rVar.a(0, iMin, uVar2.f5182a);
                    int i12 = uVar2.f5184c;
                    for (int i13 = uVar2.f5183b; i13 < i12; i13++) {
                        if (uVar2.f5182a[i13] == 71) {
                            long jO0 = s0.o0(uVar2, i13, i11);
                            if (jO0 != -9223372036854775807L) {
                                j9 = jO0;
                                break;
                            }
                        }
                    }
                    yVar.f6932g = j9;
                    yVar.f6930e = true;
                    return 0;
                }
                long length2 = rVar.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j12 = length2 - ((long) iMin2);
                if (rVar.getPosition() != j12) {
                    uVar.f307a = j12;
                    return 1;
                }
                uVar2.K(iMin2);
                rVar.t();
                rVar.a(0, iMin2, uVar2.f5182a);
                int i14 = uVar2.f5183b;
                int i15 = uVar2.f5184c;
                for (int i16 = i15 - 188; i16 >= i14; i16--) {
                    byte[] bArr = uVar2.f5182a;
                    int i17 = 0;
                    for (int i18 = -4; i18 <= 4; i18++) {
                        int i19 = (i18 * 188) + i16;
                        if (i19 >= i14 && i19 < i15 && bArr[i19] == 71) {
                            i17++;
                            if (i17 == 5) {
                                long jO1 = s0.o0(uVar2, i16, i11);
                                if (jO1 == -9223372036854775807L) {
                                    break;
                                }
                                j9 = jO1;
                                break;
                            }
                        } else {
                            i17 = 0;
                        }
                    }
                }
                yVar.f6933h = j9;
                yVar.f6931f = true;
                return 0;
            }
            if (this.f6724o) {
                i10 = 1;
                z10 = false;
            } else {
                this.f6724o = true;
                long j13 = yVar.f6934i;
                if (j13 != -9223372036854775807L) {
                    i10 = 1;
                    z10 = false;
                    f8.b bVar = new f8.b(new hb.f(), new c50.h(this.f6726q, yVar.f6927b), j13, 1 + j13, 0L, length, 188L, 940);
                    this.f6722k = bVar;
                    this.l.b(bVar.f5553a);
                } else {
                    z10 = false;
                    i10 = 1;
                    this.l.b(new a8.v(j13));
                }
            }
            if (this.f6725p) {
                this.f6725p = z10;
                b(0L, 0L);
                if (rVar.getPosition() != 0) {
                    uVar.f307a = 0L;
                    return i10;
                }
            }
            f8.b bVar2 = this.f6722k;
            if (bVar2 != null && bVar2.f5555c != null) {
                return bVar2.b(rVar, uVar);
            }
            rVar2 = rVar;
            r4 = z10;
        } else {
            rVar2 = rVar;
            i10 = 1;
            r4 = 0;
        }
        e7.u uVar3 = this.f6714c;
        byte[] bArr2 = uVar3.f5182a;
        if (9400 - uVar3.f5183b < 188) {
            int iA = uVar3.a();
            if (iA > 0) {
                System.arraycopy(bArr2, uVar3.f5183b, bArr2, r4, iA);
            }
            uVar3.L(iA, bArr2);
        }
        while (true) {
            int iA2 = uVar3.a();
            ?? r7 = this.f6718g;
            if (iA2 >= 188) {
                int i20 = uVar3.f5183b;
                int i21 = uVar3.f5184c;
                byte[] bArr3 = uVar3.f5182a;
                while (i20 < i21 && bArr3[i20] != 71) {
                    i20++;
                }
                uVar3.N(i20);
                int i22 = i20 + 188;
                int i23 = uVar3.f5184c;
                if (i22 > i23) {
                    return r4;
                }
                int iM = uVar3.m();
                if ((8388608 & iM) != 0) {
                    uVar3.N(i22);
                    return r4;
                }
                ?? r10 = (4194304 & iM) != 0 ? 1 : r4;
                int i24 = (2096896 & iM) >> 8;
                ?? r11 = (iM & 32) != 0 ? 1 : r4;
                ?? r12 = (iM & 16) != 0 ? (g0) r7.get(i24) : 0;
                if (r12 == 0) {
                    uVar3.N(i22);
                    return r4;
                }
                int i25 = iM & 15;
                SparseIntArray sparseIntArray = this.f6715d;
                int i26 = sparseIntArray.get(i24, i25 - 1);
                sparseIntArray.put(i24, i25);
                if (i26 == i25) {
                    uVar3.N(i22);
                    return r4;
                }
                if (i25 != ((i26 + 1) & 15)) {
                    r12.a();
                }
                if (r11 != 0) {
                    int iA3 = uVar3.A();
                    r10 = (r10 == true ? 1 : 0) | ((uVar3.A() & 64) != 0 ? 2 : r4);
                    uVar3.O(iA3 - 1);
                }
                boolean z11 = this.f6723n;
                if (z11 || !this.f6720i.get(i24, r4)) {
                    uVar3.M(i22);
                    r12.b(r10, uVar3);
                    uVar3.M(i23);
                }
                if (!z11 && this.f6723n && length != -1) {
                    this.f6725p = true;
                }
                uVar3.N(i22);
                return r4;
            }
            int i27 = uVar3.f5184c;
            int i28 = rVar2.read(bArr2, i27, 9400 - i27);
            if (i28 == -1) {
                for (?? r13 = r4; r13 < r7.size(); r13++) {
                    g0 g0Var = (g0) r7.valueAt(r13);
                    if (g0Var instanceof x) {
                        x xVar = (x) g0Var;
                        if (xVar.f6917c == 3 && xVar.f6924j == -1) {
                            xVar.b(i10, new e7.u());
                        }
                    }
                    i10 = 1;
                }
                return -1;
            }
            uVar3.M(i27 + i28);
            i10 = 1;
        }
    }

    @Override
    public final boolean e(a8.r rVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f6714c.f5182a;
        a8.m mVar = (a8.m) rVar;
        mVar.i(bArr, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    mVar.g(i10, false);
                    return true;
                }
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override
    public final void release() {
    }
}
