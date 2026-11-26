package com.revenuecat.purchases.blockstore;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lg00/b0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BlockstoreHelper$storeUserIdIfNeeded$6$1 extends n implements k {
    final c<b0> $cont;
    final String $userId;

    public BlockstoreHelper$storeUserIdIfNeeded$6$1(c<? super b0> cVar, String str) {
        super(1);
        this.$cont = cVar;
        this.$userId = str;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Integer) obj);
        return b0.a;
    }

    public final void invoke(Integer num) {
        String str = this.$userId;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Block store: User ID: " + str + " stored in Block store.");
        }
        this.$cont.resumeWith(b0.a);
    }
}
