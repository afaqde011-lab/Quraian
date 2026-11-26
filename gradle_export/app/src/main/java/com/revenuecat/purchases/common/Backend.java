package com.revenuecat.purchases.common;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.ReplacementModeKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.events.EventsRequest;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.PostReceiptResponseKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.networking.WebBillingProductsResponse;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.customercenter.CustomerCenterRoot;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory;
import g00.k;
import h00.d0;
import h00.n;
import h00.q;
import h00.r;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q40.c;
import u00.o;
import va.a;
import ze.d;

@Metadata(d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ¸\u00012\u00020\u0001:\u0002¸\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJK\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u00142\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ¯\u0001\u0010/\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122 \u0010 \u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f0\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u0014j\u0002`*2$\u0010\u0019\u001a \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\r0+j\u0002`.¢\u0006\u0004\b/\u00100JQ\u00103\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r0\u00172\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b3\u00104JK\u00108\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00102\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00172\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b8\u00109J?\u0010<\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00102\f\u00106\u001a\b\u0012\u0004\u0012\u00020\r0;2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b<\u0010=JI\u0010@\u001a\u00020\r2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020-0>2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u00142\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b@\u0010AJM\u0010H\u001a\u00020\r2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\r0;2\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\bH\u0010IJ5\u0010K\u001a\u00020\r2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\r0\u00142\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\bK\u0010LJ=\u0010N\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\r0\u00142\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\bN\u0010OJM\u0010R\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010P\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u00102\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00142\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\bR\u0010SJ1\u0010W\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u00102\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\bW\u0010XJE\u0010Z\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\r0\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\bZ\u0010[JK\u0010_\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00100\\2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\r0\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\r¢\u0006\u0004\ba\u0010\u000fJ\u001f\u0010e\u001a\u00020,2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u0018H\u0002¢\u0006\u0004\be\u0010fJs\u0010q\u001a\u00020\r\"\u0004\b\u0000\u0010g\"\u0004\b\u0001\u0010h* \u0012\u0004\u0012\u00020j\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010l0k0i2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010o\u001a\u00020j2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010l2\b\b\u0002\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bq\u0010rJ[\u0010u\u001a\u00020\r\"\u0004\b\u0000\u0010s\"\u0004\b\u0001\u0010t*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010k0i2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010o\u001a\u00028\u00002\u0006\u0010p\u001a\u00028\u00012\b\b\u0002\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bu\u0010vR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010wR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010xR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010xR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010yR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010zR\u00ad\u0001\u0010}\u001aB\u0012\u0004\u0012\u00020j\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170lj\u0002`{0k0i2F\u0010|\u001aB\u0012\u0004\u0012\u00020j\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170lj\u0002`{0k0i8F@FX\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001Rè\u0001\u0010\u0085\u0001\u001a^\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u0012I\u0012G\u0012C\u0012A\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u0014j\u0002`*\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\r0+j\u0002`.0lj\u0003`\u0084\u00010k0i2b\u0010|\u001a^\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u0012I\u0012G\u0012C\u0012A\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u0014j\u0002`*\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\r0+j\u0002`.0lj\u0003`\u0084\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010~\u001a\u0006\b\u0086\u0001\u0010\u0080\u0001\"\u0006\b\u0087\u0001\u0010\u0082\u0001R¾\u0001\u0010\u0089\u0001\u001aI\u0012\u0004\u0012\u00020j\u0012?\u0012=\u00129\u00127\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r0\u0017\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\r0\u00170lj\u0003`\u0088\u00010k0i2M\u0010|\u001aI\u0012\u0004\u0012\u00020j\u0012?\u0012=\u00129\u00127\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\r0\u0017\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\r0\u00170lj\u0003`\u0088\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0089\u0001\u0010~\u001a\u0006\b\u008a\u0001\u0010\u0080\u0001\"\u0006\b\u008b\u0001\u0010\u0082\u0001RÈ\u0001\u0010\u008d\u0001\u001aN\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u00129\u00127\u00123\u00121\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`\u008c\u00010k0i2R\u0010|\u001aN\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u00129\u00127\u00123\u00121\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`\u008c\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u008d\u0001\u0010~\u001a\u0006\b\u008e\u0001\u0010\u0080\u0001\"\u0006\b\u008f\u0001\u0010\u0082\u0001R°\u0001\u0010\u0091\u0001\u001aB\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u0012-\u0012+\u0012'\u0012%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0;\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`\u0090\u00010k0i2F\u0010|\u001aB\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u0012-\u0012+\u0012'\u0012%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0;\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`\u0090\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0091\u0001\u0010~\u001a\u0006\b\u0092\u0001\u0010\u0080\u0001\"\u0006\b\u0093\u0001\u0010\u0082\u0001RÈ\u0001\u0010\u0095\u0001\u001aN\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u00129\u00127\u00123\u00121\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170lj\u0003`\u0094\u00010k0i2R\u0010|\u001aN\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u00129\u00127\u00123\u00121\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170lj\u0003`\u0094\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0095\u0001\u0010~\u001a\u0006\b\u0096\u0001\u0010\u0080\u0001\"\u0006\b\u0097\u0001\u0010\u0082\u0001R¼\u0001\u0010\u0099\u0001\u001aH\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u00123\u00121\u0012-\u0012+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0;\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170lj\u0003`\u0098\u00010k0i2L\u0010|\u001aH\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100>j\u0003`\u0083\u0001\u00123\u00121\u0012-\u0012+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0;\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00170lj\u0003`\u0098\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0099\u0001\u0010~\u001a\u0006\b\u009a\u0001\u0010\u0080\u0001\"\u0006\b\u009b\u0001\u0010\u0082\u0001R¦\u0001\u0010\u009d\u0001\u001a=\u0012\u0004\u0012\u00020\u0010\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`\u009c\u00010k0i2A\u0010|\u001a=\u0012\u0004\u0012\u00020\u0010\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`\u009c\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u009d\u0001\u0010~\u001a\u0006\b\u009e\u0001\u0010\u0080\u0001\"\u0006\b\u009f\u0001\u0010\u0082\u0001R¦\u0001\u0010¡\u0001\u001a=\u0012\u0004\u0012\u00020\u0010\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003` \u00010k0i2A\u0010|\u001a=\u0012\u0004\u0012\u00020\u0010\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003` \u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b¡\u0001\u0010~\u001a\u0006\b¢\u0001\u0010\u0080\u0001\"\u0006\b£\u0001\u0010\u0082\u0001R¦\u0001\u0010¥\u0001\u001a=\u0012\u0004\u0012\u00020\u0010\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`¤\u00010k0i2A\u0010|\u001a=\u0012\u0004\u0012\u00020\u0010\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`¤\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b¥\u0001\u0010~\u001a\u0006\b¦\u0001\u0010\u0080\u0001\"\u0006\b§\u0001\u0010\u0082\u0001Rv\u0010©\u0001\u001a%\u0012\u0004\u0012\u00020\u0010\u0012\u001b\u0012\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\r0\u0014j\u0003`¨\u00010k0i2)\u0010|\u001a%\u0012\u0004\u0012\u00020\u0010\u0012\u001b\u0012\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\r0\u0014j\u0003`¨\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b©\u0001\u0010~\u001a\u0006\bª\u0001\u0010\u0080\u0001\"\u0006\b«\u0001\u0010\u0082\u0001R¦\u0001\u0010\u00ad\u0001\u001a=\u0012\u0004\u0012\u00020j\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`¬\u00010k0i2A\u0010|\u001a=\u0012\u0004\u0012\u00020j\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`¬\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u00ad\u0001\u0010~\u001a\u0006\b®\u0001\u0010\u0080\u0001\"\u0006\b¯\u0001\u0010\u0082\u0001R¦\u0001\u0010±\u0001\u001a=\u0012\u0004\u0012\u00020\u0010\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`°\u00010k0i2A\u0010|\u001a=\u0012\u0004\u0012\u00020\u0010\u00123\u00121\u0012-\u0012+\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\r0\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00140lj\u0003`°\u00010k0i8F@FX\u0086\u000e¢\u0006\u0017\n\u0005\b±\u0001\u0010~\u001a\u0006\b²\u0001\u0010\u0080\u0001\"\u0006\b³\u0001\u0010\u0082\u0001R\u0015\u0010·\u0001\u001a\u00030´\u00018F¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001¨\u0006¹\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/Backend;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "eventsDispatcher", "Lcom/revenuecat/purchases/common/HTTPClient;", "httpClient", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/BackendHelper;)V", "Lg00/b0;", "close", "()V", "", "appUserID", "", "appInBackground", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getCustomerInfo", "(Ljava/lang/String;ZLu00/k;Lu00/n;)V", "purchaseToken", "isRestore", "finishTransactions", "", "subscriberAttributes", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallPostReceiptData", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lcom/revenuecat/purchases/common/PostReceiptDataSuccessCallback;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "postReceiptData", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;Lu00/k;Lu00/o;)V", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;", "getOfferings", "(Ljava/lang/String;ZLu00/n;Lu00/n;)V", "newAppUserID", "onSuccessHandler", "onErrorHandler", "logIn", "(Ljava/lang/String;Ljava/lang/String;Lu00/n;Lu00/k;)V", "oldAppUserID", "Lkotlin/Function0;", "aliasUsers", "(Ljava/lang/String;Ljava/lang/String;Lu00/a;Lu00/k;)V", "", "diagnosticsList", "postDiagnostics", "(Ljava/util/List;Lu00/k;Lu00/n;)V", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "paywallEventRequest", "Ljava/net/URL;", "baseURL", "Lcom/revenuecat/purchases/common/Delay;", "delay", "postEvents", "(Lcom/revenuecat/purchases/common/events/EventsRequest;Ljava/net/URL;Lcom/revenuecat/purchases/common/Delay;Lu00/a;Lu00/n;)V", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "getProductEntitlementMapping", "(Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "getCustomerCenterConfig", "(Ljava/lang/String;Lu00/k;Lu00/k;)V", "email", "description", "postCreateSupportTicket", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu00/k;Lu00/k;)V", "redemptionToken", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "onResultHandler", "postRedeemWebPurchase", "(Ljava/lang/String;Ljava/lang/String;Lu00/k;)V", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "getVirtualCurrencies", "(Ljava/lang/String;ZLu00/k;Lu00/k;)V", "", "productIds", "Lcom/revenuecat/purchases/common/networking/WebBillingProductsResponse;", "getWebBillingProducts", "(Ljava/lang/String;Ljava/util/Set;Lu00/k;Lu00/k;)V", "clearCaches", "", "responseCode", "purchasesError", "determinePostReceiptErrorHandlingBehavior", "(ILcom/revenuecat/purchases/PurchasesError;)Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "S", "E", "", "Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;", "", "Lg00/k;", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "call", "cacheKey", "functions", "addBackgroundAwareCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;Lg00/k;Lcom/revenuecat/purchases/common/Delay;)V", "K", "F", "addCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Ljava/lang/Object;Ljava/lang/Object;Lcom/revenuecat/purchases/common/Delay;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/HTTPClient;", "Lcom/revenuecat/purchases/common/BackendHelper;", "Lcom/revenuecat/purchases/common/CustomerInfoCallback;", "<set-?>", "callbacks", "Ljava/util/Map;", "getCallbacks", "()Ljava/util/Map;", "setCallbacks", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/common/CallbackCacheKey;", "Lcom/revenuecat/purchases/common/PostReceiptCallback;", "postReceiptCallbacks", "getPostReceiptCallbacks", "setPostReceiptCallbacks", "Lcom/revenuecat/purchases/common/OfferingsCallback;", "offeringsCallbacks", "getOfferingsCallbacks", "setOfferingsCallbacks", "Lcom/revenuecat/purchases/common/IdentifyCallback;", "identifyCallbacks", "getIdentifyCallbacks", "setIdentifyCallbacks", "Lcom/revenuecat/purchases/common/AliasCallback;", "aliasCallbacks", "getAliasCallbacks", "setAliasCallbacks", "Lcom/revenuecat/purchases/common/DiagnosticsCallback;", "diagnosticsCallbacks", "getDiagnosticsCallbacks", "setDiagnosticsCallbacks", "Lcom/revenuecat/purchases/common/PaywallEventsCallback;", "paywallEventsCallbacks", "getPaywallEventsCallbacks", "setPaywallEventsCallbacks", "Lcom/revenuecat/purchases/common/ProductEntitlementCallback;", "productEntitlementCallbacks", "getProductEntitlementCallbacks", "setProductEntitlementCallbacks", "Lcom/revenuecat/purchases/common/CustomerCenterCallback;", "customerCenterCallbacks", "getCustomerCenterCallbacks", "setCustomerCenterCallbacks", "Lcom/revenuecat/purchases/common/CreateSupportTicketCallback;", "createSupportTicketCallbacks", "getCreateSupportTicketCallbacks", "setCreateSupportTicketCallbacks", "Lcom/revenuecat/purchases/common/RedeemWebPurchaseCallback;", "redeemWebPurchaseCallbacks", "getRedeemWebPurchaseCallbacks", "setRedeemWebPurchaseCallbacks", "Lcom/revenuecat/purchases/common/VirtualCurrenciesCallback;", "virtualCurrenciesCallbacks", "getVirtualCurrenciesCallbacks", "setVirtualCurrenciesCallbacks", "Lcom/revenuecat/purchases/common/WebBillingProductsCallback;", "webBillingProductsCallbacks", "getWebBillingProductsCallbacks", "setWebBillingProductsCallbacks", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "verificationMode", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Backend {
    private static final String APP_USER_ID = "app_user_id";
    private static final String FETCH_TOKEN = "fetch_token";
    private static final String NEW_APP_USER_ID = "new_app_user_id";
    private static final int POST_RECEIPT_PAYLOAD_VERSION = 1;
    private volatile Map<List<String>, List<k>> aliasCallbacks;
    private final AppConfig appConfig;
    private final BackendHelper backendHelper;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<k>> callbacks;
    private volatile Map<String, List<k>> createSupportTicketCallbacks;
    private volatile Map<String, List<k>> customerCenterCallbacks;
    private volatile Map<List<String>, List<k>> diagnosticsCallbacks;
    private final Dispatcher dispatcher;
    private final Dispatcher eventsDispatcher;
    private final HTTPClient httpClient;
    private volatile Map<List<String>, List<k>> identifyCallbacks;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<k>> offeringsCallbacks;
    private volatile Map<List<String>, List<k>> paywallEventsCallbacks;
    private volatile Map<List<String>, List<k>> postReceiptCallbacks;
    private volatile Map<String, List<k>> productEntitlementCallbacks;
    private volatile Map<String, List<u00.k>> redeemWebPurchaseCallbacks;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<k>> virtualCurrenciesCallbacks;
    private volatile Map<String, List<k>> webBillingProductsCallbacks;

    public static final Companion INSTANCE = new Companion(null);
    private static final c json = d.c(Backend$Companion$json$1.INSTANCE);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/Backend$Companion;", "", "<init>", "()V", "Lq40/c;", "json", "Lq40/c;", "getJson$purchases_defaultsBc8Release", "()Lq40/c;", "getJson$purchases_defaultsBc8Release$annotations", "", "APP_USER_ID", "Ljava/lang/String;", "FETCH_TOKEN", "NEW_APP_USER_ID", "", "POST_RECEIPT_PAYLOAD_VERSION", "I", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public static void getJson$purchases_defaultsBc8Release$annotations() {
        }

        public final c getJson$purchases_defaultsBc8Release() {
            return Backend.json;
        }
    }

    public Backend(AppConfig appConfig, Dispatcher dispatcher, Dispatcher eventsDispatcher, HTTPClient httpClient, BackendHelper backendHelper) {
        m.e(appConfig, "appConfig");
        m.e(dispatcher, "dispatcher");
        m.e(eventsDispatcher, "eventsDispatcher");
        m.e(httpClient, "httpClient");
        m.e(backendHelper, "backendHelper");
        this.appConfig = appConfig;
        this.dispatcher = dispatcher;
        this.eventsDispatcher = eventsDispatcher;
        this.httpClient = httpClient;
        this.backendHelper = backendHelper;
        this.callbacks = new LinkedHashMap();
        this.postReceiptCallbacks = new LinkedHashMap();
        this.offeringsCallbacks = new LinkedHashMap();
        this.identifyCallbacks = new LinkedHashMap();
        this.aliasCallbacks = new LinkedHashMap();
        this.diagnosticsCallbacks = new LinkedHashMap();
        this.paywallEventsCallbacks = new LinkedHashMap();
        this.productEntitlementCallbacks = new LinkedHashMap();
        this.customerCenterCallbacks = new LinkedHashMap();
        this.createSupportTicketCallbacks = new LinkedHashMap();
        this.redeemWebPurchaseCallbacks = new LinkedHashMap();
        this.virtualCurrenciesCallbacks = new LinkedHashMap();
        this.webBillingProductsCallbacks = new LinkedHashMap();
    }

    private final synchronized <S, E> void addBackgroundAwareCallback(Map<BackgroundAwareCallbackCacheKey, List<k>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, k kVar, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        try {
            BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, false, 1, null);
            boolean zContainsKey = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
            if (backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITHOUT_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1)));
                }
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKeyCopy$default;
            } else {
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
            }
            addCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey2, kVar, delay);
            BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, true, 1, null);
            boolean zContainsKey2 = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
            if (!backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey2) {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel2.name(), String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITH_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1)));
                }
                List<k> listRemove = map.remove(backgroundAwareCallbackCacheKeyCopy$default2);
                if (listRemove != null) {
                    List<k> list = listRemove.isEmpty() ? null : listRemove;
                    if (list != null) {
                        if (map.containsKey(backgroundAwareCallbackCacheKey)) {
                            List<k> list2 = map.get(backgroundAwareCallbackCacheKey);
                            if (list2 != null) {
                                list2.addAll(list);
                            }
                        } else {
                            map.put(backgroundAwareCallbackCacheKey, list);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, k kVar, Delay delay, int i, Object obj) {
        if ((i & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey, kVar, delay);
    }

    private final <K, F> void addCallback(Map<K, List<F>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, K k, F f, Delay delay) {
        if (!map.containsKey(k)) {
            map.put(k, a.W(new Object[]{f}));
            this.backendHelper.enqueue(asyncCall, dispatcher, delay);
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k}, 1)));
        }
        List<F> list = map.get(k);
        m.b(list);
        list.add(f);
    }

    public static void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, Object obj2, Delay delay, int i, Object obj3) {
        if ((i & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher, obj, obj2, delay);
    }

    public final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int responseCode, PurchasesError purchasesError) {
        if (RCHTTPStatusCodes.INSTANCE.isServerError(responseCode)) {
            return PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME;
        }
        return purchasesError.getCode() == PurchasesErrorCode.UnsupportedError ? PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME : PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED;
    }

    public final void aliasUsers(final String oldAppUserID, final String newAppUserID, u00.a onSuccessHandler, u00.k onErrorHandler) {
        Backend backend;
        m.e(oldAppUserID, "oldAppUserID");
        m.e(newAppUserID, "newAppUserID");
        m.e(onSuccessHandler, "onSuccessHandler");
        m.e(onErrorHandler, "onErrorHandler");
        final List listC0 = n.C0(new String[]{oldAppUserID, newAppUserID});
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.httpClient, this.appConfig.getBaseURL(), new Endpoint.AliasUsers(oldAppUserID), d0.R(new k("app_user_id", oldAppUserID), new k("new_app_user_id", newAppUserID)), null, this.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                if (!BackendHelperKt.isSuccessful(result)) {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                    LogUtilsKt.errorLog(purchasesError);
                    onError(purchasesError);
                    return;
                }
                Backend backend2 = this;
                List<String> list = listC0;
                synchronized (backend2) {
                    listRemove = backend2.getAliasCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.a) ((k) it.next()).A).invoke();
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this;
                List<String> list = listC0;
                synchronized (backend2) {
                    listRemove = backend2.getAliasCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.k) ((k) it.next()).B).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                backend = this;
                try {
                    addCallback$default(backend, this.aliasCallbacks, asyncCall, this.dispatcher, listC0, new k(onSuccessHandler, onErrorHandler), null, 16, null);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                backend = this;
            }
        }
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map<List<String>, List<k>> getAliasCallbacks() {
        return this.aliasCallbacks;
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<k>> getCallbacks() {
        return this.callbacks;
    }

    public final synchronized Map<String, List<k>> getCreateSupportTicketCallbacks() {
        return this.createSupportTicketCallbacks;
    }

    public final synchronized Map<String, List<k>> getCustomerCenterCallbacks() {
        return this.customerCenterCallbacks;
    }

    public final void getCustomerCenterConfig(String appUserID, u00.k onSuccessHandler, u00.k onErrorHandler) {
        Backend backend;
        m.e(appUserID, "appUserID");
        m.e(onSuccessHandler, "onSuccessHandler");
        m.e(onErrorHandler, "onErrorHandler");
        final Endpoint.GetCustomerCenterConfig getCustomerCenterConfig = new Endpoint.GetCustomerCenterConfig(appUserID);
        final String path$default = Endpoint.getPath$default(getCustomerCenterConfig, false, 1, null);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getCustomerCenterConfig, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend2 = this.this$0;
                String str = path$default;
                synchronized (backend2) {
                    listRemove = backend2.getCustomerCenterCallbacks().remove(str);
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.k kVar2 = (u00.k) kVar.A;
                        u00.k kVar3 = (u00.k) kVar.B;
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                c json$purchases_defaultsBc8Release = Backend.INSTANCE.getJson$purchases_defaultsBc8Release();
                                String payload = result.getPayload();
                                json$purchases_defaultsBc8Release.getClass();
                                kVar2.invoke(((CustomerCenterRoot) json$purchases_defaultsBc8Release.b(payload, CustomerCenterRoot.INSTANCE.serializer())).getCustomerCenter());
                            } catch (SerializationException e) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                kVar3.invoke(purchasesError);
                            } catch (IllegalArgumentException e2) {
                                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e2);
                                LogUtilsKt.errorLog(purchasesError2);
                                kVar3.invoke(purchasesError2);
                            }
                        } else {
                            PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError3);
                            kVar3.invoke(purchasesError3);
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this.this$0;
                String str = path$default;
                synchronized (backend2) {
                    listRemove = backend2.getCustomerCenterCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.k) ((k) it.next()).B).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                backend = this;
                try {
                    backend.addCallback(this.customerCenterCallbacks, asyncCall, this.dispatcher, path$default, new k(onSuccessHandler, onErrorHandler), Delay.NONE);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                backend = this;
            }
        }
    }

    public final void getCustomerInfo(String appUserID, boolean appInBackground, u00.k onSuccess, u00.n onError) {
        Throwable th;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        Throwable th2;
        Backend backend;
        Delay delay;
        m.e(appUserID, "appUserID");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        final Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(appUserID);
        String path$default = Endpoint.getPath$default(getCustomerInfo, false, 1, null);
        synchronized (this) {
            try {
                if (this.postReceiptCallbacks.isEmpty()) {
                    try {
                        backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(a.R(path$default), appInBackground);
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(q.Z0(String.valueOf(this.callbacks.size()), a.R(path$default)), appInBackground);
                }
                final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
                    @Override
                    public HTTPResult call() {
                        return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getCustomerInfo, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
                    }

                    @Override
                    public void onCompletion(HTTPResult result) {
                        List<k> listRemove;
                        m.e(result, "result");
                        Backend backend2 = this.this$0;
                        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey2;
                        synchronized (backend2) {
                            listRemove = backend2.getCallbacks().remove(backgroundAwareCallbackCacheKey3);
                        }
                        if (listRemove != null) {
                            for (k kVar : listRemove) {
                                u00.k kVar2 = (u00.k) kVar.A;
                                u00.n nVar = (u00.n) kVar.B;
                                try {
                                    if (BackendHelperKt.isSuccessful(result)) {
                                        kVar2.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result));
                                    } else {
                                        PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                        LogUtilsKt.errorLog(purchasesError);
                                        nVar.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode())));
                                    }
                                } catch (JSONException e) {
                                    PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e);
                                    LogUtilsKt.errorLog(purchasesError2);
                                    nVar.invoke(purchasesError2, Boolean.FALSE);
                                }
                            }
                        }
                    }

                    @Override
                    public void onError(PurchasesError error) {
                        List<k> listRemove;
                        m.e(error, "error");
                        Backend backend2 = this.this$0;
                        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey2;
                        synchronized (backend2) {
                            listRemove = backend2.getCallbacks().remove(backgroundAwareCallbackCacheKey3);
                        }
                        if (listRemove != null) {
                            Iterator<T> it = listRemove.iterator();
                            while (it.hasNext()) {
                                ((u00.n) ((k) it.next()).B).invoke(error, Boolean.FALSE);
                            }
                        }
                    }
                };
                synchronized (this) {
                    if (appInBackground) {
                        try {
                            delay = Delay.DEFAULT;
                        } catch (Throwable th4) {
                            th2 = th4;
                            backend = this;
                            throw th2;
                        }
                    } else {
                        try {
                            delay = Delay.NONE;
                        } catch (Throwable th5) {
                            th = th5;
                            backend = this;
                            th2 = th;
                            throw th2;
                        }
                    }
                    try {
                        backend = this;
                        try {
                            backend.addBackgroundAwareCallback(this.callbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey2, new k(onSuccess, onError), delay);
                        } catch (Throwable th6) {
                            th = th6;
                            th2 = th;
                            throw th2;
                        }
                    } catch (Throwable th7) {
                        backend = this;
                        th2 = th7;
                        throw th2;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    public final synchronized Map<List<String>, List<k>> getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map<List<String>, List<k>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String appUserID, boolean appInBackground, u00.n onSuccess, u00.n onError) {
        Delay delay;
        Backend backend;
        Throwable th;
        m.e(appUserID, "appUserID");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        final Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(appUserID);
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(a.R(Endpoint.getPath$default(getOfferings, false, 1, null)), appInBackground);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getOfferings, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend2 = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend2) {
                    listRemove = backend2.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.n nVar = (u00.n) kVar.A;
                        u00.n nVar2 = (u00.n) kVar.B;
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                nVar.invoke(result.getBody(), HTTPResponseOriginalSourceKt.getOriginalDataSource(result));
                            } catch (JSONException e) {
                                GetOfferingsErrorHandlingBehavior getOfferingsErrorHandlingBehavior = GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS;
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                nVar2.invoke(purchasesError, getOfferingsErrorHandlingBehavior);
                            }
                        } else {
                            GetOfferingsErrorHandlingBehavior getOfferingsErrorHandlingBehavior2 = RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode()) ? GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS : GetOfferingsErrorHandlingBehavior.SHOULD_NOT_FALLBACK;
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError2);
                            nVar2.invoke(purchasesError2, getOfferingsErrorHandlingBehavior2);
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend2) {
                    listRemove = backend2.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.n) ((k) it.next()).B).invoke(error, GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS);
                    }
                }
            }
        };
        synchronized (this) {
            if (appInBackground) {
                try {
                    delay = Delay.DEFAULT;
                } catch (Throwable th2) {
                    th = th2;
                    backend = this;
                    throw th;
                }
            } else {
                try {
                    delay = Delay.NONE;
                } catch (Throwable th3) {
                    th = th3;
                    backend = this;
                    th = th;
                    throw th;
                }
            }
            try {
                backend = this;
                try {
                    backend.addBackgroundAwareCallback(this.offeringsCallbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, new k(onSuccess, onError), delay);
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    throw th;
                }
            } catch (Throwable th5) {
                backend = this;
                th = th5;
                throw th;
            }
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<k>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<k>> getPaywallEventsCallbacks() {
        return this.paywallEventsCallbacks;
    }

    public final synchronized Map<List<String>, List<k>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map<String, List<k>> getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(u00.k onSuccessHandler, u00.k onErrorHandler) {
        Backend backend;
        m.e(onSuccessHandler, "onSuccessHandler");
        m.e(onErrorHandler, "onErrorHandler");
        final Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        final String path$default = Endpoint.getPath$default(getProductEntitlementMapping, false, 1, null);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getProductEntitlementMapping, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend2 = this.this$0;
                String str = path$default;
                synchronized (backend2) {
                    listRemove = backend2.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.k kVar2 = (u00.k) kVar.A;
                        u00.k kVar3 = (u00.k) kVar.B;
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                kVar2.invoke(ProductEntitlementMapping.INSTANCE.fromNetwork$purchases_defaultsBc8Release(result.getBody(), result));
                            } catch (JSONException e) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                kVar3.invoke(purchasesError);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError2);
                            kVar3.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this.this$0;
                String str = path$default;
                synchronized (backend2) {
                    listRemove = backend2.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.k) ((k) it.next()).B).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                backend = this;
                try {
                    backend.addCallback(this.productEntitlementCallbacks, asyncCall, this.dispatcher, path$default, new k(onSuccessHandler, onErrorHandler), Delay.LONG);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                backend = this;
            }
        }
    }

    public final synchronized Map<String, List<u00.k>> getRedeemWebPurchaseCallbacks() {
        return this.redeemWebPurchaseCallbacks;
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void getVirtualCurrencies(String appUserID, boolean appInBackground, u00.k onSuccess, u00.k onError) throws Throwable {
        Delay delay;
        Backend backend;
        Throwable th;
        m.e(appUserID, "appUserID");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        final Endpoint.GetVirtualCurrencies getVirtualCurrencies = new Endpoint.GetVirtualCurrencies(appUserID);
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(a.R(Endpoint.getPath$default(getVirtualCurrencies, false, 1, null)), appInBackground);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), getVirtualCurrencies, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend2 = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend2) {
                    listRemove = backend2.getVirtualCurrenciesCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.k kVar2 = (u00.k) kVar.A;
                        u00.k kVar3 = (u00.k) kVar.B;
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                kVar2.invoke(VirtualCurrenciesFactory.INSTANCE.buildVirtualCurrencies(result));
                            } catch (SerializationException e) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                kVar3.invoke(purchasesError);
                            } catch (IllegalArgumentException e2) {
                                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e2);
                                LogUtilsKt.errorLog(purchasesError2);
                                kVar3.invoke(purchasesError2);
                            } catch (JSONException e3) {
                                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(e3);
                                LogUtilsKt.errorLog(purchasesError3);
                                kVar3.invoke(purchasesError3);
                            }
                        } else {
                            PurchasesError purchasesError4 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError4);
                            kVar3.invoke(purchasesError4);
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend2) {
                    listRemove = backend2.getVirtualCurrenciesCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.k) ((k) it.next()).B).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            if (appInBackground) {
                try {
                    delay = Delay.DEFAULT;
                } catch (Throwable th2) {
                    th = th2;
                    backend = this;
                    throw th;
                }
            } else {
                try {
                    delay = Delay.NONE;
                } catch (Throwable th3) {
                    th = th3;
                    backend = this;
                    th = th;
                    throw th;
                }
            }
            try {
                backend = this;
                try {
                    backend.addBackgroundAwareCallback(this.virtualCurrenciesCallbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, new k(onSuccess, onError), delay);
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    throw th;
                }
            } catch (Throwable th5) {
                backend = this;
                th = th5;
                throw th;
            }
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<k>> getVirtualCurrenciesCallbacks() {
        return this.virtualCurrenciesCallbacks;
    }

    public final void getWebBillingProducts(String appUserID, Set<String> productIds, u00.k onSuccess, u00.k onError) throws Throwable {
        Backend backend;
        m.e(appUserID, "appUserID");
        m.e(productIds, "productIds");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        final Endpoint.WebBillingGetProducts webBillingGetProducts = new Endpoint.WebBillingGetProducts(appUserID, productIds);
        final String path$default = Endpoint.getPath$default(webBillingGetProducts, false, 1, null);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), webBillingGetProducts, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend2 = this.this$0;
                String str = path$default;
                synchronized (backend2) {
                    listRemove = backend2.getWebBillingProductsCallbacks().remove(str);
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.k kVar2 = (u00.k) kVar.A;
                        u00.k kVar3 = (u00.k) kVar.B;
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                c json$purchases_defaultsBc8Release = Backend.INSTANCE.getJson$purchases_defaultsBc8Release();
                                String payload = result.getPayload();
                                json$purchases_defaultsBc8Release.getClass();
                                kVar2.invoke((WebBillingProductsResponse) json$purchases_defaultsBc8Release.b(payload, WebBillingProductsResponse.INSTANCE.serializer()));
                            } catch (SerializationException e) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                kVar3.invoke(purchasesError);
                            } catch (IllegalArgumentException e2) {
                                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e2);
                                LogUtilsKt.errorLog(purchasesError2);
                                kVar3.invoke(purchasesError2);
                            }
                        } else {
                            PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError3);
                            kVar3.invoke(purchasesError3);
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this.this$0;
                String str = path$default;
                synchronized (backend2) {
                    listRemove = backend2.getWebBillingProductsCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.k) ((k) it.next()).B).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                backend = this;
                try {
                    backend.addCallback(this.webBillingProductsCallbacks, asyncCall, this.dispatcher, path$default, new k(onSuccess, onError), Delay.NONE);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                backend = this;
            }
        }
    }

    public final synchronized Map<String, List<k>> getWebBillingProductsCallbacks() {
        return this.webBillingProductsCallbacks;
    }

    public final void logIn(final String appUserID, final String newAppUserID, u00.n onSuccessHandler, u00.k onErrorHandler) {
        Backend backend;
        m.e(appUserID, "appUserID");
        m.e(newAppUserID, "newAppUserID");
        m.e(onSuccessHandler, "onSuccessHandler");
        m.e(onErrorHandler, "onErrorHandler");
        final List listC0 = n.C0(new String[]{appUserID, newAppUserID});
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.httpClient, this.appConfig.getBaseURL(), Endpoint.LogIn.INSTANCE, d0.R(new k("app_user_id", appUserID), new k("new_app_user_id", newAppUserID)), a.S(new k[]{new k("app_user_id", appUserID), new k("new_app_user_id", newAppUserID)}), this.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                if (!BackendHelperKt.isSuccessful(result)) {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                    LogUtilsKt.errorLog(purchasesError);
                    onError(purchasesError);
                    return;
                }
                Backend backend2 = this;
                List<String> list = listC0;
                synchronized (backend2) {
                    listRemove = backend2.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.n nVar = (u00.n) kVar.A;
                        u00.k kVar2 = (u00.k) kVar.B;
                        boolean z = result.getResponseCode() == 201;
                        if (result.getBody().length() > 0) {
                            nVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result), Boolean.valueOf(z));
                        } else {
                            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                            LogUtilsKt.errorLog(purchasesError2);
                            kVar2.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this;
                List<String> list = listC0;
                synchronized (backend2) {
                    listRemove = backend2.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.k) ((k) it.next()).B).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                backend = this;
                try {
                    addCallback$default(backend, this.identifyCallbacks, asyncCall, this.dispatcher, listC0, new k(onSuccessHandler, onErrorHandler), null, 16, null);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                backend = this;
            }
        }
    }

    public final void postCreateSupportTicket(String appUserID, String email, String description, u00.k onSuccessHandler, u00.k onErrorHandler) {
        m.e(appUserID, "appUserID");
        m.e(email, "email");
        m.e(description, "description");
        m.e(onSuccessHandler, "onSuccessHandler");
        m.e(onErrorHandler, "onErrorHandler");
        final Endpoint.PostCreateSupportTicket postCreateSupportTicket = Endpoint.PostCreateSupportTicket.INSTANCE;
        final String path$default = Endpoint.getPath$default(postCreateSupportTicket, false, 1, null);
        final Map mapR = d0.R(new k(APP_USER_ID, appUserID), new k("customer_email", email), new k("issue_description", description));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), postCreateSupportTicket, mapR, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend = this.this$0;
                String str = path$default;
                synchronized (backend) {
                    listRemove = backend.getCreateSupportTicketCallbacks().remove(str);
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.k kVar2 = (u00.k) kVar.A;
                        u00.k kVar3 = (u00.k) kVar.B;
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                kVar2.invoke(Boolean.valueOf(result.getBody().optBoolean("sent", false)));
                            } catch (SerializationException e) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                kVar3.invoke(purchasesError);
                            } catch (IllegalArgumentException e2) {
                                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e2);
                                LogUtilsKt.errorLog(purchasesError2);
                                kVar3.invoke(purchasesError2);
                            }
                        } else {
                            PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError3);
                            kVar3.invoke(purchasesError3);
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend = this.this$0;
                String str = path$default;
                synchronized (backend) {
                    listRemove = backend.getCreateSupportTicketCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.k) ((k) it.next()).B).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.createSupportTicketCallbacks, asyncCall, this.dispatcher, path$default, new k(onSuccessHandler, onErrorHandler), Delay.NONE);
        }
    }

    public final void postDiagnostics(List<? extends JSONObject> diagnosticsList, u00.k onSuccessHandler, u00.n onErrorHandler) throws Throwable {
        Backend backend;
        m.e(diagnosticsList, "diagnosticsList");
        m.e(onSuccessHandler, "onSuccessHandler");
        m.e(onErrorHandler, "onErrorHandler");
        final ArrayList arrayList = new ArrayList(r.q0(diagnosticsList, 10));
        Iterator<T> it = diagnosticsList.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((JSONObject) it.next()).hashCode()));
        }
        final Map mapQ = d0.Q(new k("entries", new JSONArray((Collection) diagnosticsList)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, AppConfig.INSTANCE.getDiagnosticsURL(), Endpoint.PostDiagnostics.INSTANCE, mapQ, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend2 = this.this$0;
                List<String> list = arrayList;
                synchronized (backend2) {
                    listRemove = backend2.getDiagnosticsCallbacks().remove(list);
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.k kVar2 = (u00.k) kVar.A;
                        u00.n nVar = (u00.n) kVar.B;
                        if (BackendHelperKt.isSuccessful(result)) {
                            kVar2.invoke(result.getBody());
                        } else {
                            PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                            nVar.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode()) || purchasesError.getCode() == PurchasesErrorCode.NetworkError));
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this.this$0;
                List<String> list = arrayList;
                synchronized (backend2) {
                    listRemove = backend2.getDiagnosticsCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        ((u00.n) ((k) it2.next()).B).invoke(error, Boolean.valueOf(error.getCode() == PurchasesErrorCode.NetworkError));
                    }
                }
            }
        };
        synchronized (this) {
            try {
                backend = this;
                try {
                    backend.addCallback(this.diagnosticsCallbacks, asyncCall, this.eventsDispatcher, arrayList, new k(onSuccessHandler, onErrorHandler), Delay.LONG);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                backend = this;
            }
        }
    }

    public final void postEvents(final EventsRequest paywallEventRequest, final URL baseURL, Delay delay, u00.a onSuccessHandler, u00.n onErrorHandler) {
        Backend backend;
        m.e(paywallEventRequest, "paywallEventRequest");
        m.e(baseURL, "baseURL");
        m.e(delay, "delay");
        m.e(onSuccessHandler, "onSuccessHandler");
        m.e(onErrorHandler, "onErrorHandler");
        c defaultJson = JsonProvider.INSTANCE.getDefaultJson();
        defaultJson.getClass();
        final Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(defaultJson.c(EventsRequest.INSTANCE.serializer(), paywallEventRequest));
        if (mapAsMap == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Error encoding paywall event request");
            LogUtilsKt.errorLog(purchasesError);
            onErrorHandler.invoke(purchasesError, Boolean.TRUE);
            return;
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, baseURL, Endpoint.PostEvents.INSTANCE, mapAsMap, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend2 = this.this$0;
                EventsRequest eventsRequest = paywallEventRequest;
                synchronized (backend2) {
                    listRemove = backend2.getPaywallEventsCallbacks().remove(eventsRequest.getCacheKey());
                }
                if (listRemove != null) {
                    for (k kVar : listRemove) {
                        u00.a aVar = (u00.a) kVar.A;
                        u00.n nVar = (u00.n) kVar.B;
                        if (BackendHelperKt.isSuccessful(result)) {
                            aVar.invoke();
                        } else {
                            nVar.invoke(ErrorsKt.toPurchasesError(result), Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isSynced(result.getResponseCode())));
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend2 = this.this$0;
                EventsRequest eventsRequest = paywallEventRequest;
                synchronized (backend2) {
                    listRemove = backend2.getPaywallEventsCallbacks().remove(eventsRequest.getCacheKey());
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.n) ((k) it.next()).B).invoke(error, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            try {
                backend = this;
                try {
                    backend.addCallback(this.paywallEventsCallbacks, asyncCall, this.eventsDispatcher, paywallEventRequest.getCacheKey(), new k(onSuccessHandler, onErrorHandler), delay);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                backend = this;
            }
        }
    }

    public final void postReceiptData(String purchaseToken, String appUserID, boolean isRestore, boolean finishTransactions, Map<String, ? extends Map<String, ? extends Object>> subscriberAttributes, ReceiptInfo receiptInfo, PostReceiptInitiationSource initiationSource, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, u00.k onSuccess, o onError) {
        ArrayList arrayList;
        PresentedOfferingContext.TargetingContext targetingContext;
        m.e(purchaseToken, "purchaseToken");
        m.e(appUserID, "appUserID");
        Map<String, ? extends Map<String, ? extends Object>> subscriberAttributes2 = subscriberAttributes;
        m.e(subscriberAttributes2, "subscriberAttributes");
        m.e(receiptInfo, "receiptInfo");
        m.e(initiationSource, "initiationSource");
        m.e(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        final List listC0 = n.C0(new String[]{purchaseToken, appUserID, String.valueOf(isRestore), String.valueOf(finishTransactions), subscriberAttributes2.toString(), receiptInfo.toString(), purchasesAreCompletedBy.toString()});
        k kVar = new k(FETCH_TOKEN, purchaseToken);
        k kVar2 = new k(DiagnosticsTracker.PRODUCT_IDS_KEY, receiptInfo.getProductIDs());
        k kVar3 = new k("platform_product_ids", receiptInfo.getPlatformProductIds());
        k kVar4 = new k(APP_USER_ID, appUserID);
        k kVar5 = new k("is_restore", Boolean.valueOf(isRestore));
        PresentedOfferingContext presentedOfferingContext = receiptInfo.getPresentedOfferingContext();
        k kVar6 = new k("presented_offering_identifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = receiptInfo.getPresentedOfferingContext();
        k kVar7 = new k("presented_placement_identifier", presentedOfferingContext2 != null ? presentedOfferingContext2.getPlacementIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext3 = receiptInfo.getPresentedOfferingContext();
        k kVar8 = new k("applied_targeting_rule", (presentedOfferingContext3 == null || (targetingContext = presentedOfferingContext3.getTargetingContext()) == null) ? null : d0.R(new k("revision", Integer.valueOf(targetingContext.getRevision())), new k("rule_id", targetingContext.getRuleId())));
        k kVar9 = new k("observer_mode", Boolean.valueOf(!finishTransactions));
        String lowerCase = purchasesAreCompletedBy.name().toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        k kVar10 = new k("purchase_completed_by", lowerCase);
        k kVar11 = new k("price", receiptInfo.getPrice());
        k kVar12 = new k("currency", receiptInfo.getCurrency());
        if (subscriberAttributes2.isEmpty() || this.appConfig.getCustomEntitlementComputation()) {
            subscriberAttributes2 = null;
        }
        k kVar13 = new k("attributes", subscriberAttributes2);
        k kVar14 = new k("normal_duration", receiptInfo.getDuration());
        k kVar15 = new k("store_user_id", receiptInfo.getStoreUserID());
        List<PricingPhase> pricingPhases = receiptInfo.getPricingPhases();
        if (pricingPhases != null) {
            arrayList = new ArrayList(r.q0(pricingPhases, 10));
            Iterator<T> it = pricingPhases.iterator();
            while (it.hasNext()) {
                arrayList.add(BackendKt.toMap((PricingPhase) it.next()));
            }
        } else {
            arrayList = null;
        }
        k kVar16 = new k("pricing_phases", arrayList);
        ReplacementMode replacementMode = receiptInfo.getReplacementMode();
        final Map mapFilterNotNullValues = MapExtensionsKt.filterNotNullValues(d0.R(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, new k("proration_mode", replacementMode != null ? ReplacementModeKt.getBackendName(replacementMode) : null), new k("initiation_source", initiationSource.getPostReceiptFieldValue()), new k("paywall", paywallPostReceiptData != null ? paywallPostReceiptData.toMap() : null), new k("sdk_originated", Boolean.valueOf(receiptInfo.getSdkOriginated())), new k("payload_version", 1)));
        final List listS = a.S(new k[]{new k(APP_USER_ID, appUserID), new k(FETCH_TOKEN, purchaseToken)});
        final Map mapFilterNotNullValues2 = MapExtensionsKt.filterNotNullValues(d0.R(new k("price_string", receiptInfo.getFormattedPrice()), new k("marketplace", receiptInfo.getMarketplace())));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), Endpoint.PostReceipt.INSTANCE, mapFilterNotNullValues, listS, d0.U(this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), mapFilterNotNullValues2), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<k> listRemove;
                m.e(result, "result");
                Backend backend = this.this$0;
                List<String> list = listC0;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Backend backend2 = this.this$0;
                    for (k kVar17 : listRemove) {
                        u00.k kVar18 = (u00.k) kVar17.A;
                        o oVar = (o) kVar17.B;
                        try {
                            if (BackendHelperKt.isSuccessful(result)) {
                                kVar18.invoke(PostReceiptResponseKt.buildPostReceiptResponse(result));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                LogUtilsKt.errorLog(purchasesError);
                                oVar.invoke(purchasesError, backend2.determinePostReceiptErrorHandlingBehavior(result.getResponseCode(), purchasesError), result.getBody());
                            }
                        } catch (JSONException e) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e);
                            LogUtilsKt.errorLog(purchasesError2);
                            oVar.invoke(purchasesError2, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<k> listRemove;
                m.e(error, "error");
                Backend backend = this.this$0;
                List<String> list = listC0;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        ((o) ((k) it2.next()).B).invoke(error, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, asyncCall, this.dispatcher, listC0, new k(onSuccess, onError), null, 16, null);
        }
    }

    public final void postRedeemWebPurchase(String appUserID, String redemptionToken, u00.k onResultHandler) throws Throwable {
        Backend backend;
        m.e(appUserID, "appUserID");
        m.e(redemptionToken, "redemptionToken");
        m.e(onResultHandler, "onResultHandler");
        final Endpoint.PostRedeemWebPurchase postRedeemWebPurchase = Endpoint.PostRedeemWebPurchase.INSTANCE;
        final String path$default = Endpoint.getPath$default(postRedeemWebPurchase, false, 1, null);
        final Map mapR = d0.R(new k("redemption_token", redemptionToken), new k(APP_USER_ID, appUserID));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() {
            @Override
            public HTTPResult call() {
                return HTTPClient.performRequest$default(this.this$0.httpClient, this.this$0.appConfig.getBaseURL(), postRedeemWebPurchase, mapR, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsBc8Release(), false, this.this$0.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override
            public void onCompletion(HTTPResult result) {
                List<u00.k> listRemove;
                m.e(result, "result");
                Backend backend2 = this.this$0;
                String str = path$default;
                synchronized (backend2) {
                    listRemove = backend2.getRedeemWebPurchaseCallbacks().remove(str);
                }
                if (listRemove != null) {
                    for (u00.k kVar : listRemove) {
                        if (BackendHelperKt.isSuccessful(result)) {
                            kVar.invoke(new RedeemWebPurchaseListener.Result.Success(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result)));
                        } else {
                            Integer backendErrorCode = result.getBackendErrorCode();
                            int value = BackendErrorCode.BackendInvalidWebRedemptionToken.getValue();
                            if (backendErrorCode != null && backendErrorCode.intValue() == value) {
                                kVar.invoke(RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE);
                            } else {
                                int value2 = BackendErrorCode.BackendExpiredWebRedemptionToken.getValue();
                                if (backendErrorCode != null && backendErrorCode.intValue() == value2) {
                                    JSONObject body = result.getBody();
                                    JSONObject jSONObjectOptJSONObject = body.optJSONObject("purchase_redemption_error_info");
                                    String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("obfuscated_email") : null;
                                    if (strOptString == null) {
                                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing expired redemption token response: " + body, null);
                                        kVar.invoke(new RedeemWebPurchaseListener.Result.Error(ErrorsKt.toPurchasesError(result)));
                                    } else {
                                        kVar.invoke(new RedeemWebPurchaseListener.Result.Expired(strOptString));
                                    }
                                } else {
                                    int value3 = BackendErrorCode.BackendPurchaseBelongsToOtherUser.getValue();
                                    if (backendErrorCode != null && backendErrorCode.intValue() == value3) {
                                        kVar.invoke(RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE);
                                    } else {
                                        kVar.invoke(new RedeemWebPurchaseListener.Result.Error(ErrorsKt.toPurchasesError(result)));
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override
            public void onError(PurchasesError error) {
                List<u00.k> listRemove;
                m.e(error, "error");
                Backend backend2 = this.this$0;
                String str = path$default;
                synchronized (backend2) {
                    listRemove = backend2.getRedeemWebPurchaseCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((u00.k) it.next()).invoke(new RedeemWebPurchaseListener.Result.Error(error));
                    }
                }
            }
        };
        synchronized (this) {
            try {
                backend = this;
                try {
                    backend.addCallback(this.redeemWebPurchaseCallbacks, asyncCall, this.dispatcher, path$default, onResultHandler, Delay.NONE);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                backend = this;
            }
        }
    }

    public final synchronized void setAliasCallbacks(Map<List<String>, List<k>> map) {
        m.e(map, "<set-?>");
        this.aliasCallbacks = map;
    }

    public final synchronized void setCallbacks(Map<BackgroundAwareCallbackCacheKey, List<k>> map) {
        m.e(map, "<set-?>");
        this.callbacks = map;
    }

    public final synchronized void setCreateSupportTicketCallbacks(Map<String, List<k>> map) {
        m.e(map, "<set-?>");
        this.createSupportTicketCallbacks = map;
    }

    public final synchronized void setCustomerCenterCallbacks(Map<String, List<k>> map) {
        m.e(map, "<set-?>");
        this.customerCenterCallbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map<List<String>, List<k>> map) {
        m.e(map, "<set-?>");
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<k>> map) {
        m.e(map, "<set-?>");
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<BackgroundAwareCallbackCacheKey, List<k>> map) {
        m.e(map, "<set-?>");
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPaywallEventsCallbacks(Map<List<String>, List<k>> map) {
        m.e(map, "<set-?>");
        this.paywallEventsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<k>> map) {
        m.e(map, "<set-?>");
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map<String, List<k>> map) {
        m.e(map, "<set-?>");
        this.productEntitlementCallbacks = map;
    }

    public final synchronized void setRedeemWebPurchaseCallbacks(Map<String, List<u00.k>> map) {
        m.e(map, "<set-?>");
        this.redeemWebPurchaseCallbacks = map;
    }

    public final synchronized void setVirtualCurrenciesCallbacks(Map<BackgroundAwareCallbackCacheKey, List<k>> map) {
        m.e(map, "<set-?>");
        this.virtualCurrenciesCallbacks = map;
    }

    public final synchronized void setWebBillingProductsCallbacks(Map<String, List<k>> map) {
        m.e(map, "<set-?>");
        this.webBillingProductsCallbacks = map;
    }
}
