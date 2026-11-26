package r00;

import h00.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.m;
import r30.k;
import ta.c0;

public abstract class i extends ze.d {
    public static void X(File file, File target) throws IOException {
        m.e(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.");
        }
        if (target.exists() && !target.delete()) {
            throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new FileSystemException(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                w50.c.w(fileInputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0.C(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                c0.C(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static boolean Y(File file) {
        m.e(file, "<this>");
        h hVar = h.A;
        f fVar = new f(new q30.i(file));
        while (true) {
            boolean z = true;
            while (fVar.hasNext()) {
                File file2 = (File) fVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String Z(File file) {
        m.e(file, "<this>");
        String name = file.getName();
        m.d(name, "getName(...)");
        return k.b1('.', name, "");
    }

    public static String a0(File file) {
        m.e(file, "<this>");
        String name = file.getName();
        m.d(name, "getName(...)");
        return k.g1(name, name);
    }

    public static byte[] b0(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                m.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    a aVar = new a(8193);
                    aVar.write(i5);
                    w50.c.w(fileInputStream, aVar, 8192);
                    int size = aVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = aVar.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    m.d(bArrCopyOf, "copyOf(...)");
                    n.r0(bArrA, i, bArrCopyOf, 0, aVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.C(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static File c0(File file, String relative) {
        int length;
        int iI0;
        m.e(relative, "relative");
        File file2 = new File(relative);
        String path = file2.getPath();
        m.d(path, "getPath(...)");
        char c = File.separatorChar;
        int iI1 = k.I0(path, c, 0, 4);
        if (iI1 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (iI0 = k.I0(path, c, 2, 4)) < 0) {
                length = 1;
            } else {
                int iI2 = k.I0(path, c, iI0 + 1, 4);
                length = iI2 >= 0 ? iI2 + 1 : path.length();
            }
        } else if (iI1 <= 0 || path.charAt(iI1 - 1) != ':') {
            length = (iI1 == -1 && k.D0(path, ':')) ? path.length() : 0;
        } else {
            length = iI1 + 1;
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        m.d(string, "toString(...)");
        if ((string.length() == 0) || k.D0(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }
}
