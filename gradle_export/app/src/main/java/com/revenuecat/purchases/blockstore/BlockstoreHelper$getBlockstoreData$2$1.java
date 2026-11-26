package com.revenuecat.purchases.blockstore;

import g00.b0;
import java.util.Collections;
import java.util.Map;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import ne.d;
import ne.e;
import u00.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne/e;", "kotlin.jvm.PlatformType", "it", "Lg00/b0;", "invoke", "(Lne/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BlockstoreHelper$getBlockstoreData$2$1 extends n implements k {
    final c<Map<String, ? extends d>> $cont;

    public BlockstoreHelper$getBlockstoreData$2$1(c<? super Map<String, ? extends d>> cVar) {
        super(1);
        this.$cont = cVar;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((e) obj);
        return b0.a;
    }

    public final void invoke(e eVar) {
        this.$cont.resumeWith(Collections.unmodifiableMap(eVar.C));
    }
}
