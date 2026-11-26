package t40;

import android.graphics.Rect;
import g00.b0;
import h00.r;
import h00.v;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import k00.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import l1.z0;
import u00.k;
import u40.d;
import u40.e;
import u40.g;
import v40.c;

public final class a extends n implements k {
    public final z0 A;
    public final z0 B;
    public final z C;
    public final z0 D;

    public a(z0 z0Var, z0 z0Var2, z zVar, z0 z0Var3) {
        super(1);
        this.A = z0Var;
        this.B = z0Var2;
        this.C = zVar;
        this.D = z0Var3;
    }

    @Override
    public final Object invoke(Object obj) {
        long j;
        float f;
        float f2;
        int i;
        ?? r7;
        e eVar;
        long jLongValue = ((Number) obj).longValue();
        z0 z0Var = this.A;
        long j2 = 0;
        long jLongValue2 = ((Number) z0Var.getValue()).longValue() > 0 ? jLongValue - ((Number) z0Var.getValue()).longValue() : 0L;
        z0Var.setValue(Long.valueOf(jLongValue));
        Object obj2 = this.C.A;
        if (obj2 == null) {
            m.k("partySystems");
            throw null;
        }
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            long j3 = dVar.b;
            boolean z = dVar.c;
            c cVar = dVar.d;
            ArrayList<v40.a> arrayList2 = dVar.e;
            u40.b bVar = dVar.a;
            long jCurrentTimeMillis = System.currentTimeMillis() - j3;
            bVar.getClass();
            long j4 = j2;
            long j5 = 0;
            ?? arrayList3 = x.A;
            if (jCurrentTimeMillis < j5) {
                it = it;
                j = jLongValue2;
            } else {
                long j6 = cVar.a.a;
                if ((j6 <= j4 || cVar.d < j6 || arrayList2.size() != 0) && !z) {
                    arrayList2.size();
                }
                float f3 = jLongValue2 / 1000.0f;
                Rect drawArea = (Rect) this.D.getValue();
                m.e(drawArea, "drawArea");
                int i2 = 2;
                if (z) {
                    cVar.getClass();
                    cVar.e += f3;
                    v40.b bVar2 = cVar.a;
                    f = 0.0f;
                    long j7 = bVar2.a;
                    float f4 = j7;
                    float f5 = f4 / 1000.0f;
                    float f6 = cVar.d;
                    if (f6 == 0.0f && f3 > f5) {
                        cVar.e = f5;
                    }
                    float f7 = cVar.e;
                    float f8 = bVar2.b;
                    if (f7 >= f8 && (j7 == j4 || f6 < f4)) {
                        z00.e eVar2 = new z00.e(1, (int) (f7 / f8), 1);
                        ArrayList arrayList4 = new ArrayList(r.q0(eVar2, 10));
                        Iterator it2 = eVar2.iterator();
                        while (true) {
                            z00.d dVar2 = (z00.d) it2;
                            if (!dVar2.C) {
                                j = jLongValue2;
                                cVar.e %= bVar2.b;
                                r7 = arrayList4;
                                break;
                            }
                            dVar2.nextInt();
                            List list2 = bVar.d;
                            g gVar = bVar.h;
                            Random random = cVar.c;
                            w40.d dVar3 = (w40.d) list2.get(random.nextInt(list2.size()));
                            f fVar = bVar.g;
                            Iterator it3 = it2;
                            if (fVar instanceof e) {
                                e eVar3 = (e) fVar;
                                eVar = new e(eVar3.a, eVar3.b);
                            } else {
                                if (!(fVar instanceof u40.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                float f9 = (float) 0.5d;
                                eVar = new e(drawArea.width() * f9, drawArea.height() * f9);
                            }
                            w40.e eVar4 = new w40.e(eVar.a, eVar.b);
                            float f11 = dVar3.a * cVar.b;
                            float f12 = dVar3.b;
                            float fNextFloat = (random.nextFloat() * 0.2f * f12) + f12;
                            List list3 = bVar.f;
                            w40.c cVar2 = (w40.c) list3.get(random.nextInt(list3.size()));
                            List list4 = bVar.e;
                            int iIntValue = ((Number) list4.get(random.nextInt(list4.size()))).intValue();
                            float f13 = bVar.c;
                            float fNextFloat2 = bVar.b;
                            if (f13 != -1.0f) {
                                fNextFloat2 += random.nextFloat() * (f13 - fNextFloat2);
                            }
                            int i3 = bVar.a / 2;
                            int i4 = 270 - i3;
                            float f14 = fNextFloat2;
                            double radians = Math.toRadians((random.nextDouble() * ((double) ((i3 + 270) - i4))) + ((double) i4));
                            arrayList4.add(new v40.a(eVar4, iIntValue, f11, fNextFloat, cVar2, new w40.e(f14 * ((float) Math.cos(radians)), ((float) Math.sin(radians)) * f14), cVar.a(gVar) * 1.5f, cVar.a(gVar) * 8.0f, cVar.b));
                            it2 = it3;
                            jLongValue2 = jLongValue2;
                        }
                    } else {
                        j = jLongValue2;
                        r7 = arrayList3;
                    }
                    cVar.d = (1000 * f3) + cVar.d;
                    arrayList2.addAll(r7);
                } else {
                    j = jLongValue2;
                    f = 0.0f;
                }
                for (v40.a aVar : arrayList2) {
                    aVar.getClass();
                    w40.e eVar5 = aVar.o;
                    w40.e eVar6 = aVar.g;
                    float f15 = 1.0f / aVar.d;
                    eVar6.a = (eVar5.a * f15) + eVar6.a;
                    eVar6.b = (eVar5.b * f15) + eVar6.b;
                    float f16 = aVar.c;
                    w40.e eVar7 = aVar.h;
                    w40.e eVar8 = aVar.a;
                    aVar.n = f3 > f ? 1.0f / f3 : 60.0f;
                    if (eVar8.b > drawArea.height()) {
                        aVar.p = 0;
                        i = i2;
                        f2 = f;
                    } else {
                        float f17 = eVar7.a + eVar6.a;
                        float f18 = eVar7.b + eVar6.b;
                        float f19 = f17 * 0.9f;
                        eVar7.a = f19;
                        float f21 = f18 * 0.9f;
                        eVar7.b = f21;
                        float f22 = aVar.n;
                        float f23 = f3 * f22 * aVar.k;
                        eVar8.a = (f19 * f23) + eVar8.a;
                        eVar8.b = (f21 * f23) + eVar8.b;
                        long j8 = aVar.f - ((long) (1000 * f3));
                        aVar.f = j8;
                        if (j8 <= j4) {
                            int i5 = aVar.p - ((int) ((5 * f3) * f22));
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            aVar.p = i5;
                        }
                        float f24 = (aVar.j * f3 * f22) + aVar.l;
                        aVar.l = f24;
                        if (f24 >= 360.0f) {
                            f2 = f;
                            aVar.l = f2;
                        } else {
                            f2 = f;
                        }
                        float fAbs = aVar.m - ((Math.abs(aVar.i) * f3) * aVar.n);
                        aVar.m = fAbs;
                        if (fAbs < f2) {
                            aVar.m = f16;
                        }
                        i = i2;
                        aVar.q = Math.abs((aVar.m / f16) - 0.5f) * i;
                        aVar.r = (aVar.p << 24) | (aVar.b & 16777215);
                        aVar.s = drawArea.contains((int) eVar8.a, (int) eVar8.b);
                    }
                    f = f2;
                    i2 = i;
                }
                v.x0(u40.c.A, arrayList2);
                ArrayList<v40.a> arrayList5 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((v40.a) obj3).s) {
                        arrayList5.add(obj3);
                    }
                }
                arrayList3 = new ArrayList(r.q0(arrayList5, 10));
                for (v40.a aVar2 : arrayList5) {
                    m.e(aVar2, "<this>");
                    w40.e eVar9 = aVar2.a;
                    float f25 = eVar9.a;
                    float f26 = eVar9.b;
                    float f27 = aVar2.c;
                    arrayList3.add(new u40.a(f25, f26, f27, f27, aVar2.r, aVar2.l, aVar2.q, aVar2.e, aVar2.p));
                }
            }
            arrayList.add(arrayList3);
            it = it;
            j2 = j4;
            jLongValue2 = j;
        }
        this.B.setValue(r.r0(arrayList));
        return b0.a;
    }
}
