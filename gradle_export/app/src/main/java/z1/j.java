package z1;

import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;
import ri.t1;

public final class j implements Iterable, v00.a {
    public static final j E = new j(0, 0, 0, null);
    public final long A;
    public final long B;
    public final long C;
    public final long[] D;

    public j(long j9, long j10, long j11, long[] jArr) {
        this.A = j9;
        this.B = j10;
        this.C = j11;
        this.D = jArr;
    }

    public final j a(j jVar) {
        long[] jArr;
        j jVarC = this;
        j jVar2 = E;
        if (jVar == jVar2) {
            return jVarC;
        }
        if (jVarC == jVar2) {
            return jVar2;
        }
        long j9 = jVar.C;
        long j10 = jVar.C;
        long[] jArr2 = jVar.D;
        long j11 = jVar.B;
        long j12 = jVar.A;
        long j13 = jVarC.C;
        if (j9 == j13 && jArr2 == (jArr = jVarC.D)) {
            return new j(jVarC.A & (~j12), jVarC.B & (~j11), j13, jArr);
        }
        if (jArr2 != null) {
            for (long j14 : jArr2) {
                jVarC = jVarC.c(j14);
            }
        }
        if (j11 != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j11) != 0) {
                    jVarC = jVarC.c(((long) i10) + j10);
                }
            }
        }
        if (j12 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j12) != 0) {
                    jVarC = jVarC.c(((long) i11) + j10 + ((long) 64));
                }
            }
        }
        return jVarC;
    }

    public final j c(long j9) {
        long[] jArr;
        int iD;
        long[] jArr2;
        long j10 = j9 - this.C;
        long j11 = 0;
        if (kotlin.jvm.internal.m.g(j10, j11) >= 0 && kotlin.jvm.internal.m.g(j10, 64) < 0) {
            long j12 = 1 << ((int) j10);
            long j13 = this.B;
            if ((j13 & j12) != 0) {
                return new j(this.A, j13 & (~j12), this.C, this.D);
            }
        } else if (kotlin.jvm.internal.m.g(j10, 64) >= 0 && kotlin.jvm.internal.m.g(j10, Cast.MAX_NAMESPACE_LENGTH) < 0) {
            long j14 = 1 << (((int) j10) - 64);
            long j15 = this.A;
            if ((j15 & j14) != 0) {
                return new j(j15 & (~j14), this.B, this.C, this.D);
            }
        } else if (kotlin.jvm.internal.m.g(j10, j11) < 0 && (jArr = this.D) != null && (iD = q.d(jArr, j9)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (iD > 0) {
                    h00.n.t0(jArr, jArr3, 0, 0, iD);
                }
                if (iD < i10) {
                    h00.n.t0(jArr, jArr3, iD, iD + 1, length);
                }
                jArr2 = jArr3;
            }
            return new j(this.A, this.B, this.C, jArr2);
        }
        return this;
    }

    public final boolean e(long j9) {
        long[] jArr;
        long j10 = j9 - this.C;
        long j11 = 0;
        if (kotlin.jvm.internal.m.g(j10, j11) >= 0 && kotlin.jvm.internal.m.g(j10, 64) < 0) {
            return ((1 << ((int) j10)) & this.B) != 0;
        }
        if (kotlin.jvm.internal.m.g(j10, 64) < 0 || kotlin.jvm.internal.m.g(j10, Cast.MAX_NAMESPACE_LENGTH) >= 0) {
            return kotlin.jvm.internal.m.g(j10, j11) <= 0 && (jArr = this.D) != null && q.d(jArr, j9) >= 0;
        }
        return ((1 << (((int) j10) - 64)) & this.A) != 0;
    }

    public final j h(j jVar) {
        j jVarI;
        long[] jArr;
        j jVarI2 = this;
        j jVar2 = E;
        if (jVar == jVar2) {
            return jVarI2;
        }
        if (jVarI2 == jVar2) {
            return jVar;
        }
        long j9 = jVar.C;
        long j10 = jVar.C;
        long[] jArr2 = jVar.D;
        long j11 = jVar.B;
        long j12 = jVar.A;
        long j13 = jVarI2.C;
        long j14 = jVarI2.B;
        long j15 = jVarI2.A;
        if (j9 == j13 && jArr2 == (jArr = jVarI2.D)) {
            return new j(j15 | j12, j14 | j11, j13, jArr);
        }
        int i10 = 0;
        long[] jArr3 = jVarI2.D;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j16 : jArr2) {
                    jVarI2 = jVarI2.i(j16);
                }
            }
            if (j11 != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if (((1 << i11) & j11) != 0) {
                        jVarI2 = jVarI2.i(((long) i11) + j10);
                    }
                }
            }
            if (j12 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j12) != 0) {
                        jVarI2 = jVarI2.i(((long) i10) + j10 + ((long) 64));
                    }
                    i10++;
                }
            }
            return jVarI2;
        }
        if (jArr3 != null) {
            jVarI = jVar;
            for (long j17 : jArr3) {
                jVarI = jVarI.i(j17);
            }
        } else {
            jVarI = jVar;
        }
        long j18 = jVarI2.C;
        if (j14 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j14) != 0) {
                    jVarI = jVarI.i(((long) i12) + j18);
                }
            }
        }
        if (j15 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j15) != 0) {
                    jVarI = jVarI.i(((long) i10) + j18 + ((long) 64));
                }
                i10++;
            }
        }
        return jVarI;
    }

    public final j i(long j9) {
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        long j12 = this.C;
        long j13 = j9 - j12;
        long j14 = 0;
        int iG = kotlin.jvm.internal.m.g(j13, j14);
        long j15 = this.B;
        if (iG < 0 || kotlin.jvm.internal.m.g(j13, 64) >= 0) {
            long j16 = 64;
            int iG2 = kotlin.jvm.internal.m.g(j13, j16);
            long j17 = this.A;
            if (iG2 < 0 || kotlin.jvm.internal.m.g(j13, Cast.MAX_NAMESPACE_LENGTH) >= 0) {
                long j18 = Cast.MAX_NAMESPACE_LENGTH;
                int iG3 = kotlin.jvm.internal.m.g(j13, j18);
                long[] jArr3 = this.D;
                if (iG3 < 0) {
                    if (jArr3 == null) {
                        return new j(this.A, this.B, this.C, new long[]{j9});
                    }
                    int iD = q.d(jArr3, j9);
                    if (iD < 0) {
                        int i10 = -(iD + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        h00.n.t0(jArr3, jArr4, 0, 0, i10);
                        h00.n.t0(jArr3, jArr4, i10 + 1, i10, length);
                        jArr4[i10] = j9;
                        return new j(this.A, this.B, this.C, jArr4);
                    }
                } else if (!e(j9)) {
                    long j19 = 1;
                    long j20 = ((j9 + j19) / j16) * j16;
                    if (kotlin.jvm.internal.m.g(j20, j14) < 0) {
                        j20 = (Long.MAX_VALUE - j18) + j19;
                    }
                    long j21 = j12;
                    long j22 = j17;
                    wi.b bVar = null;
                    while (true) {
                        if (kotlin.jvm.internal.m.g(j21, j20) >= 0) {
                            j10 = j21;
                            j11 = j15;
                            break;
                        }
                        if (j15 != 0) {
                            if (bVar == null) {
                                bVar = new wi.b(jArr3);
                            }
                            for (int i11 = 0; i11 < 64; i11++) {
                                if ((j15 & (1 << i11)) != 0) {
                                    ((u.y) bVar.B).a(((long) i11) + j21);
                                }
                            }
                        }
                        if (j22 == 0) {
                            j10 = j20;
                            j11 = 0;
                            break;
                        }
                        j21 += j16;
                        j15 = j22;
                        j22 = 0;
                    }
                    if (bVar == null) {
                        jArr = jArr3;
                    } else {
                        u.y yVar = (u.y) bVar.B;
                        int i12 = yVar.f14912b;
                        if (i12 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i12];
                            long[] jArr6 = yVar.f14911a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                jArr5[i13] = jArr6[i13];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new j(j22, j11, j10, jArr).i(j9);
                }
            } else {
                long j23 = 1 << (((int) j13) - 64);
                if ((j17 & j23) == 0) {
                    return new j(j17 | j23, this.B, this.C, this.D);
                }
            }
        } else {
            long j24 = 1 << ((int) j13);
            if ((j15 & j24) == 0) {
                return new j(this.A, j15 | j24, this.C, this.D);
            }
        }
        return this;
    }

    @Override
    public final Iterator iterator() {
        return t1.F(new i(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(h00.r.q0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) RuntimeVersion.SUFFIX);
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) RuntimeVersion.SUFFIX);
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
