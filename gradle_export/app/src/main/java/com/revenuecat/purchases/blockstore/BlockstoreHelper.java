package com.revenuecat.purchases.blockstore;

import a40.c0;
import a40.m0;
import a40.w1;
import a40.z;
import android.app.Activity;
import android.content.Context;
import c3.x1;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.identity.IdentityManager;
import g00.b0;
import h00.y;
import java.util.ArrayList;
import java.util.Map;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import m00.i;
import ne.b;
import pe.d;
import qd.s0;
import ri.t1;
import u00.k;
import u00.n;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0013\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/blockstore/BlockstoreHelper;", "", "Landroid/content/Context;", "applicationContext", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lne/a;", "blockstoreClient", "La40/z;", "ioScope", "mainScope", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;Lne/a;La40/z;La40/z;)V", "", "", "Lne/d;", "getBlockstoreData", "(Lk00/c;)Ljava/lang/Object;", "blockstoreDataMap", "userId", "Lg00/b0;", "storeUserIdIfNeeded", "(Ljava/util/Map;Ljava/lang/String;Lk00/c;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lkotlin/Function0;", "callback", "aliasCurrentAndStoredUserIdsIfNeeded", "(Lu00/a;)V", "clearUserIdBackupIfNeeded", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lne/a;", "La40/z;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BlockstoreHelper {

    @Deprecated
    public static final int BLOCKSTORE_MAX_ENTRIES = 16;

    @Deprecated
    public static final String BLOCKSTORE_USER_ID_KEY = "com.revenuecat.purchases.app_user_id";
    private static final Companion Companion = new Companion(null);
    private final ne.a blockstoreClient;
    private final IdentityManager identityManager;
    private final z ioScope;
    private final z mainScope;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/blockstore/BlockstoreHelper$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lne/a;", "initializeBlockstoreClient", "(Landroid/content/Context;)Lne/a;", "", "BLOCKSTORE_MAX_ENTRIES", "I", "", "BLOCKSTORE_USER_ID_KEY", "Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final ne.a initializeBlockstoreClient(Context applicationContext) {
            m.e(applicationContext, "applicationContext");
            try {
                return new jf.a(applicationContext, (Activity) null, jf.a.a, e.e, com.google.android.gms.common.api.m.c);
            } catch (NoClassDefFoundError e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot find Blockstore at runtime. Disabling automatic backups.", e);
                return null;
            }
        }
    }

    @m00.e(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1", f = "BlockstoreHelper.kt", l = {87, 100}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends i implements n {
        final u00.a $callback;
        final String $currentUserId;
        int label;

        public AnonymousClass1(String str, u00.a aVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$currentUserId = str;
            this.$callback = aVar;
        }

        @Override
        public final c<b0> create(Object obj, c<?> cVar) {
            return BlockstoreHelper.this.new AnonymousClass1(this.$currentUserId, this.$callback, cVar);
        }

        @Override
        public final Object invoke(z zVar, c<? super b0> cVar) {
            return ((AnonymousClass1) create(zVar, cVar)).invokeSuspend(b0.a);
        }

        @Override
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.blockstore.BlockstoreHelper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @m00.e(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1", f = "BlockstoreHelper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C00861 extends i implements n {
        final ne.a $blockstoreClient;
        final u00.a $callback;
        final b $request;
        int label;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lg00/b0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00141 extends kotlin.jvm.internal.n implements k {
            final u00.a $callback;

            public C00141(u00.a aVar) {
                super(1);
                this.$callback = aVar;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((Boolean) obj);
                return b0.a;
            }

            public final void invoke(Boolean bool) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "Block store cached UserID cleared if any");
                }
                this.$callback.invoke();
            }
        }

        public C00861(ne.a aVar, b bVar, u00.a aVar2, c<? super C00861> cVar) {
            super(2, cVar);
            this.$blockstoreClient = aVar;
            this.$request = bVar;
            this.$callback = aVar2;
        }

        public static final void invokeSuspend$lambda$2(u00.a aVar, Exception exc) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Tried to clear Block store cached UserID but failed: " + exc.getMessage(), exc);
            aVar.invoke();
        }

        @Override
        public final c<b0> create(Object obj, c<?> cVar) {
            return new C00861(this.$blockstoreClient, this.$request, this.$callback, cVar);
        }

        @Override
        public final Object invoke(z zVar, c<? super b0> cVar) {
            return ((C00861) create(zVar, cVar)).invokeSuspend(b0.a);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            jf.a aVar2 = this.$blockstoreClient;
            b bVar = this.$request;
            jf.a aVar3 = aVar2;
            aVar3.getClass();
            d0.i(bVar, "DeleteBytesRequest cannot be null");
            x1 x1VarA = t.a();
            x1VarA.e = new d[]{jf.b.c};
            x1VarA.d = new hf.c(aVar3, bVar, 7);
            x1VarA.b = false;
            x1VarA.c = 1669;
            aVar3.doWrite(x1VarA.a()).g(new a(new C00141(this.$callback))).e(new a(this.$callback));
            return b0.a;
        }
    }

    @m00.e(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$storeUserIdIfNeeded$1", f = "BlockstoreHelper.kt", l = {61, 67}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C00871 extends i implements n {
        final String $currentUserId;
        int label;

        public C00871(String str, c<? super C00871> cVar) {
            super(2, cVar);
            this.$currentUserId = str;
        }

        @Override
        public final c<b0> create(Object obj, c<?> cVar) {
            return BlockstoreHelper.this.new C00871(this.$currentUserId, cVar);
        }

        @Override
        public final Object invoke(z zVar, c<? super b0> cVar) {
            return ((C00871) create(zVar, cVar)).invokeSuspend(b0.a);
        }

        @Override
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.blockstore.BlockstoreHelper.C00871.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BlockstoreHelper(Context applicationContext, IdentityManager identityManager, ne.a aVar, z ioScope, z mainScope) {
        m.e(applicationContext, "applicationContext");
        m.e(identityManager, "identityManager");
        m.e(ioScope, "ioScope");
        m.e(mainScope, "mainScope");
        this.identityManager = identityManager;
        this.blockstoreClient = aVar;
        this.ioScope = ioScope;
        this.mainScope = mainScope;
    }

    public BlockstoreHelper(Context context, IdentityManager identityManager, ne.a aVar, z zVar, z zVar2, int i, f fVar) {
        ne.a aVarInitializeBlockstoreClient = (i & 4) != 0 ? Companion.initializeBlockstoreClient(context) : aVar;
        if ((i & 8) != 0) {
            w1 w1VarE = c0.e();
            h40.e eVar = m0.a;
            zVar = c0.c(rd.a.P(w1VarE, h40.d.C.q0(1)));
        }
        z zVar3 = zVar;
        if ((i & 16) != 0) {
            w1 w1VarE2 = c0.e();
            h40.e eVar2 = m0.a;
            zVar2 = c0.c(rd.a.P(w1VarE2, f40.m.a));
        }
        this(context, identityManager, aVarInitializeBlockstoreClient, zVar3, zVar2);
    }

    public static final void aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper blockstoreHelper, u00.a aVar) {
        c0.y(blockstoreHelper.mainScope, null, null, new BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1(aVar, null), 3);
    }

    public final Object getBlockstoreData(c<? super Map<String, ? extends ne.d>> cVar) {
        jf.a aVar = this.blockstoreClient;
        if (aVar == null) {
            return y.A;
        }
        ne.c cVar2 = new ne.c(new ArrayList(), true);
        final k00.k kVar = new k00.k(s0.j0(cVar));
        jf.a aVar2 = aVar;
        x1 x1VarA = t.a();
        x1VarA.e = new d[]{jf.b.d};
        x1VarA.d = new hf.c(aVar2, cVar2, 8);
        x1VarA.b = false;
        x1VarA.c = 1668;
        aVar2.doRead(x1VarA.a()).g(new BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(new BlockstoreHelper$getBlockstoreData$2$1(kVar))).e(new xf.d() {
            public final void onFailure(Exception it) {
                m.e(it, "it");
                kVar.resumeWith(t1.s(it));
            }
        });
        Object objA = kVar.a();
        l00.a aVar3 = l00.a.A;
        return objA;
    }

    public final Object storeUserIdIfNeeded(Map<String, ? extends ne.d> map, String str, c<? super b0> cVar) {
        jf.a aVar = this.blockstoreClient;
        b0 b0Var = b0.a;
        if (aVar != null) {
            if (map.get(BLOCKSTORE_USER_ID_KEY) != null) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "Block store: Not storing user id since there is one already present.");
                    return b0Var;
                }
            } else if (map.size() >= 16) {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    x5.w(logLevel2, new StringBuilder("[Purchases] - "), currentLogHandler2, "Block store: Not storing user id since block store is already full.");
                    return b0Var;
                }
            } else {
                LogLevel logLevel3 = LogLevel.DEBUG;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.d(x5.k(logLevel3, new StringBuilder("[Purchases] - ")), "Block store: Storing UserID: " + str + " in Block store.");
                }
                byte[] bytes = str.getBytes(r30.a.a);
                m.d(bytes, "getBytes(...)");
                d0.f(BLOCKSTORE_USER_ID_KEY, "key cannot be null or empty");
                ne.f fVar = new ne.f(BLOCKSTORE_USER_ID_KEY, true, bytes);
                final k00.k kVar = new k00.k(s0.j0(cVar));
                jf.a aVar2 = aVar;
                x1 x1VarA = t.a();
                x1VarA.e = new d[]{jf.b.a, jf.b.b};
                x1VarA.d = new gi.c(aVar2, fVar, 10);
                x1VarA.c = 1645;
                x1VarA.b = false;
                aVar2.doWrite(x1VarA.a()).g(new BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(new BlockstoreHelper$storeUserIdIfNeeded$6$1(kVar, str))).e(new xf.d() {
                    public final void onFailure(Exception it) {
                        m.e(it, "it");
                        kVar.resumeWith(t1.s(it));
                    }
                });
                Object objA = kVar.a();
                if (objA == l00.a.A) {
                    return objA;
                }
            }
        }
        return b0Var;
    }

    public final void aliasCurrentAndStoredUserIdsIfNeeded(u00.a callback) {
        m.e(callback, "callback");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        if (IdentityManager.INSTANCE.isUserIDAnonymous(currentAppUserID)) {
            c0.y(this.ioScope, null, null, new AnonymousClass1(currentAppUserID, callback, null), 3);
        } else {
            aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(this, callback);
        }
    }

    public final void clearUserIdBackupIfNeeded(u00.a callback) {
        m.e(callback, "callback");
        ne.a aVar = this.blockstoreClient;
        if (aVar == null) {
            callback.invoke();
            return;
        }
        new ArrayList();
        c0.y(this.ioScope, null, null, new C00861(aVar, new b(va.a.R(BLOCKSTORE_USER_ID_KEY), false), callback, null), 3);
    }

    public final void storeUserIdIfNeeded(CustomerInfo customerInfo) {
        m.e(customerInfo, "customerInfo");
        if (this.blockstoreClient == null) {
            return;
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        if (!IdentityManager.INSTANCE.isUserIDAnonymous(currentAppUserID) || customerInfo.getAllPurchasedProductIds().isEmpty()) {
            return;
        }
        c0.y(this.ioScope, null, null, new C00871(currentAppUserID, null), 3);
    }
}
