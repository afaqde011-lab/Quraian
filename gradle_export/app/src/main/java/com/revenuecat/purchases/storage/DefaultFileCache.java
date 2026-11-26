package com.revenuecat.purchases.storage;

import android.content.Context;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.ChecksumKt;
import g00.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import r00.i;
import rd.a;
import ta.c0;
import u00.k;
import w50.c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u00020\u0014*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileCache;", "Lcom/revenuecat/purchases/storage/LocalFileCache;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bytes", "", "md5Hex", "([B)Ljava/lang/String;", "Ljava/io/InputStream;", "inputStream", "Ljava/io/File;", "file", "Lg00/b0;", "streamToFile", "(Ljava/io/InputStream;Ljava/io/File;)V", "Lcom/revenuecat/purchases/models/Checksum;", "checksum", "", "streamToFileAndCompareChecksum", "(Ljava/io/InputStream;Ljava/io/File;Lcom/revenuecat/purchases/models/Checksum;)Z", "Ljava/net/URL;", "remoteURL", "Ljava/net/URI;", "generateLocalFilesystemURI", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)Ljava/net/URI;", "uri", "cachedContentExists", "(Ljava/net/URI;)Z", "saveData", "(Ljava/io/InputStream;Ljava/net/URI;Lcom/revenuecat/purchases/models/Checksum;)V", "Landroid/content/Context;", "Ljava/security/MessageDigest;", "md$delegate", "Lg00/h;", "getMd", "()Ljava/security/MessageDigest;", "md", "cacheDir$delegate", "getCacheDir", "()Ljava/io/File;", "cacheDir", "isFalse", "(Z)Z", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultFileCache implements LocalFileCache {
    private static final int BUFFER_SIZE = 262144;

    private final h cacheDir;
    private final Context context;

    private final h md;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }

        @Override
        public Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    public DefaultFileCache(Context context) {
        m.e(context, "context");
        this.context = context;
        this.md = a.J(DefaultFileCache$md$2.INSTANCE);
        this.cacheDir = a.J(new DefaultFileCache$cacheDir$2(this));
    }

    private final File getCacheDir() {
        return (File) this.cacheDir.getValue();
    }

    private final MessageDigest getMd() {
        Object value = this.md.getValue();
        m.d(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    private final boolean isFalse(boolean z) {
        return !z;
    }

    private final String md5Hex(byte[] bytes) {
        byte[] bArrDigest = getMd().digest(bytes);
        m.d(bArrDigest, "md.digest(bytes)");
        return h00.n.L0(bArrDigest, "", AnonymousClass1.INSTANCE, 30);
    }

    private final void streamToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            c.w(inputStream, fileOutputStream, BUFFER_SIZE);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.C(fileOutputStream, th);
                throw th2;
            }
        }
    }

    private final boolean streamToFileAndCompareChecksum(InputStream inputStream, File file, Checksum checksum) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(checksum.getAlgorithm().getAlgorithmName());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[BUFFER_SIZE];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    byte[] hash = messageDigest.digest();
                    Checksum.Algorithm algorithm = checksum.getAlgorithm();
                    m.d(hash, "hash");
                    return checksum.equals(new Checksum(algorithm, ChecksumKt.toHexString(hash)));
                }
                messageDigest.update(bArr, 0, i);
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c0.C(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override
    public boolean cachedContentExists(URI uri) {
        m.e(uri, "uri");
        return new File(uri).exists();
    }

    @Override
    public URI generateLocalFilesystemURI(URL remoteURL, Checksum checksum) {
        String value;
        m.e(remoteURL, "remoteURL");
        String string = remoteURL.toString();
        m.d(string, "remoteURL.toString()");
        byte[] bytes = string.getBytes(r30.a.a);
        m.d(bytes, "getBytes(...)");
        String strMd5Hex = md5Hex(bytes);
        StringBuilder sb = new StringBuilder();
        sb.append(new File(strMd5Hex).getName());
        if (checksum == null || (value = checksum.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        String string2 = sb.toString();
        if (string2.length() == 0) {
            return null;
        }
        String path = remoteURL.getPath();
        m.d(path, "remoteURL.path");
        return new File(getCacheDir(), string2 + '.' + r30.k.b1('.', path, "")).toURI();
    }

    @Override
    public void saveData(InputStream inputStream, URI uri, Checksum checksum) throws IOException {
        m.e(inputStream, "inputStream");
        m.e(uri, "uri");
        File file = new File(uri);
        File tempFile = File.createTempFile("rc_download_", ".tmp", file.getParentFile());
        try {
            if (checksum != null) {
                m.d(tempFile, "tempFile");
                if (isFalse(streamToFileAndCompareChecksum(inputStream, tempFile, checksum))) {
                    tempFile.delete();
                    return;
                }
            } else {
                m.d(tempFile, "tempFile");
                streamToFile(inputStream, tempFile);
            }
            if (!tempFile.renameTo(file)) {
                i.X(tempFile, file);
            }
        } catch (Exception e) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to copy temp file to final file: " + e.getMessage());
            }
            file.delete();
        } finally {
            tempFile.delete();
        }
    }
}
