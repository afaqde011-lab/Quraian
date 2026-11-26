package z9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.gms.internal.measurement.x5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import k7.z;
import tf.x;

public abstract class c {

    public static final x f17316a = new x(24);

    public static final byte[] f17317b = {112, 114, 111, 0};

    public static final byte[] f17318c = {112, 114, 109, 0};

    public static final byte[] f17319d = {48, 49, 53, 0};

    public static final byte[] f17320e = {48, 49, 48, 0};

    public static final byte[] f17321f = {48, 48, 57, 0};

    public static final byte[] f17322g = {48, 48, 53, 0};

    public static final byte[] f17323h = {48, 48, 49, 0};

    public static final byte[] f17324i = {48, 48, 49, 0};

    public static final byte[] f17325j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.f17313g * 2) + 7) & (-8)) / 8) + (aVar.f17311e * 2) + d(aVar.f17307a, aVar.f17308b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f17312f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f17321f)) {
            int length2 = aVarArr.length;
            while (i10 < length2) {
                a aVar2 = aVarArr[i10];
                q(byteArrayOutputStream, aVar2, d(aVar2.f17307a, aVar2.f17308b, bArr));
                p(byteArrayOutputStream, aVar2);
                i10++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(aVar3.f17307a, aVar3.f17308b, bArr));
            }
            int length3 = aVarArr.length;
            while (i10 < length3) {
                p(byteArrayOutputStream, aVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f17323h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f17322g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return x5.n(x5.q(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(g4.c.f(i10, "Not enough bytes to read: "));
            }
            i11 += i12;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int iM = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i11] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = f17324i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f17325j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                a[] aVarArrK = k(byteArrayInputStream, bArr2, iM, aVarArr);
                byteArrayInputStream.close();
                return aVarArrK;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f17319d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            a[] aVarArrJ = j(byteArrayInputStream2, iM2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrJ;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i10, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i10 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i11] = (int) m(byteArrayInputStream, 2);
            strArr[i11] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            a aVar = aVarArr[i12];
            if (!aVar.f17308b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            aVar.f17311e = i13;
            aVar.f17314h = g(byteArrayInputStream, i13);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i10 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i12 = 0; i12 < aVarArr.length; i12++) {
                    if (aVarArr[i12].f17308b.equals(strSubstring)) {
                        aVar = aVarArr[i12];
                        break;
                    }
                }
            }
            if (aVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f17310d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f17323h)) {
                aVar.f17311e = iM;
                aVar.f17314h = iArrG;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f17320e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            a[] aVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return aVarArrN;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(InputStream inputStream, int i10) throws IOException {
        byte[] bArrF = f(inputStream, i10);
        long j9 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j9 += ((long) (bArrF[i11] & 255)) << (i11 * 8);
        }
        return j9;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            aVarArr[i12] = new a(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            a aVar = aVarArr[i13];
            int iAvailable = byteArrayInputStream.available();
            int i14 = aVar.f17312f;
            int i15 = aVar.f17313g;
            TreeMap treeMap = aVar.f17315i;
            int i16 = iAvailable - i14;
            int iM3 = i11;
            while (byteArrayInputStream.available() > i16) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i17 = i11;
                            int i18 = i13;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i11 = i17;
                            i13 = i18;
                        }
                    }
                    iM4--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i19 = i11;
            int i20 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f17314h = g(byteArrayInputStream, aVar.f17311e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i21 = i19; i21 < i15; i21++) {
                int i22 = bitSetValueOf.get(i21) ? 2 : i19;
                if (bitSetValueOf.get(i21 + i15)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i21));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | numValueOf.intValue()));
                }
            }
            i13 = i20 + 1;
            i11 = i19;
        }
        return aVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        long j9;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f17319d;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f17320e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f17322g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f17315i.size() * 4;
                    String strD = d(aVar.f17307a, aVar.f17308b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f17314h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.f17309c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = aVar.f17315i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i11 : aVar.f17314h) {
                        v(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f17321f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f17323h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.f17307a;
                TreeMap treeMap = aVar2.f17315i;
                String strD2 = d(str, aVar2.f17308b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.f17314h.length);
                u(byteArrayOutputStream, aVar2.f17309c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : aVar2.f17314h) {
                    v(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f17309c, 4);
                u(byteArrayOutputStream2, aVar3.f17310d, 4);
                u(byteArrayOutputStream2, aVar3.f17313g, 4);
                String strD3 = d(aVar3.f17307a, aVar3.f17308b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            f fVar = new f(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(fVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < aVarArr.length) {
                try {
                    a aVar4 = aVarArr[i15];
                    v(byteArrayOutputStream3, i15);
                    v(byteArrayOutputStream3, aVar4.f17311e);
                    i16 = i16 + 4 + (aVar4.f17311e * i13);
                    int[] iArr = aVar4.f17314h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        v(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            f fVar2 = new f(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i21];
                    Iterator it3 = aVar5.f17315i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i21);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i22 = i23 + length4;
                            i21++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i22 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i22 + ", does not match actual size " + byteArray5.length);
            }
            f fVar3 = new f(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList2.add(fVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                f fVar4 = (f) arrayList2.get(i24);
                int i25 = fVar4.f17333a;
                byte[] bArr7 = fVar4.f17334b;
                if (i25 == 1) {
                    j9 = 0;
                } else if (i25 == 2) {
                    j9 = 1;
                } else if (i25 == 3) {
                    j9 = 2;
                } else if (i25 == 4) {
                    j9 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j9 = 4;
                }
                u(byteArrayOutputStream, j9, 4);
                u(byteArrayOutputStream, size2, 4);
                if (fVar4.f17335c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th10) {
            try {
                byteArrayOutputStream2.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        s(byteArrayOutputStream, aVar);
        int i10 = aVar.f17313g;
        int[] iArr = aVar.f17314h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            v(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f17315i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f17311e);
        u(byteArrayOutputStream, aVar.f17312f, 4);
        u(byteArrayOutputStream, aVar.f17309c, 4);
        u(byteArrayOutputStream, aVar.f17313g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i10, a aVar) throws IOException {
        int i11 = aVar.f17313g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f17315i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : aVar.f17315i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i10);
                v(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    public static void t(Context context, Executor executor, b bVar, boolean z10) {
        boolean z11;
        ?? A;
        byte[] bArr;
        a[] aVarArrL;
        a[] aVarArr;
        byte[] bArr2;
        z zVar;
        ?? r7;
        String str;
        FileInputStream fileInputStreamA;
        boolean zEquals;
        b bVar2;
        a[] aVarArr2;
        byte[] bArr3;
        ?? r10;
        boolean z12;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i10;
        ?? r11;
        boolean z13;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r12;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j9 = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = j9 == packageInfo.lastUpdateTime;
                            if (z14) {
                                bVar.i(2, null);
                            }
                        } catch (Throwable th4) {
                            try {
                                dataInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (IOException unused) {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    e.a(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            z zVar2 = new z(assets, executor, bVar, name, file2);
            if (!file2.exists()) {
                try {
                    if (file2.createNewFile()) {
                        zVar2.f9187b = true;
                        A = zVar2.a(assets, "dexopt/baseline.prof");
                        bArr = f17317b;
                        if (A != 0) {
                            if (Arrays.equals(bArr, f(A, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            aVarArrL = l(A, f(A, 4), (String) zVar2.f9190e);
                            A.close();
                            zVar2.f9191f = aVarArrL;
                        }
                        aVarArr = (a[]) zVar2.f9191f;
                        bArr2 = f17319d;
                        if (aVarArr != null) {
                            str = "dexopt/baseline.profm";
                            fileInputStreamA = zVar2.a(assets, "dexopt/baseline.profm");
                            r7 = str;
                            if (fileInputStreamA != null) {
                                zEquals = Arrays.equals(f17318c, f(fileInputStreamA, 4));
                                if (zEquals) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                zVar2.f9191f = i(fileInputStreamA, f(fileInputStreamA, 4), bArr2, aVarArr);
                                fileInputStreamA.close();
                                zVar = zVar2;
                                A = zEquals;
                            } else {
                                if (fileInputStreamA != null) {
                                    fileInputStreamA.close();
                                    r7 = str;
                                }
                                zVar = null;
                                A = r7;
                            }
                            if (zVar != null) {
                                zVar2 = zVar;
                            }
                        }
                        bVar2 = (b) zVar2.f9188c;
                        aVarArr2 = (a[]) zVar2.f9191f;
                        if (aVarArr2 != null) {
                            if (zVar2.f9187b) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr);
                            byteArrayOutputStream.write(bArr2);
                            if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                zVar2.f9192g = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                zVar2.f9191f = null;
                            } else {
                                bVar2.i(5, null);
                                zVar2.f9191f = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr3 = (byte[]) zVar2.f9192g;
                        if (bArr3 != null) {
                            if (zVar2.f9187b) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr3);
                            fileOutputStream = new FileOutputStream((File) zVar2.f9189d);
                            channel = fileOutputStream.getChannel();
                            fileLockTryLock = channel.tryLock();
                            if (fileLockTryLock != null) {
                                if (fileLockTryLock.isValid()) {
                                    bArr4 = new byte[512];
                                    while (true) {
                                        i10 = byteArrayInputStream.read(bArr4);
                                        if (i10 > 0) {
                                            break;
                                            break;
                                        }
                                        fileOutputStream.write(bArr4, 0, i10);
                                    }
                                    r11 = 1;
                                    zVar2.b(1, null);
                                    fileLockTryLock.close();
                                    channel.close();
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    zVar2.f9192g = null;
                                    zVar2.f9191f = null;
                                    z12 = true;
                                }
                            }
                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                        }
                        z12 = false;
                        r11 = 1;
                        if (z12) {
                            e(packageInfo, filesDir);
                        }
                        z13 = z12;
                        r12 = r11;
                    } else {
                        zVar2.b(4, null);
                        z11 = true;
                        z13 = false;
                        r12 = z11;
                    }
                } catch (IOException unused2) {
                    z11 = true;
                    zVar2.b(4, null);
                }
            } else if (file2.canWrite()) {
                zVar2.f9187b = true;
                try {
                    A = zVar2.a(assets, "dexopt/baseline.prof");
                } catch (FileNotFoundException e3) {
                    bVar.i(6, e3);
                    A = 0;
                } catch (IOException e10) {
                    bVar.i(7, e10);
                    A = 0;
                }
                bArr = f17317b;
                try {
                    if (A != 0) {
                        try {
                            if (Arrays.equals(bArr, f(A, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            aVarArrL = l(A, f(A, 4), (String) zVar2.f9190e);
                            try {
                                A.close();
                            } catch (IOException e11) {
                                bVar.i(7, e11);
                            }
                            zVar2.f9191f = aVarArrL;
                        } catch (IOException e12) {
                            bVar.i(7, e12);
                            try {
                                A.close();
                            } catch (IOException e13) {
                                bVar.i(7, e13);
                            }
                            aVarArrL = null;
                        } catch (IllegalStateException e14) {
                            bVar.i(8, e14);
                            A.close();
                            aVarArrL = null;
                        }
                    }
                    aVarArr = (a[]) zVar2.f9191f;
                    bArr2 = f17319d;
                    if (aVarArr != null) {
                        try {
                            str = "dexopt/baseline.profm";
                            fileInputStreamA = zVar2.a(assets, "dexopt/baseline.profm");
                            r7 = str;
                            if (fileInputStreamA != null) {
                                try {
                                    zEquals = Arrays.equals(f17318c, f(fileInputStreamA, 4));
                                    if (zEquals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    zVar2.f9191f = i(fileInputStreamA, f(fileInputStreamA, 4), bArr2, aVarArr);
                                    fileInputStreamA.close();
                                    zVar = zVar2;
                                    A = zEquals;
                                } catch (Throwable th6) {
                                    try {
                                        fileInputStreamA.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                        throw th6;
                                    }
                                }
                            } else {
                                if (fileInputStreamA != null) {
                                    fileInputStreamA.close();
                                    r7 = str;
                                }
                                zVar = null;
                                A = r7;
                            }
                        } catch (FileNotFoundException e15) {
                            bVar.i(9, e15);
                            r7 = A;
                        } catch (IOException e16) {
                            bVar.i(7, e16);
                            r7 = A;
                        } catch (IllegalStateException e17) {
                            zVar2.f9191f = null;
                            bVar.i(8, e17);
                            r7 = A;
                        }
                        if (zVar != null) {
                            zVar2 = zVar;
                        }
                    }
                    bVar2 = (b) zVar2.f9188c;
                    aVarArr2 = (a[]) zVar2.f9191f;
                    if (aVarArr2 != null) {
                        if (zVar2.f9187b) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (o(byteArrayOutputStream, bArr2, aVarArr2)) {
                                    bVar2.i(5, null);
                                    zVar2.f9191f = null;
                                    byteArrayOutputStream.close();
                                } else {
                                    zVar2.f9192g = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    zVar2.f9191f = null;
                                }
                            } catch (Throwable th8) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th8;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                    throw th8;
                                }
                            }
                        } catch (IOException e18) {
                            bVar2.i(7, e18);
                        } catch (IllegalStateException e19) {
                            bVar2.i(8, e19);
                        }
                    }
                    bArr3 = (byte[]) zVar2.f9192g;
                    if (bArr3 != null) {
                        z12 = false;
                        r11 = 1;
                    } else {
                        try {
                            if (zVar2.f9187b) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                    try {
                                        try {
                                            fileOutputStream = new FileOutputStream((File) zVar2.f9189d);
                                            try {
                                                try {
                                                    channel = fileOutputStream.getChannel();
                                                    try {
                                                        fileLockTryLock = channel.tryLock();
                                                        try {
                                                            try {
                                                                if (fileLockTryLock != null) {
                                                                    try {
                                                                        if (fileLockTryLock.isValid()) {
                                                                            bArr4 = new byte[512];
                                                                            while (true) {
                                                                                i10 = byteArrayInputStream.read(bArr4);
                                                                                if (i10 > 0) {
                                                                                    break;
                                                                                } else {
                                                                                    fileOutputStream.write(bArr4, 0, i10);
                                                                                }
                                                                            }
                                                                            r11 = 1;
                                                                            zVar2.b(1, null);
                                                                            fileLockTryLock.close();
                                                                            channel.close();
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            zVar2.f9192g = null;
                                                                            zVar2.f9191f = null;
                                                                            z12 = true;
                                                                        }
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                        Throwable th11 = th;
                                                                        if (fileLockTryLock == null) {
                                                                            throw th11;
                                                                        }
                                                                        try {
                                                                            fileLockTryLock.close();
                                                                            throw th11;
                                                                        } catch (Throwable th12) {
                                                                            th11.addSuppressed(th12);
                                                                            throw th11;
                                                                        }
                                                                    }
                                                                }
                                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                Throwable th14 = th;
                                                                if (channel == null) {
                                                                    throw th14;
                                                                }
                                                                try {
                                                                    channel.close();
                                                                    throw th14;
                                                                } catch (Throwable th15) {
                                                                    th14.addSuppressed(th15);
                                                                    throw th14;
                                                                }
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                    }
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    th3 = th;
                                                    try {
                                                        fileOutputStream.close();
                                                        throw th3;
                                                    } catch (Throwable th19) {
                                                        th3.addSuppressed(th19);
                                                        throw th3;
                                                    }
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th3 = th;
                                                fileOutputStream.close();
                                                throw th3;
                                            }
                                        } catch (Throwable th21) {
                                            th = th21;
                                            th2 = th;
                                            try {
                                                byteArrayInputStream.close();
                                                throw th2;
                                            } catch (Throwable th22) {
                                                th2.addSuppressed(th22);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th23) {
                                        th = th23;
                                        th2 = th;
                                        byteArrayInputStream.close();
                                        throw th2;
                                    }
                                } catch (FileNotFoundException e20) {
                                    e = e20;
                                    A = 1;
                                    zVar2.b(6, e);
                                    r10 = A;
                                    zVar2.f9192g = null;
                                    zVar2.f9191f = null;
                                    z12 = false;
                                    r11 = r10;
                                } catch (IOException e21) {
                                    e = e21;
                                    A = 1;
                                    zVar2.b(7, e);
                                    r10 = A;
                                    zVar2.f9192g = null;
                                    zVar2.f9191f = null;
                                    z12 = false;
                                    r11 = r10;
                                }
                            } catch (FileNotFoundException e22) {
                                e = e22;
                                zVar2.b(6, e);
                                r10 = A;
                                zVar2.f9192g = null;
                                zVar2.f9191f = null;
                                z12 = false;
                                r11 = r10;
                            } catch (IOException e23) {
                                e = e23;
                                zVar2.b(7, e);
                                r10 = A;
                                zVar2.f9192g = null;
                                zVar2.f9191f = null;
                                z12 = false;
                                r11 = r10;
                            }
                        } catch (Throwable th24) {
                            zVar2.f9192g = null;
                            zVar2.f9191f = null;
                            throw th24;
                        }
                    }
                    if (z12) {
                        e(packageInfo, filesDir);
                    }
                    z13 = z12;
                    r12 = r11;
                } catch (Throwable th25) {
                    try {
                        A.close();
                        throw th25;
                    } catch (IOException e24) {
                        bVar.i(7, e24);
                        throw th25;
                    }
                }
            } else {
                zVar2.b(4, null);
                z11 = true;
                z13 = false;
                r12 = z11;
            }
            e.a(context, (z13 && z10) ? r12 : 0);
        } catch (PackageManager.NameNotFoundException e25) {
            bVar.i(7, e25);
            e.a(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j9, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j9 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        u(byteArrayOutputStream, i10, 2);
    }
}
