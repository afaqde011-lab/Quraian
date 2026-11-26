package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig;
import com.revenuecat.purchases.paywalls.components.common.ResilientPromoOfferConfigSerializer;
import h00.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import oi.k;
import p40.c;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 42\u00020\u0001:\u000254BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b\u0005\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "packageId", "", "isSelectedByDefault", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;", "playStoreOffer", "visible", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialPackageComponent;", "overrides", "<init>", "(Ljava/lang/String;ZLcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;Ljava/lang/Boolean;Ljava/util/List;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PackageComponent;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "getPackageId$annotations", "()V", "Z", "()Z", "isSelectedByDefault$annotations", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;", "getPlayStoreOffer", "()Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;", "getPlayStoreOffer$annotations", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PackageComponent implements PaywallComponent {
    private final boolean isSelectedByDefault;
    private final List<ComponentOverride<PartialPackageComponent>> overrides;
    private final String packageId;
    private final PromoOfferConfig playStoreOffer;
    private final StackComponent stack;
    private final Boolean visible;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, null, null, null, new c(ComponentOverride.INSTANCE.serializer(PartialPackageComponent$$serializer.INSTANCE))};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PackageComponent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return PackageComponent$$serializer.INSTANCE;
        }
    }

    @g00.c
    public PackageComponent(int i, String str, boolean z, StackComponent stackComponent, PromoOfferConfig promoOfferConfig, Boolean bool, List list, x0 x0Var) {
        if (7 != (i & 7)) {
            o0.g(i, 7, PackageComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.packageId = str;
        this.isSelectedByDefault = z;
        this.stack = stackComponent;
        if ((i & 8) == 0) {
            this.playStoreOffer = null;
        } else {
            this.playStoreOffer = promoOfferConfig;
        }
        if ((i & 16) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 32) == 0) {
            this.overrides = x.A;
        } else {
            this.overrides = list;
        }
    }

    public PackageComponent(String packageId, boolean z, StackComponent stack, PromoOfferConfig promoOfferConfig, Boolean bool, List<ComponentOverride<PartialPackageComponent>> overrides) {
        m.e(packageId, "packageId");
        m.e(stack, "stack");
        m.e(overrides, "overrides");
        this.packageId = packageId;
        this.isSelectedByDefault = z;
        this.stack = stack;
        this.playStoreOffer = promoOfferConfig;
        this.visible = bool;
        this.overrides = overrides;
    }

    public PackageComponent(String str, boolean z, StackComponent stackComponent, PromoOfferConfig promoOfferConfig, Boolean bool, List list, int i, f fVar) {
        this(str, z, stackComponent, (i & 8) != 0 ? null : promoOfferConfig, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? x.A : list);
    }

    public static void getPackageId$annotations() {
    }

    public static void getPlayStoreOffer$annotations() {
    }

    public static void isSelectedByDefault$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(PackageComponent self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        output.i(serialDesc, 0, self.packageId);
        output.u(serialDesc, 1, self.isSelectedByDefault);
        output.C(serialDesc, 2, StackComponent$$serializer.INSTANCE, self.stack);
        if (output.k(serialDesc) || self.playStoreOffer != null) {
            output.x(serialDesc, 3, ResilientPromoOfferConfigSerializer.INSTANCE, self.playStoreOffer);
        }
        if (output.k(serialDesc) || self.visible != null) {
            output.x(serialDesc, 4, p40.f.a, self.visible);
        }
        if (!output.k(serialDesc) && m.a(self.overrides, x.A)) {
            return;
        }
        output.C(serialDesc, 5, aVarArr[5], self.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageComponent)) {
            return false;
        }
        PackageComponent packageComponent = (PackageComponent) obj;
        return m.a(this.packageId, packageComponent.packageId) && this.isSelectedByDefault == packageComponent.isSelectedByDefault && m.a(this.stack, packageComponent.stack) && m.a(this.playStoreOffer, packageComponent.playStoreOffer) && m.a(this.visible, packageComponent.visible) && m.a(this.overrides, packageComponent.overrides);
    }

    public final List getOverrides() {
        return this.overrides;
    }

    public final String getPackageId() {
        return this.packageId;
    }

    public final PromoOfferConfig getPlayStoreOffer() {
        return this.playStoreOffer;
    }

    public final StackComponent getStack() {
        return this.stack;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = (this.stack.hashCode() + w.c.e(this.packageId.hashCode() * 31, 31, this.isSelectedByDefault)) * 31;
        PromoOfferConfig promoOfferConfig = this.playStoreOffer;
        int iHashCode2 = (iHashCode + (promoOfferConfig == null ? 0 : promoOfferConfig.hashCode())) * 31;
        Boolean bool = this.visible;
        return this.overrides.hashCode() + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final boolean getIsSelectedByDefault() {
        return this.isSelectedByDefault;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PackageComponent(packageId=");
        sb.append(this.packageId);
        sb.append(", isSelectedByDefault=");
        sb.append(this.isSelectedByDefault);
        sb.append(", stack=");
        sb.append(this.stack);
        sb.append(", playStoreOffer=");
        sb.append(this.playStoreOffer);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", overrides=");
        return k.n(sb, this.overrides, ')');
    }
}
