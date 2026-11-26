package com.revenuecat.purchases;

import g00.b0;
import java.util.Locale;
import k00.f;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public class CoroutinesExtensionsKt$awaitStorefrontLocale$2$1 extends j implements k {
    public CoroutinesExtensionsKt$awaitStorefrontLocale$2$1(Object obj) {
        super(1, 1, f.class, obj, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V");
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Locale) obj);
        return b0.a;
    }

    public final void invoke(Locale p0) {
        m.e(p0, "p0");
        ((k00.c) this.receiver).resumeWith(p0);
    }
}
