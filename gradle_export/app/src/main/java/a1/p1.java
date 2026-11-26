package a1;

import bv.e3;
import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class p1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public int C;
    public final Object D;

    public p1(int i10, xw.e eVar, k00.c cVar) {
        super(2, cVar);
        this.A = 11;
        this.C = i10;
        this.D = eVar;
    }

    public p1(t1 t1Var, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.D = t1Var;
    }

    public p1(Object obj, int i10, k00.c cVar, int i11) {
        super(2, cVar);
        this.A = i11;
        this.D = obj;
        this.C = i10;
    }

    public p1(js.h hVar, int i10, int i11, k00.c cVar) {
        super(2, cVar);
        this.A = 6;
        this.D = hVar;
        this.B = i10;
        this.C = i11;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                p1 p1Var = new p1((t1) this.D, cVar);
                p1Var.C = ((Number) obj).intValue();
                return p1Var;
            case 1:
                return new p1((bt.j2) this.D, this.C, cVar, 1);
            case 2:
                return new p1((e3) this.D, this.C, cVar, 2);
            case 3:
                return new p1((ds.n) this.D, this.C, cVar, 3);
            case 4:
                return new p1((j0.v) this.D, this.C, cVar, 4);
            case 5:
                return new p1((hx.e0) this.D, this.C, cVar, 5);
            case 6:
                return new p1((js.h) this.D, this.B, this.C, cVar);
            case 7:
                return new p1((l0.f1) this.D, this.C, cVar, 7);
            case 8:
                return new p1((m0.w) this.D, this.C, cVar, 8);
            case 9:
                return new p1((qo.y) this.D, this.C, cVar, 9);
            case 10:
                return new p1((uu.w) this.D, this.C, cVar, 10);
            default:
                return new p1(this.C, (xw.e) this.D, cVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create(Integer.valueOf(((Number) obj).intValue()), (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((d0.y1) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        d0 d0Var;
        Object value;
        Long releaseAtEpochMillis;
        int i10 = this.A;
        int i11 = 0;
        k00.c cVar = null;
        l00.a aVar = g00.b0.a;
        Object obj2 = this.D;
        switch (i10) {
            case 0:
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar;
                }
                ri.t1.O(obj);
                if (Math.abs(this.C) != 1 || (d0Var = ((t1) obj2).f124b0) == null) {
                    return aVar;
                }
                this.B = 1;
                Object objK = a40.c0.k(new c0(d0Var, cVar, i11), this);
                if (objK != aVar2) {
                    objK = aVar;
                }
                return objK == aVar2 ? aVar2 : aVar;
            case 1:
                l00.a aVar3 = l00.a.A;
                int i13 = this.B;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar;
                }
                ri.t1.O(obj);
                os.x xVar = ((bt.j2) obj2).t;
                int i14 = this.C;
                this.B = 1;
                return xVar.w(i14, this) == aVar3 ? aVar3 : aVar;
            case 2:
                l00.a aVar4 = l00.a.A;
                int i15 = this.B;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                d40.p1 p1Var = ((e3) obj2).d.C;
                bv.s1 s1Var = new bv.s1(this.C, (k00.c) null, 0);
                this.B = 1;
                Object objT = d40.o.t(p1Var, s1Var, this);
                return objT == aVar4 ? aVar4 : objT;
            case 3:
                l00.a aVar5 = l00.a.A;
                int i16 = this.B;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar;
                }
                ri.t1.O(obj);
                os.x xVar2 = ((ds.n) obj2).h;
                int i17 = this.C;
                this.B = 1;
                return xVar2.w(i17, this) == aVar5 ? aVar5 : aVar;
            case 4:
                j0.v vVar = (j0.v) obj2;
                l00.a aVar6 = l00.a.A;
                int i18 = this.B;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar;
                }
                ri.t1.O(obj);
                if (vVar.f7826j.a()) {
                    return aVar;
                }
                int iH = vVar.f7821e.f7808b.h();
                int i19 = this.C;
                if (iH == i19) {
                    return aVar;
                }
                this.B = 1;
                return j0.v.j(vVar, i19, this) == aVar6 ? aVar6 : aVar;
            case 5:
                l00.a aVar7 = l00.a.A;
                int i20 = this.B;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar;
                }
                ri.t1.O(obj);
                xw.d dVar = ((hx.e0) obj2).e;
                int i21 = this.C;
                this.B = 1;
                return dVar.a(i21, this) == aVar7 ? aVar7 : aVar;
            case 6:
                l00.a aVar8 = l00.a.A;
                ri.t1.O(obj);
                RandomAccessFile randomAccessFile = new RandomAccessFile(((js.h) obj2).a(), "r");
                int i22 = this.B;
                long j9 = this.C;
                long j10 = ((long) (i22 - 1)) * j9;
                try {
                    byte[] bArr = new byte[(int) ab.a0.A(randomAccessFile.length() - j10, 0L, j9)];
                    randomAccessFile.seek(j10);
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    return bArr;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ta.c0.C(randomAccessFile, th2);
                        throw th3;
                    }
                }
            case 7:
                l00.a aVar9 = l00.a.A;
                int i23 = this.B;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar;
                }
                ri.t1.O(obj);
                l0.b1 b1Var = ((l0.f1) obj2).P;
                int i24 = this.C;
                this.B = 1;
                return b1Var.e(i24, this) == aVar9 ? aVar9 : aVar;
            case 8:
                m0.w wVar = (m0.w) obj2;
                l00.a aVar10 = l00.a.A;
                int i25 = this.B;
                if (i25 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (wVar.i(this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                double d3 = 0.0f;
                if (-0.5d > d3 || d3 > 0.5d) {
                    g0.a.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                wVar.s(0.0f, wVar.j(this.C), true);
                return aVar;
            case 9:
                l00.a aVar11 = l00.a.A;
                int i26 = this.B;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar;
                }
                ri.t1.O(obj);
                vn.o oVar = ((qo.y) obj2).i;
                int i27 = this.C;
                this.B = 1;
                return oVar.b(i27, this) == aVar11 ? aVar11 : aVar;
            case 10:
                l00.a aVar12 = l00.a.A;
                int i28 = this.B;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar;
                }
                ri.t1.O(obj);
                d40.p1 p1Var2 = ((uu.w) obj2).J;
                Integer num = new Integer(this.C);
                this.B = 1;
                p1Var2.emit(num, this);
                return aVar == aVar12 ? aVar12 : aVar;
            default:
                xw.e eVar = (xw.e) obj2;
                d40.p1 p1Var3 = eVar.e;
                l00.a aVar13 = l00.a.A;
                int i29 = this.B;
                if (i29 != 0 && i29 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri.t1.O(obj);
                while (this.C == eVar.k) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    d40.p1 p1Var4 = eVar.f;
                    Long l = new Long(jCurrentTimeMillis);
                    p1Var4.getClass();
                    p1Var4.k((Object) null, l);
                    d40.p1 p1Var5 = eVar.g;
                    do {
                        value = p1Var5.getValue();
                    } while (!p1Var5.i(value, eVar.a((ReciterCollectionEvent) p1Var3.getValue())));
                    ReciterCollectionEvent reciterCollectionEvent = (ReciterCollectionEvent) p1Var3.getValue();
                    if (reciterCollectionEvent == null || (releaseAtEpochMillis = reciterCollectionEvent.getReleaseAtEpochMillis()) == null) {
                        return aVar;
                    }
                    long jLongValue = releaseAtEpochMillis.longValue();
                    if (jCurrentTimeMillis >= jLongValue) {
                        eVar.b(jCurrentTimeMillis);
                        return aVar;
                    }
                    long j11 = jLongValue - jCurrentTimeMillis;
                    long jMax = 1000;
                    if (j11 > 0) {
                        long j12 = 60000;
                        if (j11 >= 60000) {
                            jMax = 3600000;
                            if (j11 < 3600000) {
                                jMax = j12;
                            } else {
                                j12 = 86400000;
                                if (j11 >= 86400000) {
                                    jMax = j12;
                                }
                            }
                        }
                        long j13 = j11 % jMax;
                        if (j13 > 1) {
                            jMax = j13;
                        }
                        jMax = Math.max(50L, jMax);
                    }
                    this.B = 1;
                    if (a40.c0.l(jMax, this) == aVar13) {
                        return aVar13;
                    }
                }
                return aVar;
        }
    }
}
