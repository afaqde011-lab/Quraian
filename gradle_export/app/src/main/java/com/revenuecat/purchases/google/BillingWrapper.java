package com.revenuecat.purchases.google;

import a8.o0;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.NoCoreLibraryDesugaringException;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.Result;
import g00.b0;
import g00.k;
import h00.q;
import h00.r;
import h00.v;
import h00.x;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import q3.e0;
import q30.l;
import qd.d;
import qd.e;
import qd.g;
import qd.h;
import qd.i;
import qd.o;
import qd.p;
import qd.s;
import qd.u;

@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ³\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004´\u0001³\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J[\u0010'\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u001c\u0010#\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\u00140\u001fj\u0002`\"2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`%H\u0016¢\u0006\u0004\b'\u0010(JE\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105JC\u00109\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001d2\u0018\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002060 \u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0004\b9\u0010:JE\u0010;\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001d2\u0018\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002060 \u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fH\u0016¢\u0006\u0004\b;\u0010:J/\u0010A\u001a\u00020\u00142\u0006\u0010<\u001a\u0002022\u0006\u0010=\u001a\u0002062\u0006\u0010>\u001a\u0002022\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ3\u0010G\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020?2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001fH\u0000¢\u0006\u0004\bE\u0010FJ3\u0010J\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020?2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001fH\u0000¢\u0006\u0004\bI\u0010FJK\u0010M\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001d2\u001e\u0010L\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u0002060K\u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fH\u0016¢\u0006\u0004\bM\u0010:JO\u0010P\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\u001d2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fH\u0016¢\u0006\u0004\bP\u0010QJ+\u0010V\u001a\u00020\u00142\u0006\u0010R\u001a\u00020\u001d2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001fH\u0001¢\u0006\u0004\bT\u0010UJ'\u0010[\u001a\u00020\u00142\u0006\u0010X\u001a\u00020W2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010 H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00142\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0014H\u0016¢\u0006\u0004\b_\u0010\u0018J\u000f\u0010`\u001a\u000202H\u0016¢\u0006\u0004\b`\u0010aJ3\u0010f\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020b0 2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00140dH\u0016¢\u0006\u0004\bf\u0010gJ;\u0010h\u001a\u00020\u00142\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001f2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`%H\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0014H\u0002¢\u0006\u0004\bj\u0010\u0018J1\u0010l\u001a\u00020\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\u0010k\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u00140\u001fH\u0002¢\u0006\u0004\bl\u0010mJ\u001f\u0010p\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010o\u001a\u00020nH\u0003¢\u0006\u0004\bp\u0010qJG\u0010s\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00140\u001fH\u0002¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020\u0014H\u0002¢\u0006\u0004\bu\u0010\u0018J#\u0010x\u001a\u00020\u00142\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u00140\u001fH\u0002¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\u001dH\u0002¢\u0006\u0004\bz\u0010{J+\u0010}\u001a\u00020\u00142\u0006\u0010=\u001a\u00020Y2\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00140\u001fH\u0002¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u007f\u0010\u0018J'\u0010\u0083\u0001\u001a\u00020\u00142\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J)\u0010\u0085\u0001\u001a\u00020\u00142\u0006\u0010X\u001a\u00020W2\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010 H\u0002¢\u0006\u0005\b\u0085\u0001\u0010\\JE\u0010\u0088\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020$0\u0087\u00012\b\u0010\u0086\u0001\u001a\u00030\u0080\u00012\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020\u001d2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J;\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020$0\u0087\u00012\b\u0010\u0086\u0001\u001a\u00030\u008a\u00012\u0006\u0010+\u001a\u00020\u001d2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001JE\u0010\u008e\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020$0\u0087\u00012\b\u0010\u0086\u0001\u001a\u00030\u008d\u00012\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020\u001d2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J#\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010 2\b\u0010\u0086\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001b\u0010\u0094\u0001\u001a\u00020\u00142\u0007\u0010\u0093\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0096\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0097\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0098\u0001R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0099\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u009a\u0001R6\u0010\u009c\u0001\u001a\u0004\u0018\u00010v2\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010v8F@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R4\u0010¤\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030£\u00010¢\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b¤\u0001\u0010¥\u0001\u0012\u0005\b¨\u0001\u0010\u0018\u001a\u0006\b¦\u0001\u0010§\u0001R;\u0010«\u0001\u001a&\u0012!\u0012\u001f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u00140\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00120ª\u00010©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\"\u0010¯\u0001\u001a\u0002022\u0007\u0010\u009b\u0001\u001a\u0002028B@BX\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0013\u0010²\u0001\u001a\u0002028F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010a¨\u0006µ\u0001"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lqd/u;", "Lqd/c;", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "clientFactory", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesStateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;Landroid/os/Handler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "delayMilliseconds", "Lg00/b0;", "startConnectionOnMainThread", "(J)V", "startConnection", "()V", "endConnection", "Lcom/revenuecat/purchases/ProductType;", "productType", "", "", "productIds", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lu00/k;Lu00/k;)V", "Landroid/app/Activity;", "activity", "appUserID", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "onReceivePurchaseHistory", "onReceivePurchaseHistoryError", "queryPurchaseHistoryAsync", "(Ljava/lang/String;Lu00/k;Lu00/k;)V", "queryAllPurchases", "finishTransactions", "purchase", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "token", "onConsumed", "consumePurchase$purchases_defaultsBc8Release", "(Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lu00/k;)V", "consumePurchase", "onAcknowledged", "acknowledge$purchases_defaultsBc8Release", "acknowledge", "", "onSuccess", "queryPurchases", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lu00/k;Lu00/k;)V", "purchaseToken", "listener", "getPurchaseType$purchases_defaultsBc8Release", "(Ljava/lang/String;Lu00/k;)V", "getPurchaseType", "Lqd/h;", "billingResult", "Lqd/s;", "purchases", "onPurchasesUpdated", "(Lqd/h;Ljava/util/List;)V", "onBillingSetupFinished", "(Lqd/h;)V", "onBillingServiceDisconnected", "isConnected", "()Z", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lu00/a;)V", "getStorefront", "(Lu00/k;Lu00/k;)V", "executePendingRequests", "request", "executeRequestOnUIThread", "(Ljava/lang/Long;Lu00/k;)V", "Lqd/g;", "params", "launchBillingFlow", "(Landroid/app/Activity;Lqd/g;)V", "resultHandler", "queryPurchaseType", "(Ljava/lang/String;Ljava/lang/String;Lu00/k;Lu00/k;)V", "retryBillingServiceConnectionWithExponentialBackoff", "Lqd/a;", "receivingFunction", "withConnectedClient", "(Lu00/k;)V", "getStackTrace", "()Ljava/lang/String;", "completion", "getStoreTransaction", "(Lqd/s;Lu00/k;)V", "trackProductDetailsNotSupportedIfNeeded", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "googlePurchasingData", "oldProductId", "trackPurchaseStartIfNeeded", "(Lcom/revenuecat/purchases/models/GooglePurchasingData;Ljava/lang/String;)V", "trackPurchaseUpdateReceivedIfNeeded", "purchaseInfo", "Lcom/revenuecat/purchases/utils/Result;", "buildPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "buildOneTimePurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "buildSubscriptionPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lqd/f;", "buildSubscriptionProductDetailsParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;)Ljava/util/List;", "error", "sendErrorsToAllPendingRequests", "(Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "<set-?>", "billingClient", "Lqd/a;", "getBillingClient", "()Lqd/a;", "setBillingClient", "(Lqd/a;)V", "", "Lcom/revenuecat/purchases/google/PurchaseContext;", "purchaseContext", "Ljava/util/Map;", "getPurchaseContext$purchases_defaultsBc8Release", "()Ljava/util/Map;", "getPurchaseContext$purchases_defaultsBc8Release$annotations", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lg00/k;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "reconnectMilliseconds", "J", "reconnectionAlreadyScheduled", "Z", "getAppInBackground", "appInBackground", "Companion", "ClientFactory", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingWrapper extends BillingAbstract implements u, qd.c {
    private static final Companion Companion = new Companion(null);
    private static final int MAX_PENDING_REQUEST_COUNT_REPORTED = 100;
    private volatile qd.a billingClient;
    private final ClientFactory clientFactory;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue<k> serviceRequests;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "", "Landroid/content/Context;", "context", "", "pendingTransactionsForPrepaidPlansEnabled", "<init>", "(Landroid/content/Context;Z)V", "Lqd/u;", "listener", "Lqd/a;", "buildClient", "(Lqd/u;)Lqd/a;", "Landroid/content/Context;", "Z", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClientFactory {
        private final Context context;
        private final boolean pendingTransactionsForPrepaidPlansEnabled;

        public ClientFactory(Context context, boolean z) {
            m.e(context, "context");
            this.context = context;
            this.pendingTransactionsForPrepaidPlansEnabled = z;
        }

        public final qd.a buildClient(u listener) {
            m.e(listener, "listener");
            o0 o0Var = new o0(this.pendingTransactionsForPrepaidPlansEnabled);
            ki.b bVar = new ki.b(this.context);
            bVar.a = o0Var;
            bVar.c = listener;
            return bVar.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper$Companion;", "", "()V", "MAX_PENDING_REQUEST_COUNT_REPORTED", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqd/d;", "billingConfig", "Lg00/b0;", "invoke", "(Lqd/d;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements u00.k {
        final u00.k $onSuccess;

        public AnonymousClass2(u00.k kVar) {
            super(1);
            this.$onSuccess = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((d) obj);
            return b0.a;
        }

        public final void invoke(d billingConfig) {
            m.e(billingConfig, "billingConfig");
            u00.k kVar = this.$onSuccess;
            String str = billingConfig.a;
            m.d(str, "billingConfig.countryCode");
            kVar.invoke(str);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class AnonymousClass3 extends j implements u00.k {
        public AnonymousClass3(Object obj) {
            super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
        }

        @Override
        public Object invoke(Object obj) {
            invoke((u00.k) obj);
            return b0.a;
        }

        public final void invoke(u00.k p0) {
            m.e(p0, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class AnonymousClass4 extends j implements u00.n {
        public AnonymousClass4(Object obj) {
            super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (u00.k) obj2);
            return b0.a;
        }

        public final void invoke(Long l, u00.k p1) {
            m.e(p1, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l, p1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqd/a;", "Lg00/b0;", "invoke", "(Lqd/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01062 extends n implements u00.k {
        final Activity $activity;
        final g $params;

        public C01062(Activity activity, g gVar) {
            super(1);
            this.$activity = activity;
            this.$params = gVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((qd.a) obj);
            return b0.a;
        }

        public final void invoke(qd.a withConnectedClient) {
            m.e(withConnectedClient, "$this$withConnectedClient");
            h hVarE = withConnectedClient.e(this.$activity, this.$params);
            if (hVarE.a == 0) {
                hVarE = null;
            }
            if (hVarE != null) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                BillingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1 billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1 = new BillingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1(logIntent, hVarE);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1.invoke(), null);
                        break;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01074 extends n implements u00.k {
        final Activity $activity;
        final String $appUserID;
        final GooglePurchasingData $googlePurchasingData;
        final Boolean $isPersonalizedPrice;
        final PurchasingData $purchasingData;
        final ReplaceProductInfo $replaceProductInfo;

        public C01074(PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool, GooglePurchasingData googlePurchasingData, Activity activity) {
            super(1);
            this.$purchasingData = purchasingData;
            this.$replaceProductInfo = replaceProductInfo;
            this.$appUserID = str;
            this.$isPersonalizedPrice = bool;
            this.$googlePurchasingData = googlePurchasingData;
            this.$activity = activity;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
            StoreTransaction oldPurchase;
            List<String> productIds;
            Result resultBuildPurchaseParams = BillingWrapper.this.buildPurchaseParams((GooglePurchasingData) this.$purchasingData, this.$replaceProductInfo, this.$appUserID, this.$isPersonalizedPrice);
            if (!(resultBuildPurchaseParams instanceof Result.Success)) {
                if (!(resultBuildPurchaseParams instanceof Result.Error) || (purchasesUpdatedListener = BillingWrapper.this.getPurchasesUpdatedListener()) == null) {
                    return;
                }
                purchasesUpdatedListener.onPurchasesFailedToUpdate((PurchasesError) ((Result.Error) resultBuildPurchaseParams).getValue());
                return;
            }
            BillingWrapper billingWrapper = BillingWrapper.this;
            GooglePurchasingData googlePurchasingData = this.$googlePurchasingData;
            ReplaceProductInfo replaceProductInfo = this.$replaceProductInfo;
            billingWrapper.trackPurchaseStartIfNeeded(googlePurchasingData, (replaceProductInfo == null || (oldPurchase = replaceProductInfo.getOldPurchase()) == null || (productIds = oldPurchase.getProductIds()) == null) ? null : (String) q.N0(productIds));
            BillingWrapper.this.launchBillingFlow(this.$activity, (g) ((Result.Success) resultBuildPurchaseParams).getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "subsPurchasesList", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements u00.k {
        final u00.k $onReceivePurchaseHistory;
        final u00.k $onReceivePurchaseHistoryError;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "inAppPurchasesList", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00161 extends n implements u00.k {
            final u00.k $onReceivePurchaseHistory;
            final List<StoreTransaction> $subsPurchasesList;

            public C00161(u00.k kVar, List<StoreTransaction> list) {
                super(1);
                this.$onReceivePurchaseHistory = kVar;
                this.$subsPurchasesList = list;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((List<StoreTransaction>) obj);
                return b0.a;
            }

            public final void invoke(List<StoreTransaction> inAppPurchasesList) {
                m.e(inAppPurchasesList, "inAppPurchasesList");
                this.$onReceivePurchaseHistory.invoke(q.Y0(inAppPurchasesList, this.$subsPurchasesList));
            }
        }

        public AnonymousClass1(u00.k kVar, u00.k kVar2) {
            super(1);
            this.$onReceivePurchaseHistoryError = kVar;
            this.$onReceivePurchaseHistory = kVar2;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return b0.a;
        }

        public final void invoke(List<StoreTransaction> subsPurchasesList) {
            m.e(subsPurchasesList, "subsPurchasesList");
            BillingWrapper.this.queryPurchaseHistoryAsync("inapp", new C00161(this.$onReceivePurchaseHistory, subsPurchasesList), this.$onReceivePurchaseHistoryError);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class C01082 extends j implements u00.k {
        public C01082(Object obj) {
            super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
        }

        @Override
        public Object invoke(Object obj) {
            invoke((u00.k) obj);
            return b0.a;
        }

        public final void invoke(u00.k p0) {
            m.e(p0, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class C01093 extends j implements u00.n {
        public C01093(Object obj) {
            super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (u00.k) obj2);
            return b0.a;
        }

        public final void invoke(Long l, u00.k p1) {
            m.e(p1, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l, p1);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases", "Lg00/b0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01101 extends n implements u00.k {
        final String $purchaseToken;
        final u00.k $resultHandler;

        public C01101(u00.k kVar, String str) {
            super(1);
            this.$resultHandler = kVar;
            this.$purchaseToken = str;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return b0.a;
        }

        public final void invoke(Map<String, StoreTransaction> purchases) {
            m.e(purchases, "purchases");
            u00.k kVar = this.$resultHandler;
            Collection<StoreTransaction> collectionValues = purchases.values();
            String str = this.$purchaseToken;
            boolean z = false;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (m.a(((StoreTransaction) it.next()).getPurchaseToken(), str)) {
                        z = true;
                        break;
                    }
                }
            }
            kVar.invoke(Boolean.valueOf(z));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01112 extends n implements u00.k {
        final u00.k $listener;

        public C01112(u00.k kVar) {
            super(1);
            this.$listener = kVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError error) {
            m.e(error, "error");
            LogUtilsKt.errorLog(error);
            this.$listener.invoke(ProductType.UNKNOWN);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class C01123 extends j implements u00.k {
        public C01123(Object obj) {
            super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
        }

        @Override
        public Object invoke(Object obj) {
            invoke((u00.k) obj);
            return b0.a;
        }

        public final void invoke(u00.k p0) {
            m.e(p0, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class C01134 extends j implements u00.n {
        public C01134(Object obj) {
            super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (u00.k) obj2);
            return b0.a;
        }

        public final void invoke(Long l, u00.k p1) {
            m.e(p1, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l, p1);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class C01142 extends j implements u00.k {
        public C01142(Object obj) {
            super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
        }

        @Override
        public Object invoke(Object obj) {
            invoke((u00.k) obj);
            return b0.a;
        }

        public final void invoke(u00.k p0) {
            m.e(p0, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class C01153 extends j implements u00.n {
        public C01153(Object obj) {
            super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (u00.k) obj2);
            return b0.a;
        }

        public final void invoke(Long l, u00.k p1) {
            m.e(p1, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l, p1);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01162 extends n implements u00.k {
        final i $inAppMessageParams;
        final u00.a $subscriptionStatusChange;
        final WeakReference<Activity> $weakActivity;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqd/a;", "Lg00/b0;", "invoke", "(Lqd/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00172 extends n implements u00.k {
            final i $inAppMessageParams;
            final u00.a $subscriptionStatusChange;
            final WeakReference<Activity> $weakActivity;

            public C00172(WeakReference<Activity> weakReference, i iVar, u00.a aVar) {
                super(1);
                this.$weakActivity = weakReference;
                this.$inAppMessageParams = iVar;
                this.$subscriptionStatusChange = aVar;
            }

            public static final void invoke$lambda$8(u00.a aVar, qd.k inAppMessageResult) {
                m.e(inAppMessageResult, "inAppMessageResult");
                int i = inAppMessageResult.a;
                if (i == 0) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), BillingStrings.BILLING_INAPP_MESSAGE_NONE);
                        return;
                    }
                    return;
                }
                if (i != 1) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), null);
                    return;
                }
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    x5.w(logLevel2, new StringBuilder("[Purchases] - "), currentLogHandler2, BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                }
                aVar.invoke();
            }

            @Override
            public Object invoke(Object obj) {
                invoke((qd.a) obj);
                return b0.a;
            }

            public final void invoke(qd.a withConnectedClient) {
                View viewPeekDecorView;
                m.e(withConnectedClient, "$this$withConnectedClient");
                Activity activity = this.$weakActivity.get();
                if (activity == null) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "Activity is null, not showing Google Play in-app message.");
                        return;
                    }
                    return;
                }
                if (activity.isFinishing()) {
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        x5.w(logLevel2, new StringBuilder("[Purchases] - "), currentLogHandler2, "Activity is finishing, not showing Google Play in-app message.");
                        return;
                    }
                    return;
                }
                if (activity.isDestroyed()) {
                    LogLevel logLevel3 = LogLevel.DEBUG;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        x5.w(logLevel3, new StringBuilder("[Purchases] - "), currentLogHandler3, "Activity is destroyed, not showing Google Play in-app message.");
                        return;
                    }
                    return;
                }
                Window window = activity.getWindow();
                if (((window == null || (viewPeekDecorView = window.peekDecorView()) == null) ? null : viewPeekDecorView.getWindowToken()) != null) {
                    i iVar = this.$inAppMessageParams;
                    final u00.a aVar = this.$subscriptionStatusChange;
                    withConnectedClient.h(activity, iVar, new qd.j() {
                        public final void a(qd.k kVar) {
                            BillingWrapper.C01162.C00172.invoke$lambda$8(aVar, kVar);
                        }
                    });
                } else {
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        x5.w(logLevel4, new StringBuilder("[Purchases] - "), currentLogHandler4, "Activity is not attached to a window, not showing Google Play in-app message.");
                    }
                }
            }
        }

        public C01162(WeakReference<Activity> weakReference, i iVar, u00.a aVar) {
            super(1);
            this.$weakActivity = weakReference;
            this.$inAppMessageParams = iVar;
            this.$subscriptionStatusChange = aVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1)), null);
            } else {
                BillingWrapper.this.withConnectedClient(new C00172(this.$weakActivity, this.$inAppMessageParams, this.$subscriptionStatusChange));
            }
        }
    }

    public BillingWrapper(ClientFactory clientFactory, Handler mainHandler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider) {
        super(purchasesStateProvider);
        m.e(clientFactory, "clientFactory");
        m.e(mainHandler, "mainHandler");
        m.e(deviceCache, "deviceCache");
        m.e(purchasesStateProvider, "purchasesStateProvider");
        m.e(dateProvider, "dateProvider");
        this.clientFactory = clientFactory;
        this.mainHandler = mainHandler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
    }

    public BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider, int i, f fVar) {
        this(clientFactory, handler, deviceCache, diagnosticsTracker, purchasesStateProvider, (i & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final Result<g, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct purchaseInfo, String appUserID, Boolean isPersonalizedPrice) {
        e0 e0Var = new e0(1, false);
        p productDetails = purchaseInfo.getProductDetails();
        e0Var.B = productDetails;
        if (productDetails.a() != null) {
            productDetails.a().getClass();
            String str = productDetails.a().d;
            if (str != null) {
                e0Var.C = str;
            }
        }
        if (((p) e0Var.B) == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        qd.f fVar = new qd.f(e0Var);
        try {
            e eVar = new e();
            c7.g gVar = new c7.g();
            gVar.a = 0;
            gVar.b = true;
            eVar.d = gVar;
            eVar.b = new ArrayList(va.a.R(fVar));
            eVar.a = UtilsKt.sha256(appUserID);
            if (isPersonalizedPrice != null) {
                eVar.c = isPersonalizedPrice.booleanValue();
            }
            return new Result.Success(eVar.a());
        } catch (NoClassDefFoundError e) {
            throw new NoCoreLibraryDesugaringException(e);
        }
    }

    public final Result<g, PurchasesError> buildPurchaseParams(GooglePurchasingData purchaseInfo, ReplaceProductInfo replaceProductInfo, String appUserID, Boolean isPersonalizedPrice) {
        if (purchaseInfo instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) purchaseInfo, appUserID, isPersonalizedPrice);
        }
        if (purchaseInfo instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) purchaseInfo, replaceProductInfo, appUserID, isPersonalizedPrice);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final List<qd.f> buildSubscriptionProductDetailsParams(GooglePurchasingData.Subscription purchaseInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(buildSubscriptionProductDetailsParams$buildProductDetailParams(purchaseInfo));
        List addOnProducts = purchaseInfo.getAddOnProducts();
        if (addOnProducts != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : addOnProducts) {
                if (obj instanceof GooglePurchasingData.Subscription) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(r.q0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(buildSubscriptionProductDetailsParams$buildProductDetailParams((GooglePurchasingData.Subscription) it.next()));
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    private static final qd.f buildSubscriptionProductDetailsParams$buildProductDetailParams(GooglePurchasingData.Subscription subscription) {
        e0 e0Var = new e0(1, false);
        String token = subscription.getToken();
        if (TextUtils.isEmpty(token)) {
            throw new IllegalArgumentException("offerToken can not be empty");
        }
        e0Var.C = token;
        p productDetails = subscription.getProductDetails();
        e0Var.B = productDetails;
        if (productDetails.a() != null) {
            productDetails.a().getClass();
            String str = productDetails.a().d;
            if (str != null) {
                e0Var.C = str;
            }
        }
        if (((p) e0Var.B) != null) {
            return new qd.f(e0Var);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    private final Result<g, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription purchaseInfo, ReplaceProductInfo replaceProductInfo, String appUserID, Boolean isPersonalizedPrice) {
        List<qd.f> listBuildSubscriptionProductDetailsParams = buildSubscriptionProductDetailsParams(purchaseInfo);
        try {
            e eVar = new e();
            c7.g gVar = new c7.g();
            gVar.a = 0;
            gVar.b = true;
            eVar.d = gVar;
            eVar.b = new ArrayList(listBuildSubscriptionProductDetailsParams);
            if (replaceProductInfo != null) {
                BillingFlowParamsExtensionsKt.setUpgradeInfo(eVar, replaceProductInfo);
            } else {
                eVar.a = UtilsKt.sha256(appUserID);
            }
            if (isPersonalizedPrice != null) {
                eVar.c = isPersonalizedPrice.booleanValue();
            }
            return new Result.Success(eVar.a());
        } catch (NoClassDefFoundError e) {
            throw new NoCoreLibraryDesugaringException(e);
        }
    }

    public static final void endConnection$lambda$13(BillingWrapper billingWrapper) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        synchronized (billingWrapper) {
            try {
                qd.a aVar = billingWrapper.billingClient;
                if (aVar != null) {
                    LogIntent logIntent = LogIntent.DEBUG;
                    BillingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1 billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1 = new BillingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1(logIntent, aVar);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                currentLogHandler2.d("[Purchases] - " + logLevel.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                str = "[Purchases] - " + logLevel4.name();
                                str2 = (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                str = "[Purchases] - " + logLevel6.name();
                                str2 = (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str = "[Purchases] - " + logLevel7.name();
                                str2 = (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel10 = LogLevel.WARN;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1.invoke(), null);
                            break;
                    }
                    aVar.c();
                }
                billingWrapper.billingClient = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void executePendingRequests() {
        k kVarPoll;
        synchronized (this) {
            while (true) {
                try {
                    qd.b bVar = this.billingClient;
                    if (bVar == null || !bVar.N() || (kVarPoll = this.serviceRequests.poll()) == null) {
                        break;
                    }
                    final u00.k kVar = (u00.k) kVarPoll.A;
                    Long l = (Long) kVarPoll.B;
                    if (l != null) {
                        final int i = 0;
                        this.mainHandler.postDelayed(new Runnable() {
                            @Override
                            public final void run() {
                                int i2 = i;
                                u00.k kVar2 = kVar;
                                switch (i2) {
                                    case 0:
                                        kVar2.invoke(null);
                                        break;
                                    default:
                                        kVar2.invoke(null);
                                        break;
                                }
                            }
                        }, l.longValue());
                    } else {
                        final int i2 = 1;
                        this.mainHandler.post(new Runnable() {
                            @Override
                            public final void run() {
                                int i3 = i2;
                                u00.k kVar2 = kVar;
                                switch (i3) {
                                    case 0:
                                        kVar2.invoke(null);
                                        break;
                                    default:
                                        kVar2.invoke(null);
                                        break;
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void executeRequestOnUIThread(Long delayMilliseconds, u00.k request) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(new k(request, delayMilliseconds));
                qd.b bVar = this.billingClient;
                if (bVar == null || bVar.N()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            } else {
                request.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l, u00.k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        billingWrapper.executeRequestOnUIThread(l, kVar);
    }

    public static void getPurchaseContext$purchases_defaultsBc8Release$annotations() {
    }

    public final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        m.d(string, "stringWriter.toString()");
        return string;
    }

    private final void getStoreTransaction(s purchase, u00.k completion) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$getStoreTransaction$$inlined$log$1 billingWrapper$getStoreTransaction$$inlined$log$1 = new BillingWrapper$getStoreTransaction$$inlined$log$1(logIntent, purchase);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$getStoreTransaction$$inlined$log$1.invoke(), null);
                break;
        }
        synchronized (this) {
            PurchaseContext purchaseContext = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext != null && purchaseContext.getProductType() != null) {
                completion.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                return;
            }
            String strB = purchase.b();
            m.d(strB, "purchase.purchaseToken");
            getPurchaseType$purchases_defaultsBc8Release(strB, new BillingWrapper$getStoreTransaction$2$2(completion, purchase));
        }
    }

    public final void launchBillingFlow(Activity activity, g params) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        if (activity.getIntent() == null) {
            LogIntent logIntent = LogIntent.WARNING;
            BillingWrapper$launchBillingFlow$$inlined$log$1 billingWrapper$launchBillingFlow$$inlined$log$1 = new BillingWrapper$launchBillingFlow$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$launchBillingFlow$$inlined$log$1.invoke(), null);
                    break;
            }
        }
        withConnectedClient(new C01062(activity, params));
    }

    public static final void onBillingSetupFinished$lambda$39(h hVar, BillingWrapper billingWrapper) {
        PurchasesError purchasesErrorBillingResponseToPurchasesError;
        LogHandler currentLogHandler;
        String strK;
        String str;
        int i = hVar.a;
        if (i != 6) {
            if (i != 7 && i != 8) {
                if (i != 12) {
                    switch (i) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(hVar);
                            if (m.a(hVar.c, ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                                purchasesErrorBillingResponseToPurchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, String.format(BillingStrings.BILLING_UNAVAILABLE_LESS_THAN_3, Arrays.copyOf(new Object[]{humanReadableDescription}, 1)));
                                LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                            } else {
                                purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(hVar.a, String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{humanReadableDescription}, 1)));
                                LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                            }
                            billingWrapper.sendErrorsToAllPendingRequests(purchasesErrorBillingResponseToPurchasesError);
                            break;
                        case 0:
                            LogIntent logIntent = LogIntent.DEBUG;
                            BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1 billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1 = new BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1(logIntent, billingWrapper);
                            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                                case 1:
                                    LogLevel logLevel = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                        strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                                        str = (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke();
                                        currentLogHandler.d(strK, str);
                                    }
                                    break;
                                case 2:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke(), null);
                                    break;
                                case 3:
                                    LogLevel logLevel2 = LogLevel.WARN;
                                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 4:
                                    LogLevel logLevel3 = LogLevel.INFO;
                                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 5:
                                    LogLevel logLevel4 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                        strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                                        str = (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke();
                                        currentLogHandler.d(strK, str);
                                    }
                                    break;
                                case 6:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke(), null);
                                    break;
                                case 7:
                                    LogLevel logLevel5 = LogLevel.INFO;
                                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                        currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 8:
                                    LogLevel logLevel6 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                        strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                                        str = (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke();
                                        currentLogHandler.d(strK, str);
                                    }
                                    break;
                                case 9:
                                    LogLevel logLevel7 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                        strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                                        str = (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke();
                                        currentLogHandler.d(strK, str);
                                    }
                                    break;
                                case 10:
                                    LogLevel logLevel8 = LogLevel.WARN;
                                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                        currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 11:
                                    LogLevel logLevel9 = LogLevel.WARN;
                                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                        currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 12:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke(), null);
                                    break;
                                case 13:
                                    LogLevel logLevel10 = LogLevel.WARN;
                                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                        currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 14:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1.invoke(), null);
                                    break;
                            }
                            BillingAbstract.StateListener stateListener = billingWrapper.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                            }
                            billingWrapper.executePendingRequests();
                            billingWrapper.reconnectMilliseconds = 1000L;
                            billingWrapper.trackProductDetailsNotSupportedIfNeeded();
                            break;
                    }
                    return;
                }
            }
            LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3 billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3 = new BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3(logIntent2, hVar);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d(x5.k(logLevel11, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d(x5.k(logLevel14, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d(x5.k(logLevel16, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d(x5.k(logLevel17, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3.invoke(), null);
                    break;
            }
            return;
        }
        LogIntent logIntent3 = LogIntent.GOOGLE_WARNING;
        BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2 billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2 = new BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2(logIntent3, hVar);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
            case 1:
                LogLevel logLevel21 = LogLevel.DEBUG;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                    currentLogHandler18.d(x5.k(logLevel21, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke(), null);
                break;
            case 3:
                LogLevel logLevel22 = LogLevel.WARN;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                    currentLogHandler19.w(x5.k(logLevel22, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 4:
                LogLevel logLevel23 = LogLevel.INFO;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                    currentLogHandler20.i(x5.k(logLevel23, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 5:
                LogLevel logLevel24 = LogLevel.DEBUG;
                LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                    currentLogHandler21.d(x5.k(logLevel24, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke(), null);
                break;
            case 7:
                LogLevel logLevel25 = LogLevel.INFO;
                LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                    currentLogHandler22.i(x5.k(logLevel25, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 8:
                LogLevel logLevel26 = LogLevel.DEBUG;
                LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                    currentLogHandler23.d(x5.k(logLevel26, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 9:
                LogLevel logLevel27 = LogLevel.DEBUG;
                LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                    currentLogHandler24.d(x5.k(logLevel27, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 10:
                LogLevel logLevel28 = LogLevel.WARN;
                LogHandler currentLogHandler25 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                    currentLogHandler25.w(x5.k(logLevel28, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 11:
                LogLevel logLevel29 = LogLevel.WARN;
                LogHandler currentLogHandler26 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                    currentLogHandler26.w(x5.k(logLevel29, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke(), null);
                break;
            case 13:
                LogLevel logLevel30 = LogLevel.WARN;
                LogHandler currentLogHandler27 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                    currentLogHandler27.w(x5.k(logLevel30, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2.invoke(), null);
                break;
        }
        billingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
    }

    public final void queryPurchaseType(String productType, String purchaseToken, u00.k listener, u00.k resultHandler) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), productType), new C01101(resultHandler, purchaseToken), new C01112(listener), new C01123(this), new C01134(this)), 0L, 1, null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            LogIntent logIntent = LogIntent.WARNING;
            BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1 billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1 = new BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1.invoke(), null);
                    break;
            }
            return;
        }
        LogIntent logIntent2 = LogIntent.WARNING;
        BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2 billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2 = new BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2(logIntent2, this);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel11 = LogLevel.DEBUG;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler11.d(x5.k(logLevel11, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke(), null);
                break;
            case 3:
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 4:
                LogLevel logLevel13 = LogLevel.INFO;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 5:
                LogLevel logLevel14 = LogLevel.DEBUG;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler14.d(x5.k(logLevel14, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke(), null);
                break;
            case 7:
                LogLevel logLevel15 = LogLevel.INFO;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler15.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 8:
                LogLevel logLevel16 = LogLevel.DEBUG;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler16.d(x5.k(logLevel16, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 9:
                LogLevel logLevel17 = LogLevel.DEBUG;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler17.d(x5.k(logLevel17, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 10:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler18.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 11:
                LogLevel logLevel19 = LogLevel.WARN;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler19.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke(), null);
                break;
            case 13:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler20.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2.invoke(), null);
                break;
        }
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), 900000L);
    }

    private final synchronized void sendErrorsToAllPendingRequests(PurchasesError error) {
        while (true) {
            k kVarPoll = this.serviceRequests.poll();
            if (kVarPoll != null) {
                this.mainHandler.post(new ab.f((u00.k) kVarPoll.A, error, 8));
            }
        }
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        int i;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        qd.a aVar = this.billingClient;
        h hVarD = aVar != null ? aVar.d("fff") : null;
        if (hVarD == null || (i = hVarD.a) != -2) {
            return;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        String str = hVarD.c;
        m.d(str, "billingResult.debugMessage");
        diagnosticsTracker.trackProductDetailsNotSupported(i, str);
    }

    public final void trackPurchaseStartIfNeeded(GooglePurchasingData googlePurchasingData, String oldProductId) {
        ArrayList arrayList;
        Boolean boolValueOf;
        boolean z;
        p productDetails;
        ArrayList arrayList2;
        o oVar;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        Boolean boolValueOf2 = null;
        GooglePurchasingData.Subscription subscription = googlePurchasingData instanceof GooglePurchasingData.Subscription ? (GooglePurchasingData.Subscription) googlePurchasingData : null;
        if (subscription == null || (productDetails = subscription.getProductDetails()) == null || (arrayList2 = productDetails.j) == null) {
            arrayList = null;
        } else {
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                oVar = (o) it.next();
            } while (!m.a(oVar.c, subscription.getToken()));
            db.g gVar = oVar.d;
            if (gVar != null) {
                arrayList = gVar.B;
            } else {
                arrayList = null;
            }
        }
        boolean z2 = true;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    } else if (((qd.n) it2.next()).b == 0) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (arrayList != null) {
            List listI0 = q.I0(arrayList);
            if (!listI0.isEmpty()) {
                Iterator it3 = listI0.iterator();
                do {
                    if (!it3.hasNext()) {
                        z2 = false;
                        break;
                    }
                } while (((qd.n) it3.next()).b <= 0);
            } else {
                z2 = false;
                break;
            }
            boolValueOf2 = Boolean.valueOf(z2);
        }
        this.diagnosticsTrackerIfEnabled.trackGooglePurchaseStarted(googlePurchasingData.getProductId(), oldProductId, boolValueOf, boolValueOf2);
    }

    private final void trackPurchaseUpdateReceivedIfNeeded(h billingResult, List<? extends s> purchases) {
        ArrayList arrayList;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker == null) {
            return;
        }
        ArrayList arrayList2 = null;
        if (purchases != null) {
            arrayList = new ArrayList();
            Iterator<T> it = purchases.iterator();
            while (it.hasNext()) {
                v.u0(((s) it.next()).a(), arrayList);
            }
        } else {
            arrayList = null;
        }
        if (purchases != null) {
            arrayList2 = new ArrayList(r.q0(purchases, 10));
            Iterator<T> it2 = purchases.iterator();
            while (it2.hasNext()) {
                int i = 1;
                if (((s) it2.next()).c.optInt("purchaseState", 1) == 4) {
                    i = 2;
                }
                arrayList2.add(PurchaseStateConversionsKt.toRevenueCatPurchaseState(i).name());
            }
        }
        int i2 = billingResult.a;
        String str = billingResult.c;
        m.d(str, "billingResult.debugMessage");
        diagnosticsTracker.trackGooglePurchaseUpdateReceived(arrayList, arrayList2, i2, str);
    }

    public final void withConnectedClient(u00.k receivingFunction) {
        b0 b0Var;
        qd.a aVar = this.billingClient;
        if (aVar == null) {
            b0Var = null;
        } else {
            if (!((qd.b) aVar).N()) {
                aVar = null;
            }
            if (aVar != null) {
                receivingFunction.invoke(aVar);
                b0Var = b0.a;
            } else {
                b0Var = null;
            }
        }
        if (b0Var == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            BillingWrapper$withConnectedClient$$inlined$log$1 billingWrapper$withConnectedClient$$inlined$log$1 = new BillingWrapper$withConnectedClient$$inlined$log$1(logIntent, this);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$withConnectedClient$$inlined$log$1.invoke(), null);
                    break;
            }
        }
    }

    public final void acknowledge$purchases_defaultsBc8Release(String token, PostReceiptInitiationSource initiationSource, u00.k onAcknowledged) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(token, "token");
        m.e(initiationSource, "initiationSource");
        m.e(onAcknowledged, "onAcknowledged");
        LogIntent logIntent = LogIntent.PURCHASE;
        BillingWrapper$acknowledge$$inlined$log$1 billingWrapper$acknowledge$$inlined$log$1 = new BillingWrapper$acknowledge$$inlined$log$1(logIntent, token);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$acknowledge$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$acknowledge$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$acknowledge$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$acknowledge$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$acknowledge$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$acknowledge$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$acknowledge$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$acknowledge$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$acknowledge$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onAcknowledged, BillingWrapper$acknowledge$2.INSTANCE, new BillingWrapper$acknowledge$3(this), new BillingWrapper$acknowledge$4(this)), 0L, 1, null);
    }

    @Override
    public void consumeAndSave(boolean finishTransactions, StoreTransaction purchase, boolean shouldConsume, PostReceiptInitiationSource initiationSource) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(purchase, "purchase");
        m.e(initiationSource, "initiationSource");
        if (purchase.getType() == ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        s originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(purchase);
        boolean zOptBoolean = originalGooglePurchase != null ? originalGooglePurchase.c.optBoolean("acknowledged", true) : false;
        boolean z = purchase.getType() == ProductType.INAPP;
        BillingWrapper$consumeAndSave$addToken$1 billingWrapper$consumeAndSave$addToken$1 = new BillingWrapper$consumeAndSave$addToken$1(this, purchase);
        if (!z) {
            if (!finishTransactions || zOptBoolean) {
                billingWrapper$consumeAndSave$addToken$1.invoke((Object) purchase.getPurchaseToken());
                return;
            } else {
                acknowledge$purchases_defaultsBc8Release(purchase.getPurchaseToken(), initiationSource, billingWrapper$consumeAndSave$addToken$1);
                return;
            }
        }
        if (finishTransactions && shouldConsume) {
            consumePurchase$purchases_defaultsBc8Release(purchase.getPurchaseToken(), initiationSource, billingWrapper$consumeAndSave$addToken$1);
            return;
        }
        if (!finishTransactions || zOptBoolean) {
            billingWrapper$consumeAndSave$addToken$1.invoke((Object) purchase.getPurchaseToken());
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        BillingWrapper$consumeAndSave$$inlined$log$1 billingWrapper$consumeAndSave$$inlined$log$1 = new BillingWrapper$consumeAndSave$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumeAndSave$$inlined$log$1.invoke(), null);
                break;
        }
        acknowledge$purchases_defaultsBc8Release(purchase.getPurchaseToken(), initiationSource, billingWrapper$consumeAndSave$addToken$1);
    }

    public final void consumePurchase$purchases_defaultsBc8Release(String token, PostReceiptInitiationSource initiationSource, u00.k onConsumed) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(token, "token");
        m.e(initiationSource, "initiationSource");
        m.e(onConsumed, "onConsumed");
        LogIntent logIntent = LogIntent.PURCHASE;
        BillingWrapper$consumePurchase$$inlined$log$1 billingWrapper$consumePurchase$$inlined$log$1 = new BillingWrapper$consumePurchase$$inlined$log$1(logIntent, token);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$consumePurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumePurchase$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$consumePurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumePurchase$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$consumePurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$consumePurchase$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumePurchase$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$consumePurchase$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$consumePurchase$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onConsumed, BillingWrapper$consumePurchase$2.INSTANCE, new BillingWrapper$consumePurchase$3(this), new BillingWrapper$consumePurchase$4(this)), 0L, 1, null);
    }

    @Override
    public void endConnection() {
        this.mainHandler.post(new b(this, 0));
    }

    @Override
    public void findPurchaseInPurchaseHistory(String appUserID, ProductType productType, String productId, u00.k onCompletion, u00.k onError) {
        u00.k kVar;
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(appUserID, "appUserID");
        m.e(productType, "productType");
        m.e(productId, "productId");
        m.e(onCompletion, "onCompletion");
        m.e(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1 billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1 = new BillingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1(logIntent, productId, productType);
        b0 b0Var = null;
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1.invoke(), null);
                break;
        }
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        if (googleProductType != null) {
            kVar = onError;
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new BillingWrapper$findPurchaseInPurchaseHistory$2$1(onCompletion, productId, onError), kVar, new BillingWrapper$findPurchaseInPurchaseHistory$2$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$2$3(this)), 0L, 1, null);
            b0Var = b0.a;
        } else {
            kVar = onError;
        }
        if (b0Var == null) {
            kVar.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
        }
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    public final synchronized qd.a getBillingClient() {
        return this.billingClient;
    }

    public final Map<String, PurchaseContext> getPurchaseContext$purchases_defaultsBc8Release() {
        return this.purchaseContext;
    }

    public final void getPurchaseType$purchases_defaultsBc8Release(String purchaseToken, u00.k listener) {
        m.e(purchaseToken, "purchaseToken");
        m.e(listener, "listener");
        queryPurchaseType("subs", purchaseToken, listener, new BillingWrapper$getPurchaseType$1(listener, this, purchaseToken));
    }

    @Override
    public void getStorefront(u00.k onSuccess, u00.k onError) {
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), BillingStrings.BILLING_INITIATE_GETTING_COUNTRY_CODE);
        }
        BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new AnonymousClass2(onSuccess), onError, new AnonymousClass3(this), new AnonymousClass4(this)), 0L, 1, null);
    }

    @Override
    public boolean isConnected() {
        qd.b bVar = this.billingClient;
        if (bVar != null) {
            return bVar.N();
        }
        return false;
    }

    @Override
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice) {
        String optionId;
        ReplacementMode replacementMode;
        List addOnProducts;
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(activity, "activity");
        m.e(appUserID, "appUserID");
        m.e(purchasingData, "purchasingData");
        GooglePurchasingData googlePurchasingData = purchasingData instanceof GooglePurchasingData ? (GooglePurchasingData) purchasingData : null;
        if (googlePurchasingData == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2)));
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            optionId = null;
        } else {
            if (!(googlePurchasingData instanceof GooglePurchasingData.Subscription)) {
                throw new NoWhenBranchMatchedException();
            }
            optionId = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        }
        if (replaceProductInfo == null) {
            LogIntent logIntent = LogIntent.PURCHASE;
            BillingWrapper$makePurchaseAsync$$inlined$log$2 billingWrapper$makePurchaseAsync$$inlined$log$2 = new BillingWrapper$makePurchaseAsync$$inlined$log$2(logIntent, googlePurchasingData);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d(x5.k(logLevel4, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d(x5.k(logLevel6, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d(x5.k(logLevel7, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$2.invoke(), null);
                    break;
            }
        } else {
            LogIntent logIntent2 = LogIntent.PURCHASE;
            BillingWrapper$makePurchaseAsync$$inlined$log$1 billingWrapper$makePurchaseAsync$$inlined$log$1 = new BillingWrapper$makePurchaseAsync$$inlined$log$1(logIntent2, replaceProductInfo, googlePurchasingData);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        strK = x5.k(logLevel11, new StringBuilder("[Purchases] - "));
                        str = (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler12.w(x5.k(logLevel12, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler13.i(x5.k(logLevel13, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        strK = x5.k(logLevel14, new StringBuilder("[Purchases] - "));
                        str = (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler14.i(x5.k(logLevel15, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        strK = x5.k(logLevel16, new StringBuilder("[Purchases] - "));
                        str = (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        strK = x5.k(logLevel17, new StringBuilder("[Purchases] - "));
                        str = (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke();
                        currentLogHandler.d(strK, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w(x5.k(logLevel18, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w(x5.k(logLevel19, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(x5.k(logLevel20, new StringBuilder("[Purchases] - ")), (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$makePurchaseAsync$$inlined$log$1.invoke(), null);
                    break;
            }
        }
        synchronized (this) {
            if (replaceProductInfo != null) {
                try {
                    replacementMode = replaceProductInfo.getReplacementMode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                replacementMode = null;
            }
            String productId = replacementMode == GoogleReplacementMode.DEFERRED ? (String) q.L0(replaceProductInfo.getOldPurchase().getProductIds()) : googlePurchasingData.getProductId();
            i00.f fVar = new i00.f();
            if (optionId != null) {
            }
            GooglePurchasingData.Subscription subscription = googlePurchasingData instanceof GooglePurchasingData.Subscription ? (GooglePurchasingData.Subscription) googlePurchasingData : null;
            if (subscription != null && (addOnProducts = subscription.getAddOnProducts()) != null) {
                ArrayList<GooglePurchasingData.Subscription> arrayList = new ArrayList();
                for (Object obj : addOnProducts) {
                    if (obj instanceof GooglePurchasingData.Subscription) {
                        arrayList.add(obj);
                    }
                }
                for (GooglePurchasingData.Subscription subscription2 : arrayList) {
                    fVar.put(subscription2.getProductId(), subscription2.getOptionId());
                }
            }
            i00.f fVarC = fVar.c();
            Map<String, PurchaseContext> map = this.purchaseContext;
            ProductType productType = googlePurchasingData.getProductType();
            ReplacementMode replacementMode2 = replaceProductInfo != null ? replaceProductInfo.getReplacementMode() : null;
            map.put(productId, new PurchaseContext(productType, presentedOfferingContext, optionId, replacementMode2 instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode2 : null, fVarC));
        }
        executeRequestOnUIThread$default(this, null, new C01074(purchasingData, replaceProductInfo, appUserID, isPersonalizedPrice, googlePurchasingData, activity), 1, null);
    }

    public void onBillingServiceDisconnected() {
        LogHandler currentLogHandler;
        String strK;
        String str;
        LogIntent logIntent = LogIntent.WARNING;
        BillingWrapper$onBillingServiceDisconnected$$inlined$log$1 billingWrapper$onBillingServiceDisconnected$$inlined$log$1 = new BillingWrapper$onBillingServiceDisconnected$$inlined$log$1(logIntent, this);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onBillingServiceDisconnected$$inlined$log$1.invoke(), null);
                break;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGoogleBillingServiceDisconnected();
        }
    }

    public void onBillingSetupFinished(h billingResult) {
        m.e(billingResult, "billingResult");
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            int i = billingResult.a;
            String str = billingResult.c;
            m.d(str, "billingResult.debugMessage");
            diagnosticsTracker.trackGoogleBillingSetupFinished(i, str, l.k0(l.t0(q.D0(this.serviceRequests), MAX_PENDING_REQUEST_COUNT_REPORTED)));
        }
        this.mainHandler.post(new ab.f(billingResult, this, 7));
    }

    public void onPurchasesUpdated(h billingResult, List<? extends s> purchases) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(billingResult, "billingResult");
        trackPurchaseUpdateReceivedIfNeeded(billingResult, purchases);
        List<? extends s> list = purchases == null ? x.A : purchases;
        if (billingResult.a == 0 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                getStoreTransaction((s) it.next(), new BillingWrapper$onPurchasesUpdated$1$1(arrayList, list, this));
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        BillingWrapper$onPurchasesUpdated$$inlined$log$1 billingWrapper$onPurchasesUpdated$$inlined$log$1 = new BillingWrapper$onPurchasesUpdated$$inlined$log$1(logIntent, billingResult, list);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$onPurchasesUpdated$$inlined$log$1.invoke(), null);
                break;
        }
        String str2 = "Error updating purchases. " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult);
        int i = billingResult.a;
        if (purchases == null && i == 0) {
            str2 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
            i = 6;
        }
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(i, str2);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesErrorBillingResponseToPurchasesError);
        }
    }

    @Override
    public void queryAllPurchases(String appUserID, u00.k onReceivePurchaseHistory, u00.k onReceivePurchaseHistoryError) {
        m.e(appUserID, "appUserID");
        m.e(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        m.e(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync("subs", new AnonymousClass1(onReceivePurchaseHistoryError, onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override
    public void queryProductDetailsAsync(ProductType productType, Set<String> productIds, u00.k onReceive, u00.k onError) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(productType, "productType");
        m.e(productIds, "productIds");
        m.e(onReceive, "onReceive");
        m.e(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$queryProductDetailsAsync$$inlined$log$1 billingWrapper$queryProductDetailsAsync$$inlined$log$1 = new BillingWrapper$queryProductDetailsAsync$$inlined$log$1(logIntent, productIds);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryProductDetailsAsync$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productIds, productType, getAppInBackground()), onReceive, onError, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    public final void queryPurchaseHistoryAsync(String productType, u00.k onReceivePurchaseHistory, u00.k onReceivePurchaseHistoryError) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(productType, "productType");
        m.e(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        m.e(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$queryPurchaseHistoryAsync$$inlined$log$1 billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1 = new BillingWrapper$queryPurchaseHistoryAsync$$inlined$log$1(logIntent, productType);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchaseHistoryAsync$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productType, getAppInBackground()), onReceivePurchaseHistory, onReceivePurchaseHistoryError, new C01082(this), new C01093(this)), 0L, 1, null);
    }

    @Override
    public void queryPurchases(String appUserID, u00.k onSuccess, u00.k onError) {
        LogHandler currentLogHandler;
        String strK;
        String str;
        m.e(appUserID, "appUserID");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        BillingWrapper$queryPurchases$$inlined$log$1 billingWrapper$queryPurchases$$inlined$log$1 = new BillingWrapper$queryPurchases$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strK = x5.k(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(x5.k(logLevel2, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strK = x5.k(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(x5.k(logLevel5, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strK = x5.k(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strK = x5.k(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) billingWrapper$queryPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strK, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(x5.k(logLevel8, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(x5.k(logLevel9, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(x5.k(logLevel10, new StringBuilder("[Purchases] - ")), (String) billingWrapper$queryPurchases$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$queryPurchases$$inlined$log$1.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), onSuccess, onError, new C01142(this), new C01153(this)), 0L, 1, null);
    }

    public final synchronized void setBillingClient(qd.a aVar) {
        this.billingClient = aVar;
    }

    @Override
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, u00.a subscriptionStatusChange) {
        m.e(activity, "activity");
        m.e(inAppMessageTypes, "inAppMessageTypes");
        m.e(subscriptionStatusChange, "subscriptionStatusChange");
        if (inAppMessageTypes.isEmpty()) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", BillingStrings.BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES, null);
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<? extends InAppMessageType> it = inAppMessageTypes.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(it.next().getInAppMessageCategoryId()));
        }
        executeRequestOnUIThread$default(this, null, new C01162(new WeakReference(activity), new i(hashSet), subscriptionStatusChange), 1, null);
    }

    @Override
    public void startConnection() {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogHandler currentLogHandler2;
        String str3;
        String str4;
        synchronized (this) {
            try {
                if (this.billingClient == null) {
                    this.billingClient = this.clientFactory.buildClient(this);
                }
                this.reconnectionAlreadyScheduled = false;
                qd.b bVar = this.billingClient;
                if (bVar != null && !bVar.N()) {
                    LogIntent logIntent = LogIntent.DEBUG;
                    BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1 billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1 = new BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1(logIntent, bVar);
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                str = "[Purchases] - " + logLevel.name();
                                str2 = (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                str3 = "[Purchases] - " + logLevel4.name();
                                str4 = (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke();
                                currentLogHandler2.d(str3, str4);
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                str = "[Purchases] - " + logLevel6.name();
                                str2 = (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke();
                                currentLogHandler.d(str, str2);
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str3 = "[Purchases] - " + logLevel7.name();
                                str4 = (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke();
                                currentLogHandler2.d(str3, str4);
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke(), null);
                            break;
                        case 13:
                            LogLevel logLevel10 = LogLevel.WARN;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke());
                            }
                            break;
                        case 14:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1.invoke(), null);
                            break;
                    }
                    DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
                    if (diagnosticsTracker != null) {
                        diagnosticsTracker.trackGoogleBillingStartConnection();
                    }
                    try {
                        try {
                            bVar.i(this);
                        } catch (IllegalStateException e) {
                            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                            BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2 billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2 = new BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2(logIntent2, e);
                            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                                case 1:
                                    LogLevel logLevel11 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                        currentLogHandler9.d("[Purchases] - " + logLevel11.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 2:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke(), null);
                                    break;
                                case 3:
                                    LogLevel logLevel12 = LogLevel.WARN;
                                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                        currentLogHandler10.w("[Purchases] - " + logLevel12.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 4:
                                    LogLevel logLevel13 = LogLevel.INFO;
                                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                        currentLogHandler11.i("[Purchases] - " + logLevel13.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 5:
                                    LogLevel logLevel14 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                        currentLogHandler12.d("[Purchases] - " + logLevel14.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 6:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke(), null);
                                    break;
                                case 7:
                                    LogLevel logLevel15 = LogLevel.INFO;
                                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                        currentLogHandler13.i("[Purchases] - " + logLevel15.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 8:
                                    LogLevel logLevel16 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                        currentLogHandler14.d("[Purchases] - " + logLevel16.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 9:
                                    LogLevel logLevel17 = LogLevel.DEBUG;
                                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                        currentLogHandler15.d("[Purchases] - " + logLevel17.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 10:
                                    LogLevel logLevel18 = LogLevel.WARN;
                                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                        currentLogHandler16.w("[Purchases] - " + logLevel18.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 11:
                                    LogLevel logLevel19 = LogLevel.WARN;
                                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                        currentLogHandler17.w("[Purchases] - " + logLevel19.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 12:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke(), null);
                                    break;
                                case 13:
                                    LogLevel logLevel20 = LogLevel.WARN;
                                    LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                        currentLogHandler18.w("[Purchases] - " + logLevel20.name(), (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke());
                                    }
                                    break;
                                case 14:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) billingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2.invoke(), null);
                                    break;
                            }
                            sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e.getMessage()));
                        }
                    } catch (SecurityException e2) {
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", BillingStrings.SECURITY_EXCEPTION_WHEN_CONNECTING, e2);
                        sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e2.getMessage()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void startConnectionOnMainThread(long delayMilliseconds) {
        this.mainHandler.postDelayed(new b(this, 1), delayMilliseconds);
    }
}
