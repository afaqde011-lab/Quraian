package a1;

import android.graphics.PointF;
import android.os.Build;
import android.os.LocaleList;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import c3.c3;
import com.google.android.gms.internal.measurement.y3;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.KotlinNothingValueException;

public abstract class x0 {
    public static final b2.r A(b2.r rVar, h hVar, q0.j1 j1Var, e1.v0 v0Var) {
        return rVar.V(new v0(hVar, j1Var, v0Var));
    }

    public static void B(long j9, m3.h hVar, boolean z10, e1 e1Var) {
        if (z10) {
            j9 = a(j9, hVar);
        }
        int i10 = (int) (4294967295L & j9);
        e1Var.invoke(new m0(new r3.g[]{new r3.v(i10, i10), new r3.e(m3.q0.e(j9), 0)}));
    }

    public static final void C(c3.q0 q0Var, w2 w2Var, s2 s2Var, r3.j jVar, h2 h2Var, w1 w1Var, d40.w0 w0Var, c3 c3Var, x1 x1Var, m00.c cVar) {
        j jVar2;
        if (cVar instanceof j) {
            jVar2 = (j) cVar;
            int i10 = jVar2.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar2.B = i10 - Integer.MIN_VALUE;
            } else {
                jVar2 = new j(cVar);
            }
        } else {
            jVar2 = new j(cVar);
        }
        j jVar3 = jVar2;
        Object obj = jVar3.A;
        l00.a aVar = l00.a.A;
        int i11 = jVar3.B;
        if (i11 != 0) {
            if (i11 == 1) {
                throw b.t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri.t1.O(obj);
        View view = q0Var.A;
        l9.f0 sVar = Build.VERSION.SDK_INT >= 34 ? new s(view) : new l9.f0(view);
        jVar3.B = 1;
        D(q0Var, w2Var, s2Var, jVar, h2Var, w1Var, sVar, w0Var, c3Var, x1Var, jVar3);
    }

    public static final void D(c3.q0 q0Var, w2 w2Var, s2 s2Var, r3.j jVar, u00.k kVar, u00.a aVar, l9.f0 f0Var, d40.w0 w0Var, c3 c3Var, u00.k kVar2, m00.c cVar) {
        k kVar3;
        if (cVar instanceof k) {
            kVar3 = (k) cVar;
            int i10 = kVar3.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar3.B = i10 - Integer.MIN_VALUE;
            } else {
                kVar3 = new k(cVar);
            }
        } else {
            kVar3 = new k(cVar);
        }
        Object obj = kVar3.A;
        l00.a aVar2 = l00.a.A;
        int i11 = kVar3.B;
        if (i11 == 0) {
            ri.t1.O(obj);
            o oVar = new o(w0Var, w2Var, s2Var, f0Var, q0Var, jVar, kVar, aVar, c3Var, kVar2, null);
            kVar3.B = 1;
            if (a40.c0.k(oVar, kVar3) == aVar2) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final void E(CharSequence charSequence, char[] cArr, int i10, int i11, int i12) {
        if (charSequence instanceof z0.b) {
            E(((z0.b) charSequence).C, cArr, i10, i11, i12);
            return;
        }
        while (i11 < i12) {
            cArr[i10] = charSequence.charAt(i11);
            i11++;
            i10++;
        }
    }

    public static final void F(EditorInfo editorInfo, CharSequence charSequence, long j9, r3.j jVar) {
        int i10;
        int i11;
        int i12 = jVar.f13077e;
        int i13 = jVar.f13076d;
        boolean z10 = jVar.f13073a;
        if (i12 == 1) {
            i10 = z10 ? 6 : 0;
        } else if (i12 == 0) {
            i10 = 1;
        } else if (i12 == 2) {
            i10 = 2;
        } else if (i12 == 6) {
            i10 = 5;
        } else if (i12 == 5) {
            i10 = 7;
        } else if (i12 == 3) {
            i10 = 3;
        } else if (i12 == 4) {
            i10 = 4;
        } else {
            if (i12 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i10;
        t3.b bVar = jVar.f13078f;
        if (kotlin.jvm.internal.m.a(bVar, t3.b.C)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
            Iterator it = bVar.A.iterator();
            while (it.hasNext()) {
                arrayList.add(((t3.a) it.next()).f14352a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i13 == 1) {
            i11 = 1;
        } else if (i13 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i11 = 1;
        } else if (i13 == 3) {
            i11 = 2;
        } else if (i13 == 4) {
            i11 = 3;
        } else if (i13 == 5) {
            i11 = 17;
        } else if (i13 == 6) {
            i11 = 33;
        } else if (i13 == 7) {
            i11 = 129;
        } else if (i13 == 8) {
            i11 = 18;
        } else {
            if (i13 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i11 = 8194;
        }
        editorInfo.inputType = i11;
        if (!z10 && (i11 & 1) == 1) {
            editorInfo.inputType = 131072 | i11;
            if (jVar.f13077e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i14 = editorInfo.inputType;
        if ((i14 & 1) == 1) {
            int i15 = jVar.f13074b;
            if (i15 == 1) {
                editorInfo.inputType = i14 | 4096;
            } else if (i15 == 2) {
                editorInfo.inputType = i14 | 8192;
            } else if (i15 == 3) {
                editorInfo.inputType = i14 | 16384;
            }
            if (jVar.f13075c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i16 = m3.q0.f10519c;
        editorInfo.initialSelStart = (int) (j9 >> 32);
        editorInfo.initialSelEnd = (int) (j9 & 4294967295L);
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
        editorInfo.imeOptions |= 33554432;
        if (!y0.d.f16583a || i13 == 7 || i13 == 8) {
            w00.a.H(editorInfo, false);
            return;
        }
        w00.a.H(editorInfo, true);
        editorInfo.setSupportedHandwritingGestures(va.a.S(y.o(), y.z(), y.v(), y.x(), y.B(), y.C(), y.D()));
        editorInfo.setSupportedHandwritingGesturePreviews(h00.n.X0(new Class[]{y.o(), y.z(), y.v(), y.x()}));
    }

    public static final long a(long j9, CharSequence charSequence) {
        int i10 = m3.q0.f10519c;
        int iCharCount = (int) (j9 >> 32);
        int iCharCount2 = (int) (4294967295L & j9);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (z(iCodePointBefore) && (y(iCodePointAt) || x(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (z(iCodePointBefore));
            return m3.h0.b(iCharCount, iCharCount2);
        }
        if (!z(iCodePointAt)) {
            return j9;
        }
        if (!y(iCodePointBefore) && !x(iCodePointBefore)) {
            return j9;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (z(iCodePointAt));
        return m3.h0.b(iCharCount, iCharCount2);
    }

    public static final long b(m3.n0 n0Var, long j9, long j10, z2.a0 a0Var, c3 c3Var) {
        if (n0Var != null) {
            m3.q qVar = n0Var.f10497b;
            if (a0Var != null) {
                long jC0 = a0Var.c0(j9);
                long jC1 = a0Var.c0(j10);
                int iP = p(qVar, jC0, c3Var);
                int iP2 = p(qVar, jC1, c3Var);
                if (iP != -1) {
                    if (iP2 != -1) {
                        iP = Math.min(iP, iP2);
                    }
                    iP2 = iP;
                } else if (iP2 == -1) {
                    return m3.q0.f10518b;
                }
                float fB = (qVar.b(iP2) + qVar.f(iP2)) / 2;
                int i10 = (int) (jC0 >> 32);
                int i11 = (int) (jC1 >> 32);
                return qVar.h(new h2.c(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fB - 0.1f, Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), fB + 0.1f), 0, m3.l0.f10478a);
            }
        }
        return m3.q0.f10518b;
    }

    public static final long c(s2 s2Var, h2.c cVar, h2.c cVar2, int i10) {
        long jR = r(s2Var, cVar, i10);
        if (m3.q0.d(jR)) {
            return m3.q0.f10518b;
        }
        long jR2 = r(s2Var, cVar2, i10);
        if (m3.q0.d(jR2)) {
            return m3.q0.f10518b;
        }
        int i11 = (int) (jR >> 32);
        int i12 = (int) (jR2 & 4294967295L);
        return m3.h0.b(Math.min(i11, i11), Math.max(i12, i12));
    }

    public static final long d(q0.j1 j1Var, h2.c cVar, h2.c cVar2, int i10) {
        long jS = s(j1Var, cVar, i10);
        if (m3.q0.d(jS)) {
            return m3.q0.f10518b;
        }
        long jS2 = s(j1Var, cVar2, i10);
        if (m3.q0.d(jS2)) {
            return m3.q0.f10518b;
        }
        int i11 = (int) (jS >> 32);
        int i12 = (int) (jS2 & 4294967295L);
        return m3.h0.b(Math.min(i11, i11), Math.max(i12, i12));
    }

    public static final boolean e(m3.n0 n0Var, int i10) {
        m3.q qVar = n0Var.f10497b;
        int iD = qVar.d(i10);
        return i10 == n0Var.h(iD) || i10 == qVar.c(iD, false) ? n0Var.i(i10) != n0Var.a(i10) : n0Var.a(i10) != n0Var.a(i10 - 1);
    }

    public static final long f(CharSequence charSequence, int i10) {
        int iCharCount = i10;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!y(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i10 < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i10);
            if (!y(iCodePointAt)) {
                break;
            }
            i10 += Character.charCount(iCodePointAt);
        }
        return m3.h0.b(iCharCount, i10);
    }

    public static final ExtractedText g(r3.w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f13099a.B;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j9 = wVar.f13100b;
        extractedText.selectionStart = m3.q0.g(j9);
        extractedText.selectionEnd = m3.q0.f(j9);
        extractedText.flags = !r30.k.B0(wVar.f13099a.B, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long h(PointF pointF) {
        float f3 = pointF.x;
        float f10 = pointF.y;
        return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    public static final void i(CursorAnchorInfo.Builder builder, m3.n0 n0Var, h2.c cVar) {
        if (cVar.g()) {
            return;
        }
        m3.q qVar = n0Var.f10497b;
        int i10 = qVar.f10515f - 1;
        if (i10 < 0) {
            i10 = 0;
        }
        int iY = ab.a0.y(qVar.e(cVar.f6547b), 0, i10);
        int iY2 = ab.a0.y(qVar.e(cVar.f6549d), 0, i10);
        if (iY > iY2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(n0Var.f(iY), qVar.f(iY), n0Var.g(iY), qVar.b(iY));
            if (iY == iY2) {
                return;
            } else {
                iY++;
            }
        }
    }

    public static final long j(long j9, h2.c cVar) {
        int i10 = (int) (j9 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = cVar.f6546a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            fIntBitsToFloat2 = cVar.f6548c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i10);
            }
        }
        int i11 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat5 = cVar.f6547b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
            fIntBitsToFloat5 = cVar.f6549d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i11);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public static final boolean k(h2.c cVar, float f3, float f10) {
        float f11 = cVar.f6546a;
        if (f3 > cVar.f6548c || f11 > f3) {
            return false;
        }
        return f10 <= cVar.f6549d && cVar.f6547b <= f10;
    }

    public static final float l(long j9, h2.c cVar) {
        float f3 = cVar.f6549d;
        float f10 = cVar.f6548c;
        if (y3.x(j9, cVar)) {
            return 0.0f;
        }
        float fD = h2.b.d(h2.b.e(cVar.e(), j9));
        if (fD >= Float.MAX_VALUE) {
            fD = Float.MAX_VALUE;
        }
        float fD2 = h2.b.d(h2.b.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(cVar.f6547b)) & 4294967295L), j9));
        if (fD2 < fD) {
            fD = fD2;
        }
        float fD3 = h2.b.d(h2.b.e((((long) Float.floatToRawIntBits(cVar.f6546a)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), j9));
        if (fD3 < fD) {
            fD = fD3;
        }
        float fD4 = h2.b.d(h2.b.e((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32), j9));
        return fD4 < fD ? fD4 : fD;
    }

    public static int m(w2 w2Var, HandwritingGesture handwritingGesture) {
        z0.g gVar = w2Var.f135a;
        h1.l lVar = w2Var.f136b;
        c1.c cVar = c1.c.A;
        gVar.f16994b.a().w();
        z0.a aVar = gVar.f16994b;
        aVar.G = null;
        w2Var.l(aVar);
        z0.g.a(gVar, lVar, true, cVar);
        gVar.f(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        w2.h(w2Var, fallbackText, false, 12);
        return 5;
    }

    public static int n(HandwritingGesture handwritingGesture, e1 e1Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        e1Var.invoke(new r3.a(fallbackText, 1));
        return 5;
    }

    public static final long o(s2 s2Var, long j9) {
        h2.b bVar;
        z2.a0 a0VarE = s2Var.e();
        if (a0VarE != null) {
            z2.a0 a0VarB = s2Var.b();
            if (a0VarB != null) {
                bVar = new h2.b((a0VarE.A() && a0VarB.A()) ? a0VarE.V(a0VarB, j9) : j9);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                return bVar.f6544a;
            }
        }
        return j9;
    }

    public static final int p(m3.q qVar, long j9, c3 c3Var) {
        float fH = c3Var != null ? c3Var.h() : 0.0f;
        int i10 = (int) (4294967295L & j9);
        int iE = qVar.e(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) < qVar.f(iE) - fH || Float.intBitsToFloat(i10) > qVar.b(iE) + fH) {
            return -1;
        }
        int i11 = (int) (j9 >> 32);
        if (Float.intBitsToFloat(i11) < (-fH) || Float.intBitsToFloat(i11) > qVar.f10513d + fH) {
            return -1;
        }
        return iE;
    }

    public static final int q(m3.q qVar, long j9, z2.a0 a0Var, c3 c3Var) {
        long jC0;
        int iP;
        if (a0Var == null || (iP = p(qVar, (jC0 = a0Var.c0(j9)), c3Var)) == -1) {
            return -1;
        }
        return qVar.g(h2.b.a((qVar.b(iP) + qVar.f(iP)) / 2.0f, 1, jC0));
    }

    public static final long r(s2 s2Var, h2.c cVar, int i10) {
        m3.n0 n0VarC = s2Var.c();
        m3.q qVar = n0VarC != null ? n0VarC.f10497b : null;
        z2.a0 a0VarE = s2Var.e();
        return (qVar == null || a0VarE == null) ? m3.q0.f10518b : qVar.h(cVar.j(a0VarE.c0(0L)), i10, m3.l0.f10479b);
    }

    public static final long s(q0.j1 j1Var, h2.c cVar, int i10) {
        q0.e2 e2VarD = j1Var.d();
        m3.q qVar = e2VarD != null ? e2VarD.f12608a.f10497b : null;
        z2.a0 a0VarC = j1Var.c();
        return (qVar == null || a0VarC == null) ? m3.q0.f10518b : qVar.h(cVar.j(a0VarC.c0(0L)), i10, m3.l0.f10479b);
    }

    public static void t(w2 w2Var, long j9, int i10) {
        if (m3.q0.d(j9)) {
            z0.g gVar = w2Var.f135a;
            h1.l lVar = w2Var.f136b;
            c1.c cVar = c1.c.A;
            gVar.f16994b.a().w();
            z0.a aVar = gVar.f16994b;
            aVar.G = null;
            w2Var.l(aVar);
            z0.g.a(gVar, lVar, true, cVar);
            gVar.f(true);
            return;
        }
        long jE = w2Var.e(j9);
        z0.g gVar2 = w2Var.f135a;
        h1.l lVar2 = w2Var.f136b;
        c1.c cVar2 = c1.c.A;
        gVar2.f16994b.a().w();
        z0.a aVar2 = gVar2.f16994b;
        int i11 = (int) (jE >> 32);
        int i12 = (int) (jE & 4294967295L);
        d1 d1Var = aVar2.B;
        if (i11 >= i12) {
            throw new IllegalArgumentException(w.c.h(i11, i12, "Do not set reversed or empty range: ", " > "));
        }
        aVar2.G = new g00.k(new z0.i(i10), new m3.q0(m3.h0.b(ab.a0.y(i11, 0, d1Var.length()), ab.a0.y(i12, 0, d1Var.length()))));
        z0.g.a(gVar2, lVar2, true, cVar2);
        gVar2.f(true);
    }

    public static final void u(z0.a aVar, int i10, int i11) {
        m3.q0 q0Var = aVar.E;
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        aVar.c(iMin, iMax, RuntimeVersion.SUFFIX);
        if (q0Var != null) {
            long jB = z0.h.b(iMin, iMax, 0, q0Var.f10520a);
            if (m3.q0.d(jB)) {
                aVar.e(null);
            } else {
                aVar.d(m3.q0.g(jB), m3.q0.f(jB), null);
            }
        }
    }

    public static final void v(z0.a aVar, int i10, int i11, CharSequence charSequence) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i12 = 0;
        int i13 = iMin;
        while (i13 < iMax && i12 < charSequence.length() && charSequence.charAt(i12) == aVar.B.charAt(i13)) {
            i12++;
            i13++;
        }
        int length = charSequence.length();
        while (iMax > i13 && length > i12 && charSequence.charAt(length - 1) == aVar.B.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i13 == iMax && i12 == length) {
            aVar.e(null);
            aVar.G = null;
        } else {
            aVar.c(i13, iMax, charSequence.subSequence(i12, length));
        }
        int length2 = charSequence.length() + iMin;
        aVar.f(m3.h0.b(length2, length2));
    }

    public static final boolean w(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final boolean x(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean y(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    public static final boolean z(int i10) {
        int type;
        return (!y(i10) || (type = Character.getType(i10)) == 14 || type == 13 || i10 == 10) ? false : true;
    }
}
