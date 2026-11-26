package com.revenuecat.purchases.storage;

import a40.c0;
import a40.f0;
import a40.m0;
import a40.q1;
import a40.z;
import android.content.Context;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import g00.b0;
import g00.k;
import h40.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l00.a;
import m00.c;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001:\u0002/0BC\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\u001c2\u001a\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u001a0 0\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\"\u0010$\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b&\u0010'R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository;", "Lcom/revenuecat/purchases/storage/FileRepository;", "Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$CacheKey;", "Ljava/net/URI;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/storage/LocalFileCache;", "fileCacheManager", "La40/z;", "ioScope", "Lcom/revenuecat/purchases/LogHandler;", "logHandler", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "urlConnectionFactory", "<init>", "(Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;Lcom/revenuecat/purchases/storage/LocalFileCache;La40/z;Lcom/revenuecat/purchases/LogHandler;Lcom/revenuecat/purchases/utils/UrlConnectionFactory;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Ljava/net/URL;", "url", "Lcom/revenuecat/purchases/utils/UrlConnection;", "downloadFile", "(Ljava/net/URL;Lk00/c;)Ljava/lang/Object;", "uri", "connectionWithStream", "Lcom/revenuecat/purchases/models/Checksum;", "checksum", "Lg00/b0;", "saveCachedFile", "(Ljava/net/URI;Lcom/revenuecat/purchases/utils/UrlConnection;Lcom/revenuecat/purchases/models/Checksum;)V", "", "Lg00/k;", "urls", "prefetch", "(Ljava/util/List;)V", "generateOrGetCachedFileURL", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lk00/c;)Ljava/lang/Object;", "getFile", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)Ljava/net/URI;", "Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "getStore$purchases_defaultsBc8Release", "()Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "Lcom/revenuecat/purchases/storage/LocalFileCache;", "La40/z;", "Lcom/revenuecat/purchases/LogHandler;", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "CacheKey", "Error", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultFileRepository implements FileRepository {
    private final LocalFileCache fileCacheManager;
    private final z ioScope;
    private final LogHandler logHandler;
    private final KeyedDeferredValueStore<CacheKey, URI> store;
    private final UrlConnectionFactory urlConnectionFactory;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$CacheKey;", "", "url", "Ljava/net/URL;", "checksum", "Lcom/revenuecat/purchases/models/Checksum;", "(Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;)V", "getChecksum", "()Lcom/revenuecat/purchases/models/Checksum;", "getUrl", "()Ljava/net/URL;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CacheKey {
        private final Checksum checksum;
        private final URL url;

        public CacheKey(URL url, Checksum checksum) {
            m.e(url, "url");
            this.url = url;
            this.checksum = checksum;
        }

        public static CacheKey copy$default(CacheKey cacheKey, URL url, Checksum checksum, int i, Object obj) {
            if ((i & 1) != 0) {
                url = cacheKey.url;
            }
            if ((i & 2) != 0) {
                checksum = cacheKey.checksum;
            }
            return cacheKey.copy(url, checksum);
        }

        public final URL getUrl() {
            return this.url;
        }

        public final Checksum getChecksum() {
            return this.checksum;
        }

        public final CacheKey copy(URL url, Checksum checksum) {
            m.e(url, "url");
            return new CacheKey(url, checksum);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) other;
            return m.a(this.url, cacheKey.url) && m.a(this.checksum, cacheKey.checksum);
        }

        public final Checksum getChecksum() {
            return this.checksum;
        }

        public final URL getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            Checksum checksum = this.checksum;
            return iHashCode + (checksum == null ? 0 : checksum.hashCode());
        }

        public String toString() {
            return "CacheKey(url=" + this.url + ", checksum=" + this.checksum + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "Ljava/io/IOException;", "message", "", "(Ljava/lang/String;)V", "ChecksumValidationFailed", "FailedToCreateCacheDirectory", "FailedToFetchFileFromRemoteSource", "FailedToSaveCachedFile", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$ChecksumValidationFailed;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToCreateCacheDirectory;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToSaveCachedFile;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Error extends IOException {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$ChecksumValidationFailed;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ChecksumValidationFailed extends Error {
            public ChecksumValidationFailed(String message) {
                super(message, null);
                m.e(message, "message");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToCreateCacheDirectory;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "url", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToCreateCacheDirectory extends Error {
            public FailedToCreateCacheDirectory(String url) {
                super("Failed to create cache directory for ".concat(url), null);
                m.e(url, "url");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToFetchFileFromRemoteSource;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToFetchFileFromRemoteSource extends Error {
            public FailedToFetchFileFromRemoteSource(String message) {
                super(message, null);
                m.e(message, "message");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error$FailedToSaveCachedFile;", "Lcom/revenuecat/purchases/storage/DefaultFileRepository$Error;", "message", "", "(Ljava/lang/String;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FailedToSaveCachedFile extends Error {
            public FailedToSaveCachedFile(String message) {
                super(message, null);
                m.e(message, "message");
            }
        }

        private Error(String str) {
            super(str);
        }

        public Error(String str, f fVar) {
            this(str);
        }
    }

    @e(c = "com.revenuecat.purchases.storage.DefaultFileRepository", f = "DefaultFileRepository.kt", l = {131}, m = "downloadFile")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass1(k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultFileRepository.this.downloadFile(null, this);
        }
    }

    @e(c = "com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2", f = "DefaultFileRepository.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lcom/revenuecat/purchases/utils/UrlConnection;", "<anonymous>", "(La40/z;)Lcom/revenuecat/purchases/utils/UrlConnection;"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends i implements n {
        final URL $url;
        int label;

        public AnonymousClass2(URL url, k00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$url = url;
        }

        @Override
        public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
            return DefaultFileRepository.this.new AnonymousClass2(this.$url, cVar);
        }

        @Override
        public final Object invoke(z zVar, k00.c<? super UrlConnection> cVar) {
            return ((AnonymousClass2) create(zVar, cVar)).invokeSuspend(b0.a);
        }

        @Override
        public final Object invokeSuspend(Object obj) throws IOException {
            a aVar = a.A;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            URL url = this.$url;
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Downloading remote file from " + url);
            }
            UrlConnectionFactory urlConnectionFactory = DefaultFileRepository.this.urlConnectionFactory;
            String string = this.$url.toString();
            m.d(string, "url.toString()");
            UrlConnection urlConnectionCreateConnection$default = UrlConnectionFactory.createConnection$default(urlConnectionFactory, string, null, 2, null);
            if (urlConnectionCreateConnection$default.getResponseCode() == 200) {
                return urlConnectionCreateConnection$default;
            }
            urlConnectionCreateConnection$default.disconnect();
            throw new IOException("HTTP " + urlConnectionCreateConnection$default.getResponseCode() + " when downloading file at: " + this.$url);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/f0;", "Ljava/net/URI;", "invoke", "()La40/f0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01202 extends kotlin.jvm.internal.n implements u00.a {
        final Checksum $checksum;
        final URL $url;

        @e(c = "com.revenuecat.purchases.storage.DefaultFileRepository$generateOrGetCachedFileURL$2$1", f = "DefaultFileRepository.kt", l = {118}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Ljava/net/URI;", "<anonymous>", "(La40/z;)Ljava/net/URI;"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends i implements n {
            final Checksum $checksum;
            final URL $url;
            Object L$0;
            int label;
            final DefaultFileRepository this$0;

            public AnonymousClass1(DefaultFileRepository defaultFileRepository, URL url, Checksum checksum, k00.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = defaultFileRepository;
                this.$url = url;
                this.$checksum = checksum;
            }

            @Override
            public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$url, this.$checksum, cVar);
            }

            @Override
            public final Object invoke(z zVar, k00.c<? super URI> cVar) {
                return ((AnonymousClass1) create(zVar, cVar)).invokeSuspend(b0.a);
            }

            @Override
            public final Object invokeSuspend(Object obj) throws Error.FailedToFetchFileFromRemoteSource, Error.FailedToCreateCacheDirectory {
                URI uri;
                a aVar = a.A;
                int i = this.label;
                if (i == 0) {
                    t1.O(obj);
                    URI uriGenerateLocalFilesystemURI = this.this$0.fileCacheManager.generateLocalFilesystemURI(this.$url, this.$checksum);
                    if (uriGenerateLocalFilesystemURI == null) {
                        String string = this.$url.toString();
                        m.d(string, "url.toString()");
                        Error.FailedToCreateCacheDirectory failedToCreateCacheDirectory = new Error.FailedToCreateCacheDirectory(string);
                        this.this$0.logHandler.e("FileRepository", "Failed to create cache directory for " + this.$url, failedToCreateCacheDirectory);
                        throw failedToCreateCacheDirectory;
                    }
                    if (this.this$0.fileCacheManager.cachedContentExists(uriGenerateLocalFilesystemURI)) {
                        return uriGenerateLocalFilesystemURI;
                    }
                    DefaultFileRepository defaultFileRepository = this.this$0;
                    URL url = this.$url;
                    this.L$0 = uriGenerateLocalFilesystemURI;
                    this.label = 1;
                    Object objDownloadFile = defaultFileRepository.downloadFile(url, this);
                    if (objDownloadFile == aVar) {
                        return aVar;
                    }
                    uri = uriGenerateLocalFilesystemURI;
                    obj = objDownloadFile;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uri = (URI) this.L$0;
                    t1.O(obj);
                }
                this.this$0.saveCachedFile(uri, (UrlConnection) obj, this.$checksum);
                return uri;
            }
        }

        public C01202(URL url, Checksum checksum) {
            super(0);
            this.$url = url;
            this.$checksum = checksum;
        }

        @Override
        public final f0 invoke() {
            return c0.g(DefaultFileRepository.this.ioScope, null, new AnonymousClass1(DefaultFileRepository.this, this.$url, this.$checksum, null), 3);
        }
    }

    @e(c = "com.revenuecat.purchases.storage.DefaultFileRepository$prefetch$1", f = "DefaultFileRepository.kt", l = {94}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C01211 extends i implements n {
        final List<k> $urls;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final DefaultFileRepository this$0;

        public C01211(List<k> list, DefaultFileRepository defaultFileRepository, k00.c<? super C01211> cVar) {
            super(2, cVar);
            this.$urls = list;
            this.this$0 = defaultFileRepository;
        }

        @Override
        public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
            return new C01211(this.$urls, this.this$0, cVar);
        }

        @Override
        public final Object invoke(z zVar, k00.c<? super b0> cVar) {
            return ((C01211) create(zVar, cVar)).invokeSuspend(b0.a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            DefaultFileRepository defaultFileRepository;
            URL url;
            a aVar = a.A;
            int i = this.label;
            if (i == 0) {
                t1.O(obj);
                List<k> list = this.$urls;
                DefaultFileRepository defaultFileRepository2 = this.this$0;
                it = list.iterator();
                defaultFileRepository = defaultFileRepository2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (URL) this.L$2;
                it = (Iterator) this.L$1;
                defaultFileRepository = (DefaultFileRepository) this.L$0;
                try {
                    t1.O(obj);
                } catch (IOException e) {
                    defaultFileRepository.logHandler.e("FileRepository", "Prefetch failed for " + url + ": " + e, e);
                }
            }
            while (it.hasNext()) {
                k kVar = (k) it.next();
                url = (URL) kVar.A;
                Checksum checksum = (Checksum) kVar.B;
                this.L$0 = defaultFileRepository;
                this.L$1 = it;
                this.L$2 = url;
                this.label = 1;
                if (defaultFileRepository.generateOrGetCachedFileURL(url, checksum, this) == aVar) {
                    return aVar;
                }
            }
            return b0.a;
        }
    }

    public DefaultFileRepository(Context context) {
        this(null, new DefaultFileCache(context), null, null, null, 29, null);
        m.e(context, "context");
    }

    public DefaultFileRepository(KeyedDeferredValueStore<CacheKey, URI> store, LocalFileCache fileCacheManager, z ioScope, LogHandler logHandler, UrlConnectionFactory urlConnectionFactory) {
        m.e(store, "store");
        m.e(fileCacheManager, "fileCacheManager");
        m.e(ioScope, "ioScope");
        m.e(logHandler, "logHandler");
        m.e(urlConnectionFactory, "urlConnectionFactory");
        this.store = store;
        this.fileCacheManager = fileCacheManager;
        this.ioScope = ioScope;
        this.logHandler = logHandler;
        this.urlConnectionFactory = urlConnectionFactory;
    }

    public DefaultFileRepository(KeyedDeferredValueStore keyedDeferredValueStore, LocalFileCache localFileCache, z zVar, LogHandler logHandler, UrlConnectionFactory urlConnectionFactory, int i, f fVar) {
        KeyedDeferredValueStore keyedDeferredValueStore2 = (i & 1) != 0 ? new KeyedDeferredValueStore(null, 1, null) : keyedDeferredValueStore;
        if ((i & 4) != 0) {
            h40.e eVar = m0.a;
            d dVar = d.C;
            q1 q1Var = q1.B;
            dVar.getClass();
            zVar = c0.c(rd.a.P(dVar, q1Var));
        }
        this(keyedDeferredValueStore2, localFileCache, zVar, (i & 8) != 0 ? LogWrapperKt.getCurrentLogHandler() : logHandler, (i & 16) != 0 ? new DefaultUrlConnectionFactory() : urlConnectionFactory);
    }

    public final Object downloadFile(URL url, k00.c<? super UrlConnection> cVar) throws Error.FailedToFetchFileFromRemoteSource {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objJ = anonymousClass1.result;
        a aVar = a.A;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                t1.O(objJ);
                h40.e eVar = m0.a;
                d dVar = d.C;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(url, null);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = url;
                anonymousClass1.label = 1;
                objJ = c0.J(anonymousClass2, dVar, anonymousClass1);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                url = (URL) anonymousClass1.L$1;
                this = (DefaultFileRepository) anonymousClass1.L$0;
                t1.O(objJ);
            }
            return (UrlConnection) objJ;
        } catch (IOException e) {
            String str = "Failed to fetch file from remote source: " + url + ". Error: " + e.getLocalizedMessage();
            this.logHandler.e("FileRepository", str, e);
            throw new Error.FailedToFetchFileFromRemoteSource(str);
        }
    }

    public final void saveCachedFile(URI uri, UrlConnection connectionWithStream, Checksum checksum) {
        try {
            try {
                InputStream inputStream = connectionWithStream.getInputStream();
                try {
                    this.fileCacheManager.saveData(inputStream, uri, checksum);
                    ta.c0.C(inputStream, (Throwable) null);
                    connectionWithStream.disconnect();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ta.c0.C(inputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                connectionWithStream.disconnect();
                throw th3;
            }
        } catch (Checksum.ChecksumValidationException e) {
            String str = "Checksum validation failed for " + uri + ": " + e.getMessage();
            this.logHandler.e("FileRepository", str, e);
            throw new Error.ChecksumValidationFailed(str);
        } catch (IOException e2) {
            String str2 = "Failed to save cached file: " + uri + ". Error: " + e2.getLocalizedMessage();
            this.logHandler.e("FileRepository", str2, e2);
            throw new Error.FailedToSaveCachedFile(str2);
        }
    }

    @Override
    public Object generateOrGetCachedFileURL(URL url, Checksum checksum, k00.c<? super URI> cVar) {
        return this.store.getOrPut(new CacheKey(url, checksum), new C01202(url, checksum)).G(cVar);
    }

    @Override
    public URI getFile(URL url, Checksum checksum) {
        m.e(url, "url");
        URI uriGenerateLocalFilesystemURI = this.fileCacheManager.generateLocalFilesystemURI(url, checksum);
        if (uriGenerateLocalFilesystemURI == null || !this.fileCacheManager.cachedContentExists(uriGenerateLocalFilesystemURI)) {
            return null;
        }
        return uriGenerateLocalFilesystemURI;
    }

    public final KeyedDeferredValueStore<CacheKey, URI> getStore$purchases_defaultsBc8Release() {
        return this.store;
    }

    @Override
    public void prefetch(List<k> urls) {
        m.e(urls, "urls");
        c0.y(this.ioScope, null, null, new C01211(urls, this, null), 3);
    }
}
