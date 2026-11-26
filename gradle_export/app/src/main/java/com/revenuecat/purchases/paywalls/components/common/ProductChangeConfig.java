package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.paywalls.components.common.serializers.DowngradeReplacementModeDeserializer;
import com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import p40.x0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "upgradeReplacementMode", "downgradeReplacementMode", "<init>", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;Lcom/revenuecat/purchases/models/GoogleReplacementMode;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/models/GoogleReplacementMode;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getUpgradeReplacementMode", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getUpgradeReplacementMode$annotations", "()V", "getDowngradeReplacementMode", "getDowngradeReplacementMode$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProductChangeConfig {

    public static final Companion INSTANCE = new Companion(null);
    private final GoogleReplacementMode downgradeReplacementMode;
    private final GoogleReplacementMode upgradeReplacementMode;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ProductChangeConfig$$serializer.INSTANCE;
        }
    }

    public ProductChangeConfig() {
        this((GoogleReplacementMode) null, (GoogleReplacementMode) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
    }

    @c
    public ProductChangeConfig(int i, GoogleReplacementMode googleReplacementMode, GoogleReplacementMode googleReplacementMode2, x0 x0Var) {
        this.upgradeReplacementMode = (i & 1) == 0 ? GoogleReplacementMode.CHARGE_PRORATED_PRICE : googleReplacementMode;
        if ((i & 2) == 0) {
            this.downgradeReplacementMode = GoogleReplacementMode.DEFERRED;
        } else {
            this.downgradeReplacementMode = googleReplacementMode2;
        }
    }

    public ProductChangeConfig(GoogleReplacementMode upgradeReplacementMode, GoogleReplacementMode downgradeReplacementMode) {
        m.e(upgradeReplacementMode, "upgradeReplacementMode");
        m.e(downgradeReplacementMode, "downgradeReplacementMode");
        this.upgradeReplacementMode = upgradeReplacementMode;
        this.downgradeReplacementMode = downgradeReplacementMode;
    }

    public ProductChangeConfig(GoogleReplacementMode googleReplacementMode, GoogleReplacementMode googleReplacementMode2, int i, f fVar) {
        this((i & 1) != 0 ? GoogleReplacementMode.CHARGE_PRORATED_PRICE : googleReplacementMode, (i & 2) != 0 ? GoogleReplacementMode.DEFERRED : googleReplacementMode2);
    }

    public static void getDowngradeReplacementMode$annotations() {
    }

    public static void getUpgradeReplacementMode$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(ProductChangeConfig self, b output, e serialDesc) {
        if (output.k(serialDesc) || self.upgradeReplacementMode != GoogleReplacementMode.CHARGE_PRORATED_PRICE) {
            output.C(serialDesc, 0, UpgradeReplacementModeDeserializer.INSTANCE, self.upgradeReplacementMode);
        }
        if (!output.k(serialDesc) && self.downgradeReplacementMode == GoogleReplacementMode.DEFERRED) {
            return;
        }
        output.C(serialDesc, 1, DowngradeReplacementModeDeserializer.INSTANCE, self.downgradeReplacementMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductChangeConfig)) {
            return false;
        }
        ProductChangeConfig productChangeConfig = (ProductChangeConfig) obj;
        return this.upgradeReplacementMode == productChangeConfig.upgradeReplacementMode && this.downgradeReplacementMode == productChangeConfig.downgradeReplacementMode;
    }

    public final GoogleReplacementMode getDowngradeReplacementMode() {
        return this.downgradeReplacementMode;
    }

    public final GoogleReplacementMode getUpgradeReplacementMode() {
        return this.upgradeReplacementMode;
    }

    public int hashCode() {
        return this.downgradeReplacementMode.hashCode() + (this.upgradeReplacementMode.hashCode() * 31);
    }

    public String toString() {
        return "ProductChangeConfig(upgradeReplacementMode=" + this.upgradeReplacementMode + ", downgradeReplacementMode=" + this.downgradeReplacementMode + ')';
    }
}
