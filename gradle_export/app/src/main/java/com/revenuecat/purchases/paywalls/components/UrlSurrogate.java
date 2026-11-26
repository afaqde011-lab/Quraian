package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "url_lid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getUrl_lid-z7Tp-4o", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class UrlSurrogate {

    public static final Companion INSTANCE = new Companion(null);
    private final ButtonComponent.UrlMethod method;
    private final String url_lid;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return UrlSurrogate$$serializer.INSTANCE;
        }
    }

    private UrlSurrogate(int i, String str, ButtonComponent.UrlMethod urlMethod, x0 x0Var) {
        if (3 != (i & 3)) {
            o0.g(i, 3, UrlSurrogate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url_lid = str;
        this.method = urlMethod;
    }

    @c
    public UrlSurrogate(int i, String str, ButtonComponent.UrlMethod urlMethod, x0 x0Var, f fVar) {
        this(i, str, urlMethod, x0Var);
    }

    private UrlSurrogate(String url_lid, ButtonComponent.UrlMethod method) {
        m.e(url_lid, "url_lid");
        m.e(method, "method");
        this.url_lid = url_lid;
        this.method = method;
    }

    public UrlSurrogate(String str, ButtonComponent.UrlMethod urlMethod, f fVar) {
        this(str, urlMethod);
    }

    public static final void write$Self$purchases_defaultsBc8Release(UrlSurrogate self, b output, e serialDesc) {
        output.C(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m231boximpl(self.url_lid));
        output.C(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.method);
    }

    public final ButtonComponent.UrlMethod getMethod() {
        return this.method;
    }

    public final String getUrl_lid() {
        return this.url_lid;
    }
}
