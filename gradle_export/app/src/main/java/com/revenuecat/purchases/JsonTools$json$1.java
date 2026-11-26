package com.revenuecat.purchases;

import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import q40.h;
import u00.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq40/h;", "Lg00/b0;", "invoke", "(Lq40/h;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class JsonTools$json$1 extends n implements k {
    public static final JsonTools$json$1 INSTANCE = new JsonTools$json$1();

    public JsonTools$json$1() {
        super(1);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((h) obj);
        return b0.a;
    }

    public final void invoke(h Json) {
        m.e(Json, "$this$Json");
        Json.b = true;
        Json.a = false;
    }
}
