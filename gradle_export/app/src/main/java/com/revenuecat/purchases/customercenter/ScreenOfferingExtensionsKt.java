package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import g00.b0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "Lcom/revenuecat/purchases/Purchases;", "purchases", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lg00/b0;", "onError", "Lcom/revenuecat/purchases/Offering;", "onSuccess", "resolveOffering", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/Purchases;Lu00/k;Lu00/k;)V", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScreenOfferingExtensionsKt {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError it) {
            m.e(it, "it");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements k {
        final k $onSuccess;
        final CustomerCenterConfigData.ScreenOffering $screenOffering;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.values().length];
                try {
                    iArr[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.CURRENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.SPECIFIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass2(CustomerCenterConfigData.ScreenOffering screenOffering, k kVar) {
            super(1);
            this.$screenOffering = screenOffering;
            this.$onSuccess = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Offerings) obj);
            return b0.a;
        }

        public final void invoke(Offerings offerings) {
            Offering current;
            m.e(offerings, "offerings");
            int i = WhenMappings.$EnumSwitchMapping$0[this.$screenOffering.getType().ordinal()];
            if (i == 1) {
                current = offerings.getCurrent();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                String offeringId = this.$screenOffering.getOfferingId();
                current = offeringId != null ? offerings.getAll().get(offeringId) : null;
            }
            this.$onSuccess.invoke(current);
        }
    }

    public static final void resolveOffering(CustomerCenterConfigData.Screen screen, Purchases purchases, k onError, k onSuccess) {
        m.e(screen, "<this>");
        m.e(purchases, "purchases");
        m.e(onError, "onError");
        m.e(onSuccess, "onSuccess");
        CustomerCenterConfigData.ScreenOffering offering = screen.getOffering();
        if (offering == null) {
            onSuccess.invoke(null);
        } else {
            ListenerConversionsCommonKt.getOfferingsWith(purchases, onError, new AnonymousClass2(offering, onSuccess));
        }
    }

    public static void resolveOffering$default(CustomerCenterConfigData.Screen screen, Purchases purchases, k kVar, k kVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            kVar = AnonymousClass1.INSTANCE;
        }
        resolveOffering(screen, purchases, kVar, kVar2);
    }
}
