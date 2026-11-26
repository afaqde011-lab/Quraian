package u3;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import h00.r;
import i2.b0;
import i2.s0;
import i2.t;
import i2.v0;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.jvm.internal.m;
import l1.p2;
import m3.i0;
import m3.r0;
import m3.u;
import m3.v;
import m3.x;
import m3.z;
import q3.g0;
import q3.h0;
import q3.o;
import r30.k;
import sd.p1;
import x3.l;
import x3.p;
import x3.q;
import x3.s;

public final class c implements u {
    public final String A;
    public final r0 B;
    public final List C;
    public final List D;
    public final q3.h E;
    public final y3.c F;
    public final d G;
    public final CharSequence H;
    public final n3.e I;
    public p1 J;
    public final boolean K;
    public final int L;

    public c(String str, r0 r0Var, List list, List list2, q3.h hVar, y3.c cVar) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i10;
        Object obj;
        Typeface typeface;
        ?? arrayList;
        CharSequence charSequence;
        Spannable spannableString;
        i0 i0Var;
        v vVar;
        z zVar;
        boolean z10;
        x3.i iVar;
        float fA0;
        int length;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        q qVar;
        v vVar2;
        ArrayList arrayList2;
        int size;
        int i13;
        i0 i0Var2;
        q3.i iVar2;
        boolean z13;
        i0 i0Var3;
        c0.f fVar;
        int size2;
        int i14;
        int[] iArr;
        int size3;
        int i15;
        int i16;
        int i17;
        int i18;
        int size4;
        int i19;
        ArrayList arrayList3;
        v vVar3;
        int i20;
        int i21;
        int i22;
        v vVar4;
        int size5;
        int i23;
        boolean z14;
        boolean z15;
        y3.c cVar2;
        q qVar2;
        int size6;
        int i24;
        int i25;
        m3.f fVar2;
        long j9;
        long jB;
        int size7;
        int i26;
        m3.f fVar3;
        m3.c cVar3;
        int i27;
        int i28;
        Object eVar;
        m3.f fVar4;
        Object obj2;
        int i29;
        y3.c cVar4;
        v vVar5;
        boolean z16;
        int i30;
        int i31;
        int i32;
        m3.f fVar5;
        Object obj3;
        i0 i0Var4;
        boolean z17;
        int i33;
        long j10;
        long j11;
        long jB2;
        float fC;
        long jB3;
        float fC2;
        x xVar;
        CharSequence charSequence2;
        x xVar2;
        this.A = str;
        this.B = r0Var;
        this.C = list;
        this.D = list2;
        this.E = hVar;
        this.F = cVar;
        float fC3 = cVar.c();
        d dVar = new d(1);
        ((TextPaint) dVar).density = fC3;
        dVar.f14927b = l.f16417b;
        int i34 = 3;
        dVar.f14928c = 3;
        dVar.f14929d = s0.f7158d;
        this.G = dVar;
        boolean zA = i.a(r0Var);
        i0 i0Var5 = r0Var.f10522a;
        v vVar6 = r0Var.f10523b;
        if (zA) {
            o9.q qVar3 = h.f14936a;
            o9.q qVar4 = h.f14936a;
            p2 p2VarI = (p2) qVar4.B;
            if (p2VarI == null) {
                if (v5.g.d()) {
                    p2VarI = qVar4.I();
                    qVar4.B = p2VarI;
                } else {
                    p2VarI = i.f14937a;
                }
            }
            zBooleanValue = ((Boolean) p2VarI.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.K = zBooleanValue;
        int i35 = vVar6.f10538b;
        t3.b bVar = i0Var5.f10467k;
        if (i35 == 4) {
            i10 = 2;
        } else if (i35 == 5) {
            i10 = 3;
        } else if (i35 == 1) {
            i10 = 0;
        } else if (i35 == 2) {
            i10 = 1;
        } else {
            if (i35 != 3 && i35 != 0) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar == null || (locale = ((t3.a) bVar.A.get(0)).f14352a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i10 = 2;
            } else {
                i10 = 3;
            }
        }
        this.L = i10;
        j0.g gVar = new j0.g(this, i34);
        s sVar = vVar6.f10545i;
        sVar = sVar == null ? s.f16430c : sVar;
        dVar.setFlags(sVar.f16433b ? dVar.getFlags() | Cast.MAX_NAMESPACE_LENGTH : dVar.getFlags() & (-129));
        int i36 = sVar.f16432a;
        if (i36 == 1) {
            dVar.setFlags(dVar.getFlags() | 64);
            dVar.setHinting(0);
        } else if (i36 == 2) {
            dVar.getFlags();
            dVar.setHinting(1);
        } else if (i36 == 3) {
            dVar.getFlags();
            dVar.setHinting(0);
        } else {
            dVar.getFlags();
        }
        int size8 = list.size();
        int i37 = 0;
        while (true) {
            if (i37 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i37);
            if (((m3.f) obj).f10423a instanceof i0) {
                break;
            } else {
                i37++;
            }
        }
        boolean z18 = obj != null;
        long j12 = i0Var5.f10458b;
        q3.u uVar = i0Var5.f10459c;
        o oVar = i0Var5.f10460d;
        String str2 = i0Var5.f10463g;
        t3.b bVar2 = i0Var5.f10467k;
        x3.o oVar2 = i0Var5.f10457a;
        p pVar = i0Var5.f10466j;
        long j13 = i0Var5.f10464h;
        long jB4 = y3.o.b(j12);
        boolean z19 = z18;
        if (y3.p.a(jB4, 4294967296L)) {
            dVar.setTextSize(cVar.f1(j12));
        } else if (y3.p.a(jB4, 8589934592L)) {
            dVar.setTextSize(y3.o.c(j12) * dVar.getTextSize());
        }
        q3.i iVar3 = i0Var5.f10462f;
        if (iVar3 != null || oVar != null || uVar != null) {
            q3.u uVar2 = uVar == null ? q3.u.J : uVar;
            int i38 = oVar != null ? oVar.f12746a : 0;
            q3.p pVar2 = i0Var5.f10461e;
            int i39 = pVar2 != null ? pVar2.f12747a : 65535;
            c cVar5 = (c) gVar.B;
            h0 h0VarB = ((q3.j) cVar5.E).b(iVar3, uVar2, i38, i39);
            if (h0VarB instanceof g0) {
                Object obj4 = ((g0) h0VarB).A;
                m.c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj4;
            } else {
                p1 p1Var = new p1(h0VarB, cVar5.J);
                cVar5.J = p1Var;
                Object obj5 = p1Var.D;
                m.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj5;
            }
            dVar.setTypeface(typeface);
        }
        if (bVar2 != null) {
            t3.b bVar3 = t3.b.C;
            if (!bVar2.equals(t3.c.f14353a.q())) {
                ArrayList arrayList4 = new ArrayList(r.q0(bVar2, 10));
                Iterator it = bVar2.A.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((t3.a) it.next()).f14352a);
                }
                Locale[] localeArr = (Locale[]) arrayList4.toArray(new Locale[0]);
                dVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals(RuntimeVersion.SUFFIX)) {
            dVar.setFontFeatureSettings(str2);
        }
        if (pVar != null && !pVar.equals(p.f16423c)) {
            dVar.setTextScaleX(dVar.getTextScaleX() * pVar.f16424a);
            dVar.setTextSkewX(dVar.getTextSkewX() + pVar.f16425b);
        }
        dVar.d(oVar2.a());
        dVar.c(oVar2.b(), 9205357640488583168L, oVar2.c());
        dVar.f(i0Var5.f10468n);
        dVar.g(i0Var5.m);
        dVar.e(i0Var5.f10470p);
        if (y3.p.a(y3.o.b(j13), 4294967296L) && y3.o.c(j13) != 0.0f) {
            float textScaleX = dVar.getTextScaleX() * dVar.getTextSize();
            float fF1 = cVar.f1(j13);
            if (textScaleX != 0.0f) {
                dVar.setLetterSpacing(fF1 / textScaleX);
            }
        } else if (y3.p.a(y3.o.b(j13), 8589934592L)) {
            dVar.setLetterSpacing(y3.o.c(j13));
        }
        long j14 = i0Var5.l;
        x3.a aVar = i0Var5.f10465i;
        boolean z20 = z19 && y3.p.a(y3.o.b(j13), 4294967296L) && y3.o.c(j13) != 0.0f;
        long j15 = t.f7167g;
        boolean z21 = (t.c(j14, j15) || t.c(j14, t.f7166f)) ? false : true;
        boolean z22 = (aVar == null || Float.compare(aVar.f16399a, 0.0f) == 0) ? false : true;
        i0 i0Var6 = (z20 || z21 || z22) ? new i0(0L, 0L, (q3.u) null, (o) null, (q3.p) null, (q3.i) null, (String) null, z20 ? j13 : y3.o.f16599c, z22 ? aVar : null, (p) null, (t3.b) null, z21 ? j14 : j15, (l) null, (s0) null, 63103) : null;
        if (i0Var6 != null) {
            int size9 = this.C.size() + 1;
            arrayList = new ArrayList(size9);
            int i40 = 0;
            while (i40 < size9) {
                arrayList.add(i40 == 0 ? new m3.f(i0Var6, 0, this.A.length()) : (m3.f) this.C.get(i40 - 1));
                i40++;
            }
        } else {
            arrayList = this.C;
        }
        String str3 = this.A;
        float textSize = this.G.getTextSize();
        r0 r0Var2 = this.B;
        List list3 = this.D;
        y3.c cVar6 = this.F;
        boolean z23 = this.K;
        a aVar2 = b.f14925a;
        if (z23 && v5.g.d()) {
            z zVar2 = r0Var2.f10524c;
            m3.l lVar = (zVar2 == null || (xVar2 = zVar2.f10553b) == null) ? null : new m3.l(xVar2.f10550b);
            CharSequence charSequenceG = v5.g.a().g(0, str3.length(), (lVar != null && lVar.f10477a == 2) ? 1 : 0, str3);
            m.b(charSequenceG);
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (arrayList.isEmpty() && list3.isEmpty() && m.a(r0Var2.f10523b.f10540d, q.f16426c)) {
            charSequence2 = charSequence;
            if ((r0Var2.f10523b.f10539c & 1095216660480L) != 0) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                i0Var = r0Var2.f10522a;
                vVar = r0Var2.f10523b;
                if (m.a(i0Var.m, l.f16418c)) {
                    spannableString.setSpan(b.f14925a, 0, str3.length(), 33);
                }
                zVar = r0Var2.f10524c;
                if (zVar != null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    iVar = vVar.f10542f;
                    if (iVar == null) {
                    }
                    fA0 = rd.a.a0(vVar.f10539c, textSize, cVar6);
                    if (Float.isNaN(fA0)) {
                        i12 = 0;
                    } else {
                        if (spannableString.length() == 0) {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i41 = length;
                        i11 = iVar.f16414b;
                        if ((i11 & 1) > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i11 & 16) > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i12 = 0;
                        spannableString.setSpan(new p3.h(fA0, i41, z11, z12, iVar.f16413a, iVar.f16415c), 0, spannableString.length(), 33);
                    }
                } else {
                    iVar = vVar.f10542f;
                    if (iVar == null) {
                    }
                    fA0 = rd.a.a0(vVar.f10539c, textSize, cVar6);
                    if (Float.isNaN(fA0)) {
                        if (spannableString.length() == 0) {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i42 = length;
                        i11 = iVar.f16414b;
                        if ((i11 & 1) > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i11 & 16) > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i12 = 0;
                        spannableString.setSpan(new p3.h(fA0, i42, z11, z12, iVar.f16413a, iVar.f16415c), 0, spannableString.length(), 33);
                    } else {
                        i12 = 0;
                    }
                }
                qVar = vVar.f10540d;
                if (qVar != null) {
                    i33 = i12;
                    j10 = qVar.f16427a;
                    j11 = qVar.f16428b;
                    vVar2 = vVar;
                    if (y3.o.a(j10, kh.o.z(i33))) {
                        jB2 = y3.o.b(j10);
                        if (y3.p.a(jB2, 4294967296L)) {
                            fC = cVar6.f1(j10);
                        } else if (y3.p.a(jB2, 8589934592L)) {
                            fC = y3.o.c(j10) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = y3.o.b(j11);
                        if (y3.p.a(jB3, 4294967296L)) {
                            fC2 = cVar6.f1(j11);
                        } else if (y3.p.a(jB3, 8589934592L)) {
                            fC2 = y3.o.c(j11) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    } else {
                        jB2 = y3.o.b(j10);
                        if (y3.p.a(jB2, 4294967296L)) {
                            fC = cVar6.f1(j10);
                        } else if (y3.p.a(jB2, 8589934592L)) {
                            fC = y3.o.c(j10) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = y3.o.b(j11);
                        if (y3.p.a(jB3, 4294967296L)) {
                            fC2 = cVar6.f1(j11);
                        } else if (y3.p.a(jB3, 8589934592L)) {
                            fC2 = y3.o.c(j11) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                    arrayList2 = new ArrayList(arrayList.size());
                    size = arrayList.size();
                    for (i13 = 0; i13 < size; i13++) {
                        fVar5 = (m3.f) arrayList.get(i13);
                        obj3 = fVar5.f10423a;
                        if (obj3 instanceof i0) {
                            i0Var4 = (i0) obj3;
                            if (i0Var4.f10462f != null) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            if (z17) {
                                arrayList2.add(fVar5);
                            } else {
                                arrayList2.add(fVar5);
                            }
                        }
                    }
                    i0Var2 = r0Var2.f10522a;
                    iVar2 = i0Var2.f10462f;
                    if (iVar2 != null) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                    } else {
                        i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                    }
                    fVar = new c0.f(spannableString, gVar, 20);
                    if (arrayList2.size() <= 1) {
                        size2 = arrayList2.size();
                        i14 = size2 * 2;
                        iArr = new int[i14];
                        size3 = arrayList2.size();
                        for (i15 = 0; i15 < size3; i15++) {
                            m3.f fVar6 = (m3.f) arrayList2.get(i15);
                            iArr[i15] = fVar6.f10424b;
                            iArr[i15 + size2] = fVar6.f10425c;
                        }
                        if (i14 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i14 != 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        i16 = iArr[0];
                        i17 = 0;
                        while (i17 < i14) {
                            i18 = iArr[i17];
                            if (i18 == i16) {
                                arrayList3 = arrayList2;
                                vVar3 = vVar2;
                                i20 = i17;
                            } else {
                                size4 = arrayList2.size();
                                i19 = 0;
                                while (i19 < size4) {
                                    ArrayList arrayList5 = arrayList2;
                                    m3.f fVar7 = (m3.f) arrayList2.get(i19);
                                    v vVar7 = vVar2;
                                    i21 = fVar7.f10424b;
                                    int i43 = i17;
                                    i22 = fVar7.f10425c;
                                    if (i21 == i22) {
                                    }
                                    i19++;
                                    arrayList2 = arrayList5;
                                    vVar2 = vVar7;
                                    i17 = i43;
                                }
                                arrayList3 = arrayList2;
                                vVar3 = vVar2;
                                i20 = i17;
                                if (i0Var3 != null) {
                                    fVar.invoke(i0Var3, Integer.valueOf(i16), Integer.valueOf(i18));
                                }
                                i16 = i18;
                            }
                            i17 = i20 + 1;
                            i0Var3 = i0Var3;
                            arrayList2 = arrayList3;
                            vVar2 = vVar3;
                        }
                    } else if (!arrayList2.isEmpty()) {
                        i0 i0Var7 = (i0) ((m3.f) arrayList2.get(0)).f10423a;
                        fVar.invoke(i0Var3 != null ? i0Var3.c(i0Var7) : i0Var7, Integer.valueOf(((m3.f) arrayList2.get(0)).f10424b), Integer.valueOf(((m3.f) arrayList2.get(0)).f10425c));
                    }
                    vVar4 = vVar2;
                    size5 = arrayList.size();
                    i23 = 0;
                    z14 = false;
                    while (i23 < size5) {
                        fVar4 = (m3.f) arrayList.get(i23);
                        obj2 = fVar4.f10423a;
                        if (obj2 instanceof i0) {
                            i30 = fVar4.f10424b;
                            int i44 = fVar4.f10425c;
                            if (i30 >= 0) {
                                size5 = size5;
                                i29 = i23;
                                z14 = z14;
                                cVar4 = cVar6;
                                vVar5 = vVar4;
                                z16 = z14;
                            } else {
                                size5 = size5;
                                i29 = i23;
                                z14 = z14;
                                cVar4 = cVar6;
                                vVar5 = vVar4;
                                z16 = z14;
                            }
                        } else {
                            size5 = size5;
                            i29 = i23;
                            z14 = z14;
                            cVar4 = cVar6;
                            vVar5 = vVar4;
                            z16 = z14;
                        }
                        vVar4 = vVar5;
                        cVar6 = cVar4;
                        size5 = size5;
                        z14 = z16;
                        i23 = i29 + 1;
                    }
                    z15 = z14;
                    cVar2 = cVar6;
                    v vVar8 = vVar4;
                    if (z15) {
                        size7 = arrayList.size();
                        i26 = 0;
                        while (i26 < size7) {
                            fVar3 = (m3.f) arrayList.get(i26);
                            cVar3 = (m3.c) fVar3.f10423a;
                            if (cVar3 instanceof i0) {
                                i28 = fVar3.f10424b;
                                int i45 = fVar3.f10425c;
                                if (i28 >= 0) {
                                    i27 = size7;
                                } else {
                                    i27 = size7;
                                }
                            } else {
                                i27 = size7;
                            }
                            i26++;
                            size7 = i27;
                        }
                    }
                    qVar2 = vVar8.f10540d;
                    if (qVar2 != null) {
                        j9 = qVar2.f16427a;
                        jB = y3.o.b(j9);
                        if (y3.p.a(jB, 4294967296L)) {
                            cVar2.f1(j9);
                        } else if (y3.p.a(jB, 8589934592L)) {
                            y3.o.c(j9);
                        }
                    }
                    size6 = arrayList.size();
                    for (i24 = 0; i24 < size6; i24++) {
                        Object obj6 = ((m3.f) arrayList.get(i24)).f10423a;
                    }
                    charSequence2 = spannableString;
                    if (list3.size() > 0) {
                        fVar2 = (m3.f) list3.get(0);
                        if (fVar2.f10423a == null) {
                            throw new ClassCastException();
                        }
                        for (Object obj7 : spannableString.getSpans(fVar2.f10424b, fVar2.f10425c, v5.s.class)) {
                            spannableString.removeSpan((v5.s) obj7);
                        }
                        throw null;
                    }
                } else {
                    vVar2 = vVar;
                }
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                while (i13 < size) {
                    fVar5 = (m3.f) arrayList.get(i13);
                    obj3 = fVar5.f10423a;
                    if (obj3 instanceof i0) {
                        i0Var4 = (i0) obj3;
                        if (i0Var4.f10462f != null) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            arrayList2.add(fVar5);
                        } else {
                            arrayList2.add(fVar5);
                        }
                    }
                }
                i0Var2 = r0Var2.f10522a;
                iVar2 = i0Var2.f10462f;
                if (iVar2 != null) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (z13) {
                    i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                } else {
                    i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                }
                fVar = new c0.f(spannableString, gVar, 20);
                if (arrayList2.size() <= 1) {
                    size2 = arrayList2.size();
                    i14 = size2 * 2;
                    iArr = new int[i14];
                    size3 = arrayList2.size();
                    while (i15 < size3) {
                        m3.f fVar8 = (m3.f) arrayList2.get(i15);
                        iArr[i15] = fVar8.f10424b;
                        iArr[i15 + size2] = fVar8.f10425c;
                    }
                    if (i14 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i14 != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    i16 = iArr[0];
                    i17 = 0;
                    while (i17 < i14) {
                        i18 = iArr[i17];
                        if (i18 == i16) {
                            arrayList3 = arrayList2;
                            vVar3 = vVar2;
                            i20 = i17;
                        } else {
                            size4 = arrayList2.size();
                            i19 = 0;
                            while (i19 < size4) {
                                ArrayList arrayList6 = arrayList2;
                                m3.f fVar9 = (m3.f) arrayList2.get(i19);
                                v vVar9 = vVar2;
                                i21 = fVar9.f10424b;
                                int i46 = i17;
                                i22 = fVar9.f10425c;
                                if (i21 == i22) {
                                }
                                i19++;
                                arrayList2 = arrayList6;
                                vVar2 = vVar9;
                                i17 = i46;
                            }
                            arrayList3 = arrayList2;
                            vVar3 = vVar2;
                            i20 = i17;
                            if (i0Var3 != null) {
                                fVar.invoke(i0Var3, Integer.valueOf(i16), Integer.valueOf(i18));
                            }
                            i16 = i18;
                        }
                        i17 = i20 + 1;
                        i0Var3 = i0Var3;
                        arrayList2 = arrayList3;
                        vVar2 = vVar3;
                    }
                } else if (!arrayList2.isEmpty()) {
                    i0 i0Var8 = (i0) ((m3.f) arrayList2.get(0)).f10423a;
                    fVar.invoke(i0Var3 != null ? i0Var3.c(i0Var8) : i0Var8, Integer.valueOf(((m3.f) arrayList2.get(0)).f10424b), Integer.valueOf(((m3.f) arrayList2.get(0)).f10425c));
                }
                vVar4 = vVar2;
                size5 = arrayList.size();
                i23 = 0;
                z14 = false;
                while (i23 < size5) {
                    fVar4 = (m3.f) arrayList.get(i23);
                    obj2 = fVar4.f10423a;
                    if (obj2 instanceof i0) {
                        i30 = fVar4.f10424b;
                        int i47 = fVar4.f10425c;
                        if (i30 >= 0) {
                            size5 = size5;
                            i29 = i23;
                            z14 = z14;
                            cVar4 = cVar6;
                            vVar5 = vVar4;
                            z16 = z14;
                        } else {
                            size5 = size5;
                            i29 = i23;
                            z14 = z14;
                            cVar4 = cVar6;
                            vVar5 = vVar4;
                            z16 = z14;
                        }
                    } else {
                        size5 = size5;
                        i29 = i23;
                        z14 = z14;
                        cVar4 = cVar6;
                        vVar5 = vVar4;
                        z16 = z14;
                    }
                    vVar4 = vVar5;
                    cVar6 = cVar4;
                    size5 = size5;
                    z14 = z16;
                    i23 = i29 + 1;
                }
                z15 = z14;
                cVar2 = cVar6;
                v vVar10 = vVar4;
                if (z15) {
                    size7 = arrayList.size();
                    i26 = 0;
                    while (i26 < size7) {
                        fVar3 = (m3.f) arrayList.get(i26);
                        cVar3 = (m3.c) fVar3.f10423a;
                        if (cVar3 instanceof i0) {
                            i28 = fVar3.f10424b;
                            int i48 = fVar3.f10425c;
                            if (i28 >= 0) {
                                i27 = size7;
                            } else {
                                i27 = size7;
                            }
                        } else {
                            i27 = size7;
                        }
                        i26++;
                        size7 = i27;
                    }
                }
                qVar2 = vVar10.f10540d;
                if (qVar2 != null) {
                    j9 = qVar2.f16427a;
                    jB = y3.o.b(j9);
                    if (y3.p.a(jB, 4294967296L)) {
                        cVar2.f1(j9);
                    } else if (y3.p.a(jB, 8589934592L)) {
                        y3.o.c(j9);
                    }
                }
                size6 = arrayList.size();
                while (i24 < size6) {
                    Object obj8 = ((m3.f) arrayList.get(i24)).f10423a;
                }
                charSequence2 = spannableString;
                if (list3.size() > 0) {
                    fVar2 = (m3.f) list3.get(0);
                    if (fVar2.f10423a == null) {
                        throw new ClassCastException();
                    }
                    while (i25 < r1) {
                        spannableString.removeSpan((v5.s) obj7);
                    }
                    throw null;
                }
            }
        } else {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            i0Var = r0Var2.f10522a;
            vVar = r0Var2.f10523b;
            if (m.a(i0Var.m, l.f16418c)) {
                spannableString.setSpan(b.f14925a, 0, str3.length(), 33);
            }
            zVar = r0Var2.f10524c;
            if (zVar != null || (xVar = zVar.f10553b) == null) {
                z10 = false;
            } else {
                z10 = xVar.f10549a;
            }
            if (z10 || vVar.f10542f != null) {
                iVar = vVar.f10542f;
                iVar = iVar == null ? x3.i.f16412d : iVar;
                fA0 = rd.a.a0(vVar.f10539c, textSize, cVar6);
                if (Float.isNaN(fA0)) {
                    if (spannableString.length() == 0 && k.M0(spannableString) != '\n') {
                        length = spannableString.length();
                    } else {
                        length = spannableString.length() + 1;
                    }
                    int i49 = length;
                    i11 = iVar.f16414b;
                    if ((i11 & 1) > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i11 & 16) > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i12 = 0;
                    spannableString.setSpan(new p3.h(fA0, i49, z11, z12, iVar.f16413a, iVar.f16415c), 0, spannableString.length(), 33);
                }
                qVar = vVar.f10540d;
                if (qVar != null) {
                    i33 = i12;
                    j10 = qVar.f16427a;
                    j11 = qVar.f16428b;
                    vVar2 = vVar;
                    if ((y3.o.a(j10, kh.o.z(i33)) || !y3.o.a(j11, kh.o.z(i33))) && (j10 & 1095216660480L) != r13 && (j11 & 1095216660480L) != 0) {
                        jB2 = y3.o.b(j10);
                        if (y3.p.a(jB2, 4294967296L)) {
                            fC = cVar6.f1(j10);
                        } else if (y3.p.a(jB2, 8589934592L)) {
                            fC = y3.o.c(j10) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = y3.o.b(j11);
                        if (y3.p.a(jB3, 4294967296L)) {
                            fC2 = cVar6.f1(j11);
                        } else if (y3.p.a(jB3, 8589934592L)) {
                            fC2 = y3.o.c(j11) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                    arrayList2 = new ArrayList(arrayList.size());
                    size = arrayList.size();
                    while (i13 < size) {
                        fVar5 = (m3.f) arrayList.get(i13);
                        obj3 = fVar5.f10423a;
                        if (obj3 instanceof i0) {
                            i0Var4 = (i0) obj3;
                            if (i0Var4.f10462f != null && i0Var4.f10460d == null && i0Var4.f10459c == null) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            if (z17 || ((i0) obj3).f10461e != null) {
                                arrayList2.add(fVar5);
                            }
                        }
                    }
                    i0Var2 = r0Var2.f10522a;
                    iVar2 = i0Var2.f10462f;
                    if (iVar2 != null && i0Var2.f10460d == null && i0Var2.f10459c == null) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13 || i0Var2.f10461e != null) {
                        i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                    } else {
                        i0Var3 = null;
                    }
                    fVar = new c0.f(spannableString, gVar, 20);
                    if (arrayList2.size() <= 1) {
                        size2 = arrayList2.size();
                        i14 = size2 * 2;
                        iArr = new int[i14];
                        size3 = arrayList2.size();
                        while (i15 < size3) {
                            m3.f fVar10 = (m3.f) arrayList2.get(i15);
                            iArr[i15] = fVar10.f10424b;
                            iArr[i15 + size2] = fVar10.f10425c;
                        }
                        if (i14 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i14 != 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        i16 = iArr[0];
                        i17 = 0;
                        while (i17 < i14) {
                            i18 = iArr[i17];
                            if (i18 == i16) {
                                arrayList3 = arrayList2;
                                vVar3 = vVar2;
                                i20 = i17;
                            } else {
                                size4 = arrayList2.size();
                                i19 = 0;
                                while (i19 < size4) {
                                    ArrayList arrayList7 = arrayList2;
                                    m3.f fVar11 = (m3.f) arrayList2.get(i19);
                                    v vVar11 = vVar2;
                                    i21 = fVar11.f10424b;
                                    int i410 = i17;
                                    i22 = fVar11.f10425c;
                                    if (i21 == i22 && m3.i.b(i16, i18, i21, i22)) {
                                        i0 i0Var9 = (i0) fVar11.f10423a;
                                        i0Var3 = i0Var3 != null ? i0Var3.c(i0Var9) : i0Var9;
                                    }
                                    i19++;
                                    arrayList2 = arrayList7;
                                    vVar2 = vVar11;
                                    i17 = i410;
                                }
                                arrayList3 = arrayList2;
                                vVar3 = vVar2;
                                i20 = i17;
                                if (i0Var3 != null) {
                                    fVar.invoke(i0Var3, Integer.valueOf(i16), Integer.valueOf(i18));
                                }
                                i16 = i18;
                            }
                            i17 = i20 + 1;
                            i0Var3 = i0Var3;
                            arrayList2 = arrayList3;
                            vVar2 = vVar3;
                        }
                    } else if (!arrayList2.isEmpty()) {
                        i0 i0Var10 = (i0) ((m3.f) arrayList2.get(0)).f10423a;
                        fVar.invoke(i0Var3 != null ? i0Var3.c(i0Var10) : i0Var10, Integer.valueOf(((m3.f) arrayList2.get(0)).f10424b), Integer.valueOf(((m3.f) arrayList2.get(0)).f10425c));
                    }
                    vVar4 = vVar2;
                    size5 = arrayList.size();
                    i23 = 0;
                    z14 = false;
                    while (i23 < size5) {
                        fVar4 = (m3.f) arrayList.get(i23);
                        obj2 = fVar4.f10423a;
                        if (obj2 instanceof i0) {
                            i30 = fVar4.f10424b;
                            int i411 = fVar4.f10425c;
                            if (i30 >= 0 || i30 >= spannableString.length() || i411 <= i30 || i411 > spannableString.length()) {
                                size5 = size5;
                                i29 = i23;
                                z14 = z14;
                                cVar4 = cVar6;
                                vVar5 = vVar4;
                            } else {
                                i0 i0Var11 = (i0) obj2;
                                long j16 = i0Var11.f10464h;
                                x3.a aVar3 = i0Var11.f10465i;
                                x3.o oVar3 = i0Var11.f10457a;
                                if (aVar3 != null) {
                                    spannableString.setSpan(new p3.a(aVar3.f16399a, 0), i30, i411, 33);
                                }
                                i29 = i23;
                                rd.a.b0(spannableString, oVar3.a(), i30, i411);
                                i2.q qVarB = oVar3.b();
                                float fC4 = oVar3.c();
                                if (qVarB != null) {
                                    if (qVarB instanceof v0) {
                                        rd.a.b0(spannableString, ((v0) qVarB).f7174a, i30, i411);
                                    } else {
                                        spannableString.setSpan(new w3.b((i2.r0) qVarB, fC4), i30, i411, 33);
                                    }
                                }
                                l lVar2 = i0Var11.m;
                                if (lVar2 != null) {
                                    int i50 = lVar2.f16420a;
                                    p3.k kVar = new p3.k((i50 | 1) == i50, (i50 | 2) == i50);
                                    i31 = 33;
                                    spannableString.setSpan(kVar, i30, i411, 33);
                                } else {
                                    i31 = 33;
                                }
                                int i51 = i31;
                                vVar5 = vVar4;
                                rd.a.c0(spannableString, i0Var11.f10458b, cVar6, i30, i411);
                                String str4 = i0Var11.f10463g;
                                if (str4 != null) {
                                    spannableString.setSpan(new p3.b(str4, 0), i30, i411, i51);
                                }
                                p pVar3 = i0Var11.f10466j;
                                if (pVar3 != null) {
                                    spannableString.setSpan(new ScaleXSpan(pVar3.f16424a), i30, i411, i51);
                                    spannableString.setSpan(new p3.a(pVar3.f16425b, 1), i30, i411, i51);
                                }
                                rd.a.d0(spannableString, i0Var11.f10467k, i30, i411);
                                cVar4 = cVar6;
                                long j17 = i0Var11.l;
                                if (j17 != 16) {
                                    spannableString.setSpan(new BackgroundColorSpan(b0.C(j17)), i30, i411, i51);
                                }
                                s0 s0Var = i0Var11.f10468n;
                                if (s0Var != null) {
                                    long j18 = s0Var.f7160b;
                                    int iC = b0.C(s0Var.f7159a);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j18 >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j18 & 4294967295L));
                                    float f3 = s0Var.f7161c;
                                    p3.j jVar = new p3.j(fIntBitsToFloat, fIntBitsToFloat2, f3 == 0.0f ? Float.MIN_VALUE : f3, iC);
                                    i32 = 33;
                                    spannableString.setSpan(jVar, i30, i411, 33);
                                } else {
                                    i32 = i51;
                                }
                                k2.e eVar2 = i0Var11.f10470p;
                                if (eVar2 != null) {
                                    spannableString.setSpan(new w3.a(eVar2), i30, i411, i32);
                                }
                                z16 = (y3.p.a(y3.o.b(j16), 4294967296L) || y3.p.a(y3.o.b(j16), 8589934592L)) ? true : z16;
                            }
                            z16 = z14;
                        } else {
                            size5 = size5;
                            i29 = i23;
                            z14 = z14;
                            cVar4 = cVar6;
                            vVar5 = vVar4;
                            z16 = z14;
                        }
                        vVar4 = vVar5;
                        cVar6 = cVar4;
                        size5 = size5;
                        z14 = z16;
                        i23 = i29 + 1;
                    }
                    z15 = z14;
                    cVar2 = cVar6;
                    v vVar12 = vVar4;
                    if (z15) {
                        size7 = arrayList.size();
                        i26 = 0;
                        while (i26 < size7) {
                            fVar3 = (m3.f) arrayList.get(i26);
                            cVar3 = (m3.c) fVar3.f10423a;
                            if (cVar3 instanceof i0) {
                                i28 = fVar3.f10424b;
                                int i412 = fVar3.f10425c;
                                if (i28 >= 0 || i28 >= spannableString.length() || i412 <= i28 || i412 > spannableString.length()) {
                                    i27 = size7;
                                } else {
                                    long j19 = ((i0) cVar3).f10464h;
                                    long jB5 = y3.o.b(j19);
                                    i27 = size7;
                                    y3.c cVar7 = cVar2;
                                    if (y3.p.a(jB5, 4294967296L)) {
                                        cVar2 = cVar7;
                                        eVar = new p3.f(cVar2.f1(j19));
                                    } else {
                                        cVar2 = cVar7;
                                        eVar = y3.p.a(jB5, 8589934592L) ? new p3.e(y3.o.c(j19)) : null;
                                    }
                                    if (eVar != null) {
                                        spannableString.setSpan(eVar, i28, i412, 33);
                                    }
                                }
                            } else {
                                i27 = size7;
                            }
                            i26++;
                            size7 = i27;
                        }
                    }
                    qVar2 = vVar12.f10540d;
                    if (qVar2 != null) {
                        j9 = qVar2.f16427a;
                        jB = y3.o.b(j9);
                        if (y3.p.a(jB, 4294967296L)) {
                            cVar2.f1(j9);
                        } else if (y3.p.a(jB, 8589934592L)) {
                            y3.o.c(j9);
                        }
                    }
                    size6 = arrayList.size();
                    while (i24 < size6) {
                        Object obj9 = ((m3.f) arrayList.get(i24)).f10423a;
                    }
                    charSequence2 = spannableString;
                    if (list3.size() > 0) {
                        fVar2 = (m3.f) list3.get(0);
                        if (fVar2.f10423a == null) {
                            throw new ClassCastException();
                        }
                        while (i25 < r1) {
                            spannableString.removeSpan((v5.s) obj7);
                        }
                        throw null;
                    }
                } else {
                    vVar2 = vVar;
                }
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                while (i13 < size) {
                    fVar5 = (m3.f) arrayList.get(i13);
                    obj3 = fVar5.f10423a;
                    if (obj3 instanceof i0) {
                        i0Var4 = (i0) obj3;
                        if (i0Var4.f10462f != null) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            arrayList2.add(fVar5);
                        } else {
                            arrayList2.add(fVar5);
                        }
                    }
                }
                i0Var2 = r0Var2.f10522a;
                iVar2 = i0Var2.f10462f;
                if (iVar2 != null) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (z13) {
                    i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                } else {
                    i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                }
                fVar = new c0.f(spannableString, gVar, 20);
                if (arrayList2.size() <= 1) {
                    size2 = arrayList2.size();
                    i14 = size2 * 2;
                    iArr = new int[i14];
                    size3 = arrayList2.size();
                    while (i15 < size3) {
                        m3.f fVar12 = (m3.f) arrayList2.get(i15);
                        iArr[i15] = fVar12.f10424b;
                        iArr[i15 + size2] = fVar12.f10425c;
                    }
                    if (i14 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i14 != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    i16 = iArr[0];
                    i17 = 0;
                    while (i17 < i14) {
                        i18 = iArr[i17];
                        if (i18 == i16) {
                            arrayList3 = arrayList2;
                            vVar3 = vVar2;
                            i20 = i17;
                        } else {
                            size4 = arrayList2.size();
                            i19 = 0;
                            while (i19 < size4) {
                                ArrayList arrayList8 = arrayList2;
                                m3.f fVar13 = (m3.f) arrayList2.get(i19);
                                v vVar13 = vVar2;
                                i21 = fVar13.f10424b;
                                int i413 = i17;
                                i22 = fVar13.f10425c;
                                if (i21 == i22) {
                                }
                                i19++;
                                arrayList2 = arrayList8;
                                vVar2 = vVar13;
                                i17 = i413;
                            }
                            arrayList3 = arrayList2;
                            vVar3 = vVar2;
                            i20 = i17;
                            if (i0Var3 != null) {
                                fVar.invoke(i0Var3, Integer.valueOf(i16), Integer.valueOf(i18));
                            }
                            i16 = i18;
                        }
                        i17 = i20 + 1;
                        i0Var3 = i0Var3;
                        arrayList2 = arrayList3;
                        vVar2 = vVar3;
                    }
                } else if (!arrayList2.isEmpty()) {
                    i0 i0Var12 = (i0) ((m3.f) arrayList2.get(0)).f10423a;
                    fVar.invoke(i0Var3 != null ? i0Var3.c(i0Var12) : i0Var12, Integer.valueOf(((m3.f) arrayList2.get(0)).f10424b), Integer.valueOf(((m3.f) arrayList2.get(0)).f10425c));
                }
                vVar4 = vVar2;
                size5 = arrayList.size();
                i23 = 0;
                z14 = false;
                while (i23 < size5) {
                    fVar4 = (m3.f) arrayList.get(i23);
                    obj2 = fVar4.f10423a;
                    if (obj2 instanceof i0) {
                        i30 = fVar4.f10424b;
                        int i414 = fVar4.f10425c;
                        if (i30 >= 0) {
                            size5 = size5;
                            i29 = i23;
                            z14 = z14;
                            cVar4 = cVar6;
                            vVar5 = vVar4;
                            z16 = z14;
                        } else {
                            size5 = size5;
                            i29 = i23;
                            z14 = z14;
                            cVar4 = cVar6;
                            vVar5 = vVar4;
                            z16 = z14;
                        }
                    } else {
                        size5 = size5;
                        i29 = i23;
                        z14 = z14;
                        cVar4 = cVar6;
                        vVar5 = vVar4;
                        z16 = z14;
                    }
                    vVar4 = vVar5;
                    cVar6 = cVar4;
                    size5 = size5;
                    z14 = z16;
                    i23 = i29 + 1;
                }
                z15 = z14;
                cVar2 = cVar6;
                v vVar14 = vVar4;
                if (z15) {
                    size7 = arrayList.size();
                    i26 = 0;
                    while (i26 < size7) {
                        fVar3 = (m3.f) arrayList.get(i26);
                        cVar3 = (m3.c) fVar3.f10423a;
                        if (cVar3 instanceof i0) {
                            i28 = fVar3.f10424b;
                            int i415 = fVar3.f10425c;
                            if (i28 >= 0) {
                                i27 = size7;
                            } else {
                                i27 = size7;
                            }
                        } else {
                            i27 = size7;
                        }
                        i26++;
                        size7 = i27;
                    }
                }
                qVar2 = vVar14.f10540d;
                if (qVar2 != null) {
                    j9 = qVar2.f16427a;
                    jB = y3.o.b(j9);
                    if (y3.p.a(jB, 4294967296L)) {
                        cVar2.f1(j9);
                    } else if (y3.p.a(jB, 8589934592L)) {
                        y3.o.c(j9);
                    }
                }
                size6 = arrayList.size();
                while (i24 < size6) {
                    Object obj10 = ((m3.f) arrayList.get(i24)).f10423a;
                }
                charSequence2 = spannableString;
                if (list3.size() > 0) {
                    fVar2 = (m3.f) list3.get(0);
                    if (fVar2.f10423a == null) {
                        throw new ClassCastException();
                    }
                    while (i25 < r1) {
                        spannableString.removeSpan((v5.s) obj7);
                    }
                    throw null;
                }
            } else {
                float fA1 = rd.a.a0(vVar.f10539c, textSize, cVar6);
                if (!Float.isNaN(fA1)) {
                    spannableString.setSpan(new p3.g(fA1), 0, spannableString.length(), 33);
                }
            }
            i12 = 0;
            qVar = vVar.f10540d;
            if (qVar != null) {
                i33 = i12;
                j10 = qVar.f16427a;
                j11 = qVar.f16428b;
                vVar2 = vVar;
                if (y3.o.a(j10, kh.o.z(i33))) {
                    jB2 = y3.o.b(j10);
                    if (y3.p.a(jB2, 4294967296L)) {
                        fC = cVar6.f1(j10);
                    } else if (y3.p.a(jB2, 8589934592L)) {
                        fC = y3.o.c(j10) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = y3.o.b(j11);
                    if (y3.p.a(jB3, 4294967296L)) {
                        fC2 = cVar6.f1(j11);
                    } else if (y3.p.a(jB3, 8589934592L)) {
                        fC2 = y3.o.c(j11) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB2 = y3.o.b(j10);
                    if (y3.p.a(jB2, 4294967296L)) {
                        fC = cVar6.f1(j10);
                    } else if (y3.p.a(jB2, 8589934592L)) {
                        fC = y3.o.c(j10) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = y3.o.b(j11);
                    if (y3.p.a(jB3, 4294967296L)) {
                        fC2 = cVar6.f1(j11);
                    } else if (y3.p.a(jB3, 8589934592L)) {
                        fC2 = y3.o.c(j11) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                while (i13 < size) {
                    fVar5 = (m3.f) arrayList.get(i13);
                    obj3 = fVar5.f10423a;
                    if (obj3 instanceof i0) {
                        i0Var4 = (i0) obj3;
                        if (i0Var4.f10462f != null) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            arrayList2.add(fVar5);
                        } else {
                            arrayList2.add(fVar5);
                        }
                    }
                }
                i0Var2 = r0Var2.f10522a;
                iVar2 = i0Var2.f10462f;
                if (iVar2 != null) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (z13) {
                    i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                } else {
                    i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
                }
                fVar = new c0.f(spannableString, gVar, 20);
                if (arrayList2.size() <= 1) {
                    size2 = arrayList2.size();
                    i14 = size2 * 2;
                    iArr = new int[i14];
                    size3 = arrayList2.size();
                    while (i15 < size3) {
                        m3.f fVar14 = (m3.f) arrayList2.get(i15);
                        iArr[i15] = fVar14.f10424b;
                        iArr[i15 + size2] = fVar14.f10425c;
                    }
                    if (i14 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i14 != 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    i16 = iArr[0];
                    i17 = 0;
                    while (i17 < i14) {
                        i18 = iArr[i17];
                        if (i18 == i16) {
                            arrayList3 = arrayList2;
                            vVar3 = vVar2;
                            i20 = i17;
                        } else {
                            size4 = arrayList2.size();
                            i19 = 0;
                            while (i19 < size4) {
                                ArrayList arrayList9 = arrayList2;
                                m3.f fVar15 = (m3.f) arrayList2.get(i19);
                                v vVar15 = vVar2;
                                i21 = fVar15.f10424b;
                                int i416 = i17;
                                i22 = fVar15.f10425c;
                                if (i21 == i22) {
                                }
                                i19++;
                                arrayList2 = arrayList9;
                                vVar2 = vVar15;
                                i17 = i416;
                            }
                            arrayList3 = arrayList2;
                            vVar3 = vVar2;
                            i20 = i17;
                            if (i0Var3 != null) {
                                fVar.invoke(i0Var3, Integer.valueOf(i16), Integer.valueOf(i18));
                            }
                            i16 = i18;
                        }
                        i17 = i20 + 1;
                        i0Var3 = i0Var3;
                        arrayList2 = arrayList3;
                        vVar2 = vVar3;
                    }
                } else if (!arrayList2.isEmpty()) {
                    i0 i0Var13 = (i0) ((m3.f) arrayList2.get(0)).f10423a;
                    fVar.invoke(i0Var3 != null ? i0Var3.c(i0Var13) : i0Var13, Integer.valueOf(((m3.f) arrayList2.get(0)).f10424b), Integer.valueOf(((m3.f) arrayList2.get(0)).f10425c));
                }
                vVar4 = vVar2;
                size5 = arrayList.size();
                i23 = 0;
                z14 = false;
                while (i23 < size5) {
                    fVar4 = (m3.f) arrayList.get(i23);
                    obj2 = fVar4.f10423a;
                    if (obj2 instanceof i0) {
                        i30 = fVar4.f10424b;
                        int i417 = fVar4.f10425c;
                        if (i30 >= 0) {
                            size5 = size5;
                            i29 = i23;
                            z14 = z14;
                            cVar4 = cVar6;
                            vVar5 = vVar4;
                            z16 = z14;
                        } else {
                            size5 = size5;
                            i29 = i23;
                            z14 = z14;
                            cVar4 = cVar6;
                            vVar5 = vVar4;
                            z16 = z14;
                        }
                    } else {
                        size5 = size5;
                        i29 = i23;
                        z14 = z14;
                        cVar4 = cVar6;
                        vVar5 = vVar4;
                        z16 = z14;
                    }
                    vVar4 = vVar5;
                    cVar6 = cVar4;
                    size5 = size5;
                    z14 = z16;
                    i23 = i29 + 1;
                }
                z15 = z14;
                cVar2 = cVar6;
                v vVar16 = vVar4;
                if (z15) {
                    size7 = arrayList.size();
                    i26 = 0;
                    while (i26 < size7) {
                        fVar3 = (m3.f) arrayList.get(i26);
                        cVar3 = (m3.c) fVar3.f10423a;
                        if (cVar3 instanceof i0) {
                            i28 = fVar3.f10424b;
                            int i418 = fVar3.f10425c;
                            if (i28 >= 0) {
                                i27 = size7;
                            } else {
                                i27 = size7;
                            }
                        } else {
                            i27 = size7;
                        }
                        i26++;
                        size7 = i27;
                    }
                }
                qVar2 = vVar16.f10540d;
                if (qVar2 != null) {
                    j9 = qVar2.f16427a;
                    jB = y3.o.b(j9);
                    if (y3.p.a(jB, 4294967296L)) {
                        cVar2.f1(j9);
                    } else if (y3.p.a(jB, 8589934592L)) {
                        y3.o.c(j9);
                    }
                }
                size6 = arrayList.size();
                while (i24 < size6) {
                    Object obj11 = ((m3.f) arrayList.get(i24)).f10423a;
                }
                charSequence2 = spannableString;
                if (list3.size() > 0) {
                    fVar2 = (m3.f) list3.get(0);
                    if (fVar2.f10423a == null) {
                        throw new ClassCastException();
                    }
                    while (i25 < r1) {
                        spannableString.removeSpan((v5.s) obj7);
                    }
                    throw null;
                }
            } else {
                vVar2 = vVar;
            }
            arrayList2 = new ArrayList(arrayList.size());
            size = arrayList.size();
            while (i13 < size) {
                fVar5 = (m3.f) arrayList.get(i13);
                obj3 = fVar5.f10423a;
                if (obj3 instanceof i0) {
                    i0Var4 = (i0) obj3;
                    if (i0Var4.f10462f != null) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (z17) {
                        arrayList2.add(fVar5);
                    } else {
                        arrayList2.add(fVar5);
                    }
                }
            }
            i0Var2 = r0Var2.f10522a;
            iVar2 = i0Var2.f10462f;
            if (iVar2 != null) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (z13) {
                i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
            } else {
                i0Var3 = new i0(0L, 0L, i0Var2.f10459c, i0Var2.f10460d, i0Var2.f10461e, iVar2, (String) null, 0L, (x3.a) null, (p) null, (t3.b) null, 0L, (l) null, (s0) null, 65475);
            }
            fVar = new c0.f(spannableString, gVar, 20);
            if (arrayList2.size() <= 1) {
                size2 = arrayList2.size();
                i14 = size2 * 2;
                iArr = new int[i14];
                size3 = arrayList2.size();
                while (i15 < size3) {
                    m3.f fVar16 = (m3.f) arrayList2.get(i15);
                    iArr[i15] = fVar16.f10424b;
                    iArr[i15 + size2] = fVar16.f10425c;
                }
                if (i14 > 1) {
                    Arrays.sort(iArr);
                }
                if (i14 != 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                i16 = iArr[0];
                i17 = 0;
                while (i17 < i14) {
                    i18 = iArr[i17];
                    if (i18 == i16) {
                        arrayList3 = arrayList2;
                        vVar3 = vVar2;
                        i20 = i17;
                    } else {
                        size4 = arrayList2.size();
                        i19 = 0;
                        while (i19 < size4) {
                            ArrayList arrayList10 = arrayList2;
                            m3.f fVar17 = (m3.f) arrayList2.get(i19);
                            v vVar17 = vVar2;
                            i21 = fVar17.f10424b;
                            int i419 = i17;
                            i22 = fVar17.f10425c;
                            if (i21 == i22) {
                            }
                            i19++;
                            arrayList2 = arrayList10;
                            vVar2 = vVar17;
                            i17 = i419;
                        }
                        arrayList3 = arrayList2;
                        vVar3 = vVar2;
                        i20 = i17;
                        if (i0Var3 != null) {
                            fVar.invoke(i0Var3, Integer.valueOf(i16), Integer.valueOf(i18));
                        }
                        i16 = i18;
                    }
                    i17 = i20 + 1;
                    i0Var3 = i0Var3;
                    arrayList2 = arrayList3;
                    vVar2 = vVar3;
                }
            } else if (!arrayList2.isEmpty()) {
                i0 i0Var14 = (i0) ((m3.f) arrayList2.get(0)).f10423a;
                fVar.invoke(i0Var3 != null ? i0Var3.c(i0Var14) : i0Var14, Integer.valueOf(((m3.f) arrayList2.get(0)).f10424b), Integer.valueOf(((m3.f) arrayList2.get(0)).f10425c));
            }
            vVar4 = vVar2;
            size5 = arrayList.size();
            i23 = 0;
            z14 = false;
            while (i23 < size5) {
                fVar4 = (m3.f) arrayList.get(i23);
                obj2 = fVar4.f10423a;
                if (obj2 instanceof i0) {
                    i30 = fVar4.f10424b;
                    int i4110 = fVar4.f10425c;
                    if (i30 >= 0) {
                        size5 = size5;
                        i29 = i23;
                        z14 = z14;
                        cVar4 = cVar6;
                        vVar5 = vVar4;
                        z16 = z14;
                    } else {
                        size5 = size5;
                        i29 = i23;
                        z14 = z14;
                        cVar4 = cVar6;
                        vVar5 = vVar4;
                        z16 = z14;
                    }
                } else {
                    size5 = size5;
                    i29 = i23;
                    z14 = z14;
                    cVar4 = cVar6;
                    vVar5 = vVar4;
                    z16 = z14;
                }
                vVar4 = vVar5;
                cVar6 = cVar4;
                size5 = size5;
                z14 = z16;
                i23 = i29 + 1;
            }
            z15 = z14;
            cVar2 = cVar6;
            v vVar18 = vVar4;
            if (z15) {
                size7 = arrayList.size();
                i26 = 0;
                while (i26 < size7) {
                    fVar3 = (m3.f) arrayList.get(i26);
                    cVar3 = (m3.c) fVar3.f10423a;
                    if (cVar3 instanceof i0) {
                        i28 = fVar3.f10424b;
                        int i4111 = fVar3.f10425c;
                        if (i28 >= 0) {
                            i27 = size7;
                        } else {
                            i27 = size7;
                        }
                    } else {
                        i27 = size7;
                    }
                    i26++;
                    size7 = i27;
                }
            }
            qVar2 = vVar18.f10540d;
            if (qVar2 != null) {
                j9 = qVar2.f16427a;
                jB = y3.o.b(j9);
                if (y3.p.a(jB, 4294967296L)) {
                    cVar2.f1(j9);
                } else if (y3.p.a(jB, 8589934592L)) {
                    y3.o.c(j9);
                }
            }
            size6 = arrayList.size();
            while (i24 < size6) {
                Object obj12 = ((m3.f) arrayList.get(i24)).f10423a;
            }
            charSequence2 = spannableString;
            if (list3.size() > 0) {
                fVar2 = (m3.f) list3.get(0);
                if (fVar2.f10423a == null) {
                    throw new ClassCastException();
                }
                while (i25 < r1) {
                    spannableString.removeSpan((v5.s) obj7);
                }
                throw null;
            }
        }
        this.H = charSequence2;
        this.I = new n3.e(charSequence2, this.G, this.L);
    }

    @Override
    public final boolean b() {
        p1 p1Var = this.J;
        if (p1Var != null ? p1Var.y() : false) {
            return true;
        }
        if (!this.K && i.a(this.B)) {
            o9.q qVar = h.f14936a;
            o9.q qVar2 = h.f14936a;
            p2 p2VarI = (p2) qVar2.B;
            if (p2VarI == null) {
                if (v5.g.d()) {
                    p2VarI = qVar2.I();
                    qVar2.B = p2VarI;
                } else {
                    p2VarI = i.f14937a;
                }
            }
            if (((Boolean) p2VarI.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final float c() {
        float f3;
        n3.e eVar = this.I;
        float f10 = eVar.f11030e;
        TextPaint textPaint = eVar.f11027b;
        if (!Float.isNaN(f10)) {
            return eVar.f11030e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = eVar.f11026a;
        lineInstance.setText(new n3.b(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, n3.f.f11034a);
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new z00.e(i10, next, 1));
            } else {
                z00.e eVar2 = (z00.e) priorityQueue.peek();
                if (eVar2 != null && ((z00.c) eVar2).B - ((z00.c) eVar2).A < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new z00.e(i10, next, 1));
                }
            }
            i10 = next;
        }
        if (priorityQueue.isEmpty()) {
            f3 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            z00.e eVar3 = (z00.e) it.next();
            float desiredWidth = Layout.getDesiredWidth(eVar.a(), ((z00.c) eVar3).A, ((z00.c) eVar3).B, textPaint);
            while (it.hasNext()) {
                z00.e eVar4 = (z00.e) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(eVar.a(), ((z00.c) eVar4).A, ((z00.c) eVar4).B, textPaint));
            }
            f3 = desiredWidth;
        }
        eVar.f11030e = f3;
        return f3;
    }

    @Override
    public final float l() {
        return this.I.b();
    }
}
