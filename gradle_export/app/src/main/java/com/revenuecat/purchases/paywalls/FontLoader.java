package com.revenuecat.purchases.paywalls;

import a40.c0;
import a40.m0;
import a40.w1;
import a40.z;
import android.content.Context;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfoKt;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.Result;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import g00.b0;
import g00.h;
import h00.d0;
import h00.q;
import h00.v;
import h40.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k00.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l00.a;
import m00.e;
import m00.i;
import r30.r;
import ri.t1;
import u00.k;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\r\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R&\u0010B\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010CR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020,0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010C\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/paywalls/FontLoader;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "providedCacheDir", "La40/z;", "ioScope", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "urlConnectionFactory", "<init>", "(Landroid/content/Context;Ljava/io/File;La40/z;Lcom/revenuecat/purchases/utils/UrlConnectionFactory;)V", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "fontInfo", "Lg00/b0;", "startFontDownload", "(Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;)V", "", "urlHash", "file", "addFileToCache", "(Ljava/lang/String;Ljava/io/File;)V", "cacheDir", "", "ensureFoldersExist", "(Ljava/io/File;)Z", "url", "expectedMd5", "extension", "Lg00/n;", "performDownloadAndCache-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/lang/Object;", "performDownloadAndCache", "outputFile", "downloadToFile", "Ljava/io/InputStream;", "input", "writeStream", "(Ljava/io/InputStream;Ljava/io/File;)V", "", "bytes", "md5Hex", "([B)Ljava/lang/String;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "getCachedFontFamilyOrStartDownload", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "Landroid/content/Context;", "Ljava/io/File;", "La40/z;", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCheckedFoldersExist", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cacheDirectory$delegate", "Lg00/h;", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory", "Ljava/security/MessageDigest;", "md$delegate", "getMd", "()Ljava/security/MessageDigest;", "md", "", "", "fontInfosForHash", "Ljava/util/Map;", "lock", "Ljava/lang/Object;", "cachedFontFamilyByFontInfo", "cachedFontFamilyByFamilyName", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontLoader {

    private final h cacheDirectory;
    private final Map<String, DownloadedFontFamily> cachedFontFamilyByFamilyName;
    private final Map<DownloadableFontInfo, String> cachedFontFamilyByFontInfo;
    private final Context context;
    private final Map<String, Set<DownloadableFontInfo>> fontInfosForHash;
    private AtomicBoolean hasCheckedFoldersExist;
    private final z ioScope;
    private final Object lock;

    private final h md;
    private final File providedCacheDir;
    private final UrlConnectionFactory urlConnectionFactory;

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

    @e(c = "com.revenuecat.purchases.paywalls.FontLoader$startFontDownload$1", f = "FontLoader.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C01181 extends i implements u00.n {
        final String $expectedMd5;
        final DownloadableFontInfo $fontInfo;
        final String $url;
        int label;

        public C01181(String str, String str2, DownloadableFontInfo downloadableFontInfo, c<? super C01181> cVar) {
            super(2, cVar);
            this.$url = str;
            this.$expectedMd5 = str2;
            this.$fontInfo = downloadableFontInfo;
        }

        @Override
        public final c<b0> create(Object obj, c<?> cVar) {
            return FontLoader.this.new C01181(this.$url, this.$expectedMd5, this.$fontInfo, cVar);
        }

        @Override
        public final Object invoke(z zVar, c<? super b0> cVar) {
            return ((C01181) create(zVar, cVar)).invokeSuspend(b0.a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            a aVar = a.A;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            File cacheDirectory = FontLoader.this.getCacheDirectory();
            if (cacheDirectory == null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot download font: cache directory is not available", null);
                return b0.a;
            }
            if (!FontLoader.this.ensureFoldersExist(cacheDirectory)) {
                return b0.a;
            }
            FontLoader fontLoader = FontLoader.this;
            byte[] bytes = this.$url.getBytes(r30.a.a);
            m.d(bytes, "getBytes(...)");
            String strMd5Hex = fontLoader.md5Hex(bytes);
            String strB1 = r30.k.b1('.', this.$url, "");
            File file = new File(cacheDirectory, strMd5Hex + '.' + strB1);
            Object obj3 = FontLoader.this.lock;
            FontLoader fontLoader2 = FontLoader.this;
            DownloadableFontInfo downloadableFontInfo = this.$fontInfo;
            String str = this.$url;
            synchronized (obj3) {
                Set set = (Set) fontLoader2.fontInfosForHash.get(strMd5Hex);
                if (set != null) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font download already in progress for " + str);
                    }
                    set.add(downloadableFontInfo);
                    return b0.a;
                }
                Map map = fontLoader2.fontInfosForHash;
                LinkedHashSet linkedHashSet = new LinkedHashSet(d0.P(1));
                h00.n.T0(new DownloadableFontInfo[]{downloadableFontInfo}, linkedHashSet);
                map.put(strMd5Hex, linkedHashSet);
                if (file.exists()) {
                    FontLoader.this.addFileToCache(strMd5Hex, file);
                    return b0.a;
                }
                try {
                    Object objM156performDownloadAndCacheyxL6bBk = FontLoader.this.m156performDownloadAndCacheyxL6bBk(this.$url, this.$expectedMd5, strMd5Hex, strB1, cacheDirectory);
                    FontLoader fontLoader3 = FontLoader.this;
                    if (!(objM156performDownloadAndCacheyxL6bBk instanceof g00.m)) {
                        fontLoader3.addFileToCache(strMd5Hex, (File) objM156performDownloadAndCacheyxL6bBk);
                    }
                    DownloadableFontInfo downloadableFontInfo2 = this.$fontInfo;
                    if (g00.n.a(objM156performDownloadAndCacheyxL6bBk) != null) {
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to download font for " + downloadableFontInfo2.getFamily(), null);
                    }
                    obj2 = FontLoader.this.lock;
                    FontLoader fontLoader4 = FontLoader.this;
                    synchronized (obj2) {
                        return b0.a;
                    }
                } catch (Throwable th) {
                    try {
                        String str2 = this.$url;
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading remote font from " + str2, th);
                        obj2 = FontLoader.this.lock;
                        FontLoader fontLoader5 = FontLoader.this;
                        synchronized (obj2) {
                        }
                    } catch (Throwable th2) {
                        Object obj4 = FontLoader.this.lock;
                        FontLoader fontLoader6 = FontLoader.this;
                        synchronized (obj4) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public FontLoader(Context context, File file, z ioScope, UrlConnectionFactory urlConnectionFactory) {
        m.e(context, "context");
        m.e(ioScope, "ioScope");
        m.e(urlConnectionFactory, "urlConnectionFactory");
        this.context = context;
        this.providedCacheDir = file;
        this.ioScope = ioScope;
        this.urlConnectionFactory = urlConnectionFactory;
        this.hasCheckedFoldersExist = new AtomicBoolean(false);
        this.cacheDirectory = rd.a.I(g00.i.A, new FontLoader$cacheDirectory$2(this));
        this.md = rd.a.J(FontLoader$md$2.INSTANCE);
        this.fontInfosForHash = new LinkedHashMap();
        this.lock = new Object();
        this.cachedFontFamilyByFontInfo = new LinkedHashMap();
        this.cachedFontFamilyByFamilyName = new LinkedHashMap();
    }

    public FontLoader(Context context, File file, z zVar, UrlConnectionFactory urlConnectionFactory, int i, f fVar) {
        file = (i & 2) != 0 ? null : file;
        if ((i & 4) != 0) {
            w1 w1VarE = c0.e();
            h40.e eVar = m0.a;
            zVar = c0.c(rd.a.P(w1VarE, d.C));
        }
        this(context, file, zVar, (i & 8) != 0 ? new DefaultUrlConnectionFactory() : urlConnectionFactory);
    }

    public final void addFileToCache(String urlHash, File file) {
        synchronized (this.lock) {
            try {
                Set<DownloadableFontInfo> set = this.fontInfosForHash.get(urlHash);
                if (set == null) {
                    set = h00.z.A;
                }
                for (DownloadableFontInfo downloadableFontInfo : set) {
                    String family = downloadableFontInfo.getFamily();
                    if (this.cachedFontFamilyByFontInfo.get(downloadableFontInfo) != null) {
                        LogLevel logLevel = LogLevel.VERBOSE;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font already cached for " + family + ". Skipping download.");
                        }
                    } else {
                        DownloadedFontFamily downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(family);
                        if (downloadedFontFamily != null) {
                            this.cachedFontFamilyByFamilyName.put(family, new DownloadedFontFamily(downloadedFontFamily.getFamily(), q.Z0(new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file), downloadedFontFamily.getFonts())));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                        } else {
                            DownloadedFontFamily downloadedFontFamily2 = new DownloadedFontFamily(family, va.a.R(new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file)));
                            this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                            this.cachedFontFamilyByFamilyName.put(family, downloadedFontFamily2);
                        }
                    }
                }
                this.fontInfosForHash.remove(urlHash);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void downloadToFile(String url, File outputFile) throws Throwable {
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Downloading remote font from " + url);
        }
        UrlConnection urlConnection = null;
        try {
            UrlConnection urlConnectionCreateConnection$default = UrlConnectionFactory.createConnection$default(this.urlConnectionFactory, url, null, 2, null);
            try {
                if (urlConnectionCreateConnection$default.getResponseCode() != 200) {
                    throw new IOException("HTTP " + urlConnectionCreateConnection$default.getResponseCode() + " when downloading paywall font: " + url);
                }
                InputStream inputStream = urlConnectionCreateConnection$default.getInputStream();
                try {
                    writeStream(inputStream, outputFile);
                    ta.c0.C(inputStream, (Throwable) null);
                    urlConnectionCreateConnection$default.disconnect();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ta.c0.C(inputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                urlConnection = urlConnectionCreateConnection$default;
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final boolean ensureFoldersExist(File cacheDir) {
        boolean z = true;
        if (this.hasCheckedFoldersExist.get()) {
            return true;
        }
        if (cacheDir.exists() || cacheDir.mkdirs()) {
            if (!cacheDir.isDirectory()) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Remote fonts cache path exists but is not a directory: " + cacheDir.getAbsolutePath(), null);
            }
            this.hasCheckedFoldersExist.set(z);
            return z;
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unable to create cache directory for remote fonts: " + cacheDir.getAbsolutePath(), null);
        z = false;
        this.hasCheckedFoldersExist.set(z);
        return z;
    }

    public final File getCacheDirectory() {
        return (File) this.cacheDirectory.getValue();
    }

    private final MessageDigest getMd() {
        Object value = this.md.getValue();
        m.d(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    public final String md5Hex(byte[] bytes) {
        byte[] digest = getMd().digest(bytes);
        m.d(digest, "digest");
        return h00.n.L0(digest, "", AnonymousClass1.INSTANCE, 30);
    }

    public final Object m156performDownloadAndCacheyxL6bBk(String url, String expectedMd5, String urlHash, String extension, File cacheDir) throws Throwable {
        File file = new File(cacheDir, urlHash + '.' + extension);
        StringBuilder sb = new StringBuilder(".");
        sb.append(extension);
        File tempFile = File.createTempFile("rc_paywall_font_download_", sb.toString(), cacheDir);
        try {
            m.d(tempFile, "tempFile");
            downloadToFile(url, tempFile);
            String strMd5Hex = md5Hex(r00.i.b0(tempFile));
            if (!r.q0(strMd5Hex, expectedMd5)) {
                tempFile.delete();
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Downloaded font file is corrupt for " + url + ". expected=" + expectedMd5 + ", actual=" + strMd5Hex, null);
                return t1.s(new IOException("Downloaded font file is corrupt for " + url));
            }
            if (!tempFile.renameTo(file)) {
                r00.i.X(tempFile, file);
                tempFile.delete();
            }
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Font downloaded successfully from " + url);
            }
            return file;
        } catch (IOException e) {
            if (tempFile.exists()) {
                tempFile.delete();
            }
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            StringBuilder sbN = g4.c.n("Error downloading font from ", url, ": ");
            sbN.append(e.getMessage());
            currentLogHandler2.e("[Purchases] - ERROR", sbN.toString(), null);
            return t1.s(e);
        }
    }

    private final void startFontDownload(DownloadableFontInfo fontInfo) {
        c0.y(this.ioScope, null, null, new C01181(fontInfo.getUrl(), fontInfo.getExpectedMd5(), fontInfo, null), 3);
    }

    private final void writeStream(InputStream input, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = input.read(bArr);
                if (i < 0) {
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ta.c0.C(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        DownloadedFontFamily downloadedFontFamily;
        m.e(fontInfo, "fontInfo");
        Result downloadableFontInfo = DownloadableFontInfoKt.toDownloadableFontInfo(fontInfo);
        if (!(downloadableFontInfo instanceof Result.Success)) {
            if (!(downloadableFontInfo instanceof Result.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) ((Result.Error) downloadableFontInfo).getValue(), null);
            return null;
        }
        DownloadableFontInfo downloadableFontInfo2 = (DownloadableFontInfo) ((Result.Success) downloadableFontInfo).getValue();
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        synchronized (this.lock) {
            downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(this.cachedFontFamilyByFontInfo.get(downloadableFontInfo2));
            zVar.A = downloadedFontFamily;
        }
        if (downloadedFontFamily != null) {
            List fonts = downloadedFontFamily.getFonts();
            if (fonts == null || !fonts.isEmpty()) {
                Iterator it = fonts.iterator();
                while (it.hasNext()) {
                    if (!((DownloadedFont) it.next()).getFile().exists()) {
                        LogLevel logLevel = LogLevel.WARN;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.w(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Cached font files missing for " + ((DownloadedFontFamily) zVar.A).getFamily() + ", re-downloading");
                        }
                        synchronized (this.lock) {
                            DownloadedFontFamily downloadedFontFamily2 = this.cachedFontFamilyByFamilyName.get(((DownloadedFontFamily) zVar.A).getFamily());
                            Object obj = zVar.A;
                            if (downloadedFontFamily2 == obj) {
                                this.cachedFontFamilyByFamilyName.remove(((DownloadedFontFamily) obj).getFamily());
                                Set<Map.Entry<DownloadableFontInfo, String>> setEntrySet = this.cachedFontFamilyByFontInfo.entrySet();
                                FontLoader$getCachedFontFamilyOrStartDownload$4$1 fontLoader$getCachedFontFamilyOrStartDownload$4$1 = new FontLoader$getCachedFontFamilyOrStartDownload$4$1(zVar);
                                m.e(setEntrySet, "<this>");
                                v.w0(setEntrySet, fontLoader$getCachedFontFamilyOrStartDownload$4$1, true);
                            }
                        }
                    }
                }
            }
            return (DownloadedFontFamily) zVar.A;
        }
        startFontDownload(downloadableFontInfo2);
        return null;
    }
}
