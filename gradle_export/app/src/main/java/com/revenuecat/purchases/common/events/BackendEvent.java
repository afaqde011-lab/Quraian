package com.revenuecat.purchases.common.events;

import a10.d;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode;
import com.revenuecat.purchases.customercenter.events.CustomerCenterEventType;
import com.revenuecat.purchases.utils.Event;
import g00.c;
import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import n40.e;
import o40.b;
import p40.b1;
import p40.e0;
import p40.k0;
import p40.o0;
import p40.x0;
import rd.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0011\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent;", "Lcom/revenuecat/purchases/utils/Event;", "<init>", "()V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendEvent;Lo40/b;Ln40/e;)V", "Companion", "Ad", "CustomPaywall", "CustomerCenter", "Paywalls", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BackendEvent implements Event {
    public static final int AD_EVENT_SCHEMA_VERSION = 1;
    public static final int CUSTOMER_CENTER_EVENT_SCHEMA_VERSION = 1;
    public static final int CUSTOM_PAYWALL_EVENT_SCHEMA_VERSION = 1;
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;

    public static final Companion INSTANCE = new Companion(null);
    private static final h $cachedSerializer$delegate = a.I(i.B, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0002cbB£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016BË\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001cJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001cJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/JÀ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001cJ\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108J(\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<HÁ\u0001¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bF\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010B\u0012\u0004\bL\u0010J\u001a\u0004\bK\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bN\u0010J\u001a\u0004\bM\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bP\u0010J\u001a\u0004\bO\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bQ\u0010\u001cR \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bS\u0010J\u001a\u0004\bR\u0010\u001cR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bU\u0010J\u001a\u0004\bT\u0010\u001cR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bW\u0010J\u001a\u0004\bV\u0010\u001cR \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010B\u0012\u0004\bY\u0010J\u001a\u0004\bX\u0010\u001cR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010Z\u0012\u0004\b\\\u0010J\u001a\u0004\b[\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\b]\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\b^\u0010\u001cR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010_\u0012\u0004\ba\u0010J\u001a\u0004\b`\u0010/¨\u0006d"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", DiagnosticsEntry.ID_KEY, "", DiagnosticsEntry.VERSION_KEY, "type", "", DiagnosticsEntry.TIMESTAMP_KEY, "networkName", "mediatorName", "adFormat", "placement", "adUnitId", "impressionId", "appUserID", "appSessionID", "revenueMicros", "currency", "precision", "mediatorErrorCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lp40/x0;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()J", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Long;", "component14", "component15", "component16", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getId", "I", "getVersion", "getType", "J", "getTimestamp", "getTimestamp$annotations", "()V", "getNetworkName", "getNetworkName$annotations", "getMediatorName", "getMediatorName$annotations", "getAdFormat", "getAdFormat$annotations", "getPlacement", "getAdUnitId", "getAdUnitId$annotations", "getImpressionId", "getImpressionId$annotations", "getAppUserID", "getAppUserID$annotations", "getAppSessionID", "getAppSessionID$annotations", "Ljava/lang/Long;", "getRevenueMicros", "getRevenueMicros$annotations", "getCurrency", "getPrecision", "Ljava/lang/Integer;", "getMediatorErrorCode", "getMediatorErrorCode$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ad extends BackendEvent {

        public static final Companion INSTANCE = new Companion(null);
        private final String adFormat;
        private final String adUnitId;
        private final String appSessionID;
        private final String appUserID;
        private final String currency;
        private final String id;
        private final String impressionId;
        private final Integer mediatorErrorCode;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final String precision;
        private final Long revenueMicros;
        private final long timestamp;
        private final String type;
        private final int version;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return BackendEvent$Ad$$serializer.INSTANCE;
            }
        }

        @c
        public Ad(int i, String str, int i2, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Integer num, x0 x0Var) {
            super(i, x0Var);
            if (4015 != (i & 4015)) {
                o0.g(i, 4015, BackendEvent$Ad$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.version = i2;
            this.type = str2;
            this.timestamp = j;
            if ((i & 16) == 0) {
                this.networkName = null;
            } else {
                this.networkName = str3;
            }
            this.mediatorName = str4;
            if ((i & 64) == 0) {
                this.adFormat = null;
            } else {
                this.adFormat = str5;
            }
            this.placement = str6;
            this.adUnitId = str7;
            this.impressionId = str8;
            this.appUserID = str9;
            this.appSessionID = str10;
            if ((i & 4096) == 0) {
                this.revenueMicros = null;
            } else {
                this.revenueMicros = l;
            }
            if ((i & 8192) == 0) {
                this.currency = null;
            } else {
                this.currency = str11;
            }
            if ((i & 16384) == 0) {
                this.precision = null;
            } else {
                this.precision = str12;
            }
            if ((i & 32768) == 0) {
                this.mediatorErrorCode = null;
            } else {
                this.mediatorErrorCode = num;
            }
        }

        public Ad(String id, int i, String type, long j, String str, String mediatorName, String str2, String str3, String adUnitId, String str4, String appUserID, String appSessionID, Long l, String str5, String str6, Integer num) {
            super(null);
            m.e(id, "id");
            m.e(type, "type");
            m.e(mediatorName, "mediatorName");
            m.e(adUnitId, "adUnitId");
            m.e(appUserID, "appUserID");
            m.e(appSessionID, "appSessionID");
            this.id = id;
            this.version = i;
            this.type = type;
            this.timestamp = j;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = str2;
            this.placement = str3;
            this.adUnitId = adUnitId;
            this.impressionId = str4;
            this.appUserID = appUserID;
            this.appSessionID = appSessionID;
            this.revenueMicros = l;
            this.currency = str5;
            this.precision = str6;
            this.mediatorErrorCode = num;
        }

        public Ad(String str, int i, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, String str11, String str12, Integer num, int i2, f fVar) {
            this(str, i, str2, j, (i2 & 16) != 0 ? null : str3, str4, (i2 & 64) != 0 ? null : str5, str6, str7, str8, str9, str10, (i2 & 4096) != 0 ? null : l, (i2 & 8192) != 0 ? null : str11, (i2 & 16384) != 0 ? null : str12, (i2 & 32768) != 0 ? null : num);
        }

        public static void getAdFormat$annotations() {
        }

        public static void getAdUnitId$annotations() {
        }

        public static void getAppSessionID$annotations() {
        }

        public static void getAppUserID$annotations() {
        }

        public static void getImpressionId$annotations() {
        }

        public static void getMediatorErrorCode$annotations() {
        }

        public static void getMediatorName$annotations() {
        }

        public static void getNetworkName$annotations() {
        }

        public static void getRevenueMicros$annotations() {
        }

        public static void getTimestamp$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(Ad self, b output, e serialDesc) {
            BackendEvent.write$Self(self, output, serialDesc);
            output.i(serialDesc, 0, self.id);
            output.w(1, self.version, serialDesc);
            output.i(serialDesc, 2, self.type);
            output.t(serialDesc, 3, self.timestamp);
            if (output.k(serialDesc) || self.networkName != null) {
                output.x(serialDesc, 4, b1.a, self.networkName);
            }
            output.i(serialDesc, 5, self.mediatorName);
            if (output.k(serialDesc) || self.adFormat != null) {
                output.x(serialDesc, 6, b1.a, self.adFormat);
            }
            b1 b1Var = b1.a;
            output.x(serialDesc, 7, b1Var, self.placement);
            output.i(serialDesc, 8, self.adUnitId);
            output.x(serialDesc, 9, b1Var, self.impressionId);
            output.i(serialDesc, 10, self.appUserID);
            output.i(serialDesc, 11, self.appSessionID);
            if (output.k(serialDesc) || self.revenueMicros != null) {
                output.x(serialDesc, 12, k0.a, self.revenueMicros);
            }
            if (output.k(serialDesc) || self.currency != null) {
                output.x(serialDesc, 13, b1Var, self.currency);
            }
            if (output.k(serialDesc) || self.precision != null) {
                output.x(serialDesc, 14, b1Var, self.precision);
            }
            if (!output.k(serialDesc) && self.mediatorErrorCode == null) {
                return;
            }
            output.x(serialDesc, 15, e0.a, self.mediatorErrorCode);
        }

        public final String getId() {
            return this.id;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final Long getRevenueMicros() {
            return this.revenueMicros;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getPrecision() {
            return this.precision;
        }

        public final Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }

        public final int getVersion() {
            return this.version;
        }

        public final String getType() {
            return this.type;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getNetworkName() {
            return this.networkName;
        }

        public final String getMediatorName() {
            return this.mediatorName;
        }

        public final String getAdFormat() {
            return this.adFormat;
        }

        public final String getPlacement() {
            return this.placement;
        }

        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public final Ad copy(String id, int version, String type, long timestamp, String networkName, String mediatorName, String adFormat, String placement, String adUnitId, String impressionId, String appUserID, String appSessionID, Long revenueMicros, String currency, String precision, Integer mediatorErrorCode) {
            m.e(id, "id");
            m.e(type, "type");
            m.e(mediatorName, "mediatorName");
            m.e(adUnitId, "adUnitId");
            m.e(appUserID, "appUserID");
            m.e(appSessionID, "appSessionID");
            return new Ad(id, version, type, timestamp, networkName, mediatorName, adFormat, placement, adUnitId, impressionId, appUserID, appSessionID, revenueMicros, currency, precision, mediatorErrorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ad)) {
                return false;
            }
            Ad ad = (Ad) other;
            return m.a(this.id, ad.id) && this.version == ad.version && m.a(this.type, ad.type) && this.timestamp == ad.timestamp && m.a(this.networkName, ad.networkName) && m.a(this.mediatorName, ad.mediatorName) && m.a(this.adFormat, ad.adFormat) && m.a(this.placement, ad.placement) && m.a(this.adUnitId, ad.adUnitId) && m.a(this.impressionId, ad.impressionId) && m.a(this.appUserID, ad.appUserID) && m.a(this.appSessionID, ad.appSessionID) && m.a(this.revenueMicros, ad.revenueMicros) && m.a(this.currency, ad.currency) && m.a(this.precision, ad.precision) && m.a(this.mediatorErrorCode, ad.mediatorErrorCode);
        }

        public final String getAdFormat() {
            return this.adFormat;
        }

        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }

        public final String getMediatorName() {
            return this.mediatorName;
        }

        public final String getNetworkName() {
            return this.networkName;
        }

        public final String getPlacement() {
            return this.placement;
        }

        public final String getPrecision() {
            return this.precision;
        }

        public final Long getRevenueMicros() {
            return this.revenueMicros;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iF = w.c.f(x5.e(w.c.d(this.version, this.id.hashCode() * 31, 31), this.type, 31), this.timestamp, 31);
            String str = this.networkName;
            int iE = x5.e((iF + (str == null ? 0 : str.hashCode())) * 31, this.mediatorName, 31);
            String str2 = this.adFormat;
            int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placement;
            int iE2 = x5.e((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, this.adUnitId, 31);
            String str4 = this.impressionId;
            int iE3 = x5.e(x5.e((iE2 + (str4 == null ? 0 : str4.hashCode())) * 31, this.appUserID, 31), this.appSessionID, 31);
            Long l = this.revenueMicros;
            int iHashCode2 = (iE3 + (l == null ? 0 : l.hashCode())) * 31;
            String str5 = this.currency;
            int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.precision;
            int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.mediatorErrorCode;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        @Override
        public String toString() {
            return "Ad(id=" + this.id + ", version=" + this.version + ", type=" + this.type + ", timestamp=" + this.timestamp + ", networkName=" + this.networkName + ", mediatorName=" + this.mediatorName + ", adFormat=" + this.adFormat + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", appUserID=" + this.appUserID + ", appSessionID=" + this.appSessionID + ", revenueMicros=" + this.revenueMicros + ", currency=" + this.currency + ", precision=" + this.precision + ", mediatorErrorCode=" + this.mediatorErrorCode + ')';
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "serializer", "()Ll40/a;", "", "AD_EVENT_SCHEMA_VERSION", "I", "CUSTOMER_CENTER_EVENT_SCHEMA_VERSION", "CUSTOM_PAYWALL_EVENT_SCHEMA_VERSION", "PAYWALL_EVENT_SCHEMA_VERSION", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends n implements u00.a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override
            public final l40.a invoke() {
                b0 b0Var = a0.a;
                return new l40.c("com.revenuecat.purchases.common.events.BackendEvent", b0Var.b(BackendEvent.class), new d[]{b0Var.b(Ad.class), b0Var.b(CustomPaywall.class), b0Var.b(CustomerCenter.class), b0Var.b(Paywalls.class)}, new l40.a[]{BackendEvent$Ad$$serializer.INSTANCE, BackendEvent$CustomPaywall$$serializer.INSTANCE, BackendEvent$CustomerCenter$$serializer.INSTANCE, BackendEvent$Paywalls$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        private final l40.a get$cachedSerializer() {
            return (l40.a) BackendEvent.$cachedSerializer$delegate.getValue();
        }

        public final l40.a serializer() {
            return get$cachedSerializer();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBo\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010\u001d¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", DiagnosticsEntry.ID_KEY, "", DiagnosticsEntry.VERSION_KEY, "type", "appUserID", "appSessionID", "", DiagnosticsEntry.TIMESTAMP_KEY, "paywallID", "offeringID", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()J", "component7", "component8", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getVersion", "getType", "getAppUserID", "getAppUserID$annotations", "()V", "getAppSessionID", "getAppSessionID$annotations", "J", "getTimestamp", "getPaywallID", "getPaywallID$annotations", "getOfferingID", "getOfferingID$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomPaywall extends BackendEvent {

        public static final Companion INSTANCE = new Companion(null);
        private final String appSessionID;
        private final String appUserID;
        private final String id;
        private final String offeringID;
        private final String paywallID;
        private final long timestamp;
        private final String type;
        private final int version;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return BackendEvent$CustomPaywall$$serializer.INSTANCE;
            }
        }

        @c
        public CustomPaywall(int i, String str, int i2, String str2, String str3, String str4, long j, String str5, String str6, x0 x0Var) {
            super(i, x0Var);
            if (47 != (i & 47)) {
                o0.g(i, 47, BackendEvent$CustomPaywall$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.version = i2;
            this.type = str2;
            this.appUserID = str3;
            if ((i & 16) == 0) {
                this.appSessionID = null;
            } else {
                this.appSessionID = str4;
            }
            this.timestamp = j;
            if ((i & 64) == 0) {
                this.paywallID = null;
            } else {
                this.paywallID = str5;
            }
            if ((i & 128) == 0) {
                this.offeringID = null;
            } else {
                this.offeringID = str6;
            }
        }

        public CustomPaywall(String id, int i, String type, String appUserID, String str, long j, String str2, String str3) {
            super(null);
            m.e(id, "id");
            m.e(type, "type");
            m.e(appUserID, "appUserID");
            this.id = id;
            this.version = i;
            this.type = type;
            this.appUserID = appUserID;
            this.appSessionID = str;
            this.timestamp = j;
            this.paywallID = str2;
            this.offeringID = str3;
        }

        public CustomPaywall(String str, int i, String str2, String str3, String str4, long j, String str5, String str6, int i2, f fVar) {
            this(str, i, str2, str3, (i2 & 16) != 0 ? null : str4, j, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6);
        }

        public static CustomPaywall copy$default(CustomPaywall customPaywall, String str, int i, String str2, String str3, String str4, long j, String str5, String str6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = customPaywall.id;
            }
            if ((i2 & 2) != 0) {
                i = customPaywall.version;
            }
            if ((i2 & 4) != 0) {
                str2 = customPaywall.type;
            }
            if ((i2 & 8) != 0) {
                str3 = customPaywall.appUserID;
            }
            if ((i2 & 16) != 0) {
                str4 = customPaywall.appSessionID;
            }
            if ((i2 & 32) != 0) {
                j = customPaywall.timestamp;
            }
            if ((i2 & 64) != 0) {
                str5 = customPaywall.paywallID;
            }
            if ((i2 & 128) != 0) {
                str6 = customPaywall.offeringID;
            }
            long j2 = j;
            String str7 = str3;
            String str8 = str4;
            String str9 = str2;
            return customPaywall.copy(str, i, str9, str7, str8, j2, str5, str6);
        }

        public static void getAppSessionID$annotations() {
        }

        public static void getAppUserID$annotations() {
        }

        public static void getOfferingID$annotations() {
        }

        public static void getPaywallID$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(CustomPaywall self, b output, e serialDesc) {
            BackendEvent.write$Self(self, output, serialDesc);
            output.i(serialDesc, 0, self.id);
            output.w(1, self.version, serialDesc);
            output.i(serialDesc, 2, self.type);
            output.i(serialDesc, 3, self.appUserID);
            if (output.k(serialDesc) || self.appSessionID != null) {
                output.x(serialDesc, 4, b1.a, self.appSessionID);
            }
            output.t(serialDesc, 5, self.timestamp);
            if (output.k(serialDesc) || self.paywallID != null) {
                output.x(serialDesc, 6, b1.a, self.paywallID);
            }
            if (!output.k(serialDesc) && self.offeringID == null) {
                return;
            }
            output.x(serialDesc, 7, b1.a, self.offeringID);
        }

        public final String getId() {
            return this.id;
        }

        public final int getVersion() {
            return this.version;
        }

        public final String getType() {
            return this.type;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getPaywallID() {
            return this.paywallID;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final CustomPaywall copy(String id, int version, String type, String appUserID, String appSessionID, long timestamp, String paywallID, String offeringID) {
            m.e(id, "id");
            m.e(type, "type");
            m.e(appUserID, "appUserID");
            return new CustomPaywall(id, version, type, appUserID, appSessionID, timestamp, paywallID, offeringID);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomPaywall)) {
                return false;
            }
            CustomPaywall customPaywall = (CustomPaywall) other;
            return m.a(this.id, customPaywall.id) && this.version == customPaywall.version && m.a(this.type, customPaywall.type) && m.a(this.appUserID, customPaywall.appUserID) && m.a(this.appSessionID, customPaywall.appSessionID) && this.timestamp == customPaywall.timestamp && m.a(this.paywallID, customPaywall.paywallID) && m.a(this.offeringID, customPaywall.offeringID);
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getId() {
            return this.id;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final String getPaywallID() {
            return this.paywallID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iE = x5.e(x5.e(w.c.d(this.version, this.id.hashCode() * 31, 31), this.type, 31), this.appUserID, 31);
            String str = this.appSessionID;
            int iF = w.c.f((iE + (str == null ? 0 : str.hashCode())) * 31, this.timestamp, 31);
            String str2 = this.paywallID;
            int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.offeringID;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("CustomPaywall(id=");
            sb.append(this.id);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", appUserID=");
            sb.append(this.appUserID);
            sb.append(", appSessionID=");
            sb.append(this.appSessionID);
            sb.append(", timestamp=");
            sb.append(this.timestamp);
            sb.append(", paywallID=");
            sb.append(this.paywallID);
            sb.append(", offeringID=");
            return g4.c.k(sb, this.offeringID, ')');
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 Y2\u00020\u0001:\u0002ZYBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0099\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001cJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001cJ\u008e\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010\u001eJ\u001a\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J(\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209HÁ\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010A\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010 R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bH\u0010D\u001a\u0004\bG\u0010\u001cR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bJ\u0010D\u001a\u0004\bI\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bL\u0010$R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010M\u0012\u0004\bO\u0010D\u001a\u0004\bN\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bP\u0010\u001cR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Q\u0012\u0004\bS\u0010D\u001a\u0004\bR\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\bU\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bV\u0010\u001cR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010?\u0012\u0004\bX\u0010D\u001a\u0004\bW\u0010\u001c¨\u0006["}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", DiagnosticsEntry.ID_KEY, "", "revisionID", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "type", "appUserID", "appSessionID", "", DiagnosticsEntry.TIMESTAMP_KEY, "", "darkMode", "locale", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "displayMode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "path", "url", "surveyOptionID", "<init>", "(Ljava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;Lp40/x0;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "component4", "component5", "component6", "()J", "component7", "()Z", "component8", "component9", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "component10", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "component11", "component12", "copy", "(Ljava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getId", "I", "getRevisionID", "getRevisionID$annotations", "()V", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getType", "getAppUserID", "getAppUserID$annotations", "getAppSessionID", "getAppSessionID$annotations", "J", "getTimestamp", "Z", "getDarkMode", "getDarkMode$annotations", "getLocale", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "getDisplayMode", "getDisplayMode$annotations", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "getPath", "getUrl", "getSurveyOptionID", "getSurveyOptionID$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomerCenter extends BackendEvent {
        private final String appSessionID;
        private final String appUserID;
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String id;
        private final String locale;
        private final CustomerCenterConfigData.HelpPath.PathType path;
        private final int revisionID;
        private final String surveyOptionID;
        private final long timestamp;
        private final CustomerCenterEventType type;
        private final String url;

        public static final Companion INSTANCE = new Companion(null);
        private static final l40.a[] $childSerializers = {null, null, CustomerCenterEventType.INSTANCE.serializer(), null, null, null, null, null, CustomerCenterDisplayMode.INSTANCE.serializer(), CustomerCenterConfigData.HelpPath.PathType.INSTANCE.serializer(), null, null};

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return BackendEvent$CustomerCenter$$serializer.INSTANCE;
            }
        }

        @c
        public CustomerCenter(int i, String str, int i2, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j, boolean z, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, x0 x0Var) {
            super(i, x0Var);
            if (4095 != (i & 4095)) {
                o0.g(i, 4095, BackendEvent$CustomerCenter$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.revisionID = i2;
            this.type = customerCenterEventType;
            this.appUserID = str2;
            this.appSessionID = str3;
            this.timestamp = j;
            this.darkMode = z;
            this.locale = str4;
            this.displayMode = customerCenterDisplayMode;
            this.path = pathType;
            this.url = str5;
            this.surveyOptionID = str6;
        }

        public CustomerCenter(String id, int i, CustomerCenterEventType type, String appUserID, String appSessionID, long j, boolean z, String locale, CustomerCenterDisplayMode displayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str, String str2) {
            super(null);
            m.e(id, "id");
            m.e(type, "type");
            m.e(appUserID, "appUserID");
            m.e(appSessionID, "appSessionID");
            m.e(locale, "locale");
            m.e(displayMode, "displayMode");
            this.id = id;
            this.revisionID = i;
            this.type = type;
            this.appUserID = appUserID;
            this.appSessionID = appSessionID;
            this.timestamp = j;
            this.darkMode = z;
            this.locale = locale;
            this.displayMode = displayMode;
            this.path = pathType;
            this.url = str;
            this.surveyOptionID = str2;
        }

        public static CustomerCenter copy$default(CustomerCenter customerCenter, String str, int i, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j, boolean z, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = customerCenter.id;
            }
            return customerCenter.copy(str, (i2 & 2) != 0 ? customerCenter.revisionID : i, (i2 & 4) != 0 ? customerCenter.type : customerCenterEventType, (i2 & 8) != 0 ? customerCenter.appUserID : str2, (i2 & 16) != 0 ? customerCenter.appSessionID : str3, (i2 & 32) != 0 ? customerCenter.timestamp : j, (i2 & 64) != 0 ? customerCenter.darkMode : z, (i2 & 128) != 0 ? customerCenter.locale : str4, (i2 & 256) != 0 ? customerCenter.displayMode : customerCenterDisplayMode, (i2 & 512) != 0 ? customerCenter.path : pathType, (i2 & 1024) != 0 ? customerCenter.url : str5, (i2 & 2048) != 0 ? customerCenter.surveyOptionID : str6);
        }

        public static void getAppSessionID$annotations() {
        }

        public static void getAppUserID$annotations() {
        }

        public static void getDarkMode$annotations() {
        }

        public static void getDisplayMode$annotations() {
        }

        public static void getRevisionID$annotations() {
        }

        public static void getSurveyOptionID$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(CustomerCenter self, b output, e serialDesc) {
            BackendEvent.write$Self(self, output, serialDesc);
            l40.a[] aVarArr = $childSerializers;
            output.i(serialDesc, 0, self.id);
            output.w(1, self.revisionID, serialDesc);
            output.C(serialDesc, 2, aVarArr[2], self.type);
            output.i(serialDesc, 3, self.appUserID);
            output.i(serialDesc, 4, self.appSessionID);
            output.t(serialDesc, 5, self.timestamp);
            output.u(serialDesc, 6, self.darkMode);
            output.i(serialDesc, 7, self.locale);
            output.C(serialDesc, 8, aVarArr[8], self.displayMode);
            output.x(serialDesc, 9, aVarArr[9], self.path);
            b1 b1Var = b1.a;
            output.x(serialDesc, 10, b1Var, self.url);
            output.x(serialDesc, 11, b1Var, self.surveyOptionID);
        }

        public final String getId() {
            return this.id;
        }

        public final CustomerCenterConfigData.HelpPath.PathType getPath() {
            return this.path;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getSurveyOptionID() {
            return this.surveyOptionID;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final CustomerCenter copy(String id, int revisionID, CustomerCenterEventType type, String appUserID, String appSessionID, long timestamp, boolean darkMode, String locale, CustomerCenterDisplayMode displayMode, CustomerCenterConfigData.HelpPath.PathType path, String url, String surveyOptionID) {
            m.e(id, "id");
            m.e(type, "type");
            m.e(appUserID, "appUserID");
            m.e(appSessionID, "appSessionID");
            m.e(locale, "locale");
            m.e(displayMode, "displayMode");
            return new CustomerCenter(id, revisionID, type, appUserID, appSessionID, timestamp, darkMode, locale, displayMode, path, url, surveyOptionID);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerCenter)) {
                return false;
            }
            CustomerCenter customerCenter = (CustomerCenter) other;
            return m.a(this.id, customerCenter.id) && this.revisionID == customerCenter.revisionID && this.type == customerCenter.type && m.a(this.appUserID, customerCenter.appUserID) && m.a(this.appSessionID, customerCenter.appSessionID) && this.timestamp == customerCenter.timestamp && this.darkMode == customerCenter.darkMode && m.a(this.locale, customerCenter.locale) && this.displayMode == customerCenter.displayMode && this.path == customerCenter.path && m.a(this.url, customerCenter.url) && m.a(this.surveyOptionID, customerCenter.surveyOptionID);
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final CustomerCenterConfigData.HelpPath.PathType getPath() {
            return this.path;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final String getSurveyOptionID() {
            return this.surveyOptionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = (this.displayMode.hashCode() + x5.e(w.c.e(w.c.f(x5.e(x5.e((this.type.hashCode() + w.c.d(this.revisionID, this.id.hashCode() * 31, 31)) * 31, this.appUserID, 31), this.appSessionID, 31), this.timestamp, 31), 31, this.darkMode), this.locale, 31)) * 31;
            CustomerCenterConfigData.HelpPath.PathType pathType = this.path;
            int iHashCode2 = (iHashCode + (pathType == null ? 0 : pathType.hashCode())) * 31;
            String str = this.url;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.surveyOptionID;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("CustomerCenter(id=");
            sb.append(this.id);
            sb.append(", revisionID=");
            sb.append(this.revisionID);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", appUserID=");
            sb.append(this.appUserID);
            sb.append(", appSessionID=");
            sb.append(this.appSessionID);
            sb.append(", timestamp=");
            sb.append(this.timestamp);
            sb.append(", darkMode=");
            sb.append(this.darkMode);
            sb.append(", locale=");
            sb.append(this.locale);
            sb.append(", displayMode=");
            sb.append(this.displayMode);
            sb.append(", path=");
            sb.append(this.path);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", surveyOptionID=");
            return g4.c.k(sb, this.surveyOptionID, ')');
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002mlB±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019Bã\u0001\b\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJ\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\u001fJÒ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001fJ\u0010\u00108\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b8\u0010!J\u001a\u0010;\u001a\u00020\u000f2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J(\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@HÁ\u0001¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bJ\u0010\u001fR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010F\u0012\u0004\bL\u0010M\u001a\u0004\bK\u0010\u001fR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010F\u0012\u0004\bO\u0010M\u001a\u0004\bN\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010F\u0012\u0004\bQ\u0010M\u001a\u0004\bP\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010F\u0012\u0004\bS\u0010M\u001a\u0004\bR\u0010\u001fR \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010H\u0012\u0004\bU\u0010M\u001a\u0004\bT\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bW\u0010)R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bY\u0010M\u001a\u0004\bX\u0010\u001fR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Z\u0012\u0004\b\\\u0010M\u001a\u0004\b[\u0010,R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010F\u0012\u0004\b^\u0010M\u001a\u0004\b]\u0010\u001fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010F\u0012\u0004\b`\u0010M\u001a\u0004\b_\u0010\u001fR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010F\u0012\u0004\bb\u0010M\u001a\u0004\ba\u0010\u001fR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010F\u0012\u0004\bd\u0010M\u001a\u0004\bc\u0010\u001fR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010F\u0012\u0004\bf\u0010M\u001a\u0004\be\u0010\u001fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010g\u0012\u0004\bi\u0010M\u001a\u0004\bh\u00103R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010F\u0012\u0004\bk\u0010M\u001a\u0004\bj\u0010\u001f¨\u0006n"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", DiagnosticsEntry.ID_KEY, "", DiagnosticsEntry.VERSION_KEY, "type", "appUserID", "sessionID", "offeringID", "paywallID", "paywallRevision", "", DiagnosticsEntry.TIMESTAMP_KEY, "displayMode", "", "darkMode", "localeIdentifier", "exitOfferType", "exitOfferingID", "packageID", "productID", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lp40/x0;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()J", "component10", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "component17", "()Ljava/lang/Integer;", "component18", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;Lo40/b;Ln40/e;)V", "write$Self", "Ljava/lang/String;", "getId", "I", "getVersion", "getType", "getAppUserID", "getAppUserID$annotations", "()V", "getSessionID", "getSessionID$annotations", "getOfferingID", "getOfferingID$annotations", "getPaywallID", "getPaywallID$annotations", "getPaywallRevision", "getPaywallRevision$annotations", "J", "getTimestamp", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "getExitOfferType", "getExitOfferType$annotations", "getExitOfferingID", "getExitOfferingID$annotations", "getPackageID", "getPackageID$annotations", "getProductID", "getProductID$annotations", "Ljava/lang/Integer;", "getErrorCode", "getErrorCode$annotations", "getErrorMessage", "getErrorMessage$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Paywalls extends BackendEvent {

        public static final Companion INSTANCE = new Companion(null);
        private final String appUserID;
        private final boolean darkMode;
        private final String displayMode;
        private final Integer errorCode;
        private final String errorMessage;
        private final String exitOfferType;
        private final String exitOfferingID;
        private final String id;
        private final String localeIdentifier;
        private final String offeringID;
        private final String packageID;
        private final String paywallID;
        private final int paywallRevision;
        private final String productID;
        private final String sessionID;
        private final long timestamp;
        private final String type;
        private final int version;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$Companion;", "", "<init>", "()V", "Ll40/a;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            public final l40.a serializer() {
                return BackendEvent$Paywalls$$serializer.INSTANCE;
            }
        }

        @c
        public Paywalls(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, long j, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, x0 x0Var) {
            super(i, x0Var);
            if (4095 != (i & 4095)) {
                o0.g(i, 4095, BackendEvent$Paywalls$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.id = str;
            this.version = i2;
            this.type = str2;
            this.appUserID = str3;
            this.sessionID = str4;
            this.offeringID = str5;
            this.paywallID = str6;
            this.paywallRevision = i3;
            this.timestamp = j;
            this.displayMode = str7;
            this.darkMode = z;
            this.localeIdentifier = str8;
            if ((i & 4096) == 0) {
                this.exitOfferType = null;
            } else {
                this.exitOfferType = str9;
            }
            if ((i & 8192) == 0) {
                this.exitOfferingID = null;
            } else {
                this.exitOfferingID = str10;
            }
            if ((i & 16384) == 0) {
                this.packageID = null;
            } else {
                this.packageID = str11;
            }
            if ((32768 & i) == 0) {
                this.productID = null;
            } else {
                this.productID = str12;
            }
            if ((65536 & i) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num;
            }
            if ((i & 131072) == 0) {
                this.errorMessage = null;
            } else {
                this.errorMessage = str13;
            }
        }

        public Paywalls(String id, int i, String type, String appUserID, String sessionID, String offeringID, String str, int i2, long j, String displayMode, boolean z, String localeIdentifier, String str2, String str3, String str4, String str5, Integer num, String str6) {
            super(null);
            m.e(id, "id");
            m.e(type, "type");
            m.e(appUserID, "appUserID");
            m.e(sessionID, "sessionID");
            m.e(offeringID, "offeringID");
            m.e(displayMode, "displayMode");
            m.e(localeIdentifier, "localeIdentifier");
            this.id = id;
            this.version = i;
            this.type = type;
            this.appUserID = appUserID;
            this.sessionID = sessionID;
            this.offeringID = offeringID;
            this.paywallID = str;
            this.paywallRevision = i2;
            this.timestamp = j;
            this.displayMode = displayMode;
            this.darkMode = z;
            this.localeIdentifier = localeIdentifier;
            this.exitOfferType = str2;
            this.exitOfferingID = str3;
            this.packageID = str4;
            this.productID = str5;
            this.errorCode = num;
            this.errorMessage = str6;
        }

        public Paywalls(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, long j, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, int i3, f fVar) {
            this(str, i, str2, str3, str4, str5, str6, i2, j, str7, z, str8, (i3 & 4096) != 0 ? null : str9, (i3 & 8192) != 0 ? null : str10, (i3 & 16384) != 0 ? null : str11, (32768 & i3) != 0 ? null : str12, (65536 & i3) != 0 ? null : num, (i3 & 131072) != 0 ? null : str13);
        }

        public static Paywalls copy$default(Paywalls paywalls, String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, long j, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, int i3, Object obj) {
            String str14;
            Integer num2;
            String str15 = (i3 & 1) != 0 ? paywalls.id : str;
            int i4 = (i3 & 2) != 0 ? paywalls.version : i;
            String str16 = (i3 & 4) != 0 ? paywalls.type : str2;
            String str17 = (i3 & 8) != 0 ? paywalls.appUserID : str3;
            String str18 = (i3 & 16) != 0 ? paywalls.sessionID : str4;
            String str19 = (i3 & 32) != 0 ? paywalls.offeringID : str5;
            String str20 = (i3 & 64) != 0 ? paywalls.paywallID : str6;
            int i5 = (i3 & 128) != 0 ? paywalls.paywallRevision : i2;
            long j2 = (i3 & 256) != 0 ? paywalls.timestamp : j;
            String str21 = (i3 & 512) != 0 ? paywalls.displayMode : str7;
            boolean z2 = (i3 & 1024) != 0 ? paywalls.darkMode : z;
            String str22 = (i3 & 2048) != 0 ? paywalls.localeIdentifier : str8;
            String str23 = (i3 & 4096) != 0 ? paywalls.exitOfferType : str9;
            String str24 = str15;
            String str25 = (i3 & 8192) != 0 ? paywalls.exitOfferingID : str10;
            String str26 = (i3 & 16384) != 0 ? paywalls.packageID : str11;
            String str27 = (i3 & 32768) != 0 ? paywalls.productID : str12;
            Integer num3 = (i3 & 65536) != 0 ? paywalls.errorCode : num;
            if ((i3 & 131072) != 0) {
                num2 = num3;
                str14 = paywalls.errorMessage;
            } else {
                str14 = str13;
                num2 = num3;
            }
            return paywalls.copy(str24, i4, str16, str17, str18, str19, str20, i5, j2, str21, z2, str22, str23, str25, str26, str27, num2, str14);
        }

        public static void getAppUserID$annotations() {
        }

        public static void getDarkMode$annotations() {
        }

        public static void getDisplayMode$annotations() {
        }

        public static void getErrorCode$annotations() {
        }

        public static void getErrorMessage$annotations() {
        }

        public static void getExitOfferType$annotations() {
        }

        public static void getExitOfferingID$annotations() {
        }

        public static void getLocaleIdentifier$annotations() {
        }

        public static void getOfferingID$annotations() {
        }

        public static void getPackageID$annotations() {
        }

        public static void getPaywallID$annotations() {
        }

        public static void getPaywallRevision$annotations() {
        }

        public static void getProductID$annotations() {
        }

        public static void getSessionID$annotations() {
        }

        public static final void write$Self$purchases_defaultsBc8Release(Paywalls self, b output, e serialDesc) {
            BackendEvent.write$Self(self, output, serialDesc);
            output.i(serialDesc, 0, self.id);
            output.w(1, self.version, serialDesc);
            output.i(serialDesc, 2, self.type);
            output.i(serialDesc, 3, self.appUserID);
            output.i(serialDesc, 4, self.sessionID);
            output.i(serialDesc, 5, self.offeringID);
            b1 b1Var = b1.a;
            output.x(serialDesc, 6, b1Var, self.paywallID);
            output.w(7, self.paywallRevision, serialDesc);
            output.t(serialDesc, 8, self.timestamp);
            output.i(serialDesc, 9, self.displayMode);
            output.u(serialDesc, 10, self.darkMode);
            output.i(serialDesc, 11, self.localeIdentifier);
            if (output.k(serialDesc) || self.exitOfferType != null) {
                output.x(serialDesc, 12, b1Var, self.exitOfferType);
            }
            if (output.k(serialDesc) || self.exitOfferingID != null) {
                output.x(serialDesc, 13, b1Var, self.exitOfferingID);
            }
            if (output.k(serialDesc) || self.packageID != null) {
                output.x(serialDesc, 14, b1Var, self.packageID);
            }
            if (output.k(serialDesc) || self.productID != null) {
                output.x(serialDesc, 15, b1Var, self.productID);
            }
            if (output.k(serialDesc) || self.errorCode != null) {
                output.x(serialDesc, 16, e0.a, self.errorCode);
            }
            if (!output.k(serialDesc) && self.errorMessage == null) {
                return;
            }
            output.x(serialDesc, 17, b1Var, self.errorMessage);
        }

        public final String getId() {
            return this.id;
        }

        public final String getDisplayMode() {
            return this.displayMode;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final String getExitOfferType() {
            return this.exitOfferType;
        }

        public final String getExitOfferingID() {
            return this.exitOfferingID;
        }

        public final String getPackageID() {
            return this.packageID;
        }

        public final String getProductID() {
            return this.productID;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int getVersion() {
            return this.version;
        }

        public final String getType() {
            return this.type;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getSessionID() {
            return this.sessionID;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final String getPaywallID() {
            return this.paywallID;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Paywalls copy(String id, int version, String type, String appUserID, String sessionID, String offeringID, String paywallID, int paywallRevision, long timestamp, String displayMode, boolean darkMode, String localeIdentifier, String exitOfferType, String exitOfferingID, String packageID, String productID, Integer errorCode, String errorMessage) {
            m.e(id, "id");
            m.e(type, "type");
            m.e(appUserID, "appUserID");
            m.e(sessionID, "sessionID");
            m.e(offeringID, "offeringID");
            m.e(displayMode, "displayMode");
            m.e(localeIdentifier, "localeIdentifier");
            return new Paywalls(id, version, type, appUserID, sessionID, offeringID, paywallID, paywallRevision, timestamp, displayMode, darkMode, localeIdentifier, exitOfferType, exitOfferingID, packageID, productID, errorCode, errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paywalls)) {
                return false;
            }
            Paywalls paywalls = (Paywalls) other;
            return m.a(this.id, paywalls.id) && this.version == paywalls.version && m.a(this.type, paywalls.type) && m.a(this.appUserID, paywalls.appUserID) && m.a(this.sessionID, paywalls.sessionID) && m.a(this.offeringID, paywalls.offeringID) && m.a(this.paywallID, paywalls.paywallID) && this.paywallRevision == paywalls.paywallRevision && this.timestamp == paywalls.timestamp && m.a(this.displayMode, paywalls.displayMode) && this.darkMode == paywalls.darkMode && m.a(this.localeIdentifier, paywalls.localeIdentifier) && m.a(this.exitOfferType, paywalls.exitOfferType) && m.a(this.exitOfferingID, paywalls.exitOfferingID) && m.a(this.packageID, paywalls.packageID) && m.a(this.productID, paywalls.productID) && m.a(this.errorCode, paywalls.errorCode) && m.a(this.errorMessage, paywalls.errorMessage);
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final String getDisplayMode() {
            return this.displayMode;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getExitOfferType() {
            return this.exitOfferType;
        }

        public final String getExitOfferingID() {
            return this.exitOfferingID;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final String getPackageID() {
            return this.packageID;
        }

        public final String getPaywallID() {
            return this.paywallID;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final String getProductID() {
            return this.productID;
        }

        public final String getSessionID() {
            return this.sessionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iE = x5.e(x5.e(x5.e(x5.e(w.c.d(this.version, this.id.hashCode() * 31, 31), this.type, 31), this.appUserID, 31), this.sessionID, 31), this.offeringID, 31);
            String str = this.paywallID;
            int iE2 = x5.e(w.c.e(x5.e(w.c.f(w.c.d(this.paywallRevision, (iE + (str == null ? 0 : str.hashCode())) * 31, 31), this.timestamp, 31), this.displayMode, 31), 31, this.darkMode), this.localeIdentifier, 31);
            String str2 = this.exitOfferType;
            int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.exitOfferingID;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.packageID;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.productID;
            int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.errorCode;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str6 = this.errorMessage;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Paywalls(id=");
            sb.append(this.id);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", appUserID=");
            sb.append(this.appUserID);
            sb.append(", sessionID=");
            sb.append(this.sessionID);
            sb.append(", offeringID=");
            sb.append(this.offeringID);
            sb.append(", paywallID=");
            sb.append(this.paywallID);
            sb.append(", paywallRevision=");
            sb.append(this.paywallRevision);
            sb.append(", timestamp=");
            sb.append(this.timestamp);
            sb.append(", displayMode=");
            sb.append(this.displayMode);
            sb.append(", darkMode=");
            sb.append(this.darkMode);
            sb.append(", localeIdentifier=");
            sb.append(this.localeIdentifier);
            sb.append(", exitOfferType=");
            sb.append(this.exitOfferType);
            sb.append(", exitOfferingID=");
            sb.append(this.exitOfferingID);
            sb.append(", packageID=");
            sb.append(this.packageID);
            sb.append(", productID=");
            sb.append(this.productID);
            sb.append(", errorCode=");
            sb.append(this.errorCode);
            sb.append(", errorMessage=");
            return g4.c.k(sb, this.errorMessage, ')');
        }
    }

    private BackendEvent() {
    }

    @c
    public BackendEvent(int i, x0 x0Var) {
    }

    public BackendEvent(f fVar) {
        this();
    }

    public static final void write$Self(BackendEvent self, b output, e serialDesc) {
    }
}
