package u8;

import a8.c0;
import a8.d0;
import a8.e0;

public final class j implements d0 {

    public final long f15052a;

    public final k[] f15053b;

    public final int f15054c;

    public j(long j9, k[] kVarArr, int i10) {
        this.f15052a = j9;
        this.f15053b = kVarArr;
        this.f15054c = i10;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final c0 d(long j9) {
        long j10;
        long j11;
        long jMin;
        long j12;
        int i10;
        long jMin2;
        t tVar;
        long[] jArr;
        int iA;
        int iA2;
        int iB;
        k[] kVarArr = this.f15053b;
        int length = kVarArr.length;
        e0 e0Var = e0.f252c;
        if (length == 0) {
            return new c0(e0Var, e0Var);
        }
        int i11 = this.f15054c;
        if (i11 != -1) {
            t tVar2 = kVarArr[i11].f15056b;
            int iA3 = tVar2.a(j9);
            if (iA3 == -1) {
                iA3 = tVar2.b(j9);
            }
            long[] jArr2 = tVar2.f15126c;
            long[] jArr3 = tVar2.f15129f;
            if (iA3 == -1) {
                return new c0(e0Var, e0Var);
            }
            j11 = jArr3[iA3];
            j10 = jArr2[iA3];
            if (j11 < j9 && iA3 < tVar2.f15125b - 1 && (iB = tVar2.b(j9)) != -1 && iB != iA3) {
                j12 = jArr3[iB];
                jMin = jArr2[iB];
            }
            jMin2 = j10;
            for (i10 = 0; i10 < kVarArr.length; i10++) {
                if (i10 != i11) {
                    tVar = kVarArr[i10].f15056b;
                    jArr = tVar.f15126c;
                    iA = tVar.a(j11);
                    if (iA == -1) {
                        iA = tVar.b(j11);
                    }
                    if (iA != -1) {
                        jMin2 = Math.min(jArr[iA], jMin2);
                    }
                    if (j12 == -9223372036854775807L) {
                        iA2 = tVar.a(j12);
                        if (iA2 == -1) {
                            iA2 = tVar.b(j12);
                        }
                        if (iA2 == -1) {
                            jMin = Math.min(jArr[iA2], jMin);
                        }
                    }
                }
            }
            e0 e0Var2 = new e0(j11, jMin2);
            return j12 == -9223372036854775807L ? new c0(e0Var2, e0Var2) : new c0(e0Var2, new e0(j12, jMin));
        }
        j10 = Long.MAX_VALUE;
        j11 = j9;
        jMin = -1;
        j12 = -9223372036854775807L;
        jMin2 = j10;
        while (i10 < kVarArr.length) {
            if (i10 != i11) {
                tVar = kVarArr[i10].f15056b;
                jArr = tVar.f15126c;
                iA = tVar.a(j11);
                if (iA == -1) {
                    iA = tVar.b(j11);
                }
                if (iA != -1) {
                    jMin2 = Math.min(jArr[iA], jMin2);
                }
                if (j12 == -9223372036854775807L) {
                    iA2 = tVar.a(j12);
                    if (iA2 == -1) {
                        iA2 = tVar.b(j12);
                    }
                    if (iA2 == -1) {
                        jMin = Math.min(jArr[iA2], jMin);
                    }
                }
            }
        }
        e0 e0Var3 = new e0(j11, jMin2);
        if (j12 == -9223372036854775807L) {
        }
    }

    @Override
    public final long f() {
        return this.f15052a;
    }
}
