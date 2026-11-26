package th;

import a1.o0;
import a10.h0;
import a30.v;
import a30.x;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.media3.common.f1;
import androidx.media3.common.h2;
import androidx.media3.common.k2;
import androidx.media3.common.q0;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import e7.i0;
import fh.d2;
import fh.i2;
import fh.r0;
import fh.t0;
import h00.d0;
import i20.b0;
import i20.c1;
import i20.j0;
import i20.u0;
import i20.z0;
import j10.n0;
import j10.w;
import j10.z;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l9.f0;
import m10.a0;
import qd.s0;
import ri.t1;
import ta.c0;
import x10.u;
import yh.q1;
import yh.w0;

public final class o implements a30.a, a30.c {
    public final int A;
    public final Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;

    public o() {
        this.A = 4;
        this.B = new int[]{2131230839, 2131230837, 2131230763};
        this.C = new int[]{2131230787, 2131230822, 2131230794, 2131230789, 2131230790, 2131230793, 2131230792};
        this.D = new int[]{2131230836, 2131230838, 2131230780, 2131230832, 2131230833, 2131230834, 2131230835};
        this.E = new int[]{2131230812, 2131230778, 2131230811};
        this.F = new int[]{2131230830, 2131230840};
        this.G = new int[]{2131230766, 2131230772, 2131230767, 2131230773};
    }

    public o(Context context) {
        this.A = 3;
        this.B = context.getApplicationContext();
        this.C = bc.c.f2479a;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = new bc.e(true, true, true, 4, nb.k.A);
    }

    public o(h2 h2Var) {
        this.A = 2;
        this.B = h2Var;
        r0 r0Var = t0.B;
        this.C = d2.E;
        this.D = i2.G;
    }

    public o(String str, com.google.crypto.tink.shaded.protobuf.i iVar, w0 w0Var, q1 q1Var, Integer num) {
        this.A = 0;
        this.B = str;
        this.C = t.b(str);
        this.D = iVar;
        this.E = w0Var;
        this.F = q1Var;
        this.G = num;
    }

    public o(a0 a0Var, oj.q qVar, d30.l lVar, hf.c cVar) {
        this.A = 1;
        this.A = 1;
        this.B = cVar;
        this.C = lVar.b(new a20.d(this, 16));
        this.D = a0Var;
        this.E = qVar;
        this.F = new f0((z) a0Var, qVar);
        this.G = k20.f.g;
    }

    public o(rv.p pVar, rv.i iVar, dh.o oVar, zt.a aVar, qu.a aVar2, cw.a aVar3) {
        this.A = 5;
        this.B = pVar;
        this.C = iVar;
        this.D = oVar;
        this.E = aVar;
        this.F = aVar2;
        this.G = aVar3;
    }

    public o(x40.q qVar, String str, x40.p pVar, x40.z zVar, Map map) {
        this.A = 6;
        kotlin.jvm.internal.m.e(qVar, "url");
        kotlin.jvm.internal.m.e(str, "method");
        this.C = qVar;
        this.B = str;
        this.D = pVar;
        this.E = zVar;
        this.F = map;
    }

    public static LayerDrawable A(p.d2 d2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableC = d2Var.c(context, 2131230826);
        Drawable drawableC2 = d2Var.c(context, 2131230827);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static boolean D(s7.a0 a0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = a0Var.f13644a;
        int i13 = a0Var.f13645b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i13 == i10 && a0Var.f13646c == i11) {
            return true;
        }
        return !z10 && i13 == -1 && a0Var.f13648e == i12;
    }

    public static void P(Drawable drawable, int i10, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = p.r.f12193b;
        }
        drawableMutate.setColorFilter(p.r.c(i10, mode));
    }

    public static final s20.g g(o oVar, n20.e eVar, Object obj) {
        s20.g gVarB = s20.h.b(obj, (a0) oVar.D);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + eVar;
        kotlin.jvm.internal.m.e(str, "message");
        return new s20.j(str);
    }

    public static boolean o(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static o r(String str, com.google.crypto.tink.shaded.protobuf.i iVar, w0 w0Var, q1 q1Var, Integer num) throws GeneralSecurityException {
        if (q1Var == q1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, iVar, w0Var, q1Var, num);
    }

    public static ColorStateList s(Context context, int i10) {
        int iC = p.i2.c(context, 2130968895);
        int iB = p.i2.b(context, 2130968890);
        int[] iArr = p.i2.f12169b;
        int[] iArr2 = p.i2.f12171d;
        int iF = q4.a.f(iC, i10);
        return new ColorStateList(new int[][]{iArr, iArr2, p.i2.f12170c, p.i2.f12173f}, new int[]{iB, iF, q4.a.f(iC, i10), i10});
    }

    public static List x(o oVar, x xVar, g20.p pVar, Boolean bool, boolean z10, int i10) {
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return oVar.w(xVar, pVar, z11, false, bool, (i10 & 32) != 0 ? false : z10);
    }

    public static s7.a0 y(f1 f1Var, t0 t0Var, s7.a0 a0Var, h2 h2Var) {
        k2 currentTimeline = f1Var.getCurrentTimeline();
        int currentPeriodIndex = f1Var.getCurrentPeriodIndex();
        Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
        int iB = (f1Var.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, h2Var).b(i0.H(f1Var.getCurrentPosition()) - h2Var.f1235e);
        for (int i10 = 0; i10 < t0Var.size(); i10++) {
            s7.a0 a0Var2 = (s7.a0) t0Var.get(i10);
            if (D(a0Var2, uidOfPeriod, f1Var.isPlayingAd(), f1Var.getCurrentAdGroupIndex(), f1Var.getCurrentAdIndexInAdGroup(), iB)) {
                return a0Var2;
            }
        }
        if (t0Var.isEmpty() && a0Var != null && D(a0Var, uidOfPeriod, f1Var.isPlayingAd(), f1Var.getCurrentAdGroupIndex(), f1Var.getCurrentAdIndexInAdGroup(), iB)) {
            return a0Var;
        }
        return null;
    }

    public static g20.p z(o20.b bVar, k20.g gVar, h9.f fVar, int i10, boolean z10) {
        kotlin.jvm.internal.m.e(bVar, "proto");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        g4.c.q(i10, "kind");
        if (bVar instanceof i20.n) {
            o20.h hVar = m20.g.a;
            m20.e eVarA = m20.g.a((i20.n) bVar, gVar, fVar);
            if (eVarA != null) {
                return ab.a0.b0(eVarA);
            }
        } else if (bVar instanceof b0) {
            o20.h hVar2 = m20.g.a;
            m20.e eVarC = m20.g.c((b0) bVar, gVar, fVar);
            if (eVarC != null) {
                return ab.a0.b0(eVarC);
            }
        } else if (bVar instanceof j0) {
            o20.n nVar = l20.j.d;
            kotlin.jvm.internal.m.d(nVar, "propertySignature");
            l20.d dVar = (l20.d) w00.a.u((o20.l) bVar, nVar);
            if (dVar != null) {
                int iB = e4.f.b(i10);
                if (iB == 1) {
                    return ze.d.y((j0) bVar, gVar, fVar, true, true, z10);
                }
                if (iB != 2) {
                    if (iB != 3 || (dVar.B & 8) != 8) {
                        return null;
                    }
                    l20.c cVar = dVar.F;
                    kotlin.jvm.internal.m.d(cVar, "getSetter(...)");
                    return new g20.p(gVar.getString(cVar.C).concat(gVar.getString(cVar.D)));
                }
                if (dVar.g()) {
                    l20.c cVar2 = dVar.E;
                    kotlin.jvm.internal.m.d(cVar2, "getGetter(...)");
                    return new g20.p(gVar.getString(cVar2.C).concat(gVar.getString(cVar2.D)));
                }
            }
        }
        return null;
    }

    public ColorStateList B(Context context, int i10) {
        if (i10 == 2131230783) {
            return n4.b.b(context, 2131099669);
        }
        if (i10 == 2131230829) {
            return n4.b.b(context, 2131099672);
        }
        if (i10 != 2131230828) {
            if (i10 == 2131230771) {
                return s(context, p.i2.c(context, 2130968890));
            }
            if (i10 == 2131230765) {
                return s(context, 0);
            }
            if (i10 == 2131230770) {
                return s(context, p.i2.c(context, 2130968888));
            }
            if (i10 == 2131230824 || i10 == 2131230825) {
                return n4.b.b(context, 2131099671);
            }
            if (o((int[]) this.C, i10)) {
                return p.i2.d(context, 2130968896);
            }
            if (o((int[]) this.F, i10)) {
                return n4.b.b(context, 2131099668);
            }
            if (o((int[]) this.G, i10)) {
                return n4.b.b(context, 2131099667);
            }
            if (i10 == 2131230821) {
                return n4.b.b(context, 2131099670);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = p.i2.d(context, 2130968947);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = p.i2.f12169b;
            iArr2[0] = p.i2.b(context, 2130968947);
            iArr[1] = p.i2.f12172e;
            iArr2[1] = p.i2.c(context, 2130968894);
            iArr[2] = p.i2.f12173f;
            iArr2[2] = p.i2.c(context, 2130968947);
        } else {
            int[] iArr3 = p.i2.f12169b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = p.i2.f12172e;
            iArr2[1] = p.i2.c(context, 2130968894);
            iArr[2] = p.i2.f12173f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public boolean C(n20.b bVar) {
        o10.c cVarW;
        if (bVar.e() != null && kotlin.jvm.internal.m.a(bVar.f().b(), "Container") && (cVarW = h0.w((hf.c) this.B, bVar, (k20.f) this.G)) != null) {
            LinkedHashSet linkedHashSet = f10.a.a;
            Class cls = cVarW.a;
            kotlin.jvm.internal.m.e(cls, "klass");
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            kotlin.jvm.internal.m.d(declaredAnnotations, "getDeclaredAnnotations(...)");
            boolean z10 = false;
            for (Annotation annotation : declaredAnnotations) {
                kotlin.jvm.internal.m.b(annotation);
                if (p10.d.a(k00.f.D(k00.f.z(annotation))).equals(u.b)) {
                    z10 = true;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public ui.b E(n20.b bVar, n0 n0Var, List list) {
        kotlin.jvm.internal.m.e(list, "result");
        return new ui.b(this, w.f((a0) this.D, bVar, (oj.q) this.E), bVar, list, n0Var);
    }

    public ui.b F(n20.b bVar, o10.a aVar, List list) {
        kotlin.jvm.internal.m.e(list, "result");
        if (f10.a.a.contains(bVar)) {
            return null;
        }
        return E(bVar, aVar, list);
    }

    public Object G(x xVar, j0 j0Var, int i10, e30.w wVar, u00.n nVar) {
        Object objInvoke;
        o10.c cVarH = c0.H(xVar, true, true, k20.e.B.g(j0Var.D), m20.g.d(j0Var), (hf.c) this.B, (k20.f) this.G);
        if (cVarH == null) {
            if (xVar instanceof v) {
                g20.o oVar = (n0) ((x) ((v) xVar)).D;
                g20.o oVar2 = oVar instanceof g20.o ? oVar : null;
                if (oVar2 != null) {
                    cVarH = oVar2.A;
                } else {
                    cVarH = null;
                }
            } else {
                cVarH = null;
            }
        }
        if (cVarH != null) {
            k20.f fVar = (k20.f) cVarH.b.d;
            k20.f fVar2 = g20.e.e;
            kotlin.jvm.internal.m.e(fVar2, "version");
            g20.p pVarZ = z(j0Var, (k20.g) xVar.B, (h9.f) xVar.C, i10, fVar.a(((k20.a) fVar2).b, ((k20.a) fVar2).c, ((k20.a) fVar2).d));
            if (pVarZ != null && (objInvoke = nVar.invoke(((d30.e) this.C).invoke(cVarH), pVarZ)) != null) {
                if (g10.t.a(wVar)) {
                    objInvoke = (s20.g) objInvoke;
                    if (objInvoke instanceof s20.d) {
                        return new s20.z(((Number) ((s20.g) ((s20.d) objInvoke)).a).byteValue());
                    }
                    if (objInvoke instanceof s20.w) {
                        return new s20.z(((Number) ((s20.g) ((s20.w) objInvoke)).a).shortValue());
                    }
                    if (objInvoke instanceof s20.k) {
                        return new s20.z(((Number) ((s20.g) ((s20.k) objInvoke)).a).intValue());
                    }
                    if (objInvoke instanceof s20.u) {
                        return new s20.z(((Number) ((s20.g) ((s20.u) objInvoke)).a).longValue());
                    }
                }
                return objInvoke;
            }
        }
        return null;
    }

    public List H(x xVar, o20.b bVar, int i10, int i11) {
        g20.p pVarZ = z(bVar, (k20.g) xVar.B, (h9.f) xVar.C, i10, false);
        if (pVarZ == null) {
            return h00.x.A;
        }
        return x(this, xVar, new g20.p(pVarZ.a + '@' + i11), null, false, 60);
    }

    public List I(x xVar, j0 j0Var, g20.b bVar) {
        h9.f fVar = (h9.f) xVar.C;
        k20.g gVar = (k20.g) xVar.B;
        Boolean boolG = k20.e.B.g(j0Var.D);
        boolean zD = m20.g.d(j0Var);
        if (bVar == g20.b.A) {
            g20.p pVarY = ze.d.y(j0Var, gVar, fVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (pVarY != null) {
                return x(this, xVar, pVarY, boolG, zD, 8);
            }
        } else {
            g20.p pVarY2 = ze.d.y(j0Var, gVar, fVar, (40 & 8) == 0, (40 & 16) == 0, true);
            if (pVarY2 != null) {
                if (r30.k.A0(pVarY2.a, "$delegate", false) == (bVar == g20.b.C)) {
                    return w(xVar, pVarY2, true, true, boolG, zD);
                }
            }
        }
        return h00.x.A;
    }

    public ce.c J() {
        ce.c cVar = new ce.c(false);
        cVar.F = new LinkedHashMap();
        cVar.B = (x40.q) this.C;
        cVar.C = (String) this.B;
        cVar.E = (x40.z) this.E;
        Map map = (Map) this.F;
        cVar.F = map.isEmpty() ? new LinkedHashMap() : d0.b0(map);
        cVar.D = ((x40.p) this.D).e();
        return cVar;
    }

    public q0 K(dw.a aVar) {
        Integer num;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zC = aVar.c();
        boolean z10 = aVar.g;
        String strB = aVar.f;
        if (!zC) {
            if (!r30.k.L0(strB) || z10) {
                num = null;
            } else {
                i10 = 2131231344;
            }
            if (aVar.c()) {
                str = null;
            } else {
                if (r30.k.L0(strB)) {
                    if (z10) {
                        strB = aVar.b();
                    } else {
                        str = null;
                    }
                }
                str = strB;
            }
            dh.o oVar = (dh.o) this.D;
            String strF = g4.c.f(aVar.a, "playlist/");
            String str4 = aVar.c;
            str2 = aVar.d;
            if (aVar.c()) {
                str2 = null;
            }
            if (str2 != null || r30.k.L0(str2)) {
                str3 = null;
            } else {
                str3 = str2;
            }
            qv.a aVar2 = qv.a.A;
            return dh.o.d(oVar, strF, str4, str3, str, num, null, aVar2, aVar2, 288);
        }
        i10 = 2131231389;
        num = i10;
        if (aVar.c()) {
            if (r30.k.L0(strB)) {
                if (z10) {
                    strB = aVar.b();
                } else {
                    str = null;
                }
            }
            str = strB;
        } else {
            str = null;
        }
        dh.o oVar2 = (dh.o) this.D;
        String strF2 = g4.c.f(aVar.a, "playlist/");
        String str5 = aVar.c;
        str2 = aVar.d;
        if (aVar.c()) {
            str2 = null;
        }
        if (str2 != null) {
            str3 = null;
        } else {
            str3 = null;
        }
        qv.a aVar3 = qv.a.A;
        return dh.o.d(oVar2, strF2, str5, str3, str, num, null, aVar3, aVar3, 288);
    }

    public java.lang.Object L(java.lang.String r19, m00.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: th.o.L(java.lang.String, m00.c):java.lang.Object");
    }

    public Serializable M(m00.c cVar) {
        sv.k kVar;
        if (cVar instanceof sv.k) {
            kVar = (sv.k) cVar;
            int i10 = kVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.C = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new sv.k(this, cVar);
            }
        } else {
            kVar = new sv.k(this, cVar);
        }
        Object objI = kVar.A;
        l00.a aVar = l00.a.A;
        int i11 = kVar.C;
        if (i11 == 0) {
            t1.O(objI);
            rv.i iVar = (rv.i) this.C;
            kVar.C = 1;
            objI = iVar.i(kVar);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objI);
        }
        List listR = (List) objI;
        if (listR.isEmpty()) {
            listR = va.a.R(new dw.a(-1, "favourites", ((dh.o) this.D).k(2131886989), RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX, false, h00.x.A, v30.g.B));
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(listR, 10));
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(K((dw.a) it.next()));
        }
        return arrayList;
    }

    public Serializable N(String str, m00.c cVar) {
        sv.l lVar;
        int iIntValue;
        if (cVar instanceof sv.l) {
            lVar = (sv.l) cVar;
            int i10 = lVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.D = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new sv.l(this, cVar);
            }
        } else {
            lVar = new sv.l(this, cVar);
        }
        Object objF = lVar.B;
        l00.a aVar = l00.a.A;
        int i11 = lVar.D;
        if (i11 == 0) {
            t1.O(objF);
            kotlin.jvm.internal.m.e(str, "mediaId");
            Integer numY0 = !r30.r.x0(str, "playlist/", false) ? null : r30.r.y0(r30.k.R0(str, "playlist/"));
            if (numY0 == null) {
                return h00.x.A;
            }
            iIntValue = numY0.intValue();
            rv.i iVar = (rv.i) this.C;
            lVar.A = iIntValue;
            lVar.D = 1;
            objF = iVar.f(iIntValue, lVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iIntValue = lVar.A;
            t1.O(objF);
        }
        Iterable<PlayerItem> iterable = (Iterable) objF;
        ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
        for (PlayerItem playerItem : iterable) {
            dh.o oVar = (dh.o) this.D;
            int reciterId = playerItem.getReciterId();
            int surahNumber = playerItem.getSurahNumber();
            StringBuilder sbP = oi.k.p(iIntValue, reciterId, "pltt/", "/", "/");
            sbP.append(surahNumber);
            arrayList.add(dh.o.m(oVar, sbP.toString(), playerItem.getSurahTranscription(), playerItem.getReciterName()));
        }
        return arrayList;
    }

    public Serializable O(m00.c cVar) {
        sv.m mVar;
        i00.b bVar;
        i00.b bVar2;
        if (cVar instanceof sv.m) {
            mVar = (sv.m) cVar;
            int i10 = mVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.E = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new sv.m(this, cVar);
            }
        } else {
            mVar = new sv.m(this, cVar);
        }
        Object obj = mVar.C;
        Serializable serializable = l00.a.A;
        int i11 = mVar.E;
        if (i11 == 0) {
            t1.O(obj);
            i00.b bVarS = va.a.s();
            dh.o oVar = (dh.o) this.D;
            String strK = oVar.k(2131886223);
            Integer num = new Integer(2131231120);
            qv.a aVar = qv.a.A;
            bVarS.add(dh.o.d(oVar, "downloads", strK, null, null, num, null, aVar, aVar, MediaError.DetailedErrorCode.NETWORK_UNKNOWN));
            mVar.A = bVarS;
            mVar.B = bVarS;
            mVar.E = 1;
            Serializable serializableM = M(mVar);
            if (serializableM == serializable) {
                return serializable;
            }
            bVar = bVarS;
            obj = serializableM;
            bVar2 = bVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = mVar.B;
            bVar = mVar.A;
            t1.O(obj);
        }
        bVar2.addAll((Collection) obj);
        return va.a.k(bVar);
    }

    public void Q(k2 k2Var) {
        c50.h hVar = new c50.h(4, 7);
        if (((t0) this.C).isEmpty()) {
            m(hVar, (s7.a0) this.F, k2Var);
            if (!Objects.equals((s7.a0) this.G, (s7.a0) this.F)) {
                m(hVar, (s7.a0) this.G, k2Var);
            }
            if (!Objects.equals((s7.a0) this.E, (s7.a0) this.F) && !Objects.equals((s7.a0) this.E, (s7.a0) this.G)) {
                m(hVar, (s7.a0) this.E, k2Var);
            }
        } else {
            for (int i10 = 0; i10 < ((t0) this.C).size(); i10++) {
                m(hVar, (s7.a0) ((t0) this.C).get(i10), k2Var);
            }
            if (!((t0) this.C).contains((s7.a0) this.E)) {
                m(hVar, (s7.a0) this.E, k2Var);
            }
        }
        this.D = hVar.c(true);
    }

    public Object a(x xVar, j0 j0Var, e30.w wVar) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        return G(xVar, j0Var, 2, wVar, g20.a.C);
    }

    public List b(x xVar, o20.b bVar, int i10, int i11, c1 c1Var) {
        int size;
        kotlin.jvm.internal.m.e(bVar, "callableProto");
        g4.c.q(i10, "kind");
        boolean z10 = bVar instanceof b0;
        int i12 = 0;
        if (z10) {
            size = ((b0) bVar).O.size();
        } else {
            size = bVar instanceof j0 ? ((j0) bVar).O.size() : 0;
        }
        if (z10) {
            int i13 = ((b0) bVar).C;
            if ((i13 & 32) == 32 || (i13 & 64) == 64) {
                i12 = 1;
            }
        } else if (bVar instanceof j0) {
            int i14 = ((j0) bVar).C;
            if ((i14 & 32) == 32 || (i14 & 64) == 64) {
                i12 = 1;
            }
        } else {
            if (!(bVar instanceof i20.n)) {
                throw new UnsupportedOperationException("Unsupported message: " + bVar.getClass());
            }
            v vVar = (v) xVar;
            if (vVar.H == i20.j.D) {
                i12 = 2;
            } else if (vVar.I) {
                i12 = 1;
            }
        }
        return H(xVar, bVar, i10, size + i12 + i11);
    }

    public List c(x xVar, o20.b bVar, int i10, int i11, c1 c1Var) {
        kotlin.jvm.internal.m.e(bVar, "callableProto");
        g4.c.q(i10, "kind");
        return H(xVar, bVar, i10, i11);
    }

    public List d(x xVar, i20.w wVar) {
        kotlin.jvm.internal.m.e(xVar, "container");
        String string = ((k20.g) xVar.B).getString(wVar.D);
        String strB = m20.b.b(((v) xVar).G.b());
        kotlin.jvm.internal.m.e(strB, "desc");
        return x(this, xVar, new g20.p(string + '#' + strB), null, false, 60);
    }

    public ArrayList e(v vVar) {
        kotlin.jvm.internal.m.e(vVar, "container");
        g20.o oVar = (n0) ((x) vVar).D;
        g20.o oVar2 = oVar instanceof g20.o ? oVar : null;
        o10.c cVar = oVar2 != null ? oVar2.A : null;
        if (cVar == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + vVar.G.a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = cVar.a;
        kotlin.jvm.internal.m.e(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        kotlin.jvm.internal.m.d(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            kotlin.jvm.internal.m.b(annotation);
            Class clsD = k00.f.D(k00.f.z(annotation));
            ui.b bVarF = F(p10.d.a(clsD), new o10.a(annotation), arrayList);
            if (bVarF != null) {
                f50.c.S(bVarF, annotation, clsD);
            }
        }
        return arrayList;
    }

    public List f(x xVar, o20.b bVar, int i10) {
        kotlin.jvm.internal.m.e(bVar, "proto");
        g4.c.q(i10, "kind");
        if (i10 == 2) {
            return I(xVar, (j0) bVar, g20.b.A);
        }
        g20.p pVarZ = z(bVar, (k20.g) xVar.B, (h9.f) xVar.C, i10, false);
        return pVarZ == null ? h00.x.A : x(this, xVar, pVarZ, null, false, 60);
    }

    public List h(x xVar, j0 j0Var) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        return I(xVar, j0Var, g20.b.B);
    }

    public List i(x xVar, j0 j0Var) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        return I(xVar, j0Var, g20.b.C);
    }

    public List j(x xVar, o20.b bVar, int i10) {
        int size;
        kotlin.jvm.internal.m.e(bVar, "proto");
        g4.c.q(i10, "kind");
        if (bVar instanceof b0) {
            size = ((b0) bVar).O.size();
        } else {
            size = bVar instanceof j0 ? ((j0) bVar).O.size() : 0;
        }
        return H(xVar, bVar, i10, size);
    }

    public ArrayList k(u0 u0Var, k20.g gVar) {
        kotlin.jvm.internal.m.e(u0Var, "proto");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        List<i20.h> list = u0Var.R;
        kotlin.jvm.internal.m.d(list, "getAnnotationList(...)");
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        for (i20.h hVar : list) {
            kotlin.jvm.internal.m.b(hVar);
            arrayList.add(((f0) this.F).f(hVar, gVar));
        }
        return arrayList;
    }

    public ArrayList l(z0 z0Var, k20.g gVar) {
        kotlin.jvm.internal.m.e(z0Var, "proto");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        List<i20.h> list = z0Var.K;
        kotlin.jvm.internal.m.d(list, "getAnnotationList(...)");
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        for (i20.h hVar : list) {
            kotlin.jvm.internal.m.b(hVar);
            arrayList.add(((f0) this.F).f(hVar, gVar));
        }
        return arrayList;
    }

    public void m(c50.h hVar, s7.a0 a0Var, k2 k2Var) {
        if (a0Var == null) {
            return;
        }
        if (k2Var.getIndexOfPeriod(a0Var.f13644a) != -1) {
            hVar.z(a0Var, k2Var);
            return;
        }
        k2 k2Var2 = (k2) ((i2) this.D).get(a0Var);
        if (k2Var2 != null) {
            hVar.z(a0Var, k2Var2);
        }
    }

    public Object n(x xVar, j0 j0Var, e30.w wVar) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        return G(xVar, j0Var, 3, wVar, g20.a.B);
    }

    public lb.j p() {
        Context context = (Context) this.B;
        wb.c cVar = (wb.c) this.C;
        g00.p pVarJ = (g00.p) this.D;
        if (pVarJ == null) {
            pVarJ = rd.a.J(new lb.d(this, 0));
        }
        g00.p pVarJ2 = (g00.p) this.E;
        if (pVarJ2 == null) {
            pVarJ2 = rd.a.J(new lb.d(this, 1));
        }
        g00.p pVarJ3 = rd.a.J(lb.e.A);
        lb.b bVar = (lb.b) this.F;
        if (bVar == null) {
            h00.x xVar = h00.x.A;
            bVar = new lb.b(xVar, xVar, xVar, xVar, xVar);
        }
        return new lb.j(context, cVar, pVarJ, pVarJ2, pVarJ3, bVar, (bc.e) this.G);
    }

    public x40.d q() {
        x40.d dVar = (x40.d) this.G;
        if (dVar != null) {
            return dVar;
        }
        x40.d dVar2 = x40.d.n;
        x40.d dVarM0 = s0.m0((x40.p) this.D);
        this.G = dVarM0;
        return dVarM0;
    }

    public Serializable t(m00.c cVar) {
        sv.g gVar;
        List list;
        int iP;
        LinkedHashMap linkedHashMap;
        List<yt.b> list2;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        q30.e eVar;
        ArrayList arrayList;
        Integer num;
        long j9;
        bx.c cVar2;
        PlayerItem playerItemX;
        bx.f fVar;
        dw.b bVar;
        bx.b bVarA;
        u30.b bVar2;
        Object next;
        if (cVar instanceof sv.g) {
            gVar = (sv.g) cVar;
            int i10 = gVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.E = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new sv.g(this, cVar);
            }
        } else {
            gVar = new sv.g(this, cVar);
        }
        Object objI = gVar.C;
        l00.a aVar = l00.a.A;
        int i11 = gVar.E;
        if (i11 == 0) {
            t1.O(objI);
            ut.p pVar = (zt.a) this.E;
            gVar.E = 1;
            objI = pVar.i(gVar);
            if (objI != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            t1.O(objI);
        } else {
            if (i11 == 2) {
                list = gVar.A;
                t1.O(objI);
                Iterable iterable = (Iterable) objI;
                iP = d0.P(h00.r.q0(iterable, 10));
                if (iP < 16) {
                    iP = 16;
                }
                linkedHashMap = new LinkedHashMap(iP);
                for (Object obj : iterable) {
                    linkedHashMap.put(new Integer(((bx.c) obj).a), obj);
                }
                rv.i iVar = (rv.i) this.C;
                gVar.A = list;
                gVar.B = linkedHashMap;
                gVar.E = 3;
                objI = iVar.i(gVar);
                if (objI != aVar) {
                    list2 = list;
                    linkedHashMap2 = linkedHashMap;
                }
                return aVar;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap2 = gVar.B;
            list2 = gVar.A;
            t1.O(objI);
        }
        q30.g gVar2 = new q30.g(h00.q.D0((Iterable) objI), new r9.e(13), q30.o.A);
        linkedHashMap3 = new LinkedHashMap();
        eVar = new q30.e(gVar2);
        while (eVar.hasNext()) {
            Object next2 = eVar.next();
            linkedHashMap3.put(new Long(((dw.b) next2).a), next2);
        }
        arrayList = new ArrayList();
        for (yt.b bVar3 : list2) {
            int i12 = bVar3.a;
            num = bVar3.e;
            j9 = bVar3.b;
            cVar2 = (bx.c) linkedHashMap2.get(new Integer(i12));
            playerItemX = null;
            if (cVar2 != null || (bVarA = cVar2.a()) == null || (bVar2 = bVarA.e) == null) {
                fVar = null;
            } else {
                Iterator it = bVar2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((bx.f) next).a != j9);
                fVar = (bx.f) next;
            }
            if (cVar2 != null || fVar == null) {
                bVar = (dw.b) linkedHashMap3.get(new Long(j9));
                if (bVar != null) {
                    playerItemX = ((cw.a) this.G).X(new g00.q(num, bVar, va.a.R(bVar3)));
                }
            } else {
                playerItemX = ((qu.a) this.F).X(new ru.b(cVar2, fVar, num, va.a.R(bVar3)));
            }
            if (playerItemX != null) {
                arrayList.add(playerItemX);
            }
        }
        return arrayList;
        List list3 = (List) objI;
        if (list3.isEmpty()) {
            return h00.x.A;
        }
        rv.p pVar2 = (rv.p) this.B;
        gVar.A = list3;
        gVar.E = 2;
        Object objF = pVar2.f(gVar);
        if (objF != aVar) {
            list = list3;
            objI = objF;
            Iterable iterable2 = (Iterable) objI;
            iP = d0.P(h00.r.q0(iterable2, 10));
            if (iP < 16) {
                iP = 16;
            }
            linkedHashMap = new LinkedHashMap(iP);
            while (r15.hasNext()) {
                linkedHashMap.put(new Integer(((bx.c) obj).a), obj);
            }
            rv.i iVar2 = (rv.i) this.C;
            gVar.A = list;
            gVar.B = linkedHashMap;
            gVar.E = 3;
            objI = iVar2.i(gVar);
            if (objI != aVar) {
                list2 = list;
                linkedHashMap2 = linkedHashMap;
                q30.g gVar3 = new q30.g(h00.q.D0((Iterable) objI), new r9.e(13), q30.o.A);
                linkedHashMap3 = new LinkedHashMap();
                eVar = new q30.e(gVar3);
                while (eVar.hasNext()) {
                    Object next3 = eVar.next();
                    linkedHashMap3.put(new Long(((dw.b) next3).a), next3);
                }
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    int i13 = bVar3.a;
                    num = bVar3.e;
                    j9 = bVar3.b;
                    cVar2 = (bx.c) linkedHashMap2.get(new Integer(i13));
                    playerItemX = null;
                    if (cVar2 != null) {
                        fVar = null;
                    } else {
                        fVar = null;
                    }
                    if (cVar2 != null) {
                        bVar = (dw.b) linkedHashMap3.get(new Long(j9));
                        if (bVar != null) {
                            playerItemX = ((cw.a) this.G).X(new g00.q(num, bVar, va.a.R(bVar3)));
                        }
                    } else {
                        bVar = (dw.b) linkedHashMap3.get(new Long(j9));
                        if (bVar != null) {
                            playerItemX = ((cw.a) this.G).X(new g00.q(num, bVar, va.a.R(bVar3)));
                        }
                    }
                    if (playerItemX != null) {
                        arrayList.add(playerItemX);
                    }
                }
                return arrayList;
            }
        }
        return aVar;
    }

    public String toString() {
        switch (this.A) {
            case 6:
                Map map = (Map) this.F;
                StringBuilder sb2 = new StringBuilder("Request{method=");
                sb2.append((String) this.B);
                sb2.append(", url=");
                sb2.append((x40.q) this.C);
                x40.p pVar = (x40.p) this.D;
                if (pVar.size() != 0) {
                    sb2.append(", headers=[");
                    int i10 = 0;
                    for (Object obj : pVar) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            va.a.k0();
                            throw null;
                        }
                        g00.k kVar = (g00.k) obj;
                        String str = (String) kVar.A;
                        String str2 = (String) kVar.B;
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(str);
                        sb2.append(':');
                        sb2.append(str2);
                        i10 = i11;
                    }
                    sb2.append(']');
                }
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String string = sb2.toString();
                kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public Serializable u(m00.c cVar) {
        sv.h hVar;
        if (cVar instanceof sv.h) {
            hVar = (sv.h) cVar;
            int i10 = hVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.C = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new sv.h(this, cVar);
            }
        } else {
            hVar = new sv.h(this, cVar);
        }
        Object objT = hVar.A;
        l00.a aVar = l00.a.A;
        int i11 = hVar.C;
        if (i11 == 0) {
            t1.O(objT);
            hVar.C = 1;
            objT = t(hVar);
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objT);
        }
        Iterable<PlayerItem> iterable = (Iterable) objT;
        ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
        for (PlayerItem playerItem : iterable) {
            arrayList.add(dh.o.m((dh.o) this.D, w.c.h(playerItem.getReciterId(), playerItem.getSurahNumber(), "dl/", "/"), playerItem.getSurahTranscription(), playerItem.getReciterName()));
        }
        return arrayList;
    }

    public Object v(String str, m00.c cVar) {
        sv.i iVar;
        int i10;
        int i11;
        rv.p pVar;
        if (cVar instanceof sv.i) {
            iVar = (sv.i) cVar;
            int i12 = iVar.F;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iVar.F = i12 - Integer.MIN_VALUE;
            } else {
                iVar = new sv.i(this, cVar);
            }
        } else {
            iVar = new sv.i(this, cVar);
        }
        Object obj = iVar.D;
        Serializable serializable = l00.a.A;
        int i13 = iVar.F;
        if (i13 == 0) {
            t1.O(obj);
            g00.k kVarH = kh.o.H(str, "dl/");
            if (kVarH == null) {
                return null;
            }
            int iIntValue = ((Number) kVarH.A).intValue();
            int iIntValue2 = ((Number) kVarH.B).intValue();
            rv.p pVar2 = (rv.p) this.B;
            iVar.A = pVar2;
            iVar.B = iIntValue;
            iVar.C = iIntValue2;
            iVar.F = 1;
            Serializable serializableT = t(iVar);
            if (serializableT == serializable) {
                return serializable;
            }
            obj = serializableT;
            i10 = iIntValue2;
            i11 = iIntValue;
            pVar = pVar2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = iVar.C;
            i11 = iVar.B;
            pVar = iVar.A;
            t1.O(obj);
        }
        return pVar.d(new o0(i11, i10, 2), (List) obj);
    }

    public List w(x xVar, g20.p pVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        List list;
        o10.c cVarH = c0.H(xVar, z10, z11, bool, z12, (hf.c) this.B, (k20.f) this.G);
        if (cVarH == null) {
            if (xVar instanceof v) {
                g20.o oVar = (n0) ((x) ((v) xVar)).D;
                g20.o oVar2 = oVar instanceof g20.o ? oVar : null;
                if (oVar2 != null) {
                    cVarH = oVar2.A;
                } else {
                    cVarH = null;
                }
            } else {
                cVarH = null;
            }
        }
        return (cVarH == null || (list = (List) ((g20.c) ((d30.e) this.C).invoke(cVarH)).a.get(pVar)) == null) ? h00.x.A : list;
    }
}
