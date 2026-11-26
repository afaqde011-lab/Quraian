package c8;

import a8.l0;
import a8.q;
import a8.r;
import a8.s;
import a8.v;
import androidx.media3.common.ParserException;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import com.google.android.gms.cast.MediaStatus;
import e7.i0;
import e7.u;
import fh.r0;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import tf.w;

public final class b implements q {

    public final u f2976a;

    public final a8.d f2977b;

    public final boolean f2978c;

    public final w f2979d;

    public int f2980e;

    public s f2981f;

    public c f2982g;

    public long f2983h;

    public e[] f2984i;

    public long f2985j;

    public e f2986k;
    public int l;
    public long m;

    public long f2987n;

    public int f2988o;

    public boolean f2989p;

    public b(int i10, w wVar) {
        this.f2979d = wVar;
        this.f2978c = (i10 & 1) == 0;
        this.f2976a = new u(12);
        this.f2977b = new a8.d();
        this.f2981f = new gj.e(2);
        this.f2984i = new e[0];
        this.m = -1L;
        this.f2987n = -1L;
        this.l = -1;
        this.f2983h = -9223372036854775807L;
    }

    @Override
    public final void a(s sVar) {
        this.f2980e = 0;
        if (this.f2978c) {
            sVar = new c7.c(sVar, this.f2979d);
        }
        this.f2981f = sVar;
        this.f2985j = -1L;
    }

    @Override
    public final void b(long j9, long j10) {
        this.f2985j = -1L;
        this.f2986k = null;
        for (e eVar : this.f2984i) {
            if (eVar.f3009k == 0) {
                eVar.f3007i = 0;
            } else {
                eVar.f3007i = eVar.f3010n[i0.e(eVar.m, j9, true)];
            }
        }
        if (j9 != 0) {
            this.f2980e = 6;
        } else if (this.f2984i.length == 0) {
            this.f2980e = 0;
        } else {
            this.f2980e = 3;
        }
    }

    @Override
    public final int d(r rVar, a8.u uVar) throws ParserException {
        boolean z10;
        e eVar;
        int i10;
        e eVar2;
        if (this.f2985j != -1) {
            long position = rVar.getPosition();
            long j9 = this.f2985j;
            if (j9 < position || j9 > MediaStatus.COMMAND_STREAM_TRANSFER + position) {
                uVar.f307a = j9;
                z10 = true;
            } else {
                rVar.u((int) (j9 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f2985j = -1L;
        if (z10) {
            return 1;
        }
        int i11 = this.f2980e;
        int i12 = 4;
        e eVar3 = null;
        a8.d dVar = this.f2977b;
        u uVar2 = this.f2976a;
        switch (i11) {
            case 0:
                if (!e(rVar)) {
                    throw ParserException.a(null, "AVI Header List not found");
                }
                rVar.u(12);
                this.f2980e = 1;
                return 0;
            case 1:
                rVar.readFully(uVar2.f5182a, 0, 12);
                uVar2.N(0);
                dVar.getClass();
                dVar.f238a = uVar2.o();
                dVar.f239b = uVar2.o();
                dVar.f240c = 0;
                if (dVar.f238a != 1414744396) {
                    throw ParserException.a(null, "LIST expected, found: " + dVar.f238a);
                }
                int iO = uVar2.o();
                dVar.f240c = iO;
                if (iO == 1819436136) {
                    this.l = dVar.f239b;
                    this.f2980e = 2;
                    return 0;
                }
                throw ParserException.a(null, "hdrl expected, found: " + dVar.f240c);
            case 2:
                int i13 = this.l - 4;
                u uVar3 = new u(i13);
                rVar.readFully(uVar3.f5182a, 0, i13);
                f fVarB = f.b(1819436136, uVar3);
                int i14 = fVarB.f3012b;
                if (i14 != 1819436136) {
                    throw ParserException.a(null, "Unexpected header list type " + i14);
                }
                c cVar = (c) fVarB.a(c.class);
                if (cVar == null) {
                    throw ParserException.a(null, "AviHeader not found");
                }
                this.f2982g = cVar;
                this.f2983h = ((long) cVar.f2992c) * ((long) cVar.f2990a);
                ArrayList arrayList = new ArrayList();
                r0 r0VarListIterator = fVarB.f3011a.listIterator(0);
                int i15 = 0;
                while (r0VarListIterator.hasNext()) {
                    a aVar = (a) r0VarListIterator.next();
                    if (aVar.getType() == 1819440243) {
                        f fVar = (f) aVar;
                        int i16 = i15 + 1;
                        d dVar2 = (d) fVar.a(d.class);
                        g gVar = (g) fVar.a(g.class);
                        if (dVar2 == null) {
                            e7.a.m("AviExtractor", "Missing Stream Header");
                        } else if (gVar == null) {
                            e7.a.m("AviExtractor", "Missing Stream Format");
                        } else {
                            long j10 = dVar2.f2996d;
                            long j11 = 1000000 * ((long) dVar2.f2994b);
                            long j12 = dVar2.f2995c;
                            String str = i0.f5136a;
                            long jQ = i0.Q(j10, j11, j12, RoundingMode.DOWN);
                            t tVar = gVar.f3013a;
                            androidx.media3.common.s sVarA = tVar.a();
                            sVarA.f1491a = Integer.toString(i15);
                            int i17 = dVar2.f2997e;
                            if (i17 != 0) {
                                sVarA.f1502n = i17;
                            }
                            h hVar = (h) fVar.a(h.class);
                            if (hVar != null) {
                                sVarA.f1492b = hVar.f3014a;
                            }
                            int iH = x0.h(tVar.f1594n);
                            if (iH == 1 || iH == 2) {
                                l0 l0VarW = this.f2981f.w(i15, iH);
                                l0VarW.f(new t(sVarA));
                                l0VarW.c(jQ);
                                this.f2983h = Math.max(this.f2983h, jQ);
                                eVar = new e(i15, dVar2, l0VarW);
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i15 = i16;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i15 = i16;
                    }
                }
                this.f2984i = (e[]) arrayList.toArray(new e[0]);
                this.f2981f.q();
                this.f2980e = 3;
                return 0;
            case 3:
                if (this.m != -1) {
                    long position2 = rVar.getPosition();
                    long j13 = this.m;
                    if (position2 != j13) {
                        this.f2985j = j13;
                        return 0;
                    }
                }
                rVar.a(0, 12, uVar2.f5182a);
                rVar.t();
                uVar2.N(0);
                dVar.getClass();
                dVar.f238a = uVar2.o();
                dVar.f239b = uVar2.o();
                dVar.f240c = 0;
                int iO2 = uVar2.o();
                int i18 = dVar.f238a;
                if (i18 == 1179011410) {
                    rVar.u(12);
                    return 0;
                }
                if (i18 != 1414744396 || iO2 != 1769369453) {
                    this.f2985j = rVar.getPosition() + ((long) dVar.f239b) + 8;
                    return 0;
                }
                long position3 = rVar.getPosition();
                this.m = position3;
                this.f2987n = position3 + ((long) dVar.f239b) + 8;
                if (!this.f2989p) {
                    c cVar2 = this.f2982g;
                    cVar2.getClass();
                    if ((cVar2.f2991b & 16) == 16) {
                        this.f2980e = 4;
                        this.f2985j = this.f2987n;
                        return 0;
                    }
                    this.f2981f.b(new v(this.f2983h));
                    this.f2989p = true;
                }
                this.f2985j = rVar.getPosition() + 12;
                this.f2980e = 6;
                return 0;
            case 4:
                rVar.readFully(uVar2.f5182a, 0, 8);
                uVar2.N(0);
                int iO3 = uVar2.o();
                int iO4 = uVar2.o();
                if (iO3 != 829973609) {
                    this.f2985j = rVar.getPosition() + ((long) iO4);
                    return 0;
                }
                this.f2980e = 5;
                this.f2988o = iO4;
                return 0;
            case 5:
                u uVar4 = new u(this.f2988o);
                rVar.readFully(uVar4.f5182a, 0, this.f2988o);
                long j14 = 0;
                if (uVar4.a() >= 16) {
                    int i19 = uVar4.f5183b;
                    uVar4.O(8);
                    long jO = uVar4.o();
                    long j15 = this.m;
                    j14 = jO <= j15 ? j15 + 8 : 0L;
                    uVar4.N(i19);
                }
                while (uVar4.a() >= 16) {
                    int iO5 = uVar4.o();
                    int iO6 = uVar4.o();
                    long jO2 = ((long) uVar4.o()) + j14;
                    uVar4.O(i12);
                    e[] eVarArr = this.f2984i;
                    int length = eVarArr.length;
                    int i20 = 0;
                    while (true) {
                        if (i20 < length) {
                            eVar2 = eVarArr[i20];
                            if (eVar2.f3001c != iO5 && eVar2.f3002d != iO5) {
                                i20++;
                            }
                        } else {
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        boolean z11 = (iO6 & 16) == 16;
                        if (eVar2.l == -1) {
                            eVar2.l = jO2;
                        }
                        if (z11) {
                            if (eVar2.f3009k == eVar2.f3010n.length) {
                                long[] jArr = eVar2.m;
                                eVar2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.f3010n;
                                eVar2.f3010n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.m;
                            int i21 = eVar2.f3009k;
                            jArr2[i21] = jO2;
                            eVar2.f3010n[i21] = eVar2.f3008j;
                            eVar2.f3009k = i21 + 1;
                        }
                        eVar2.f3008j++;
                    }
                    i12 = 4;
                }
                for (e eVar4 : this.f2984i) {
                    eVar4.m = Arrays.copyOf(eVar4.m, eVar4.f3009k);
                    eVar4.f3010n = Arrays.copyOf(eVar4.f3010n, eVar4.f3009k);
                    if ((eVar4.f3001c & 1651965952) == 1651965952 && eVar4.f2999a.f2998f != 0 && (i10 = eVar4.f3009k) > 0) {
                        eVar4.f3004f = i10;
                    }
                }
                this.f2989p = true;
                if (this.f2984i.length == 0) {
                    this.f2981f.b(new v(this.f2983h));
                } else {
                    this.f2981f.b(new v(this, this.f2983h, 2));
                }
                this.f2980e = 6;
                this.f2985j = this.m;
                return 0;
            case 6:
                if (rVar.getPosition() >= this.f2987n) {
                    return -1;
                }
                e eVar5 = this.f2986k;
                if (eVar5 != null) {
                    int i22 = eVar5.f3006h;
                    int iA = i22 - eVar5.f3000b.a(rVar, i22, false);
                    eVar5.f3006h = iA;
                    boolean z12 = iA == 0;
                    if (z12) {
                        if (eVar5.f3005g > 0) {
                            l0 l0Var = eVar5.f3000b;
                            int i23 = eVar5.f3007i;
                            l0Var.d((eVar5.f3003e * ((long) i23)) / ((long) eVar5.f3004f), Arrays.binarySearch(eVar5.f3010n, i23) >= 0 ? 1 : 0, eVar5.f3005g, 0, null);
                        }
                        eVar5.f3007i++;
                    }
                    if (z12) {
                        this.f2986k = null;
                    }
                    return 0;
                }
                if ((rVar.getPosition() & 1) == 1) {
                    rVar.u(1);
                }
                rVar.a(0, 12, uVar2.f5182a);
                uVar2.N(0);
                int iO7 = uVar2.o();
                if (iO7 == 1414744396) {
                    uVar2.N(8);
                    rVar.u(uVar2.o() == 1769369453 ? 12 : 8);
                    rVar.t();
                    return 0;
                }
                int iO8 = uVar2.o();
                if (iO7 == 1263424842) {
                    this.f2985j = rVar.getPosition() + ((long) iO8) + 8;
                    return 0;
                }
                rVar.u(8);
                rVar.t();
                for (e eVar6 : this.f2984i) {
                    if (eVar6.f3001c == iO7 || eVar6.f3002d == iO7) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.f2985j = rVar.getPosition() + ((long) iO8);
                            return 0;
                        }
                        eVar3.f3005g = iO8;
                        eVar3.f3006h = iO8;
                        this.f2986k = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.f2985j = rVar.getPosition() + ((long) iO8);
                    return 0;
                }
                eVar3.f3005g = iO8;
                eVar3.f3006h = iO8;
                this.f2986k = eVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public final boolean e(r rVar) {
        u uVar = this.f2976a;
        rVar.a(0, 12, uVar.f5182a);
        uVar.N(0);
        if (uVar.o() != 1179011410) {
            return false;
        }
        uVar.O(4);
        return uVar.o() == 541677121;
    }

    @Override
    public final void release() {
    }
}
