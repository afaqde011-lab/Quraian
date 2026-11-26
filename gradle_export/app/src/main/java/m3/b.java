package m3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import k9.b3;

public final class b {

    public final u3.c f10413a;

    public final int f10414b;

    public final long f10415c;

    public final n3.i f10416d;

    public final CharSequence f10417e;

    public final Object f10418f;

    public b(u3.c cVar, int i10, int i11, long j9) {
        int i12;
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        n3.i iVarA;
        TextUtils.TruncateAt truncateAt3;
        int i16;
        b bVar;
        int i17;
        int i18;
        TextUtils.TruncateAt truncateAt4;
        int i19;
        Layout layout;
        Spanned spanned;
        w3.b[] bVarArr;
        CharSequence charSequence2;
        Spanned spanned2;
        h00.x arrayList;
        int i20;
        h00.x xVar;
        int spanEnd;
        int lineForOffset;
        boolean z10;
        boolean z11;
        boolean z12;
        h2.c cVar2;
        float fI;
        int iC;
        float fH;
        int iC2;
        int i21;
        this.f10413a = cVar;
        this.f10414b = i10;
        this.f10415c = j9;
        if (y3.a.i(j9) != 0 || y3.a.j(j9) != 0) {
            s3.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 < 1) {
            s3.a.a("maxLines should be greater than 0");
        }
        r0 r0Var = cVar.B;
        CharSequence charSequence3 = cVar.H;
        if (i11 == 2) {
            i12 = 0;
            charSequence = charSequence3;
            if (!y3.o.a(r0Var.f10522a.f10464h, kh.o.z(0))) {
                charSequence = charSequence3;
                if (!y3.o.a(r0Var.f10522a.f10464h, y3.o.f16599c)) {
                    int i22 = r0Var.f10523b.f10537a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i22 != 0 && i22 != 5 && i22 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean zF = n3.f.f(spannableString, p3.c.class);
                            charSequence = spannableString;
                            if (!zF) {
                                spannableString.setSpan(new p3.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i12 = 0;
            charSequence = charSequence3;
        }
        this.f10417e = charSequence;
        v vVar = r0Var.f10523b;
        int i23 = vVar.f10537a;
        int i24 = 3;
        int i25 = i23 == 1 ? 3 : i23 == 2 ? 4 : i23 == 3 ? 2 : (i23 != 5 && i23 == 6) ? 1 : i12;
        int i26 = i23 == 4 ? 1 : i12;
        int i27 = vVar.f10544h == 2 ? 4 : i12;
        int i28 = vVar.f10543g;
        int i29 = i28 & 255;
        if (i29 == 1) {
            i13 = i12;
        } else if (i29 == 2) {
            i13 = 1;
        } else if (i29 == 3) {
            i13 = 2;
        } else {
            i13 = i12;
        }
        int i30 = (i28 >> 8) & 255;
        if (i30 == 1) {
            i24 = i12;
        } else if (i30 == 2) {
            i24 = 1;
        } else if (i30 == 3) {
            i24 = 2;
        } else if (i30 != 4) {
            i24 = i12;
        }
        int i31 = (i28 >> 16) & 255;
        if (i31 != 1) {
            i14 = 2;
            i15 = i31 == 2 ? 1 : i15;
            if (i11 == i14) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i11 == 5) {
                    if (i11 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        truncateAt = null;
                    }
                    iVarA = a(i25, i26, truncateAt, i10, i27, i13, i24, i15, charSequence);
                    truncateAt3 = truncateAt;
                    i16 = i27;
                    CharSequence charSequence4 = charSequence;
                    Layout layout2 = iVarA.f11043f;
                    if (Build.VERSION.SDK_INT < 35 || cVar.G.getLetterSpacing() == 0.0f || (!(i11 == 4 || i11 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        bVar = this;
                        i17 = i10;
                        i18 = i16;
                        truncateAt4 = truncateAt3;
                        i19 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i19 = 2;
                        CharSequence charSequenceConcat = TextUtils.concat(charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length()));
                        b bVar2 = this;
                        i17 = i10;
                        i18 = i16;
                        truncateAt4 = truncateAt3;
                        iVarA = bVar2.a(i25, i26, truncateAt4, i17, i18, i13, i24, i15, charSequenceConcat);
                        bVar = bVar2;
                    }
                    int i32 = iVarA.f11044g;
                    if (i11 == i19 || iVarA.a() <= y3.a.g(j9) || i17 <= 1) {
                        bVar.f10416d = iVarA;
                    } else {
                        int iG = y3.a.g(j9);
                        for (int i33 = 0; i33 < i32; i33++) {
                            if (iVarA.e(i33) > iG) {
                                i32 = i33;
                                break;
                            }
                        }
                        if (i32 >= 0 && i32 != bVar.f10414b) {
                            iVarA = bVar.a(i25, i26, truncateAt4, i32 < 1 ? 1 : i32, i18, i13, i24, i15, bVar.f10417e);
                        }
                        bVar.f10416d = iVarA;
                    }
                    bVar.f10413a.G.c(r0Var.b(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << 32), r0Var.f10522a.f10457a.c());
                    layout = bVar.f10416d.f11043f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        kotlin.jvm.internal.m.c(text, "null cannot be cast to non-null type android.text.Spanned");
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), w3.b.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            kotlin.jvm.internal.m.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                            bVarArr = (w3.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), w3.b.class);
                        } else {
                            bVarArr = null;
                        }
                    } else {
                        bVarArr = null;
                    }
                    if (bVarArr != null) {
                        for (w3.b bVar3 : bVarArr) {
                            bVar3.C.setValue(new h2.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << 32)));
                        }
                    }
                    charSequence2 = bVar.f10417e;
                    if (charSequence2 instanceof Spanned) {
                        spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), p3.i.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            p3.i iVar = (p3.i) obj;
                            int spanStart = spanned2.getSpanStart(iVar);
                            spanEnd = spanned2.getSpanEnd(iVar);
                            lineForOffset = bVar.f10416d.f11043f.getLineForOffset(spanStart);
                            if (lineForOffset >= bVar.f10414b) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (bVar.f10416d.f11043f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= bVar.f10416d.f11043f.getEllipsisStart(lineForOffset) + bVar.f10416d.f11043f.getLineStart(lineForOffset)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (spanEnd > bVar.f10416d.f(lineForOffset)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z11 && !z12 && !z10) {
                                boolean z13 = bVar.f10416d.f11043f.getParagraphDirection(lineForOffset) == 1;
                                boolean zIsRtlCharAt = bVar.f10416d.f11043f.isRtlCharAt(spanStart);
                                if (!z13 || zIsRtlCharAt) {
                                    if (z13 && zIsRtlCharAt) {
                                        fH = bVar.f10416d.i(spanStart, false);
                                        iC2 = iVar.c();
                                    } else if (zIsRtlCharAt) {
                                        fH = bVar.f10416d.h(spanStart, false);
                                        iC2 = iVar.c();
                                    } else {
                                        fI = bVar.f10416d.i(spanStart, false);
                                        iC = iVar.c();
                                    }
                                    fI = fH - iC2;
                                    n3.i iVar2 = bVar.f10416d;
                                    iVar.getClass();
                                    float fD = iVar2.d(lineForOffset) - iVar.b();
                                    cVar2 = new h2.c(fI, fD, fH, iVar.b() + fD);
                                } else {
                                    fI = bVar.f10416d.h(spanStart, false);
                                    iC = iVar.c();
                                }
                                fH = iC + fI;
                                n3.i iVar3 = bVar.f10416d;
                                iVar.getClass();
                                float fD2 = iVar3.d(lineForOffset) - iVar.b();
                                cVar2 = new h2.c(fI, fD2, fH, iVar.b() + fD2);
                            }
                            arrayList.add(cVar2);
                        }
                        xVar = arrayList;
                    } else {
                        xVar = h00.x.A;
                    }
                    bVar.f10418f = xVar;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            truncateAt = truncateAt2;
            iVarA = a(i25, i26, truncateAt, i10, i27, i13, i24, i15, charSequence);
            truncateAt3 = truncateAt;
            i16 = i27;
            CharSequence charSequence5 = charSequence;
            Layout layout3 = iVarA.f11043f;
            if (Build.VERSION.SDK_INT < 35) {
                bVar = this;
                i17 = i10;
                i18 = i16;
                truncateAt4 = truncateAt3;
                i19 = 2;
            } else {
                bVar = this;
                i17 = i10;
                i18 = i16;
                truncateAt4 = truncateAt3;
                i19 = 2;
            }
            int i34 = iVarA.f11044g;
            if (i11 == i19) {
                bVar.f10416d = iVarA;
            } else {
                bVar.f10416d = iVarA;
            }
            bVar.f10413a.G.c(r0Var.b(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << 32), r0Var.f10522a.f10457a.c());
            layout = bVar.f10416d.f11043f;
            if (layout.getText() instanceof Spanned) {
                bVarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                kotlin.jvm.internal.m.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), w3.b.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    kotlin.jvm.internal.m.c(text4, "null cannot be cast to non-null type android.text.Spanned");
                    bVarArr = (w3.b[]) ((Spanned) text4).getSpans(0, layout.getText().length(), w3.b.class);
                } else {
                    bVarArr = null;
                }
            }
            if (bVarArr != null) {
                while (i21 < r2) {
                    bVar3.C.setValue(new h2.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << 32)));
                }
            }
            charSequence2 = bVar.f10417e;
            if (charSequence2 instanceof Spanned) {
                xVar = h00.x.A;
            } else {
                spanned2 = (Spanned) charSequence2;
                Object[] spans2 = spanned2.getSpans(0, charSequence2.length(), p3.i.class);
                arrayList = new ArrayList(spans2.length);
                while (i20 < r4) {
                    p3.i iVar4 = (p3.i) obj;
                    int spanStart2 = spanned2.getSpanStart(iVar4);
                    spanEnd = spanned2.getSpanEnd(iVar4);
                    lineForOffset = bVar.f10416d.f11043f.getLineForOffset(spanStart2);
                    if (lineForOffset >= bVar.f10414b) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bVar.f10416d.f11043f.getEllipsisCount(lineForOffset) > 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (spanEnd > bVar.f10416d.f(lineForOffset)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar2 = z11 ? null : null;
                    arrayList.add(cVar2);
                }
                xVar = arrayList;
            }
            bVar.f10418f = xVar;
        }
        i14 = 2;
        i15 = i12;
        if (i11 == i14) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i11 == 5) {
                if (i11 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                }
                iVarA = a(i25, i26, truncateAt, i10, i27, i13, i24, i15, charSequence);
                truncateAt3 = truncateAt;
                i16 = i27;
                CharSequence charSequence6 = charSequence;
                Layout layout4 = iVarA.f11043f;
                if (Build.VERSION.SDK_INT < 35) {
                    bVar = this;
                    i17 = i10;
                    i18 = i16;
                    truncateAt4 = truncateAt3;
                    i19 = 2;
                } else {
                    bVar = this;
                    i17 = i10;
                    i18 = i16;
                    truncateAt4 = truncateAt3;
                    i19 = 2;
                }
                int i35 = iVarA.f11044g;
                if (i11 == i19) {
                    bVar.f10416d = iVarA;
                } else {
                    bVar.f10416d = iVarA;
                }
                bVar.f10413a.G.c(r0Var.b(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << 32), r0Var.f10522a.f10457a.c());
                layout = bVar.f10416d.f11043f;
                if (layout.getText() instanceof Spanned) {
                    bVarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    kotlin.jvm.internal.m.c(text5, "null cannot be cast to non-null type android.text.Spanned");
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), w3.b.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        kotlin.jvm.internal.m.c(text6, "null cannot be cast to non-null type android.text.Spanned");
                        bVarArr = (w3.b[]) ((Spanned) text6).getSpans(0, layout.getText().length(), w3.b.class);
                    } else {
                        bVarArr = null;
                    }
                }
                if (bVarArr != null) {
                    while (i21 < r2) {
                        bVar3.C.setValue(new h2.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << 32)));
                    }
                }
                charSequence2 = bVar.f10417e;
                if (charSequence2 instanceof Spanned) {
                    xVar = h00.x.A;
                } else {
                    spanned2 = (Spanned) charSequence2;
                    Object[] spans3 = spanned2.getSpans(0, charSequence2.length(), p3.i.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i20 < r4) {
                        p3.i iVar5 = (p3.i) obj;
                        int spanStart3 = spanned2.getSpanStart(iVar5);
                        spanEnd = spanned2.getSpanEnd(iVar5);
                        lineForOffset = bVar.f10416d.f11043f.getLineForOffset(spanStart3);
                        if (lineForOffset >= bVar.f10414b) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (bVar.f10416d.f11043f.getEllipsisCount(lineForOffset) > 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (spanEnd > bVar.f10416d.f(lineForOffset)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                        }
                        arrayList.add(cVar2);
                    }
                    xVar = arrayList;
                }
                bVar.f10418f = xVar;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        truncateAt = truncateAt2;
        iVarA = a(i25, i26, truncateAt, i10, i27, i13, i24, i15, charSequence);
        truncateAt3 = truncateAt;
        i16 = i27;
        CharSequence charSequence7 = charSequence;
        Layout layout5 = iVarA.f11043f;
        if (Build.VERSION.SDK_INT < 35) {
            bVar = this;
            i17 = i10;
            i18 = i16;
            truncateAt4 = truncateAt3;
            i19 = 2;
        } else {
            bVar = this;
            i17 = i10;
            i18 = i16;
            truncateAt4 = truncateAt3;
            i19 = 2;
        }
        int i36 = iVarA.f11044g;
        if (i11 == i19) {
            bVar.f10416d = iVarA;
        } else {
            bVar.f10416d = iVarA;
        }
        bVar.f10413a.G.c(r0Var.b(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << 32), r0Var.f10522a.f10457a.c());
        layout = bVar.f10416d.f11043f;
        if (layout.getText() instanceof Spanned) {
            bVarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            kotlin.jvm.internal.m.c(text7, "null cannot be cast to non-null type android.text.Spanned");
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), w3.b.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                kotlin.jvm.internal.m.c(text8, "null cannot be cast to non-null type android.text.Spanned");
                bVarArr = (w3.b[]) ((Spanned) text8).getSpans(0, layout.getText().length(), w3.b.class);
            } else {
                bVarArr = null;
            }
        }
        if (bVarArr != null) {
            while (i21 < r2) {
                bVar3.C.setValue(new h2.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << 32)));
            }
        }
        charSequence2 = bVar.f10417e;
        if (charSequence2 instanceof Spanned) {
            xVar = h00.x.A;
        } else {
            spanned2 = (Spanned) charSequence2;
            Object[] spans4 = spanned2.getSpans(0, charSequence2.length(), p3.i.class);
            arrayList = new ArrayList(spans4.length);
            while (i20 < r4) {
                p3.i iVar6 = (p3.i) obj;
                int spanStart4 = spanned2.getSpanStart(iVar6);
                spanEnd = spanned2.getSpanEnd(iVar6);
                lineForOffset = bVar.f10416d.f11043f.getLineForOffset(spanStart4);
                if (lineForOffset >= bVar.f10414b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bVar.f10416d.f11043f.getEllipsisCount(lineForOffset) > 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (spanEnd > bVar.f10416d.f(lineForOffset)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                arrayList.add(cVar2);
            }
            xVar = arrayList;
        }
        bVar.f10418f = xVar;
    }

    public final n3.i a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        x xVar;
        float fD = d();
        u3.c cVar = this.f10413a;
        u3.d dVar = cVar.G;
        int i17 = cVar.L;
        n3.e eVar = cVar.I;
        r0 r0Var = cVar.B;
        u3.a aVar = u3.b.f14925a;
        z zVar = r0Var.f10524c;
        return new n3.i(charSequence, fD, dVar, i10, truncateAt, i17, (zVar == null || (xVar = zVar.f10553b) == null) ? false : xVar.f10549a, i12, i14, i15, i16, i13, i11, eVar);
    }

    public final float b() {
        return this.f10416d.a();
    }

    public final long c(h2.c cVar, int i10, b3 b3Var) {
        int i11;
        int[] rangeForRect;
        SegmentFinder segmentFinderL;
        RectF rectFA = i2.b0.A(cVar);
        boolean z10 = i10 != 0 && i10 == 1;
        final a aVar = new a(b3Var, 0);
        n3.i iVar = this.f10416d;
        TextPaint textPaint = iVar.f11038a;
        Layout layout = iVar.f11043f;
        if (Build.VERSION.SDK_INT >= 34) {
            if (z10) {
                segmentFinderL = new o3.a(new h7.b(layout.getText(), iVar.j()));
            } else {
                f5.j.D();
                segmentFinderL = f5.j.l(f5.j.k(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFA, segmentFinderL, new Layout.TextInclusionStrategy() {
                @Override
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) aVar.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            ce.c cVarC = iVar.c();
            o3.b bVar = z10 ? new h7.b(layout.getText(), iVar.j()) : new h1.l(layout.getText(), textPaint, false);
            int lineForVertical = layout.getLineForVertical((int) rectFA.top);
            if (rectFA.top <= iVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < iVar.f11044g) {
                int i12 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFA.bottom);
                if (lineForVertical2 != 0 || rectFA.bottom >= iVar.g(0)) {
                    int iE = n3.f.e(iVar, layout, cVarC, i12, rectFA, bVar, aVar, true);
                    while (true) {
                        i11 = i12;
                        if (iE != -1 || i11 >= lineForVertical2) {
                            break;
                        }
                        i12 = i11 + 1;
                        iE = n3.f.e(iVar, layout, cVarC, i12, rectFA, bVar, aVar, true);
                    }
                    if (iE == -1) {
                        rangeForRect = null;
                    } else {
                        int i13 = lineForVertical2;
                        int iE2 = n3.f.e(iVar, layout, cVarC, i13, rectFA, bVar, aVar, false);
                        while (iE2 == -1 && i11 < i13) {
                            i13--;
                            iE2 = n3.f.e(iVar, layout, cVarC, i13, rectFA, bVar, aVar, false);
                        }
                        if (iE2 == -1) {
                            rangeForRect = null;
                        } else {
                            rangeForRect = new int[]{bVar.c0(iE + 1), bVar.f0(iE2 - 1)};
                        }
                    }
                } else {
                    rangeForRect = null;
                }
            } else {
                rangeForRect = null;
            }
        }
        return rangeForRect == null ? q0.f10518b : h0.b(rangeForRect[0], rangeForRect[1]);
    }

    public final float d() {
        return y3.a.h(this.f10415c);
    }

    public final void e(i2.s sVar) {
        Canvas canvasA = i2.b.a(sVar);
        n3.i iVar = this.f10416d;
        if (iVar.f11041d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i10 = iVar.f11045h;
        if (canvasA.getClipBounds(iVar.f11051p)) {
            if (i10 != 0) {
                canvasA.translate(0.0f, i10);
            }
            ThreadLocal threadLocal = n3.j.f11053a;
            Object hVar = threadLocal.get();
            if (hVar == null) {
                hVar = new n3.h();
                threadLocal.set(hVar);
            }
            n3.h hVar2 = (n3.h) hVar;
            hVar2.f11037a = canvasA;
            try {
                iVar.f11043f.draw(hVar2);
                hVar2.f11037a = null;
                if (i10 != 0) {
                    canvasA.translate(0.0f, (-1) * i10);
                }
            } catch (Throwable th2) {
                hVar2.f11037a = null;
                throw th2;
            }
        }
        if (iVar.f11041d) {
            canvasA.restore();
        }
    }

    public final void f(i2.s sVar, long j9, i2.s0 s0Var, x3.l lVar, k2.e eVar) {
        u3.d dVar = this.f10413a.G;
        int i10 = dVar.f14928c;
        dVar.d(j9);
        dVar.f(s0Var);
        dVar.g(lVar);
        dVar.e(eVar);
        dVar.b(3);
        e(sVar);
        dVar.b(i10);
    }

    public final void g(i2.s sVar, i2.q qVar, float f3, i2.s0 s0Var, x3.l lVar, k2.e eVar) {
        u3.d dVar = this.f10413a.G;
        int i10 = dVar.f14928c;
        float fD = d();
        dVar.c(qVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f3);
        dVar.f(s0Var);
        dVar.g(lVar);
        dVar.e(eVar);
        dVar.b(3);
        e(sVar);
        dVar.b(i10);
    }
}
