package u8;

import a8.d0;
import a8.h0;
import a8.l0;
import a8.v;
import a8.y;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import b3.i2;
import com.google.android.gms.cast.Cast;
import e7.i0;
import e7.u;
import fh.d2;
import fh.r0;
import fh.t0;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import ta.c0;

public final class h implements a8.q {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final androidx.media3.common.t O;
    public long A;
    public g B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public a8.s H;
    public l0[] I;
    public l0[] J;
    public boolean K;
    public boolean L;
    public long M;

    public final x8.i f15028a;

    public final int f15029b;

    public final List f15030c;

    public final byte[] f15035h;

    public final u f15036i;

    public final i2 f15039n;

    public final l0 f15040o;

    public final a8.l f15041p;

    public d2 f15042q;

    public int f15043r;

    public int f15044s;

    public long f15045t;

    public int f15046u;

    public u f15047v;

    public long f15048w;

    public int f15049x;

    public long f15050y;

    public long f15051z;

    public final h1.l f15037j = new h1.l(12);

    public final u f15038k = new u(16);

    public final u f15032e = new u(f7.p.f5547a);

    public final u f15033f = new u(6);

    public final u f15034g = new u();
    public final ArrayDeque l = new ArrayDeque();
    public final ArrayDeque m = new ArrayDeque();

    public final SparseArray f15031d = new SparseArray();

    static {
        androidx.media3.common.s sVar = new androidx.media3.common.s();
        sVar.m = x0.n("application/x-emsg");
        O = new androidx.media3.common.t(sVar);
    }

    public h(x8.i iVar, int i10, List list, l7.p pVar) {
        this.f15028a = iVar;
        this.f15029b = i10;
        this.f15030c = Collections.unmodifiableList(list);
        this.f15040o = pVar;
        byte[] bArr = new byte[16];
        this.f15035h = bArr;
        this.f15036i = new u(bArr);
        r0 r0Var = t0.B;
        this.f15042q = d2.E;
        this.f15051z = -9223372036854775807L;
        this.f15050y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = a8.s.f306a;
        this.I = new l0[0];
        this.J = new l0[0];
        this.f15039n = new i2(new e(this));
        this.f15041p = new a8.l(0);
        this.M = -1L;
    }

    public static androidx.media3.common.o g(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            f7.d dVar = (f7.d) list.get(i10);
            if (dVar.B == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.C.f5182a;
                c50.h hVarI = p.i(bArr);
                UUID uuid = hVarI == null ? null : (UUID) hVarI.C;
                if (uuid == null) {
                    e7.a.m("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new androidx.media3.common.n(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new androidx.media3.common.o(null, false, (androidx.media3.common.n[]) arrayList.toArray(new androidx.media3.common.n[0]));
    }

    public static void h(u uVar, int i10, s sVar) throws ParserException {
        uVar.N(i10 + 8);
        int iM = uVar.m();
        byte[] bArr = c.f15009a;
        if ((iM & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iM & 2) != 0;
        int iE = uVar.E();
        if (iE == 0) {
            Arrays.fill(sVar.l, 0, sVar.f15113e, false);
            return;
        }
        int i11 = sVar.f15113e;
        u uVar2 = sVar.f15120n;
        if (iE != i11) {
            StringBuilder sbQ = oi.k.q("Senc sample count ", iE, " is different from fragment sample count");
            sbQ.append(sVar.f15113e);
            throw ParserException.a(null, sbQ.toString());
        }
        Arrays.fill(sVar.l, 0, iE, z10);
        uVar2.K(uVar.a());
        sVar.f15119k = true;
        sVar.f15121o = true;
        uVar.k(0, uVar2.f5184c, uVar2.f5182a);
        uVar2.N(0);
        sVar.f15121o = false;
    }

    public static Pair i(long j9, u uVar) throws ParserException {
        long jG;
        long jG2;
        u uVar2 = uVar;
        uVar2.N(8);
        int iE = c.e(uVar2.m());
        uVar2.O(4);
        long jC = uVar2.C();
        if (iE == 0) {
            jG = uVar2.C();
            jG2 = uVar2.C();
        } else {
            jG = uVar2.G();
            jG2 = uVar2.G();
        }
        long j10 = jG2 + j9;
        String str = i0.f5136a;
        long jQ = i0.Q(jG, 1000000L, jC, RoundingMode.DOWN);
        uVar2.O(2);
        int iH = uVar2.H();
        int[] iArr = new int[iH];
        long[] jArr = new long[iH];
        long[] jArr2 = new long[iH];
        long[] jArr3 = new long[iH];
        long j11 = j10;
        long j12 = jQ;
        int i10 = 0;
        while (i10 < iH) {
            int iM = uVar2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long jC2 = uVar2.C();
            iArr[i10] = iM & Integer.MAX_VALUE;
            jArr[i10] = j11;
            jArr3[i10] = j12;
            jG += jC2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jQ2 = i0.Q(jG, 1000000L, jC, RoundingMode.DOWN);
            jArr4[i10] = jQ2 - jArr5[i10];
            uVar2.O(4);
            j11 += (long) iArr[i10];
            i10++;
            iH = iH;
            uVar2 = uVar;
            j12 = jQ2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jQ), new a8.k(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final void a(a8.s sVar) {
        int i10;
        int i11 = this.f15029b;
        if ((i11 & 32) == 0) {
            sVar = new c7.c(sVar, this.f15028a);
        }
        this.H = sVar;
        f();
        l0[] l0VarArr = new l0[2];
        this.I = l0VarArr;
        int i12 = 0;
        l0 l0Var = this.f15040o;
        if (l0Var != null) {
            l0VarArr[0] = l0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            l0VarArr[i10] = this.H.w(100, 5);
            i13 = 101;
            i10++;
        }
        l0[] l0VarArr2 = (l0[]) i0.J(i10, this.I);
        this.I = l0VarArr2;
        for (l0 l0Var2 : l0VarArr2) {
            l0Var2.f(O);
        }
        List list = this.f15030c;
        this.J = new l0[list.size()];
        while (i12 < this.J.length) {
            l0 l0VarW = this.H.w(i13, 3);
            l0VarW.f((androidx.media3.common.t) list.get(i12));
            this.J[i12] = l0VarW;
            i12++;
            i13++;
        }
    }

    @Override
    public final void b(long j9, long j10) {
        SparseArray sparseArray = this.f15031d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) sparseArray.valueAt(i10)).e();
        }
        this.m.clear();
        this.f15049x = 0;
        ((PriorityQueue) this.f15039n.f2048e).clear();
        this.f15050y = j10;
        this.l.clear();
        f();
    }

    @Override
    public final List c() {
        return this.f15042q;
    }

    @Override
    public final int d(a8.r rVar, a8.u uVar) throws ParserException {
        i2 i2Var;
        u uVar2;
        ArrayDeque arrayDeque;
        int i10;
        g gVar;
        int i11;
        int i12;
        int i13;
        g gVar2;
        int i14;
        int i15;
        String str;
        int iA;
        int i16;
        boolean z10;
        int i17;
        String strV;
        String strV2;
        long jQ;
        long jC;
        long j9;
        long j10;
        while (true) {
            int i18 = this.f15043r;
            ArrayDeque arrayDeque2 = this.l;
            i2Var = this.f15039n;
            uVar2 = this.f15036i;
            a8.l lVar = this.f15041p;
            SparseArray sparseArray = this.f15031d;
            int i19 = 1;
            if (i18 != 0) {
                arrayDeque = this.m;
                i10 = this.f15029b;
                if (i18 != 1) {
                    long j11 = Long.MAX_VALUE;
                    if (i18 != 2) {
                        gVar = this.B;
                        if (gVar != null) {
                            i11 = 1;
                            i12 = 8;
                            i13 = 0;
                            break;
                        }
                        int size = sparseArray.size();
                        g gVar3 = null;
                        int i20 = 0;
                        while (i20 < size) {
                            g gVar4 = (g) sparseArray.valueAt(i20);
                            boolean z11 = gVar4.m;
                            int i21 = i19;
                            s sVar = gVar4.f15018b;
                            if ((z11 || gVar4.f15022f != gVar4.f15020d.f15125b) && (!z11 || gVar4.f15024h != sVar.f15112d)) {
                                long j12 = !z11 ? gVar4.f15020d.f15126c[gVar4.f15022f] : sVar.f15114f[gVar4.f15024h];
                                if (j12 < j11) {
                                    j11 = j12;
                                    gVar3 = gVar4;
                                }
                            }
                            i20++;
                            i19 = i21;
                        }
                        i11 = i19;
                        i12 = 8;
                        i13 = 0;
                        if (gVar3 != null) {
                            int position = (int) ((!gVar3.m ? gVar3.f15020d.f15126c[gVar3.f15022f] : gVar3.f15018b.f15114f[gVar3.f15024h]) - rVar.getPosition());
                            if (position < 0) {
                                e7.a.m("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            rVar.u(position);
                            this.B = gVar3;
                            gVar = gVar3;
                            break;
                        }
                        int position2 = (int) (this.f15048w - rVar.getPosition());
                        if (position2 < 0) {
                            throw ParserException.a(null, "Offset to end of mdat was negative.");
                        }
                        rVar.u(position2);
                        f();
                    } else {
                        int size2 = sparseArray.size();
                        g gVar5 = null;
                        for (int i22 = 0; i22 < size2; i22++) {
                            s sVar2 = ((g) sparseArray.valueAt(i22)).f15018b;
                            if (sVar2.f15121o) {
                                long j13 = sVar2.f15111c;
                                if (j13 < j11) {
                                    gVar5 = (g) sparseArray.valueAt(i22);
                                    j11 = j13;
                                }
                            }
                        }
                        if (gVar5 == null) {
                            this.f15043r = 3;
                        } else {
                            int position3 = (int) (j11 - rVar.getPosition());
                            if (position3 < 0) {
                                throw ParserException.a(null, "Offset to encryption data was negative.");
                            }
                            rVar.u(position3);
                            s sVar3 = gVar5.f15018b;
                            u uVar3 = sVar3.f15120n;
                            rVar.readFully(uVar3.f5182a, 0, uVar3.f5184c);
                            uVar3.N(0);
                            sVar3.f15121o = false;
                        }
                    }
                } else {
                    int i23 = (int) (this.f15045t - ((long) this.f15046u));
                    u uVar4 = this.f15047v;
                    if (uVar4 != null) {
                        rVar.readFully(uVar4.f5182a, 8, i23);
                        int i24 = this.f15044s;
                        f7.d dVar = new f7.d(i24, uVar4);
                        if (!arrayDeque2.isEmpty()) {
                            ((f7.c) arrayDeque2.peek()).D.add(dVar);
                        } else if (i24 == 1936286840) {
                            Pair pairI = i(rVar.getPosition(), uVar4);
                            lVar.b((a8.k) pairI.second);
                            if (!this.K) {
                                this.A = ((Long) pairI.first).longValue();
                                this.H.b((d0) pairI.second);
                                this.K = true;
                            } else if ((i10 & 256) != 0 && !this.L && lVar.A.size() > 1) {
                                this.M = rVar.getPosition();
                            }
                        } else if (i24 == 1701671783 && this.I.length != 0) {
                            uVar4.N(8);
                            int iE = c.e(uVar4.m());
                            if (iE == 0) {
                                strV = uVar4.v();
                                strV.getClass();
                                strV2 = uVar4.v();
                                strV2.getClass();
                                long jC2 = uVar4.C();
                                long jC3 = uVar4.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jQ2 = i0.Q(jC3, 1000000L, jC2, roundingMode);
                                long j14 = this.A;
                                long j15 = j14 != -9223372036854775807L ? j14 + jQ2 : -9223372036854775807L;
                                jQ = i0.Q(uVar4.C(), 1000L, jC2, roundingMode);
                                jC = uVar4.C();
                                j9 = jQ2;
                                j10 = j15;
                            } else if (iE != 1) {
                                a1.b.y("Skipping unsupported emsg version: ", iE, "FragmentedMp4Extractor");
                            } else {
                                long jC4 = uVar4.C();
                                long jG = uVar4.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long jQ3 = i0.Q(jG, 1000000L, jC4, roundingMode2);
                                long jQ4 = i0.Q(uVar4.C(), 1000L, jC4, roundingMode2);
                                long jC5 = uVar4.C();
                                strV = uVar4.v();
                                strV.getClass();
                                strV2 = uVar4.v();
                                strV2.getClass();
                                jQ = jQ4;
                                jC = jC5;
                                j10 = jQ3;
                                j9 = -9223372036854775807L;
                            }
                            String str2 = strV;
                            String str3 = strV2;
                            byte[] bArr = new byte[uVar4.a()];
                            uVar4.k(0, uVar4.a(), bArr);
                            u uVar5 = new u(this.f15037j.O0(new l8.a(str2, str3, jQ, jC, bArr)));
                            int iA2 = uVar5.a();
                            for (l0 l0Var : this.I) {
                                uVar5.N(0);
                                l0Var.g(iA2, uVar5);
                            }
                            if (j10 == -9223372036854775807L) {
                                arrayDeque.addLast(new f(iA2, j9, true));
                                this.f15049x += iA2;
                            } else if (arrayDeque.isEmpty()) {
                                for (l0 l0Var2 : this.I) {
                                    l0Var2.d(j10, 1, iA2, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new f(iA2, j10, false));
                                this.f15049x += iA2;
                            }
                        }
                    } else {
                        rVar.u(i23);
                    }
                    j(rVar.getPosition());
                }
            } else {
                int i25 = this.f15046u;
                long length = 0;
                u uVar6 = this.f15038k;
                if (i25 == 0) {
                    if (!rVar.d(uVar6.f5182a, 0, 8, true)) {
                        long j16 = this.M;
                        if (j16 == -1) {
                            i2Var.i(0);
                            return -1;
                        }
                        uVar.f307a = j16;
                        this.M = -1L;
                        a8.s sVar4 = this.H;
                        lVar.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (a8.k kVar : lVar.A.values()) {
                            arrayList.add(kVar.f283b);
                            arrayList2.add(kVar.f284c);
                            arrayList3.add(kVar.f285d);
                            arrayList4.add(kVar.f286e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            length += (long) iArr2.length;
                        }
                        int i26 = (int) length;
                        c0.p(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i26));
                        int[] iArr3 = new int[i26];
                        int length2 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
                            length2 += iArr4.length;
                        }
                        sVar4.b(new a8.k(iArr3, c7.i.w((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), c7.i.w((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), c7.i.w((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.L = true;
                        return 1;
                    }
                    this.f15046u = 8;
                    uVar6.N(0);
                    this.f15045t = uVar6.C();
                    this.f15044s = uVar6.m();
                }
                long j17 = this.f15045t;
                if (j17 == 1) {
                    rVar.readFully(uVar6.f5182a, 8, 8);
                    this.f15046u += 8;
                    this.f15045t = uVar6.G();
                } else if (j17 == 0) {
                    long length3 = rVar.getLength();
                    if (length3 == -1 && !arrayDeque2.isEmpty()) {
                        length3 = ((f7.c) arrayDeque2.peek()).C;
                    }
                    if (length3 != -1) {
                        this.f15045t = (length3 - rVar.getPosition()) + ((long) this.f15046u);
                    }
                }
                long j18 = this.f15045t;
                int i27 = this.f15046u;
                long j19 = i27;
                if (j18 < j19) {
                    if (this.f15044s != 1718773093 || i27 != 8) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    this.f15045t = j19;
                }
                if (this.M != -1) {
                    if (this.f15044s == 1936286840) {
                        uVar2.K((int) this.f15045t);
                        System.arraycopy(uVar6.f5182a, 0, uVar2.f5182a, 0, 8);
                        rVar.readFully(uVar2.f5182a, 8, (int) (this.f15045t - ((long) this.f15046u)));
                        lVar.b((a8.k) i(rVar.j(), uVar2).second);
                    } else {
                        rVar.g((int) (this.f15045t - j19), true);
                    }
                    f();
                } else {
                    long position4 = rVar.getPosition() - ((long) this.f15046u);
                    int i28 = this.f15044s;
                    if ((i28 == 1836019558 || i28 == 1835295092) && !this.K) {
                        this.H.b(new v(this.f15051z, position4));
                        this.K = true;
                    }
                    if (this.f15044s == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i29 = 0; i29 < size3; i29++) {
                            s sVar5 = ((g) sparseArray.valueAt(i29)).f15018b;
                            sVar5.getClass();
                            sVar5.f15111c = position4;
                            sVar5.f15110b = position4;
                        }
                    }
                    int i30 = this.f15044s;
                    if (i30 == 1835295092) {
                        this.B = null;
                        this.f15048w = position4 + this.f15045t;
                        this.f15043r = 2;
                    } else if (i30 == 1836019574 || i30 == 1953653099 || i30 == 1835297121 || i30 == 1835626086 || i30 == 1937007212 || i30 == 1836019558 || i30 == 1953653094 || i30 == 1836475768 || i30 == 1701082227 || i30 == 1835365473) {
                        long position5 = rVar.getPosition();
                        long j20 = this.f15045t;
                        long j21 = (position5 + j20) - 8;
                        if (j20 != this.f15046u && this.f15044s == 1835365473) {
                            uVar2.K(8);
                            rVar.a(0, 8, uVar2.f5182a);
                            c.a(uVar2);
                            rVar.u(uVar2.f5183b);
                            rVar.t();
                        }
                        arrayDeque2.push(new f7.c(this.f15044s, j21));
                        if (this.f15045t == this.f15046u) {
                            j(j21);
                        } else {
                            f();
                        }
                    } else if (i30 == 1751411826 || i30 == 1835296868 || i30 == 1836476516 || i30 == 1936286840 || i30 == 1937011556 || i30 == 1937011827 || i30 == 1668576371 || i30 == 1937011555 || i30 == 1937011578 || i30 == 1937013298 || i30 == 1937007471 || i30 == 1668232756 || i30 == 1937011571 || i30 == 1952867444 || i30 == 1952868452 || i30 == 1953196132 || i30 == 1953654136 || i30 == 1953658222 || i30 == 1886614376 || i30 == 1935763834 || i30 == 1935763823 || i30 == 1936027235 || i30 == 1970628964 || i30 == 1935828848 || i30 == 1936158820 || i30 == 1701606260 || i30 == 1835362404 || i30 == 1701671783 || i30 == 1969517665 || i30 == 1801812339 || i30 == 1768715124) {
                        if (this.f15046u != 8) {
                            throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f15045t > 2147483647L) {
                            throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        u uVar7 = new u((int) this.f15045t);
                        System.arraycopy(uVar6.f5182a, 0, uVar7.f5182a, 0, 8);
                        this.f15047v = uVar7;
                        this.f15043r = 1;
                    } else {
                        if (this.f15045t > 2147483647L) {
                            throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f15047v = null;
                        this.f15043r = 1;
                    }
                }
            }
        }
        l0 l0Var3 = gVar.f15017a;
        s sVar6 = gVar.f15018b;
        String str4 = "video/avc";
        if (this.f15043r == 3) {
            this.C = !gVar.m ? gVar.f15020d.f15127d[gVar.f15022f] : sVar6.f15116h[gVar.f15022f];
            androidx.media3.common.t tVar = gVar.f15020d.f15124a.f15099g;
            this.F = ((!Objects.equals(tVar.f1594n, "video/avc") ? !(!Objects.equals(tVar.f1594n, "video/hevc") || (i10 & Cast.MAX_NAMESPACE_LENGTH) == 0) : (i10 & 64) != 0) ? i13 : i11) ^ 1;
            if (gVar.f15022f < gVar.f15025i) {
                rVar.u(this.C);
                r rVarB = gVar.b();
                if (rVarB != null) {
                    u uVar8 = sVar6.f15120n;
                    int i31 = rVarB.f15107d;
                    if (i31 != 0) {
                        uVar8.O(i31);
                    }
                    int i32 = gVar.f15022f;
                    if (sVar6.f15119k && sVar6.l[i32]) {
                        uVar8.O(uVar8.H() * 6);
                    }
                }
                if (!gVar.c()) {
                    this.B = null;
                }
                this.f15043r = 3;
                return i13;
            }
            if (gVar.f15020d.f15124a.f15100h == i11) {
                this.C -= 8;
                rVar.u(i12);
            }
            if ("audio/ac4".equals(gVar.f15020d.f15124a.f15099g.f1594n)) {
                this.D = gVar.d(this.C, 7);
                a8.b.g(this.C, uVar2);
                l0Var3.g(7, uVar2);
                this.D += 7;
                i17 = i13;
            } else {
                i17 = i13;
                this.D = gVar.d(this.C, i17);
            }
            this.C += this.D;
            this.f15043r = 4;
            this.E = i17;
        }
        t tVar2 = gVar.f15020d;
        q qVar = tVar2.f15124a;
        long j22 = gVar.m ? sVar6.f15117i[gVar.f15022f] : tVar2.f15129f[gVar.f15022f];
        int i33 = qVar.f15103k;
        androidx.media3.common.t tVar3 = qVar.f15099g;
        if (i33 == 0) {
            gVar2 = gVar;
            while (true) {
                int i34 = this.D;
                int i35 = this.C;
                if (i34 >= i35) {
                    break;
                }
                this.D += l0Var3.a(rVar, i35 - i34, false);
            }
        } else {
            u uVar9 = this.f15033f;
            byte[] bArr2 = uVar9.f5182a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i36 = 4 - i33;
            while (true) {
                gVar2 = gVar;
                if (this.D >= this.C) {
                    break;
                }
                int i37 = this.E;
                if (i37 == 0) {
                    if (this.J.length > 0 || !this.F) {
                        int iE2 = f7.p.e(tVar3);
                        if (i33 + iE2 <= this.C - this.D) {
                            i16 = iE2;
                        } else {
                            i16 = 0;
                        }
                    } else {
                        i16 = 0;
                    }
                    rVar.readFully(bArr2, i36, i33 + i16);
                    uVar9.N(0);
                    int iM = uVar9.m();
                    if (iM < 0) {
                        throw ParserException.a(null, "Invalid NAL length");
                    }
                    this.E = iM - i16;
                    u uVar10 = this.f15032e;
                    i14 = i33;
                    uVar10.N(0);
                    l0Var3.g(4, uVar10);
                    this.D += 4;
                    this.C += i36;
                    if (this.J.length <= 0 || i16 <= 0) {
                        i15 = i36;
                        str = str4;
                    } else {
                        byte b7 = bArr2[4];
                        String strC = f7.p.c(tVar3);
                        if (Objects.equals(strC, str4)) {
                            i15 = i36;
                            str = str4;
                            if ((b7 & 31) != 6) {
                            }
                            z10 = true;
                            this.G = z10;
                            l0Var3.g(i16, uVar9);
                            this.D += i16;
                            if (i16 <= 0 && !this.F && f7.p.d(bArr2, i16, tVar3)) {
                                this.F = true;
                            }
                        } else {
                            i15 = i36;
                            str = str4;
                        }
                        if (Objects.equals(strC, "video/hevc") && ((b7 & 126) >> 1) == 39) {
                            z10 = true;
                        }
                        this.G = z10;
                        l0Var3.g(i16, uVar9);
                        this.D += i16;
                        if (i16 <= 0) {
                        }
                    }
                    z10 = false;
                    this.G = z10;
                    l0Var3.g(i16, uVar9);
                    this.D += i16;
                    if (i16 <= 0) {
                    }
                } else {
                    i14 = i33;
                    i15 = i36;
                    str = str4;
                    if (this.G) {
                        u uVar11 = this.f15034g;
                        uVar11.K(i37);
                        rVar.readFully(uVar11.f5182a, 0, this.E);
                        l0Var3.g(this.E, uVar11);
                        iA = this.E;
                        int iN = f7.p.n(uVar11.f5184c, uVar11.f5182a);
                        uVar11.N(0);
                        uVar11.M(iN);
                        int i38 = tVar3.f1596p;
                        if (i38 == -1) {
                            if (i2Var.f2044a != 0) {
                                i2Var.w(0);
                            }
                        } else if (i2Var.f2044a != i38) {
                            i2Var.w(i38);
                        }
                        i2Var.a(j22, uVar11);
                        if ((gVar2.a() & 4) != 0) {
                            i2Var.i(0);
                        }
                    } else {
                        iA = l0Var3.a(rVar, i37, false);
                    }
                    this.D += iA;
                    this.E -= iA;
                }
                gVar = gVar2;
                i36 = i15;
                i33 = i14;
                str4 = str;
            }
        }
        int iA3 = gVar2.a();
        if (!this.F) {
            iA3 |= 67108864;
        }
        int i39 = iA3;
        r rVarB2 = gVar2.b();
        long j23 = j22;
        l0Var3.d(j23, i39, this.C, 0, rVarB2 != null ? rVarB2.f15106c : null);
        while (!arrayDeque.isEmpty()) {
            f fVar = (f) arrayDeque.removeFirst();
            this.f15049x -= fVar.f15016c;
            long j24 = fVar.f15014a;
            if (fVar.f15015b) {
                j24 += j23;
            }
            long j25 = j24;
            for (l0 l0Var4 : this.I) {
                l0Var4.d(j25, 1, fVar.f15016c, this.f15049x, null);
            }
        }
        if (!gVar2.c()) {
            this.B = null;
        }
        this.f15043r = 3;
        return 0;
    }

    @Override
    public final boolean e(a8.r rVar) {
        d2 d2VarS;
        h0 h0VarM = p.m(rVar, true, false);
        if (h0VarM != null) {
            d2VarS = t0.s(h0VarM);
        } else {
            r0 r0Var = t0.B;
            d2VarS = d2.E;
        }
        this.f15042q = d2VarS;
        return h0VarM == null;
    }

    public final void f() {
        this.f15043r = 0;
        this.f15046u = 0;
    }

    public final void j(long j9) throws ParserException {
        v0 v0Var;
        int i10;
        long j10;
        d dVar;
        int i11;
        d dVar2;
        ArrayList arrayList;
        int i12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        boolean z10;
        int i16;
        boolean z11;
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty() || ((f7.c) arrayDeque.peek()).C != j9) {
                break;
            }
            f7.c cVar = (f7.c) arrayDeque.pop();
            int i17 = cVar.B;
            ArrayList arrayList4 = cVar.E;
            ArrayList arrayList5 = cVar.D;
            int i18 = this.f15029b;
            int i19 = 12;
            SparseArray sparseArray = this.f15031d;
            if (i17 == 1836019574) {
                androidx.media3.common.o oVarG = g(arrayList5);
                f7.c cVarQ = cVar.q(1836475768);
                cVarQ.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = cVarQ.D;
                int size = arrayList6.size();
                int i20 = 0;
                long jC = -9223372036854775807L;
                while (i20 < size) {
                    f7.d dVar3 = (f7.d) arrayList6.get(i20);
                    int i21 = dVar3.B;
                    u uVar = dVar3.C;
                    if (i21 == 1953654136) {
                        uVar.N(i19);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(uVar.m()), new d(uVar.m() - 1, uVar.m(), uVar.m(), uVar.m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (d) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i21 == 1835362404) {
                            uVar.N(8);
                            jC = c.e(uVar.m()) == 0 ? uVar.C() : uVar.G();
                        }
                    }
                    i20++;
                    arrayList6 = arrayList;
                    i19 = 12;
                }
                int i22 = 0;
                f7.c cVarQ2 = cVar.q(1835365473);
                v0 v0VarF = cVarQ2 != null ? c.f(cVarQ2) : null;
                y yVar = new y();
                f7.d dVarR = cVar.r(1969517665);
                if (dVarR != null) {
                    v0 v0VarK = c.k(dVarR);
                    yVar.b(v0VarK);
                    v0Var = v0VarK;
                } else {
                    v0Var = null;
                }
                f7.d dVarR2 = cVar.r(1836476516);
                dVarR2.getClass();
                v0 v0Var2 = new v0(c.g(dVarR2.C));
                ArrayList arrayListJ = c.j(cVar, yVar, jC, oVarG, (i18 & 16) != 0, false, new e(this), false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strB = p.b(arrayListJ);
                    int i23 = 0;
                    while (i23 < size2) {
                        t tVar = (t) arrayListJ.get(i23);
                        q qVar = tVar.f15124a;
                        a8.s sVar = this.H;
                        int i24 = qVar.f15094b;
                        int i25 = qVar.f15093a;
                        String str = strB;
                        androidx.media3.common.t tVar2 = qVar.f15099g;
                        long j11 = qVar.f15097e;
                        l0 l0VarW = sVar.w(i23, i24);
                        l0VarW.c(j11);
                        int i26 = i23;
                        androidx.media3.common.s sVarA = tVar2.a();
                        ArrayList arrayList7 = arrayListJ;
                        sVarA.l = x0.n(str);
                        if (i24 == 1) {
                            int i27 = yVar.f324a;
                            i10 = size2;
                            j10 = j11;
                            if (i27 != -1 && (i11 = yVar.f325b) != -1) {
                                sVarA.H = i27;
                                sVarA.I = i11;
                            }
                        } else {
                            i10 = size2;
                            j10 = j11;
                        }
                        p.l(i24, v0VarF, sVarA, tVar2.l, v0Var, v0Var2);
                        if (sparseArray2.size() == 1) {
                            dVar = (d) sparseArray2.valueAt(i22);
                        } else {
                            dVar = (d) sparseArray2.get(i25);
                            dVar.getClass();
                        }
                        sparseArray.put(i25, new g(l0VarW, tVar, dVar, new androidx.media3.common.t(sVarA)));
                        this.f15051z = Math.max(this.f15051z, j10);
                        i23 = i26 + 1;
                        strB = str;
                        arrayListJ = arrayList7;
                        size2 = i10;
                        i22 = 0;
                    }
                    this.H.q();
                } else {
                    ArrayList arrayList8 = arrayListJ;
                    c0.A(sparseArray.size() == size2);
                    int i28 = 0;
                    while (i28 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        t tVar3 = (t) arrayList9.get(i28);
                        q qVar2 = tVar3.f15124a;
                        g gVar = (g) sparseArray.get(qVar2.f15093a);
                        int i29 = qVar2.f15093a;
                        if (sparseArray2.size() == 1) {
                            dVar2 = (d) sparseArray2.valueAt(0);
                        } else {
                            dVar2 = (d) sparseArray2.get(i29);
                            dVar2.getClass();
                        }
                        gVar.f15020d = tVar3;
                        gVar.f15021e = dVar2;
                        gVar.f15017a.f(gVar.f15026j);
                        gVar.e();
                        i28++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i17 == 1836019558) {
                int size3 = arrayList4.size();
                int i30 = 0;
                while (i30 < size3) {
                    f7.c cVar2 = (f7.c) arrayList4.get(i30);
                    if (cVar2.B == 1953653094) {
                        f7.d dVarR3 = cVar2.r(1952868452);
                        ArrayList arrayList10 = cVar2.D;
                        dVarR3.getClass();
                        u uVar2 = dVarR3.C;
                        uVar2.N(8);
                        int iM = uVar2.m();
                        byte[] bArr2 = c.f15009a;
                        g gVar2 = (g) sparseArray.get(uVar2.m());
                        if (gVar2 == null) {
                            size3 = size3;
                            gVar2 = null;
                        } else {
                            s sVar2 = gVar2.f15018b;
                            if ((iM & 1) != 0) {
                                long jG = uVar2.G();
                                sVar2.f15110b = jG;
                                sVar2.f15111c = jG;
                            }
                            d dVar4 = gVar2.f15021e;
                            sVar2.f15109a = new d((iM & 2) != 0 ? uVar2.m() - 1 : dVar4.f15010a, (iM & 8) != 0 ? uVar2.m() : dVar4.f15011b, (iM & 16) != 0 ? uVar2.m() : dVar4.f15012c, (iM & 32) != 0 ? uVar2.m() : dVar4.f15013d);
                        }
                        if (gVar2 != null) {
                            s sVar3 = gVar2.f15018b;
                            long j12 = sVar3.f15122p;
                            boolean z12 = sVar3.f15123q;
                            gVar2.e();
                            gVar2.m = true;
                            f7.d dVarR4 = cVar2.r(1952867444);
                            if (dVarR4 == null || (i18 & 2) != 0) {
                                sVar3.f15122p = j12;
                                sVar3.f15123q = z12;
                            } else {
                                u uVar3 = dVarR4.C;
                                uVar3.N(8);
                                sVar3.f15122p = c.e(uVar3.m()) == 1 ? uVar3.G() : uVar3.C();
                                sVar3.f15123q = true;
                            }
                            int size4 = arrayList10.size();
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            while (true) {
                                i14 = 1953658222;
                                if (i31 >= size4) {
                                    break;
                                }
                                f7.d dVar5 = (f7.d) arrayList10.get(i31);
                                int i34 = i30;
                                if (dVar5.B == 1953658222) {
                                    u uVar4 = dVar5.C;
                                    uVar4.N(12);
                                    int iE = uVar4.E();
                                    if (iE > 0) {
                                        i33 += iE;
                                        i32++;
                                    }
                                }
                                i31++;
                                i30 = i34;
                            }
                            i12 = i30;
                            gVar2.f15024h = 0;
                            gVar2.f15023g = 0;
                            gVar2.f15022f = 0;
                            sVar3.f15112d = i32;
                            sVar3.f15113e = i33;
                            if (sVar3.f15115g.length < i32) {
                                sVar3.f15114f = new long[i32];
                                sVar3.f15115g = new int[i32];
                            }
                            if (sVar3.f15116h.length < i33) {
                                int i35 = (i33 * 125) / 100;
                                sVar3.f15116h = new int[i35];
                                sVar3.f15117i = new long[i35];
                                sVar3.f15118j = new boolean[i35];
                                sVar3.l = new boolean[i35];
                            }
                            int i36 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            while (true) {
                                long j13 = 0;
                                if (i36 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i13 = i18;
                                    q qVar3 = gVar2.f15020d.f15124a;
                                    d dVar6 = sVar3.f15109a;
                                    dVar6.getClass();
                                    r rVar = qVar3.l[dVar6.f15010a];
                                    f7.d dVarR5 = cVar2.r(1935763834);
                                    if (dVarR5 != null) {
                                        rVar.getClass();
                                        u uVar5 = dVarR5.C;
                                        int i39 = rVar.f15107d;
                                        uVar5.N(8);
                                        int iM2 = uVar5.m();
                                        byte[] bArr3 = c.f15009a;
                                        if ((iM2 & 1) == 1) {
                                            uVar5.O(8);
                                        }
                                        int iA = uVar5.A();
                                        int iE2 = uVar5.E();
                                        if (iE2 > sVar3.f15113e) {
                                            StringBuilder sbQ = oi.k.q("Saiz sample count ", iE2, " is greater than fragment sample count");
                                            sbQ.append(sVar3.f15113e);
                                            throw ParserException.a(null, sbQ.toString());
                                        }
                                        if (iA == 0) {
                                            boolean[] zArr = sVar3.l;
                                            i15 = 0;
                                            for (int i40 = 0; i40 < iE2; i40++) {
                                                int iA2 = uVar5.A();
                                                i15 += iA2;
                                                zArr[i40] = iA2 > i39;
                                            }
                                            z10 = false;
                                        } else {
                                            boolean z13 = iA > i39;
                                            i15 = iA * iE2;
                                            z10 = false;
                                            Arrays.fill(sVar3.l, 0, iE2, z13);
                                        }
                                        Arrays.fill(sVar3.l, iE2, sVar3.f15113e, z10);
                                        if (i15 > 0) {
                                            sVar3.f15120n.K(i15);
                                            sVar3.f15119k = true;
                                            sVar3.f15121o = true;
                                        }
                                    }
                                    f7.d dVarR6 = cVar2.r(1935763823);
                                    if (dVarR6 != null) {
                                        u uVar6 = dVarR6.C;
                                        uVar6.N(8);
                                        int iM3 = uVar6.m();
                                        byte[] bArr4 = c.f15009a;
                                        if ((iM3 & 1) == 1) {
                                            uVar6.O(8);
                                        }
                                        int iE3 = uVar6.E();
                                        if (iE3 != 1) {
                                            throw ParserException.a(null, "Unexpected saio entry count: " + iE3);
                                        }
                                        sVar3.f15111c += c.e(iM3) == 0 ? uVar6.C() : uVar6.G();
                                    }
                                    f7.d dVarR7 = cVar2.r(1936027235);
                                    if (dVarR7 != null) {
                                        h(dVarR7.C, 0, sVar3);
                                    }
                                    String str2 = rVar != null ? rVar.f15105b : null;
                                    u uVar7 = null;
                                    u uVar8 = null;
                                    for (int i41 = 0; i41 < arrayList10.size(); i41++) {
                                        f7.d dVar7 = (f7.d) arrayList10.get(i41);
                                        u uVar9 = dVar7.C;
                                        int i42 = dVar7.B;
                                        if (i42 == 1935828848) {
                                            uVar9.N(12);
                                            if (uVar9.m() == 1936025959) {
                                                uVar7 = uVar9;
                                            }
                                        } else if (i42 == 1936158820) {
                                            uVar9.N(12);
                                            if (uVar9.m() == 1936025959) {
                                                uVar8 = uVar9;
                                            }
                                        }
                                    }
                                    if (uVar7 != null && uVar8 != null) {
                                        uVar7.N(8);
                                        int iE4 = c.e(uVar7.m());
                                        uVar7.O(4);
                                        if (iE4 == 1) {
                                            uVar7.O(4);
                                        }
                                        if (uVar7.m() != 1) {
                                            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        uVar8.N(8);
                                        int iE5 = c.e(uVar8.m());
                                        uVar8.O(4);
                                        if (iE5 == 1) {
                                            if (uVar8.C() == 0) {
                                                throw ParserException.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iE5 >= 2) {
                                            uVar8.O(4);
                                        }
                                        if (uVar8.C() != 1) {
                                            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        uVar8.O(1);
                                        int iA3 = uVar8.A();
                                        int i43 = (iA3 & 240) >> 4;
                                        int i44 = iA3 & 15;
                                        boolean z14 = uVar8.A() == 1;
                                        if (z14) {
                                            int iA4 = uVar8.A();
                                            byte[] bArr5 = new byte[16];
                                            uVar8.k(0, 16, bArr5);
                                            if (iA4 == 0) {
                                                int iA5 = uVar8.A();
                                                byte[] bArr6 = new byte[iA5];
                                                uVar8.k(0, iA5, bArr6);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            sVar3.f15119k = true;
                                            sVar3.m = new r(z14, str2, iA4, bArr5, i43, i44, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i45 = 0; i45 < size5; i45++) {
                                        f7.d dVar8 = (f7.d) arrayList10.get(i45);
                                        if (dVar8.B == 1970628964) {
                                            u uVar10 = dVar8.C;
                                            uVar10.N(8);
                                            byte[] bArr7 = this.f15035h;
                                            uVar10.k(0, 16, bArr7);
                                            if (Arrays.equals(bArr7, N)) {
                                                h(uVar10, 16, sVar3);
                                            }
                                        }
                                    }
                                    break;
                                }
                                f7.d dVar9 = (f7.d) arrayList10.get(i36);
                                if (dVar9.B == i14) {
                                    int i46 = i37 + 1;
                                    u uVar11 = dVar9.C;
                                    uVar11.N(8);
                                    int iM4 = uVar11.m();
                                    byte[] bArr8 = c.f15009a;
                                    q qVar4 = gVar2.f15020d.f15124a;
                                    d dVar10 = sVar3.f15109a;
                                    String str3 = i0.f5136a;
                                    sVar3.f15115g[i37] = uVar11.E();
                                    long[] jArr = sVar3.f15114f;
                                    i16 = i18;
                                    long j14 = sVar3.f15110b;
                                    jArr[i37] = j14;
                                    if ((iM4 & 1) != 0) {
                                        jArr[i37] = j14 + ((long) uVar11.m());
                                    }
                                    boolean z15 = (iM4 & 4) != 0;
                                    int iM5 = dVar10.f15013d;
                                    if (z15) {
                                        iM5 = uVar11.m();
                                    }
                                    boolean z16 = (iM4 & 256) != 0;
                                    boolean z17 = z15;
                                    boolean z18 = (iM4 & 512) != 0;
                                    boolean z19 = (iM4 & 1024) != 0;
                                    boolean z20 = (iM4 & 2048) != 0;
                                    boolean z21 = z19;
                                    long[] jArr2 = qVar4.f15101i;
                                    int i47 = iM5;
                                    long[] jArr3 = qVar4.f15102j;
                                    if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                        z11 = z16;
                                    } else {
                                        long j15 = jArr2[0];
                                        if (j15 == 0) {
                                            z11 = z16;
                                        } else {
                                            z11 = z16;
                                            long j16 = qVar4.f15096d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (i0.Q(j15, 1000000L, j16, roundingMode) + i0.Q(jArr3[0], 1000000L, qVar4.f15095c, roundingMode) >= qVar4.f15097e) {
                                            }
                                        }
                                        j13 = jArr3[0];
                                    }
                                    int[] iArr = sVar3.f15116h;
                                    long[] jArr4 = sVar3.f15117i;
                                    boolean z22 = z11;
                                    boolean[] zArr2 = sVar3.f15118j;
                                    boolean z23 = qVar4.f15094b == 2 && (i16 & 1) != 0;
                                    int i48 = sVar3.f15115g[i37] + i38;
                                    int i49 = i38;
                                    long j17 = qVar4.f15095c;
                                    boolean z24 = z20;
                                    long j18 = sVar3.f15122p;
                                    int i50 = i49;
                                    while (i50 < i48) {
                                        int iM6 = z22 ? uVar11.m() : dVar10.f15011b;
                                        boolean z25 = z24;
                                        if (iM6 < 0) {
                                            throw ParserException.a(null, "Unexpected negative value: " + iM6);
                                        }
                                        int iM7 = z18 ? uVar11.m() : dVar10.f15012c;
                                        if (iM7 < 0) {
                                            throw ParserException.a(null, "Unexpected negative value: " + iM7);
                                        }
                                        int iM8 = z21 ? uVar11.m() : (i50 == 0 && z17) ? i47 : dVar10.f15013d;
                                        int i51 = i48;
                                        long[] jArr5 = jArr4;
                                        long jQ = i0.Q((((long) (z25 ? uVar11.m() : 0)) + j18) - j13, 1000000L, j17, RoundingMode.DOWN);
                                        jArr5[i50] = jQ;
                                        if (!sVar3.f15123q) {
                                            jArr5[i50] = jQ + gVar2.f15020d.f15132i;
                                        }
                                        iArr[i50] = iM7;
                                        zArr2[i50] = ((iM8 >> 16) & 1) == 0 && (!z23 || i50 == 0);
                                        j18 += (long) iM6;
                                        i50++;
                                        z24 = z25;
                                        z23 = z23;
                                        jArr4 = jArr5;
                                        i48 = i51;
                                    }
                                    sVar3.f15122p = j18;
                                    i37 = i46;
                                    i38 = i48;
                                } else {
                                    i16 = i18;
                                }
                                i36++;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                i18 = i16;
                                size4 = size4;
                                i14 = 1953658222;
                            }
                        } else {
                            i12 = i30;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i13 = i18;
                        }
                    } else {
                        size3 = size3;
                        i12 = i30;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i13 = i18;
                    }
                    i30 = i12 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                    i18 = i13;
                }
                androidx.media3.common.o oVarG2 = g(arrayList5);
                if (oVarG2 != null) {
                    int size6 = sparseArray.size();
                    for (int i52 = 0; i52 < size6; i52++) {
                        g gVar3 = (g) sparseArray.valueAt(i52);
                        q qVar5 = gVar3.f15020d.f15124a;
                        d dVar11 = gVar3.f15018b.f15109a;
                        String str4 = i0.f5136a;
                        r rVar2 = qVar5.l[dVar11.f15010a];
                        androidx.media3.common.o oVarA = oVarG2.a(rVar2 != null ? rVar2.f15105b : null);
                        androidx.media3.common.s sVarA2 = gVar3.f15026j.a();
                        sVarA2.f1505q = oVarA;
                        gVar3.f15017a.f(new androidx.media3.common.t(sVarA2));
                    }
                }
                if (this.f15050y != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i53 = 0; i53 < size7; i53++) {
                        g gVar4 = (g) sparseArray.valueAt(i53);
                        long j19 = this.f15050y;
                        int i54 = gVar4.f15022f;
                        while (true) {
                            s sVar4 = gVar4.f15018b;
                            if (i54 >= sVar4.f15113e || sVar4.f15117i[i54] > j19) {
                                break;
                            }
                            if (sVar4.f15118j[i54]) {
                                gVar4.f15025i = i54;
                            }
                            i54++;
                        }
                    }
                    this.f15050y = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((f7.c) arrayDeque.peek()).E.add(cVar);
            }
        }
        f();
    }

    @Override
    public final void release() {
    }
}
