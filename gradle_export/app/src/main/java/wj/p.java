package wj;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

public final class p implements yj.b {
    public final int A;

    public static DataStore b(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, f40.c cVar, u00.a aVar) {
        h00.x xVar = h00.x.A;
        try {
            System.loadLibrary("datastore_shared_counter");
            return MultiProcessDataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, xVar, cVar, aVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, xVar, cVar, aVar);
        }
    }

    public static void c(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && kotlin.jvm.internal.m.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        }
        if (parentFile.isDirectory()) {
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e3) {
            throw new IOException("Failed to create directory: " + parentFile, e3);
        }
    }

    public java.lang.Object a(jj.d r8, m00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: wj.p.a(jj.d, m00.c):java.lang.Object");
    }

    public Object get() {
        switch (this.A) {
            case 1:
                return b1.f16119a;
            default:
                return c1.f16131a;
        }
    }
}
