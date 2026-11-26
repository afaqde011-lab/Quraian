package m9;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.google.protobuf.RuntimeVersion;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public final class p0 extends FrameLayout implements j0 {
    public final d A;
    public final n0 B;
    public List C;
    public e D;
    public float E;
    public float F;

    public p0(Context context) {
        super(context, null);
        this.C = Collections.EMPTY_LIST;
        this.D = e.f10647g;
        this.E = 0.0533f;
        this.F = 0.08f;
        d dVar = new d(context, 0);
        this.A = dVar;
        n0 n0Var = new n0(context, null);
        this.B = n0Var;
        n0Var.setBackgroundColor(0);
        n0Var.getSettings().setAllowContentAccess(false);
        addView(dVar);
        addView(n0Var);
    }

    @Override
    public final void a(List list, e eVar, float f3, float f10) {
        this.D = eVar;
        this.E = f3;
        this.F = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            d7.b bVar = (d7.b) list.get(i10);
            if (bVar.f4750d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.C.isEmpty() || !arrayList2.isEmpty()) {
            this.C = arrayList2;
            c();
        }
        this.A.a(arrayList, eVar, f3, f10);
        invalidate();
    }

    public final String b(float f3, int i10) {
        float fA0 = a.a.a0(i10, f3, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fA0 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fA0 / getContext().getResources().getDisplayMetrics().density)};
        String str = e7.i0.f5136a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    public final void c() {
        String strConcat;
        String str;
        String str2;
        int i10;
        float f3;
        String str3;
        Layout.Alignment alignment;
        String str4;
        int i11;
        int i12;
        Object obj;
        int i13;
        String str5;
        int i14;
        String str6;
        String str7;
        Object obj2;
        String str8;
        CharSequence charSequence;
        float f10;
        String str9;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i15;
        HashMap map;
        Iterator it;
        String str10;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i16;
        String str11;
        StringBuilder sb2;
        int i17;
        int i18;
        bh.f fVar;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z10;
        boolean z11;
        Object[] objArr;
        d7.h hVar;
        int i19;
        int i20;
        StringBuilder sb3;
        int i21;
        String str12;
        String strP;
        int i22;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str13;
        int spanStart;
        int spanEnd;
        g0 g0Var;
        g0 g0Var2;
        String str14;
        float f11;
        String str15;
        Layout.Alignment alignment2;
        int i23;
        String str16;
        String str17;
        String str18;
        boolean z12;
        StringBuilder sb4 = new StringBuilder();
        String strS = ze.d.S(this.D.f10648a);
        int i24 = 0;
        String strB = b(this.E, 0);
        float f12 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        e eVar = this.D;
        int i25 = eVar.f10651d;
        int i26 = eVar.f10652e;
        int i27 = 2;
        int i28 = 1;
        if (i25 == 1) {
            Object[] objArr2 = {ze.d.S(i26)};
            String str19 = e7.i0.f5136a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i25 == 2) {
            String strS2 = ze.d.S(i26);
            String str20 = e7.i0.f5136a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strS2);
        } else if (i25 == 3) {
            String strS3 = ze.d.S(i26);
            String str21 = e7.i0.f5136a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strS3);
        } else if (i25 != 4) {
            strConcat = "unset";
        } else {
            String strS4 = ze.d.S(i26);
            String str22 = e7.i0.f5136a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strS4);
        }
        Object[] objArr3 = {strS, strB, fValueOf, strConcat};
        String str23 = e7.i0.f5136a;
        sb4.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map2 = new HashMap();
        String strS5 = ze.d.S(this.D.f10649b);
        String str24 = "background-color:";
        StringBuilder sb5 = new StringBuilder("background-color:");
        sb5.append(strS5);
        String str25 = ";";
        sb5.append(";");
        map2.put(".default_bg,.default_bg *", sb5.toString());
        int i29 = 0;
        while (i29 < this.C.size()) {
            d7.b bVar = (d7.b) this.C.get(i29);
            float f13 = bVar.f4754h;
            int i30 = bVar.f4753g;
            int i31 = bVar.f4760p;
            float f14 = f13 != -3.4028235E38f ? f13 * 100.0f : 50.0f;
            float f15 = f12;
            int i32 = bVar.f4755i;
            int i33 = -100;
            int i34 = i32 != i28 ? i32 != i27 ? i24 : -100 : -50;
            float f16 = bVar.f4751e;
            if (f16 != -3.4028235E38f) {
                if (bVar.f4752f != i28) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f16 * 100.0f));
                    if (i31 == i28) {
                        i33 = -(i30 != i28 ? i30 != 2 ? 0 : -100 : -50);
                    } else {
                        i33 = i30 != i28 ? i30 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    if (f16 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f16 * f15));
                        i10 = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f16) - 1.0f) * f15));
                        i10 = i28;
                    }
                    i33 = 0;
                }
                f3 = bVar.f4756j;
                if (f3 != -3.4028235E38f) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f3 * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str26 = str3;
                alignment = bVar.f4748b;
                str4 = "end";
                if (alignment == null) {
                    i13 = i28;
                    obj = "center";
                    i12 = 2;
                } else {
                    i11 = o0.f10725a[alignment.ordinal()];
                    if (i11 != i28) {
                        i12 = 2;
                        if (i11 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i12 = 2;
                        obj = "start";
                    }
                    i13 = 1;
                }
                if (i31 != i13) {
                    str5 = "vertical-rl";
                } else if (i31 != i12) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str27 = str5;
                String strB2 = b(bVar.f4759o, bVar.f4758n);
                if (bVar.l) {
                    i14 = bVar.m;
                } else {
                    i14 = this.D.f10650c;
                }
                String strS6 = ze.d.S(i14);
                if (i31 != 1) {
                    if (i10 != 0) {
                        str6 = "left";
                    } else {
                        str6 = "right";
                    }
                    str7 = str6;
                    obj2 = "top";
                } else if (i31 != 2) {
                    str7 = i10 != 0 ? "bottom" : "top";
                    obj2 = "left";
                } else {
                    if (i10 != 0) {
                        str6 = "right";
                    } else {
                        str6 = "left";
                    }
                    str7 = str6;
                    obj2 = "top";
                }
                if (i31 != 2 || i31 == 1) {
                    str8 = "height";
                    int i35 = i33;
                    i33 = i34;
                    i34 = i35;
                } else {
                    str8 = "width";
                }
                String str28 = str8;
                charSequence = bVar.f4747a;
                f10 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = h0.f10686a;
                int i36 = i34;
                int i37 = i29;
                if (charSequence == null) {
                    fVar = new bh.f(RuntimeVersion.SUFFIX, false);
                    str9 = RuntimeVersion.SUFFIX;
                } else {
                    str9 = RuntimeVersion.SUFFIX;
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i15 = 0;
                        while (i15 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i15].getBackgroundColor()));
                            i15++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strF = g4.c.f(iIntValue, "bg_");
                            Iterator it4 = it;
                            String strQ = a1.b.q(".", strF, ",.", strF, " *");
                            String strS7 = ze.d.S(iIntValue);
                            String str29 = e7.i0.f5136a;
                            Locale locale4 = Locale.US;
                            map.put(strQ, str24 + strS7 + str25);
                            it = it4;
                            str4 = str4;
                        }
                        str10 = str4;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i16 = 0;
                        for (length2 = spans.length; i16 < length2; length2 = length2) {
                            obj3 = spans[i16];
                            String str30 = str25;
                            z10 = obj3 instanceof StrikethroughSpan;
                            String str31 = null;
                            if (z10) {
                                z11 = z10;
                                strP = "<span style='text-decoration:line-through;'>";
                            } else {
                                z11 = z10;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strS8 = ze.d.S(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str32 = e7.i0.f5136a;
                                    Locale locale5 = Locale.US;
                                    strP = a1.b.p("<span style='color:", strS8, ";'>");
                                } else {
                                    str24 = str24;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str33 = e7.i0.f5136a;
                                        Locale locale6 = Locale.US;
                                        objArr = spans;
                                        strP = g4.c.i("<span class='bg_", backgroundColor, "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj3 instanceof d7.e) {
                                            strP = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f10;
                                            }
                                            Object[] objArr4 = {Float.valueOf(size)};
                                            String str34 = e7.i0.f5136a;
                                            strP = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str35 = e7.i0.f5136a;
                                            strP = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str36 = e7.i0.f5136a;
                                                Locale locale7 = Locale.US;
                                                strP = a1.b.p("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strP = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strP = "<b>";
                                            } else if (style != 2) {
                                                strP = "<i>";
                                            } else if (style != 3) {
                                                strP = null;
                                            } else {
                                                strP = "<b><i>";
                                            }
                                        } else if (obj3 instanceof d7.g) {
                                            i22 = ((d7.g) obj3).f4777b;
                                            if (i22 != -1) {
                                                strP = "<ruby style='ruby-position:unset;'>";
                                            } else if (i22 != 1) {
                                                strP = "<ruby style='ruby-position:over;'>";
                                            } else if (i22 != 2) {
                                                strP = null;
                                            } else {
                                                strP = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strP = "<u>";
                                        } else if (obj3 instanceof d7.h) {
                                            hVar = (d7.h) obj3;
                                            i19 = hVar.f4781a;
                                            i20 = hVar.f4782b;
                                            sb3 = new StringBuilder();
                                            if (i20 != 1) {
                                                i21 = 2;
                                                if (i20 == 2) {
                                                    sb3.append("open ");
                                                }
                                            } else {
                                                i21 = 2;
                                                sb3.append("filled ");
                                            }
                                            if (i19 != 0) {
                                                sb3.append("none");
                                            } else if (i19 != 1) {
                                                sb3.append("circle");
                                            } else if (i19 != i21) {
                                                sb3.append("dot");
                                            } else if (i19 != 3) {
                                                sb3.append("unset");
                                            } else {
                                                sb3.append("sesame");
                                            }
                                            String string = sb3.toString();
                                            if (hVar.f4783c != 2) {
                                                str12 = "over right";
                                            } else {
                                                str12 = "under left";
                                            }
                                            Object[] objArr6 = {string, str12};
                                            String str37 = e7.i0.f5136a;
                                            strP = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                        } else {
                                            strP = null;
                                        }
                                    }
                                }
                                if (z11 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof d7.e) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof d7.h)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str13 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str31 = "</b>";
                                            } else if (style2 == 2) {
                                                str31 = "</i>";
                                            } else if (style2 == 3) {
                                                str31 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof d7.g) {
                                            str31 = "<rt>" + h0.a(((d7.g) obj3).f4776a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str31 = "</u>";
                                        }
                                        str13 = str31;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strP != null) {
                                    str13.getClass();
                                    f0 f0Var = new f0(spanStart, spanEnd, strP, str13);
                                    g0Var = (g0) sparseArray.get(spanStart);
                                    if (g0Var == null) {
                                        g0Var = new g0();
                                        sparseArray.put(spanStart, g0Var);
                                    }
                                    g0Var.f10666a.add(f0Var);
                                    g0Var2 = (g0) sparseArray.get(spanEnd);
                                    if (g0Var2 == null) {
                                        g0Var2 = new g0();
                                        sparseArray.put(spanEnd, g0Var2);
                                    }
                                    g0Var2.f10667b.add(f0Var);
                                }
                                i16++;
                                str25 = str30;
                                str24 = str24;
                                spans = objArr;
                            }
                            objArr = spans;
                            str13 = z11 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strP != null) {
                                str13.getClass();
                                f0 f0Var2 = new f0(spanStart, spanEnd, strP, str13);
                                g0Var = (g0) sparseArray.get(spanStart);
                                if (g0Var == null) {
                                    g0Var = new g0();
                                    sparseArray.put(spanStart, g0Var);
                                }
                                g0Var.f10666a.add(f0Var2);
                                g0Var2 = (g0) sparseArray.get(spanEnd);
                                if (g0Var2 == null) {
                                    g0Var2 = new g0();
                                    sparseArray.put(spanEnd, g0Var2);
                                }
                                g0Var2.f10667b.add(f0Var2);
                            }
                            i16++;
                            str25 = str30;
                            str24 = str24;
                            spans = objArr;
                        }
                        str25 = str25;
                        str11 = str24;
                        sb2 = new StringBuilder(spanned.length());
                        i17 = 0;
                        i18 = 0;
                        while (i17 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i17);
                            sb2.append(h0.a(spanned.subSequence(i18, iKeyAt)));
                            g0 g0Var3 = (g0) sparseArray.get(iKeyAt);
                            ArrayList arrayList = g0Var3.f10667b;
                            ArrayList arrayList2 = g0Var3.f10666a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, f0.f10659f);
                            it2 = g0Var3.f10667b.iterator();
                            while (it2.hasNext()) {
                                sb2.append(((f0) it2.next()).f10663d);
                            }
                            Collections.sort(arrayList2, f0.f10658e);
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                sb2.append(((f0) it3.next()).f10662c);
                            }
                            i17++;
                            i18 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb2.append(h0.a(spanned.subSequence(i18, spanned.length())));
                        fVar = new bh.f(sb2.toString(), false);
                    } else {
                        fVar = new bh.f(h0.a(charSequence), false);
                    }
                    str14 = fVar.A;
                    for (String str38 : map2.keySet()) {
                        str18 = (String) map2.put(str38, (String) map2.get(str38));
                        if (str18 != null || str18.equals(map2.get(str38))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ta.c0.A(z12);
                    }
                    Integer numValueOf = Integer.valueOf(i37);
                    Float fValueOf2 = Float.valueOf(f14);
                    Integer numValueOf2 = Integer.valueOf(i36);
                    Integer numValueOf3 = Integer.valueOf(i33);
                    f11 = bVar.f4761q;
                    if (f11 != 0.0f) {
                        if (i31 != 2 || i31 == 1) {
                            str17 = "skewY";
                        } else {
                            str17 = "skewX";
                        }
                        Object[] objArr7 = {str17, Float.valueOf(f11)};
                        String str39 = e7.i0.f5136a;
                        str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                    } else {
                        str15 = str9;
                    }
                    sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str7, str2, str28, str26, obj, str27, strB2, strS6, numValueOf2, numValueOf3, str15));
                    sb4.append("<span class='default_bg'>");
                    alignment2 = bVar.f4749c;
                    if (alignment2 != null) {
                        i23 = o0.f10725a[alignment2.ordinal()];
                        if (i23 != 1) {
                            i27 = 2;
                            if (i23 != 2) {
                                str16 = "center";
                            } else {
                                str16 = str10;
                            }
                        } else {
                            i27 = 2;
                            str16 = "start";
                        }
                        sb4.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                        sb4.append(str14);
                        sb4.append("</span>");
                    } else {
                        i27 = 2;
                        sb4.append(str14);
                    }
                    sb4.append("</span></div>");
                    i29 = i37 + 1;
                    f12 = f15;
                    str25 = str25;
                    str24 = str11;
                    i24 = 0;
                    i28 = 1;
                }
                str11 = str24;
                str10 = "end";
                str14 = fVar.A;
                while (r4.hasNext()) {
                    str18 = (String) map2.put(str38, (String) map2.get(str38));
                    if (str18 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    ta.c0.A(z12);
                }
                Integer numValueOf4 = Integer.valueOf(i37);
                Float fValueOf3 = Float.valueOf(f14);
                Integer numValueOf5 = Integer.valueOf(i36);
                Integer numValueOf6 = Integer.valueOf(i33);
                f11 = bVar.f4761q;
                if (f11 != 0.0f) {
                    if (i31 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr8 = {str17, Float.valueOf(f11)};
                    String str310 = e7.i0.f5136a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
                } else {
                    str15 = str9;
                }
                sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str7, str2, str28, str26, obj, str27, strB2, strS6, numValueOf5, numValueOf6, str15));
                sb4.append("<span class='default_bg'>");
                alignment2 = bVar.f4749c;
                if (alignment2 != null) {
                    i23 = o0.f10725a[alignment2.ordinal()];
                    if (i23 != 1) {
                        i27 = 2;
                        if (i23 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str10;
                        }
                    } else {
                        i27 = 2;
                        str16 = "start";
                    }
                    sb4.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb4.append(str14);
                    sb4.append("</span>");
                } else {
                    i27 = 2;
                    sb4.append(str14);
                }
                sb4.append("</span></div>");
                i29 = i37 + 1;
                f12 = f15;
                str25 = str25;
                str24 = str11;
                i24 = 0;
                i28 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.F) * 100.0f));
            }
            str2 = str;
            i10 = 0;
            f3 = bVar.f4756j;
            if (f3 != -3.4028235E38f) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f3 * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = bVar.f4748b;
            str4 = "end";
            if (alignment == null) {
                i13 = i28;
                obj = "center";
                i12 = 2;
            } else {
                i11 = o0.f10725a[alignment.ordinal()];
                if (i11 != i28) {
                    i12 = 2;
                    if (i11 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i12 = 2;
                    obj = "start";
                }
                i13 = 1;
            }
            if (i31 != i13) {
                str5 = "vertical-rl";
            } else if (i31 != i12) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str211 = str5;
            String strB3 = b(bVar.f4759o, bVar.f4758n);
            if (bVar.l) {
                i14 = bVar.m;
            } else {
                i14 = this.D.f10650c;
            }
            String strS9 = ze.d.S(i14);
            if (i31 != 1) {
                if (i10 != 0) {
                    str6 = "left";
                } else {
                    str6 = "right";
                }
                str7 = str6;
                obj2 = "top";
            } else if (i31 != 2) {
                str7 = i10 != 0 ? "bottom" : "top";
                obj2 = "left";
            } else {
                if (i10 != 0) {
                    str6 = "right";
                } else {
                    str6 = "left";
                }
                str7 = str6;
                obj2 = "top";
            }
            if (i31 != 2) {
                str8 = "height";
                int i38 = i33;
                i33 = i34;
                i34 = i38;
            } else {
                str8 = "height";
                int i39 = i33;
                i33 = i34;
                i34 = i39;
            }
            String str212 = str8;
            charSequence = bVar.f4747a;
            f10 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = h0.f10686a;
            int i310 = i34;
            int i311 = i29;
            if (charSequence == null) {
                fVar = new bh.f(RuntimeVersion.SUFFIX, false);
                str9 = RuntimeVersion.SUFFIX;
            } else {
                str9 = RuntimeVersion.SUFFIX;
                if (charSequence instanceof Spanned) {
                    fVar = new bh.f(h0.a(charSequence), false);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i15 = 0;
                    while (i15 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i15].getBackgroundColor()));
                        i15++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strF2 = g4.c.f(iIntValue2, "bg_");
                        Iterator it5 = it;
                        String strQ2 = a1.b.q(".", strF2, ",.", strF2, " *");
                        String strS10 = ze.d.S(iIntValue2);
                        String str213 = e7.i0.f5136a;
                        Locale locale8 = Locale.US;
                        map.put(strQ2, str24 + strS10 + str25);
                        it = it5;
                        str4 = str4;
                    }
                    str10 = str4;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i16 = 0;
                    while (i16 < length2) {
                        obj3 = spans[i16];
                        String str311 = str25;
                        z10 = obj3 instanceof StrikethroughSpan;
                        String str312 = null;
                        if (z10) {
                            z11 = z10;
                            strP = "<span style='text-decoration:line-through;'>";
                        } else {
                            z11 = z10;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strS11 = ze.d.S(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str313 = e7.i0.f5136a;
                                Locale locale9 = Locale.US;
                                strP = a1.b.p("<span style='color:", strS11, ";'>");
                            } else {
                                str24 = str24;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str314 = e7.i0.f5136a;
                                    Locale locale10 = Locale.US;
                                    objArr = spans;
                                    strP = g4.c.i("<span class='bg_", backgroundColor2, "'>");
                                } else {
                                    objArr = spans;
                                    if (obj3 instanceof d7.e) {
                                        strP = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f10;
                                        }
                                        Object[] objArr9 = {Float.valueOf(size)};
                                        String str315 = e7.i0.f5136a;
                                        strP = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr9);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr10 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str316 = e7.i0.f5136a;
                                        strP = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr10);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str317 = e7.i0.f5136a;
                                            Locale locale11 = Locale.US;
                                            strP = a1.b.p("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strP = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strP = "<b>";
                                        } else if (style != 2) {
                                            strP = "<i>";
                                        } else if (style != 3) {
                                            strP = null;
                                        } else {
                                            strP = "<b><i>";
                                        }
                                    } else if (obj3 instanceof d7.g) {
                                        i22 = ((d7.g) obj3).f4777b;
                                        if (i22 != -1) {
                                            strP = "<ruby style='ruby-position:unset;'>";
                                        } else if (i22 != 1) {
                                            strP = "<ruby style='ruby-position:over;'>";
                                        } else if (i22 != 2) {
                                            strP = null;
                                        } else {
                                            strP = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strP = "<u>";
                                    } else if (obj3 instanceof d7.h) {
                                        hVar = (d7.h) obj3;
                                        i19 = hVar.f4781a;
                                        i20 = hVar.f4782b;
                                        sb3 = new StringBuilder();
                                        if (i20 != 1) {
                                            i21 = 2;
                                            if (i20 == 2) {
                                                sb3.append("open ");
                                            }
                                        } else {
                                            i21 = 2;
                                            sb3.append("filled ");
                                        }
                                        if (i19 != 0) {
                                            sb3.append("none");
                                        } else if (i19 != 1) {
                                            sb3.append("circle");
                                        } else if (i19 != i21) {
                                            sb3.append("dot");
                                        } else if (i19 != 3) {
                                            sb3.append("unset");
                                        } else {
                                            sb3.append("sesame");
                                        }
                                        String string2 = sb3.toString();
                                        if (hVar.f4783c != 2) {
                                            str12 = "over right";
                                        } else {
                                            str12 = "under left";
                                        }
                                        Object[] objArr11 = {string2, str12};
                                        String str318 = e7.i0.f5136a;
                                        strP = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr11);
                                    } else {
                                        strP = null;
                                    }
                                }
                            }
                            if (z11) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strP != null) {
                                str13.getClass();
                                f0 f0Var3 = new f0(spanStart, spanEnd, strP, str13);
                                g0Var = (g0) sparseArray.get(spanStart);
                                if (g0Var == null) {
                                    g0Var = new g0();
                                    sparseArray.put(spanStart, g0Var);
                                }
                                g0Var.f10666a.add(f0Var3);
                                g0Var2 = (g0) sparseArray.get(spanEnd);
                                if (g0Var2 == null) {
                                    g0Var2 = new g0();
                                    sparseArray.put(spanEnd, g0Var2);
                                }
                                g0Var2.f10667b.add(f0Var3);
                            }
                            i16++;
                            str25 = str311;
                            str24 = str24;
                            spans = objArr;
                        }
                        objArr = spans;
                        if (z11) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strP != null) {
                            str13.getClass();
                            f0 f0Var4 = new f0(spanStart, spanEnd, strP, str13);
                            g0Var = (g0) sparseArray.get(spanStart);
                            if (g0Var == null) {
                                g0Var = new g0();
                                sparseArray.put(spanStart, g0Var);
                            }
                            g0Var.f10666a.add(f0Var4);
                            g0Var2 = (g0) sparseArray.get(spanEnd);
                            if (g0Var2 == null) {
                                g0Var2 = new g0();
                                sparseArray.put(spanEnd, g0Var2);
                            }
                            g0Var2.f10667b.add(f0Var4);
                        }
                        i16++;
                        str25 = str311;
                        str24 = str24;
                        spans = objArr;
                    }
                    str25 = str25;
                    str11 = str24;
                    sb2 = new StringBuilder(spanned.length());
                    i17 = 0;
                    i18 = 0;
                    while (i17 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i17);
                        sb2.append(h0.a(spanned.subSequence(i18, iKeyAt2)));
                        g0 g0Var4 = (g0) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = g0Var4.f10667b;
                        ArrayList arrayList4 = g0Var4.f10666a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList3, f0.f10659f);
                        it2 = g0Var4.f10667b.iterator();
                        while (it2.hasNext()) {
                            sb2.append(((f0) it2.next()).f10663d);
                        }
                        Collections.sort(arrayList4, f0.f10658e);
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            sb2.append(((f0) it3.next()).f10662c);
                        }
                        i17++;
                        i18 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb2.append(h0.a(spanned.subSequence(i18, spanned.length())));
                    fVar = new bh.f(sb2.toString(), false);
                }
                str14 = fVar.A;
                while (r4.hasNext()) {
                    str18 = (String) map2.put(str38, (String) map2.get(str38));
                    if (str18 != null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    ta.c0.A(z12);
                }
                Integer numValueOf7 = Integer.valueOf(i311);
                Float fValueOf4 = Float.valueOf(f14);
                Integer numValueOf8 = Integer.valueOf(i310);
                Integer numValueOf9 = Integer.valueOf(i33);
                f11 = bVar.f4761q;
                if (f11 != 0.0f) {
                    if (i31 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr12 = {str17, Float.valueOf(f11)};
                    String str319 = e7.i0.f5136a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str15 = str9;
                }
                sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str7, str2, str212, str210, obj, str211, strB3, strS9, numValueOf8, numValueOf9, str15));
                sb4.append("<span class='default_bg'>");
                alignment2 = bVar.f4749c;
                if (alignment2 != null) {
                    i23 = o0.f10725a[alignment2.ordinal()];
                    if (i23 != 1) {
                        i27 = 2;
                        if (i23 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str10;
                        }
                    } else {
                        i27 = 2;
                        str16 = "start";
                    }
                    sb4.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb4.append(str14);
                    sb4.append("</span>");
                } else {
                    i27 = 2;
                    sb4.append(str14);
                }
                sb4.append("</span></div>");
                i29 = i311 + 1;
                f12 = f15;
                str25 = str25;
                str24 = str11;
                i24 = 0;
                i28 = 1;
            }
            str11 = str24;
            str10 = "end";
            str14 = fVar.A;
            while (r4.hasNext()) {
                str18 = (String) map2.put(str38, (String) map2.get(str38));
                if (str18 != null) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                ta.c0.A(z12);
            }
            Integer numValueOf10 = Integer.valueOf(i311);
            Float fValueOf5 = Float.valueOf(f14);
            Integer numValueOf11 = Integer.valueOf(i310);
            Integer numValueOf12 = Integer.valueOf(i33);
            f11 = bVar.f4761q;
            if (f11 != 0.0f) {
                if (i31 != 2) {
                    str17 = "skewY";
                } else {
                    str17 = "skewY";
                }
                Object[] objArr13 = {str17, Float.valueOf(f11)};
                String str3110 = e7.i0.f5136a;
                str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr13);
            } else {
                str15 = str9;
            }
            sb4.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str7, str2, str212, str210, obj, str211, strB3, strS9, numValueOf11, numValueOf12, str15));
            sb4.append("<span class='default_bg'>");
            alignment2 = bVar.f4749c;
            if (alignment2 != null) {
                i23 = o0.f10725a[alignment2.ordinal()];
                if (i23 != 1) {
                    i27 = 2;
                    if (i23 != 2) {
                        str16 = "center";
                    } else {
                        str16 = str10;
                    }
                } else {
                    i27 = 2;
                    str16 = "start";
                }
                sb4.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                sb4.append(str14);
                sb4.append("</span>");
            } else {
                i27 = 2;
                sb4.append(str14);
            }
            sb4.append("</span></div>");
            i29 = i311 + 1;
            f12 = f15;
            str25 = str25;
            str24 = str11;
            i24 = 0;
            i28 = 1;
        }
        sb4.append("</div></body></html>");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("<html><head><style>");
        for (String str40 : map2.keySet()) {
            sb6.append(str40);
            sb6.append("{");
            sb6.append((String) map2.get(str40));
            sb6.append("}");
        }
        sb6.append("</style></head>");
        sb4.insert(0, (CharSequence) sb6);
        this.B.loadData(Base64.encodeToString(sb4.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.C.isEmpty()) {
            return;
        }
        c();
    }
}
