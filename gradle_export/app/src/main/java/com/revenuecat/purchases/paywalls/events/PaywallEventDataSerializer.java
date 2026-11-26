package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import l40.a;
import n40.e;
import o40.b;
import o40.c;
import o40.d;
import p40.b1;
import p40.e0;
import p40.f;
import q40.j;
import q40.l;
import q40.x;
import ri.t1;
import ta.c0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "PAYWALL_IDENTIFIER_INDEX", "I", "PRESENTED_OFFERING_CONTEXT_INDEX", "PAYWALL_REVISION_INDEX", "SESSION_IDENTIFIER_INDEX", "DISPLAY_MODE_INDEX", "LOCALE_IDENTIFIER_INDEX", "DARK_MODE_INDEX", "EXIT_OFFER_TYPE_INDEX", "EXIT_OFFERING_IDENTIFIER_INDEX", "PACKAGE_IDENTIFIER_INDEX", "PRODUCT_IDENTIFIER_INDEX", "ERROR_CODE_INDEX", "ERROR_MESSAGE_INDEX", "", "nullableStringSerializer", "Ll40/a;", "nullableIntSerializer", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "nullableExitOfferTypeSerializer", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallEventDataSerializer implements a {
    private static final int DARK_MODE_INDEX = 6;
    private static final int DISPLAY_MODE_INDEX = 4;
    private static final int ERROR_CODE_INDEX = 11;
    private static final int ERROR_MESSAGE_INDEX = 12;
    private static final int EXIT_OFFERING_IDENTIFIER_INDEX = 8;
    private static final int EXIT_OFFER_TYPE_INDEX = 7;
    private static final int LOCALE_IDENTIFIER_INDEX = 5;
    private static final int PACKAGE_IDENTIFIER_INDEX = 9;
    private static final int PAYWALL_IDENTIFIER_INDEX = 0;
    private static final int PAYWALL_REVISION_INDEX = 2;
    private static final int PRESENTED_OFFERING_CONTEXT_INDEX = 1;
    private static final int PRODUCT_IDENTIFIER_INDEX = 10;
    private static final int SESSION_IDENTIFIER_INDEX = 3;
    public static final PaywallEventDataSerializer INSTANCE = new PaywallEventDataSerializer();
    private static final a nullableStringSerializer = c0.G(b1.a);
    private static final a nullableIntSerializer = c0.G(e0.a);
    private static final a nullableExitOfferTypeSerializer = c0.G(ExitOfferType.INSTANCE.serializer());
    private static final e descriptor = t1.k("PaywallEvent.Data", new e[0], PaywallEventDataSerializer$descriptor$1.INSTANCE);

    private PaywallEventDataSerializer() {
    }

    @Override
    public PaywallEvent.Data deserialize(c decoder) {
        PresentedOfferingContext presentedOfferingContext;
        m.e(decoder, "decoder");
        if (!(decoder instanceof j)) {
            throw new SerializationException("PaywallEvent.Data only supports JSON deserialization");
        }
        j jVar = (j) decoder;
        x xVarG = q40.m.g(jVar.m());
        if (xVarG.containsKey("presentedOfferingContext")) {
            q40.c cVarY = jVar.y();
            PresentedOfferingContextSerializer presentedOfferingContextSerializer = PresentedOfferingContextSerializer.INSTANCE;
            Object obj = xVarG.get("presentedOfferingContext");
            m.b(obj);
            presentedOfferingContext = (PresentedOfferingContext) cVarY.a(presentedOfferingContextSerializer, (l) obj);
        } else {
            if (!xVarG.containsKey("offeringIdentifier")) {
                throw new SerializationException("Missing offering context information");
            }
            Object obj2 = xVarG.get("offeringIdentifier");
            m.b(obj2);
            presentedOfferingContext = new PresentedOfferingContext(q40.m.h((l) obj2).a());
        }
        l lVar = (l) xVarG.get("paywallIdentifier");
        String str = lVar != null ? (String) jVar.y().a(b1.a, lVar) : null;
        q40.c cVarY2 = jVar.y();
        e0 e0Var = e0.a;
        Object obj3 = xVarG.get("paywallRevision");
        m.b(obj3);
        int iIntValue = ((Number) cVarY2.a(e0Var, (l) obj3)).intValue();
        q40.c cVarY3 = jVar.y();
        UUIDSerializer uUIDSerializer = UUIDSerializer.INSTANCE;
        Object obj4 = xVarG.get("sessionIdentifier");
        m.b(obj4);
        UUID uuid = (UUID) cVarY3.a(uUIDSerializer, (l) obj4);
        q40.c cVarY4 = jVar.y();
        b1 b1Var = b1.a;
        Object obj5 = xVarG.get("displayMode");
        m.b(obj5);
        String str2 = (String) cVarY4.a(b1Var, (l) obj5);
        q40.c cVarY5 = jVar.y();
        Object obj6 = xVarG.get("localeIdentifier");
        m.b(obj6);
        String str3 = (String) cVarY5.a(b1Var, (l) obj6);
        q40.c cVarY6 = jVar.y();
        f fVar = f.a;
        Object obj7 = xVarG.get("darkMode");
        m.b(obj7);
        boolean zBooleanValue = ((Boolean) cVarY6.a(fVar, (l) obj7)).booleanValue();
        l lVar2 = (l) xVarG.get("exitOfferType");
        ExitOfferType exitOfferType = lVar2 != null ? (ExitOfferType) jVar.y().a(ExitOfferType.INSTANCE.serializer(), lVar2) : null;
        l lVar3 = (l) xVarG.get("exitOfferingIdentifier");
        String str4 = lVar3 != null ? (String) jVar.y().a(b1Var, lVar3) : null;
        l lVar4 = (l) xVarG.get("packageIdentifier");
        String str5 = lVar4 != null ? (String) jVar.y().a(b1Var, lVar4) : null;
        l lVar5 = (l) xVarG.get("productIdentifier");
        String str6 = lVar5 != null ? (String) jVar.y().a(b1Var, lVar5) : null;
        l lVar6 = (l) xVarG.get("errorCode");
        Integer numValueOf = lVar6 != null ? Integer.valueOf(((Number) jVar.y().a(e0Var, lVar6)).intValue()) : null;
        l lVar7 = (l) xVarG.get("errorMessage");
        return new PaywallEvent.Data(str, presentedOfferingContext, iIntValue, uuid, str2, str3, zBooleanValue, exitOfferType, str4, str5, str6, numValueOf, lVar7 != null ? (String) jVar.y().a(b1Var, lVar7) : null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallEvent.Data value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        String paywallIdentifier = value.getPaywallIdentifier();
        if (paywallIdentifier != null) {
            bVarC.i(INSTANCE.getDescriptor(), 0, paywallIdentifier);
        }
        PaywallEventDataSerializer paywallEventDataSerializer = INSTANCE;
        bVarC.C(paywallEventDataSerializer.getDescriptor(), 1, PresentedOfferingContextSerializer.INSTANCE, value.getPresentedOfferingContext());
        bVarC.w(2, value.getPaywallRevision(), paywallEventDataSerializer.getDescriptor());
        bVarC.C(paywallEventDataSerializer.getDescriptor(), 3, UUIDSerializer.INSTANCE, value.getSessionIdentifier());
        bVarC.i(paywallEventDataSerializer.getDescriptor(), 4, value.getDisplayMode());
        bVarC.i(paywallEventDataSerializer.getDescriptor(), 5, value.getLocaleIdentifier());
        bVarC.u(paywallEventDataSerializer.getDescriptor(), 6, value.getDarkMode());
        ExitOfferType exitOfferType = value.getExitOfferType();
        if (exitOfferType != null) {
            bVarC.C(paywallEventDataSerializer.getDescriptor(), 7, ExitOfferType.INSTANCE.serializer(), exitOfferType);
        }
        String exitOfferingIdentifier = value.getExitOfferingIdentifier();
        if (exitOfferingIdentifier != null) {
            bVarC.i(paywallEventDataSerializer.getDescriptor(), 8, exitOfferingIdentifier);
        }
        String packageIdentifier = value.getPackageIdentifier();
        if (packageIdentifier != null) {
            bVarC.i(paywallEventDataSerializer.getDescriptor(), 9, packageIdentifier);
        }
        String productIdentifier = value.getProductIdentifier();
        if (productIdentifier != null) {
            bVarC.i(paywallEventDataSerializer.getDescriptor(), 10, productIdentifier);
        }
        Integer errorCode = value.getErrorCode();
        if (errorCode != null) {
            bVarC.w(11, errorCode.intValue(), paywallEventDataSerializer.getDescriptor());
        }
        String errorMessage = value.getErrorMessage();
        if (errorMessage != null) {
            bVarC.i(paywallEventDataSerializer.getDescriptor(), 12, errorMessage);
        }
        bVarC.a(descriptor2);
    }
}
