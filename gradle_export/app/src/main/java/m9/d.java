package m9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class d extends View implements j0 {
    public final ArrayList A;
    public List B;
    public float C;
    public e D;
    public float E;

    public d(Context context, int i10) {
        super(context, null);
        this.A = new ArrayList();
        this.B = Collections.EMPTY_LIST;
        this.C = 0.0533f;
        this.D = e.f10647g;
        this.E = 0.08f;
    }

    @Override
    public final void a(List list, e eVar, float f3, float f10) {
        this.B = list;
        this.D = eVar;
        this.C = f3;
        this.E = f10;
        while (true) {
            ArrayList arrayList = this.A;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new i0(getContext()));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f3;
        int i10;
        int i11;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List listC;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        float f10;
        int i16;
        float f11;
        int i17;
        int iMax;
        int iMin;
        int iRound;
        int i18;
        d dVar = this;
        Canvas canvas2 = canvas;
        List list = dVar.B;
        if (list.isEmpty()) {
            return;
        }
        int height = dVar.getHeight();
        int paddingLeft = dVar.getPaddingLeft();
        int paddingTop = dVar.getPaddingTop();
        int width = dVar.getWidth() - dVar.getPaddingRight();
        int paddingBottom = height - dVar.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i19 = paddingBottom - paddingTop;
        float fA0 = a.a.a0(0, dVar.C, height, i19);
        float f12 = 0.0f;
        if (fA0 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i20 = 0;
        while (i20 < size) {
            d7.b bVarA = (d7.b) list.get(i20);
            float f13 = f12;
            if (bVarA.f4760p != Integer.MIN_VALUE) {
                d7.a aVarA = bVarA.a();
                float f14 = bVarA.f4751e;
                aVarA.f4730h = -3.4028235E38f;
                aVarA.f4731i = Integer.MIN_VALUE;
                aVarA.f4725c = null;
                if (bVarA.f4752f == 0) {
                    aVarA.f4727e = 1.0f - f14;
                    i18 = 0;
                    aVarA.f4728f = 0;
                } else {
                    i18 = 0;
                    aVarA.f4727e = (-f14) - 1.0f;
                    aVarA.f4728f = 1;
                }
                int i21 = bVarA.f4753g;
                if (i21 == 0) {
                    aVarA.f4729g = 2;
                } else if (i21 == 2) {
                    aVarA.f4729g = i18;
                }
                bVarA = aVarA.a();
            }
            float fA1 = a.a.a0(bVarA.f4758n, bVarA.f4759o, height, i19);
            i0 i0Var = (i0) dVar.A.get(i20);
            e eVar = dVar.D;
            float f15 = dVar.E;
            TextPaint textPaint = i0Var.f10696f;
            int i22 = height;
            Bitmap bitmap = bVarA.f4750d;
            int i23 = i19;
            float f16 = bVarA.f4757k;
            int i24 = size;
            float f17 = bVarA.f4756j;
            int i25 = i20;
            int i26 = bVarA.f4755i;
            float f18 = bVarA.f4754h;
            int i27 = bVarA.f4753g;
            float f19 = fA0;
            int i28 = bVarA.f4752f;
            float f20 = bVarA.f4751e;
            Layout.Alignment alignment = bVarA.f4748b;
            ?? spannableStringBuilder = bVarA.f4747a;
            boolean z11 = bitmap == null;
            if (z11) {
                if (TextUtils.isEmpty(spannableStringBuilder)) {
                    i15 = paddingBottom;
                    z10 = false;
                } else {
                    f3 = f18;
                    i10 = bVarA.l ? bVarA.m : eVar.f10650c;
                }
                i20 = i25 + 1;
                dVar = this;
                paddingBottom = i15;
                f12 = f13;
                list = list;
                height = i22;
                i19 = i23;
                size = i24;
                fA0 = f19;
            } else {
                f3 = f18;
                i10 = -16777216;
            }
            ?? r14 = i0Var.f10699i;
            if ((r14 == spannableStringBuilder || (r14 != 0 && r14.equals(spannableStringBuilder))) && Objects.equals(i0Var.f10700j, alignment) && i0Var.f10701k == bitmap && i0Var.l == f20 && i0Var.m == i28) {
                i11 = i27;
                if (Integer.valueOf(i0Var.f10702n).equals(Integer.valueOf(i11)) && i0Var.f10703o == f3 && Integer.valueOf(i0Var.f10704p).equals(Integer.valueOf(i26)) && i0Var.f10705q == f17 && i0Var.f10706r == f16 && i0Var.f10707s == eVar.f10648a && i0Var.f10708t == eVar.f10649b && i0Var.f10709u == i10 && i0Var.f10711w == eVar.f10651d && i0Var.f10710v == eVar.f10652e && Objects.equals(textPaint.getTypeface(), eVar.f10653f) && i0Var.f10712x == f19 && i0Var.f10713y == fA1 && i0Var.f10714z == f15 && i0Var.A == paddingLeft && i0Var.B == paddingTop && i0Var.C == width && i0Var.D == paddingBottom) {
                    i0Var.a(canvas2, z11);
                    i15 = paddingBottom;
                    z10 = false;
                }
                i20 = i25 + 1;
                dVar = this;
                paddingBottom = i15;
                f12 = f13;
                list = list;
                height = i22;
                i19 = i23;
                size = i24;
                fA0 = f19;
            } else {
                i11 = i27;
            }
            c50.h hVar = c.f10644a;
            if (spannableStringBuilder == 0) {
                i13 = width;
                paddingBottom = paddingBottom;
                z11 = z11;
            } else {
                int length = spannableStringBuilder.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = Character.codePointAt((CharSequence) spannableStringBuilder, iCharCount);
                        int i29 = length;
                        byte directionality = Character.getDirectionality(iCodePointAt);
                        int i30 = iCharCount;
                        if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                            if (spannableStringBuilder instanceof Spanned) {
                                spanned = (Spanned) spannableStringBuilder;
                                Object[] spans = spanned.getSpans(0, spannableStringBuilder.length(), Object.class);
                                int[] iArr3 = new int[spans.length];
                                iArr = new int[spans.length];
                                Arrays.fill(iArr3, -1);
                                Arrays.fill(iArr, -1);
                                objArr = spans;
                                iArr2 = iArr3;
                            } else {
                                objArr = null;
                                iArr = null;
                                spanned = null;
                                iArr2 = null;
                            }
                            int[] iArr4 = iArr;
                            if (spannableStringBuilder.toString().contains("\r\n")) {
                                listC = c.f10645b.C((CharSequence) spannableStringBuilder);
                                i12 = 2;
                            } else {
                                listC = c.f10644a.C((CharSequence) spannableStringBuilder);
                                i12 = 1;
                            }
                            List<String> list2 = listC;
                            ArrayList arrayList = new ArrayList(list2.size());
                            int i31 = 0;
                            int i32 = 0;
                            for (String str : list2) {
                                int i33 = i12;
                                int i34 = width;
                                String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
                                if (objArr != null) {
                                    spanned.getClass();
                                    iArr2.getClass();
                                    iArr4.getClass();
                                    int length2 = strUnicodeWrap.length() - str.length();
                                    if (length2 > 0) {
                                        i32++;
                                    }
                                    for (int i35 = 0; i35 < objArr.length; i35 = i14 + 1) {
                                        if (iArr2[i35] >= 0 || spanned.getSpanStart(objArr[i35]) < i31) {
                                            i14 = i35;
                                        } else {
                                            i14 = i35;
                                            if (spanned.getSpanStart(objArr[i35]) < str.length() + i31) {
                                                iArr2[i14] = i32;
                                            }
                                        }
                                        if (iArr4[i14] < 0 && spanned.getSpanEnd(objArr[i14]) - 1 >= i31 && spanned.getSpanEnd(objArr[i14]) - 1 < str.length() + i31) {
                                            iArr4[i14] = i32;
                                        }
                                    }
                                    int length3 = str.length() + i33 + i31;
                                    if (length2 > 0) {
                                        i32++;
                                    }
                                    i31 = length3;
                                }
                                arrayList.add(strUnicodeWrap);
                                width = i34;
                                i12 = i33;
                                bidiFormatter = bidiFormatter;
                            }
                            i13 = width;
                            spannableStringBuilder = new SpannableStringBuilder(c.f10646c.b(arrayList));
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int i36 = 0;
                                while (i36 < objArr.length) {
                                    int spanStart = spanned.getSpanStart(objArr[i36]) + iArr2[i36];
                                    int spanEnd = spanned.getSpanEnd(objArr[i36]) + iArr4[i36];
                                    int spanFlags = spanned.getSpanFlags(objArr[i36]);
                                    Object[] objArr2 = objArr;
                                    if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                                        StringBuilder sbP = oi.k.p(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                                        sbP.append(spannableStringBuilder.length());
                                        e7.a.m("BidiUtils", sbP.toString());
                                    } else {
                                        spannableStringBuilder.setSpan(objArr2[i36], spanStart, spanEnd, spanFlags);
                                    }
                                    i36++;
                                    objArr = objArr2;
                                }
                            }
                        } else {
                            iCharCount = Character.charCount(iCodePointAt) + i30;
                            length = i29;
                        }
                    } else {
                        i13 = width;
                        paddingBottom = paddingBottom;
                        z11 = z11;
                    }
                }
            }
            i0Var.f10699i = spannableStringBuilder;
            i0Var.f10700j = alignment;
            i0Var.f10701k = bitmap;
            i0Var.l = f20;
            i0Var.m = i28;
            i0Var.f10702n = i11;
            i0Var.f10703o = f3;
            i0Var.f10704p = i26;
            i0Var.f10705q = f17;
            i0Var.f10706r = f16;
            i0Var.f10707s = eVar.f10648a;
            i0Var.f10708t = eVar.f10649b;
            i0Var.f10709u = i10;
            i0Var.f10711w = eVar.f10651d;
            i0Var.f10710v = eVar.f10652e;
            textPaint.setTypeface(eVar.f10653f);
            f19 = f19;
            i0Var.f10712x = f19;
            i0Var.f10713y = fA1;
            i0Var.f10714z = f15;
            i0Var.A = paddingLeft;
            i0Var.B = paddingTop;
            width = i13;
            i0Var.C = width;
            i15 = paddingBottom;
            i0Var.D = i15;
            if (z11) {
                i0Var.f10699i.getClass();
                CharSequence charSequence = i0Var.f10699i;
                SpannableStringBuilder spannableStringBuilder2 = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(i0Var.f10699i);
                int i37 = i0Var.C - i0Var.A;
                int i38 = i0Var.D - i0Var.B;
                textPaint.setTextSize(i0Var.f10712x);
                int i39 = (int) ((i0Var.f10712x * 0.125f) + 0.5f);
                int i40 = i39 * 2;
                int i41 = i37 - i40;
                float f21 = i0Var.f10705q;
                if (f21 != -3.4028235E38f) {
                    i41 = (int) (i41 * f21);
                }
                int i42 = i41;
                if (i42 <= 0) {
                    e7.a.m("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f19 = f19;
                } else {
                    if (i0Var.f10713y > f13) {
                        i17 = 0;
                        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) i0Var.f10713y), 0, spannableStringBuilder2.length(), 16711680);
                    } else {
                        i17 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
                    if (i0Var.f10711w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(i17, spannableStringBuilder3.length(), ForegroundColorSpan.class);
                        int i43 = 0;
                        for (int length4 = foregroundColorSpanArr.length; i43 < length4; length4 = length4) {
                            spannableStringBuilder3.removeSpan(foregroundColorSpanArr[i43]);
                            i43++;
                        }
                    }
                    if (Color.alpha(i0Var.f10708t) > 0) {
                        int i44 = i0Var.f10711w;
                        if (i44 == 0 || i44 == 2) {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(i0Var.f10708t), 0, spannableStringBuilder2.length(), 16711680);
                        } else {
                            spannableStringBuilder3.setSpan(new BackgroundColorSpan(i0Var.f10708t), 0, spannableStringBuilder3.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = i0Var.f10700j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, r1, i42, alignment3, i0Var.f10694d, i0Var.f10695e, true);
                    i0Var.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int i45 = 0;
                    int iMax2 = 0;
                    for (int lineCount = i0Var.E.getLineCount(); i45 < lineCount; lineCount = lineCount) {
                        iMax2 = Math.max((int) Math.ceil(i0Var.E.getLineWidth(i45)), iMax2);
                        i45++;
                        height2 = height2;
                    }
                    int i46 = height2;
                    int i47 = ((i0Var.f10705q == -3.4028235E38f || iMax2 >= i42) ? iMax2 : i42) + i40;
                    float f22 = i0Var.f10703o;
                    if (f22 != -3.4028235E38f) {
                        int iRound2 = Math.round(i37 * f22);
                        int i48 = i0Var.A;
                        int i49 = iRound2 + i48;
                        int i50 = i0Var.f10704p;
                        if (i50 == 1) {
                            i49 = ((i49 * 2) - i47) / 2;
                        } else if (i50 == 2) {
                            i49 -= i47;
                        }
                        iMax = Math.max(i49, i48);
                        iMin = Math.min(iMax + i47, i0Var.C);
                    } else {
                        iMax = i0Var.A + ((i37 - i47) / 2);
                        iMin = iMax + i47;
                    }
                    int i51 = iMin - iMax;
                    if (i51 <= 0) {
                        e7.a.m("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f23 = i0Var.l;
                        if (f23 != -3.4028235E38f) {
                            if (i0Var.m == 0) {
                                iRound = Math.round(i38 * f23) + i0Var.B;
                                int i52 = i0Var.f10702n;
                                if (i52 == 2) {
                                    iRound -= i46;
                                } else if (i52 == 1) {
                                    iRound = ((iRound * 2) - i46) / 2;
                                }
                                z10 = false;
                            } else {
                                z10 = false;
                                int lineBottom = i0Var.E.getLineBottom(0) - i0Var.E.getLineTop(0);
                                float f24 = i0Var.l;
                                iRound = f24 >= f13 ? Math.round(f24 * lineBottom) + i0Var.B : (Math.round((f24 + 1.0f) * lineBottom) + i0Var.D) - i46;
                            }
                            int i53 = iRound + i46;
                            int i54 = i0Var.D;
                            if (i53 > i54) {
                                iRound = i54 - i46;
                            } else {
                                int i55 = i0Var.B;
                                if (iRound < i55) {
                                    iRound = i55;
                                }
                            }
                        } else {
                            z10 = false;
                            iRound = (i0Var.D - i46) - ((int) (i38 * i0Var.f10714z));
                        }
                        i0Var.E = new StaticLayout(spannableStringBuilder4, r1, i51, alignment3, i0Var.f10694d, i0Var.f10695e, true);
                        i0Var.F = new StaticLayout(spannableStringBuilder3, textPaint, i51, alignment3, i0Var.f10694d, i0Var.f10695e, true);
                        i0Var.G = iMax;
                        i0Var.H = iRound;
                        i0Var.I = i39;
                    }
                }
                z10 = false;
            } else {
                f19 = f19;
                z10 = false;
                i0Var.f10701k.getClass();
                Bitmap bitmap2 = i0Var.f10701k;
                int i56 = i0Var.C;
                int i57 = i0Var.A;
                int i58 = i0Var.D;
                int i59 = i0Var.B;
                float f25 = i56 - i57;
                float f26 = (i0Var.f10703o * f25) + i57;
                float f27 = i58 - i59;
                float f28 = (i0Var.l * f27) + i59;
                int iRound3 = Math.round(f25 * i0Var.f10705q);
                float f29 = i0Var.f10706r;
                int iRound4 = f29 != -3.4028235E38f ? Math.round(f27 * f29) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i60 = i0Var.f10704p;
                if (i60 == 2) {
                    f10 = iRound3;
                } else {
                    if (i60 == 1) {
                        f10 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f26);
                    i16 = i0Var.f10702n;
                    if (i16 == 2) {
                        f11 = iRound4;
                    } else {
                        if (i16 == 1) {
                            f11 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f28);
                        i0Var.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f28 -= f11;
                    int iRound7 = Math.round(f28);
                    i0Var.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f26 -= f10;
                int iRound8 = Math.round(f26);
                i16 = i0Var.f10702n;
                if (i16 == 2) {
                    f11 = iRound4;
                } else {
                    if (i16 == 1) {
                        f11 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f28);
                    i0Var.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f28 -= f11;
                int iRound10 = Math.round(f28);
                i0Var.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            canvas2 = canvas;
            i0Var.a(canvas2, z11);
            i20 = i25 + 1;
            dVar = this;
            paddingBottom = i15;
            f12 = f13;
            list = list;
            height = i22;
            i19 = i23;
            size = i24;
            fA0 = f19;
        }
    }
}
