package lc;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kc.m;
import u.q;

public final class j extends b {
    public final StringBuilder A;
    public final RectF B;
    public final Matrix C;
    public final dc.a D;
    public final dc.a E;
    public final HashMap F;
    public final q G;
    public final ArrayList H;
    public final fc.f I;
    public final cc.i J;
    public final cc.a K;
    public final fc.f L;
    public final fc.f M;
    public final fc.f N;
    public final fc.f O;

    public j(cc.i iVar, e eVar) {
        jc.b bVar;
        jc.b bVar2;
        jc.a aVar;
        jc.a aVar2;
        super(iVar, eVar);
        this.A = new StringBuilder(2);
        this.B = new RectF();
        this.C = new Matrix();
        dc.a aVar3 = new dc.a(1, 1);
        aVar3.setStyle(Paint.Style.FILL);
        this.D = aVar3;
        dc.a aVar4 = new dc.a(1, 2);
        aVar4.setStyle(Paint.Style.STROKE);
        this.E = aVar4;
        this.F = new HashMap();
        this.G = new q((Object) null);
        this.H = new ArrayList();
        this.J = iVar;
        this.K = eVar.f10240b;
        fc.f fVar = new fc.f(3, (List) eVar.f10253q.B);
        this.I = fVar;
        fVar.a(this);
        f(fVar);
        oj.q qVar = eVar.f10254r;
        if (qVar != null && (aVar2 = (jc.a) qVar.B) != null) {
            fc.e eVarM0 = aVar2.m0();
            this.L = (fc.f) eVarM0;
            eVarM0.a(this);
            f(eVarM0);
        }
        if (qVar != null && (aVar = (jc.a) qVar.C) != null) {
            fc.e eVarM1 = aVar.m0();
            this.M = (fc.f) eVarM1;
            eVarM1.a(this);
            f(eVarM1);
        }
        if (qVar != null && (bVar2 = (jc.b) qVar.D) != null) {
            fc.e eVarM2 = bVar2.m0();
            this.N = (fc.f) eVarM2;
            eVarM2.a(this);
            f(eVarM2);
        }
        if (qVar == null || (bVar = (jc.b) qVar.E) == null) {
            return;
        }
        fc.e eVarM3 = bVar.m0();
        this.O = (fc.f) eVarM3;
        eVarM3.a(this);
        f(eVarM3);
    }

    public static void o(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void p(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public static void r(Canvas canvas, ic.b bVar, int i10, float f3) {
        PointF pointF = bVar.l;
        PointF pointF2 = bVar.m;
        float fC = oc.e.c();
        float f10 = (i10 * bVar.f7591f * fC) + (pointF == null ? 0.0f : (bVar.f7591f * fC) + pointF.y);
        float f11 = pointF == null ? 0.0f : pointF.x;
        float f12 = pointF2 != null ? pointF2.x : 0.0f;
        int iB = e4.f.b(bVar.f7589d);
        if (iB == 0) {
            canvas.translate(f11, f10);
        } else if (iB == 1) {
            canvas.translate((f11 + f12) - f3, f10);
        } else {
            if (iB != 2) {
                return;
            }
            canvas.translate(((f12 / 2.0f) + f11) - (f3 / 2.0f), f10);
        }
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        cc.a aVar = this.K;
        rectF.set(0.0f, 0.0f, aVar.f3114i.width(), aVar.f3114i.height());
    }

    @Override
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        ce.c cVar;
        ic.c cVar2;
        ic.c cVar3;
        String string;
        Typeface typefaceCreate;
        int i11;
        List list;
        Canvas canvas2 = canvas;
        ic.b bVar = (ic.b) this.I.e();
        cc.a aVar = this.K;
        ic.c cVar4 = (ic.c) aVar.f3110e.get(bVar.f7587b);
        if (cVar4 == null) {
            return;
        }
        String str = cVar4.f7598b;
        String str2 = cVar4.f7597a;
        canvas2.save();
        canvas.concat(matrix);
        dc.a aVar2 = this.D;
        fc.f fVar = this.L;
        if (fVar != null) {
            aVar2.setColor(((Integer) fVar.e()).intValue());
        } else {
            aVar2.setColor(bVar.f7593h);
        }
        dc.a aVar3 = this.E;
        fc.f fVar2 = this.M;
        if (fVar2 != null) {
            aVar3.setColor(((Integer) fVar2.e()).intValue());
        } else {
            aVar3.setColor(bVar.f7594i);
        }
        fc.f fVar3 = (fc.f) this.f10235w.f5637n;
        int iIntValue = ((fVar3 == null ? 100 : ((Integer) fVar3.e()).intValue()) * 255) / 100;
        aVar2.setAlpha(iIntValue);
        aVar3.setAlpha(iIntValue);
        fc.f fVar4 = this.N;
        if (fVar4 != null) {
            aVar3.setStrokeWidth(((Float) fVar4.e()).floatValue());
        } else {
            aVar3.setStrokeWidth(oc.e.c() * bVar.f7595j);
        }
        cc.i iVar = this.J;
        iVar.getClass();
        int i12 = iVar.A.f3111f.C;
        fc.f fVar5 = this.O;
        if (i12 > 0) {
            float f3 = bVar.f7588c / 100.0f;
            oc.e.d(matrix);
            List listAsList = Arrays.asList(bVar.f7586a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size = listAsList.size();
            float fFloatValue = bVar.f7590e / 10.0f;
            if (fVar5 != null) {
                fFloatValue += ((Float) fVar5.e()).floatValue();
            }
            float f10 = fFloatValue;
            int i13 = 0;
            int i14 = -1;
            while (i13 < size) {
                String str3 = (String) listAsList.get(i13);
                PointF pointF = bVar.m;
                int i15 = i13;
                float f11 = f3;
                int i16 = size;
                float f12 = pointF == null ? 0.0f : pointF.x;
                j jVar = this;
                List listS = jVar.s(str3, f12, cVar4, f11, f10, true);
                int i17 = 0;
                while (i17 < listS.size()) {
                    i iVar2 = (i) listS.get(i17);
                    List list2 = listS;
                    int i18 = i14 + 1;
                    canvas2.save();
                    int i19 = i17;
                    r(canvas2, bVar, i18, iVar2.f10262b);
                    String str4 = iVar2.f10261a;
                    i14 = i18;
                    int i20 = 0;
                    while (i20 < str4.length()) {
                        String str5 = str4;
                        ic.d dVar = (ic.d) aVar.f3111f.c(ic.d.a(str4.charAt(i20), str2, str));
                        if (dVar == null) {
                            cVar4 = cVar4;
                            f10 = f10;
                            i20 = i20;
                            listAsList = listAsList;
                        } else {
                            HashMap map = jVar.F;
                            if (map.containsKey(dVar)) {
                                list = (List) map.get(dVar);
                            } else {
                                ArrayList arrayList = dVar.f7600a;
                                int size2 = arrayList.size();
                                ArrayList arrayList2 = new ArrayList(size2);
                                int i21 = 0;
                                while (i21 < size2) {
                                    arrayList2.add(new ec.d(iVar, jVar, (m) arrayList.get(i21), aVar));
                                    i21++;
                                    arrayList = arrayList;
                                }
                                map.put(dVar, arrayList2);
                                list = arrayList2;
                            }
                            int i22 = 0;
                            while (i22 < list.size()) {
                                Path pathE = ((ec.d) list.get(i22)).e();
                                pathE.computeBounds(jVar.B, false);
                                Matrix matrix2 = jVar.C;
                                matrix2.reset();
                                matrix2.preTranslate(0.0f, (-bVar.f7592g) * oc.e.c());
                                matrix2.preScale(f11, f11);
                                pathE.transform(matrix2);
                                if (bVar.f7596k) {
                                    p(pathE, aVar2, canvas2);
                                    p(pathE, aVar3, canvas2);
                                } else {
                                    p(pathE, aVar3, canvas2);
                                    p(pathE, aVar2, canvas2);
                                }
                                i22++;
                                jVar = this;
                            }
                            canvas2.translate((oc.e.c() * ((float) dVar.f7602c) * f11) + f10, 0.0f);
                        }
                        i20++;
                        jVar = this;
                        str4 = str5;
                        f10 = f10;
                        listAsList = listAsList;
                        cVar4 = cVar4;
                    }
                    canvas2.restore();
                    i17 = i19 + 1;
                    jVar = this;
                    listS = list2;
                }
                f3 = f11;
                size = i16;
                i13 = i15 + 1;
            }
        } else {
            Typeface typeface = null;
            if (iVar.getCallback() == null) {
                cVar = null;
            } else {
                if (iVar.F == null) {
                    iVar.F = new ce.c(iVar.getCallback());
                }
                cVar = iVar.F;
            }
            if (cVar != null) {
                gd.d dVar2 = (gd.d) cVar.B;
                dVar2.f6314b = str2;
                dVar2.f6315c = str;
                HashMap map2 = (HashMap) cVar.C;
                Typeface typeface2 = (Typeface) map2.get(dVar2);
                if (typeface2 != null) {
                    typeface = typeface2;
                    cVar2 = cVar4;
                } else {
                    HashMap map3 = (HashMap) cVar.D;
                    Typeface typeface3 = (Typeface) map3.get(str2);
                    if (typeface3 != null) {
                        typefaceCreate = typeface3;
                        cVar2 = cVar4;
                    } else {
                        cVar2 = cVar4;
                        typefaceCreate = cVar2.f7599c;
                        if (typefaceCreate == null) {
                            Typeface typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) cVar.E, "fonts/" + str2 + ((String) cVar.F));
                            map3.put(str2, typefaceCreateFromAsset);
                            typefaceCreate = typefaceCreateFromAsset;
                        }
                    }
                    boolean zContains = str.contains("Italic");
                    boolean zContains2 = str.contains("Bold");
                    if (zContains && zContains2) {
                        i11 = 3;
                    } else if (zContains) {
                        i11 = 2;
                    } else {
                        i11 = zContains2 ? 1 : 0;
                    }
                    if (typefaceCreate.getStyle() != i11) {
                        typefaceCreate = Typeface.create(typefaceCreate, i11);
                    }
                    map2.put(dVar2, typefaceCreate);
                    typeface = typefaceCreate;
                }
            } else {
                cVar2 = cVar4;
            }
            if (typeface == null) {
                typeface = cVar2.f7599c;
            }
            if (typeface != null) {
                String str6 = bVar.f7586a;
                aVar2.setTypeface(typeface);
                float f13 = bVar.f7588c;
                aVar2.setTextSize(oc.e.c() * f13);
                aVar3.setTypeface(aVar2.getTypeface());
                aVar3.setTextSize(aVar2.getTextSize());
                float fFloatValue2 = bVar.f7590e / 10.0f;
                if (fVar5 != null) {
                    fFloatValue2 += ((Float) fVar5.e()).floatValue();
                }
                float fC = ((oc.e.c() * fFloatValue2) * f13) / 100.0f;
                List listAsList2 = Arrays.asList(str6.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = listAsList2.size();
                int i23 = -1;
                int i24 = 0;
                while (i24 < size3) {
                    String str7 = (String) listAsList2.get(i24);
                    PointF pointF2 = bVar.m;
                    float f14 = pointF2 == null ? 0.0f : pointF2.x;
                    j jVar2 = this;
                    float f15 = fC;
                    ic.c cVar5 = cVar2;
                    List listS2 = jVar2.s(str7, f14, cVar5, 0.0f, f15, false);
                    int i25 = 0;
                    while (i25 < listS2.size()) {
                        i iVar3 = (i) listS2.get(i25);
                        i23++;
                        canvas.save();
                        r(canvas, bVar, i23, iVar3.f10262b);
                        String str8 = iVar3.f10261a;
                        int length = 0;
                        while (length < str8.length()) {
                            int iCodePointAt = str8.codePointAt(length);
                            List list3 = listS2;
                            int iCharCount = Character.charCount(iCodePointAt) + length;
                            int i26 = i25;
                            while (true) {
                                if (iCharCount >= str8.length()) {
                                    cVar3 = cVar5;
                                    break;
                                }
                                int iCodePointAt2 = str8.codePointAt(iCharCount);
                                cVar3 = cVar5;
                                if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                    break;
                                }
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                cVar5 = cVar3;
                            }
                            long j9 = iCodePointAt;
                            q qVar = jVar2.G;
                            if (qVar.c(j9) >= 0) {
                                string = (String) qVar.b(j9);
                            } else {
                                StringBuilder sb2 = jVar2.A;
                                sb2.setLength(0);
                                int iCharCount2 = length;
                                while (iCharCount2 < iCharCount) {
                                    int i27 = iCharCount;
                                    int iCodePointAt3 = str8.codePointAt(iCharCount2);
                                    sb2.appendCodePoint(iCodePointAt3);
                                    iCharCount2 += Character.charCount(iCodePointAt3);
                                    iCharCount = i27;
                                }
                                string = sb2.toString();
                                qVar.e(string, j9);
                            }
                            length += string.length();
                            if (bVar.f7596k) {
                                o(string, aVar2, canvas);
                                o(string, aVar3, canvas);
                            } else {
                                o(string, aVar3, canvas);
                                o(string, aVar2, canvas);
                            }
                            canvas.translate(aVar2.measureText(string) + f15, 0.0f);
                            jVar2 = this;
                            listS2 = list3;
                            f15 = f15;
                            i25 = i26;
                            cVar5 = cVar3;
                        }
                        canvas.restore();
                        i25++;
                        jVar2 = this;
                        listS2 = listS2;
                    }
                    i24++;
                    fC = f15;
                    cVar2 = cVar5;
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final i q(int i10) {
        ArrayList arrayList = this.H;
        for (int size = arrayList.size(); size < i10; size++) {
            i iVar = new i();
            iVar.f10261a = RuntimeVersion.SUFFIX;
            iVar.f10262b = 0.0f;
            arrayList.add(iVar);
        }
        return (i) arrayList.get(i10 - 1);
    }

    public final List s(String str, float f3, ic.c cVar, float f10, float f11, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                ic.d dVar = (ic.d) this.K.f3111f.c(ic.d.a(cCharAt, cVar.f7597a, cVar.f7598b));
                if (dVar != null) {
                    fMeasureText = (oc.e.c() * ((float) dVar.f7602c) * f10) + f11;
                }
            } else {
                fMeasureText = this.D.measureText(str.substring(i13, i13 + 1)) + f11;
            }
            if (cCharAt == ' ') {
                z11 = true;
                f14 = fMeasureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f13 = fMeasureText;
            } else {
                f13 += fMeasureText;
            }
            f12 += fMeasureText;
            if (f3 > 0.0f && f12 >= f3 && cCharAt != ' ') {
                i10++;
                i iVarQ = q(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    float length = (f12 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f14);
                    iVarQ.f10261a = strTrim;
                    iVarQ.f10262b = length;
                    i11 = i13;
                    i12 = i11;
                    f12 = fMeasureText;
                    f13 = f12;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f12 - f13) - ((strSubstring2.length() - strTrim2.length()) * f14)) - f14;
                    iVarQ.f10261a = strTrim2;
                    iVarQ.f10262b = length2;
                    f12 = f13;
                    i11 = i12;
                }
            }
        }
        if (f12 > 0.0f) {
            i10++;
            i iVarQ2 = q(i10);
            iVarQ2.f10261a = str.substring(i11);
            iVarQ2.f10262b = f12;
        }
        return this.H.subList(0, i10);
    }
}
