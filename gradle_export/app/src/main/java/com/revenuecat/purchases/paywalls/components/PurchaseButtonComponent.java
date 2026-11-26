package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import g00.c;
import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l40.a;
import n40.e;
import o40.b;
import p40.b1;
import p40.o0;
import p40.v;
import p40.x0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0005\"#!$%B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "action", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "method", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "getAction", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "getMethod", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "Companion", "$serializer", "Action", "CustomUrl", "Method", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseButtonComponent implements PaywallComponent {

    public static final Companion INSTANCE = new Companion(null);
    private final Action action;
    private final Method method;
    private final StackComponent stack;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "", "(Ljava/lang/String;I)V", "toMethod", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "IN_APP_CHECKOUT", "WEB_CHECKOUT", "WEB_PRODUCT_SELECTION", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Action {
        IN_APP_CHECKOUT,
        WEB_CHECKOUT,
        WEB_PRODUCT_SELECTION;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return ActionDeserializer.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Action.values().length];
                try {
                    iArr[Action.IN_APP_CHECKOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Action.WEB_CHECKOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Action.WEB_PRODUCT_SELECTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final Method toMethod() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return Method.InAppCheckout.INSTANCE;
            }
            int i2 = 3;
            Boolean bool = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (i == 2) {
                return new Method.WebCheckout((Boolean) (objArr3 == true ? 1 : 0), (ButtonComponent.UrlMethod) (objArr2 == true ? 1 : 0), i2, (f) (objArr == true ? 1 : 0));
            }
            if (i == 3) {
                return new Method.WebProductSelection(bool, (ButtonComponent.UrlMethod) (objArr5 == true ? 1 : 0), i2, (f) (objArr4 == true ? 1 : 0));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PurchaseButtonComponent$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "", "packageParam", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp40/x0;Lkotlin/jvm/internal/f;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Lo40/b;Ln40/e;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "copy-26kQY28", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "getUrlLid-z7Tp-4o$annotations", "()V", "getPackageParam", "getPackageParam$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomUrl {

        public static final Companion INSTANCE = new Companion(null);
        private final String packageParam;
        private final String urlLid;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE;
            }
        }

        private CustomUrl(int i, String str, String str2, x0 x0Var) {
            if (1 != (i & 1)) {
                o0.g(i, 1, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.urlLid = str;
            if ((i & 2) == 0) {
                this.packageParam = null;
            } else {
                this.packageParam = str2;
            }
        }

        @c
        public CustomUrl(int i, String str, String str2, x0 x0Var, f fVar) {
            this(i, str, str2, x0Var);
        }

        private CustomUrl(String urlLid, String str) {
            m.e(urlLid, "urlLid");
            this.urlLid = urlLid;
            this.packageParam = str;
        }

        public CustomUrl(String str, String str2, int i, f fVar) {
            this(str, (i & 2) != 0 ? null : str2, null);
        }

        public CustomUrl(String str, String str2, f fVar) {
            this(str, str2);
        }

        public static CustomUrl m183copy26kQY28$default(CustomUrl customUrl, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customUrl.urlLid;
            }
            if ((i & 2) != 0) {
                str2 = customUrl.packageParam;
            }
            return customUrl.m186copy26kQY28(str, str2);
        }

        public static void getPackageParam$annotations() {
        }

        public static void m184getUrlLidz7Tp4o$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(CustomUrl self, b output, e serialDesc) {
            output.C(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m231boximpl(self.urlLid));
            if (!output.k(serialDesc) && self.packageParam == null) {
                return;
            }
            output.x(serialDesc, 1, b1.a, self.packageParam);
        }

        public final String getUrlLid() {
            return this.urlLid;
        }

        public final String getPackageParam() {
            return this.packageParam;
        }

        public final CustomUrl m186copy26kQY28(String urlLid, String packageParam) {
            m.e(urlLid, "urlLid");
            return new CustomUrl(urlLid, packageParam, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomUrl)) {
                return false;
            }
            CustomUrl customUrl = (CustomUrl) other;
            return LocalizationKey.m234equalsimpl0(this.urlLid, customUrl.urlLid) && m.a(this.packageParam, customUrl.packageParam);
        }

        public final String getPackageParam() {
            return this.packageParam;
        }

        public final String m187getUrlLidz7Tp4o() {
            return this.urlLid;
        }

        public int hashCode() {
            int iM235hashCodeimpl = LocalizationKey.m235hashCodeimpl(this.urlLid) * 31;
            String str = this.packageParam;
            return iM235hashCodeimpl + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CustomUrl(urlLid=");
            sb.append((Object) LocalizationKey.m236toStringimpl(this.urlLid));
            sb.append(", packageParam=");
            return g4.c.k(sb, this.packageParam, ')');
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "Companion", "CustomWebCheckout", "InAppCheckout", "Unknown", "WebCheckout", "WebProductSelection", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$InAppCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Method {

        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final a serializer() {
                return PurchaseButtonMethodDeserializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001d¨\u00065"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "customUrl", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "getCustomUrl", "getCustomUrl$annotations", "()V", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CustomWebCheckout implements Method {

            public static final Companion INSTANCE = new Companion(null);
            private final Boolean autoDismiss;
            private final CustomUrl customUrl;
            private final ButtonComponent.UrlMethod openMethod;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE;
                }
            }

            @c
            public CustomWebCheckout(int i, CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, x0 x0Var) {
                if (1 != (i & 1)) {
                    o0.g(i, 1, PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.customUrl = customUrl;
                if ((i & 2) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i & 4) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public CustomWebCheckout(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                m.e(customUrl, "customUrl");
                this.customUrl = customUrl;
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public CustomWebCheckout(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, f fVar) {
                this(customUrl, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : urlMethod);
            }

            public static CustomWebCheckout copy$default(CustomWebCheckout customWebCheckout, CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    customUrl = customWebCheckout.customUrl;
                }
                if ((i & 2) != 0) {
                    bool = customWebCheckout.autoDismiss;
                }
                if ((i & 4) != 0) {
                    urlMethod = customWebCheckout.openMethod;
                }
                return customWebCheckout.copy(customUrl, bool, urlMethod);
            }

            public static void getAutoDismiss$annotations() {
            }

            public static void getCustomUrl$annotations() {
            }

            public static void getOpenMethod$annotations() {
            }

            public static final void write$Self$purchases_defaultsBc8Release(CustomWebCheckout self, b output, e serialDesc) {
                output.C(serialDesc, 0, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE, self.customUrl);
                if (output.k(serialDesc) || self.autoDismiss != null) {
                    output.x(serialDesc, 1, p40.f.a, self.autoDismiss);
                }
                if (!output.k(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.x(serialDesc, 2, UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            public final CustomUrl getCustomUrl() {
                return this.customUrl;
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final CustomWebCheckout copy(CustomUrl customUrl, Boolean autoDismiss, ButtonComponent.UrlMethod openMethod) {
                m.e(customUrl, "customUrl");
                return new CustomWebCheckout(customUrl, autoDismiss, openMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomWebCheckout)) {
                    return false;
                }
                CustomWebCheckout customWebCheckout = (CustomWebCheckout) other;
                return m.a(this.customUrl, customWebCheckout.customUrl) && m.a(this.autoDismiss, customWebCheckout.autoDismiss) && this.openMethod == customWebCheckout.openMethod;
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final CustomUrl getCustomUrl() {
                return this.customUrl;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                int iHashCode = this.customUrl.hashCode() * 31;
                Boolean bool = this.autoDismiss;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode2 + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "CustomWebCheckout(customUrl=" + this.customUrl + ", autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$InAppCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InAppCheckout implements Method {
            public static final InAppCheckout INSTANCE = new InAppCheckout();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout", InAppCheckout.INSTANCE, new Annotation[0]);
                }
            }

            private InAppCheckout() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "<init>", "()V", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unknown implements Method {
            public static final Unknown INSTANCE = new Unknown();
            private static final h $cachedSerializer$delegate = rd.a.I(i.B, AnonymousClass1.INSTANCE);

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return new v("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final a get$cachedSerializer() {
                return (a) $cachedSerializer$delegate.getValue();
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class WebCheckout implements Method {

            public static final Companion INSTANCE = new Companion(null);
            private final Boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return PurchaseButtonComponent$Method$WebCheckout$$serializer.INSTANCE;
                }
            }

            public WebCheckout() {
                this((Boolean) null, (ButtonComponent.UrlMethod) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
            }

            @c
            public WebCheckout(int i, Boolean bool, ButtonComponent.UrlMethod urlMethod, x0 x0Var) {
                if ((i & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebCheckout(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public WebCheckout(Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, f fVar) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : urlMethod);
            }

            public static WebCheckout copy$default(WebCheckout webCheckout, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = webCheckout.autoDismiss;
                }
                if ((i & 2) != 0) {
                    urlMethod = webCheckout.openMethod;
                }
                return webCheckout.copy(bool, urlMethod);
            }

            public static void getAutoDismiss$annotations() {
            }

            public static void getOpenMethod$annotations() {
            }

            public static final void write$Self$purchases_defaultsBc8Release(WebCheckout self, b output, e serialDesc) {
                if (output.k(serialDesc) || self.autoDismiss != null) {
                    output.x(serialDesc, 0, p40.f.a, self.autoDismiss);
                }
                if (!output.k(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.x(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final WebCheckout copy(Boolean autoDismiss, ButtonComponent.UrlMethod openMethod) {
                return new WebCheckout(autoDismiss, openMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WebCheckout)) {
                    return false;
                }
                WebCheckout webCheckout = (WebCheckout) other;
                return m.a(this.autoDismiss, webCheckout.autoDismiss) && this.openMethod == webCheckout.openMethod;
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                Boolean bool = this.autoDismiss;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "WebCheckout(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class WebProductSelection implements Method {

            public static final Companion INSTANCE = new Companion(null);
            private final Boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public Companion(f fVar) {
                    this();
                }

                public final a serializer() {
                    return PurchaseButtonComponent$Method$WebProductSelection$$serializer.INSTANCE;
                }
            }

            public WebProductSelection() {
                this((Boolean) null, (ButtonComponent.UrlMethod) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
            }

            @c
            public WebProductSelection(int i, Boolean bool, ButtonComponent.UrlMethod urlMethod, x0 x0Var) {
                if ((i & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebProductSelection(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public WebProductSelection(Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, f fVar) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : urlMethod);
            }

            public static WebProductSelection copy$default(WebProductSelection webProductSelection, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = webProductSelection.autoDismiss;
                }
                if ((i & 2) != 0) {
                    urlMethod = webProductSelection.openMethod;
                }
                return webProductSelection.copy(bool, urlMethod);
            }

            public static void getAutoDismiss$annotations() {
            }

            public static void getOpenMethod$annotations() {
            }

            public static final void write$Self$purchases_defaultsBc8Release(WebProductSelection self, b output, e serialDesc) {
                if (output.k(serialDesc) || self.autoDismiss != null) {
                    output.x(serialDesc, 0, p40.f.a, self.autoDismiss);
                }
                if (!output.k(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.x(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final WebProductSelection copy(Boolean autoDismiss, ButtonComponent.UrlMethod openMethod) {
                return new WebProductSelection(autoDismiss, openMethod);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WebProductSelection)) {
                    return false;
                }
                WebProductSelection webProductSelection = (WebProductSelection) other;
                return m.a(this.autoDismiss, webProductSelection.autoDismiss) && this.openMethod == webProductSelection.openMethod;
            }

            public final Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                Boolean bool = this.autoDismiss;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "WebProductSelection(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }
        }
    }

    @c
    public PurchaseButtonComponent(int i, StackComponent stackComponent, Action action, Method method, x0 x0Var) {
        if (1 != (i & 1)) {
            o0.g(i, 1, PurchaseButtonComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stack = stackComponent;
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i & 4) == 0) {
            this.method = null;
        } else {
            this.method = method;
        }
    }

    public PurchaseButtonComponent(StackComponent stack, Action action, Method method) {
        m.e(stack, "stack");
        this.stack = stack;
        this.action = action;
        this.method = method;
    }

    public PurchaseButtonComponent(StackComponent stackComponent, Action action, Method method, int i, f fVar) {
        this(stackComponent, (i & 2) != 0 ? null : action, (i & 4) != 0 ? null : method);
    }

    public static final void write$Self$purchases_defaultsBc8Release(PurchaseButtonComponent self, b output, e serialDesc) {
        output.C(serialDesc, 0, StackComponent$$serializer.INSTANCE, self.stack);
        if (output.k(serialDesc) || self.action != null) {
            output.x(serialDesc, 1, ActionDeserializer.INSTANCE, self.action);
        }
        if (!output.k(serialDesc) && self.method == null) {
            return;
        }
        output.x(serialDesc, 2, PurchaseButtonMethodDeserializer.INSTANCE, self.method);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseButtonComponent)) {
            return false;
        }
        PurchaseButtonComponent purchaseButtonComponent = (PurchaseButtonComponent) obj;
        return m.a(this.stack, purchaseButtonComponent.stack) && this.action == purchaseButtonComponent.action && m.a(this.method, purchaseButtonComponent.method);
    }

    public final Action getAction() {
        return this.action;
    }

    public final Method getMethod() {
        return this.method;
    }

    public final StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        int iHashCode = this.stack.hashCode() * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Method method = this.method;
        return iHashCode2 + (method != null ? method.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseButtonComponent(stack=" + this.stack + ", action=" + this.action + ", method=" + this.method + ')';
    }
}
