package com.revenuecat.purchases.customercenter;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import l40.a;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "customerCenter", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;Lo40/b;Ln40/e;)V", "write$Self", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "getCustomerCenter", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "getCustomerCenter$annotations", "()V", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterRoot {

    public static final Companion INSTANCE = new Companion(null);
    private final CustomerCenterConfigData customerCenter;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return CustomerCenterRoot$$serializer.INSTANCE;
        }
    }

    @c
    public CustomerCenterRoot(int i, CustomerCenterConfigData customerCenterConfigData, x0 x0Var) {
        if (1 == (i & 1)) {
            this.customerCenter = customerCenterConfigData;
        } else {
            o0.g(i, 1, CustomerCenterRoot$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public CustomerCenterRoot(CustomerCenterConfigData customerCenter) {
        m.e(customerCenter, "customerCenter");
        this.customerCenter = customerCenter;
    }

    public static void getCustomerCenter$annotations() {
    }

    public final CustomerCenterConfigData getCustomerCenter() {
        return this.customerCenter;
    }
}
