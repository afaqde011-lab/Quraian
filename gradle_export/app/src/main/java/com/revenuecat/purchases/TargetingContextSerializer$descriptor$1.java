package com.revenuecat.purchases;

import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p40.b1;
import p40.e0;
import u00.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln40/a;", "Lg00/b0;", "invoke", "(Ln40/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class TargetingContextSerializer$descriptor$1 extends n implements k {
    public static final TargetingContextSerializer$descriptor$1 INSTANCE = new TargetingContextSerializer$descriptor$1();

    public TargetingContextSerializer$descriptor$1() {
        super(1);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((n40.a) obj);
        return b0.a;
    }

    public final void invoke(n40.a buildClassSerialDescriptor) {
        m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("revision", e0.b);
        buildClassSerialDescriptor.a("ruleId", b1.b);
    }
}
