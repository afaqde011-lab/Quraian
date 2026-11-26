package k50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class v extends o {
    @Override
    public final g0 a(z file) {
        kotlin.jvm.internal.m.e(file, "file");
        File file2 = file.toFile();
        Logger logger = x.a;
        return new c(new FileOutputStream(file2, true), new k0(), 1);
    }

    @Override
    public void b(z source, z target) throws IOException {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override
    public final void d(z zVar) throws IOException {
        if (zVar.toFile().mkdir()) {
            return;
        }
        ca.p pVarJ = j(zVar);
        if (pVarJ == null || !pVarJ.c) {
            throw new IOException("failed to create directory: " + zVar);
        }
    }

    @Override
    public final void e(z path) throws IOException {
        kotlin.jvm.internal.m.e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override
    public final List h(z dir) throws IOException {
        kotlin.jvm.internal.m.e(dir, "dir");
        File file = dir.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.m.b(str);
            arrayList.add(dir.e(str));
        }
        h00.u.s0(arrayList);
        return arrayList;
    }

    @Override
    public ca.p j(z path) {
        kotlin.jvm.internal.m.e(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new ca.p(zIsFile, zIsDirectory, (z) null, Long.valueOf(length), (Long) null, Long.valueOf(jLastModified), (Long) null);
        }
        return null;
    }

    @Override
    public final u k(z zVar) {
        return new u(false, new RandomAccessFile(zVar.toFile(), "r"));
    }

    @Override
    public final u l(z zVar) {
        return new u(true, new RandomAccessFile(zVar.toFile(), "rw"));
    }

    @Override
    public final g0 m(z file) {
        kotlin.jvm.internal.m.e(file, "file");
        File file2 = file.toFile();
        Logger logger = x.a;
        return new c(new FileOutputStream(file2, false), new k0(), 1);
    }

    @Override
    public final i0 n(z file) {
        kotlin.jvm.internal.m.e(file, "file");
        File file2 = file.toFile();
        Logger logger = x.a;
        return new d(new FileInputStream(file2), k0.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
