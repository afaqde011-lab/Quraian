package n3;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import b3.c0;
import java.text.Bidi;

public abstract class f {

    public static final c0 f11034a = new c0(9);

    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i10, int i11, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, boolean z10, int i15, int i16, int i17, int i18) {
        if (i11 < 0) {
            s3.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            s3.a.a("invalid end value");
        }
        if (i12 < 0) {
            s3.a.a("invalid maxLines value");
        }
        if (i10 < 0) {
            s3.a.a("invalid width value");
        }
        if (i13 < 0) {
            s3.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i11, textPaint, i10);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i12);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i13);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z10);
        builderObtain.setBreakStrategy(i15);
        builderObtain.setHyphenationFrequency(i18);
        builderObtain.setIndents(null, null);
        int i19 = Build.VERSION.SDK_INT;
        builderObtain.setJustificationMode(i14);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        builderObtain.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i16).setLineBreakWordStyle(i17).build());
        if (i19 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i10 - 1, i11, MetricAffectingSpan.class) != i11) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i10, iNextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i10, i11, rect3);
        return rect3;
    }

    public static final float c(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    public static final int d(Layout layout, int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i10 || lineEnd == i10) {
            if (lineStart == i10) {
                if (z10) {
                    return lineForOffset - 1;
                }
            } else if (!z10) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final int e(i iVar, Layout layout, ce.c cVar, int i10, RectF rectF, o3.b bVar, m3.a aVar, boolean z10) {
        d[] dVarArr;
        int i11;
        d[] dVarArr2;
        int i12;
        int iF0;
        int i13;
        int i14;
        int iC0;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i15 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i15];
        Layout layout2 = iVar.f11043f;
        int lineStart2 = layout2.getLineStart(i10);
        int iF = iVar.f(i10);
        if (i15 < (iF - lineStart2) * 2) {
            s3.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        i3.f fVar = new i3.f(iVar);
        boolean z11 = false;
        boolean z12 = layout2.getParagraphDirection(i10) == 1;
        int i16 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z12 && !zIsRtlCharAt) {
                fA = fVar.a(lineStart2, z11, z11, true);
                fA3 = fVar.a(lineStart2 + 1, true, true, true);
            } else if (z12 && zIsRtlCharAt) {
                fA3 = fVar.a(lineStart2, false, false, false);
                fA = fVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = fVar.a(lineStart2, false, false, true);
                    fA = fVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = fVar.a(lineStart2, false, false, false);
                    fA2 = fVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i16] = fA;
            fArr[i16 + 1] = fA3;
            i16 += 2;
            lineStart2++;
            z12 = z12;
            z11 = false;
        }
        Layout layout3 = (Layout) cVar.B;
        int lineStart3 = layout3.getLineStart(i10);
        int lineEnd2 = layout3.getLineEnd(i10);
        int iX = cVar.x(lineStart3, false);
        int iY = cVar.y(iX);
        int i17 = lineStart3 - iY;
        int i18 = lineEnd2 - iY;
        Bidi bidiQ = cVar.q(iX);
        if (bidiQ == null || (bidiCreateLineBidi = bidiQ.createLineBidi(i17, i18)) == null) {
            dVarArr = new d[]{new d(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            dVarArr = new d[runCount];
            int i19 = 0;
            while (i19 < runCount) {
                int i20 = runCount;
                dVarArr[i19] = new d(bidiCreateLineBidi.getRunStart(i19) + lineStart3, bidiCreateLineBidi.getRunLimit(i19) + lineStart3, bidiCreateLineBidi.getRunLevel(i19) % 2 == 1);
                i19++;
                runCount = i20;
            }
        }
        z00.e eVar = z10 ? new z00.e(0, dVarArr.length - 1, 1) : new z00.c(dVarArr.length - 1, 0, -1);
        int i21 = ((z00.c) eVar).A;
        int i22 = ((z00.c) eVar).B;
        int i23 = ((z00.c) eVar).C;
        if ((i23 <= 0 || i21 > i22) && (i23 >= 0 || i22 > i21)) {
            return -1;
        }
        while (true) {
            d dVar = dVarArr[i21];
            boolean z13 = dVar.f11025c;
            int iN = dVar.f11023a;
            int iP = dVar.f11024b;
            float f3 = z13 ? fArr[((iP - 1) - lineStart) * 2] : fArr[(iN - lineStart) * 2];
            float fC = z13 ? c(iN, lineStart, fArr) : c(iP - 1, lineStart, fArr);
            if (z10) {
                float f10 = rectF.left;
                if (fC >= f10) {
                    i11 = i23;
                    float f11 = rectF.right;
                    if (f3 <= f11) {
                        if ((z13 || f10 > f3) && (!z13 || f11 < fC)) {
                            int i24 = iP;
                            int i25 = iN;
                            while (true) {
                                i13 = i24;
                                if (i24 - i25 <= 1) {
                                    break;
                                }
                                int i26 = (i13 + i25) / 2;
                                float f12 = fArr[(i26 - lineStart) * 2];
                                if ((z13 || f12 <= rectF.left) && (!z13 || f12 >= rectF.right)) {
                                    i24 = i13;
                                    i25 = i26;
                                } else {
                                    i24 = i26;
                                }
                            }
                            i14 = z13 ? i13 : i25;
                        } else {
                            i14 = iN;
                        }
                        int iF1 = bVar.f0(i14);
                        if (iF1 != -1 && (iC0 = bVar.c0(iF1)) < iP) {
                            if (iC0 >= iN) {
                                iN = iC0;
                            }
                            if (iF1 > iP) {
                                iF1 = iP;
                            }
                            dVarArr2 = dVarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iF2 = iF1;
                            while (true) {
                                rectF2.left = z13 ? fArr[((iF2 - 1) - lineStart) * 2] : fArr[(iN - lineStart) * 2];
                                rectF2.right = z13 ? c(iN, lineStart, fArr) : c(iF2 - 1, lineStart, fArr);
                                if (((Boolean) aVar.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iN = bVar.N(iN);
                                if (iN != -1 && iN < iP) {
                                    iF2 = bVar.f0(iN);
                                    if (iF2 > iP) {
                                        iF2 = iP;
                                    }
                                }
                            }
                        }
                        iN = -1;
                        break;
                    }
                } else {
                    i11 = i23;
                }
                dVarArr2 = dVarArr;
                iN = -1;
                break;
            } else {
                i11 = i23;
                dVarArr2 = dVarArr;
                float f13 = rectF.left;
                if (fC < f13) {
                    iP = -1;
                    break;
                }
                float f14 = rectF.right;
                if (f3 <= f14) {
                    if ((z13 || f14 < fC) && (!z13 || f13 > f3)) {
                        int i27 = iP;
                        int i28 = iN;
                        while (i27 - i28 > 1) {
                            int i29 = (i27 + i28) / 2;
                            float f15 = fArr[(i29 - lineStart) * 2];
                            int i30 = i27;
                            if ((z13 || f15 <= rectF.right) && (!z13 || f15 >= rectF.left)) {
                                i27 = i30;
                                i28 = i29;
                            } else {
                                i27 = i29;
                            }
                        }
                        i12 = z13 ? i27 : i28;
                    } else {
                        i12 = iP - 1;
                    }
                    int iC1 = bVar.c0(i12 + 1);
                    if (iC1 == -1 || (iF0 = bVar.f0(iC1)) <= iN) {
                        iP = -1;
                        break;
                    }
                    if (iC1 < iN) {
                        iC1 = iN;
                    }
                    if (iF0 <= iP) {
                        iP = iF0;
                    }
                    RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iC2 = iC1;
                    while (true) {
                        rectF3.left = z13 ? fArr[((iP - 1) - lineStart) * 2] : fArr[(iC2 - lineStart) * 2];
                        rectF3.right = z13 ? c(iC2, lineStart, fArr) : c(iP - 1, lineStart, fArr);
                        if (((Boolean) aVar.invoke(rectF3, rectF)).booleanValue()) {
                            break;
                        }
                        iP = bVar.P(iP);
                        if (iP == -1 || iP <= iN) {
                            iP = -1;
                            break;
                        }
                        iC2 = bVar.c0(iP);
                        if (iC2 < iN) {
                            iC2 = iN;
                        }
                    }
                } else {
                    iP = -1;
                    break;
                }
                iN = iP;
            }
            if (iN >= 0) {
                return iN;
            }
            if (i21 == i22) {
                return -1;
            }
            i21 += i11;
            i23 = i11;
            dVarArr = dVarArr2;
        }
    }

    public static final boolean f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
