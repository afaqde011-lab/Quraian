package tf;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.z6;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Signature;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;

public final class x implements t, v8.g, x8.i, xi.a, dh.n, z9.b, ze.b, zh.p {
    public static final x B = new x(0);
    public static final x C = new x(1);
    public static final x D = new x(2);
    public static final x E = new x(3);
    public static final x F = new x(4);
    public static final x G = new x(5);
    public static final x H = new x(6);
    public static final x I = new x(7);
    public static final x J = new x(8);
    public static final x K = new x(9);
    public static final x L = new x(10);
    public static final x M = new x(11);
    public final int A;

    public x(int i10) {
        this.A = i10;
    }

    public x(MainActivity mainActivity) {
        this.A = 16;
        this.A = 16;
        new l4.c(this, mainActivity);
    }

    public static yu.f a(float f3) {
        Object next;
        n00.b bVar = yu.f.D;
        bVar.getClass();
        g00.s sVar = new g00.s(bVar, 4);
        do {
            if (!sVar.hasNext()) {
                next = null;
                break;
            }
            next = sVar.next();
        } while (Math.abs(((yu.f) next).A - f3) >= 0.001f);
        yu.f fVar = (yu.f) next;
        if (fVar != null) {
            return fVar;
        }
        n00.b bVar2 = yu.f.D;
        bVar2.getClass();
        g00.s sVar2 = new g00.s(bVar2, 4);
        if (!sVar2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next2 = sVar2.next();
        if (sVar2.hasNext()) {
            float fAbs = Math.abs(((yu.f) next2).A - f3);
            do {
                Object next3 = sVar2.next();
                float fAbs2 = Math.abs(((yu.f) next3).A - f3);
                if (Float.compare(fAbs, fAbs2) > 0) {
                    next2 = next3;
                    fAbs = fAbs2;
                }
            } while (sVar2.hasNext());
        }
        return (yu.f) next2;
    }

    public static boolean n(x5.b bVar, Editable editable, int i10, int i11, boolean z10) {
        int iMin;
        if (editable != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int iMax = Math.max(i10, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z11) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z11) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z11 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i11, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z12) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i10, 0);
                    iMin = Math.min(selectionEnd + i11, editable.length());
                }
                v5.s[] sVarArr = (v5.s[]) editable.getSpans(selectionStart, iMin, v5.s.class);
                if (sVarArr != null && sVarArr.length > 0) {
                    for (v5.s sVar : sVarArr) {
                        int spanStart = editable.getSpanStart(sVar);
                        int spanEnd = editable.getSpanEnd(sVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object b(String str, Provider provider) {
        switch (this.A) {
            case 27:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 28:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override
    public int c(androidx.media3.common.t tVar) {
        return 1;
    }

    @Override
    public long d(a8.r rVar) {
        return -1L;
    }

    @Override
    public Object e() {
        return new dh.w("StandardIntegrity");
    }

    @Override
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i13 = 1;
                i10 = i11;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i14 = i11 - iIntValue;
            if (i11 + i14 <= stackTraceElementArr.length) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        int iIntValue2 = i11 - num.intValue();
                        if (i13 < 10) {
                            System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, iIntValue2);
                            i12 += iIntValue2;
                            i13++;
                        }
                        i10 = (iIntValue2 - 1) + i11;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                        i12++;
                        i13 = 1;
                        i10 = i11;
                        break;
                        break;
                    }
                    i15++;
                }
            } else {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i13 = 1;
                i10 = i11;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override
    public a8.d0 g() {
        return new a8.v(-9223372036854775807L);
    }

    @Override
    public void h() {
    }

    @Override
    public void i(int i10, Object obj) {
    }

    @Override
    public a8.d j(Context context, String str, ze.a aVar) {
        a8.d dVar = new a8.d();
        int iF = aVar.f(context, str);
        dVar.f238a = iF;
        if (iF != 0) {
            dVar.f240c = -1;
            return dVar;
        }
        int iD = aVar.d(context, str, true);
        dVar.f239b = iD;
        if (iD != 0) {
            dVar.f240c = 1;
        }
        return dVar;
    }

    @Override
    public x8.k k(androidx.media3.common.t tVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public void l(long j9) {
    }

    @Override
    public boolean m(androidx.media3.common.t tVar) {
        return false;
    }

    @Override
    public Object zza() {
        switch (this.A) {
            case 0:
                List list = b0.f14545a;
                z6.B.get();
                return Integer.valueOf((int) ((Long) b7.f3720w.b()).longValue());
            case 1:
                List list2 = b0.f14545a;
                z6.B.get();
                Boolean bool = (Boolean) b7.C.b();
                bool.getClass();
                return bool;
            case 2:
                List list3 = b0.f14545a;
                Boolean bool2 = (Boolean) t7.f3866a.b();
                bool2.getClass();
                return bool2;
            case 3:
                List list4 = b0.f14545a;
                Boolean bool3 = (Boolean) i8.f3776a.b();
                bool3.getClass();
                return bool3;
            case 4:
                List list5 = b0.f14545a;
                return Integer.valueOf((int) ((Long) e7.f3755a.b()).longValue());
            case 5:
                List list6 = b0.f14545a;
                Boolean bool4 = (Boolean) a9.f3668a.b();
                bool4.getClass();
                return bool4;
            case 6:
                List list7 = b0.f14545a;
                z6.B.get();
                return Integer.valueOf((int) ((Long) b7.f3701m0.b()).longValue());
            case 7:
                List list8 = b0.f14545a;
                m8.B.get();
                Boolean bool5 = (Boolean) o8.f3837g.b();
                bool5.getClass();
                return bool5;
            case 8:
                List list9 = b0.f14545a;
                Boolean bool6 = (Boolean) k7.f3802b.b();
                bool6.getClass();
                return bool6;
            case 9:
                List list10 = b0.f14545a;
                m8.B.get();
                Boolean bool7 = (Boolean) o8.f3834d.b();
                bool7.getClass();
                return bool7;
            case 10:
                List list11 = b0.f14545a;
                z6.B.get();
                Long l = (Long) b7.f3678a.b();
                l.getClass();
                return l;
            default:
                return new Boolean(((Boolean) r8.f3858a.b()).booleanValue());
        }
    }
}
