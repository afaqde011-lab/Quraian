package e7;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.protobuf.RuntimeVersion;
import fh.d2;
import fh.n0;
import fh.q0;
import fh.r0;
import fh.t0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class d {
    public static void a(int i10, int i11) throws GlUtil$GlException {
        GLES20.glBindTexture(i10, i11);
        b();
        GLES20.glTexParameteri(i10, 10240, 9729);
        b();
        GLES20.glTexParameteri(i10, 10241, 9729);
        b();
        GLES20.glTexParameteri(i10, 10242, 33071);
        b();
        GLES20.glTexParameteri(i10, 10243, 33071);
        b();
    }

    public static void b() throws GlUtil$GlException {
        StringBuilder sb2 = new StringBuilder();
        fh.w.g(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i11 = i10 + 1;
            int iB = n0.b(objArrCopyOf.length, i11);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i10] = numValueOf;
            z10 = true;
            i10 = i11;
        }
        if (z10) {
            throw new GlUtil$GlException(sb2.toString(), t0.l(i10, objArrCopyOf));
        }
    }

    public static void c(String str, boolean z10) throws GlUtil$GlException {
        if (z10) {
            return;
        }
        r0 r0Var = t0.B;
        throw new GlUtil$GlException(str, d2.E);
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static d2 e(eh.k kVar, List list) {
        q0 q0VarM = t0.m();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Bundle bundle = (Bundle) list.get(i10);
            bundle.getClass();
            q0VarM.c(kVar.apply(bundle));
        }
        return q0VarM.g();
    }

    public static int[] f(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static boolean g(String str) throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        c("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        c("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        b();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static String h(StringBuilder sb2, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb2.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static String i(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = RuntimeVersion.SUFFIX;
        }
        if (str2 == null) {
            str2 = RuntimeVersion.SUFFIX;
        }
        int[] iArrF = f(str2);
        if (iArrF[0] != -1) {
            sb2.append(str2);
            h(sb2, iArrF[1], iArrF[2]);
            return sb2.toString();
        }
        int[] iArrF2 = f(str);
        if (iArrF[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrF2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrF[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrF2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = iArrF[1];
        if (i10 != 0) {
            int i11 = iArrF2[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return h(sb2, iArrF[1] + i11, i11 + iArrF[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, iArrF2[1]);
            sb2.append(str2);
            int i12 = iArrF2[1];
            return h(sb2, i12, iArrF[2] + i12);
        }
        int i13 = iArrF2[0] + 2;
        int i14 = iArrF2[1];
        if (i13 >= i14 || i14 != iArrF2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrF2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrF2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return h(sb2, iArrF2[1], i15 + iArrF[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = iArrF2[1];
        return h(sb2, i16, iArrF[2] + i16 + 1);
    }

    public static Uri j(String str, String str2) {
        return Uri.parse(i(str, str2));
    }

    public static ArrayList k(Collection collection, eh.k kVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) kVar.apply(it.next()));
        }
        return arrayList;
    }
}
