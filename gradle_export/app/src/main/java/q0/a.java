package q0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import b3.o2;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import kotlin.NoWhenBranchMatchedException;

public final class a implements u00.k {
    public final int A;
    public final Object B;

    public a(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public a(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj) {
        String strConcat;
        StringBuilder sb2;
        int i10;
        float fCeil;
        int i11;
        i2.m mVar;
        boolean z10;
        i2.m mVar2;
        k2.b bVar;
        a1.i iVar;
        float f3;
        float f10;
        long jQ;
        int i12 = this.A;
        Object obj2 = this.B;
        switch (i12) {
            case 0:
                ((j3.a0) obj).a(e1.g0.f4964c, new e1.f0(y0.A, ((e1.n) obj2).a(), e1.e0.B, true));
                return g00.b0.a;
            case 1:
                n1 n1Var = (n1) obj2;
                if (!((g2.y) ((g2.x) obj)).a()) {
                    n1Var.f12667b.Z0(-1);
                }
                return g00.b0.a;
            case 2:
                b2 b2Var = (b2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                l1.e1 e1Var = b2Var.f12569a;
                float fH = e1Var.h() + fFloatValue;
                l1.e1 e1Var2 = b2Var.f12570b;
                if (fH > e1Var2.h()) {
                    fFloatValue = e1Var2.h() - e1Var.h();
                } else if (fH < 0.0f) {
                    fFloatValue = -e1Var.h();
                }
                e1Var.i(e1Var.h() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 3:
                q3.d0 d0Var = (q3.d0) obj;
                return ((q3.j) obj2).a(new q3.d0(null, d0Var.f12730b, d0Var.f12731c, d0Var.f12732d, d0Var.f12733e)).getValue();
            case 4:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(((p9.e) obj).f12468b, ((p9.e) obj2).f12468b));
            case 5:
                ((z1.s) obj2).remove(obj);
                return g00.b0.a;
            case 6:
                qo.y yVar = (qo.y) obj2;
                yVar.i(qo.t.a((qo.t) ((vm.a) yVar).c.d.getValue(), (lo.k) null, false, (Integer) obj, 7));
                return g00.b0.a;
            case 7:
                r3.g gVar = (r3.g) obj;
                StringBuilder sbQ = x5.q(((r3.g) obj2) == gVar ? " > " : "   ");
                if (!(gVar instanceof r3.a)) {
                    if (gVar instanceof r3.u) {
                        sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                        r3.u uVar = (r3.u) gVar;
                        sb2.append(uVar.f13094a.B.length());
                        sb2.append(", newCursorPosition=");
                        i10 = uVar.f13095b;
                    } else if (gVar instanceof r3.t) {
                        strConcat = ((r3.t) gVar).toString();
                    } else if (gVar instanceof r3.e) {
                        strConcat = ((r3.e) gVar).toString();
                    } else if (gVar instanceof r3.f) {
                        strConcat = ((r3.f) gVar).toString();
                    } else if (gVar instanceof r3.v) {
                        strConcat = ((r3.v) gVar).toString();
                    } else if (gVar instanceof r3.h) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (gVar instanceof r3.d) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strN = kotlin.jvm.internal.a0.a.b(gVar.getClass()).n();
                        if (strN == null) {
                            strN = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strN);
                    }
                    sbQ.append(strConcat);
                    return sbQ.toString();
                }
                sb2 = new StringBuilder("CommitTextCommand(text.length=");
                r3.a aVar = (r3.a) gVar;
                sb2.append(aVar.f13045a.B.length());
                sb2.append(", newCursorPosition=");
                i10 = aVar.f13046b;
                strConcat = oi.k.l(sb2, i10, ')');
                sbQ.append(strConcat);
                return sbQ.toString();
            case 8:
                return ((r30.g) obj2).c(((Integer) obj).intValue());
            case 9:
                r40.m mVar3 = (r40.m) obj2;
                q40.l lVar = (q40.l) obj;
                kotlin.jvm.internal.m.e(lVar, "node");
                mVar3.L((String) h00.q.T0(mVar3.a), lVar);
                return g00.b0.a;
            case 10:
                Measure measure = (Measure) obj;
                kotlin.jvm.internal.m.e(measure, "it");
                String str = ((MeasureFormat) obj2).format(measure);
                kotlin.jvm.internal.m.d(str, "format(...)");
                return str;
            case 11:
                ((t9.d) obj2).f14420a.setValue((s9.l) obj);
                return g00.b0.a;
            case 12:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                return new c3.k1((tp.e) obj2, 18);
            case 13:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                return new c3.k1((tp.g) obj2, 19);
            case 14:
                androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj2;
                androidx.media3.common.d1 d1Var2 = (androidx.media3.common.d1) obj;
                kotlin.jvm.internal.m.e(d1Var2, "it");
                return Boolean.valueOf(d1Var2 == d1Var);
            case 15:
                Drawable drawable = (Drawable) obj2;
                k2.d dVar = (k2.d) obj;
                i2.s sVarN = dVar.G0().n();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (dVar.b() >> 32)), (int) Float.intBitsToFloat((int) (dVar.b() & 4294967295L)));
                drawable.draw(i2.b.a(sVarN));
                return g00.b0.a;
            case 16:
                w0.c cVar = (w0.c) obj2;
                cVar.Q.invoke((s0.a) obj, b3.m.h(cVar, c3.o0.f2722b));
                return g00.b0.a;
            case 17:
                ((u00.k) obj).invoke((s0.a) obj2);
                return g00.b0.a;
            case TYPE_SINT64_VALUE:
                a aVar2 = (a) obj2;
                o2 o2Var = (o2) obj;
                if (!(o2Var instanceof w0.a)) {
                    throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                aVar2.invoke(((w0.a) o2Var).O);
                return Boolean.TRUE;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                CorruptionException corruptionException = (CorruptionException) obj;
                kotlin.jvm.internal.m.e(corruptionException, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", corruptionException);
                return new wj.f0(((wj.g0) obj2).A.a(null), null, null);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                return new c3.k1((wy.n) obj2, 21);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                x.h hVar = (x.h) obj;
                ((u00.n) obj2).invoke(hVar.f16286e.getValue(), x.c.f16258k.f16364b.invoke(hVar.f16287f));
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new c3.k1((x0.c) obj2, 23);
            case 23:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(((cy.d) obj).getId(), ((cy.d) obj2).getId()));
            case 24:
                y1.f fVar = ((y1.d) obj2).C;
                return Boolean.valueOf(fVar != null ? fVar.a(obj) : true);
            case 25:
                z.s sVar = (z.s) obj2;
                f2.d dVar2 = (f2.d) obj;
                if (dVar2.c() * sVar.R < 0.0f || h2.e.d(dVar2.A.b()) <= 0.0f) {
                    return dVar2.a(new xn.a(28));
                }
                if (y3.f.b(sVar.R, 0.0f)) {
                    fCeil = 1.0f;
                } else {
                    fCeil = (float) Math.ceil(dVar2.c() * sVar.R);
                }
                float f11 = 2;
                final float fMin = Math.min(fCeil, (float) Math.ceil(h2.e.d(dVar2.A.b()) / f11));
                final float f12 = fMin / f11;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.A.b() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.A.b() >> 32)) - fMin)) << 32);
                float f13 = fMin * f11;
                boolean z11 = f13 > h2.e.d(dVar2.A.b());
                i2.l0 l0VarA = sVar.T.a(dVar2.A.b(), dVar2.A.getLayoutDirection(), dVar2);
                if (!(l0VarA instanceof i2.i0)) {
                    if (!(l0VarA instanceof i2.k0)) {
                        boolean z12 = z11;
                        if (!(l0VarA instanceof i2.j0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final i2.v0 v0Var = sVar.S;
                        final long j9 = z12 ? 0L : jFloatToRawIntBits;
                        final long jB = z12 ? dVar2.A.b() : jFloatToRawIntBits2;
                        final k2.e hVar2 = z12 ? k2.g.f8922a : new k2.h(fMin, 0.0f, 0, 0, null, 30);
                        return dVar2.a(new u00.k() {
                            public final Object invoke(Object obj3) {
                                b3.o0 o0Var = (b3.o0) obj3;
                                o0Var.a();
                                k2.d.m0(o0Var, v0Var, j9, jB, 0.0f, hVar2, 0, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
                                return g00.b0.a;
                            }
                        });
                    }
                    final i2.v0 v0Var2 = sVar.S;
                    h2.d dVar3 = ((i2.k0) l0VarA).f7142a;
                    if (c7.i.M(dVar3)) {
                        final long j10 = dVar3.f6554e;
                        final k2.h hVar3 = new k2.h(fMin, 0.0f, 0, 0, null, 30);
                        final boolean z13 = z11;
                        return dVar2.a(new u00.k() {
                            public final Object invoke(Object obj3) throws Throwable {
                                long j11;
                                b3.o0 o0Var = (b3.o0) obj3;
                                o0Var.a();
                                k2.b bVar2 = o0Var.A;
                                boolean z14 = z13;
                                i2.q qVar = v0Var2;
                                long j12 = j10;
                                if (z14) {
                                    k2.d.B(o0Var, qVar, 0L, 0L, j12, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                                    float f14 = f12;
                                    if (fIntBitsToFloat < f14) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar2.b() >> 32));
                                        float f15 = fMin;
                                        float f16 = fIntBitsToFloat2 - f15;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar2.b() & 4294967295L)) - f15;
                                        a1.i iVar2 = bVar2.B;
                                        long jQ2 = iVar2.q();
                                        iVar2.n().i();
                                        try {
                                            ((hf.c) iVar2.B).y(f15, f15, f16, fIntBitsToFloat3, 0);
                                            j11 = jQ2;
                                            try {
                                                k2.d.B(o0Var, qVar, 0L, 0L, j12, null, 246);
                                                w.c.t(iVar2, j11);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                w.c.t(iVar2, j11);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            j11 = jQ2;
                                        }
                                    } else {
                                        k2.d.B(o0Var, qVar, jFloatToRawIntBits, jFloatToRawIntBits2, n.o(f14, j12), hVar3, 208);
                                    }
                                }
                                return g00.b0.a;
                            }
                        });
                    }
                    boolean z14 = z11;
                    if (sVar.Q == null) {
                        sVar.Q = new z.p();
                    }
                    z.p pVar = sVar.Q;
                    kotlin.jvm.internal.m.b(pVar);
                    i2.g gVarA = pVar.f16949d;
                    if (gVarA == null) {
                        gVarA = i2.j.a();
                        pVar.f16949d = gVarA;
                    }
                    gVarA.h();
                    i2.g.c(gVarA, dVar3);
                    if (!z14) {
                        i2.g gVarA2 = i2.j.a();
                        i2.g.c(gVarA2, new h2.d(fMin, fMin, dVar3.b() - fMin, dVar3.a() - fMin, z.n.o(fMin, dVar3.f6554e), z.n.o(fMin, dVar3.f6555f), z.n.o(fMin, dVar3.f6556g), z.n.o(fMin, dVar3.f6557h)));
                        gVarA.g(gVarA, gVarA2, 0);
                    }
                    return dVar2.a(new ym.j0(gVarA, v0Var2, 2));
                }
                i2.v0 v0Var3 = sVar.S;
                i2.i0 i0Var = (i2.i0) l0VarA;
                i2.g gVar2 = i0Var.f7139a;
                if (z11) {
                    return dVar2.a(new ym.j0(i0Var, v0Var3, 3));
                }
                if (v0Var3 != null) {
                    mVar = new i2.m(i2.t.b(1.0f, v0Var3.f7174a), 5);
                    i11 = 1;
                } else {
                    i11 = 0;
                    mVar = null;
                }
                h2.c cVarD = gVar2.d();
                float f14 = cVarD.f6547b;
                float f15 = cVarD.f6546a;
                if (sVar.Q == null) {
                    sVar.Q = new z.p();
                }
                z.p pVar2 = sVar.Q;
                kotlin.jvm.internal.m.b(pVar2);
                i2.g gVarA3 = pVar2.f16949d;
                if (gVarA3 == null) {
                    gVarA3 = i2.j.a();
                    pVar2.f16949d = gVarA3;
                }
                gVarA3.h();
                i2.g.b(gVarA3, cVarD);
                gVarA3.g(gVarA3, gVar2, 0);
                kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                long jCeil = (((long) ((int) Math.ceil(cVarD.f6549d - f14))) & 4294967295L) | (((long) ((int) Math.ceil(cVarD.f6548c - f15))) << 32);
                z.p pVar3 = sVar.Q;
                kotlin.jvm.internal.m.b(pVar3);
                i2.d dVarF = pVar3.f16946a;
                i2.a aVarA = pVar3.f16947b;
                i2.e0 e0Var = dVarF != null ? new i2.e0(dVarF.a()) : null;
                if (e0Var != null && e0Var.f7125a == 0) {
                    z10 = true;
                } else {
                    i2.e0 e0Var2 = dVarF != null ? new i2.e0(dVarF.a()) : null;
                    if (e0Var2 != null && i11 == e0Var2.f7125a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                try {
                    try {
                        if (dVarF != null && aVarA != null) {
                            mVar2 = mVar;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.A.b() >> 32));
                            Bitmap bitmap = dVarF.f7117a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (dVar2.A.b() & 4294967295L)) > bitmap.getHeight() || !z10) {
                            }
                            bVar = pVar3.f16948c;
                            if (bVar == null) {
                                bVar = new k2.b();
                                pVar3.f16948c = bVar;
                            }
                            iVar = bVar.B;
                            k2.a aVar3 = bVar.A;
                            long jM0 = kh.n.m0(jCeil);
                            y3.m layoutDirection = dVar2.A.getLayoutDirection();
                            y3.c cVar2 = aVar3.f8916a;
                            k2.b bVar2 = bVar;
                            y3.m mVar4 = aVar3.f8917b;
                            i2.s sVar2 = aVar3.f8918c;
                            i2.g gVar3 = gVarA3;
                            long j11 = aVar3.f8919d;
                            aVar3.f8916a = dVar2;
                            aVar3.f8917b = layoutDirection;
                            aVar3.f8918c = aVarA;
                            aVar3.f8919d = jM0;
                            aVarA.i();
                            k2.d.R(bVar2, i2.t.f7162b, 0L, jM0, 0.0f, null, 0, 58);
                            f3 = -f15;
                            f10 = -f14;
                            ((hf.c) iVar.B).I(f3, f10);
                            k2.d.P0(bVar2, i0Var.f7139a, v0Var3, 0.0f, new k2.h(f13, 0.0f, 0, 0, null, 30), 52);
                            float f16 = 1;
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (bVar2.b() >> 32)) + f16) / Float.intBitsToFloat((int) (bVar2.b() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (bVar2.b() & 4294967295L)) + f16) / Float.intBitsToFloat((int) (bVar2.b() & 4294967295L));
                            i2.d dVar4 = dVarF;
                            i2.a aVar4 = aVarA;
                            long jY0 = bVar2.Y0();
                            jQ = iVar.q();
                            iVar.n().i();
                            ((hf.c) iVar.B).H(fIntBitsToFloat2, fIntBitsToFloat3, jY0);
                            k2.d.P0(bVar2, gVar3, v0Var3, 0.0f, null, 28);
                            iVar.n().q();
                            iVar.C(jQ);
                            ((hf.c) iVar.B).I(-f3, -f10);
                            aVar4.q();
                            aVar3.f8916a = cVar2;
                            aVar3.f8917b = mVar4;
                            aVar3.f8918c = sVar2;
                            aVar3.f8919d = j11;
                            dVar4.f7117a.prepareToDraw();
                            zVar.A = dVar4;
                            return dVar2.a(new e00.q(cVarD, zVar, jCeil, mVar2, 4));
                        }
                        mVar2 = mVar;
                        ((hf.c) iVar.B).H(fIntBitsToFloat2, fIntBitsToFloat3, jY0);
                        k2.d.P0(bVar2, gVar3, v0Var3, 0.0f, null, 28);
                        iVar.n().q();
                        iVar.C(jQ);
                        ((hf.c) iVar.B).I(-f3, -f10);
                        aVar4.q();
                        aVar3.f8916a = cVar2;
                        aVar3.f8917b = mVar4;
                        aVar3.f8918c = sVar2;
                        aVar3.f8919d = j11;
                        dVar4.f7117a.prepareToDraw();
                        zVar.A = dVar4;
                        return dVar2.a(new e00.q(cVarD, zVar, jCeil, mVar2, 4));
                    } catch (Throwable th2) {
                        iVar.n().q();
                        iVar.C(jQ);
                        throw th2;
                    }
                    k2.d.P0(bVar2, i0Var.f7139a, v0Var3, 0.0f, new k2.h(f13, 0.0f, 0, 0, null, 30), 52);
                    float f17 = 1;
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (bVar2.b() >> 32)) + f17) / Float.intBitsToFloat((int) (bVar2.b() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (bVar2.b() & 4294967295L)) + f17) / Float.intBitsToFloat((int) (bVar2.b() & 4294967295L));
                    i2.d dVar5 = dVarF;
                    i2.a aVar5 = aVarA;
                    long jY1 = bVar2.Y0();
                    jQ = iVar.q();
                    iVar.n().i();
                } catch (Throwable th3) {
                    ((hf.c) iVar.B).I(-f3, -f10);
                    throw th3;
                }
                dVarF = i2.b0.f((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i11);
                pVar3.f16946a = dVarF;
                aVarA = i2.b0.a(dVarF);
                pVar3.f16947b = aVarA;
                bVar = pVar3.f16948c;
                if (bVar == null) {
                    bVar = new k2.b();
                    pVar3.f16948c = bVar;
                }
                iVar = bVar.B;
                k2.a aVar6 = bVar.A;
                long jM1 = kh.n.m0(jCeil);
                y3.m layoutDirection2 = dVar2.A.getLayoutDirection();
                y3.c cVar3 = aVar6.f8916a;
                k2.b bVar3 = bVar;
                y3.m mVar5 = aVar6.f8917b;
                i2.s sVar3 = aVar6.f8918c;
                i2.g gVar4 = gVarA3;
                long j12 = aVar6.f8919d;
                aVar6.f8916a = dVar2;
                aVar6.f8917b = layoutDirection2;
                aVar6.f8918c = aVarA;
                aVar6.f8919d = jM1;
                aVarA.i();
                k2.d.R(bVar3, i2.t.f7162b, 0L, jM1, 0.0f, null, 0, 58);
                f3 = -f15;
                f10 = -f14;
                ((hf.c) iVar.B).I(f3, f10);
                break;
            case RuntimeVersion.MINOR:
                z.p1 p1Var = (z.p1) obj2;
                float fFloatValue2 = ((Float) obj).floatValue();
                l1.f1 f1Var = p1Var.f16951a;
                float fH2 = f1Var.h() + fFloatValue2 + p1Var.f16956f;
                float fX = ab.a0.x(fH2, 0.0f, p1Var.f16955e.h());
                boolean z15 = fH2 == fX;
                float fH3 = fX - f1Var.h();
                int iRound = Math.round(fH3);
                f1Var.i(f1Var.h() + iRound);
                p1Var.f16956f = fH3 - iRound;
                if (!z15) {
                    fFloatValue2 = fH3;
                }
                return Float.valueOf(fFloatValue2);
            default:
                z1.u uVar2 = (z1.u) obj2;
                synchronized (uVar2.f17070g) {
                    z1.t tVar = uVar2.f17072i;
                    kotlin.jvm.internal.m.b(tVar);
                    Object obj3 = tVar.f17054b;
                    kotlin.jvm.internal.m.b(obj3);
                    int i13 = tVar.f17056d;
                    u.c0 c0Var = tVar.f17055c;
                    if (c0Var == null) {
                        c0Var = new u.c0();
                        tVar.f17055c = c0Var;
                        tVar.f17058f.m(obj3, c0Var);
                    }
                    tVar.b(obj, i13, obj3, c0Var);
                }
                return g00.b0.a;
        }
    }
}
