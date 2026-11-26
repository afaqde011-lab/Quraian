package com.revenuecat.purchases.amazon;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i0;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.LWAConsentStatus;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler;
import com.revenuecat.purchases.amazon.handler.UserDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import g00.b0;
import h00.d0;
import h00.q;
import h00.r;
import h00.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import org.json.JSONException;
import org.json.JSONObject;
import s30.b;
import u00.k;
import va.a;

@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B}\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dBC\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u001e\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001c\u0010\"JT\u0010.\u001a\u00020*2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010&\u001a\u00020$2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0096\u0001¢\u0006\u0004\b.\u0010/J^\u00108\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020)2\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020*042\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0096\u0001¢\u0006\u0004\b8\u00109JD\u0010:\u001a\u00020*2\u001e\u00107\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002050(\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020*042\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0096\u0001¢\u0006\u0004\b:\u0010;J8\u0010<\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020*H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020*2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020*H\u0014¢\u0006\u0004\bD\u0010?JI\u0010I\u001a\u00020*2\u0006\u00102\u001a\u00020$2\u0018\u0010F\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0(\u0012\u0004\u0012\u00020*0'2\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'j\u0002`GH\u0016¢\u0006\u0004\bI\u0010JJO\u0010N\u001a\u00020*2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0016¢\u0006\u0004\bN\u0010OJ[\u0010T\u001a\u00020*2\u0006\u0010Q\u001a\u00020P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020$0#2\u001c\u0010+\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0004\u0012\u00020*0'j\u0002`S2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'j\u0002`GH\u0016¢\u0006\u0004\bT\u0010UJ/\u0010Y\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\u0006\u00108\u001a\u00020E2\u0006\u0010V\u001a\u00020\f2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJO\u0010]\u001a\u00020*2\u0006\u00102\u001a\u00020$2\u0006\u0010Q\u001a\u00020P2\u0006\u0010[\u001a\u00020$2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0016¢\u0006\u0004\b]\u0010^JE\u0010f\u001a\u00020*2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020$2\u0006\u0010`\u001a\u00020_2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\fH\u0016¢\u0006\u0004\bh\u0010iJK\u0010:\u001a\u00020*2\u0006\u00102\u001a\u00020$2\u001e\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020E0j\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0016¢\u0006\u0004\b:\u0010JJ3\u0010o\u001a\u00020*2\u0006\u00101\u001a\u0002002\f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0(2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020*0mH\u0016¢\u0006\u0004\bo\u0010pJ;\u0010q\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*0'2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'j\u0002`GH\u0016¢\u0006\u0004\bq\u0010=J;\u0010s\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020*0'2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'j\u0002`GH\u0016¢\u0006\u0004\bs\u0010=J\u0017\u0010v\u001a\u00020*2\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020*2\u0006\u0010u\u001a\u00020xH\u0016¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020*2\u0006\u0010u\u001a\u00020{H\u0016¢\u0006\u0004\b|\u0010}J\u0018\u0010\u007f\u001a\u00020*2\u0006\u0010u\u001a\u00020~H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001JF\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020E0j*\b\u0012\u0004\u0012\u0002050(2\u0013\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0j2\u0007\u0010\u0082\u0001\u001a\u000206H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001d\u0010\u0086\u0001\u001a\u0004\u0018\u00010$2\u0007\u0010u\u001a\u00030\u0085\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J'\u0010\u0089\u0001\u001a\u00020*2\u0013\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020,0jH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001JM\u0010:\u001a\u00020*2\u0007\u0010\u008b\u0001\u001a\u00020\f2\u001e\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020E0j\u0012\u0004\u0012\u00020*0'2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0'H\u0002¢\u0006\u0005\b:\u0010\u008c\u0001J\\\u0010\u008f\u0001\u001a\u00020*2\u0007\u0010\u008d\u0001\u001a\u00020$2\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u0002050(20\u0010\\\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0j\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020,0j\u0012\u0004\u0012\u00020*04H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J6\u0010\u0092\u0001\u001a\u00020*2\u0007\u0010\u0091\u0001\u001a\u0002052\u0007\u0010\u0082\u0001\u001a\u0002062\u0006\u00103\u001a\u00020)2\b\u0010d\u001a\u0004\u0018\u00010cH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0095\u0001\u001a\u00020*2\u0007\u0010\u0094\u0001\u001a\u00020,H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0097\u0001\u0010iJ)\u0010\u0099\u0001\u001a\u00020*2\u0015\u0010\u0098\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020*0'H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020*H\u0002¢\u0006\u0005\b\u009b\u0001\u0010?J\u001c\u0010\u009e\u0001\u001a\u00020*2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J4\u0010¤\u0001\u001a\u00020*2\u0007\u0010 \u0001\u001a\u00020\f2\b\u0010¢\u0001\u001a\u00030¡\u00012\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J6\u0010¦\u0001\u001a\u00020*2\u0007\u0010 \u0001\u001a\u00020\f2\b\u0010¢\u0001\u001a\u00030¡\u00012\u000f\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010(H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¨\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010©\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010ª\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010«\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¬\u0001R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u00ad\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010®\u0001R\u0015\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010¯\u0001R\u0015\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010°\u0001R\u0015\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010±\u0001R\u0015\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010²\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010³\u0001R\u0019\u0010´\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010«\u0001R,\u0010¶\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020*0'0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001¨\u0006¸\u0001"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBilling;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Landroid/content/Context;", "applicationContext", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "amazonBackend", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "cache", "", "finishTransactions", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "stateProvider", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "productDataHandler", "purchaseHandler", "purchaseUpdatesHandler", "userDataHandler", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/amazon/AmazonBackend;Lcom/revenuecat/purchases/amazon/AmazonCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "diagnosticsTracker", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/caching/DeviceCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/common/BackendHelper;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V", "", "", "skus", "marketplace", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lg00/b0;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lu00/k;Lu00/k;)V", "Landroid/app/Activity;", "activity", "appUserID", "storeProduct", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Lu00/n;Lu00/k;)V", "queryPurchases", "(Lu00/n;Lu00/k;)V", "getUserData", "(Lu00/k;Lu00/k;)V", "startConnection", "()V", "", "delayMilliseconds", "startConnectionOnMainThread", "(J)V", "endConnection", "Lcom/revenuecat/purchases/models/StoreTransaction;", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lu00/k;Lu00/k;)V", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "productIds", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lu00/k;Lu00/k;)V", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lu00/k;Lu00/k;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "isConnected", "()Z", "", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lu00/a;)V", "getStorefront", "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "getAmazonLWAConsentStatus", "Lcom/amazon/device/iap/model/UserDataResponse;", "response", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "tokensToSkusMap", "userData", "toMapOfReceiptHashesToRestoredPurchases", "(Ljava/util/List;Ljava/util/Map;Lcom/amazon/device/iap/model/UserData;)Ljava/util/Map;", "Lorg/json/JSONObject;", "getTermSkuFromJSON", "(Lorg/json/JSONObject;)Ljava/lang/String;", "errors", "logErrorsIfAny", "(Ljava/util/Map;)V", "filterOnlyActivePurchases", "(ZLu00/k;Lu00/k;)V", "amazonUserID", "receipts", "getMissingSkusForReceipts", "(Ljava/lang/String;Ljava/util/List;Lu00/n;)V", "receipt", "handleReceipt", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "error", "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "shouldFinishTransactions", "request", "executeRequestOnUIThread", "(Lu00/k;)V", "executePendingRequests", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "wasSuccessful", "Ljava/util/Date;", "requestStartTime", "requestedProductIds", "trackAmazonQueryProductDetailsRequestIfNeeded", "(ZLjava/util/Date;Ljava/util/Set;)V", "trackAmazonQueryPurchasesRequestIfNeeded", "(ZLjava/util/Date;Ljava/util/List;)V", "Landroid/content/Context;", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "Z", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/revenuecat/purchases/common/DateProvider;", "connected", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    private final AmazonCache cache;
    private boolean connected;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final boolean finishTransactions;
    private final Handler mainHandler;
    private final ProductDataResponseListener productDataHandler;
    private final PurchaseResponseListener purchaseHandler;
    private final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue<k> serviceRequests;
    private final UserDataResponseListener userDataHandler;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final StoreTransaction $purchase;

        public AnonymousClass1(StoreTransaction storeTransaction) {
            super(1);
            this.$purchase = storeTransaction;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.purchasingServiceProvider.notifyFulfillment(this.$purchase.getPurchaseToken(), FulfillmentResult.FULFILLED);
            } else {
                LogUtilsKt.errorLog(purchasesError);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements k {
        final k $onCompletion;
        final k $onError;
        final String $productId;

        public AnonymousClass2(k kVar, String str, k kVar2) {
            super(1);
            this.$onCompletion = kVar;
            this.$productId = str;
            this.$onError = kVar2;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return b0.a;
        }

        public final void invoke(List<StoreTransaction> it) {
            Object next;
            m.e(it, "it");
            String str = this.$productId;
            Iterator<T> it2 = it.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!m.a(str, ((StoreTransaction) next).getProductIds().get(0)));
            StoreTransaction storeTransaction = (StoreTransaction) next;
            if (storeTransaction != null) {
                this.$onCompletion.invoke(storeTransaction);
                return;
            }
            this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1))));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00771 extends n implements k {
        final k $onError;
        final k $onSuccess;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Lg00/b0;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00071 extends n implements k {
            final k $onError;
            final k $onSuccess;
            final AmazonBilling this$0;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LWAConsentStatus.values().length];
                    try {
                        iArr[LWAConsentStatus.CONSENTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C00071(AmazonBilling amazonBilling, k kVar, k kVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = kVar;
                this.$onError = kVar2;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((UserData) obj);
                return b0.a;
            }

            public final void invoke(UserData userData) {
                AmazonLWAConsentStatus amazonLWAConsentStatus;
                m.e(userData, "userData");
                LWAConsentStatus lWAConsentStatus = userData.getLWAConsentStatus();
                if (lWAConsentStatus == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_LWA_CONSENT_STATUS_NULL_STORE_PROBLEM));
                    return;
                }
                k kVar = this.$onSuccess;
                int i = WhenMappings.$EnumSwitchMapping$0[lWAConsentStatus.ordinal()];
                if (i == 1) {
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.CONSENTED;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    amazonLWAConsentStatus = AmazonLWAConsentStatus.UNAVAILABLE;
                }
                kVar.invoke(amazonLWAConsentStatus);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements k {
            final k $onError;

            public AnonymousClass2(k kVar) {
                super(1);
                this.$onError = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return b0.a;
            }

            public final void invoke(PurchasesError error) {
                m.e(error, "error");
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(BillingStrings.BILLING_AMAZON_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{error}, 1)), null);
                this.$onError.invoke(error);
            }
        }

        public C00771(k kVar, k kVar2) {
            super(1);
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C00071(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
            } else {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(BillingStrings.BILLING_CONNECTION_ERROR_LWA_CONSENT_STATUS, Arrays.copyOf(new Object[]{purchasesError}, 1)), null);
                this.$onError.invoke(purchasesError);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00781 extends n implements k {
        final k $onError;
        final k $onSuccess;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Lg00/b0;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00081 extends n implements k {
            final k $onError;
            final k $onSuccess;
            final AmazonBilling this$0;

            public C00081(AmazonBilling amazonBilling, k kVar, k kVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = kVar;
                this.$onError = kVar2;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((UserData) obj);
                return b0.a;
            }

            public final void invoke(UserData userData) {
                m.e(userData, "userData");
                String marketplace = userData.getMarketplace();
                if (marketplace == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_MARKETPLACE_NULL_STORE_PROBLEM));
                } else {
                    this.$onSuccess.invoke(marketplace);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements k {
            final k $onError;

            public AnonymousClass2(k kVar) {
                super(1);
                this.$onError = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return b0.a;
            }

            public final void invoke(PurchasesError error) {
                m.e(error, "error");
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(BillingStrings.BILLING_AMAZON_ERROR_STOREFRONT, Arrays.copyOf(new Object[]{error}, 1)), null);
                this.$onError.invoke(error);
            }
        }

        public C00781(k kVar, k kVar2) {
            super(1);
            this.$onError = kVar;
            this.$onSuccess = kVar2;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C00081(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
            } else {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(BillingStrings.BILLING_CONNECTION_ERROR_STORE_COUNTRY, Arrays.copyOf(new Object[]{purchasesError}, 1)), null);
                this.$onError.invoke(purchasesError);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Lg00/b0;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00791 extends n implements k {
        final PresentedOfferingContext $presentedOfferingContext;
        final Receipt $receipt;
        final UserData $userData;
        final AmazonBilling this$0;

        public C00791(Receipt receipt, PresentedOfferingContext presentedOfferingContext, UserData userData, AmazonBilling amazonBilling) {
            super(1);
            this.$receipt = receipt;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$userData = userData;
            this.this$0 = amazonBilling;
        }

        @Override
        public Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return b0.a;
        }

        public final void invoke(JSONObject response) throws JSONException {
            m.e(response, "response");
            Object obj = response.get("termSku");
            m.c(obj, "null cannot be cast to non-null type kotlin.String");
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingContext, PurchaseState.PURCHASED, this.$userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(a.R(storeTransaction));
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class C00802 extends j implements k {
        public C00802(Object obj) {
            super(1, 0, AmazonBilling.class, obj, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V");
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError p0) {
            m.e(p0, "p0");
            ((AmazonBilling) this.receiver).onPurchaseError(p0);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00812 extends n implements k {
        final Activity $activity;
        final String $appUserID;
        final PresentedOfferingContext $presentedOfferingContext;
        final AmazonStoreProduct $storeProduct;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/amazon/device/iap/model/Receipt;", "receipt", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lg00/b0;", "invoke", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends n implements u00.n {
            final PresentedOfferingContext $presentedOfferingContext;
            final AmazonStoreProduct $storeProduct;
            final AmazonBilling this$0;

            public AnonymousClass1(AmazonBilling amazonBilling, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
                super(2);
                this.this$0 = amazonBilling;
                this.$storeProduct = amazonStoreProduct;
                this.$presentedOfferingContext = presentedOfferingContext;
            }

            @Override
            public Object invoke(Object obj, Object obj2) {
                invoke((Receipt) obj, (UserData) obj2);
                return b0.a;
            }

            public final void invoke(Receipt receipt, UserData userData) {
                m.e(receipt, "receipt");
                m.e(userData, "userData");
                this.this$0.handleReceipt(receipt, userData, this.$storeProduct, this.$presentedOfferingContext);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00092 extends n implements k {
            final AmazonBilling this$0;

            public C00092(AmazonBilling amazonBilling) {
                super(1);
                this.this$0 = amazonBilling;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return b0.a;
            }

            public final void invoke(PurchasesError it) {
                m.e(it, "it");
                this.this$0.onPurchaseError(it);
            }
        }

        public C00812(Activity activity, String str, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$storeProduct = amazonStoreProduct;
            this.$presentedOfferingContext = presentedOfferingContext;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                AmazonBilling.this.onPurchaseError(purchasesError);
                return;
            }
            PurchaseResponseListener purchaseResponseListener = AmazonBilling.this.purchaseHandler;
            Handler handler = AmazonBilling.this.mainHandler;
            Activity activity = this.$activity;
            String str = this.$appUserID;
            AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            purchaseResponseListener.purchase(handler, activity, str, amazonStoreProduct, new AnonymousClass1(AmazonBilling.this, amazonStoreProduct, this.$presentedOfferingContext), new C00092(AmazonBilling.this));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Lg00/b0;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00822 extends n implements k {
        final k $onError;
        final k $onSuccess;
        final String $purchaseToken;

        public C00822(k kVar, String str, k kVar2) {
            super(1);
            this.$onError = kVar;
            this.$purchaseToken = str;
            this.$onSuccess = kVar2;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return b0.a;
        }

        public final void invoke(JSONObject response) {
            LogHandler currentLogHandler;
            String strK;
            String str;
            m.e(response, "response");
            LogIntent logIntent = LogIntent.DEBUG;
            AmazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1 amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1 = new AmazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1(logIntent, response);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            String termSkuFromJSON = AmazonBilling.this.getTermSkuFromJSON(response);
            if (termSkuFromJSON == null) {
                this.$onError.invoke(ErrorsKt.missingTermSkuError(response));
            } else {
                AmazonBilling.this.cache.cacheSkusByToken(d0.Q(new g00.k(this.$purchaseToken, termSkuFromJSON)));
                this.$onSuccess.invoke(termSkuFromJSON);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends n implements k {
        final k $onError;

        public AnonymousClass3(k kVar) {
            super(1);
            this.$onError = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError error) {
            m.e(error, "error");
            this.$onError.invoke(ErrorsKt.errorGettingReceiptInfo(error));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "Lg00/b0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00831 extends n implements k {
        final k $onReceivePurchaseHistory;

        public C00831(k kVar) {
            super(1);
            this.$onReceivePurchaseHistory = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return b0.a;
        }

        public final void invoke(Map<String, StoreTransaction> it) {
            m.e(it, "it");
            this.$onReceivePurchaseHistory.invoke(q.n1(it.values()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00841 extends n implements k {
        final k $onError;
        final k $onReceive;
        final Set<String> $productIds;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Lg00/b0;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00101 extends n implements k {
            final k $onError;
            final k $onReceive;
            final Set<String> $productIds;
            final AmazonBilling this$0;

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "it", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class C00111 extends n implements k {
                final k $onReceive;
                final Set<String> $productIds;
                final Date $requestStartTime;
                final AmazonBilling this$0;

                public C00111(AmazonBilling amazonBilling, Date date, Set<String> set, k kVar) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$productIds = set;
                    this.$onReceive = kVar;
                }

                @Override
                public Object invoke(Object obj) {
                    invoke((List<? extends StoreProduct>) obj);
                    return b0.a;
                }

                public final void invoke(List<? extends StoreProduct> it) {
                    m.e(it, "it");
                    this.this$0.trackAmazonQueryProductDetailsRequestIfNeeded(true, this.$requestStartTime, this.$productIds);
                    this.$onReceive.invoke(it);
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2 extends n implements k {
                final k $onError;
                final Set<String> $productIds;
                final Date $requestStartTime;
                final AmazonBilling this$0;

                public AnonymousClass2(AmazonBilling amazonBilling, Date date, Set<String> set, k kVar) {
                    super(1);
                    this.this$0 = amazonBilling;
                    this.$requestStartTime = date;
                    this.$productIds = set;
                    this.$onError = kVar;
                }

                @Override
                public Object invoke(Object obj) {
                    invoke((PurchasesError) obj);
                    return b0.a;
                }

                public final void invoke(PurchasesError it) {
                    m.e(it, "it");
                    this.this$0.trackAmazonQueryProductDetailsRequestIfNeeded(false, this.$requestStartTime, this.$productIds);
                    this.$onError.invoke(it);
                }
            }

            public C00101(AmazonBilling amazonBilling, Set<String> set, k kVar, k kVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$productIds = set;
                this.$onReceive = kVar;
                this.$onError = kVar2;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((UserData) obj);
                return b0.a;
            }

            public final void invoke(UserData userData) {
                m.e(userData, "userData");
                Date now = this.this$0.dateProvider.getNow();
                ProductDataResponseListener productDataResponseListener = this.this$0.productDataHandler;
                Set<String> set = this.$productIds;
                String marketplace = userData.getMarketplace();
                m.d(marketplace, "userData.marketplace");
                productDataResponseListener.getProductData(set, marketplace, new C00111(this.this$0, now, this.$productIds, this.$onReceive), new AnonymousClass2(this.this$0, now, this.$productIds, this.$onError));
            }
        }

        public C00841(k kVar, Set<String> set, k kVar2) {
            super(1);
            this.$onError = kVar;
            this.$productIds = set;
            this.$onReceive = kVar2;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C00101(AmazonBilling.this, this.$productIds, this.$onReceive, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00851 extends n implements k {
        final boolean $filterOnlyActivePurchases;
        final k $onError;
        final k $onSuccess;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/amazon/device/iap/model/Receipt;", "receipts", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lg00/b0;", "invoke", "(Ljava/util/List;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00121 extends n implements u00.n {
            final boolean $filterOnlyActivePurchases;
            final k $onError;
            final k $onSuccess;
            final Date $requestStartTime;
            final AmazonBilling this$0;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "tokensToSkusMap", "Lcom/revenuecat/purchases/PurchasesError;", "errors", "Lg00/b0;", "invoke", "(Ljava/util/Map;Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class C00131 extends n implements u00.n {
                final List<Receipt> $filteredReceipts;
                final k $onError;
                final k $onSuccess;
                final UserData $userData;
                final AmazonBilling this$0;

                public C00131(AmazonBilling amazonBilling, k kVar, List<Receipt> list, UserData userData, k kVar2) {
                    super(2);
                    this.this$0 = amazonBilling;
                    this.$onError = kVar;
                    this.$filteredReceipts = list;
                    this.$userData = userData;
                    this.$onSuccess = kVar2;
                }

                @Override
                public Object invoke(Object obj, Object obj2) throws IOException {
                    invoke((Map<String, String>) obj, (Map<String, PurchasesError>) obj2);
                    return b0.a;
                }

                public final void invoke(Map<String, String> tokensToSkusMap, Map<String, PurchasesError> errors) throws IOException {
                    m.e(tokensToSkusMap, "tokensToSkusMap");
                    m.e(errors, "errors");
                    this.this$0.logErrorsIfAny(errors);
                    if (tokensToSkusMap.isEmpty()) {
                        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.InvalidReceiptError, AmazonStrings.ERROR_FETCHING_PURCHASE_HISTORY_ALL_RECEIPTS_INVALID));
                    } else {
                        this.$onSuccess.invoke(this.this$0.toMapOfReceiptHashesToRestoredPurchases(this.$filteredReceipts, tokensToSkusMap, this.$userData));
                    }
                }
            }

            public C00121(AmazonBilling amazonBilling, Date date, boolean z, k kVar, k kVar2) {
                super(2);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$filterOnlyActivePurchases = z;
                this.$onSuccess = kVar;
                this.$onError = kVar2;
            }

            @Override
            public Object invoke(Object obj, Object obj2) {
                invoke((List<Receipt>) obj, (UserData) obj2);
                return b0.a;
            }

            public final void invoke(List<Receipt> receipts, UserData userData) {
                List list;
                m.e(receipts, "receipts");
                m.e(userData, "userData");
                this.this$0.trackAmazonQueryPurchasesRequestIfNeeded(true, this.$requestStartTime, receipts);
                if (this.$filterOnlyActivePurchases) {
                    AmazonBilling amazonBilling = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : receipts) {
                        Receipt receipt = (Receipt) obj;
                        if (receipt.getCancelDate() == null || receipt.getCancelDate().compareTo(amazonBilling.dateProvider.getNow()) > 0) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                } else {
                    list = receipts;
                }
                if (list.isEmpty()) {
                    this.$onSuccess.invoke(y.A);
                    return;
                }
                AmazonBilling amazonBilling2 = this.this$0;
                String userId = userData.getUserId();
                m.d(userId, "userData.userId");
                amazonBilling2.getMissingSkusForReceipts(userId, list, new C00131(this.this$0, this.$onError, list, userData, this.$onSuccess));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends n implements k {
            final k $onError;
            final Date $requestStartTime;
            final AmazonBilling this$0;

            public AnonymousClass2(AmazonBilling amazonBilling, Date date, k kVar) {
                super(1);
                this.this$0 = amazonBilling;
                this.$requestStartTime = date;
                this.$onError = kVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return b0.a;
            }

            public final void invoke(PurchasesError it) {
                m.e(it, "it");
                this.this$0.trackAmazonQueryPurchasesRequestIfNeeded(false, this.$requestStartTime, null);
                this.$onError.invoke(it);
            }
        }

        public C00851(k kVar, boolean z, k kVar2) {
            super(1);
            this.$onError = kVar;
            this.$filterOnlyActivePurchases = z;
            this.$onSuccess = kVar2;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onError.invoke(purchasesError);
            } else {
                Date now = AmazonBilling.this.dateProvider.getNow();
                AmazonBilling.this.purchaseUpdatesHandler.queryPurchases(new C00121(AmazonBilling.this, now, this.$filterOnlyActivePurchases, this.$onSuccess, this.$onError), new AnonymousClass2(AmazonBilling.this, now, this.$onError));
            }
        }
    }

    public AmazonBilling(Context applicationContext, AmazonBackend amazonBackend, AmazonCache cache, boolean z, Handler mainHandler, PurchasesStateProvider stateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataHandler, PurchaseResponseListener purchaseHandler, PurchaseUpdatesResponseListener purchaseUpdatesHandler, UserDataResponseListener userDataHandler, DateProvider dateProvider) {
        super(stateProvider);
        m.e(applicationContext, "applicationContext");
        m.e(amazonBackend, "amazonBackend");
        m.e(cache, "cache");
        m.e(mainHandler, "mainHandler");
        m.e(stateProvider, "stateProvider");
        m.e(purchasingServiceProvider, "purchasingServiceProvider");
        m.e(productDataHandler, "productDataHandler");
        m.e(purchaseHandler, "purchaseHandler");
        m.e(purchaseUpdatesHandler, "purchaseUpdatesHandler");
        m.e(userDataHandler, "userDataHandler");
        m.e(dateProvider, "dateProvider");
        this.applicationContext = applicationContext;
        this.amazonBackend = amazonBackend;
        this.cache = cache;
        this.finishTransactions = z;
        this.mainHandler = mainHandler;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.productDataHandler = productDataHandler;
        this.purchaseHandler = purchaseHandler;
        this.purchaseUpdatesHandler = purchaseUpdatesHandler;
        this.userDataHandler = userDataHandler;
        this.dateProvider = dateProvider;
        this.serviceRequests = new ConcurrentLinkedQueue<>();
    }

    public AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z, Handler handler, PurchasesStateProvider purchasesStateProvider, DiagnosticsTracker diagnosticsTracker, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider, int i, f fVar) {
        Handler handler2;
        ProductDataResponseListener productDataHandler;
        PurchasingServiceProvider defaultPurchasingServiceProvider = (i & 128) != 0 ? new DefaultPurchasingServiceProvider() : purchasingServiceProvider;
        if ((i & 256) != 0) {
            handler2 = handler;
            productDataHandler = new ProductDataHandler(defaultPurchasingServiceProvider, handler2);
        } else {
            handler2 = handler;
            productDataHandler = productDataResponseListener;
        }
        this(context, amazonBackend, amazonCache, z, handler, purchasesStateProvider, diagnosticsTracker, defaultPurchasingServiceProvider, productDataHandler, (i & 512) != 0 ? new PurchaseHandler(defaultPurchasingServiceProvider, context, diagnosticsTracker, null, 8, null) : purchaseResponseListener, (i & 1024) != 0 ? new PurchaseUpdatesHandler(defaultPurchasingServiceProvider) : purchaseUpdatesResponseListener, (i & 2048) != 0 ? new UserDataHandler(defaultPurchasingServiceProvider, handler2, null, 4, null) : userDataResponseListener, (i & 4096) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    public AmazonBilling(Context applicationContext, DeviceCache cache, boolean z, Handler mainHandler, BackendHelper backendHelper, PurchasesStateProvider stateProvider, DiagnosticsTracker diagnosticsTracker) {
        this(applicationContext, new AmazonBackend(backendHelper), new AmazonCache(cache), z, mainHandler, stateProvider, diagnosticsTracker, null, null, null, null, null, null, 8064, null);
        m.e(applicationContext, "applicationContext");
        m.e(cache, "cache");
        m.e(mainHandler, "mainHandler");
        m.e(backendHelper, "backendHelper");
        m.e(stateProvider, "stateProvider");
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (getConnected() && !this.serviceRequests.isEmpty()) {
                runOnUIThread(new i0(this.serviceRequests.remove(), 6));
            }
        }
    }

    private final synchronized void executeRequestOnUIThread(k request) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(request);
                if (getConnected()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void getMissingSkusForReceipts(String amazonUserID, List<Receipt> receipts, u00.n onCompletion) {
        Map<String, String> receiptSkus = this.cache.getReceiptSkus();
        LinkedHashMap linkedHashMapB0 = d0.b0(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<Receipt> arrayList = new ArrayList();
        for (Object obj : receipts) {
            if (((Receipt) obj).getProductType() != ProductType.SUBSCRIPTION) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
        for (Receipt receipt : arrayList) {
            arrayList2.add(new g00.k(receipt.getReceiptId(), receipt.getSku()));
        }
        d0.X(linkedHashMapB0, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : receipts) {
            if (((Receipt) obj2).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Receipt> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (!receiptSkus.containsKey(((Receipt) obj3).getReceiptId())) {
                arrayList4.add(obj3);
            }
        }
        if (arrayList4.isEmpty()) {
            onCompletion.invoke(linkedHashMapB0, linkedHashMap);
            return;
        }
        x xVar = new x();
        xVar.A = arrayList4.size();
        for (Receipt receipt2 : arrayList4) {
            AmazonBackend amazonBackend = this.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            m.d(receiptId, "receipt.receiptId");
            u00.n nVar = onCompletion;
            AmazonBilling$getMissingSkusForReceipts$1$1 amazonBilling$getMissingSkusForReceipts$1$1 = new AmazonBilling$getMissingSkusForReceipts$1$1(linkedHashMapB0, receipt2, xVar, this, nVar, linkedHashMap);
            LinkedHashMap linkedHashMap2 = linkedHashMapB0;
            linkedHashMapB0 = linkedHashMap2;
            amazonBackend.getAmazonReceiptData(receiptId, amazonUserID, amazonBilling$getMissingSkusForReceipts$1$1, new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, xVar, nVar, linkedHashMap2));
            onCompletion = nVar;
        }
    }

    public final String getTermSkuFromJSON(JSONObject response) {
        try {
            return response.getString("termSku");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), presentedOfferingContext, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(a.R(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        m.d(receiptId, "receipt.receiptId");
        String userId = userData.getUserId();
        m.d(userId, "userData.userId");
        amazonBackend.getAmazonReceiptData(receiptId, userId, new C00791(receipt, presentedOfferingContext, userData, this), new C00802(this));
    }

    public final void logErrorsIfAny(Map<String, PurchasesError> errors) throws IOException {
        if (errors.isEmpty()) {
            return;
        }
        String strR0 = q.R0(errors.keySet(), "\n", null, null, null, 62);
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        AmazonBilling$logErrorsIfAny$$inlined$log$1 amazonBilling$logErrorsIfAny$$inlined$log$1 = new AmazonBilling$logErrorsIfAny$$inlined$log$1(logIntent, strR0);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$logErrorsIfAny$$inlined$log$1.invoke(), null);
                break;
        }
    }

    public final void onPurchaseError(PurchasesError error) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(error);
        }
    }

    private final void queryPurchases(boolean filterOnlyActivePurchases, k onSuccess, k onError) {
        executeRequestOnUIThread(new C00851(onError, filterOnlyActivePurchases, onSuccess));
    }

    private final void runOnUIThread(Runnable runnable) {
        if (m.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    private final boolean shouldFinishTransactions() {
        LogHandler currentLogHandler;
        String strK;
        String str;
        if (this.finishTransactions) {
            return true;
        }
        LogIntent logIntent = LogIntent.AMAZON_WARNING;
        AmazonBilling$shouldFinishTransactions$$inlined$log$1 amazonBilling$shouldFinishTransactions$$inlined$log$1 = new AmazonBilling$shouldFinishTransactions$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                    return false;
                }
                strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                str = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                break;
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) > 0) {
                    return false;
                }
                currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) > 0) {
                    return false;
                }
                currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) > 0) {
                    return false;
                }
                strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                str = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                break;
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) > 0) {
                    return false;
                }
                currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) > 0) {
                    return false;
                }
                strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                str = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                break;
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) > 0) {
                    return false;
                }
                strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                str = (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke();
                break;
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) > 0) {
                    return false;
                }
                currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) > 0) {
                    return false;
                }
                currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) > 0) {
                    return false;
                }
                currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke());
                return false;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$shouldFinishTransactions$$inlined$log$1.invoke(), null);
                return false;
            default:
                return false;
        }
        currentLogHandler.d(strK, str);
        return false;
    }

    public final Map<String, StoreTransaction> toMapOfReceiptHashesToRestoredPurchases(List<Receipt> list, Map<String, String> map, UserData userData) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        ArrayList arrayList = new ArrayList();
        for (Receipt receipt : list) {
            String str2 = map.get(receipt.getReceiptId());
            g00.k kVar = null;
            if (str2 == null) {
                LogIntent logIntent = LogIntent.AMAZON_ERROR;
                AmazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1 amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1 = new AmazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                            str = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                            str = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                            str = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                            str = (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke();
                            currentLogHandler.d(strK, str);
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$toMapOfReceiptHashesToRestoredPurchases$lambda$5$$inlined$log$1.invoke(), null);
                        break;
                }
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str2, null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                m.d(receiptId, "receipt.receiptId");
                kVar = new g00.k(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return d0.Y(arrayList);
    }

    public final void trackAmazonQueryProductDetailsRequestIfNeeded(boolean wasSuccessful, Date requestStartTime, Set<String> requestedProductIds) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m119trackAmazonQueryProductDetailsRequestKLykuaI(DurationExtensionsKt.between(b.B, requestStartTime, this.dateProvider.getNow()), wasSuccessful, requestedProductIds);
        }
    }

    public final void trackAmazonQueryPurchasesRequestIfNeeded(boolean wasSuccessful, Date requestStartTime, List<Receipt> receipts) {
        ArrayList arrayList;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long jBetween = DurationExtensionsKt.between(b.B, requestStartTime, this.dateProvider.getNow());
            if (receipts != null) {
                arrayList = new ArrayList(r.q0(receipts, 10));
                Iterator<T> it = receipts.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Receipt) it.next()).getSku());
                }
            } else {
                arrayList = null;
            }
            diagnosticsTracker.m120trackAmazonQueryPurchasesRequestKLykuaI(jBetween, wasSuccessful, arrayList);
        }
    }

    @Override
    public void consumeAndSave(boolean finishTransactions, StoreTransaction purchase, boolean shouldConsume, PostReceiptInitiationSource initiationSource) {
        m.e(purchase, "purchase");
        m.e(initiationSource, "initiationSource");
        if (!shouldFinishTransactions() || purchase.getType() == com.revenuecat.purchases.ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        if (finishTransactions) {
            executeRequestOnUIThread(new AnonymousClass1(purchase));
        }
        this.cache.addSuccessfullyPostedToken(purchase.getPurchaseToken(), purchase.getIsAutoRenewing());
    }

    @Override
    public void endConnection() {
    }

    @Override
    public void findPurchaseInPurchaseHistory(String appUserID, com.revenuecat.purchases.ProductType productType, String productId, k onCompletion, k onError) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(appUserID, "appUserID");
        m.e(productType, "productType");
        m.e(productId, "productId");
        m.e(onCompletion, "onCompletion");
        m.e(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        AmazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1 amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1 = new AmazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1(logIntent, productId, productType);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
        }
        queryAllPurchases(appUserID, new AnonymousClass2(onCompletion, productId, onError), onError);
    }

    @Override
    public void getAmazonLWAConsentStatus(k onSuccess, k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        executeRequestOnUIThread(new C00771(onError, onSuccess));
    }

    @Override
    public void getProductData(Set<String> skus, String marketplace, k onReceive, k onError) {
        m.e(skus, "skus");
        m.e(marketplace, "marketplace");
        m.e(onReceive, "onReceive");
        m.e(onError, "onError");
        this.productDataHandler.getProductData(skus, marketplace, onReceive, onError);
    }

    @Override
    public void getStorefront(k onSuccess, k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        executeRequestOnUIThread(new C00781(onError, onSuccess));
    }

    @Override
    public void getUserData(k onSuccess, k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        this.userDataHandler.getUserData(onSuccess, onError);
    }

    @Override
    public boolean getConnected() {
        return this.connected;
    }

    @Override
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice) {
        m.e(activity, "activity");
        m.e(appUserID, "appUserID");
        m.e(purchasingData, "purchasingData");
        AmazonPurchasingData.Product product = purchasingData instanceof AmazonPurchasingData.Product ? (AmazonPurchasingData.Product) purchasingData : null;
        if (product == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2)));
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
            }
            return;
        }
        AmazonStoreProduct storeProduct = product.getStoreProduct();
        if (shouldFinishTransactions()) {
            if (replaceProductInfo == null) {
                executeRequestOnUIThread(new C00812(activity, appUserID, storeProduct, presentedOfferingContext));
                return;
            }
            LogIntent logIntent = LogIntent.AMAZON_WARNING;
            AmazonBilling$makePurchaseAsync$$inlined$log$1 amazonBilling$makePurchaseAsync$$inlined$log$1 = new AmazonBilling$makePurchaseAsync$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) amazonBilling$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
            }
        }
    }

    @Override
    public void normalizePurchaseData(String productID, String purchaseToken, String storeUserID, k onSuccess, k onError) {
        m.e(productID, "productID");
        m.e(purchaseToken, "purchaseToken");
        m.e(storeUserID, "storeUserID");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        String str = this.cache.getReceiptSkus().get(purchaseToken);
        if (str != null) {
            onSuccess.invoke(str);
        } else {
            this.amazonBackend.getAmazonReceiptData(purchaseToken, storeUserID, new C00822(onError, purchaseToken, onSuccess), new AnonymousClass3(onError));
        }
    }

    @Override
    public void onProductDataResponse(ProductDataResponse response) {
        m.e(response, "response");
        if (shouldFinishTransactions()) {
            this.productDataHandler.onProductDataResponse(response);
        }
    }

    @Override
    public void onPurchaseResponse(PurchaseResponse response) {
        m.e(response, "response");
        if (shouldFinishTransactions()) {
            this.purchaseHandler.onPurchaseResponse(response);
        }
    }

    @Override
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response) {
        m.e(response, "response");
        if (shouldFinishTransactions()) {
            this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(response);
        }
    }

    @Override
    public void onUserDataResponse(UserDataResponse response) {
        m.e(response, "response");
        if (shouldFinishTransactions()) {
            this.userDataHandler.onUserDataResponse(response);
        }
    }

    @Override
    public void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, u00.n onSuccess, k onError) {
        m.e(mainHandler, "mainHandler");
        m.e(activity, "activity");
        m.e(appUserID, "appUserID");
        m.e(storeProduct, "storeProduct");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        this.purchaseHandler.purchase(mainHandler, activity, appUserID, storeProduct, onSuccess, onError);
    }

    @Override
    public void queryAllPurchases(String appUserID, k onReceivePurchaseHistory, k onReceivePurchaseHistoryError) {
        m.e(appUserID, "appUserID");
        m.e(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        m.e(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchases(false, (k) new C00831(onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override
    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set<String> productIds, k onReceive, k onError) {
        m.e(productType, "productType");
        m.e(productIds, "productIds");
        m.e(onReceive, "onReceive");
        m.e(onError, "onError");
        if (shouldFinishTransactions()) {
            executeRequestOnUIThread(new C00841(onError, productIds, onReceive));
        }
    }

    @Override
    public void queryPurchases(String appUserID, k onSuccess, k onError) {
        m.e(appUserID, "appUserID");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        if (shouldFinishTransactions()) {
            queryPurchases(true, onSuccess, onError);
        }
    }

    @Override
    public void queryPurchases(u00.n onSuccess, k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        this.purchaseUpdatesHandler.queryPurchases(onSuccess, onError);
    }

    @Override
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, u00.a subscriptionStatusChange) {
        m.e(activity, "activity");
        m.e(inAppMessageTypes, "inAppMessageTypes");
        m.e(subscriptionStatusChange, "subscriptionStatusChange");
    }

    @Override
    public void startConnection() {
        if (shouldFinishTransactions()) {
            this.purchasingServiceProvider.registerListener(this.applicationContext, this);
            this.connected = true;
            BillingAbstract.StateListener stateListener = getStateListener();
            if (stateListener != null) {
                stateListener.onConnected();
            }
            executePendingRequests();
        }
    }

    @Override
    public void startConnectionOnMainThread(long delayMilliseconds) {
        runOnUIThread(new i0(this, 7));
    }
}
