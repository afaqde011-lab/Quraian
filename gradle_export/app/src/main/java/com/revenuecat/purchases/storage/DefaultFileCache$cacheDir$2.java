package com.revenuecat.purchases.storage;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DefaultFileCache$cacheDir$2 extends n implements a {
    final DefaultFileCache this$0;

    public DefaultFileCache$cacheDir$2(DefaultFileCache defaultFileCache) {
        super(0);
        this.this$0 = defaultFileCache;
    }

    @Override
    public final File invoke() {
        File file = new File(this.this$0.context.getCacheDir(), "rc_files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
