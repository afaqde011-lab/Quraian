package d9;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import c7.i;
import ca.v;
import com.google.protobuf.RuntimeVersion;
import d7.h;
import e7.i0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public final class c {

    public final String f4797a;

    public final String f4798b;

    public final boolean f4799c;

    public final long f4800d;

    public final long f4801e;

    public final g f4802f;

    public final String[] f4803g;

    public final String f4804h;

    public final String f4805i;

    public final c f4806j;

    public final HashMap f4807k;
    public final HashMap l;
    public ArrayList m;

    public c(String str, String str2, long j9, long j10, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f4797a = str;
        this.f4798b = str2;
        this.f4805i = str4;
        this.f4802f = gVar;
        this.f4803g = strArr;
        this.f4799c = str2 != null;
        this.f4800d = j9;
        this.f4801e = j10;
        str3.getClass();
        this.f4804h = str3;
        this.f4806j = cVar;
        this.f4807k = new HashMap();
        this.l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, RuntimeVersion.SUFFIX, null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            d7.a aVar = new d7.a();
            aVar.f4723a = new SpannableStringBuilder();
            aVar.f4724b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((d7.a) treeMap.get(str)).f4723a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        String str = this.f4797a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z10 || zEquals || (zEquals2 && this.f4805i != null)) {
            long j9 = this.f4800d;
            if (j9 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j9));
            }
            long j10 = this.f4801e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.m.size(); i10++) {
            ((c) this.m.get(i10)).d(treeSet, z10 || zEquals);
        }
    }

    public final boolean f(long j9) {
        long j10 = this.f4800d;
        long j11 = this.f4801e;
        if (j10 == -9223372036854775807L && j11 == -9223372036854775807L) {
            return true;
        }
        if (j10 <= j9 && j11 == -9223372036854775807L) {
            return true;
        }
        if (j10 != -9223372036854775807L || j9 >= j11) {
            return j10 <= j9 && j9 < j11;
        }
        return true;
    }

    public final void g(long j9, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f4804h;
        if (!RuntimeVersion.SUFFIX.equals(str3)) {
            str = str3;
        }
        if (f(j9) && "div".equals(this.f4797a) && (str2 = this.f4805i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j9, str, arrayList);
        }
    }

    public final void h(long j9, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i10;
        c cVar;
        int i11;
        g gVarG;
        int i12;
        float f3;
        float f10;
        float f11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i13;
        RelativeSizeSpan relativeSizeSpan;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Map map3 = map;
        if (f(j9)) {
            String str2 = this.f4804h;
            String str3 = RuntimeVersion.SUFFIX.equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f4807k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    d7.a aVar = (d7.a) treeMap.get(str4);
                    aVar.getClass();
                    f fVar = (f) map2.get(str3);
                    fVar.getClass();
                    int i19 = fVar.f4820j;
                    g gVarG2 = v.G(this.f4802f, this.f4803g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.f4723a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.f4723a = spannableStringBuilder;
                        aVar.f4724b = null;
                    }
                    if (gVarG2 != null) {
                        int i20 = gVarG2.f4828h;
                        int i21 = 1;
                        if (((i20 == -1 && gVarG2.f4829i == -1) ? -1 : (i20 == 1 ? (char) 1 : (char) 0) | (gVarG2.f4829i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i22 = gVarG2.f4828h;
                            if (i22 != -1) {
                                if (i22 == i21) {
                                    i16 = i21;
                                } else {
                                    i16 = 0;
                                }
                                if (gVarG2.f4829i == i21) {
                                    i17 = 2;
                                } else {
                                    i17 = 0;
                                }
                                i18 = i16 | i17;
                            } else if (gVarG2.f4829i == -1) {
                                i18 = -1;
                                i21 = 1;
                            } else {
                                i21 = 1;
                                if (i22 == i21) {
                                    i16 = i21;
                                } else {
                                    i16 = 0;
                                }
                                if (gVarG2.f4829i == i21) {
                                    i17 = 2;
                                } else {
                                    i17 = 0;
                                }
                                i18 = i16 | i17;
                            }
                            StyleSpan styleSpan = new StyleSpan(i18);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (gVarG2.f4826f == i21) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (gVarG2.f4827g == i21) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (gVarG2.f4823c) {
                            if (!gVarG2.f4823c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            i.l(spannableStringBuilder, new ForegroundColorSpan(gVarG2.f4822b), iIntValue, iIntValue2);
                        }
                        if (gVarG2.f4825e) {
                            if (!gVarG2.f4825e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            i.l(spannableStringBuilder, new BackgroundColorSpan(gVarG2.f4824d), iIntValue, iIntValue2);
                        }
                        if (gVarG2.f4821a != null) {
                            i.l(spannableStringBuilder, new TypefaceSpan(gVarG2.f4821a), iIntValue, iIntValue2);
                        }
                        b bVar = gVarG2.f4836r;
                        if (bVar != null) {
                            int i23 = bVar.f4794a;
                            if (i23 == -1) {
                                i23 = (i19 == 2 || i19 == 1) ? 3 : 1;
                                i15 = 1;
                            } else {
                                i15 = bVar.f4795b;
                            }
                            int i24 = bVar.f4796c;
                            if (i24 == -2) {
                                i24 = 1;
                            }
                            i.l(spannableStringBuilder, new h(i23, i15, i24), iIntValue, iIntValue2);
                        }
                        int i25 = gVarG2.m;
                        if (i25 == 2) {
                            c cVar2 = this.f4806j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                g gVarG3 = v.G(cVar2.f4802f, cVar2.f4803g, map3);
                                if (gVarG3 != null && gVarG3.m == 1) {
                                    break;
                                } else {
                                    cVar2 = cVar2.f4806j;
                                }
                            }
                            if (cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        cVar = null;
                                        break;
                                    }
                                    c cVar3 = (c) arrayDeque.pop();
                                    g gVarG4 = v.G(cVar3.f4802f, cVar3.f4803g, map3);
                                    if (gVarG4 != null && gVarG4.m == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int iC = cVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(cVar3.b(iC));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.c() == 1) {
                                        i11 = 0;
                                        if (cVar.b(0).f4798b != null) {
                                            String str5 = cVar.b(0).f4798b;
                                            String str6 = i0.f5136a;
                                            g gVarG5 = v.G(cVar.f4802f, cVar.f4803g, map3);
                                            int i26 = gVarG5 != null ? gVarG5.f4832n : -1;
                                            if (i26 == -1 && (gVarG = v.G(cVar2.f4802f, cVar2.f4803g, map3)) != null) {
                                                i26 = gVarG.f4832n;
                                            }
                                            spannableStringBuilder.setSpan(new d7.g(str5, i26), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                    e7.a.h("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (gVarG2.f4835q == 1) {
                                i.l(spannableStringBuilder, new d7.e(), iIntValue, iIntValue2);
                            }
                            i12 = gVarG2.f4830j;
                            f3 = 100.0f;
                            if (i12 != 1) {
                                it = it2;
                                f10 = 100.0f;
                                i.l(spannableStringBuilder, new AbsoluteSizeSpan((int) gVarG2.f4831k, true), iIntValue, iIntValue2);
                            } else if (i12 != 2) {
                                it = it2;
                                f10 = 100.0f;
                                i.l(spannableStringBuilder, new RelativeSizeSpan(gVarG2.f4831k), iIntValue, iIntValue2);
                            } else if (i12 != 3) {
                                it = it2;
                                f10 = 100.0f;
                            } else {
                                float f12 = gVarG2.f4831k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i27 = i11;
                                sizeChange = f12;
                                i13 = i27;
                                while (i13 < length) {
                                    float f13 = f3;
                                    relativeSizeSpan = relativeSizeSpanArr[i13];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i14 = i13;
                                    } else {
                                        i14 = i13;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i13 = i14 + 1;
                                    f3 = f13;
                                    it2 = it3;
                                }
                                it = it2;
                                f10 = f3;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f4797a)) {
                                f11 = gVarG2.f4837s;
                                if (f11 != Float.MAX_VALUE) {
                                    aVar.f4737q = (f11 * (-90.0f)) / f10;
                                }
                                alignment = gVarG2.f4833o;
                                if (alignment != null) {
                                    aVar.f4725c = alignment;
                                }
                                alignment2 = gVarG2.f4834p;
                                if (alignment2 != null) {
                                    aVar.f4726d = alignment2;
                                }
                            }
                        } else if (i25 == 3 || i25 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        i11 = 0;
                        if (gVarG2.f4835q == 1) {
                            i.l(spannableStringBuilder, new d7.e(), iIntValue, iIntValue2);
                        }
                        i12 = gVarG2.f4830j;
                        f3 = 100.0f;
                        if (i12 != 1) {
                            it = it2;
                            f10 = 100.0f;
                            i.l(spannableStringBuilder, new AbsoluteSizeSpan((int) gVarG2.f4831k, true), iIntValue, iIntValue2);
                        } else if (i12 != 2) {
                            it = it2;
                            f10 = 100.0f;
                            i.l(spannableStringBuilder, new RelativeSizeSpan(gVarG2.f4831k), iIntValue, iIntValue2);
                        } else if (i12 != 3) {
                            it = it2;
                            f10 = 100.0f;
                        } else {
                            float f14 = gVarG2.f4831k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i28 = i11;
                            sizeChange = f14;
                            i13 = i28;
                            while (i13 < length) {
                                float f15 = f3;
                                relativeSizeSpan = relativeSizeSpanArr[i13];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i14 = i13;
                                } else {
                                    i14 = i13;
                                }
                                i13 = i14 + 1;
                                f3 = f15;
                                it2 = it4;
                            }
                            it = it2;
                            f10 = f3;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f4797a)) {
                            f11 = gVarG2.f4837s;
                            if (f11 != Float.MAX_VALUE) {
                                aVar.f4737q = (f11 * (-90.0f)) / f10;
                            }
                            alignment = gVarG2.f4833o;
                            if (alignment != null) {
                                aVar.f4725c = alignment;
                            }
                            alignment2 = gVarG2.f4834p;
                            if (alignment2 != null) {
                                aVar.f4726d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i29 = 0;
            while (i29 < c()) {
                b(i29).h(j9, map3, map2, str3, treeMap);
                i29++;
                map3 = map;
            }
        }
    }

    public final void i(long j9, boolean z10, String str, TreeMap treeMap) {
        HashMap map = this.f4807k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.f4797a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f4804h;
        String str4 = RuntimeVersion.SUFFIX.equals(str3) ? str : str3;
        if (this.f4799c && z10) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f4798b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j9)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((d7.a) entry.getValue()).f4723a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < c(); i10++) {
                b(i10).i(j9, z10 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((d7.a) entry2.getValue()).f4723a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
