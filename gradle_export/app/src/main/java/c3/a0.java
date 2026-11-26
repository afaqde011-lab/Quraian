package c3;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.cast.Cast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class a0 extends qj.c {
    public final int D;
    public final z4.b E;

    public a0(z4.b bVar, int i10) {
        super(3, (byte) 0);
        this.D = i10;
        this.E = bVar;
    }

    @Override
    public void G(int i10, a5.g gVar, String str, Bundle bundle) throws NoWhenBranchMatchedException {
        switch (this.D) {
            case 0:
                ((f0) this.E).j(i10, gVar, str, bundle);
                break;
        }
    }

    @Override
    public final a5.g I(int i10) throws Throwable {
        ?? Obtain;
        a5.g gVar;
        int i11;
        Bundle extras;
        Throwable th2;
        int i12;
        j3.s sVarL;
        ?? ValueOf;
        int iIntValue;
        u.u uVar;
        u.t0 t0Var;
        Resources resources;
        j3.o oVar;
        u.i0 i0Var;
        Object objG;
        j3.k kVar;
        AccessibilityManager accessibilityManager;
        u.t0 t0Var2;
        boolean zJ;
        List listJ;
        int size;
        boolean z10;
        int i13;
        int i14;
        ?? r10;
        m3.h hVarP;
        j3.s sVar;
        j3.k kVar2;
        u.i0 i0Var2;
        ?? r41;
        j3.o oVar2;
        Resources resources2;
        ?? r4;
        ?? r7;
        j3.z zVar;
        u.i0 i0Var3;
        ?? r11;
        j3.s sVar2;
        Object objG2;
        l3.a aVar;
        Object objG3;
        Boolean bool;
        j3.k kVar3;
        int i15;
        j3.o oVar3;
        Object objG4;
        List list;
        ?? r12;
        Object objG5;
        String str;
        Object objG6;
        Object objG7;
        int i16;
        Object objG8;
        Boolean bool2;
        Object objG9;
        Integer num;
        int iIntValue2;
        j3.z zVar2;
        f0 f0Var;
        boolean z11;
        ?? r13;
        j3.s sVarL2;
        Object objG10;
        j3.h hVar;
        Object objG11;
        j3.a aVar2;
        Object objG12;
        j3.a aVar3;
        j3.a aVar4;
        String strT;
        boolean z12;
        ArrayList arrayList;
        CharSequence charSequenceF;
        boolean z13;
        j3.j jVar;
        j3.l lVar;
        j3.l lVar2;
        int iD;
        ?? r14;
        z zVar3;
        int iD2;
        String str2;
        ?? r15;
        b4.j jVarV;
        b4.j jVarV2;
        j3.a aVar5;
        j3.a aVar6;
        j3.a aVar7;
        j3.o oVarN;
        j3.z zVar4;
        List list2;
        int size2;
        u.v vVar;
        u.t0 t0Var3;
        boolean z14;
        u.c0 c0Var;
        int[] iArr;
        int i17;
        int[] iArr2;
        int i18;
        int i19;
        u.c0 c0Var2;
        ArrayList arrayList2;
        int i20;
        Object objG13;
        boolean z15;
        Object objG14;
        Object objG15;
        boolean z16;
        b3.l0 l0Var;
        boolean z17;
        a5.c cVar;
        boolean z18;
        a5.c cVar2;
        Object objG16;
        Object objG17;
        j3.a aVar8;
        float f3;
        z00.a aVar9;
        j3.z zVar5;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        j3.a aVar10;
        ?? r16;
        List list3;
        boolean z19;
        boolean z20;
        b3.l0 l0VarX;
        j3.o oVarZ;
        boolean zA;
        j3.o oVarZ2;
        Object objG18;
        j3.a aVar11;
        j3.a aVar12;
        j3.a aVar13;
        j3.a aVar14;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objG19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        int i21;
        boolean z25;
        boolean z26;
        int i22;
        int iD3;
        j3.s sVarL3;
        boolean zBooleanValue;
        j3.o oVar4;
        j3.z zVar6;
        boolean zBooleanValue2;
        Object objG20;
        y3.c density;
        sd.p1 p1Var;
        SpannableString spannableString;
        List list4;
        ArrayList arrayList3;
        SpannableString spannableString2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int size3;
        int i23;
        int size4;
        int i24;
        List listA;
        int size5;
        int i25;
        m3.f fVar;
        int i26;
        Object obj;
        int i27;
        m3.o oVar5;
        WeakHashMap weakHashMap;
        Object eVar;
        m3.s0 s0Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size6;
        int i28;
        m3.f fVar2;
        m3.t0 t0Var4;
        int i29;
        int i30;
        int size7;
        int i31;
        m3.f fVar3;
        int size8;
        int i32;
        int i33;
        int i34;
        long jA;
        q3.u uVar2;
        q3.o oVar6;
        x3.p pVar;
        long j9;
        x3.l lVar3;
        x3.o cVar3;
        SpannableString spannableString3;
        q3.u uVar3;
        int i35;
        boolean z27;
        boolean z28;
        int i36;
        int i37;
        int i38;
        j3.s sVar3;
        u.l lVarS;
        int i39;
        b4.j jVar2;
        j3.t tVar;
        boolean zA2;
        j3.s sVar4;
        int i40;
        int i41;
        String strX;
        Object parentForAccessibility;
        ?? r17;
        ?? r18;
        a5.g gVar2;
        switch (this.D) {
            case 0:
                f0 f0Var2 = (f0) this.E;
                AccessibilityManager accessibilityManager2 = f0Var2.G;
                z zVar7 = f0Var2.D;
                if (zVar7.getComposeViewContext().f2702c.getLifecycle().b() == androidx.lifecycle.p.A) {
                    if (accessibilityManager2.isEnabled()) {
                        gVar2 = null;
                    } else {
                        gVar2 = new a5.g(AccessibilityNodeInfo.obtain());
                    }
                    r18 = f0Var2;
                    i16 = i10;
                    r15 = gVar2;
                } else {
                    j3.t tVar2 = (j3.t) f0Var2.s().b(i10);
                    if (tVar2 == null) {
                        if (accessibilityManager2.isEnabled()) {
                            gVar2 = null;
                        } else {
                            gVar2 = new a5.g(AccessibilityNodeInfo.obtain());
                        }
                        r18 = f0Var2;
                        i16 = i10;
                        r15 = gVar2;
                    } else {
                        j3.s sVar5 = tVar2.f7971a;
                        j3.o oVarK = sVar5.k();
                        b3.l0 l0Var2 = sVar5.f7967c;
                        Object objG21 = oVarK.A.g(j3.w.f7990o);
                        if (objG21 == null) {
                            objG21 = null;
                        }
                        boolean zA3 = kotlin.jvm.internal.m.a(objG21, Boolean.TRUE);
                        if (!zA3) {
                            Obtain = AccessibilityNodeInfo.obtain();
                            gVar = new a5.g(Obtain);
                            i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 34) {
                                a5.b.l(Obtain, zA3);
                            } else {
                                extras = Obtain.getExtras();
                                if (extras != null) {
                                    th2 = null;
                                    int i42 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65);
                                    if (zA3) {
                                        i12 = 64;
                                    } else {
                                        i12 = 0;
                                    }
                                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i42 | i12);
                                }
                                if (i10 == -1) {
                                    parentForAccessibility = zVar7.getParentForAccessibility();
                                    if (parentForAccessibility instanceof View) {
                                        r17 = (View) parentForAccessibility;
                                    } else {
                                        r17 = th2;
                                    }
                                    gVar.f188b = -1;
                                    Obtain.setParent(r17);
                                } else {
                                    sVarL = sVar5.l();
                                    if (sVarL != null) {
                                        ValueOf = Integer.valueOf(sVarL.f7970f);
                                    } else {
                                        ValueOf = th2;
                                    }
                                    if (ValueOf != 0) {
                                        y2.a.d("semanticsNode " + i10 + " has null parent");
                                        throw new KotlinNothingValueException();
                                    }
                                    iIntValue = ValueOf.intValue();
                                    if (iIntValue == zVar7.getSemanticsOwner().a().f7970f) {
                                        iIntValue = -1;
                                    }
                                    gVar.f188b = iIntValue;
                                    Obtain.setParent(zVar7, iIntValue);
                                }
                                gVar.f189c = i10;
                                Obtain.setSource(zVar7, i10);
                                Obtain.setBoundsInScreen(f0Var2.k(tVar2));
                                uVar = f0Var2.f2665j0;
                                t0Var = f0Var2.S;
                                resources = zVar7.getContext().getResources();
                                gVar.g("android.view.View");
                                oVar = sVar5.f7968d;
                                i0Var = oVar.A;
                                if (i0Var.c(j3.w.G)) {
                                    gVar.g("android.widget.EditText");
                                }
                                if (i0Var.c(j3.w.C)) {
                                    gVar.g("android.widget.TextView");
                                }
                                objG = i0Var.g(j3.w.f8001z);
                                if (objG == null) {
                                    objG = th2;
                                }
                                kVar = (j3.k) objG;
                                if (kVar != null) {
                                    i40 = kVar.f7937a;
                                    if (sVar5.o()) {
                                        accessibilityManager = accessibilityManager2;
                                        i41 = 4;
                                        t0Var2 = t0Var;
                                        if (j3.s.j(4, sVar5).isEmpty()) {
                                        }
                                    } else {
                                        accessibilityManager = accessibilityManager2;
                                        i41 = 4;
                                        t0Var2 = t0Var;
                                    }
                                    if (i40 == i41) {
                                        Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131887328));
                                    } else if (i40 == 2) {
                                        Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131887327));
                                    } else {
                                        strX = m0.x(i40);
                                        if (i40 == 5 || sVar5.q() || oVar.C) {
                                            gVar.g(strX);
                                        }
                                    }
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    t0Var2 = t0Var;
                                }
                                Obtain.setPackageName(zVar7.getContext().getPackageName());
                                Obtain.setImportantForAccessibility(j3.v.h(sVar5));
                                if (i11 >= 34) {
                                    zJ = a5.b.j(accessibilityManager);
                                } else {
                                    zJ = true;
                                }
                                listJ = j3.s.j(4, sVar5);
                                size = listJ.size();
                                z10 = zJ;
                                i13 = 0;
                                i14 = 0;
                                while (true) {
                                    r10 = gVar.f187a;
                                    if (i14 < size) {
                                        int i43 = size;
                                        sVar3 = (j3.s) listJ.get(i14);
                                        List list5 = listJ;
                                        lVarS = f0Var2.s();
                                        int i44 = i14;
                                        i39 = sVar3.f7970f;
                                        if (lVarS.a(i39)) {
                                            jVar2 = zVar7.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(sVar3.f7967c);
                                            if (i39 != -1) {
                                                if (jVar2 != null) {
                                                    Obtain.addChild(jVar2);
                                                } else {
                                                    tVar = (j3.t) f0Var2.s().b(i39);
                                                    if (tVar != null || (sVar4 = tVar.f7971a) == null) {
                                                        zA2 = false;
                                                    } else {
                                                        Object objG22 = sVar4.k().A.g(j3.w.f7990o);
                                                        if (objG22 == null) {
                                                            objG22 = th2;
                                                        }
                                                        zA2 = kotlin.jvm.internal.m.a(objG22, Boolean.TRUE);
                                                    }
                                                    if (z10 || !zA2) {
                                                        r10.addChild(zVar7, i39);
                                                    }
                                                }
                                                uVar.f(i39, i13);
                                                i13++;
                                            }
                                        }
                                        i14 = i44 + 1;
                                        listJ = list5;
                                        size = i43;
                                    } else {
                                        if (i10 == f0Var2.K) {
                                            r10.setAccessibilityFocused(true);
                                            gVar.b(a5.c.f173g);
                                        } else {
                                            r10.setAccessibilityFocused(false);
                                            gVar.b(a5.c.f172f);
                                        }
                                        hVarP = m0.p(sVar5);
                                        if (hVarP != null) {
                                            zVar7.getFontFamilyResolver();
                                            density = zVar7.getDensity();
                                            p1Var = f0Var2.f2661f0;
                                            String str3 = hVarP.B;
                                            list4 = hVarP.A;
                                            spannableString = new SpannableString(str3);
                                            arrayList3 = hVarP.C;
                                            if (arrayList3 != null) {
                                                size8 = arrayList3.size();
                                                i32 = 0;
                                                Obtain = Obtain;
                                                while (i32 < size8) {
                                                    int i45 = size8;
                                                    m3.f fVar4 = (m3.f) arrayList3.get(i32);
                                                    int i46 = i32;
                                                    m3.i0 i0Var4 = (m3.i0) fVar4.f10423a;
                                                    ArrayList arrayList6 = arrayList3;
                                                    i33 = fVar4.f10424b;
                                                    i34 = fVar4.f10425c;
                                                    j3.s sVar6 = sVar5;
                                                    j3.k kVar4 = kVar;
                                                    jA = i0Var4.f10457a.a();
                                                    j3.o oVar7 = oVar;
                                                    Resources resources3 = resources;
                                                    long j10 = i0Var4.f10458b;
                                                    uVar2 = i0Var4.f10459c;
                                                    oVar6 = i0Var4.f10460d;
                                                    pVar = i0Var4.f10466j;
                                                    t3.b bVar = i0Var4.f10467k;
                                                    u.i0 i0Var5 = i0Var;
                                                    ?? r42 = Obtain;
                                                    j9 = i0Var4.l;
                                                    lVar3 = i0Var4.m;
                                                    cVar3 = i0Var4.f10457a;
                                                    a5.g gVar3 = gVar;
                                                    if (!i2.t.c(jA, cVar3.a())) {
                                                        if (jA != 16) {
                                                            cVar3 = new x3.c(jA);
                                                        } else {
                                                            cVar3 = x3.n.f16422a;
                                                        }
                                                    }
                                                    rd.a.b0(spannableString, cVar3.a(), i33, i34);
                                                    spannableString3 = spannableString;
                                                    rd.a.c0(spannableString3, j10, density, i33, i34);
                                                    if (uVar2 == null || oVar6 != null) {
                                                        if (uVar2 == null) {
                                                            uVar3 = q3.u.J;
                                                        } else {
                                                            uVar3 = uVar2;
                                                        }
                                                        if (oVar6 != null) {
                                                            i35 = oVar6.f12746a;
                                                        } else {
                                                            i35 = 0;
                                                        }
                                                        if (uVar3.compareTo(q3.u.D) >= 0) {
                                                            z27 = true;
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        if (i35 == 1) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                        if (!z28 && z27) {
                                                            i36 = 3;
                                                        } else if (z27) {
                                                            i36 = 1;
                                                        } else if (z28) {
                                                            i36 = 2;
                                                        } else {
                                                            i36 = 0;
                                                        }
                                                        StyleSpan styleSpan = new StyleSpan(i36);
                                                        i37 = 33;
                                                        spannableString3.setSpan(styleSpan, i33, i34, 33);
                                                    } else {
                                                        i37 = 33;
                                                    }
                                                    if (lVar3 != null) {
                                                        i38 = lVar3.f16420a;
                                                        if ((i38 | 1) == i38) {
                                                            spannableString3.setSpan(new UnderlineSpan(), i33, i34, i37);
                                                        }
                                                        if ((i38 | 2) == i38) {
                                                            spannableString3.setSpan(new StrikethroughSpan(), i33, i34, i37);
                                                        }
                                                    }
                                                    if (pVar != null) {
                                                        spannableString3.setSpan(new ScaleXSpan(pVar.f16424a), i33, i34, i37);
                                                    }
                                                    rd.a.d0(spannableString3, bVar, i33, i34);
                                                    if (j9 != 16) {
                                                        spannableString3.setSpan(new BackgroundColorSpan(i2.b0.C(j9)), i33, i34, i37);
                                                    }
                                                    i32 = i46 + 1;
                                                    spannableString = spannableString3;
                                                    size8 = i45;
                                                    arrayList3 = arrayList6;
                                                    sVar5 = sVar6;
                                                    kVar = kVar4;
                                                    oVar = oVar7;
                                                    resources = resources3;
                                                    Obtain = r42;
                                                    i0Var = i0Var5;
                                                    gVar = gVar3;
                                                }
                                            }
                                            sVar = sVar5;
                                            kVar2 = kVar;
                                            i0Var2 = i0Var;
                                            r41 = Obtain;
                                            a5.g gVar4 = gVar;
                                            spannableString2 = spannableString;
                                            oVar2 = oVar;
                                            resources2 = resources;
                                            int length = str3.length();
                                            arrayList4 = h00.x.A;
                                            if (list4 != null) {
                                                arrayList5 = new ArrayList(list4.size());
                                                size7 = list4.size();
                                                while (i31 < size7) {
                                                    Object obj2 = list4.get(i31);
                                                    fVar3 = (m3.f) obj2;
                                                    if (!(fVar3.f10423a instanceof m3.t0) && m3.i.b(0, length, fVar3.f10424b, fVar3.f10425c)) {
                                                        arrayList5.add(obj2);
                                                    }
                                                }
                                            } else {
                                                arrayList5 = arrayList4;
                                            }
                                            size3 = arrayList5.size();
                                            while (i23 < size3) {
                                                m3.f fVar5 = (m3.f) arrayList5.get(i23);
                                                t0Var4 = (m3.t0) fVar5.f10423a;
                                                i29 = fVar5.f10424b;
                                                i30 = fVar5.f10425c;
                                                if (t0Var4 instanceof m3.t0) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(t0Var4.f10536a).build(), i29, i30, 33);
                                            }
                                            int length2 = str3.length();
                                            if (list4 != null) {
                                                arrayList4 = new ArrayList(list4.size());
                                                size6 = list4.size();
                                                while (i28 < size6) {
                                                    Object obj3 = list4.get(i28);
                                                    fVar2 = (m3.f) obj3;
                                                    if (!(fVar2.f10423a instanceof m3.s0) && m3.i.b(0, length2, fVar2.f10424b, fVar2.f10425c)) {
                                                        arrayList4.add(obj3);
                                                    }
                                                }
                                            }
                                            size4 = arrayList4.size();
                                            while (i24 < size4) {
                                                m3.f fVar6 = (m3.f) arrayList4.get(i24);
                                                s0Var = (m3.s0) fVar6.f10423a;
                                                int i47 = fVar6.f10424b;
                                                int i48 = fVar6.f10425c;
                                                weakHashMap2 = (WeakHashMap) p1Var.B;
                                                uRLSpan = weakHashMap2.get(s0Var);
                                                if (uRLSpan == null) {
                                                    uRLSpan = new URLSpan(s0Var.f10532a);
                                                    weakHashMap2.put(s0Var, uRLSpan);
                                                }
                                                spannableString2.setSpan((URLSpan) uRLSpan, i47, i48, 33);
                                            }
                                            listA = hVarP.a(str3.length());
                                            size5 = listA.size();
                                            while (i25 < size5) {
                                                fVar = (m3.f) listA.get(i25);
                                                i26 = fVar.f10424b;
                                                obj = fVar.f10423a;
                                                i27 = fVar.f10425c;
                                                if (i26 != i27) {
                                                    oVar5 = (m3.o) obj;
                                                    if ((oVar5 instanceof m3.n) || ((m3.n) oVar5).f10495c != null) {
                                                        weakHashMap = (WeakHashMap) p1Var.D;
                                                        eVar = weakHashMap.get(fVar);
                                                        if (eVar == null) {
                                                            eVar = new u3.e(oVar5);
                                                            weakHashMap.put(fVar, eVar);
                                                        }
                                                        spannableString2.setSpan((ClickableSpan) eVar, i26, i27, 33);
                                                    } else {
                                                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                                        m3.n nVar = (m3.n) obj;
                                                        m3.f fVar7 = new m3.f(nVar, i26, i27);
                                                        WeakHashMap weakHashMap3 = (WeakHashMap) p1Var.C;
                                                        Object uRLSpan2 = weakHashMap3.get(fVar7);
                                                        if (uRLSpan2 == null) {
                                                            uRLSpan2 = new URLSpan(nVar.f10493a);
                                                            weakHashMap3.put(fVar7, uRLSpan2);
                                                        }
                                                        spannableString2.setSpan((URLSpan) uRLSpan2, i26, i27, 33);
                                                    }
                                                }
                                            }
                                            r7 = gVar4;
                                            r4 = (SpannableString) f0.P(spannableString2);
                                        } else {
                                            uVar = uVar;
                                            sVar = sVar5;
                                            kVar2 = kVar;
                                            i0Var2 = i0Var;
                                            r41 = Obtain;
                                            oVar2 = oVar;
                                            resources2 = resources;
                                            r4 = th2;
                                            r7 = gVar;
                                        }
                                        r7.k(r4);
                                        zVar = j3.w.O;
                                        i0Var3 = i0Var2;
                                        if (i0Var3.c(zVar)) {
                                            ?? r19 = r41;
                                            r19.setContentInvalid(true);
                                            objG20 = i0Var3.g(zVar);
                                            if (objG20 == null) {
                                                objG20 = th2;
                                            }
                                            r10.setError((CharSequence) objG20);
                                            r11 = r19;
                                        } else {
                                            r11 = r41;
                                        }
                                        sVar2 = sVar;
                                        Resources resources4 = resources2;
                                        r10.setStateDescription(m0.o(sVar2, resources4));
                                        r10.setCheckable(m0.n(sVar2));
                                        objG2 = i0Var3.g(j3.w.L);
                                        if (objG2 == null) {
                                            objG2 = th2;
                                        }
                                        aVar = (l3.a) objG2;
                                        if (aVar != null) {
                                            if (aVar == l3.a.A) {
                                                r10.setChecked(true);
                                            } else if (aVar == l3.a.B) {
                                                r10.setChecked(false);
                                            }
                                        }
                                        objG3 = i0Var3.g(j3.w.K);
                                        if (objG3 == null) {
                                            objG3 = th2;
                                        }
                                        bool = (Boolean) objG3;
                                        if (bool != null) {
                                            zBooleanValue2 = bool.booleanValue();
                                            if (kVar2 == null) {
                                                kVar3 = kVar2;
                                                i15 = 4;
                                            } else {
                                                kVar3 = kVar2;
                                                i15 = 4;
                                                if (kVar3.f7937a == 4) {
                                                    r11.setSelected(zBooleanValue2);
                                                }
                                            }
                                            r10.setChecked(zBooleanValue2);
                                        } else {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                        }
                                        oVar3 = oVar2;
                                        if (oVar3.C || j3.s.j(i15, sVar2).isEmpty()) {
                                            objG4 = i0Var3.g(j3.w.f7978a);
                                            if (objG4 == null) {
                                                objG4 = th2;
                                            }
                                            list = (List) objG4;
                                            if (list != null) {
                                                r12 = (String) h00.q.N0(list);
                                            } else {
                                                r12 = th2;
                                            }
                                            r10.setContentDescription(r12);
                                        }
                                        objG5 = i0Var3.g(j3.w.A);
                                        if (objG5 == null) {
                                            objG5 = th2;
                                        }
                                        str = (String) objG5;
                                        if (str != null) {
                                            sVarL3 = sVar2;
                                            while (true) {
                                                if (sVarL3 != null) {
                                                    oVar4 = sVarL3.f7968d;
                                                    zVar6 = j3.x.f8002a;
                                                    if (oVar4.A.c(zVar6)) {
                                                        zBooleanValue = ((Boolean) oVar4.e(zVar6)).booleanValue();
                                                    } else {
                                                        sVarL3 = sVarL3.l();
                                                    }
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                            }
                                            if (zBooleanValue) {
                                                r11.setViewIdResourceName(str);
                                            }
                                        }
                                        objG6 = i0Var3.g(j3.w.f7985h);
                                        if (objG6 == null) {
                                            objG6 = th2;
                                        }
                                        if (((g00.b0) objG6) != null) {
                                            r10.setHeading(true);
                                        }
                                        objG7 = i0Var3.g(j3.w.f7986i);
                                        if (objG7 == null) {
                                            objG7 = th2;
                                        }
                                        if (((g00.b0) objG7) != null) {
                                            r11.setTextEntryKey(true);
                                        }
                                        i16 = i10;
                                        if (i16 != -1) {
                                            iD3 = uVar.d(sVar2.f7970f, -1);
                                            if (iD3 != -1) {
                                                r11.setDrawingOrder(iD3);
                                            } else {
                                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                            }
                                        }
                                        r11.setPassword(i0Var3.c(j3.w.N));
                                        objG8 = i0Var3.g(j3.w.Q);
                                        if (objG8 == null) {
                                            objG8 = th2;
                                        }
                                        bool2 = Boolean.TRUE;
                                        r11.setEditable(kotlin.jvm.internal.m.a(objG8, bool2));
                                        objG9 = i0Var3.g(j3.w.R);
                                        if (objG9 == null) {
                                            objG9 = th2;
                                        }
                                        num = (Integer) objG9;
                                        if (num != null) {
                                            iIntValue2 = num.intValue();
                                        } else {
                                            iIntValue2 = -1;
                                        }
                                        r10.setMaxTextLength(iIntValue2);
                                        r10.setEnabled(m0.b(sVar2));
                                        zVar2 = j3.w.l;
                                        r10.setFocusable(i0Var3.c(zVar2));
                                        if (r11.isFocusable()) {
                                            r10.setFocused(((Boolean) oVar3.e(zVar2)).booleanValue());
                                            if (r11.isFocused()) {
                                                r7.a(2);
                                                f0 f0Var3 = f0Var2;
                                                f0Var3.L = i16;
                                                f0Var = f0Var3;
                                            } else {
                                                r13 = f0Var2;
                                                z11 = true;
                                                r7.a(1);
                                            }
                                            r10.setVisibleToUser(j3.v.g(sVar2) ^ z11);
                                            if (sVar2.o()) {
                                                sVarL2 = sVar2.l();
                                                kotlin.jvm.internal.m.b(sVarL2);
                                            } else {
                                                sVarL2 = sVar2;
                                            }
                                            if (sVarL2.m().g()) {
                                                r10.setVisibleToUser(false);
                                            }
                                            objG10 = i0Var3.g(j3.w.f7988k);
                                            if (objG10 == null) {
                                                objG10 = th2;
                                            }
                                            hVar = (j3.h) objG10;
                                            if (hVar != null) {
                                                i21 = hVar.f7933a;
                                                if (i21 == 0) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                                if (z25) {
                                                    if (i21 == 1) {
                                                        z26 = true;
                                                    } else {
                                                        z26 = false;
                                                    }
                                                    if (z26) {
                                                        i22 = 2;
                                                    } else {
                                                        i22 = 1;
                                                    }
                                                } else {
                                                    i22 = 1;
                                                }
                                                r11.setLiveRegion(i22);
                                            }
                                            r10.setClickable(false);
                                            objG11 = i0Var3.g(j3.n.f7941b);
                                            if (objG11 == null) {
                                                objG11 = th2;
                                            }
                                            aVar2 = (j3.a) objG11;
                                            if (aVar2 != null) {
                                                objG19 = i0Var3.g(j3.w.K);
                                                if (objG19 == null) {
                                                    objG19 = th2;
                                                }
                                                boolean zA4 = kotlin.jvm.internal.m.a(objG19, bool2);
                                                if (kVar3 == null && kVar3.f7937a == 4) {
                                                    z21 = true;
                                                } else {
                                                    z21 = false;
                                                }
                                                if (z21) {
                                                    z22 = true;
                                                } else {
                                                    if (kVar3 == null && kVar3.f7937a == 3) {
                                                        z24 = true;
                                                    } else {
                                                        z24 = false;
                                                    }
                                                    if (z24) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                }
                                                if (z22 || (z22 && !zA4)) {
                                                    z23 = true;
                                                } else {
                                                    z23 = false;
                                                }
                                                r10.setClickable(z23);
                                                if (m0.b(sVar2) && r11.isClickable()) {
                                                    r7.b(new a5.c(16, aVar2.f7926a));
                                                }
                                            }
                                            r10.setLongClickable(false);
                                            objG12 = i0Var3.g(j3.n.f7942c);
                                            if (objG12 == null) {
                                                objG12 = th2;
                                            }
                                            aVar3 = (j3.a) objG12;
                                            if (aVar3 != null) {
                                                r10.setLongClickable(true);
                                                if (m0.b(sVar2)) {
                                                    r7.b(new a5.c(32, aVar3.f7926a));
                                                }
                                            }
                                            aVar4 = (j3.a) j3.v.f(oVar3, j3.n.f7954q);
                                            if (aVar4 != null) {
                                                r7.b(new a5.c(16384, aVar4.f7926a));
                                            }
                                            if (m0.b(sVar2)) {
                                                aVar11 = (j3.a) j3.v.f(oVar3, j3.n.f7950k);
                                                if (aVar11 != null) {
                                                    r7.b(new a5.c(2097152, aVar11.f7926a));
                                                }
                                                aVar12 = (j3.a) j3.v.f(oVar3, j3.n.f7953p);
                                                if (aVar12 != null) {
                                                    r7.b(new a5.c(R.id.accessibilityActionImeEnter, aVar12.f7926a));
                                                }
                                                aVar13 = (j3.a) j3.v.f(oVar3, j3.n.f7955r);
                                                if (aVar13 != null) {
                                                    r7.b(new a5.c(Cast.MAX_MESSAGE_LENGTH, aVar13.f7926a));
                                                }
                                                aVar14 = (j3.a) j3.v.f(oVar3, j3.n.f7956s);
                                                if (aVar14 != null && r11.isFocused()) {
                                                    primaryClipDescription = zVar7.getClipboardManager().a().getPrimaryClipDescription();
                                                    if (primaryClipDescription != null) {
                                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                    } else {
                                                        zHasMimeType = false;
                                                    }
                                                    if (zHasMimeType) {
                                                        r7.b(new a5.c(32768, aVar14.f7926a));
                                                    }
                                                }
                                            }
                                            strT = f0.t(sVar2);
                                            if (strT != null || strT.length() == 0) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (!z12) {
                                                r11.setTextSelection(r13.r(sVar2), r13.q(sVar2));
                                                aVar10 = (j3.a) j3.v.f(oVar3, j3.n.f7949j);
                                                if (aVar10 != null) {
                                                    r16 = aVar10.f7926a;
                                                } else {
                                                    r16 = th2;
                                                }
                                                r7.b(new a5.c(131072, (String) r16));
                                                r7.a(256);
                                                r7.a(512);
                                                r10.setMovementGranularities(11);
                                                list3 = (List) j3.v.f(oVar3, j3.w.f7978a);
                                                if (list3 != null || list3.isEmpty()) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                if (z19 && i0Var3.c(j3.n.f7940a)) {
                                                    z20 = true;
                                                    if (sVar2.f7968d.A.c(j3.w.G)) {
                                                        objG18 = sVar2.f7968d.A.g(j3.w.l);
                                                        if (objG18 == null) {
                                                            objG18 = null;
                                                        }
                                                        if (kotlin.jvm.internal.m.a(objG18, Boolean.TRUE)) {
                                                            l0VarX = sVar2.f7967c.x();
                                                            while (true) {
                                                                if (l0VarX == null) {
                                                                    l0VarX = null;
                                                                } else {
                                                                    oVarZ2 = l0VarX.z();
                                                                    if (oVarZ2 == null && oVarZ2.C) {
                                                                        if (oVarZ2.A.c(j3.w.G)) {
                                                                        }
                                                                    }
                                                                    l0VarX = l0VarX.x();
                                                                }
                                                            }
                                                            if (l0VarX == null) {
                                                                z20 = false;
                                                            } else {
                                                                oVarZ = l0VarX.z();
                                                                if (oVarZ != null) {
                                                                    Object objG23 = oVarZ.A.g(j3.w.l);
                                                                    zA = kotlin.jvm.internal.m.a(objG23 != null ? objG23 : null, Boolean.TRUE);
                                                                } else {
                                                                    zA = false;
                                                                }
                                                                if (zA) {
                                                                    z20 = false;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        l0VarX = sVar2.f7967c.x();
                                                        while (true) {
                                                            if (l0VarX == null) {
                                                                l0VarX = null;
                                                            } else {
                                                                oVarZ2 = l0VarX.z();
                                                                if (oVarZ2 == null) {
                                                                }
                                                                l0VarX = l0VarX.x();
                                                            }
                                                        }
                                                        if (l0VarX == null) {
                                                            z20 = false;
                                                        } else {
                                                            oVarZ = l0VarX.z();
                                                            if (oVarZ != null) {
                                                                Object objG24 = oVarZ.A.g(j3.w.l);
                                                                zA = kotlin.jvm.internal.m.a(objG24 != null ? objG24 : null, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                                z20 = false;
                                                            }
                                                        }
                                                    }
                                                    if (!z20) {
                                                        r10.setMovementGranularities(r11.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                            arrayList = new ArrayList();
                                            arrayList.add("androidx.compose.ui.semantics.id");
                                            charSequenceF = r7.f();
                                            if (charSequenceF != null || charSequenceF.length() == 0) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (!z13 && i0Var3.c(j3.n.f7940a)) {
                                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (i0Var3.c(j3.w.A)) {
                                                arrayList.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (i0Var3.c(j3.w.S)) {
                                                arrayList.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            r11.setAvailableExtraData(arrayList);
                                            jVar = (j3.j) j3.v.f(oVar3, j3.w.f7980c);
                                            if (jVar != null) {
                                                f3 = jVar.f7935a;
                                                aVar9 = jVar.f7936b;
                                                zVar5 = j3.n.f7948i;
                                                if (i0Var3.c(zVar5)) {
                                                    r7.g("android.widget.SeekBar");
                                                } else {
                                                    r7.g("android.widget.ProgressBar");
                                                }
                                                if (jVar != j3.j.f7934c) {
                                                    r11.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, aVar9.A, aVar9.B, f3));
                                                }
                                                if (sVar2.n().A.c(zVar5) && m0.b(sVar2)) {
                                                    fFloatValue = ((Number) aVar9.c()).floatValue();
                                                    fFloatValue2 = ((Number) aVar9.a()).floatValue();
                                                    if (fFloatValue < fFloatValue2) {
                                                        fFloatValue = fFloatValue2;
                                                    }
                                                    if (f3 < fFloatValue) {
                                                        r7.b(a5.c.f174h);
                                                    }
                                                    fFloatValue3 = ((Number) aVar9.a()).floatValue();
                                                    fFloatValue4 = ((Number) aVar9.c()).floatValue();
                                                    if (fFloatValue3 > fFloatValue4) {
                                                        fFloatValue3 = fFloatValue4;
                                                    }
                                                    if (f3 > fFloatValue3) {
                                                        r7.b(a5.c.f175i);
                                                    }
                                                }
                                            }
                                            if (m0.b(sVar2)) {
                                                objG17 = sVar2.f7968d.A.g(j3.n.f7948i);
                                                if (objG17 == null) {
                                                    objG17 = null;
                                                }
                                                aVar8 = (j3.a) objG17;
                                                if (aVar8 != null) {
                                                    r7.b(new a5.c(R.id.accessibilityActionSetProgress, aVar8.f7926a));
                                                }
                                            }
                                            ta.c0.U(r7, sVar2);
                                            ta.c0.V(r7, sVar2);
                                            lVar = (j3.l) j3.v.f(sVar2.n(), j3.w.f7997v);
                                            j3.a aVar15 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7943d);
                                            if (lVar != null && aVar15 != null) {
                                                objG15 = sVar2.k().A.g(j3.w.f7983f);
                                                if (objG15 == null) {
                                                    objG15 = th2;
                                                }
                                                if (objG15 == null) {
                                                    objG16 = sVar2.k().A.g(j3.w.f7982e);
                                                    if (objG16 == null) {
                                                        objG16 = th2;
                                                    }
                                                    if (objG16 != null) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                } else {
                                                    z16 = true;
                                                }
                                                if (!z16) {
                                                    r7.g("android.widget.HorizontalScrollView");
                                                }
                                                if (((Number) lVar.f7939b.invoke()).floatValue() > 0.0f) {
                                                    r7.j(true);
                                                }
                                                if (m0.b(sVar2)) {
                                                    if (f0.z(lVar)) {
                                                        r7.b(a5.c.f174h);
                                                        l0Var = l0Var2;
                                                        if (l0Var.f2053a0 == y3.m.B) {
                                                            z18 = true;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        if (z18) {
                                                            cVar2 = a5.c.f181q;
                                                        } else {
                                                            cVar2 = a5.c.f179o;
                                                        }
                                                        r7.b(cVar2);
                                                    } else {
                                                        l0Var = l0Var2;
                                                    }
                                                    if (f0.y(lVar)) {
                                                        r7.b(a5.c.f175i);
                                                        if (l0Var.f2053a0 == y3.m.B) {
                                                            z17 = true;
                                                        } else {
                                                            z17 = false;
                                                        }
                                                        if (z17) {
                                                            cVar = a5.c.f179o;
                                                        } else {
                                                            cVar = a5.c.f181q;
                                                        }
                                                        r7.b(cVar);
                                                    }
                                                }
                                            }
                                            lVar2 = (j3.l) j3.v.f(sVar2.n(), j3.w.f7998w);
                                            if (lVar2 != null && aVar15 != null) {
                                                objG13 = sVar2.k().A.g(j3.w.f7983f);
                                                if (objG13 == null) {
                                                    objG13 = th2;
                                                }
                                                if (objG13 == null) {
                                                    objG14 = sVar2.k().A.g(j3.w.f7982e);
                                                    if (objG14 == null) {
                                                        objG14 = th2;
                                                    }
                                                    if (objG14 != null) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                } else {
                                                    z15 = true;
                                                }
                                                if (!z15) {
                                                    r7.g("android.widget.ScrollView");
                                                }
                                                if (((Number) lVar2.f7939b.invoke()).floatValue() > 0.0f) {
                                                    r7.j(true);
                                                }
                                                if (m0.b(sVar2)) {
                                                    if (f0.z(lVar2)) {
                                                        r7.b(a5.c.f174h);
                                                        r7.b(a5.c.f180p);
                                                    }
                                                    if (f0.y(lVar2)) {
                                                        r7.b(a5.c.f175i);
                                                        r7.b(a5.c.f178n);
                                                    }
                                                }
                                            }
                                            m0.f(r7, sVar2);
                                            r10.setPaneTitle((CharSequence) j3.v.f(sVar2.n(), j3.w.f7981d));
                                            if (m0.b(sVar2)) {
                                                aVar5 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7957t);
                                                if (aVar5 != null) {
                                                    r7.b(new a5.c(262144, aVar5.f7926a));
                                                }
                                                aVar6 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7958u);
                                                if (aVar6 != null) {
                                                    r7.b(new a5.c(524288, aVar6.f7926a));
                                                }
                                                aVar7 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7959v);
                                                if (aVar7 != null) {
                                                    r7.b(new a5.c(1048576, aVar7.f7926a));
                                                }
                                                oVarN = sVar2.n();
                                                zVar4 = j3.n.f7961x;
                                                if (oVarN.A.c(zVar4)) {
                                                    list2 = (List) sVar2.n().e(zVar4);
                                                    size2 = list2.size();
                                                    vVar = f0.f2655n0;
                                                    if (size2 < vVar.f14904b) {
                                                        throw new IllegalStateException(g4.c.g(vVar.f14904b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                    }
                                                    u.t0 t0Var5 = new u.t0(0);
                                                    u.c0 c0VarA = u.n0.a();
                                                    t0Var3 = t0Var2;
                                                    if (v.a.a(t0Var3.A, t0Var3.C, i16) >= 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        c0Var = (u.c0) t0Var3.c(i16);
                                                        iArr = vVar.f14903a;
                                                        i17 = vVar.f14904b;
                                                        iArr2 = new int[16];
                                                        i18 = 0;
                                                        i19 = 0;
                                                        while (i18 < i17) {
                                                            int i49 = iArr[i18];
                                                            int i50 = i17;
                                                            i20 = i19 + 1;
                                                            u.c0 c0Var3 = c0Var;
                                                            if (iArr2.length < i20) {
                                                                int[] iArrCopyOf = Arrays.copyOf(iArr2, Math.max(i20, (iArr2.length * 3) / 2));
                                                                kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
                                                                iArr2 = iArrCopyOf;
                                                            }
                                                            iArr2[i19] = i49;
                                                            i18++;
                                                            i19 = i20;
                                                            i17 = i50;
                                                            c0Var = c0Var3;
                                                        }
                                                        c0Var2 = c0Var;
                                                        arrayList2 = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            a1.b.x(list2.get(0));
                                                            kotlin.jvm.internal.m.b(c0Var2);
                                                            throw th2;
                                                        }
                                                        if (arrayList2.size() > 0) {
                                                            a1.b.x(arrayList2.get(0));
                                                            if (i19 > 0) {
                                                                int i51 = iArr2[0];
                                                                throw th2;
                                                            }
                                                            v.a.d("Index must be between 0 and size");
                                                            throw th2;
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        a1.b.x(list2.get(0));
                                                        vVar.c(0);
                                                        throw th2;
                                                    }
                                                    r13.R.e(i16, t0Var5);
                                                    t0Var3.e(i16, c0VarA);
                                                }
                                            }
                                            r10.setScreenReaderFocusable(m0.d(sVar2, resources4));
                                            iD = r13.f2657b0.d(i16, -1);
                                            if (iD != -1) {
                                                jVarV2 = m0.v(zVar7.getAndroidViewsHandler$ui(), iD);
                                                if (jVarV2 != null) {
                                                    r10.setTraversalBefore(jVarV2);
                                                    zVar3 = zVar7;
                                                } else {
                                                    zVar3 = zVar7;
                                                    r10.setTraversalBefore(zVar3, iD);
                                                }
                                                ?? r20 = th2;
                                                r13.j(i16, r7, r13.f2659d0, r20);
                                                r14 = r20;
                                            } else {
                                                r14 = th2;
                                                zVar3 = zVar7;
                                            }
                                            iD2 = r13.f2658c0.d(i16, -1);
                                            if (iD2 != -1 && (jVarV = m0.v(zVar3.getAndroidViewsHandler$ui(), iD2)) != null) {
                                                r10.setTraversalAfter(jVarV);
                                                r13.j(i16, r7, r13.f2660e0, r14);
                                            }
                                            str2 = (String) j3.v.f(sVar2.n(), j3.x.f8003b);
                                            if (str2 != null) {
                                                r7.g(str2);
                                            }
                                            r15 = r7;
                                            r18 = r13;
                                        } else {
                                            f0Var = f0Var2;
                                        }
                                        z11 = true;
                                        r13 = f0Var;
                                        r10.setVisibleToUser(j3.v.g(sVar2) ^ z11);
                                        if (sVar2.o()) {
                                            sVarL2 = sVar2.l();
                                            kotlin.jvm.internal.m.b(sVarL2);
                                        } else {
                                            sVarL2 = sVar2;
                                        }
                                        if (sVarL2.m().g()) {
                                            r10.setVisibleToUser(false);
                                        }
                                        objG10 = i0Var3.g(j3.w.f7988k);
                                        if (objG10 == null) {
                                            objG10 = th2;
                                        }
                                        hVar = (j3.h) objG10;
                                        if (hVar != null) {
                                            i21 = hVar.f7933a;
                                            if (i21 == 0) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            if (z25) {
                                                if (i21 == 1) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                if (z26) {
                                                    i22 = 2;
                                                } else {
                                                    i22 = 1;
                                                }
                                            } else {
                                                i22 = 1;
                                            }
                                            r11.setLiveRegion(i22);
                                        }
                                        r10.setClickable(false);
                                        objG11 = i0Var3.g(j3.n.f7941b);
                                        if (objG11 == null) {
                                            objG11 = th2;
                                        }
                                        aVar2 = (j3.a) objG11;
                                        if (aVar2 != null) {
                                            objG19 = i0Var3.g(j3.w.K);
                                            if (objG19 == null) {
                                                objG19 = th2;
                                            }
                                            boolean zA5 = kotlin.jvm.internal.m.a(objG19, bool2);
                                            if (kVar3 == null) {
                                                z21 = false;
                                            } else {
                                                z21 = true;
                                            }
                                            if (z21) {
                                                z22 = true;
                                            } else {
                                                if (kVar3 == null) {
                                                    z24 = false;
                                                } else {
                                                    z24 = true;
                                                }
                                                if (z24) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                            }
                                            if (z22) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            r10.setClickable(z23);
                                            if (m0.b(sVar2)) {
                                                r7.b(new a5.c(16, aVar2.f7926a));
                                            }
                                        }
                                        r10.setLongClickable(false);
                                        objG12 = i0Var3.g(j3.n.f7942c);
                                        if (objG12 == null) {
                                            objG12 = th2;
                                        }
                                        aVar3 = (j3.a) objG12;
                                        if (aVar3 != null) {
                                            r10.setLongClickable(true);
                                            if (m0.b(sVar2)) {
                                                r7.b(new a5.c(32, aVar3.f7926a));
                                            }
                                        }
                                        aVar4 = (j3.a) j3.v.f(oVar3, j3.n.f7954q);
                                        if (aVar4 != null) {
                                            r7.b(new a5.c(16384, aVar4.f7926a));
                                        }
                                        if (m0.b(sVar2)) {
                                            aVar11 = (j3.a) j3.v.f(oVar3, j3.n.f7950k);
                                            if (aVar11 != null) {
                                                r7.b(new a5.c(2097152, aVar11.f7926a));
                                            }
                                            aVar12 = (j3.a) j3.v.f(oVar3, j3.n.f7953p);
                                            if (aVar12 != null) {
                                                r7.b(new a5.c(R.id.accessibilityActionImeEnter, aVar12.f7926a));
                                            }
                                            aVar13 = (j3.a) j3.v.f(oVar3, j3.n.f7955r);
                                            if (aVar13 != null) {
                                                r7.b(new a5.c(Cast.MAX_MESSAGE_LENGTH, aVar13.f7926a));
                                            }
                                            aVar14 = (j3.a) j3.v.f(oVar3, j3.n.f7956s);
                                            if (aVar14 != null) {
                                                primaryClipDescription = zVar7.getClipboardManager().a().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r7.b(new a5.c(32768, aVar14.f7926a));
                                                }
                                            }
                                        }
                                        strT = f0.t(sVar2);
                                        if (strT != null) {
                                            z12 = true;
                                        } else {
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            r11.setTextSelection(r13.r(sVar2), r13.q(sVar2));
                                            aVar10 = (j3.a) j3.v.f(oVar3, j3.n.f7949j);
                                            if (aVar10 != null) {
                                                r16 = aVar10.f7926a;
                                            } else {
                                                r16 = th2;
                                            }
                                            r7.b(new a5.c(131072, (String) r16));
                                            r7.a(256);
                                            r7.a(512);
                                            r10.setMovementGranularities(11);
                                            list3 = (List) j3.v.f(oVar3, j3.w.f7978a);
                                            if (list3 != null) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            if (z19) {
                                                z20 = true;
                                                if (sVar2.f7968d.A.c(j3.w.G)) {
                                                    objG18 = sVar2.f7968d.A.g(j3.w.l);
                                                    if (objG18 == null) {
                                                        objG18 = null;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(objG18, Boolean.TRUE)) {
                                                        l0VarX = sVar2.f7967c.x();
                                                        while (true) {
                                                            if (l0VarX == null) {
                                                                l0VarX = null;
                                                            } else {
                                                                oVarZ2 = l0VarX.z();
                                                                if (oVarZ2 == null) {
                                                                }
                                                                l0VarX = l0VarX.x();
                                                            }
                                                        }
                                                        if (l0VarX == null) {
                                                            z20 = false;
                                                        } else {
                                                            oVarZ = l0VarX.z();
                                                            if (oVarZ != null) {
                                                                Object objG25 = oVarZ.A.g(j3.w.l);
                                                                zA = kotlin.jvm.internal.m.a(objG25 != null ? objG25 : null, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                                z20 = false;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    l0VarX = sVar2.f7967c.x();
                                                    while (true) {
                                                        if (l0VarX == null) {
                                                            l0VarX = null;
                                                        } else {
                                                            oVarZ2 = l0VarX.z();
                                                            if (oVarZ2 == null) {
                                                            }
                                                            l0VarX = l0VarX.x();
                                                        }
                                                    }
                                                    if (l0VarX == null) {
                                                        z20 = false;
                                                    } else {
                                                        oVarZ = l0VarX.z();
                                                        if (oVarZ != null) {
                                                            Object objG26 = oVarZ.A.g(j3.w.l);
                                                            zA = kotlin.jvm.internal.m.a(objG26 != null ? objG26 : null, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                            z20 = false;
                                                        }
                                                    }
                                                }
                                                if (!z20) {
                                                    r10.setMovementGranularities(r11.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        charSequenceF = r7.f();
                                        if (charSequenceF != null) {
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                        }
                                        if (!z13) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (i0Var3.c(j3.w.A)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (i0Var3.c(j3.w.S)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        r11.setAvailableExtraData(arrayList);
                                        jVar = (j3.j) j3.v.f(oVar3, j3.w.f7980c);
                                        if (jVar != null) {
                                            f3 = jVar.f7935a;
                                            aVar9 = jVar.f7936b;
                                            zVar5 = j3.n.f7948i;
                                            if (i0Var3.c(zVar5)) {
                                                r7.g("android.widget.SeekBar");
                                            } else {
                                                r7.g("android.widget.ProgressBar");
                                            }
                                            if (jVar != j3.j.f7934c) {
                                                r11.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, aVar9.A, aVar9.B, f3));
                                            }
                                            if (sVar2.n().A.c(zVar5)) {
                                                fFloatValue = ((Number) aVar9.c()).floatValue();
                                                fFloatValue2 = ((Number) aVar9.a()).floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                if (f3 < fFloatValue) {
                                                    r7.b(a5.c.f174h);
                                                }
                                                fFloatValue3 = ((Number) aVar9.a()).floatValue();
                                                fFloatValue4 = ((Number) aVar9.c()).floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                if (f3 > fFloatValue3) {
                                                    r7.b(a5.c.f175i);
                                                }
                                            }
                                        }
                                        if (m0.b(sVar2)) {
                                            objG17 = sVar2.f7968d.A.g(j3.n.f7948i);
                                            if (objG17 == null) {
                                                objG17 = null;
                                            }
                                            aVar8 = (j3.a) objG17;
                                            if (aVar8 != null) {
                                                r7.b(new a5.c(R.id.accessibilityActionSetProgress, aVar8.f7926a));
                                            }
                                        }
                                        ta.c0.U(r7, sVar2);
                                        ta.c0.V(r7, sVar2);
                                        lVar = (j3.l) j3.v.f(sVar2.n(), j3.w.f7997v);
                                        j3.a aVar16 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7943d);
                                        if (lVar != null) {
                                            objG15 = sVar2.k().A.g(j3.w.f7983f);
                                            if (objG15 == null) {
                                                objG15 = th2;
                                            }
                                            if (objG15 == null) {
                                                objG16 = sVar2.k().A.g(j3.w.f7982e);
                                                if (objG16 == null) {
                                                    objG16 = th2;
                                                }
                                                if (objG16 != null) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                            } else {
                                                z16 = true;
                                            }
                                            if (!z16) {
                                                r7.g("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) lVar.f7939b.invoke()).floatValue() > 0.0f) {
                                                r7.j(true);
                                            }
                                            if (m0.b(sVar2)) {
                                                if (f0.z(lVar)) {
                                                    r7.b(a5.c.f174h);
                                                    l0Var = l0Var2;
                                                    if (l0Var.f2053a0 == y3.m.B) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (z18) {
                                                        cVar2 = a5.c.f181q;
                                                    } else {
                                                        cVar2 = a5.c.f179o;
                                                    }
                                                    r7.b(cVar2);
                                                } else {
                                                    l0Var = l0Var2;
                                                }
                                                if (f0.y(lVar)) {
                                                    r7.b(a5.c.f175i);
                                                    if (l0Var.f2053a0 == y3.m.B) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        cVar = a5.c.f179o;
                                                    } else {
                                                        cVar = a5.c.f181q;
                                                    }
                                                    r7.b(cVar);
                                                }
                                            }
                                        }
                                        lVar2 = (j3.l) j3.v.f(sVar2.n(), j3.w.f7998w);
                                        if (lVar2 != null) {
                                            objG13 = sVar2.k().A.g(j3.w.f7983f);
                                            if (objG13 == null) {
                                                objG13 = th2;
                                            }
                                            if (objG13 == null) {
                                                objG14 = sVar2.k().A.g(j3.w.f7982e);
                                                if (objG14 == null) {
                                                    objG14 = th2;
                                                }
                                                if (objG14 != null) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            } else {
                                                z15 = true;
                                            }
                                            if (!z15) {
                                                r7.g("android.widget.ScrollView");
                                            }
                                            if (((Number) lVar2.f7939b.invoke()).floatValue() > 0.0f) {
                                                r7.j(true);
                                            }
                                            if (m0.b(sVar2)) {
                                                if (f0.z(lVar2)) {
                                                    r7.b(a5.c.f174h);
                                                    r7.b(a5.c.f180p);
                                                }
                                                if (f0.y(lVar2)) {
                                                    r7.b(a5.c.f175i);
                                                    r7.b(a5.c.f178n);
                                                }
                                            }
                                        }
                                        m0.f(r7, sVar2);
                                        r10.setPaneTitle((CharSequence) j3.v.f(sVar2.n(), j3.w.f7981d));
                                        if (m0.b(sVar2)) {
                                            aVar5 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7957t);
                                            if (aVar5 != null) {
                                                r7.b(new a5.c(262144, aVar5.f7926a));
                                            }
                                            aVar6 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7958u);
                                            if (aVar6 != null) {
                                                r7.b(new a5.c(524288, aVar6.f7926a));
                                            }
                                            aVar7 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7959v);
                                            if (aVar7 != null) {
                                                r7.b(new a5.c(1048576, aVar7.f7926a));
                                            }
                                            oVarN = sVar2.n();
                                            zVar4 = j3.n.f7961x;
                                            if (oVarN.A.c(zVar4)) {
                                                list2 = (List) sVar2.n().e(zVar4);
                                                size2 = list2.size();
                                                vVar = f0.f2655n0;
                                                if (size2 < vVar.f14904b) {
                                                    throw new IllegalStateException(g4.c.g(vVar.f14904b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                u.t0 t0Var6 = new u.t0(0);
                                                u.c0 c0VarA2 = u.n0.a();
                                                t0Var3 = t0Var2;
                                                if (v.a.a(t0Var3.A, t0Var3.C, i16) >= 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    c0Var = (u.c0) t0Var3.c(i16);
                                                    iArr = vVar.f14903a;
                                                    i17 = vVar.f14904b;
                                                    iArr2 = new int[16];
                                                    i18 = 0;
                                                    i19 = 0;
                                                    while (i18 < i17) {
                                                        int i410 = iArr[i18];
                                                        int i52 = i17;
                                                        i20 = i19 + 1;
                                                        u.c0 c0Var4 = c0Var;
                                                        if (iArr2.length < i20) {
                                                            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, Math.max(i20, (iArr2.length * 3) / 2));
                                                            kotlin.jvm.internal.m.d(iArrCopyOf2, "copyOf(...)");
                                                            iArr2 = iArrCopyOf2;
                                                        }
                                                        iArr2[i19] = i410;
                                                        i18++;
                                                        i19 = i20;
                                                        i17 = i52;
                                                        c0Var = c0Var4;
                                                    }
                                                    c0Var2 = c0Var;
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        a1.b.x(list2.get(0));
                                                        kotlin.jvm.internal.m.b(c0Var2);
                                                        throw th2;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        a1.b.x(arrayList2.get(0));
                                                        if (i19 > 0) {
                                                            int i53 = iArr2[0];
                                                            throw th2;
                                                        }
                                                        v.a.d("Index must be between 0 and size");
                                                        throw th2;
                                                    }
                                                } else if (list2.size() > 0) {
                                                    a1.b.x(list2.get(0));
                                                    vVar.c(0);
                                                    throw th2;
                                                }
                                                r13.R.e(i16, t0Var6);
                                                t0Var3.e(i16, c0VarA2);
                                            }
                                        }
                                        r10.setScreenReaderFocusable(m0.d(sVar2, resources4));
                                        iD = r13.f2657b0.d(i16, -1);
                                        if (iD != -1) {
                                            jVarV2 = m0.v(zVar7.getAndroidViewsHandler$ui(), iD);
                                            if (jVarV2 != null) {
                                                r10.setTraversalBefore(jVarV2);
                                                zVar3 = zVar7;
                                            } else {
                                                zVar3 = zVar7;
                                                r10.setTraversalBefore(zVar3, iD);
                                            }
                                            ?? r21 = th2;
                                            r13.j(i16, r7, r13.f2659d0, r21);
                                            r14 = r21;
                                        } else {
                                            r14 = th2;
                                            zVar3 = zVar7;
                                        }
                                        iD2 = r13.f2658c0.d(i16, -1);
                                        if (iD2 != -1) {
                                            r10.setTraversalAfter(jVarV);
                                            r13.j(i16, r7, r13.f2660e0, r14);
                                        }
                                        str2 = (String) j3.v.f(sVar2.n(), j3.x.f8003b);
                                        if (str2 != null) {
                                            r7.g(str2);
                                        }
                                        r15 = r7;
                                        r18 = r13;
                                    }
                                }
                            }
                            th2 = null;
                            if (i10 == -1) {
                                parentForAccessibility = zVar7.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    r17 = (View) parentForAccessibility;
                                } else {
                                    r17 = th2;
                                }
                                gVar.f188b = -1;
                                Obtain.setParent(r17);
                            } else {
                                sVarL = sVar5.l();
                                if (sVarL != null) {
                                    ValueOf = Integer.valueOf(sVarL.f7970f);
                                } else {
                                    ValueOf = th2;
                                }
                                if (ValueOf != 0) {
                                    y2.a.d("semanticsNode " + i10 + " has null parent");
                                    throw new KotlinNothingValueException();
                                }
                                iIntValue = ValueOf.intValue();
                                if (iIntValue == zVar7.getSemanticsOwner().a().f7970f) {
                                    iIntValue = -1;
                                }
                                gVar.f188b = iIntValue;
                                Obtain.setParent(zVar7, iIntValue);
                            }
                            gVar.f189c = i10;
                            Obtain.setSource(zVar7, i10);
                            Obtain.setBoundsInScreen(f0Var2.k(tVar2));
                            uVar = f0Var2.f2665j0;
                            t0Var = f0Var2.S;
                            resources = zVar7.getContext().getResources();
                            gVar.g("android.view.View");
                            oVar = sVar5.f7968d;
                            i0Var = oVar.A;
                            if (i0Var.c(j3.w.G)) {
                                gVar.g("android.widget.EditText");
                            }
                            if (i0Var.c(j3.w.C)) {
                                gVar.g("android.widget.TextView");
                            }
                            objG = i0Var.g(j3.w.f8001z);
                            if (objG == null) {
                                objG = th2;
                            }
                            kVar = (j3.k) objG;
                            if (kVar != null) {
                                i40 = kVar.f7937a;
                                if (sVar5.o()) {
                                    accessibilityManager = accessibilityManager2;
                                    i41 = 4;
                                    t0Var2 = t0Var;
                                    if (j3.s.j(4, sVar5).isEmpty()) {
                                    }
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    i41 = 4;
                                    t0Var2 = t0Var;
                                }
                                if (i40 == i41) {
                                    Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131887328));
                                } else if (i40 == 2) {
                                    Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131887327));
                                } else {
                                    strX = m0.x(i40);
                                    if (i40 == 5) {
                                        gVar.g(strX);
                                    } else {
                                        gVar.g(strX);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                t0Var2 = t0Var;
                            }
                            Obtain.setPackageName(zVar7.getContext().getPackageName());
                            Obtain.setImportantForAccessibility(j3.v.h(sVar5));
                            if (i11 >= 34) {
                                zJ = a5.b.j(accessibilityManager);
                            } else {
                                zJ = true;
                            }
                            listJ = j3.s.j(4, sVar5);
                            size = listJ.size();
                            z10 = zJ;
                            i13 = 0;
                            i14 = 0;
                            while (true) {
                                r10 = gVar.f187a;
                                if (i14 < size) {
                                    int i411 = size;
                                    sVar3 = (j3.s) listJ.get(i14);
                                    List list6 = listJ;
                                    lVarS = f0Var2.s();
                                    int i412 = i14;
                                    i39 = sVar3.f7970f;
                                    if (lVarS.a(i39)) {
                                        jVar2 = zVar7.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(sVar3.f7967c);
                                        if (i39 != -1) {
                                            if (jVar2 != null) {
                                                Obtain.addChild(jVar2);
                                            } else {
                                                tVar = (j3.t) f0Var2.s().b(i39);
                                                if (tVar != null) {
                                                    zA2 = false;
                                                } else {
                                                    zA2 = false;
                                                }
                                                if (z10) {
                                                    r10.addChild(zVar7, i39);
                                                } else {
                                                    r10.addChild(zVar7, i39);
                                                }
                                            }
                                            uVar.f(i39, i13);
                                            i13++;
                                        }
                                    }
                                    i14 = i412 + 1;
                                    listJ = list6;
                                    size = i411;
                                } else {
                                    if (i10 == f0Var2.K) {
                                        r10.setAccessibilityFocused(true);
                                        gVar.b(a5.c.f173g);
                                    } else {
                                        r10.setAccessibilityFocused(false);
                                        gVar.b(a5.c.f172f);
                                    }
                                    hVarP = m0.p(sVar5);
                                    if (hVarP != null) {
                                        zVar7.getFontFamilyResolver();
                                        density = zVar7.getDensity();
                                        p1Var = f0Var2.f2661f0;
                                        String str4 = hVarP.B;
                                        list4 = hVarP.A;
                                        spannableString = new SpannableString(str4);
                                        arrayList3 = hVarP.C;
                                        if (arrayList3 != null) {
                                            size8 = arrayList3.size();
                                            i32 = 0;
                                            Obtain = Obtain;
                                            while (i32 < size8) {
                                                int i413 = size8;
                                                m3.f fVar8 = (m3.f) arrayList3.get(i32);
                                                int i414 = i32;
                                                m3.i0 i0Var6 = (m3.i0) fVar8.f10423a;
                                                ArrayList arrayList7 = arrayList3;
                                                i33 = fVar8.f10424b;
                                                i34 = fVar8.f10425c;
                                                j3.s sVar7 = sVar5;
                                                j3.k kVar5 = kVar;
                                                jA = i0Var6.f10457a.a();
                                                j3.o oVar8 = oVar;
                                                Resources resources5 = resources;
                                                long j11 = i0Var6.f10458b;
                                                uVar2 = i0Var6.f10459c;
                                                oVar6 = i0Var6.f10460d;
                                                pVar = i0Var6.f10466j;
                                                t3.b bVar2 = i0Var6.f10467k;
                                                u.i0 i0Var7 = i0Var;
                                                ?? r43 = Obtain;
                                                j9 = i0Var6.l;
                                                lVar3 = i0Var6.m;
                                                cVar3 = i0Var6.f10457a;
                                                a5.g gVar5 = gVar;
                                                if (!i2.t.c(jA, cVar3.a())) {
                                                    if (jA != 16) {
                                                        cVar3 = new x3.c(jA);
                                                    } else {
                                                        cVar3 = x3.n.f16422a;
                                                    }
                                                }
                                                rd.a.b0(spannableString, cVar3.a(), i33, i34);
                                                spannableString3 = spannableString;
                                                rd.a.c0(spannableString3, j11, density, i33, i34);
                                                if (uVar2 == null) {
                                                    if (uVar2 == null) {
                                                        uVar3 = q3.u.J;
                                                    } else {
                                                        uVar3 = uVar2;
                                                    }
                                                    if (oVar6 != null) {
                                                        i35 = oVar6.f12746a;
                                                    } else {
                                                        i35 = 0;
                                                    }
                                                    if (uVar3.compareTo(q3.u.D) >= 0) {
                                                        z27 = true;
                                                    } else {
                                                        z27 = false;
                                                    }
                                                    if (i35 == 1) {
                                                        z28 = true;
                                                    } else {
                                                        z28 = false;
                                                    }
                                                    if (!z28) {
                                                        if (z27) {
                                                            i36 = 1;
                                                        } else if (z28) {
                                                            i36 = 2;
                                                        } else {
                                                            i36 = 0;
                                                        }
                                                    } else if (z27) {
                                                        i36 = 1;
                                                    } else if (z28) {
                                                        i36 = 2;
                                                    } else {
                                                        i36 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(i36);
                                                    i37 = 33;
                                                    spannableString3.setSpan(styleSpan2, i33, i34, 33);
                                                } else {
                                                    if (uVar2 == null) {
                                                        uVar3 = q3.u.J;
                                                    } else {
                                                        uVar3 = uVar2;
                                                    }
                                                    if (oVar6 != null) {
                                                        i35 = oVar6.f12746a;
                                                    } else {
                                                        i35 = 0;
                                                    }
                                                    if (uVar3.compareTo(q3.u.D) >= 0) {
                                                        z27 = true;
                                                    } else {
                                                        z27 = false;
                                                    }
                                                    if (i35 == 1) {
                                                        z28 = true;
                                                    } else {
                                                        z28 = false;
                                                    }
                                                    if (!z28) {
                                                        if (z27) {
                                                            i36 = 1;
                                                        } else if (z28) {
                                                            i36 = 2;
                                                        } else {
                                                            i36 = 0;
                                                        }
                                                    } else if (z27) {
                                                        i36 = 1;
                                                    } else if (z28) {
                                                        i36 = 2;
                                                    } else {
                                                        i36 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(i36);
                                                    i37 = 33;
                                                    spannableString3.setSpan(styleSpan3, i33, i34, 33);
                                                }
                                                if (lVar3 != null) {
                                                    i38 = lVar3.f16420a;
                                                    if ((i38 | 1) == i38) {
                                                        spannableString3.setSpan(new UnderlineSpan(), i33, i34, i37);
                                                    }
                                                    if ((i38 | 2) == i38) {
                                                        spannableString3.setSpan(new StrikethroughSpan(), i33, i34, i37);
                                                    }
                                                }
                                                if (pVar != null) {
                                                    spannableString3.setSpan(new ScaleXSpan(pVar.f16424a), i33, i34, i37);
                                                }
                                                rd.a.d0(spannableString3, bVar2, i33, i34);
                                                if (j9 != 16) {
                                                    spannableString3.setSpan(new BackgroundColorSpan(i2.b0.C(j9)), i33, i34, i37);
                                                }
                                                i32 = i414 + 1;
                                                spannableString = spannableString3;
                                                size8 = i413;
                                                arrayList3 = arrayList7;
                                                sVar5 = sVar7;
                                                kVar = kVar5;
                                                oVar = oVar8;
                                                resources = resources5;
                                                Obtain = r43;
                                                i0Var = i0Var7;
                                                gVar = gVar5;
                                            }
                                        }
                                        sVar = sVar5;
                                        kVar2 = kVar;
                                        i0Var2 = i0Var;
                                        r41 = Obtain;
                                        a5.g gVar6 = gVar;
                                        spannableString2 = spannableString;
                                        oVar2 = oVar;
                                        resources2 = resources;
                                        int length3 = str4.length();
                                        arrayList4 = h00.x.A;
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            while (i31 < size7) {
                                                Object obj4 = list4.get(i31);
                                                fVar3 = (m3.f) obj4;
                                                if (!(fVar3.f10423a instanceof m3.t0)) {
                                                }
                                            }
                                        } else {
                                            arrayList5 = arrayList4;
                                        }
                                        size3 = arrayList5.size();
                                        while (i23 < size3) {
                                            m3.f fVar9 = (m3.f) arrayList5.get(i23);
                                            t0Var4 = (m3.t0) fVar9.f10423a;
                                            i29 = fVar9.f10424b;
                                            i30 = fVar9.f10425c;
                                            if (t0Var4 instanceof m3.t0) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(t0Var4.f10536a).build(), i29, i30, 33);
                                        }
                                        int length4 = str4.length();
                                        if (list4 != null) {
                                            arrayList4 = new ArrayList(list4.size());
                                            size6 = list4.size();
                                            while (i28 < size6) {
                                                Object obj5 = list4.get(i28);
                                                fVar2 = (m3.f) obj5;
                                                if (!(fVar2.f10423a instanceof m3.s0)) {
                                                }
                                            }
                                        }
                                        size4 = arrayList4.size();
                                        while (i24 < size4) {
                                            m3.f fVar10 = (m3.f) arrayList4.get(i24);
                                            s0Var = (m3.s0) fVar10.f10423a;
                                            int i415 = fVar10.f10424b;
                                            int i416 = fVar10.f10425c;
                                            weakHashMap2 = (WeakHashMap) p1Var.B;
                                            uRLSpan = weakHashMap2.get(s0Var);
                                            if (uRLSpan == null) {
                                                uRLSpan = new URLSpan(s0Var.f10532a);
                                                weakHashMap2.put(s0Var, uRLSpan);
                                            }
                                            spannableString2.setSpan((URLSpan) uRLSpan, i415, i416, 33);
                                        }
                                        listA = hVarP.a(str4.length());
                                        size5 = listA.size();
                                        while (i25 < size5) {
                                            fVar = (m3.f) listA.get(i25);
                                            i26 = fVar.f10424b;
                                            obj = fVar.f10423a;
                                            i27 = fVar.f10425c;
                                            if (i26 != i27) {
                                                oVar5 = (m3.o) obj;
                                                if (oVar5 instanceof m3.n) {
                                                    weakHashMap = (WeakHashMap) p1Var.D;
                                                    eVar = weakHashMap.get(fVar);
                                                    if (eVar == null) {
                                                        eVar = new u3.e(oVar5);
                                                        weakHashMap.put(fVar, eVar);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) eVar, i26, i27, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) p1Var.D;
                                                    eVar = weakHashMap.get(fVar);
                                                    if (eVar == null) {
                                                        eVar = new u3.e(oVar5);
                                                        weakHashMap.put(fVar, eVar);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) eVar, i26, i27, 33);
                                                }
                                            }
                                        }
                                        r7 = gVar6;
                                        r4 = (SpannableString) f0.P(spannableString2);
                                    } else {
                                        uVar = uVar;
                                        sVar = sVar5;
                                        kVar2 = kVar;
                                        i0Var2 = i0Var;
                                        r41 = Obtain;
                                        oVar2 = oVar;
                                        resources2 = resources;
                                        r4 = th2;
                                        r7 = gVar;
                                    }
                                    r7.k(r4);
                                    zVar = j3.w.O;
                                    i0Var3 = i0Var2;
                                    if (i0Var3.c(zVar)) {
                                        ?? r110 = r41;
                                        r110.setContentInvalid(true);
                                        objG20 = i0Var3.g(zVar);
                                        if (objG20 == null) {
                                            objG20 = th2;
                                        }
                                        r10.setError((CharSequence) objG20);
                                        r11 = r110;
                                    } else {
                                        r11 = r41;
                                    }
                                    sVar2 = sVar;
                                    Resources resources6 = resources2;
                                    r10.setStateDescription(m0.o(sVar2, resources6));
                                    r10.setCheckable(m0.n(sVar2));
                                    objG2 = i0Var3.g(j3.w.L);
                                    if (objG2 == null) {
                                        objG2 = th2;
                                    }
                                    aVar = (l3.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == l3.a.A) {
                                            r10.setChecked(true);
                                        } else if (aVar == l3.a.B) {
                                            r10.setChecked(false);
                                        }
                                    }
                                    objG3 = i0Var3.g(j3.w.K);
                                    if (objG3 == null) {
                                        objG3 = th2;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (kVar2 == null) {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                        } else {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                            if (kVar3.f7937a == 4) {
                                                r11.setSelected(zBooleanValue2);
                                            }
                                        }
                                        r10.setChecked(zBooleanValue2);
                                    } else {
                                        kVar3 = kVar2;
                                        i15 = 4;
                                    }
                                    oVar3 = oVar2;
                                    if (oVar3.C) {
                                        objG4 = i0Var3.g(j3.w.f7978a);
                                        if (objG4 == null) {
                                            objG4 = th2;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r12 = (String) h00.q.N0(list);
                                        } else {
                                            r12 = th2;
                                        }
                                        r10.setContentDescription(r12);
                                    } else {
                                        objG4 = i0Var3.g(j3.w.f7978a);
                                        if (objG4 == null) {
                                            objG4 = th2;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r12 = (String) h00.q.N0(list);
                                        } else {
                                            r12 = th2;
                                        }
                                        r10.setContentDescription(r12);
                                    }
                                    objG5 = i0Var3.g(j3.w.A);
                                    if (objG5 == null) {
                                        objG5 = th2;
                                    }
                                    str = (String) objG5;
                                    if (str != null) {
                                        sVarL3 = sVar2;
                                        while (true) {
                                            if (sVarL3 != null) {
                                                oVar4 = sVarL3.f7968d;
                                                zVar6 = j3.x.f8002a;
                                                if (oVar4.A.c(zVar6)) {
                                                    zBooleanValue = ((Boolean) oVar4.e(zVar6)).booleanValue();
                                                } else {
                                                    sVarL3 = sVarL3.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            r11.setViewIdResourceName(str);
                                        }
                                    }
                                    objG6 = i0Var3.g(j3.w.f7985h);
                                    if (objG6 == null) {
                                        objG6 = th2;
                                    }
                                    if (((g00.b0) objG6) != null) {
                                        r10.setHeading(true);
                                    }
                                    objG7 = i0Var3.g(j3.w.f7986i);
                                    if (objG7 == null) {
                                        objG7 = th2;
                                    }
                                    if (((g00.b0) objG7) != null) {
                                        r11.setTextEntryKey(true);
                                    }
                                    i16 = i10;
                                    if (i16 != -1) {
                                        iD3 = uVar.d(sVar2.f7970f, -1);
                                        if (iD3 != -1) {
                                            r11.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    r11.setPassword(i0Var3.c(j3.w.N));
                                    objG8 = i0Var3.g(j3.w.Q);
                                    if (objG8 == null) {
                                        objG8 = th2;
                                    }
                                    bool2 = Boolean.TRUE;
                                    r11.setEditable(kotlin.jvm.internal.m.a(objG8, bool2));
                                    objG9 = i0Var3.g(j3.w.R);
                                    if (objG9 == null) {
                                        objG9 = th2;
                                    }
                                    num = (Integer) objG9;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    r10.setMaxTextLength(iIntValue2);
                                    r10.setEnabled(m0.b(sVar2));
                                    zVar2 = j3.w.l;
                                    r10.setFocusable(i0Var3.c(zVar2));
                                    if (r11.isFocusable()) {
                                        r10.setFocused(((Boolean) oVar3.e(zVar2)).booleanValue());
                                        if (r11.isFocused()) {
                                            r7.a(2);
                                            f0 f0Var4 = f0Var2;
                                            f0Var4.L = i16;
                                            f0Var = f0Var4;
                                        } else {
                                            r13 = f0Var2;
                                            z11 = true;
                                            r7.a(1);
                                        }
                                        r10.setVisibleToUser(j3.v.g(sVar2) ^ z11);
                                        if (sVar2.o()) {
                                            sVarL2 = sVar2.l();
                                            kotlin.jvm.internal.m.b(sVarL2);
                                        } else {
                                            sVarL2 = sVar2;
                                        }
                                        if (sVarL2.m().g()) {
                                            r10.setVisibleToUser(false);
                                        }
                                        objG10 = i0Var3.g(j3.w.f7988k);
                                        if (objG10 == null) {
                                            objG10 = th2;
                                        }
                                        hVar = (j3.h) objG10;
                                        if (hVar != null) {
                                            i21 = hVar.f7933a;
                                            if (i21 == 0) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            if (z25) {
                                                if (i21 == 1) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                if (z26) {
                                                    i22 = 2;
                                                } else {
                                                    i22 = 1;
                                                }
                                            } else {
                                                i22 = 1;
                                            }
                                            r11.setLiveRegion(i22);
                                        }
                                        r10.setClickable(false);
                                        objG11 = i0Var3.g(j3.n.f7941b);
                                        if (objG11 == null) {
                                            objG11 = th2;
                                        }
                                        aVar2 = (j3.a) objG11;
                                        if (aVar2 != null) {
                                            objG19 = i0Var3.g(j3.w.K);
                                            if (objG19 == null) {
                                                objG19 = th2;
                                            }
                                            boolean zA6 = kotlin.jvm.internal.m.a(objG19, bool2);
                                            if (kVar3 == null) {
                                                z21 = false;
                                            } else {
                                                z21 = true;
                                            }
                                            if (z21) {
                                                z22 = true;
                                            } else {
                                                if (kVar3 == null) {
                                                    z24 = false;
                                                } else {
                                                    z24 = true;
                                                }
                                                if (z24) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                            }
                                            if (z22) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            r10.setClickable(z23);
                                            if (m0.b(sVar2)) {
                                                r7.b(new a5.c(16, aVar2.f7926a));
                                            }
                                        }
                                        r10.setLongClickable(false);
                                        objG12 = i0Var3.g(j3.n.f7942c);
                                        if (objG12 == null) {
                                            objG12 = th2;
                                        }
                                        aVar3 = (j3.a) objG12;
                                        if (aVar3 != null) {
                                            r10.setLongClickable(true);
                                            if (m0.b(sVar2)) {
                                                r7.b(new a5.c(32, aVar3.f7926a));
                                            }
                                        }
                                        aVar4 = (j3.a) j3.v.f(oVar3, j3.n.f7954q);
                                        if (aVar4 != null) {
                                            r7.b(new a5.c(16384, aVar4.f7926a));
                                        }
                                        if (m0.b(sVar2)) {
                                            aVar11 = (j3.a) j3.v.f(oVar3, j3.n.f7950k);
                                            if (aVar11 != null) {
                                                r7.b(new a5.c(2097152, aVar11.f7926a));
                                            }
                                            aVar12 = (j3.a) j3.v.f(oVar3, j3.n.f7953p);
                                            if (aVar12 != null) {
                                                r7.b(new a5.c(R.id.accessibilityActionImeEnter, aVar12.f7926a));
                                            }
                                            aVar13 = (j3.a) j3.v.f(oVar3, j3.n.f7955r);
                                            if (aVar13 != null) {
                                                r7.b(new a5.c(Cast.MAX_MESSAGE_LENGTH, aVar13.f7926a));
                                            }
                                            aVar14 = (j3.a) j3.v.f(oVar3, j3.n.f7956s);
                                            if (aVar14 != null) {
                                                primaryClipDescription = zVar7.getClipboardManager().a().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r7.b(new a5.c(32768, aVar14.f7926a));
                                                }
                                            }
                                        }
                                        strT = f0.t(sVar2);
                                        if (strT != null) {
                                            z12 = true;
                                        } else {
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            r11.setTextSelection(r13.r(sVar2), r13.q(sVar2));
                                            aVar10 = (j3.a) j3.v.f(oVar3, j3.n.f7949j);
                                            if (aVar10 != null) {
                                                r16 = aVar10.f7926a;
                                            } else {
                                                r16 = th2;
                                            }
                                            r7.b(new a5.c(131072, (String) r16));
                                            r7.a(256);
                                            r7.a(512);
                                            r10.setMovementGranularities(11);
                                            list3 = (List) j3.v.f(oVar3, j3.w.f7978a);
                                            if (list3 != null) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            if (z19) {
                                                z20 = true;
                                                if (sVar2.f7968d.A.c(j3.w.G)) {
                                                    objG18 = sVar2.f7968d.A.g(j3.w.l);
                                                    if (objG18 == null) {
                                                        objG18 = null;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(objG18, Boolean.TRUE)) {
                                                        l0VarX = sVar2.f7967c.x();
                                                        while (true) {
                                                            if (l0VarX == null) {
                                                                l0VarX = null;
                                                            } else {
                                                                oVarZ2 = l0VarX.z();
                                                                if (oVarZ2 == null) {
                                                                }
                                                                l0VarX = l0VarX.x();
                                                            }
                                                        }
                                                        if (l0VarX == null) {
                                                            z20 = false;
                                                        } else {
                                                            oVarZ = l0VarX.z();
                                                            if (oVarZ != null) {
                                                                Object objG27 = oVarZ.A.g(j3.w.l);
                                                                zA = kotlin.jvm.internal.m.a(objG27 != null ? objG27 : null, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                                z20 = false;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    l0VarX = sVar2.f7967c.x();
                                                    while (true) {
                                                        if (l0VarX == null) {
                                                            l0VarX = null;
                                                        } else {
                                                            oVarZ2 = l0VarX.z();
                                                            if (oVarZ2 == null) {
                                                            }
                                                            l0VarX = l0VarX.x();
                                                        }
                                                    }
                                                    if (l0VarX == null) {
                                                        z20 = false;
                                                    } else {
                                                        oVarZ = l0VarX.z();
                                                        if (oVarZ != null) {
                                                            Object objG28 = oVarZ.A.g(j3.w.l);
                                                            zA = kotlin.jvm.internal.m.a(objG28 != null ? objG28 : null, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                            z20 = false;
                                                        }
                                                    }
                                                }
                                                if (!z20) {
                                                    r10.setMovementGranularities(r11.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        charSequenceF = r7.f();
                                        if (charSequenceF != null) {
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                        }
                                        if (!z13) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (i0Var3.c(j3.w.A)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (i0Var3.c(j3.w.S)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        r11.setAvailableExtraData(arrayList);
                                        jVar = (j3.j) j3.v.f(oVar3, j3.w.f7980c);
                                        if (jVar != null) {
                                            f3 = jVar.f7935a;
                                            aVar9 = jVar.f7936b;
                                            zVar5 = j3.n.f7948i;
                                            if (i0Var3.c(zVar5)) {
                                                r7.g("android.widget.SeekBar");
                                            } else {
                                                r7.g("android.widget.ProgressBar");
                                            }
                                            if (jVar != j3.j.f7934c) {
                                                r11.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, aVar9.A, aVar9.B, f3));
                                            }
                                            if (sVar2.n().A.c(zVar5)) {
                                                fFloatValue = ((Number) aVar9.c()).floatValue();
                                                fFloatValue2 = ((Number) aVar9.a()).floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                if (f3 < fFloatValue) {
                                                    r7.b(a5.c.f174h);
                                                }
                                                fFloatValue3 = ((Number) aVar9.a()).floatValue();
                                                fFloatValue4 = ((Number) aVar9.c()).floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                if (f3 > fFloatValue3) {
                                                    r7.b(a5.c.f175i);
                                                }
                                            }
                                        }
                                        if (m0.b(sVar2)) {
                                            objG17 = sVar2.f7968d.A.g(j3.n.f7948i);
                                            if (objG17 == null) {
                                                objG17 = null;
                                            }
                                            aVar8 = (j3.a) objG17;
                                            if (aVar8 != null) {
                                                r7.b(new a5.c(R.id.accessibilityActionSetProgress, aVar8.f7926a));
                                            }
                                        }
                                        ta.c0.U(r7, sVar2);
                                        ta.c0.V(r7, sVar2);
                                        lVar = (j3.l) j3.v.f(sVar2.n(), j3.w.f7997v);
                                        j3.a aVar17 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7943d);
                                        if (lVar != null) {
                                            objG15 = sVar2.k().A.g(j3.w.f7983f);
                                            if (objG15 == null) {
                                                objG15 = th2;
                                            }
                                            if (objG15 == null) {
                                                objG16 = sVar2.k().A.g(j3.w.f7982e);
                                                if (objG16 == null) {
                                                    objG16 = th2;
                                                }
                                                if (objG16 != null) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                            } else {
                                                z16 = true;
                                            }
                                            if (!z16) {
                                                r7.g("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) lVar.f7939b.invoke()).floatValue() > 0.0f) {
                                                r7.j(true);
                                            }
                                            if (m0.b(sVar2)) {
                                                if (f0.z(lVar)) {
                                                    r7.b(a5.c.f174h);
                                                    l0Var = l0Var2;
                                                    if (l0Var.f2053a0 == y3.m.B) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (z18) {
                                                        cVar2 = a5.c.f181q;
                                                    } else {
                                                        cVar2 = a5.c.f179o;
                                                    }
                                                    r7.b(cVar2);
                                                } else {
                                                    l0Var = l0Var2;
                                                }
                                                if (f0.y(lVar)) {
                                                    r7.b(a5.c.f175i);
                                                    if (l0Var.f2053a0 == y3.m.B) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        cVar = a5.c.f179o;
                                                    } else {
                                                        cVar = a5.c.f181q;
                                                    }
                                                    r7.b(cVar);
                                                }
                                            }
                                        }
                                        lVar2 = (j3.l) j3.v.f(sVar2.n(), j3.w.f7998w);
                                        if (lVar2 != null) {
                                            objG13 = sVar2.k().A.g(j3.w.f7983f);
                                            if (objG13 == null) {
                                                objG13 = th2;
                                            }
                                            if (objG13 == null) {
                                                objG14 = sVar2.k().A.g(j3.w.f7982e);
                                                if (objG14 == null) {
                                                    objG14 = th2;
                                                }
                                                if (objG14 != null) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            } else {
                                                z15 = true;
                                            }
                                            if (!z15) {
                                                r7.g("android.widget.ScrollView");
                                            }
                                            if (((Number) lVar2.f7939b.invoke()).floatValue() > 0.0f) {
                                                r7.j(true);
                                            }
                                            if (m0.b(sVar2)) {
                                                if (f0.z(lVar2)) {
                                                    r7.b(a5.c.f174h);
                                                    r7.b(a5.c.f180p);
                                                }
                                                if (f0.y(lVar2)) {
                                                    r7.b(a5.c.f175i);
                                                    r7.b(a5.c.f178n);
                                                }
                                            }
                                        }
                                        m0.f(r7, sVar2);
                                        r10.setPaneTitle((CharSequence) j3.v.f(sVar2.n(), j3.w.f7981d));
                                        if (m0.b(sVar2)) {
                                            aVar5 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7957t);
                                            if (aVar5 != null) {
                                                r7.b(new a5.c(262144, aVar5.f7926a));
                                            }
                                            aVar6 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7958u);
                                            if (aVar6 != null) {
                                                r7.b(new a5.c(524288, aVar6.f7926a));
                                            }
                                            aVar7 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7959v);
                                            if (aVar7 != null) {
                                                r7.b(new a5.c(1048576, aVar7.f7926a));
                                            }
                                            oVarN = sVar2.n();
                                            zVar4 = j3.n.f7961x;
                                            if (oVarN.A.c(zVar4)) {
                                                list2 = (List) sVar2.n().e(zVar4);
                                                size2 = list2.size();
                                                vVar = f0.f2655n0;
                                                if (size2 < vVar.f14904b) {
                                                    throw new IllegalStateException(g4.c.g(vVar.f14904b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                u.t0 t0Var7 = new u.t0(0);
                                                u.c0 c0VarA3 = u.n0.a();
                                                t0Var3 = t0Var2;
                                                if (v.a.a(t0Var3.A, t0Var3.C, i16) >= 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    c0Var = (u.c0) t0Var3.c(i16);
                                                    iArr = vVar.f14903a;
                                                    i17 = vVar.f14904b;
                                                    iArr2 = new int[16];
                                                    i18 = 0;
                                                    i19 = 0;
                                                    while (i18 < i17) {
                                                        int i417 = iArr[i18];
                                                        int i54 = i17;
                                                        i20 = i19 + 1;
                                                        u.c0 c0Var5 = c0Var;
                                                        if (iArr2.length < i20) {
                                                            int[] iArrCopyOf3 = Arrays.copyOf(iArr2, Math.max(i20, (iArr2.length * 3) / 2));
                                                            kotlin.jvm.internal.m.d(iArrCopyOf3, "copyOf(...)");
                                                            iArr2 = iArrCopyOf3;
                                                        }
                                                        iArr2[i19] = i417;
                                                        i18++;
                                                        i19 = i20;
                                                        i17 = i54;
                                                        c0Var = c0Var5;
                                                    }
                                                    c0Var2 = c0Var;
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        a1.b.x(list2.get(0));
                                                        kotlin.jvm.internal.m.b(c0Var2);
                                                        throw th2;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        a1.b.x(arrayList2.get(0));
                                                        if (i19 > 0) {
                                                            int i55 = iArr2[0];
                                                            throw th2;
                                                        }
                                                        v.a.d("Index must be between 0 and size");
                                                        throw th2;
                                                    }
                                                } else if (list2.size() > 0) {
                                                    a1.b.x(list2.get(0));
                                                    vVar.c(0);
                                                    throw th2;
                                                }
                                                r13.R.e(i16, t0Var7);
                                                t0Var3.e(i16, c0VarA3);
                                            }
                                        }
                                        r10.setScreenReaderFocusable(m0.d(sVar2, resources6));
                                        iD = r13.f2657b0.d(i16, -1);
                                        if (iD != -1) {
                                            jVarV2 = m0.v(zVar7.getAndroidViewsHandler$ui(), iD);
                                            if (jVarV2 != null) {
                                                r10.setTraversalBefore(jVarV2);
                                                zVar3 = zVar7;
                                            } else {
                                                zVar3 = zVar7;
                                                r10.setTraversalBefore(zVar3, iD);
                                            }
                                            ?? r22 = th2;
                                            r13.j(i16, r7, r13.f2659d0, r22);
                                            r14 = r22;
                                        } else {
                                            r14 = th2;
                                            zVar3 = zVar7;
                                        }
                                        iD2 = r13.f2658c0.d(i16, -1);
                                        if (iD2 != -1) {
                                            r10.setTraversalAfter(jVarV);
                                            r13.j(i16, r7, r13.f2660e0, r14);
                                        }
                                        str2 = (String) j3.v.f(sVar2.n(), j3.x.f8003b);
                                        if (str2 != null) {
                                            r7.g(str2);
                                        }
                                        r15 = r7;
                                        r18 = r13;
                                    } else {
                                        f0Var = f0Var2;
                                    }
                                    z11 = true;
                                    r13 = f0Var;
                                    r10.setVisibleToUser(j3.v.g(sVar2) ^ z11);
                                    if (sVar2.o()) {
                                        sVarL2 = sVar2.l();
                                        kotlin.jvm.internal.m.b(sVarL2);
                                    } else {
                                        sVarL2 = sVar2;
                                    }
                                    if (sVarL2.m().g()) {
                                        r10.setVisibleToUser(false);
                                    }
                                    objG10 = i0Var3.g(j3.w.f7988k);
                                    if (objG10 == null) {
                                        objG10 = th2;
                                    }
                                    hVar = (j3.h) objG10;
                                    if (hVar != null) {
                                        i21 = hVar.f7933a;
                                        if (i21 == 0) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        if (z25) {
                                            if (i21 == 1) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                            if (z26) {
                                                i22 = 2;
                                            } else {
                                                i22 = 1;
                                            }
                                        } else {
                                            i22 = 1;
                                        }
                                        r11.setLiveRegion(i22);
                                    }
                                    r10.setClickable(false);
                                    objG11 = i0Var3.g(j3.n.f7941b);
                                    if (objG11 == null) {
                                        objG11 = th2;
                                    }
                                    aVar2 = (j3.a) objG11;
                                    if (aVar2 != null) {
                                        objG19 = i0Var3.g(j3.w.K);
                                        if (objG19 == null) {
                                            objG19 = th2;
                                        }
                                        boolean zA7 = kotlin.jvm.internal.m.a(objG19, bool2);
                                        if (kVar3 == null) {
                                            z21 = false;
                                        } else {
                                            z21 = true;
                                        }
                                        if (z21) {
                                            z22 = true;
                                        } else {
                                            if (kVar3 == null) {
                                                z24 = false;
                                            } else {
                                                z24 = true;
                                            }
                                            if (z24) {
                                                z22 = true;
                                            } else {
                                                z22 = false;
                                            }
                                        }
                                        if (z22) {
                                            z23 = true;
                                        } else {
                                            z23 = true;
                                        }
                                        r10.setClickable(z23);
                                        if (m0.b(sVar2)) {
                                            r7.b(new a5.c(16, aVar2.f7926a));
                                        }
                                    }
                                    r10.setLongClickable(false);
                                    objG12 = i0Var3.g(j3.n.f7942c);
                                    if (objG12 == null) {
                                        objG12 = th2;
                                    }
                                    aVar3 = (j3.a) objG12;
                                    if (aVar3 != null) {
                                        r10.setLongClickable(true);
                                        if (m0.b(sVar2)) {
                                            r7.b(new a5.c(32, aVar3.f7926a));
                                        }
                                    }
                                    aVar4 = (j3.a) j3.v.f(oVar3, j3.n.f7954q);
                                    if (aVar4 != null) {
                                        r7.b(new a5.c(16384, aVar4.f7926a));
                                    }
                                    if (m0.b(sVar2)) {
                                        aVar11 = (j3.a) j3.v.f(oVar3, j3.n.f7950k);
                                        if (aVar11 != null) {
                                            r7.b(new a5.c(2097152, aVar11.f7926a));
                                        }
                                        aVar12 = (j3.a) j3.v.f(oVar3, j3.n.f7953p);
                                        if (aVar12 != null) {
                                            r7.b(new a5.c(R.id.accessibilityActionImeEnter, aVar12.f7926a));
                                        }
                                        aVar13 = (j3.a) j3.v.f(oVar3, j3.n.f7955r);
                                        if (aVar13 != null) {
                                            r7.b(new a5.c(Cast.MAX_MESSAGE_LENGTH, aVar13.f7926a));
                                        }
                                        aVar14 = (j3.a) j3.v.f(oVar3, j3.n.f7956s);
                                        if (aVar14 != null) {
                                            primaryClipDescription = zVar7.getClipboardManager().a().getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                r7.b(new a5.c(32768, aVar14.f7926a));
                                            }
                                        }
                                    }
                                    strT = f0.t(sVar2);
                                    if (strT != null) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        r11.setTextSelection(r13.r(sVar2), r13.q(sVar2));
                                        aVar10 = (j3.a) j3.v.f(oVar3, j3.n.f7949j);
                                        if (aVar10 != null) {
                                            r16 = aVar10.f7926a;
                                        } else {
                                            r16 = th2;
                                        }
                                        r7.b(new a5.c(131072, (String) r16));
                                        r7.a(256);
                                        r7.a(512);
                                        r10.setMovementGranularities(11);
                                        list3 = (List) j3.v.f(oVar3, j3.w.f7978a);
                                        if (list3 != null) {
                                            z19 = true;
                                        } else {
                                            z19 = true;
                                        }
                                        if (z19) {
                                            z20 = true;
                                            if (sVar2.f7968d.A.c(j3.w.G)) {
                                                objG18 = sVar2.f7968d.A.g(j3.w.l);
                                                if (objG18 == null) {
                                                    objG18 = null;
                                                }
                                                if (kotlin.jvm.internal.m.a(objG18, Boolean.TRUE)) {
                                                    l0VarX = sVar2.f7967c.x();
                                                    while (true) {
                                                        if (l0VarX == null) {
                                                            l0VarX = null;
                                                        } else {
                                                            oVarZ2 = l0VarX.z();
                                                            if (oVarZ2 == null) {
                                                            }
                                                            l0VarX = l0VarX.x();
                                                        }
                                                    }
                                                    if (l0VarX == null) {
                                                        z20 = false;
                                                    } else {
                                                        oVarZ = l0VarX.z();
                                                        if (oVarZ != null) {
                                                            Object objG29 = oVarZ.A.g(j3.w.l);
                                                            zA = kotlin.jvm.internal.m.a(objG29 != null ? objG29 : null, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                            z20 = false;
                                                        }
                                                    }
                                                }
                                            } else {
                                                l0VarX = sVar2.f7967c.x();
                                                while (true) {
                                                    if (l0VarX == null) {
                                                        l0VarX = null;
                                                    } else {
                                                        oVarZ2 = l0VarX.z();
                                                        if (oVarZ2 == null) {
                                                        }
                                                        l0VarX = l0VarX.x();
                                                    }
                                                }
                                                if (l0VarX == null) {
                                                    z20 = false;
                                                } else {
                                                    oVarZ = l0VarX.z();
                                                    if (oVarZ != null) {
                                                        Object objG210 = oVarZ.A.g(j3.w.l);
                                                        zA = kotlin.jvm.internal.m.a(objG210 != null ? objG210 : null, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                        z20 = false;
                                                    }
                                                }
                                            }
                                            if (!z20) {
                                                r10.setMovementGranularities(r11.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList.add("androidx.compose.ui.semantics.id");
                                    charSequenceF = r7.f();
                                    if (charSequenceF != null) {
                                        z13 = true;
                                    } else {
                                        z13 = true;
                                    }
                                    if (!z13) {
                                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (i0Var3.c(j3.w.A)) {
                                        arrayList.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (i0Var3.c(j3.w.S)) {
                                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                    }
                                    r11.setAvailableExtraData(arrayList);
                                    jVar = (j3.j) j3.v.f(oVar3, j3.w.f7980c);
                                    if (jVar != null) {
                                        f3 = jVar.f7935a;
                                        aVar9 = jVar.f7936b;
                                        zVar5 = j3.n.f7948i;
                                        if (i0Var3.c(zVar5)) {
                                            r7.g("android.widget.SeekBar");
                                        } else {
                                            r7.g("android.widget.ProgressBar");
                                        }
                                        if (jVar != j3.j.f7934c) {
                                            r11.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, aVar9.A, aVar9.B, f3));
                                        }
                                        if (sVar2.n().A.c(zVar5)) {
                                            fFloatValue = ((Number) aVar9.c()).floatValue();
                                            fFloatValue2 = ((Number) aVar9.a()).floatValue();
                                            if (fFloatValue < fFloatValue2) {
                                                fFloatValue = fFloatValue2;
                                            }
                                            if (f3 < fFloatValue) {
                                                r7.b(a5.c.f174h);
                                            }
                                            fFloatValue3 = ((Number) aVar9.a()).floatValue();
                                            fFloatValue4 = ((Number) aVar9.c()).floatValue();
                                            if (fFloatValue3 > fFloatValue4) {
                                                fFloatValue3 = fFloatValue4;
                                            }
                                            if (f3 > fFloatValue3) {
                                                r7.b(a5.c.f175i);
                                            }
                                        }
                                    }
                                    if (m0.b(sVar2)) {
                                        objG17 = sVar2.f7968d.A.g(j3.n.f7948i);
                                        if (objG17 == null) {
                                            objG17 = null;
                                        }
                                        aVar8 = (j3.a) objG17;
                                        if (aVar8 != null) {
                                            r7.b(new a5.c(R.id.accessibilityActionSetProgress, aVar8.f7926a));
                                        }
                                    }
                                    ta.c0.U(r7, sVar2);
                                    ta.c0.V(r7, sVar2);
                                    lVar = (j3.l) j3.v.f(sVar2.n(), j3.w.f7997v);
                                    j3.a aVar18 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7943d);
                                    if (lVar != null) {
                                        objG15 = sVar2.k().A.g(j3.w.f7983f);
                                        if (objG15 == null) {
                                            objG15 = th2;
                                        }
                                        if (objG15 == null) {
                                            objG16 = sVar2.k().A.g(j3.w.f7982e);
                                            if (objG16 == null) {
                                                objG16 = th2;
                                            }
                                            if (objG16 != null) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (!z16) {
                                            r7.g("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) lVar.f7939b.invoke()).floatValue() > 0.0f) {
                                            r7.j(true);
                                        }
                                        if (m0.b(sVar2)) {
                                            if (f0.z(lVar)) {
                                                r7.b(a5.c.f174h);
                                                l0Var = l0Var2;
                                                if (l0Var.f2053a0 == y3.m.B) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    cVar2 = a5.c.f181q;
                                                } else {
                                                    cVar2 = a5.c.f179o;
                                                }
                                                r7.b(cVar2);
                                            } else {
                                                l0Var = l0Var2;
                                            }
                                            if (f0.y(lVar)) {
                                                r7.b(a5.c.f175i);
                                                if (l0Var.f2053a0 == y3.m.B) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    cVar = a5.c.f179o;
                                                } else {
                                                    cVar = a5.c.f181q;
                                                }
                                                r7.b(cVar);
                                            }
                                        }
                                    }
                                    lVar2 = (j3.l) j3.v.f(sVar2.n(), j3.w.f7998w);
                                    if (lVar2 != null) {
                                        objG13 = sVar2.k().A.g(j3.w.f7983f);
                                        if (objG13 == null) {
                                            objG13 = th2;
                                        }
                                        if (objG13 == null) {
                                            objG14 = sVar2.k().A.g(j3.w.f7982e);
                                            if (objG14 == null) {
                                                objG14 = th2;
                                            }
                                            if (objG14 != null) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                        if (!z15) {
                                            r7.g("android.widget.ScrollView");
                                        }
                                        if (((Number) lVar2.f7939b.invoke()).floatValue() > 0.0f) {
                                            r7.j(true);
                                        }
                                        if (m0.b(sVar2)) {
                                            if (f0.z(lVar2)) {
                                                r7.b(a5.c.f174h);
                                                r7.b(a5.c.f180p);
                                            }
                                            if (f0.y(lVar2)) {
                                                r7.b(a5.c.f175i);
                                                r7.b(a5.c.f178n);
                                            }
                                        }
                                    }
                                    m0.f(r7, sVar2);
                                    r10.setPaneTitle((CharSequence) j3.v.f(sVar2.n(), j3.w.f7981d));
                                    if (m0.b(sVar2)) {
                                        aVar5 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7957t);
                                        if (aVar5 != null) {
                                            r7.b(new a5.c(262144, aVar5.f7926a));
                                        }
                                        aVar6 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7958u);
                                        if (aVar6 != null) {
                                            r7.b(new a5.c(524288, aVar6.f7926a));
                                        }
                                        aVar7 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7959v);
                                        if (aVar7 != null) {
                                            r7.b(new a5.c(1048576, aVar7.f7926a));
                                        }
                                        oVarN = sVar2.n();
                                        zVar4 = j3.n.f7961x;
                                        if (oVarN.A.c(zVar4)) {
                                            list2 = (List) sVar2.n().e(zVar4);
                                            size2 = list2.size();
                                            vVar = f0.f2655n0;
                                            if (size2 < vVar.f14904b) {
                                                throw new IllegalStateException(g4.c.g(vVar.f14904b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                            }
                                            u.t0 t0Var8 = new u.t0(0);
                                            u.c0 c0VarA4 = u.n0.a();
                                            t0Var3 = t0Var2;
                                            if (v.a.a(t0Var3.A, t0Var3.C, i16) >= 0) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                c0Var = (u.c0) t0Var3.c(i16);
                                                iArr = vVar.f14903a;
                                                i17 = vVar.f14904b;
                                                iArr2 = new int[16];
                                                i18 = 0;
                                                i19 = 0;
                                                while (i18 < i17) {
                                                    int i418 = iArr[i18];
                                                    int i56 = i17;
                                                    i20 = i19 + 1;
                                                    u.c0 c0Var6 = c0Var;
                                                    if (iArr2.length < i20) {
                                                        int[] iArrCopyOf4 = Arrays.copyOf(iArr2, Math.max(i20, (iArr2.length * 3) / 2));
                                                        kotlin.jvm.internal.m.d(iArrCopyOf4, "copyOf(...)");
                                                        iArr2 = iArrCopyOf4;
                                                    }
                                                    iArr2[i19] = i418;
                                                    i18++;
                                                    i19 = i20;
                                                    i17 = i56;
                                                    c0Var = c0Var6;
                                                }
                                                c0Var2 = c0Var;
                                                arrayList2 = new ArrayList();
                                                if (list2.size() <= 0) {
                                                    a1.b.x(list2.get(0));
                                                    kotlin.jvm.internal.m.b(c0Var2);
                                                    throw th2;
                                                }
                                                if (arrayList2.size() > 0) {
                                                    a1.b.x(arrayList2.get(0));
                                                    if (i19 > 0) {
                                                        int i57 = iArr2[0];
                                                        throw th2;
                                                    }
                                                    v.a.d("Index must be between 0 and size");
                                                    throw th2;
                                                }
                                            } else if (list2.size() > 0) {
                                                a1.b.x(list2.get(0));
                                                vVar.c(0);
                                                throw th2;
                                            }
                                            r13.R.e(i16, t0Var8);
                                            t0Var3.e(i16, c0VarA4);
                                        }
                                    }
                                    r10.setScreenReaderFocusable(m0.d(sVar2, resources6));
                                    iD = r13.f2657b0.d(i16, -1);
                                    if (iD != -1) {
                                        jVarV2 = m0.v(zVar7.getAndroidViewsHandler$ui(), iD);
                                        if (jVarV2 != null) {
                                            r10.setTraversalBefore(jVarV2);
                                            zVar3 = zVar7;
                                        } else {
                                            zVar3 = zVar7;
                                            r10.setTraversalBefore(zVar3, iD);
                                        }
                                        ?? r23 = th2;
                                        r13.j(i16, r7, r13.f2659d0, r23);
                                        r14 = r23;
                                    } else {
                                        r14 = th2;
                                        zVar3 = zVar7;
                                    }
                                    iD2 = r13.f2658c0.d(i16, -1);
                                    if (iD2 != -1) {
                                        r10.setTraversalAfter(jVarV);
                                        r13.j(i16, r7, r13.f2660e0, r14);
                                    }
                                    str2 = (String) j3.v.f(sVar2.n(), j3.x.f8003b);
                                    if (str2 != null) {
                                        r7.g(str2);
                                    }
                                    r15 = r7;
                                    r18 = r13;
                                }
                            }
                        } else if (Build.VERSION.SDK_INT >= 34 ? a5.b.j(accessibilityManager2) : true) {
                            Obtain = AccessibilityNodeInfo.obtain();
                            gVar = new a5.g(Obtain);
                            i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 34) {
                                a5.b.l(Obtain, zA3);
                            } else {
                                extras = Obtain.getExtras();
                                if (extras != null) {
                                    th2 = null;
                                    int i419 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65);
                                    if (zA3) {
                                        i12 = 64;
                                    } else {
                                        i12 = 0;
                                    }
                                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i419 | i12);
                                }
                                if (i10 == -1) {
                                    parentForAccessibility = zVar7.getParentForAccessibility();
                                    if (parentForAccessibility instanceof View) {
                                        r17 = (View) parentForAccessibility;
                                    } else {
                                        r17 = th2;
                                    }
                                    gVar.f188b = -1;
                                    Obtain.setParent(r17);
                                } else {
                                    sVarL = sVar5.l();
                                    if (sVarL != null) {
                                        ValueOf = Integer.valueOf(sVarL.f7970f);
                                    } else {
                                        ValueOf = th2;
                                    }
                                    if (ValueOf != 0) {
                                        y2.a.d("semanticsNode " + i10 + " has null parent");
                                        throw new KotlinNothingValueException();
                                    }
                                    iIntValue = ValueOf.intValue();
                                    if (iIntValue == zVar7.getSemanticsOwner().a().f7970f) {
                                        iIntValue = -1;
                                    }
                                    gVar.f188b = iIntValue;
                                    Obtain.setParent(zVar7, iIntValue);
                                }
                                gVar.f189c = i10;
                                Obtain.setSource(zVar7, i10);
                                Obtain.setBoundsInScreen(f0Var2.k(tVar2));
                                uVar = f0Var2.f2665j0;
                                t0Var = f0Var2.S;
                                resources = zVar7.getContext().getResources();
                                gVar.g("android.view.View");
                                oVar = sVar5.f7968d;
                                i0Var = oVar.A;
                                if (i0Var.c(j3.w.G)) {
                                    gVar.g("android.widget.EditText");
                                }
                                if (i0Var.c(j3.w.C)) {
                                    gVar.g("android.widget.TextView");
                                }
                                objG = i0Var.g(j3.w.f8001z);
                                if (objG == null) {
                                    objG = th2;
                                }
                                kVar = (j3.k) objG;
                                if (kVar != null) {
                                    i40 = kVar.f7937a;
                                    if (sVar5.o()) {
                                        accessibilityManager = accessibilityManager2;
                                        i41 = 4;
                                        t0Var2 = t0Var;
                                    } else {
                                        accessibilityManager = accessibilityManager2;
                                        i41 = 4;
                                        t0Var2 = t0Var;
                                        if (j3.s.j(4, sVar5).isEmpty()) {
                                        }
                                    }
                                    if (i40 == i41) {
                                        Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131887328));
                                    } else if (i40 == 2) {
                                        Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131887327));
                                    } else {
                                        strX = m0.x(i40);
                                        if (i40 == 5) {
                                            gVar.g(strX);
                                        } else {
                                            gVar.g(strX);
                                        }
                                    }
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    t0Var2 = t0Var;
                                }
                                Obtain.setPackageName(zVar7.getContext().getPackageName());
                                Obtain.setImportantForAccessibility(j3.v.h(sVar5));
                                if (i11 >= 34) {
                                    zJ = a5.b.j(accessibilityManager);
                                } else {
                                    zJ = true;
                                }
                                listJ = j3.s.j(4, sVar5);
                                size = listJ.size();
                                z10 = zJ;
                                i13 = 0;
                                i14 = 0;
                                while (true) {
                                    r10 = gVar.f187a;
                                    if (i14 < size) {
                                        int i4110 = size;
                                        sVar3 = (j3.s) listJ.get(i14);
                                        List list7 = listJ;
                                        lVarS = f0Var2.s();
                                        int i4111 = i14;
                                        i39 = sVar3.f7970f;
                                        if (lVarS.a(i39)) {
                                            jVar2 = zVar7.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(sVar3.f7967c);
                                            if (i39 != -1) {
                                                if (jVar2 != null) {
                                                    Obtain.addChild(jVar2);
                                                } else {
                                                    tVar = (j3.t) f0Var2.s().b(i39);
                                                    if (tVar != null) {
                                                        zA2 = false;
                                                    } else {
                                                        zA2 = false;
                                                    }
                                                    if (z10) {
                                                        r10.addChild(zVar7, i39);
                                                    } else {
                                                        r10.addChild(zVar7, i39);
                                                    }
                                                }
                                                uVar.f(i39, i13);
                                                i13++;
                                            }
                                        }
                                        i14 = i4111 + 1;
                                        listJ = list7;
                                        size = i4110;
                                    } else {
                                        if (i10 == f0Var2.K) {
                                            r10.setAccessibilityFocused(true);
                                            gVar.b(a5.c.f173g);
                                        } else {
                                            r10.setAccessibilityFocused(false);
                                            gVar.b(a5.c.f172f);
                                        }
                                        hVarP = m0.p(sVar5);
                                        if (hVarP != null) {
                                            zVar7.getFontFamilyResolver();
                                            density = zVar7.getDensity();
                                            p1Var = f0Var2.f2661f0;
                                            String str5 = hVarP.B;
                                            list4 = hVarP.A;
                                            spannableString = new SpannableString(str5);
                                            arrayList3 = hVarP.C;
                                            if (arrayList3 != null) {
                                                size8 = arrayList3.size();
                                                i32 = 0;
                                                Obtain = Obtain;
                                                while (i32 < size8) {
                                                    int i4112 = size8;
                                                    m3.f fVar11 = (m3.f) arrayList3.get(i32);
                                                    int i4113 = i32;
                                                    m3.i0 i0Var8 = (m3.i0) fVar11.f10423a;
                                                    ArrayList arrayList8 = arrayList3;
                                                    i33 = fVar11.f10424b;
                                                    i34 = fVar11.f10425c;
                                                    j3.s sVar8 = sVar5;
                                                    j3.k kVar6 = kVar;
                                                    jA = i0Var8.f10457a.a();
                                                    j3.o oVar9 = oVar;
                                                    Resources resources7 = resources;
                                                    long j12 = i0Var8.f10458b;
                                                    uVar2 = i0Var8.f10459c;
                                                    oVar6 = i0Var8.f10460d;
                                                    pVar = i0Var8.f10466j;
                                                    t3.b bVar3 = i0Var8.f10467k;
                                                    u.i0 i0Var9 = i0Var;
                                                    ?? r44 = Obtain;
                                                    j9 = i0Var8.l;
                                                    lVar3 = i0Var8.m;
                                                    cVar3 = i0Var8.f10457a;
                                                    a5.g gVar7 = gVar;
                                                    if (!i2.t.c(jA, cVar3.a())) {
                                                        if (jA != 16) {
                                                            cVar3 = new x3.c(jA);
                                                        } else {
                                                            cVar3 = x3.n.f16422a;
                                                        }
                                                    }
                                                    rd.a.b0(spannableString, cVar3.a(), i33, i34);
                                                    spannableString3 = spannableString;
                                                    rd.a.c0(spannableString3, j12, density, i33, i34);
                                                    if (uVar2 == null) {
                                                        if (uVar2 == null) {
                                                            uVar3 = q3.u.J;
                                                        } else {
                                                            uVar3 = uVar2;
                                                        }
                                                        if (oVar6 != null) {
                                                            i35 = oVar6.f12746a;
                                                        } else {
                                                            i35 = 0;
                                                        }
                                                        if (uVar3.compareTo(q3.u.D) >= 0) {
                                                            z27 = true;
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        if (i35 == 1) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                        if (!z28) {
                                                            if (z27) {
                                                                i36 = 1;
                                                            } else if (z28) {
                                                                i36 = 2;
                                                            } else {
                                                                i36 = 0;
                                                            }
                                                        } else if (z27) {
                                                            i36 = 1;
                                                        } else if (z28) {
                                                            i36 = 2;
                                                        } else {
                                                            i36 = 0;
                                                        }
                                                        StyleSpan styleSpan4 = new StyleSpan(i36);
                                                        i37 = 33;
                                                        spannableString3.setSpan(styleSpan4, i33, i34, 33);
                                                    } else {
                                                        if (uVar2 == null) {
                                                            uVar3 = q3.u.J;
                                                        } else {
                                                            uVar3 = uVar2;
                                                        }
                                                        if (oVar6 != null) {
                                                            i35 = oVar6.f12746a;
                                                        } else {
                                                            i35 = 0;
                                                        }
                                                        if (uVar3.compareTo(q3.u.D) >= 0) {
                                                            z27 = true;
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        if (i35 == 1) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                        if (!z28) {
                                                            if (z27) {
                                                                i36 = 1;
                                                            } else if (z28) {
                                                                i36 = 2;
                                                            } else {
                                                                i36 = 0;
                                                            }
                                                        } else if (z27) {
                                                            i36 = 1;
                                                        } else if (z28) {
                                                            i36 = 2;
                                                        } else {
                                                            i36 = 0;
                                                        }
                                                        StyleSpan styleSpan5 = new StyleSpan(i36);
                                                        i37 = 33;
                                                        spannableString3.setSpan(styleSpan5, i33, i34, 33);
                                                    }
                                                    if (lVar3 != null) {
                                                        i38 = lVar3.f16420a;
                                                        if ((i38 | 1) == i38) {
                                                            spannableString3.setSpan(new UnderlineSpan(), i33, i34, i37);
                                                        }
                                                        if ((i38 | 2) == i38) {
                                                            spannableString3.setSpan(new StrikethroughSpan(), i33, i34, i37);
                                                        }
                                                    }
                                                    if (pVar != null) {
                                                        spannableString3.setSpan(new ScaleXSpan(pVar.f16424a), i33, i34, i37);
                                                    }
                                                    rd.a.d0(spannableString3, bVar3, i33, i34);
                                                    if (j9 != 16) {
                                                        spannableString3.setSpan(new BackgroundColorSpan(i2.b0.C(j9)), i33, i34, i37);
                                                    }
                                                    i32 = i4113 + 1;
                                                    spannableString = spannableString3;
                                                    size8 = i4112;
                                                    arrayList3 = arrayList8;
                                                    sVar5 = sVar8;
                                                    kVar = kVar6;
                                                    oVar = oVar9;
                                                    resources = resources7;
                                                    Obtain = r44;
                                                    i0Var = i0Var9;
                                                    gVar = gVar7;
                                                }
                                            }
                                            sVar = sVar5;
                                            kVar2 = kVar;
                                            i0Var2 = i0Var;
                                            r41 = Obtain;
                                            a5.g gVar8 = gVar;
                                            spannableString2 = spannableString;
                                            oVar2 = oVar;
                                            resources2 = resources;
                                            int length5 = str5.length();
                                            arrayList4 = h00.x.A;
                                            if (list4 != null) {
                                                arrayList5 = new ArrayList(list4.size());
                                                size7 = list4.size();
                                                for (i31 = 0; i31 < size7; i31++) {
                                                    Object obj6 = list4.get(i31);
                                                    fVar3 = (m3.f) obj6;
                                                    if (!(fVar3.f10423a instanceof m3.t0)) {
                                                    }
                                                }
                                            } else {
                                                arrayList5 = arrayList4;
                                            }
                                            size3 = arrayList5.size();
                                            for (i23 = 0; i23 < size3; i23++) {
                                                m3.f fVar12 = (m3.f) arrayList5.get(i23);
                                                t0Var4 = (m3.t0) fVar12.f10423a;
                                                i29 = fVar12.f10424b;
                                                i30 = fVar12.f10425c;
                                                if (t0Var4 instanceof m3.t0) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(t0Var4.f10536a).build(), i29, i30, 33);
                                            }
                                            int length6 = str5.length();
                                            if (list4 != null) {
                                                arrayList4 = new ArrayList(list4.size());
                                                size6 = list4.size();
                                                for (i28 = 0; i28 < size6; i28++) {
                                                    Object obj7 = list4.get(i28);
                                                    fVar2 = (m3.f) obj7;
                                                    if (!(fVar2.f10423a instanceof m3.s0)) {
                                                    }
                                                }
                                            }
                                            size4 = arrayList4.size();
                                            for (i24 = 0; i24 < size4; i24++) {
                                                m3.f fVar13 = (m3.f) arrayList4.get(i24);
                                                s0Var = (m3.s0) fVar13.f10423a;
                                                int i4114 = fVar13.f10424b;
                                                int i4115 = fVar13.f10425c;
                                                weakHashMap2 = (WeakHashMap) p1Var.B;
                                                uRLSpan = weakHashMap2.get(s0Var);
                                                if (uRLSpan == null) {
                                                    uRLSpan = new URLSpan(s0Var.f10532a);
                                                    weakHashMap2.put(s0Var, uRLSpan);
                                                }
                                                spannableString2.setSpan((URLSpan) uRLSpan, i4114, i4115, 33);
                                            }
                                            listA = hVarP.a(str5.length());
                                            size5 = listA.size();
                                            for (i25 = 0; i25 < size5; i25++) {
                                                fVar = (m3.f) listA.get(i25);
                                                i26 = fVar.f10424b;
                                                obj = fVar.f10423a;
                                                i27 = fVar.f10425c;
                                                if (i26 != i27) {
                                                    oVar5 = (m3.o) obj;
                                                    if (oVar5 instanceof m3.n) {
                                                        weakHashMap = (WeakHashMap) p1Var.D;
                                                        eVar = weakHashMap.get(fVar);
                                                        if (eVar == null) {
                                                            eVar = new u3.e(oVar5);
                                                            weakHashMap.put(fVar, eVar);
                                                        }
                                                        spannableString2.setSpan((ClickableSpan) eVar, i26, i27, 33);
                                                    } else {
                                                        weakHashMap = (WeakHashMap) p1Var.D;
                                                        eVar = weakHashMap.get(fVar);
                                                        if (eVar == null) {
                                                            eVar = new u3.e(oVar5);
                                                            weakHashMap.put(fVar, eVar);
                                                        }
                                                        spannableString2.setSpan((ClickableSpan) eVar, i26, i27, 33);
                                                    }
                                                }
                                            }
                                            r7 = gVar8;
                                            r4 = (SpannableString) f0.P(spannableString2);
                                        } else {
                                            uVar = uVar;
                                            sVar = sVar5;
                                            kVar2 = kVar;
                                            i0Var2 = i0Var;
                                            r41 = Obtain;
                                            oVar2 = oVar;
                                            resources2 = resources;
                                            r4 = th2;
                                            r7 = gVar;
                                        }
                                        r7.k(r4);
                                        zVar = j3.w.O;
                                        i0Var3 = i0Var2;
                                        if (i0Var3.c(zVar)) {
                                            ?? r111 = r41;
                                            r111.setContentInvalid(true);
                                            objG20 = i0Var3.g(zVar);
                                            if (objG20 == null) {
                                                objG20 = th2;
                                            }
                                            r10.setError((CharSequence) objG20);
                                            r11 = r111;
                                        } else {
                                            r11 = r41;
                                        }
                                        sVar2 = sVar;
                                        Resources resources8 = resources2;
                                        r10.setStateDescription(m0.o(sVar2, resources8));
                                        r10.setCheckable(m0.n(sVar2));
                                        objG2 = i0Var3.g(j3.w.L);
                                        if (objG2 == null) {
                                            objG2 = th2;
                                        }
                                        aVar = (l3.a) objG2;
                                        if (aVar != null) {
                                            if (aVar == l3.a.A) {
                                                r10.setChecked(true);
                                            } else if (aVar == l3.a.B) {
                                                r10.setChecked(false);
                                            }
                                        }
                                        objG3 = i0Var3.g(j3.w.K);
                                        if (objG3 == null) {
                                            objG3 = th2;
                                        }
                                        bool = (Boolean) objG3;
                                        if (bool != null) {
                                            zBooleanValue2 = bool.booleanValue();
                                            if (kVar2 == null) {
                                                kVar3 = kVar2;
                                                i15 = 4;
                                            } else {
                                                kVar3 = kVar2;
                                                i15 = 4;
                                                if (kVar3.f7937a == 4) {
                                                    r11.setSelected(zBooleanValue2);
                                                }
                                            }
                                            r10.setChecked(zBooleanValue2);
                                        } else {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                        }
                                        oVar3 = oVar2;
                                        if (oVar3.C) {
                                            objG4 = i0Var3.g(j3.w.f7978a);
                                            if (objG4 == null) {
                                                objG4 = th2;
                                            }
                                            list = (List) objG4;
                                            if (list != null) {
                                                r12 = (String) h00.q.N0(list);
                                            } else {
                                                r12 = th2;
                                            }
                                            r10.setContentDescription(r12);
                                        } else {
                                            objG4 = i0Var3.g(j3.w.f7978a);
                                            if (objG4 == null) {
                                                objG4 = th2;
                                            }
                                            list = (List) objG4;
                                            if (list != null) {
                                                r12 = (String) h00.q.N0(list);
                                            } else {
                                                r12 = th2;
                                            }
                                            r10.setContentDescription(r12);
                                        }
                                        objG5 = i0Var3.g(j3.w.A);
                                        if (objG5 == null) {
                                            objG5 = th2;
                                        }
                                        str = (String) objG5;
                                        if (str != null) {
                                            sVarL3 = sVar2;
                                            while (true) {
                                                if (sVarL3 != null) {
                                                    oVar4 = sVarL3.f7968d;
                                                    zVar6 = j3.x.f8002a;
                                                    if (oVar4.A.c(zVar6)) {
                                                        zBooleanValue = ((Boolean) oVar4.e(zVar6)).booleanValue();
                                                    } else {
                                                        sVarL3 = sVarL3.l();
                                                    }
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                            }
                                            if (zBooleanValue) {
                                                r11.setViewIdResourceName(str);
                                            }
                                        }
                                        objG6 = i0Var3.g(j3.w.f7985h);
                                        if (objG6 == null) {
                                            objG6 = th2;
                                        }
                                        if (((g00.b0) objG6) != null) {
                                            r10.setHeading(true);
                                        }
                                        objG7 = i0Var3.g(j3.w.f7986i);
                                        if (objG7 == null) {
                                            objG7 = th2;
                                        }
                                        if (((g00.b0) objG7) != null) {
                                            r11.setTextEntryKey(true);
                                        }
                                        i16 = i10;
                                        if (i16 != -1) {
                                            iD3 = uVar.d(sVar2.f7970f, -1);
                                            if (iD3 != -1) {
                                                r11.setDrawingOrder(iD3);
                                            } else {
                                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                            }
                                        }
                                        r11.setPassword(i0Var3.c(j3.w.N));
                                        objG8 = i0Var3.g(j3.w.Q);
                                        if (objG8 == null) {
                                            objG8 = th2;
                                        }
                                        bool2 = Boolean.TRUE;
                                        r11.setEditable(kotlin.jvm.internal.m.a(objG8, bool2));
                                        objG9 = i0Var3.g(j3.w.R);
                                        if (objG9 == null) {
                                            objG9 = th2;
                                        }
                                        num = (Integer) objG9;
                                        if (num != null) {
                                            iIntValue2 = num.intValue();
                                        } else {
                                            iIntValue2 = -1;
                                        }
                                        r10.setMaxTextLength(iIntValue2);
                                        r10.setEnabled(m0.b(sVar2));
                                        zVar2 = j3.w.l;
                                        r10.setFocusable(i0Var3.c(zVar2));
                                        if (r11.isFocusable()) {
                                            r10.setFocused(((Boolean) oVar3.e(zVar2)).booleanValue());
                                            if (r11.isFocused()) {
                                                r7.a(2);
                                                f0 f0Var5 = f0Var2;
                                                f0Var5.L = i16;
                                                f0Var = f0Var5;
                                            } else {
                                                r13 = f0Var2;
                                                z11 = true;
                                                r7.a(1);
                                            }
                                            r10.setVisibleToUser(j3.v.g(sVar2) ^ z11);
                                            if (sVar2.o()) {
                                                sVarL2 = sVar2.l();
                                                kotlin.jvm.internal.m.b(sVarL2);
                                            } else {
                                                sVarL2 = sVar2;
                                            }
                                            if (sVarL2.m().g()) {
                                                r10.setVisibleToUser(false);
                                            }
                                            objG10 = i0Var3.g(j3.w.f7988k);
                                            if (objG10 == null) {
                                                objG10 = th2;
                                            }
                                            hVar = (j3.h) objG10;
                                            if (hVar != null) {
                                                i21 = hVar.f7933a;
                                                if (i21 == 0) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                                if (z25) {
                                                    i22 = 1;
                                                } else {
                                                    if (i21 == 1) {
                                                        z26 = true;
                                                    } else {
                                                        z26 = false;
                                                    }
                                                    if (z26) {
                                                        i22 = 2;
                                                    } else {
                                                        i22 = 1;
                                                    }
                                                }
                                                r11.setLiveRegion(i22);
                                            }
                                            r10.setClickable(false);
                                            objG11 = i0Var3.g(j3.n.f7941b);
                                            if (objG11 == null) {
                                                objG11 = th2;
                                            }
                                            aVar2 = (j3.a) objG11;
                                            if (aVar2 != null) {
                                                objG19 = i0Var3.g(j3.w.K);
                                                if (objG19 == null) {
                                                    objG19 = th2;
                                                }
                                                boolean zA8 = kotlin.jvm.internal.m.a(objG19, bool2);
                                                if (kVar3 == null) {
                                                    z21 = false;
                                                } else {
                                                    z21 = true;
                                                }
                                                if (z21) {
                                                    z22 = true;
                                                } else {
                                                    if (kVar3 == null) {
                                                        z24 = false;
                                                    } else {
                                                        z24 = true;
                                                    }
                                                    if (z24) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                }
                                                if (z22) {
                                                    z23 = true;
                                                } else {
                                                    z23 = true;
                                                }
                                                r10.setClickable(z23);
                                                if (m0.b(sVar2)) {
                                                    r7.b(new a5.c(16, aVar2.f7926a));
                                                }
                                            }
                                            r10.setLongClickable(false);
                                            objG12 = i0Var3.g(j3.n.f7942c);
                                            if (objG12 == null) {
                                                objG12 = th2;
                                            }
                                            aVar3 = (j3.a) objG12;
                                            if (aVar3 != null) {
                                                r10.setLongClickable(true);
                                                if (m0.b(sVar2)) {
                                                    r7.b(new a5.c(32, aVar3.f7926a));
                                                }
                                            }
                                            aVar4 = (j3.a) j3.v.f(oVar3, j3.n.f7954q);
                                            if (aVar4 != null) {
                                                r7.b(new a5.c(16384, aVar4.f7926a));
                                            }
                                            if (m0.b(sVar2)) {
                                                aVar11 = (j3.a) j3.v.f(oVar3, j3.n.f7950k);
                                                if (aVar11 != null) {
                                                    r7.b(new a5.c(2097152, aVar11.f7926a));
                                                }
                                                aVar12 = (j3.a) j3.v.f(oVar3, j3.n.f7953p);
                                                if (aVar12 != null) {
                                                    r7.b(new a5.c(R.id.accessibilityActionImeEnter, aVar12.f7926a));
                                                }
                                                aVar13 = (j3.a) j3.v.f(oVar3, j3.n.f7955r);
                                                if (aVar13 != null) {
                                                    r7.b(new a5.c(Cast.MAX_MESSAGE_LENGTH, aVar13.f7926a));
                                                }
                                                aVar14 = (j3.a) j3.v.f(oVar3, j3.n.f7956s);
                                                if (aVar14 != null) {
                                                    primaryClipDescription = zVar7.getClipboardManager().a().getPrimaryClipDescription();
                                                    if (primaryClipDescription != null) {
                                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                    } else {
                                                        zHasMimeType = false;
                                                    }
                                                    if (zHasMimeType) {
                                                        r7.b(new a5.c(32768, aVar14.f7926a));
                                                    }
                                                }
                                            }
                                            strT = f0.t(sVar2);
                                            if (strT != null) {
                                                z12 = true;
                                            } else {
                                                z12 = true;
                                            }
                                            if (!z12) {
                                                r11.setTextSelection(r13.r(sVar2), r13.q(sVar2));
                                                aVar10 = (j3.a) j3.v.f(oVar3, j3.n.f7949j);
                                                if (aVar10 != null) {
                                                    r16 = aVar10.f7926a;
                                                } else {
                                                    r16 = th2;
                                                }
                                                r7.b(new a5.c(131072, (String) r16));
                                                r7.a(256);
                                                r7.a(512);
                                                r10.setMovementGranularities(11);
                                                list3 = (List) j3.v.f(oVar3, j3.w.f7978a);
                                                if (list3 != null) {
                                                    z19 = true;
                                                } else {
                                                    z19 = true;
                                                }
                                                if (z19) {
                                                    z20 = true;
                                                    if (sVar2.f7968d.A.c(j3.w.G)) {
                                                        objG18 = sVar2.f7968d.A.g(j3.w.l);
                                                        if (objG18 == null) {
                                                            objG18 = null;
                                                        }
                                                        if (kotlin.jvm.internal.m.a(objG18, Boolean.TRUE)) {
                                                            l0VarX = sVar2.f7967c.x();
                                                            while (true) {
                                                                if (l0VarX == null) {
                                                                    l0VarX = null;
                                                                } else {
                                                                    oVarZ2 = l0VarX.z();
                                                                    if (oVarZ2 == null) {
                                                                    }
                                                                    l0VarX = l0VarX.x();
                                                                }
                                                            }
                                                            if (l0VarX == null) {
                                                                z20 = false;
                                                            } else {
                                                                oVarZ = l0VarX.z();
                                                                if (oVarZ != null) {
                                                                    Object objG211 = oVarZ.A.g(j3.w.l);
                                                                    zA = kotlin.jvm.internal.m.a(objG211 != null ? objG211 : null, Boolean.TRUE);
                                                                } else {
                                                                    zA = false;
                                                                }
                                                                if (zA) {
                                                                    z20 = false;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        l0VarX = sVar2.f7967c.x();
                                                        while (true) {
                                                            if (l0VarX == null) {
                                                                l0VarX = null;
                                                            } else {
                                                                oVarZ2 = l0VarX.z();
                                                                if (oVarZ2 == null) {
                                                                }
                                                                l0VarX = l0VarX.x();
                                                            }
                                                        }
                                                        if (l0VarX == null) {
                                                            z20 = false;
                                                        } else {
                                                            oVarZ = l0VarX.z();
                                                            if (oVarZ != null) {
                                                                Object objG212 = oVarZ.A.g(j3.w.l);
                                                                zA = kotlin.jvm.internal.m.a(objG212 != null ? objG212 : null, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                                z20 = false;
                                                            }
                                                        }
                                                    }
                                                    if (!z20) {
                                                        r10.setMovementGranularities(r11.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                            arrayList = new ArrayList();
                                            arrayList.add("androidx.compose.ui.semantics.id");
                                            charSequenceF = r7.f();
                                            if (charSequenceF != null) {
                                                z13 = true;
                                            } else {
                                                z13 = true;
                                            }
                                            if (!z13) {
                                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (i0Var3.c(j3.w.A)) {
                                                arrayList.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (i0Var3.c(j3.w.S)) {
                                                arrayList.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            r11.setAvailableExtraData(arrayList);
                                            jVar = (j3.j) j3.v.f(oVar3, j3.w.f7980c);
                                            if (jVar != null) {
                                                f3 = jVar.f7935a;
                                                aVar9 = jVar.f7936b;
                                                zVar5 = j3.n.f7948i;
                                                if (i0Var3.c(zVar5)) {
                                                    r7.g("android.widget.SeekBar");
                                                } else {
                                                    r7.g("android.widget.ProgressBar");
                                                }
                                                if (jVar != j3.j.f7934c) {
                                                    r11.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, aVar9.A, aVar9.B, f3));
                                                }
                                                if (sVar2.n().A.c(zVar5)) {
                                                    fFloatValue = ((Number) aVar9.c()).floatValue();
                                                    fFloatValue2 = ((Number) aVar9.a()).floatValue();
                                                    if (fFloatValue < fFloatValue2) {
                                                        fFloatValue = fFloatValue2;
                                                    }
                                                    if (f3 < fFloatValue) {
                                                        r7.b(a5.c.f174h);
                                                    }
                                                    fFloatValue3 = ((Number) aVar9.a()).floatValue();
                                                    fFloatValue4 = ((Number) aVar9.c()).floatValue();
                                                    if (fFloatValue3 > fFloatValue4) {
                                                        fFloatValue3 = fFloatValue4;
                                                    }
                                                    if (f3 > fFloatValue3) {
                                                        r7.b(a5.c.f175i);
                                                    }
                                                }
                                            }
                                            if (m0.b(sVar2)) {
                                                objG17 = sVar2.f7968d.A.g(j3.n.f7948i);
                                                if (objG17 == null) {
                                                    objG17 = null;
                                                }
                                                aVar8 = (j3.a) objG17;
                                                if (aVar8 != null) {
                                                    r7.b(new a5.c(R.id.accessibilityActionSetProgress, aVar8.f7926a));
                                                }
                                            }
                                            ta.c0.U(r7, sVar2);
                                            ta.c0.V(r7, sVar2);
                                            lVar = (j3.l) j3.v.f(sVar2.n(), j3.w.f7997v);
                                            j3.a aVar19 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7943d);
                                            if (lVar != null) {
                                                objG15 = sVar2.k().A.g(j3.w.f7983f);
                                                if (objG15 == null) {
                                                    objG15 = th2;
                                                }
                                                if (objG15 == null) {
                                                    objG16 = sVar2.k().A.g(j3.w.f7982e);
                                                    if (objG16 == null) {
                                                        objG16 = th2;
                                                    }
                                                    if (objG16 != null) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                } else {
                                                    z16 = true;
                                                }
                                                if (!z16) {
                                                    r7.g("android.widget.HorizontalScrollView");
                                                }
                                                if (((Number) lVar.f7939b.invoke()).floatValue() > 0.0f) {
                                                    r7.j(true);
                                                }
                                                if (m0.b(sVar2)) {
                                                    if (f0.z(lVar)) {
                                                        r7.b(a5.c.f174h);
                                                        l0Var = l0Var2;
                                                        if (l0Var.f2053a0 == y3.m.B) {
                                                            z18 = true;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        if (z18) {
                                                            cVar2 = a5.c.f179o;
                                                        } else {
                                                            cVar2 = a5.c.f181q;
                                                        }
                                                        r7.b(cVar2);
                                                    } else {
                                                        l0Var = l0Var2;
                                                    }
                                                    if (f0.y(lVar)) {
                                                        r7.b(a5.c.f175i);
                                                        if (l0Var.f2053a0 == y3.m.B) {
                                                            z17 = true;
                                                        } else {
                                                            z17 = false;
                                                        }
                                                        if (z17) {
                                                            cVar = a5.c.f181q;
                                                        } else {
                                                            cVar = a5.c.f179o;
                                                        }
                                                        r7.b(cVar);
                                                    }
                                                }
                                            }
                                            lVar2 = (j3.l) j3.v.f(sVar2.n(), j3.w.f7998w);
                                            if (lVar2 != null) {
                                                objG13 = sVar2.k().A.g(j3.w.f7983f);
                                                if (objG13 == null) {
                                                    objG13 = th2;
                                                }
                                                if (objG13 == null) {
                                                    objG14 = sVar2.k().A.g(j3.w.f7982e);
                                                    if (objG14 == null) {
                                                        objG14 = th2;
                                                    }
                                                    if (objG14 != null) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                } else {
                                                    z15 = true;
                                                }
                                                if (!z15) {
                                                    r7.g("android.widget.ScrollView");
                                                }
                                                if (((Number) lVar2.f7939b.invoke()).floatValue() > 0.0f) {
                                                    r7.j(true);
                                                }
                                                if (m0.b(sVar2)) {
                                                    if (f0.z(lVar2)) {
                                                        r7.b(a5.c.f174h);
                                                        r7.b(a5.c.f180p);
                                                    }
                                                    if (f0.y(lVar2)) {
                                                        r7.b(a5.c.f175i);
                                                        r7.b(a5.c.f178n);
                                                    }
                                                }
                                            }
                                            m0.f(r7, sVar2);
                                            r10.setPaneTitle((CharSequence) j3.v.f(sVar2.n(), j3.w.f7981d));
                                            if (m0.b(sVar2)) {
                                                aVar5 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7957t);
                                                if (aVar5 != null) {
                                                    r7.b(new a5.c(262144, aVar5.f7926a));
                                                }
                                                aVar6 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7958u);
                                                if (aVar6 != null) {
                                                    r7.b(new a5.c(524288, aVar6.f7926a));
                                                }
                                                aVar7 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7959v);
                                                if (aVar7 != null) {
                                                    r7.b(new a5.c(1048576, aVar7.f7926a));
                                                }
                                                oVarN = sVar2.n();
                                                zVar4 = j3.n.f7961x;
                                                if (oVarN.A.c(zVar4)) {
                                                    list2 = (List) sVar2.n().e(zVar4);
                                                    size2 = list2.size();
                                                    vVar = f0.f2655n0;
                                                    if (size2 < vVar.f14904b) {
                                                        throw new IllegalStateException(g4.c.g(vVar.f14904b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                    }
                                                    u.t0 t0Var9 = new u.t0(0);
                                                    u.c0 c0VarA5 = u.n0.a();
                                                    t0Var3 = t0Var2;
                                                    if (v.a.a(t0Var3.A, t0Var3.C, i16) >= 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        c0Var = (u.c0) t0Var3.c(i16);
                                                        iArr = vVar.f14903a;
                                                        i17 = vVar.f14904b;
                                                        iArr2 = new int[16];
                                                        i18 = 0;
                                                        i19 = 0;
                                                        while (i18 < i17) {
                                                            int i4116 = iArr[i18];
                                                            int i58 = i17;
                                                            i20 = i19 + 1;
                                                            u.c0 c0Var7 = c0Var;
                                                            if (iArr2.length < i20) {
                                                                int[] iArrCopyOf5 = Arrays.copyOf(iArr2, Math.max(i20, (iArr2.length * 3) / 2));
                                                                kotlin.jvm.internal.m.d(iArrCopyOf5, "copyOf(...)");
                                                                iArr2 = iArrCopyOf5;
                                                            }
                                                            iArr2[i19] = i4116;
                                                            i18++;
                                                            i19 = i20;
                                                            i17 = i58;
                                                            c0Var = c0Var7;
                                                        }
                                                        c0Var2 = c0Var;
                                                        arrayList2 = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            a1.b.x(list2.get(0));
                                                            kotlin.jvm.internal.m.b(c0Var2);
                                                            throw th2;
                                                        }
                                                        if (arrayList2.size() > 0) {
                                                            a1.b.x(arrayList2.get(0));
                                                            if (i19 > 0) {
                                                                int i59 = iArr2[0];
                                                                throw th2;
                                                            }
                                                            v.a.d("Index must be between 0 and size");
                                                            throw th2;
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        a1.b.x(list2.get(0));
                                                        vVar.c(0);
                                                        throw th2;
                                                    }
                                                    r13.R.e(i16, t0Var9);
                                                    t0Var3.e(i16, c0VarA5);
                                                }
                                            }
                                            r10.setScreenReaderFocusable(m0.d(sVar2, resources8));
                                            iD = r13.f2657b0.d(i16, -1);
                                            if (iD != -1) {
                                                jVarV2 = m0.v(zVar7.getAndroidViewsHandler$ui(), iD);
                                                if (jVarV2 != null) {
                                                    r10.setTraversalBefore(jVarV2);
                                                    zVar3 = zVar7;
                                                } else {
                                                    zVar3 = zVar7;
                                                    r10.setTraversalBefore(zVar3, iD);
                                                }
                                                ?? r24 = th2;
                                                r13.j(i16, r7, r13.f2659d0, r24);
                                                r14 = r24;
                                            } else {
                                                r14 = th2;
                                                zVar3 = zVar7;
                                            }
                                            iD2 = r13.f2658c0.d(i16, -1);
                                            if (iD2 != -1) {
                                                r10.setTraversalAfter(jVarV);
                                                r13.j(i16, r7, r13.f2660e0, r14);
                                            }
                                            str2 = (String) j3.v.f(sVar2.n(), j3.x.f8003b);
                                            if (str2 != null) {
                                                r7.g(str2);
                                            }
                                            r15 = r7;
                                            r18 = r13;
                                        } else {
                                            f0Var = f0Var2;
                                        }
                                        z11 = true;
                                        r13 = f0Var;
                                        r10.setVisibleToUser(j3.v.g(sVar2) ^ z11);
                                        if (sVar2.o()) {
                                            sVarL2 = sVar2.l();
                                            kotlin.jvm.internal.m.b(sVarL2);
                                        } else {
                                            sVarL2 = sVar2;
                                        }
                                        if (sVarL2.m().g()) {
                                            r10.setVisibleToUser(false);
                                        }
                                        objG10 = i0Var3.g(j3.w.f7988k);
                                        if (objG10 == null) {
                                            objG10 = th2;
                                        }
                                        hVar = (j3.h) objG10;
                                        if (hVar != null) {
                                            i21 = hVar.f7933a;
                                            if (i21 == 0) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            if (z25) {
                                                if (i21 == 1) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                if (z26) {
                                                    i22 = 2;
                                                } else {
                                                    i22 = 1;
                                                }
                                            } else {
                                                i22 = 1;
                                            }
                                            r11.setLiveRegion(i22);
                                        }
                                        r10.setClickable(false);
                                        objG11 = i0Var3.g(j3.n.f7941b);
                                        if (objG11 == null) {
                                            objG11 = th2;
                                        }
                                        aVar2 = (j3.a) objG11;
                                        if (aVar2 != null) {
                                            objG19 = i0Var3.g(j3.w.K);
                                            if (objG19 == null) {
                                                objG19 = th2;
                                            }
                                            boolean zA9 = kotlin.jvm.internal.m.a(objG19, bool2);
                                            if (kVar3 == null) {
                                                z21 = false;
                                            } else {
                                                z21 = true;
                                            }
                                            if (z21) {
                                                z22 = true;
                                            } else {
                                                if (kVar3 == null) {
                                                    z24 = false;
                                                } else {
                                                    z24 = true;
                                                }
                                                if (z24) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                            }
                                            if (z22) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            r10.setClickable(z23);
                                            if (m0.b(sVar2)) {
                                                r7.b(new a5.c(16, aVar2.f7926a));
                                            }
                                        }
                                        r10.setLongClickable(false);
                                        objG12 = i0Var3.g(j3.n.f7942c);
                                        if (objG12 == null) {
                                            objG12 = th2;
                                        }
                                        aVar3 = (j3.a) objG12;
                                        if (aVar3 != null) {
                                            r10.setLongClickable(true);
                                            if (m0.b(sVar2)) {
                                                r7.b(new a5.c(32, aVar3.f7926a));
                                            }
                                        }
                                        aVar4 = (j3.a) j3.v.f(oVar3, j3.n.f7954q);
                                        if (aVar4 != null) {
                                            r7.b(new a5.c(16384, aVar4.f7926a));
                                        }
                                        if (m0.b(sVar2)) {
                                            aVar11 = (j3.a) j3.v.f(oVar3, j3.n.f7950k);
                                            if (aVar11 != null) {
                                                r7.b(new a5.c(2097152, aVar11.f7926a));
                                            }
                                            aVar12 = (j3.a) j3.v.f(oVar3, j3.n.f7953p);
                                            if (aVar12 != null) {
                                                r7.b(new a5.c(R.id.accessibilityActionImeEnter, aVar12.f7926a));
                                            }
                                            aVar13 = (j3.a) j3.v.f(oVar3, j3.n.f7955r);
                                            if (aVar13 != null) {
                                                r7.b(new a5.c(Cast.MAX_MESSAGE_LENGTH, aVar13.f7926a));
                                            }
                                            aVar14 = (j3.a) j3.v.f(oVar3, j3.n.f7956s);
                                            if (aVar14 != null) {
                                                primaryClipDescription = zVar7.getClipboardManager().a().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r7.b(new a5.c(32768, aVar14.f7926a));
                                                }
                                            }
                                        }
                                        strT = f0.t(sVar2);
                                        if (strT != null) {
                                            z12 = true;
                                        } else {
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            r11.setTextSelection(r13.r(sVar2), r13.q(sVar2));
                                            aVar10 = (j3.a) j3.v.f(oVar3, j3.n.f7949j);
                                            if (aVar10 != null) {
                                                r16 = aVar10.f7926a;
                                            } else {
                                                r16 = th2;
                                            }
                                            r7.b(new a5.c(131072, (String) r16));
                                            r7.a(256);
                                            r7.a(512);
                                            r10.setMovementGranularities(11);
                                            list3 = (List) j3.v.f(oVar3, j3.w.f7978a);
                                            if (list3 != null) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            if (z19) {
                                                z20 = true;
                                                if (sVar2.f7968d.A.c(j3.w.G)) {
                                                    objG18 = sVar2.f7968d.A.g(j3.w.l);
                                                    if (objG18 == null) {
                                                        objG18 = null;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(objG18, Boolean.TRUE)) {
                                                        l0VarX = sVar2.f7967c.x();
                                                        while (true) {
                                                            if (l0VarX == null) {
                                                                l0VarX = null;
                                                            } else {
                                                                oVarZ2 = l0VarX.z();
                                                                if (oVarZ2 == null) {
                                                                }
                                                                l0VarX = l0VarX.x();
                                                            }
                                                        }
                                                        if (l0VarX == null) {
                                                            z20 = false;
                                                        } else {
                                                            oVarZ = l0VarX.z();
                                                            if (oVarZ != null) {
                                                                Object objG213 = oVarZ.A.g(j3.w.l);
                                                                zA = kotlin.jvm.internal.m.a(objG213 != null ? objG213 : null, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                                z20 = false;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    l0VarX = sVar2.f7967c.x();
                                                    while (true) {
                                                        if (l0VarX == null) {
                                                            l0VarX = null;
                                                        } else {
                                                            oVarZ2 = l0VarX.z();
                                                            if (oVarZ2 == null) {
                                                            }
                                                            l0VarX = l0VarX.x();
                                                        }
                                                    }
                                                    if (l0VarX == null) {
                                                        z20 = false;
                                                    } else {
                                                        oVarZ = l0VarX.z();
                                                        if (oVarZ != null) {
                                                            Object objG214 = oVarZ.A.g(j3.w.l);
                                                            zA = kotlin.jvm.internal.m.a(objG214 != null ? objG214 : null, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                            z20 = false;
                                                        }
                                                    }
                                                }
                                                if (!z20) {
                                                    r10.setMovementGranularities(r11.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        charSequenceF = r7.f();
                                        if (charSequenceF != null) {
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                        }
                                        if (!z13) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (i0Var3.c(j3.w.A)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (i0Var3.c(j3.w.S)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        r11.setAvailableExtraData(arrayList);
                                        jVar = (j3.j) j3.v.f(oVar3, j3.w.f7980c);
                                        if (jVar != null) {
                                            f3 = jVar.f7935a;
                                            aVar9 = jVar.f7936b;
                                            zVar5 = j3.n.f7948i;
                                            if (i0Var3.c(zVar5)) {
                                                r7.g("android.widget.SeekBar");
                                            } else {
                                                r7.g("android.widget.ProgressBar");
                                            }
                                            if (jVar != j3.j.f7934c) {
                                                r11.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, aVar9.A, aVar9.B, f3));
                                            }
                                            if (sVar2.n().A.c(zVar5)) {
                                                fFloatValue = ((Number) aVar9.c()).floatValue();
                                                fFloatValue2 = ((Number) aVar9.a()).floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                if (f3 < fFloatValue) {
                                                    r7.b(a5.c.f174h);
                                                }
                                                fFloatValue3 = ((Number) aVar9.a()).floatValue();
                                                fFloatValue4 = ((Number) aVar9.c()).floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                if (f3 > fFloatValue3) {
                                                    r7.b(a5.c.f175i);
                                                }
                                            }
                                        }
                                        if (m0.b(sVar2)) {
                                            objG17 = sVar2.f7968d.A.g(j3.n.f7948i);
                                            if (objG17 == null) {
                                                objG17 = null;
                                            }
                                            aVar8 = (j3.a) objG17;
                                            if (aVar8 != null) {
                                                r7.b(new a5.c(R.id.accessibilityActionSetProgress, aVar8.f7926a));
                                            }
                                        }
                                        ta.c0.U(r7, sVar2);
                                        ta.c0.V(r7, sVar2);
                                        lVar = (j3.l) j3.v.f(sVar2.n(), j3.w.f7997v);
                                        j3.a aVar110 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7943d);
                                        if (lVar != null) {
                                            objG15 = sVar2.k().A.g(j3.w.f7983f);
                                            if (objG15 == null) {
                                                objG15 = th2;
                                            }
                                            if (objG15 == null) {
                                                objG16 = sVar2.k().A.g(j3.w.f7982e);
                                                if (objG16 == null) {
                                                    objG16 = th2;
                                                }
                                                if (objG16 != null) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                            } else {
                                                z16 = true;
                                            }
                                            if (!z16) {
                                                r7.g("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) lVar.f7939b.invoke()).floatValue() > 0.0f) {
                                                r7.j(true);
                                            }
                                            if (m0.b(sVar2)) {
                                                if (f0.z(lVar)) {
                                                    r7.b(a5.c.f174h);
                                                    l0Var = l0Var2;
                                                    if (l0Var.f2053a0 == y3.m.B) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (z18) {
                                                        cVar2 = a5.c.f181q;
                                                    } else {
                                                        cVar2 = a5.c.f179o;
                                                    }
                                                    r7.b(cVar2);
                                                } else {
                                                    l0Var = l0Var2;
                                                }
                                                if (f0.y(lVar)) {
                                                    r7.b(a5.c.f175i);
                                                    if (l0Var.f2053a0 == y3.m.B) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        cVar = a5.c.f179o;
                                                    } else {
                                                        cVar = a5.c.f181q;
                                                    }
                                                    r7.b(cVar);
                                                }
                                            }
                                        }
                                        lVar2 = (j3.l) j3.v.f(sVar2.n(), j3.w.f7998w);
                                        if (lVar2 != null) {
                                            objG13 = sVar2.k().A.g(j3.w.f7983f);
                                            if (objG13 == null) {
                                                objG13 = th2;
                                            }
                                            if (objG13 == null) {
                                                objG14 = sVar2.k().A.g(j3.w.f7982e);
                                                if (objG14 == null) {
                                                    objG14 = th2;
                                                }
                                                if (objG14 != null) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            } else {
                                                z15 = true;
                                            }
                                            if (!z15) {
                                                r7.g("android.widget.ScrollView");
                                            }
                                            if (((Number) lVar2.f7939b.invoke()).floatValue() > 0.0f) {
                                                r7.j(true);
                                            }
                                            if (m0.b(sVar2)) {
                                                if (f0.z(lVar2)) {
                                                    r7.b(a5.c.f174h);
                                                    r7.b(a5.c.f180p);
                                                }
                                                if (f0.y(lVar2)) {
                                                    r7.b(a5.c.f175i);
                                                    r7.b(a5.c.f178n);
                                                }
                                            }
                                        }
                                        m0.f(r7, sVar2);
                                        r10.setPaneTitle((CharSequence) j3.v.f(sVar2.n(), j3.w.f7981d));
                                        if (m0.b(sVar2)) {
                                            aVar5 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7957t);
                                            if (aVar5 != null) {
                                                r7.b(new a5.c(262144, aVar5.f7926a));
                                            }
                                            aVar6 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7958u);
                                            if (aVar6 != null) {
                                                r7.b(new a5.c(524288, aVar6.f7926a));
                                            }
                                            aVar7 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7959v);
                                            if (aVar7 != null) {
                                                r7.b(new a5.c(1048576, aVar7.f7926a));
                                            }
                                            oVarN = sVar2.n();
                                            zVar4 = j3.n.f7961x;
                                            if (oVarN.A.c(zVar4)) {
                                                list2 = (List) sVar2.n().e(zVar4);
                                                size2 = list2.size();
                                                vVar = f0.f2655n0;
                                                if (size2 < vVar.f14904b) {
                                                    throw new IllegalStateException(g4.c.g(vVar.f14904b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                u.t0 t0Var10 = new u.t0(0);
                                                u.c0 c0VarA6 = u.n0.a();
                                                t0Var3 = t0Var2;
                                                if (v.a.a(t0Var3.A, t0Var3.C, i16) >= 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    c0Var = (u.c0) t0Var3.c(i16);
                                                    iArr = vVar.f14903a;
                                                    i17 = vVar.f14904b;
                                                    iArr2 = new int[16];
                                                    i18 = 0;
                                                    i19 = 0;
                                                    while (i18 < i17) {
                                                        int i4117 = iArr[i18];
                                                        int i510 = i17;
                                                        i20 = i19 + 1;
                                                        u.c0 c0Var8 = c0Var;
                                                        if (iArr2.length < i20) {
                                                            int[] iArrCopyOf6 = Arrays.copyOf(iArr2, Math.max(i20, (iArr2.length * 3) / 2));
                                                            kotlin.jvm.internal.m.d(iArrCopyOf6, "copyOf(...)");
                                                            iArr2 = iArrCopyOf6;
                                                        }
                                                        iArr2[i19] = i4117;
                                                        i18++;
                                                        i19 = i20;
                                                        i17 = i510;
                                                        c0Var = c0Var8;
                                                    }
                                                    c0Var2 = c0Var;
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        a1.b.x(list2.get(0));
                                                        kotlin.jvm.internal.m.b(c0Var2);
                                                        throw th2;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        a1.b.x(arrayList2.get(0));
                                                        if (i19 > 0) {
                                                            int i511 = iArr2[0];
                                                            throw th2;
                                                        }
                                                        v.a.d("Index must be between 0 and size");
                                                        throw th2;
                                                    }
                                                } else if (list2.size() > 0) {
                                                    a1.b.x(list2.get(0));
                                                    vVar.c(0);
                                                    throw th2;
                                                }
                                                r13.R.e(i16, t0Var10);
                                                t0Var3.e(i16, c0VarA6);
                                            }
                                        }
                                        r10.setScreenReaderFocusable(m0.d(sVar2, resources8));
                                        iD = r13.f2657b0.d(i16, -1);
                                        if (iD != -1) {
                                            jVarV2 = m0.v(zVar7.getAndroidViewsHandler$ui(), iD);
                                            if (jVarV2 != null) {
                                                r10.setTraversalBefore(jVarV2);
                                                zVar3 = zVar7;
                                            } else {
                                                zVar3 = zVar7;
                                                r10.setTraversalBefore(zVar3, iD);
                                            }
                                            ?? r25 = th2;
                                            r13.j(i16, r7, r13.f2659d0, r25);
                                            r14 = r25;
                                        } else {
                                            r14 = th2;
                                            zVar3 = zVar7;
                                        }
                                        iD2 = r13.f2658c0.d(i16, -1);
                                        if (iD2 != -1) {
                                            r10.setTraversalAfter(jVarV);
                                            r13.j(i16, r7, r13.f2660e0, r14);
                                        }
                                        str2 = (String) j3.v.f(sVar2.n(), j3.x.f8003b);
                                        if (str2 != null) {
                                            r7.g(str2);
                                        }
                                        r15 = r7;
                                        r18 = r13;
                                    }
                                }
                            }
                            th2 = null;
                            if (i10 == -1) {
                                parentForAccessibility = zVar7.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    r17 = (View) parentForAccessibility;
                                } else {
                                    r17 = th2;
                                }
                                gVar.f188b = -1;
                                Obtain.setParent(r17);
                            } else {
                                sVarL = sVar5.l();
                                if (sVarL != null) {
                                    ValueOf = Integer.valueOf(sVarL.f7970f);
                                } else {
                                    ValueOf = th2;
                                }
                                if (ValueOf != 0) {
                                    y2.a.d("semanticsNode " + i10 + " has null parent");
                                    throw new KotlinNothingValueException();
                                }
                                iIntValue = ValueOf.intValue();
                                if (iIntValue == zVar7.getSemanticsOwner().a().f7970f) {
                                    iIntValue = -1;
                                }
                                gVar.f188b = iIntValue;
                                Obtain.setParent(zVar7, iIntValue);
                            }
                            gVar.f189c = i10;
                            Obtain.setSource(zVar7, i10);
                            Obtain.setBoundsInScreen(f0Var2.k(tVar2));
                            uVar = f0Var2.f2665j0;
                            t0Var = f0Var2.S;
                            resources = zVar7.getContext().getResources();
                            gVar.g("android.view.View");
                            oVar = sVar5.f7968d;
                            i0Var = oVar.A;
                            if (i0Var.c(j3.w.G)) {
                                gVar.g("android.widget.EditText");
                            }
                            if (i0Var.c(j3.w.C)) {
                                gVar.g("android.widget.TextView");
                            }
                            objG = i0Var.g(j3.w.f8001z);
                            if (objG == null) {
                                objG = th2;
                            }
                            kVar = (j3.k) objG;
                            if (kVar != null) {
                                i40 = kVar.f7937a;
                                if (sVar5.o()) {
                                    accessibilityManager = accessibilityManager2;
                                    i41 = 4;
                                    t0Var2 = t0Var;
                                    if (j3.s.j(4, sVar5).isEmpty()) {
                                    }
                                } else {
                                    accessibilityManager = accessibilityManager2;
                                    i41 = 4;
                                    t0Var2 = t0Var;
                                }
                                if (i40 == i41) {
                                    Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131887328));
                                } else if (i40 == 2) {
                                    Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(2131887327));
                                } else {
                                    strX = m0.x(i40);
                                    if (i40 == 5) {
                                        gVar.g(strX);
                                    } else {
                                        gVar.g(strX);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                t0Var2 = t0Var;
                            }
                            Obtain.setPackageName(zVar7.getContext().getPackageName());
                            Obtain.setImportantForAccessibility(j3.v.h(sVar5));
                            if (i11 >= 34) {
                                zJ = a5.b.j(accessibilityManager);
                            } else {
                                zJ = true;
                            }
                            listJ = j3.s.j(4, sVar5);
                            size = listJ.size();
                            z10 = zJ;
                            i13 = 0;
                            i14 = 0;
                            while (true) {
                                r10 = gVar.f187a;
                                if (i14 < size) {
                                    int i4118 = size;
                                    sVar3 = (j3.s) listJ.get(i14);
                                    List list8 = listJ;
                                    lVarS = f0Var2.s();
                                    int i4119 = i14;
                                    i39 = sVar3.f7970f;
                                    if (lVarS.a(i39)) {
                                        jVar2 = zVar7.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(sVar3.f7967c);
                                        if (i39 != -1) {
                                            if (jVar2 != null) {
                                                Obtain.addChild(jVar2);
                                            } else {
                                                tVar = (j3.t) f0Var2.s().b(i39);
                                                if (tVar != null) {
                                                    zA2 = false;
                                                } else {
                                                    zA2 = false;
                                                }
                                                if (z10) {
                                                    r10.addChild(zVar7, i39);
                                                } else {
                                                    r10.addChild(zVar7, i39);
                                                }
                                            }
                                            uVar.f(i39, i13);
                                            i13++;
                                        }
                                    }
                                    i14 = i4119 + 1;
                                    listJ = list8;
                                    size = i4118;
                                } else {
                                    if (i10 == f0Var2.K) {
                                        r10.setAccessibilityFocused(true);
                                        gVar.b(a5.c.f173g);
                                    } else {
                                        r10.setAccessibilityFocused(false);
                                        gVar.b(a5.c.f172f);
                                    }
                                    hVarP = m0.p(sVar5);
                                    if (hVarP != null) {
                                        zVar7.getFontFamilyResolver();
                                        density = zVar7.getDensity();
                                        p1Var = f0Var2.f2661f0;
                                        String str6 = hVarP.B;
                                        list4 = hVarP.A;
                                        spannableString = new SpannableString(str6);
                                        arrayList3 = hVarP.C;
                                        if (arrayList3 != null) {
                                            size8 = arrayList3.size();
                                            i32 = 0;
                                            Obtain = Obtain;
                                            while (i32 < size8) {
                                                int i41110 = size8;
                                                m3.f fVar14 = (m3.f) arrayList3.get(i32);
                                                int i41111 = i32;
                                                m3.i0 i0Var10 = (m3.i0) fVar14.f10423a;
                                                ArrayList arrayList9 = arrayList3;
                                                i33 = fVar14.f10424b;
                                                i34 = fVar14.f10425c;
                                                j3.s sVar9 = sVar5;
                                                j3.k kVar7 = kVar;
                                                jA = i0Var10.f10457a.a();
                                                j3.o oVar10 = oVar;
                                                Resources resources9 = resources;
                                                long j13 = i0Var10.f10458b;
                                                uVar2 = i0Var10.f10459c;
                                                oVar6 = i0Var10.f10460d;
                                                pVar = i0Var10.f10466j;
                                                t3.b bVar4 = i0Var10.f10467k;
                                                u.i0 i0Var11 = i0Var;
                                                ?? r45 = Obtain;
                                                j9 = i0Var10.l;
                                                lVar3 = i0Var10.m;
                                                cVar3 = i0Var10.f10457a;
                                                a5.g gVar9 = gVar;
                                                if (!i2.t.c(jA, cVar3.a())) {
                                                    if (jA != 16) {
                                                        cVar3 = new x3.c(jA);
                                                    } else {
                                                        cVar3 = x3.n.f16422a;
                                                    }
                                                }
                                                rd.a.b0(spannableString, cVar3.a(), i33, i34);
                                                spannableString3 = spannableString;
                                                rd.a.c0(spannableString3, j13, density, i33, i34);
                                                if (uVar2 == null) {
                                                    if (uVar2 == null) {
                                                        uVar3 = q3.u.J;
                                                    } else {
                                                        uVar3 = uVar2;
                                                    }
                                                    if (oVar6 != null) {
                                                        i35 = oVar6.f12746a;
                                                    } else {
                                                        i35 = 0;
                                                    }
                                                    if (uVar3.compareTo(q3.u.D) >= 0) {
                                                        z27 = true;
                                                    } else {
                                                        z27 = false;
                                                    }
                                                    if (i35 == 1) {
                                                        z28 = true;
                                                    } else {
                                                        z28 = false;
                                                    }
                                                    if (!z28) {
                                                        if (z27) {
                                                            i36 = 1;
                                                        } else if (z28) {
                                                            i36 = 2;
                                                        } else {
                                                            i36 = 0;
                                                        }
                                                    } else if (z27) {
                                                        i36 = 1;
                                                    } else if (z28) {
                                                        i36 = 2;
                                                    } else {
                                                        i36 = 0;
                                                    }
                                                    StyleSpan styleSpan6 = new StyleSpan(i36);
                                                    i37 = 33;
                                                    spannableString3.setSpan(styleSpan6, i33, i34, 33);
                                                } else {
                                                    if (uVar2 == null) {
                                                        uVar3 = q3.u.J;
                                                    } else {
                                                        uVar3 = uVar2;
                                                    }
                                                    if (oVar6 != null) {
                                                        i35 = oVar6.f12746a;
                                                    } else {
                                                        i35 = 0;
                                                    }
                                                    if (uVar3.compareTo(q3.u.D) >= 0) {
                                                        z27 = true;
                                                    } else {
                                                        z27 = false;
                                                    }
                                                    if (i35 == 1) {
                                                        z28 = true;
                                                    } else {
                                                        z28 = false;
                                                    }
                                                    if (!z28) {
                                                        if (z27) {
                                                            i36 = 1;
                                                        } else if (z28) {
                                                            i36 = 2;
                                                        } else {
                                                            i36 = 0;
                                                        }
                                                    } else if (z27) {
                                                        i36 = 1;
                                                    } else if (z28) {
                                                        i36 = 2;
                                                    } else {
                                                        i36 = 0;
                                                    }
                                                    StyleSpan styleSpan7 = new StyleSpan(i36);
                                                    i37 = 33;
                                                    spannableString3.setSpan(styleSpan7, i33, i34, 33);
                                                }
                                                if (lVar3 != null) {
                                                    i38 = lVar3.f16420a;
                                                    if ((i38 | 1) == i38) {
                                                        spannableString3.setSpan(new UnderlineSpan(), i33, i34, i37);
                                                    }
                                                    if ((i38 | 2) == i38) {
                                                        spannableString3.setSpan(new StrikethroughSpan(), i33, i34, i37);
                                                    }
                                                }
                                                if (pVar != null) {
                                                    spannableString3.setSpan(new ScaleXSpan(pVar.f16424a), i33, i34, i37);
                                                }
                                                rd.a.d0(spannableString3, bVar4, i33, i34);
                                                if (j9 != 16) {
                                                    spannableString3.setSpan(new BackgroundColorSpan(i2.b0.C(j9)), i33, i34, i37);
                                                }
                                                i32 = i41111 + 1;
                                                spannableString = spannableString3;
                                                size8 = i41110;
                                                arrayList3 = arrayList9;
                                                sVar5 = sVar9;
                                                kVar = kVar7;
                                                oVar = oVar10;
                                                resources = resources9;
                                                Obtain = r45;
                                                i0Var = i0Var11;
                                                gVar = gVar9;
                                            }
                                        }
                                        sVar = sVar5;
                                        kVar2 = kVar;
                                        i0Var2 = i0Var;
                                        r41 = Obtain;
                                        a5.g gVar10 = gVar;
                                        spannableString2 = spannableString;
                                        oVar2 = oVar;
                                        resources2 = resources;
                                        int length7 = str6.length();
                                        arrayList4 = h00.x.A;
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size7 = list4.size();
                                            while (i31 < size7) {
                                                Object obj8 = list4.get(i31);
                                                fVar3 = (m3.f) obj8;
                                                if (!(fVar3.f10423a instanceof m3.t0)) {
                                                }
                                            }
                                        } else {
                                            arrayList5 = arrayList4;
                                        }
                                        size3 = arrayList5.size();
                                        while (i23 < size3) {
                                            m3.f fVar15 = (m3.f) arrayList5.get(i23);
                                            t0Var4 = (m3.t0) fVar15.f10423a;
                                            i29 = fVar15.f10424b;
                                            i30 = fVar15.f10425c;
                                            if (t0Var4 instanceof m3.t0) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(t0Var4.f10536a).build(), i29, i30, 33);
                                        }
                                        int length8 = str6.length();
                                        if (list4 != null) {
                                            arrayList4 = new ArrayList(list4.size());
                                            size6 = list4.size();
                                            while (i28 < size6) {
                                                Object obj9 = list4.get(i28);
                                                fVar2 = (m3.f) obj9;
                                                if (!(fVar2.f10423a instanceof m3.s0)) {
                                                }
                                            }
                                        }
                                        size4 = arrayList4.size();
                                        while (i24 < size4) {
                                            m3.f fVar16 = (m3.f) arrayList4.get(i24);
                                            s0Var = (m3.s0) fVar16.f10423a;
                                            int i41112 = fVar16.f10424b;
                                            int i41113 = fVar16.f10425c;
                                            weakHashMap2 = (WeakHashMap) p1Var.B;
                                            uRLSpan = weakHashMap2.get(s0Var);
                                            if (uRLSpan == null) {
                                                uRLSpan = new URLSpan(s0Var.f10532a);
                                                weakHashMap2.put(s0Var, uRLSpan);
                                            }
                                            spannableString2.setSpan((URLSpan) uRLSpan, i41112, i41113, 33);
                                        }
                                        listA = hVarP.a(str6.length());
                                        size5 = listA.size();
                                        while (i25 < size5) {
                                            fVar = (m3.f) listA.get(i25);
                                            i26 = fVar.f10424b;
                                            obj = fVar.f10423a;
                                            i27 = fVar.f10425c;
                                            if (i26 != i27) {
                                                oVar5 = (m3.o) obj;
                                                if (oVar5 instanceof m3.n) {
                                                    weakHashMap = (WeakHashMap) p1Var.D;
                                                    eVar = weakHashMap.get(fVar);
                                                    if (eVar == null) {
                                                        eVar = new u3.e(oVar5);
                                                        weakHashMap.put(fVar, eVar);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) eVar, i26, i27, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) p1Var.D;
                                                    eVar = weakHashMap.get(fVar);
                                                    if (eVar == null) {
                                                        eVar = new u3.e(oVar5);
                                                        weakHashMap.put(fVar, eVar);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) eVar, i26, i27, 33);
                                                }
                                            }
                                        }
                                        r7 = gVar10;
                                        r4 = (SpannableString) f0.P(spannableString2);
                                    } else {
                                        uVar = uVar;
                                        sVar = sVar5;
                                        kVar2 = kVar;
                                        i0Var2 = i0Var;
                                        r41 = Obtain;
                                        oVar2 = oVar;
                                        resources2 = resources;
                                        r4 = th2;
                                        r7 = gVar;
                                    }
                                    r7.k(r4);
                                    zVar = j3.w.O;
                                    i0Var3 = i0Var2;
                                    if (i0Var3.c(zVar)) {
                                        ?? r112 = r41;
                                        r112.setContentInvalid(true);
                                        objG20 = i0Var3.g(zVar);
                                        if (objG20 == null) {
                                            objG20 = th2;
                                        }
                                        r10.setError((CharSequence) objG20);
                                        r11 = r112;
                                    } else {
                                        r11 = r41;
                                    }
                                    sVar2 = sVar;
                                    Resources resources10 = resources2;
                                    r10.setStateDescription(m0.o(sVar2, resources10));
                                    r10.setCheckable(m0.n(sVar2));
                                    objG2 = i0Var3.g(j3.w.L);
                                    if (objG2 == null) {
                                        objG2 = th2;
                                    }
                                    aVar = (l3.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == l3.a.A) {
                                            r10.setChecked(true);
                                        } else if (aVar == l3.a.B) {
                                            r10.setChecked(false);
                                        }
                                    }
                                    objG3 = i0Var3.g(j3.w.K);
                                    if (objG3 == null) {
                                        objG3 = th2;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (kVar2 == null) {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                        } else {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                            if (kVar3.f7937a == 4) {
                                                r11.setSelected(zBooleanValue2);
                                            }
                                        }
                                        r10.setChecked(zBooleanValue2);
                                    } else {
                                        kVar3 = kVar2;
                                        i15 = 4;
                                    }
                                    oVar3 = oVar2;
                                    if (oVar3.C) {
                                        objG4 = i0Var3.g(j3.w.f7978a);
                                        if (objG4 == null) {
                                            objG4 = th2;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r12 = (String) h00.q.N0(list);
                                        } else {
                                            r12 = th2;
                                        }
                                        r10.setContentDescription(r12);
                                    } else {
                                        objG4 = i0Var3.g(j3.w.f7978a);
                                        if (objG4 == null) {
                                            objG4 = th2;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r12 = (String) h00.q.N0(list);
                                        } else {
                                            r12 = th2;
                                        }
                                        r10.setContentDescription(r12);
                                    }
                                    objG5 = i0Var3.g(j3.w.A);
                                    if (objG5 == null) {
                                        objG5 = th2;
                                    }
                                    str = (String) objG5;
                                    if (str != null) {
                                        sVarL3 = sVar2;
                                        while (true) {
                                            if (sVarL3 != null) {
                                                oVar4 = sVarL3.f7968d;
                                                zVar6 = j3.x.f8002a;
                                                if (oVar4.A.c(zVar6)) {
                                                    zBooleanValue = ((Boolean) oVar4.e(zVar6)).booleanValue();
                                                } else {
                                                    sVarL3 = sVarL3.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            r11.setViewIdResourceName(str);
                                        }
                                    }
                                    objG6 = i0Var3.g(j3.w.f7985h);
                                    if (objG6 == null) {
                                        objG6 = th2;
                                    }
                                    if (((g00.b0) objG6) != null) {
                                        r10.setHeading(true);
                                    }
                                    objG7 = i0Var3.g(j3.w.f7986i);
                                    if (objG7 == null) {
                                        objG7 = th2;
                                    }
                                    if (((g00.b0) objG7) != null) {
                                        r11.setTextEntryKey(true);
                                    }
                                    i16 = i10;
                                    if (i16 != -1) {
                                        iD3 = uVar.d(sVar2.f7970f, -1);
                                        if (iD3 != -1) {
                                            r11.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    r11.setPassword(i0Var3.c(j3.w.N));
                                    objG8 = i0Var3.g(j3.w.Q);
                                    if (objG8 == null) {
                                        objG8 = th2;
                                    }
                                    bool2 = Boolean.TRUE;
                                    r11.setEditable(kotlin.jvm.internal.m.a(objG8, bool2));
                                    objG9 = i0Var3.g(j3.w.R);
                                    if (objG9 == null) {
                                        objG9 = th2;
                                    }
                                    num = (Integer) objG9;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    r10.setMaxTextLength(iIntValue2);
                                    r10.setEnabled(m0.b(sVar2));
                                    zVar2 = j3.w.l;
                                    r10.setFocusable(i0Var3.c(zVar2));
                                    if (r11.isFocusable()) {
                                        r10.setFocused(((Boolean) oVar3.e(zVar2)).booleanValue());
                                        if (r11.isFocused()) {
                                            r7.a(2);
                                            f0 f0Var6 = f0Var2;
                                            f0Var6.L = i16;
                                            f0Var = f0Var6;
                                        } else {
                                            r13 = f0Var2;
                                            z11 = true;
                                            r7.a(1);
                                        }
                                        r10.setVisibleToUser(j3.v.g(sVar2) ^ z11);
                                        if (sVar2.o()) {
                                            sVarL2 = sVar2.l();
                                            kotlin.jvm.internal.m.b(sVarL2);
                                        } else {
                                            sVarL2 = sVar2;
                                        }
                                        if (sVarL2.m().g()) {
                                            r10.setVisibleToUser(false);
                                        }
                                        objG10 = i0Var3.g(j3.w.f7988k);
                                        if (objG10 == null) {
                                            objG10 = th2;
                                        }
                                        hVar = (j3.h) objG10;
                                        if (hVar != null) {
                                            i21 = hVar.f7933a;
                                            if (i21 == 0) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            if (z25) {
                                                if (i21 == 1) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                if (z26) {
                                                    i22 = 2;
                                                } else {
                                                    i22 = 1;
                                                }
                                            } else {
                                                i22 = 1;
                                            }
                                            r11.setLiveRegion(i22);
                                        }
                                        r10.setClickable(false);
                                        objG11 = i0Var3.g(j3.n.f7941b);
                                        if (objG11 == null) {
                                            objG11 = th2;
                                        }
                                        aVar2 = (j3.a) objG11;
                                        if (aVar2 != null) {
                                            objG19 = i0Var3.g(j3.w.K);
                                            if (objG19 == null) {
                                                objG19 = th2;
                                            }
                                            boolean zA10 = kotlin.jvm.internal.m.a(objG19, bool2);
                                            if (kVar3 == null) {
                                                z21 = false;
                                            } else {
                                                z21 = true;
                                            }
                                            if (z21) {
                                                z22 = true;
                                            } else {
                                                if (kVar3 == null) {
                                                    z24 = false;
                                                } else {
                                                    z24 = true;
                                                }
                                                if (z24) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                            }
                                            if (z22) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            r10.setClickable(z23);
                                            if (m0.b(sVar2)) {
                                                r7.b(new a5.c(16, aVar2.f7926a));
                                            }
                                        }
                                        r10.setLongClickable(false);
                                        objG12 = i0Var3.g(j3.n.f7942c);
                                        if (objG12 == null) {
                                            objG12 = th2;
                                        }
                                        aVar3 = (j3.a) objG12;
                                        if (aVar3 != null) {
                                            r10.setLongClickable(true);
                                            if (m0.b(sVar2)) {
                                                r7.b(new a5.c(32, aVar3.f7926a));
                                            }
                                        }
                                        aVar4 = (j3.a) j3.v.f(oVar3, j3.n.f7954q);
                                        if (aVar4 != null) {
                                            r7.b(new a5.c(16384, aVar4.f7926a));
                                        }
                                        if (m0.b(sVar2)) {
                                            aVar11 = (j3.a) j3.v.f(oVar3, j3.n.f7950k);
                                            if (aVar11 != null) {
                                                r7.b(new a5.c(2097152, aVar11.f7926a));
                                            }
                                            aVar12 = (j3.a) j3.v.f(oVar3, j3.n.f7953p);
                                            if (aVar12 != null) {
                                                r7.b(new a5.c(R.id.accessibilityActionImeEnter, aVar12.f7926a));
                                            }
                                            aVar13 = (j3.a) j3.v.f(oVar3, j3.n.f7955r);
                                            if (aVar13 != null) {
                                                r7.b(new a5.c(Cast.MAX_MESSAGE_LENGTH, aVar13.f7926a));
                                            }
                                            aVar14 = (j3.a) j3.v.f(oVar3, j3.n.f7956s);
                                            if (aVar14 != null) {
                                                primaryClipDescription = zVar7.getClipboardManager().a().getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r7.b(new a5.c(32768, aVar14.f7926a));
                                                }
                                            }
                                        }
                                        strT = f0.t(sVar2);
                                        if (strT != null) {
                                            z12 = true;
                                        } else {
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            r11.setTextSelection(r13.r(sVar2), r13.q(sVar2));
                                            aVar10 = (j3.a) j3.v.f(oVar3, j3.n.f7949j);
                                            if (aVar10 != null) {
                                                r16 = aVar10.f7926a;
                                            } else {
                                                r16 = th2;
                                            }
                                            r7.b(new a5.c(131072, (String) r16));
                                            r7.a(256);
                                            r7.a(512);
                                            r10.setMovementGranularities(11);
                                            list3 = (List) j3.v.f(oVar3, j3.w.f7978a);
                                            if (list3 != null) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            if (z19) {
                                                z20 = true;
                                                if (sVar2.f7968d.A.c(j3.w.G)) {
                                                    objG18 = sVar2.f7968d.A.g(j3.w.l);
                                                    if (objG18 == null) {
                                                        objG18 = null;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(objG18, Boolean.TRUE)) {
                                                        l0VarX = sVar2.f7967c.x();
                                                        while (true) {
                                                            if (l0VarX == null) {
                                                                l0VarX = null;
                                                            } else {
                                                                oVarZ2 = l0VarX.z();
                                                                if (oVarZ2 == null) {
                                                                }
                                                                l0VarX = l0VarX.x();
                                                            }
                                                        }
                                                        if (l0VarX == null) {
                                                            z20 = false;
                                                        } else {
                                                            oVarZ = l0VarX.z();
                                                            if (oVarZ != null) {
                                                                Object objG215 = oVarZ.A.g(j3.w.l);
                                                                zA = kotlin.jvm.internal.m.a(objG215 != null ? objG215 : null, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                                z20 = false;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    l0VarX = sVar2.f7967c.x();
                                                    while (true) {
                                                        if (l0VarX == null) {
                                                            l0VarX = null;
                                                        } else {
                                                            oVarZ2 = l0VarX.z();
                                                            if (oVarZ2 == null) {
                                                            }
                                                            l0VarX = l0VarX.x();
                                                        }
                                                    }
                                                    if (l0VarX == null) {
                                                        z20 = false;
                                                    } else {
                                                        oVarZ = l0VarX.z();
                                                        if (oVarZ != null) {
                                                            Object objG216 = oVarZ.A.g(j3.w.l);
                                                            zA = kotlin.jvm.internal.m.a(objG216 != null ? objG216 : null, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                            z20 = false;
                                                        }
                                                    }
                                                }
                                                if (!z20) {
                                                    r10.setMovementGranularities(r11.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        charSequenceF = r7.f();
                                        if (charSequenceF != null) {
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                        }
                                        if (!z13) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (i0Var3.c(j3.w.A)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (i0Var3.c(j3.w.S)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        r11.setAvailableExtraData(arrayList);
                                        jVar = (j3.j) j3.v.f(oVar3, j3.w.f7980c);
                                        if (jVar != null) {
                                            f3 = jVar.f7935a;
                                            aVar9 = jVar.f7936b;
                                            zVar5 = j3.n.f7948i;
                                            if (i0Var3.c(zVar5)) {
                                                r7.g("android.widget.SeekBar");
                                            } else {
                                                r7.g("android.widget.ProgressBar");
                                            }
                                            if (jVar != j3.j.f7934c) {
                                                r11.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, aVar9.A, aVar9.B, f3));
                                            }
                                            if (sVar2.n().A.c(zVar5)) {
                                                fFloatValue = ((Number) aVar9.c()).floatValue();
                                                fFloatValue2 = ((Number) aVar9.a()).floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                if (f3 < fFloatValue) {
                                                    r7.b(a5.c.f174h);
                                                }
                                                fFloatValue3 = ((Number) aVar9.a()).floatValue();
                                                fFloatValue4 = ((Number) aVar9.c()).floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                if (f3 > fFloatValue3) {
                                                    r7.b(a5.c.f175i);
                                                }
                                            }
                                        }
                                        if (m0.b(sVar2)) {
                                            objG17 = sVar2.f7968d.A.g(j3.n.f7948i);
                                            if (objG17 == null) {
                                                objG17 = null;
                                            }
                                            aVar8 = (j3.a) objG17;
                                            if (aVar8 != null) {
                                                r7.b(new a5.c(R.id.accessibilityActionSetProgress, aVar8.f7926a));
                                            }
                                        }
                                        ta.c0.U(r7, sVar2);
                                        ta.c0.V(r7, sVar2);
                                        lVar = (j3.l) j3.v.f(sVar2.n(), j3.w.f7997v);
                                        j3.a aVar111 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7943d);
                                        if (lVar != null) {
                                            objG15 = sVar2.k().A.g(j3.w.f7983f);
                                            if (objG15 == null) {
                                                objG15 = th2;
                                            }
                                            if (objG15 == null) {
                                                objG16 = sVar2.k().A.g(j3.w.f7982e);
                                                if (objG16 == null) {
                                                    objG16 = th2;
                                                }
                                                if (objG16 != null) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                            } else {
                                                z16 = true;
                                            }
                                            if (!z16) {
                                                r7.g("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) lVar.f7939b.invoke()).floatValue() > 0.0f) {
                                                r7.j(true);
                                            }
                                            if (m0.b(sVar2)) {
                                                if (f0.z(lVar)) {
                                                    r7.b(a5.c.f174h);
                                                    l0Var = l0Var2;
                                                    if (l0Var.f2053a0 == y3.m.B) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (z18) {
                                                        cVar2 = a5.c.f181q;
                                                    } else {
                                                        cVar2 = a5.c.f179o;
                                                    }
                                                    r7.b(cVar2);
                                                } else {
                                                    l0Var = l0Var2;
                                                }
                                                if (f0.y(lVar)) {
                                                    r7.b(a5.c.f175i);
                                                    if (l0Var.f2053a0 == y3.m.B) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        cVar = a5.c.f179o;
                                                    } else {
                                                        cVar = a5.c.f181q;
                                                    }
                                                    r7.b(cVar);
                                                }
                                            }
                                        }
                                        lVar2 = (j3.l) j3.v.f(sVar2.n(), j3.w.f7998w);
                                        if (lVar2 != null) {
                                            objG13 = sVar2.k().A.g(j3.w.f7983f);
                                            if (objG13 == null) {
                                                objG13 = th2;
                                            }
                                            if (objG13 == null) {
                                                objG14 = sVar2.k().A.g(j3.w.f7982e);
                                                if (objG14 == null) {
                                                    objG14 = th2;
                                                }
                                                if (objG14 != null) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            } else {
                                                z15 = true;
                                            }
                                            if (!z15) {
                                                r7.g("android.widget.ScrollView");
                                            }
                                            if (((Number) lVar2.f7939b.invoke()).floatValue() > 0.0f) {
                                                r7.j(true);
                                            }
                                            if (m0.b(sVar2)) {
                                                if (f0.z(lVar2)) {
                                                    r7.b(a5.c.f174h);
                                                    r7.b(a5.c.f180p);
                                                }
                                                if (f0.y(lVar2)) {
                                                    r7.b(a5.c.f175i);
                                                    r7.b(a5.c.f178n);
                                                }
                                            }
                                        }
                                        m0.f(r7, sVar2);
                                        r10.setPaneTitle((CharSequence) j3.v.f(sVar2.n(), j3.w.f7981d));
                                        if (m0.b(sVar2)) {
                                            aVar5 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7957t);
                                            if (aVar5 != null) {
                                                r7.b(new a5.c(262144, aVar5.f7926a));
                                            }
                                            aVar6 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7958u);
                                            if (aVar6 != null) {
                                                r7.b(new a5.c(524288, aVar6.f7926a));
                                            }
                                            aVar7 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7959v);
                                            if (aVar7 != null) {
                                                r7.b(new a5.c(1048576, aVar7.f7926a));
                                            }
                                            oVarN = sVar2.n();
                                            zVar4 = j3.n.f7961x;
                                            if (oVarN.A.c(zVar4)) {
                                                list2 = (List) sVar2.n().e(zVar4);
                                                size2 = list2.size();
                                                vVar = f0.f2655n0;
                                                if (size2 < vVar.f14904b) {
                                                    throw new IllegalStateException(g4.c.g(vVar.f14904b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                u.t0 t0Var11 = new u.t0(0);
                                                u.c0 c0VarA7 = u.n0.a();
                                                t0Var3 = t0Var2;
                                                if (v.a.a(t0Var3.A, t0Var3.C, i16) >= 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    c0Var = (u.c0) t0Var3.c(i16);
                                                    iArr = vVar.f14903a;
                                                    i17 = vVar.f14904b;
                                                    iArr2 = new int[16];
                                                    i18 = 0;
                                                    i19 = 0;
                                                    while (i18 < i17) {
                                                        int i41114 = iArr[i18];
                                                        int i512 = i17;
                                                        i20 = i19 + 1;
                                                        u.c0 c0Var9 = c0Var;
                                                        if (iArr2.length < i20) {
                                                            int[] iArrCopyOf7 = Arrays.copyOf(iArr2, Math.max(i20, (iArr2.length * 3) / 2));
                                                            kotlin.jvm.internal.m.d(iArrCopyOf7, "copyOf(...)");
                                                            iArr2 = iArrCopyOf7;
                                                        }
                                                        iArr2[i19] = i41114;
                                                        i18++;
                                                        i19 = i20;
                                                        i17 = i512;
                                                        c0Var = c0Var9;
                                                    }
                                                    c0Var2 = c0Var;
                                                    arrayList2 = new ArrayList();
                                                    if (list2.size() <= 0) {
                                                        a1.b.x(list2.get(0));
                                                        kotlin.jvm.internal.m.b(c0Var2);
                                                        throw th2;
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        a1.b.x(arrayList2.get(0));
                                                        if (i19 > 0) {
                                                            int i513 = iArr2[0];
                                                            throw th2;
                                                        }
                                                        v.a.d("Index must be between 0 and size");
                                                        throw th2;
                                                    }
                                                } else if (list2.size() > 0) {
                                                    a1.b.x(list2.get(0));
                                                    vVar.c(0);
                                                    throw th2;
                                                }
                                                r13.R.e(i16, t0Var11);
                                                t0Var3.e(i16, c0VarA7);
                                            }
                                        }
                                        r10.setScreenReaderFocusable(m0.d(sVar2, resources10));
                                        iD = r13.f2657b0.d(i16, -1);
                                        if (iD != -1) {
                                            jVarV2 = m0.v(zVar7.getAndroidViewsHandler$ui(), iD);
                                            if (jVarV2 != null) {
                                                r10.setTraversalBefore(jVarV2);
                                                zVar3 = zVar7;
                                            } else {
                                                zVar3 = zVar7;
                                                r10.setTraversalBefore(zVar3, iD);
                                            }
                                            ?? r26 = th2;
                                            r13.j(i16, r7, r13.f2659d0, r26);
                                            r14 = r26;
                                        } else {
                                            r14 = th2;
                                            zVar3 = zVar7;
                                        }
                                        iD2 = r13.f2658c0.d(i16, -1);
                                        if (iD2 != -1) {
                                            r10.setTraversalAfter(jVarV);
                                            r13.j(i16, r7, r13.f2660e0, r14);
                                        }
                                        str2 = (String) j3.v.f(sVar2.n(), j3.x.f8003b);
                                        if (str2 != null) {
                                            r7.g(str2);
                                        }
                                        r15 = r7;
                                        r18 = r13;
                                    } else {
                                        f0Var = f0Var2;
                                    }
                                    z11 = true;
                                    r13 = f0Var;
                                    r10.setVisibleToUser(j3.v.g(sVar2) ^ z11);
                                    if (sVar2.o()) {
                                        sVarL2 = sVar2.l();
                                        kotlin.jvm.internal.m.b(sVarL2);
                                    } else {
                                        sVarL2 = sVar2;
                                    }
                                    if (sVarL2.m().g()) {
                                        r10.setVisibleToUser(false);
                                    }
                                    objG10 = i0Var3.g(j3.w.f7988k);
                                    if (objG10 == null) {
                                        objG10 = th2;
                                    }
                                    hVar = (j3.h) objG10;
                                    if (hVar != null) {
                                        i21 = hVar.f7933a;
                                        if (i21 == 0) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                        if (z25) {
                                            if (i21 == 1) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                            if (z26) {
                                                i22 = 2;
                                            } else {
                                                i22 = 1;
                                            }
                                        } else {
                                            i22 = 1;
                                        }
                                        r11.setLiveRegion(i22);
                                    }
                                    r10.setClickable(false);
                                    objG11 = i0Var3.g(j3.n.f7941b);
                                    if (objG11 == null) {
                                        objG11 = th2;
                                    }
                                    aVar2 = (j3.a) objG11;
                                    if (aVar2 != null) {
                                        objG19 = i0Var3.g(j3.w.K);
                                        if (objG19 == null) {
                                            objG19 = th2;
                                        }
                                        boolean zA11 = kotlin.jvm.internal.m.a(objG19, bool2);
                                        if (kVar3 == null) {
                                            z21 = false;
                                        } else {
                                            z21 = true;
                                        }
                                        if (z21) {
                                            z22 = true;
                                        } else {
                                            if (kVar3 == null) {
                                                z24 = false;
                                            } else {
                                                z24 = true;
                                            }
                                            if (z24) {
                                                z22 = true;
                                            } else {
                                                z22 = false;
                                            }
                                        }
                                        if (z22) {
                                            z23 = true;
                                        } else {
                                            z23 = true;
                                        }
                                        r10.setClickable(z23);
                                        if (m0.b(sVar2)) {
                                            r7.b(new a5.c(16, aVar2.f7926a));
                                        }
                                    }
                                    r10.setLongClickable(false);
                                    objG12 = i0Var3.g(j3.n.f7942c);
                                    if (objG12 == null) {
                                        objG12 = th2;
                                    }
                                    aVar3 = (j3.a) objG12;
                                    if (aVar3 != null) {
                                        r10.setLongClickable(true);
                                        if (m0.b(sVar2)) {
                                            r7.b(new a5.c(32, aVar3.f7926a));
                                        }
                                    }
                                    aVar4 = (j3.a) j3.v.f(oVar3, j3.n.f7954q);
                                    if (aVar4 != null) {
                                        r7.b(new a5.c(16384, aVar4.f7926a));
                                    }
                                    if (m0.b(sVar2)) {
                                        aVar11 = (j3.a) j3.v.f(oVar3, j3.n.f7950k);
                                        if (aVar11 != null) {
                                            r7.b(new a5.c(2097152, aVar11.f7926a));
                                        }
                                        aVar12 = (j3.a) j3.v.f(oVar3, j3.n.f7953p);
                                        if (aVar12 != null) {
                                            r7.b(new a5.c(R.id.accessibilityActionImeEnter, aVar12.f7926a));
                                        }
                                        aVar13 = (j3.a) j3.v.f(oVar3, j3.n.f7955r);
                                        if (aVar13 != null) {
                                            r7.b(new a5.c(Cast.MAX_MESSAGE_LENGTH, aVar13.f7926a));
                                        }
                                        aVar14 = (j3.a) j3.v.f(oVar3, j3.n.f7956s);
                                        if (aVar14 != null) {
                                            primaryClipDescription = zVar7.getClipboardManager().a().getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                r7.b(new a5.c(32768, aVar14.f7926a));
                                            }
                                        }
                                    }
                                    strT = f0.t(sVar2);
                                    if (strT != null) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        r11.setTextSelection(r13.r(sVar2), r13.q(sVar2));
                                        aVar10 = (j3.a) j3.v.f(oVar3, j3.n.f7949j);
                                        if (aVar10 != null) {
                                            r16 = aVar10.f7926a;
                                        } else {
                                            r16 = th2;
                                        }
                                        r7.b(new a5.c(131072, (String) r16));
                                        r7.a(256);
                                        r7.a(512);
                                        r10.setMovementGranularities(11);
                                        list3 = (List) j3.v.f(oVar3, j3.w.f7978a);
                                        if (list3 != null) {
                                            z19 = true;
                                        } else {
                                            z19 = true;
                                        }
                                        if (z19) {
                                            z20 = true;
                                            if (sVar2.f7968d.A.c(j3.w.G)) {
                                                objG18 = sVar2.f7968d.A.g(j3.w.l);
                                                if (objG18 == null) {
                                                    objG18 = null;
                                                }
                                                if (kotlin.jvm.internal.m.a(objG18, Boolean.TRUE)) {
                                                    l0VarX = sVar2.f7967c.x();
                                                    while (true) {
                                                        if (l0VarX == null) {
                                                            l0VarX = null;
                                                        } else {
                                                            oVarZ2 = l0VarX.z();
                                                            if (oVarZ2 == null) {
                                                            }
                                                            l0VarX = l0VarX.x();
                                                        }
                                                    }
                                                    if (l0VarX == null) {
                                                        z20 = false;
                                                    } else {
                                                        oVarZ = l0VarX.z();
                                                        if (oVarZ != null) {
                                                            Object objG217 = oVarZ.A.g(j3.w.l);
                                                            zA = kotlin.jvm.internal.m.a(objG217 != null ? objG217 : null, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                            z20 = false;
                                                        }
                                                    }
                                                }
                                            } else {
                                                l0VarX = sVar2.f7967c.x();
                                                while (true) {
                                                    if (l0VarX == null) {
                                                        l0VarX = null;
                                                    } else {
                                                        oVarZ2 = l0VarX.z();
                                                        if (oVarZ2 == null) {
                                                        }
                                                        l0VarX = l0VarX.x();
                                                    }
                                                }
                                                if (l0VarX == null) {
                                                    z20 = false;
                                                } else {
                                                    oVarZ = l0VarX.z();
                                                    if (oVarZ != null) {
                                                        Object objG218 = oVarZ.A.g(j3.w.l);
                                                        zA = kotlin.jvm.internal.m.a(objG218 != null ? objG218 : null, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                        z20 = false;
                                                    }
                                                }
                                            }
                                            if (!z20) {
                                                r10.setMovementGranularities(r11.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList.add("androidx.compose.ui.semantics.id");
                                    charSequenceF = r7.f();
                                    if (charSequenceF != null) {
                                        z13 = true;
                                    } else {
                                        z13 = true;
                                    }
                                    if (!z13) {
                                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (i0Var3.c(j3.w.A)) {
                                        arrayList.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (i0Var3.c(j3.w.S)) {
                                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                    }
                                    r11.setAvailableExtraData(arrayList);
                                    jVar = (j3.j) j3.v.f(oVar3, j3.w.f7980c);
                                    if (jVar != null) {
                                        f3 = jVar.f7935a;
                                        aVar9 = jVar.f7936b;
                                        zVar5 = j3.n.f7948i;
                                        if (i0Var3.c(zVar5)) {
                                            r7.g("android.widget.SeekBar");
                                        } else {
                                            r7.g("android.widget.ProgressBar");
                                        }
                                        if (jVar != j3.j.f7934c) {
                                            r11.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, aVar9.A, aVar9.B, f3));
                                        }
                                        if (sVar2.n().A.c(zVar5)) {
                                            fFloatValue = ((Number) aVar9.c()).floatValue();
                                            fFloatValue2 = ((Number) aVar9.a()).floatValue();
                                            if (fFloatValue < fFloatValue2) {
                                                fFloatValue = fFloatValue2;
                                            }
                                            if (f3 < fFloatValue) {
                                                r7.b(a5.c.f174h);
                                            }
                                            fFloatValue3 = ((Number) aVar9.a()).floatValue();
                                            fFloatValue4 = ((Number) aVar9.c()).floatValue();
                                            if (fFloatValue3 > fFloatValue4) {
                                                fFloatValue3 = fFloatValue4;
                                            }
                                            if (f3 > fFloatValue3) {
                                                r7.b(a5.c.f175i);
                                            }
                                        }
                                    }
                                    if (m0.b(sVar2)) {
                                        objG17 = sVar2.f7968d.A.g(j3.n.f7948i);
                                        if (objG17 == null) {
                                            objG17 = null;
                                        }
                                        aVar8 = (j3.a) objG17;
                                        if (aVar8 != null) {
                                            r7.b(new a5.c(R.id.accessibilityActionSetProgress, aVar8.f7926a));
                                        }
                                    }
                                    ta.c0.U(r7, sVar2);
                                    ta.c0.V(r7, sVar2);
                                    lVar = (j3.l) j3.v.f(sVar2.n(), j3.w.f7997v);
                                    j3.a aVar112 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7943d);
                                    if (lVar != null) {
                                        objG15 = sVar2.k().A.g(j3.w.f7983f);
                                        if (objG15 == null) {
                                            objG15 = th2;
                                        }
                                        if (objG15 == null) {
                                            objG16 = sVar2.k().A.g(j3.w.f7982e);
                                            if (objG16 == null) {
                                                objG16 = th2;
                                            }
                                            if (objG16 != null) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (!z16) {
                                            r7.g("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) lVar.f7939b.invoke()).floatValue() > 0.0f) {
                                            r7.j(true);
                                        }
                                        if (m0.b(sVar2)) {
                                            if (f0.z(lVar)) {
                                                r7.b(a5.c.f174h);
                                                l0Var = l0Var2;
                                                if (l0Var.f2053a0 == y3.m.B) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    cVar2 = a5.c.f181q;
                                                } else {
                                                    cVar2 = a5.c.f179o;
                                                }
                                                r7.b(cVar2);
                                            } else {
                                                l0Var = l0Var2;
                                            }
                                            if (f0.y(lVar)) {
                                                r7.b(a5.c.f175i);
                                                if (l0Var.f2053a0 == y3.m.B) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    cVar = a5.c.f179o;
                                                } else {
                                                    cVar = a5.c.f181q;
                                                }
                                                r7.b(cVar);
                                            }
                                        }
                                    }
                                    lVar2 = (j3.l) j3.v.f(sVar2.n(), j3.w.f7998w);
                                    if (lVar2 != null) {
                                        objG13 = sVar2.k().A.g(j3.w.f7983f);
                                        if (objG13 == null) {
                                            objG13 = th2;
                                        }
                                        if (objG13 == null) {
                                            objG14 = sVar2.k().A.g(j3.w.f7982e);
                                            if (objG14 == null) {
                                                objG14 = th2;
                                            }
                                            if (objG14 != null) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        } else {
                                            z15 = true;
                                        }
                                        if (!z15) {
                                            r7.g("android.widget.ScrollView");
                                        }
                                        if (((Number) lVar2.f7939b.invoke()).floatValue() > 0.0f) {
                                            r7.j(true);
                                        }
                                        if (m0.b(sVar2)) {
                                            if (f0.z(lVar2)) {
                                                r7.b(a5.c.f174h);
                                                r7.b(a5.c.f180p);
                                            }
                                            if (f0.y(lVar2)) {
                                                r7.b(a5.c.f175i);
                                                r7.b(a5.c.f178n);
                                            }
                                        }
                                    }
                                    m0.f(r7, sVar2);
                                    r10.setPaneTitle((CharSequence) j3.v.f(sVar2.n(), j3.w.f7981d));
                                    if (m0.b(sVar2)) {
                                        aVar5 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7957t);
                                        if (aVar5 != null) {
                                            r7.b(new a5.c(262144, aVar5.f7926a));
                                        }
                                        aVar6 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7958u);
                                        if (aVar6 != null) {
                                            r7.b(new a5.c(524288, aVar6.f7926a));
                                        }
                                        aVar7 = (j3.a) j3.v.f(sVar2.n(), j3.n.f7959v);
                                        if (aVar7 != null) {
                                            r7.b(new a5.c(1048576, aVar7.f7926a));
                                        }
                                        oVarN = sVar2.n();
                                        zVar4 = j3.n.f7961x;
                                        if (oVarN.A.c(zVar4)) {
                                            list2 = (List) sVar2.n().e(zVar4);
                                            size2 = list2.size();
                                            vVar = f0.f2655n0;
                                            if (size2 < vVar.f14904b) {
                                                throw new IllegalStateException(g4.c.g(vVar.f14904b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                            }
                                            u.t0 t0Var12 = new u.t0(0);
                                            u.c0 c0VarA8 = u.n0.a();
                                            t0Var3 = t0Var2;
                                            if (v.a.a(t0Var3.A, t0Var3.C, i16) >= 0) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                c0Var = (u.c0) t0Var3.c(i16);
                                                iArr = vVar.f14903a;
                                                i17 = vVar.f14904b;
                                                iArr2 = new int[16];
                                                i18 = 0;
                                                i19 = 0;
                                                while (i18 < i17) {
                                                    int i41115 = iArr[i18];
                                                    int i514 = i17;
                                                    i20 = i19 + 1;
                                                    u.c0 c0Var10 = c0Var;
                                                    if (iArr2.length < i20) {
                                                        int[] iArrCopyOf8 = Arrays.copyOf(iArr2, Math.max(i20, (iArr2.length * 3) / 2));
                                                        kotlin.jvm.internal.m.d(iArrCopyOf8, "copyOf(...)");
                                                        iArr2 = iArrCopyOf8;
                                                    }
                                                    iArr2[i19] = i41115;
                                                    i18++;
                                                    i19 = i20;
                                                    i17 = i514;
                                                    c0Var = c0Var10;
                                                }
                                                c0Var2 = c0Var;
                                                arrayList2 = new ArrayList();
                                                if (list2.size() <= 0) {
                                                    a1.b.x(list2.get(0));
                                                    kotlin.jvm.internal.m.b(c0Var2);
                                                    throw th2;
                                                }
                                                if (arrayList2.size() > 0) {
                                                    a1.b.x(arrayList2.get(0));
                                                    if (i19 > 0) {
                                                        int i515 = iArr2[0];
                                                        throw th2;
                                                    }
                                                    v.a.d("Index must be between 0 and size");
                                                    throw th2;
                                                }
                                            } else if (list2.size() > 0) {
                                                a1.b.x(list2.get(0));
                                                vVar.c(0);
                                                throw th2;
                                            }
                                            r13.R.e(i16, t0Var12);
                                            t0Var3.e(i16, c0VarA8);
                                        }
                                    }
                                    r10.setScreenReaderFocusable(m0.d(sVar2, resources10));
                                    iD = r13.f2657b0.d(i16, -1);
                                    if (iD != -1) {
                                        jVarV2 = m0.v(zVar7.getAndroidViewsHandler$ui(), iD);
                                        if (jVarV2 != null) {
                                            r10.setTraversalBefore(jVarV2);
                                            zVar3 = zVar7;
                                        } else {
                                            zVar3 = zVar7;
                                            r10.setTraversalBefore(zVar3, iD);
                                        }
                                        ?? r27 = th2;
                                        r13.j(i16, r7, r13.f2659d0, r27);
                                        r14 = r27;
                                    } else {
                                        r14 = th2;
                                        zVar3 = zVar7;
                                    }
                                    iD2 = r13.f2658c0.d(i16, -1);
                                    if (iD2 != -1) {
                                        r10.setTraversalAfter(jVarV);
                                        r13.j(i16, r7, r13.f2660e0, r14);
                                    }
                                    str2 = (String) j3.v.f(sVar2.n(), j3.x.f8003b);
                                    if (str2 != null) {
                                        r7.g(str2);
                                    }
                                    r15 = r7;
                                    r18 = r13;
                                }
                            }
                        } else {
                            r18 = f0Var2;
                            i16 = i10;
                            r15 = 0;
                        }
                    }
                }
                if (r18.O) {
                    if (i16 == r18.K) {
                        r18.M = r15;
                    }
                    if (i16 == r18.L) {
                        r18.N = r15;
                    }
                }
                return r15;
            default:
                return new a5.g(AccessibilityNodeInfo.obtain(((p5.a) this.E).n(i10).f187a));
        }
    }

    @Override
    public final a5.g L(int i10) {
        switch (this.D) {
            case 0:
                f0 f0Var = (f0) this.E;
                if (i10 != 1) {
                    if (i10 == 2) {
                        return I(f0Var.K);
                    }
                    throw new IllegalArgumentException(g4.c.f(i10, "Unknown focus type: "));
                }
                int i11 = f0Var.L;
                if (i11 == Integer.MIN_VALUE) {
                    return null;
                }
                return I(i11);
            default:
                p5.a aVar = (p5.a) this.E;
                int i12 = i10 == 2 ? aVar.K : aVar.L;
                if (i12 == Integer.MIN_VALUE) {
                    return null;
                }
                return I(i12);
        }
    }

    @Override
    public final boolean O(int r28, int r29, android.os.Bundle r30) {
        throw new UnsupportedOperationException("Method not decompiled: c3.a0.O(int, int, android.os.Bundle):boolean");
    }
}
