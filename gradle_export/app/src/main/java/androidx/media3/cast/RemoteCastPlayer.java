package androidx.media3.cast;

import android.content.Context;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Range;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b1;
import androidx.media3.common.c1;
import androidx.media3.common.d1;
import androidx.media3.common.e1;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.q0;
import androidx.media3.common.q2;
import androidx.media3.common.r;
import androidx.media3.common.r2;
import androidx.media3.common.s2;
import androidx.media3.common.t0;
import androidx.media3.common.w2;
import androidx.media3.common.z0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.u;
import e7.b0;
import e7.i0;
import e7.v;
import fh.d2;
import fh.r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import ta.c0;

public final class RemoteCastPlayer extends androidx.media3.common.f {
    public static final androidx.media3.common.l DEVICE_INFO_REMOTE_EMPTY;
    private static final long[] EMPTY_TRACK_ID_ARRAY;
    public static final float MAX_SPEED_SUPPORTED = 2.0f;
    private static final int MAX_VOLUME = 20;
    public static final float MIN_SPEED_SUPPORTED = 0.5f;
    static final b1 PERMANENT_AVAILABLE_COMMANDS;
    private static final long PROGRESS_REPORT_PERIOD_MS = 1000;
    private static final Range<Integer> RANGE_DEVICE_VOLUME;
    private static final Range<Float> RANGE_VOLUME;
    private static final String TAG = "RemoteCastPlayer";
    private final Api30Impl api30Impl;
    private b1 availableCommands;
    private final CastContext castContext;
    private final Cast.Listener castListener;
    private CastSession castSession;
    private CastTimeline currentTimeline;
    private s2 currentTracks;
    private int currentWindowIndex;
    private androidx.media3.common.l deviceInfo;
    private int deviceVolume;
    private SessionAvailabilityListener internalSessionAvailabilityListener;
    private boolean isMuted;
    private long lastReportedPositionMs;
    private final e7.p listeners;
    private final long maxSeekToPreviousPositionMs;
    private final MediaItemConverter mediaItemConverter;
    private t0 mediaMetadata;
    private e1 pendingMediaItemRemovalPosition;
    private int pendingSeekCount;
    private long pendingSeekPositionMs;
    private int pendingSeekWindowIndex;
    private final h2 period;
    private final StateHolder<Boolean> playWhenReady;
    private final PlaybackException playbackException;
    private final StateHolder<z0> playbackParameters;
    private int playbackState;
    private t0 playlistMetadata;
    private RemoteMediaClient remoteMediaClient;
    private final StateHolder<Integer> repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private final SeekResultCallback seekResultCallback;
    private SessionAvailabilityListener sessionAvailabilityListener;
    private final StatusListener statusListener;
    private final CastTimelineTracker timelineTracker;
    private final StateHolder<Float> volume;

    public final class Api30Impl {
        private final MediaRouter2.RouteCallback emptyRouteCallback;
        private final Handler handler = new Handler(Looper.getMainLooper());
        private final MediaRouter2 mediaRouter2;
        private final MediaRouter2.TransferCallback transferCallback;

        public final class MediaRouter2RouteCallbackImpl extends MediaRouter2.RouteCallback {
            private MediaRouter2RouteCallbackImpl() {
            }
        }

        public final class MediaRouter2TransferCallbackImpl extends MediaRouter2.TransferCallback {
            private MediaRouter2TransferCallbackImpl() {
            }

            @Override
            public void onStop(MediaRouter2.RoutingController routingController) {
                Api30Impl.this.updateDeviceInfo();
            }

            @Override
            public void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
                Api30Impl.this.updateDeviceInfo();
            }
        }

        public Api30Impl(Context context) {
            this.mediaRouter2 = MediaRouter2.getInstance(context);
            this.transferCallback = new MediaRouter2TransferCallbackImpl();
            this.emptyRouteCallback = new MediaRouter2RouteCallbackImpl();
        }

        public void updateDeviceInfo() {
            androidx.media3.common.l lVar = RemoteCastPlayer.this.deviceInfo;
            androidx.media3.common.l lVarFetchDeviceInfo = fetchDeviceInfo();
            RemoteCastPlayer.this.deviceInfo = lVarFetchDeviceInfo;
            if (RemoteCastPlayer.this.deviceInfo.equals(lVar)) {
                return;
            }
            RemoteCastPlayer.this.listeners.f(29, new k(lVarFetchDeviceInfo, 2));
        }

        public androidx.media3.common.l fetchDeviceInfo() {
            List<MediaRouter2.RoutingController> controllers = this.mediaRouter2.getControllers();
            if (controllers.size() != 2) {
                return RemoteCastPlayer.DEVICE_INFO_REMOTE_EMPTY;
            }
            MediaRouter2.RoutingController routingController = controllers.get(1);
            androidx.media3.common.k kVar = new androidx.media3.common.k(1);
            kVar.f1300d = 20;
            kVar.f1301e = routingController.getId();
            return kVar.b();
        }

        public void initialize() {
            MediaRouter2 mediaRouter2 = this.mediaRouter2;
            Handler handler = this.handler;
            Objects.requireNonNull(handler);
            mediaRouter2.registerTransferCallback(new s(handler), this.transferCallback);
            MediaRouter2 mediaRouter3 = this.mediaRouter2;
            Handler handler2 = this.handler;
            Objects.requireNonNull(handler2);
            s sVar = new s(handler2);
            MediaRouter2.RouteCallback routeCallback = this.emptyRouteCallback;
            r0 r0Var = fh.t0.B;
            mediaRouter3.registerRouteCallback(sVar, routeCallback, new RouteDiscoveryPreference.Builder(d2.E, false).build());
        }

        public void release() {
            this.mediaRouter2.unregisterTransferCallback(this.transferCallback);
            this.mediaRouter2.unregisterRouteCallback(this.emptyRouteCallback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    public static final class Builder {
        private boolean buildCalled;
        private final Context context;
        private MediaItemConverter mediaItemConverter = new DefaultMediaItemConverter();
        private long seekBackIncrementMs = 5000;
        private long seekForwardIncrementMs = 15000;
        private long maxSeekToPreviousPositionMs = 3000;

        public Builder(Context context) {
            this.context = context;
        }

        public RemoteCastPlayer build() {
            c0.A(!this.buildCalled);
            this.buildCalled = true;
            return new RemoteCastPlayer(this);
        }

        public Builder setMaxSeekToPreviousPositionMs(long j9) {
            c0.s(j9 >= 0);
            c0.A(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j9;
            return this;
        }

        public Builder setMediaItemConverter(MediaItemConverter mediaItemConverter) {
            c0.A(!this.buildCalled);
            mediaItemConverter.getClass();
            this.mediaItemConverter = mediaItemConverter;
            return this;
        }

        public Builder setSeekBackIncrementMs(long j9) {
            c0.s(j9 > 0);
            c0.A(!this.buildCalled);
            this.seekBackIncrementMs = j9;
            return this;
        }

        public Builder setSeekForwardIncrementMs(long j9) {
            c0.s(j9 > 0);
            c0.A(!this.buildCalled);
            this.seekForwardIncrementMs = j9;
            return this;
        }
    }

    public final class CastListener extends Cast.Listener {
        private CastListener() {
        }

        @Override
        public void onVolumeChanged() {
            RemoteCastPlayer.this.updateDeviceVolumeAndNotifyIfChanged();
            RemoteCastPlayer.this.listeners.b();
        }
    }

    public final class SeekResultCallback implements u {
        private SeekResultCallback() {
        }

        @Override
        public void onResult(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
            int i10 = mediaChannelResult.getStatus().A;
            if (i10 != 0 && i10 != 2103) {
                StringBuilder sbQ = oi.k.q("Seek failed. Error code ", i10, ": ");
                sbQ.append(CastUtils.getLogString(i10));
                e7.a.d(RemoteCastPlayer.TAG, sbQ.toString());
            }
            if (RemoteCastPlayer.access$1906(RemoteCastPlayer.this) == 0) {
                RemoteCastPlayer remoteCastPlayer = RemoteCastPlayer.this;
                remoteCastPlayer.currentWindowIndex = remoteCastPlayer.pendingSeekWindowIndex;
                RemoteCastPlayer.this.pendingSeekWindowIndex = -1;
                RemoteCastPlayer.this.pendingSeekPositionMs = -9223372036854775807L;
            }
        }
    }

    public static final class StateHolder<T> {
        public u pendingResultCallback;
        public T value;

        public StateHolder(T t4) {
            this.value = t4;
        }

        public boolean acceptsUpdate(u uVar) {
            return this.pendingResultCallback == uVar;
        }

        public void clearPendingResultCallback() {
            this.pendingResultCallback = null;
        }
    }

    public final class StatusListener extends RemoteMediaClient.Callback implements SessionManagerListener<CastSession>, RemoteMediaClient.ProgressListener {
        private StatusListener() {
        }

        @Override
        public void onAdBreakStatusUpdated() {
        }

        @Override
        public void onMetadataUpdated() {
        }

        @Override
        public void onPreloadStatusUpdated() {
        }

        @Override
        public void onProgressUpdated(long j9, long j10) {
            RemoteCastPlayer.this.lastReportedPositionMs = j9;
        }

        @Override
        public void onQueueStatusUpdated() {
            RemoteCastPlayer.this.updateTimelineAndNotifyIfChanged();
            RemoteCastPlayer.this.listeners.b();
        }

        @Override
        public void onSendingRemoteMediaRequest() {
        }

        @Override
        public void onSessionEnded(CastSession castSession, int i10) {
            RemoteCastPlayer.this.setCastSession(null);
        }

        @Override
        public void onSessionEnding(CastSession castSession) {
        }

        @Override
        public void onSessionResumeFailed(CastSession castSession, int i10) {
            StringBuilder sbQ = oi.k.q("Session resume failed. Error code ", i10, ": ");
            sbQ.append(CastUtils.getLogString(i10));
            e7.a.d(RemoteCastPlayer.TAG, sbQ.toString());
        }

        @Override
        public void onSessionResumed(CastSession castSession, boolean z10) {
            RemoteCastPlayer.this.setCastSession(castSession);
        }

        @Override
        public void onSessionResuming(CastSession castSession, String str) {
        }

        @Override
        public void onSessionStartFailed(CastSession castSession, int i10) {
            StringBuilder sbQ = oi.k.q("Session start failed. Error code ", i10, ": ");
            sbQ.append(CastUtils.getLogString(i10));
            e7.a.d(RemoteCastPlayer.TAG, sbQ.toString());
        }

        @Override
        public void onSessionStarted(CastSession castSession, String str) {
            RemoteCastPlayer.this.setCastSession(castSession);
        }

        @Override
        public void onSessionStarting(CastSession castSession) {
        }

        @Override
        public void onSessionSuspended(CastSession castSession, int i10) {
            RemoteCastPlayer.this.setCastSession(null);
        }

        @Override
        public void onStatusUpdated() {
            RemoteCastPlayer.this.updateInternalStateAndNotifyIfChanged();
        }
    }

    static {
        androidx.media3.common.k kVar = new androidx.media3.common.k(1);
        kVar.f1300d = 20;
        DEVICE_INFO_REMOTE_EMPTY = kVar.b();
        RANGE_DEVICE_VOLUME = new Range<>(0, 20);
        RANGE_VOLUME = new Range<>(Float.valueOf(0.0f), Float.valueOf(1.0f));
        androidx.media3.common.r0.a("media3.cast");
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i10 : new int[]{1, 2, 3, 4, 10, 23, 26, 34, 25, 33, 15, 13, 16, 17, 18, 19, 31, 20, 30, 32}) {
            c0.A(!false);
            sparseBooleanArray.append(i10, true);
        }
        c0.A(true);
        PERMANENT_AVAILABLE_COMMANDS = new b1(new r(sparseBooleanArray));
        EMPTY_TRACK_ID_ARRAY = new long[0];
    }

    public RemoteCastPlayer(Context context, CastContext castContext, MediaItemConverter mediaItemConverter, long j9, long j10, long j11) {
        b1 b1Var;
        c0.s(j9 > 0 && j10 > 0);
        c0.s(j11 >= 0);
        if (castContext != null) {
            e7.a.h(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + i0.f5136a + "]");
        }
        this.castContext = castContext;
        this.mediaItemConverter = mediaItemConverter;
        this.seekBackIncrementMs = j9;
        this.seekForwardIncrementMs = j10;
        this.maxSeekToPreviousPositionMs = j11;
        this.timelineTracker = new CastTimelineTracker(mediaItemConverter);
        this.period = new h2();
        this.castListener = new CastListener();
        StatusListener statusListener = new StatusListener();
        this.statusListener = statusListener;
        this.seekResultCallback = new SeekResultCallback();
        this.listeners = new e7.p(Looper.getMainLooper(), b0.f5117a, new l(this, 3));
        this.playWhenReady = new StateHolder<>(Boolean.FALSE);
        this.repeatMode = new StateHolder<>(0);
        this.deviceVolume = 20;
        this.volume = new StateHolder<>(Float.valueOf(1.0f));
        this.playbackParameters = new StateHolder<>(z0.f1685d);
        this.playbackState = 1;
        this.playbackException = castContext == null ? new PlaybackException("Failed to initialize Cast. This may be due to Google Play services not being available, see https://support.google.com/googleplay/answer/9037938", new ModuleUnavailableException(new Exception("Module Unavailable")), 1001, Bundle.EMPTY, SystemClock.elapsedRealtime()) : null;
        this.currentTimeline = CastTimeline.EMPTY_CAST_TIMELINE;
        t0 t0Var = t0.K;
        this.mediaMetadata = t0Var;
        this.playlistMetadata = t0Var;
        this.currentTracks = s2.f1554b;
        if (castContext == null) {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            c0.A(!false);
            b1Var = new b1(new r(sparseBooleanArray));
        } else {
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            r rVar = PERMANENT_AVAILABLE_COMMANDS.f1103a;
            for (int i10 = 0; i10 < rVar.f1465a.size(); i10++) {
                int iB = rVar.b(i10);
                c0.A(!false);
                sparseBooleanArray2.append(iB, true);
            }
            c0.A(!false);
            b1Var = new b1(new r(sparseBooleanArray2));
        }
        this.availableCommands = b1Var;
        this.pendingSeekWindowIndex = -1;
        this.pendingSeekPositionMs = -9223372036854775807L;
        if (castContext != null) {
            SessionManager sessionManager = castContext.getSessionManager();
            sessionManager.addSessionManagerListener(statusListener, CastSession.class);
            setCastSession(sessionManager.getCurrentCastSession());
        }
        updateInternalStateAndNotifyIfChanged();
        if (context == null) {
            this.api30Impl = null;
            this.deviceInfo = DEVICE_INFO_REMOTE_EMPTY;
        } else {
            Api30Impl api30Impl = new Api30Impl(context);
            this.api30Impl = api30Impl;
            api30Impl.initialize();
            this.deviceInfo = api30Impl.fetchDeviceInfo();
        }
    }

    private RemoteCastPlayer(Builder builder) {
        this(builder.context, getSharedInstantSafely(builder.context), builder.mediaItemConverter, builder.seekBackIncrementMs, builder.seekForwardIncrementMs, builder.maxSeekToPreviousPositionMs);
    }

    public static int access$1906(RemoteCastPlayer remoteCastPlayer) {
        int i10 = remoteCastPlayer.pendingSeekCount - 1;
        remoteCastPlayer.pendingSeekCount = i10;
        return i10;
    }

    private void addMediaItemsInternal(List<q0> list, int i10) {
        if (this.remoteMediaClient == null || getMediaStatus() == null) {
            return;
        }
        MediaQueueItem[] mediaQueueItems = toMediaQueueItems(list);
        this.timelineTracker.onMediaItemsAdded(list, mediaQueueItems);
        this.remoteMediaClient.queueInsertItems(mediaQueueItems, i10, null);
    }

    private static int fetchCurrentWindowIndex(RemoteMediaClient remoteMediaClient, k2 k2Var) {
        if (remoteMediaClient == null) {
            return 0;
        }
        MediaQueueItem currentItem = remoteMediaClient.getCurrentItem();
        int indexOfPeriod = currentItem != null ? k2Var.getIndexOfPeriod(Integer.valueOf(currentItem.getItemId())) : -1;
        if (indexOfPeriod == -1) {
            return 0;
        }
        return indexOfPeriod;
    }

    private static int fetchPlaybackState(RemoteMediaClient remoteMediaClient) {
        int playerState = remoteMediaClient.getPlayerState();
        if (playerState == 2 || playerState == 3) {
            return 3;
        }
        return (playerState == 4 || playerState == 5) ? 2 : 1;
    }

    private static int fetchRepeatMode(RemoteMediaClient remoteMediaClient) {
        MediaStatus mediaStatus = remoteMediaClient.getMediaStatus();
        int i10 = 0;
        if (mediaStatus == null) {
            return 0;
        }
        int queueRepeatMode = mediaStatus.getQueueRepeatMode();
        if (queueRepeatMode != 0) {
            i10 = 2;
            if (queueRepeatMode != 1) {
                if (queueRepeatMode == 2) {
                    return 1;
                }
                if (queueRepeatMode != 3) {
                    throw new IllegalStateException();
                }
            }
        }
        return i10;
    }

    private static float fetchVolume(RemoteMediaClient remoteMediaClient) {
        MediaStatus mediaStatus = remoteMediaClient.getMediaStatus();
        if (mediaStatus == null) {
            return 1.0f;
        }
        return (float) mediaStatus.getStreamVolume();
    }

    private static int getCastRepeatMode(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException();
    }

    private e1 getCurrentPositionInfo() {
        Object obj;
        q0 q0Var;
        Object obj2;
        k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            obj = null;
            q0Var = null;
            obj2 = null;
        } else {
            Object obj3 = currentTimeline.getPeriod(getCurrentPeriodIndex(), this.period, true).f1232b;
            obj = currentTimeline.getWindow(this.period.f1233c, this.window).f1283a;
            obj2 = obj3;
            q0Var = this.window.f1285c;
        }
        return new e1(obj, getCurrentMediaItemIndex(), q0Var, obj2, getCurrentPeriodIndex(), getCurrentPosition(), getContentPosition(), -1, -1);
    }

    private t0 getMediaMetadataInternal() {
        q0 currentMediaItem = getCurrentMediaItem();
        return currentMediaItem != null ? currentMediaItem.f1416d : t0.K;
    }

    private MediaStatus getMediaStatus() {
        RemoteMediaClient remoteMediaClient = this.remoteMediaClient;
        if (remoteMediaClient != null) {
            return remoteMediaClient.getMediaStatus();
        }
        return null;
    }

    private static CastContext getSharedInstantSafely(Context context) {
        try {
            return CastContext.getSharedInstance(context);
        } catch (RuntimeException e3) {
            if (e3 instanceof IllegalStateException) {
                throw e3;
            }
            e7.a.e(TAG, "Failed to initialize Cast. This may be due to Google Play services not being available, see https://support.google.com/googleplay/answer/9037938", e3);
            return null;
        }
    }

    private boolean isSetVolumeCommandAvailable() {
        MediaStatus mediaStatus;
        RemoteMediaClient remoteMediaClient = this.remoteMediaClient;
        if (remoteMediaClient == null || (mediaStatus = remoteMediaClient.getMediaStatus()) == null) {
            return false;
        }
        return mediaStatus.isMediaCommandSupported(4L);
    }

    private static boolean isTrackActive(long j9, long[] jArr) {
        for (long j10 : jArr) {
            if (j10 == j9) {
                return true;
            }
        }
        return false;
    }

    public void lambda$new$0(d1 d1Var, r rVar) {
        d1Var.l(this, new c1(rVar));
    }

    public void lambda$prepare$1(d1 d1Var) {
        d1Var.P(this.playbackException);
    }

    public void lambda$prepare$2(d1 d1Var) {
        d1Var.R(this.playbackException);
    }

    public static void lambda$seekTo$3(e1 e1Var, e1 e1Var2, d1 d1Var) {
        d1Var.h(1);
        d1Var.U(e1Var, e1Var2, 1);
    }

    public void lambda$seekTo$5(d1 d1Var) {
        d1Var.D(this.mediaMetadata);
    }

    public void lambda$setPlaylistMetadata$6(d1 d1Var) {
        d1Var.E(this.playlistMetadata);
    }

    public void lambda$updateAvailableCommandsAndNotifyIfChanged$14(d1 d1Var) {
        d1Var.T(this.availableCommands);
    }

    public void lambda$updateInternalStateAndNotifyIfChanged$10(d1 d1Var) {
        d1Var.D(this.mediaMetadata);
    }

    public static void lambda$updateInternalStateAndNotifyIfChanged$7(e1 e1Var, e1 e1Var2, d1 d1Var) {
        d1Var.h(0);
        d1Var.U(e1Var, e1Var2, 0);
    }

    public void lambda$updateInternalStateAndNotifyIfChanged$8(d1 d1Var) {
        d1Var.u(1, getCurrentMediaItem());
    }

    public void lambda$updateInternalStateAndNotifyIfChanged$9(d1 d1Var) {
        d1Var.K(this.currentTracks);
    }

    public static void lambda$updateTimelineAndNotifyIfChanged$12(e1 e1Var, e1 e1Var2, d1 d1Var) {
        d1Var.h(4);
        d1Var.U(e1Var, e1Var2, 4);
    }

    public void lambda$updateTimelineAndNotifyIfChanged$13(d1 d1Var) {
        d1Var.u(3, getCurrentMediaItem());
    }

    private void moveMediaItemsInternal(int[] iArr, int i10, int i11) {
        if (this.remoteMediaClient == null || getMediaStatus() == null) {
            return;
        }
        if (i10 < i11) {
            i11 += iArr.length;
        }
        this.remoteMediaClient.queueReorderItems(iArr, i11 < this.currentTimeline.getWindowCount() ? ((Integer) this.currentTimeline.getWindow(i11, this.window).f1283a).intValue() : 0, null);
    }

    private com.google.android.gms.common.api.s removeMediaItemsInternal(int[] iArr) {
        if (this.remoteMediaClient == null || getMediaStatus() == null) {
            return null;
        }
        k2 currentTimeline = getCurrentTimeline();
        if (!currentTimeline.isEmpty()) {
            Object obj = currentTimeline.getPeriod(getCurrentPeriodIndex(), this.period, true).f1232b;
            String str = i0.f5136a;
            for (int i10 : iArr) {
                if (obj.equals(Integer.valueOf(i10))) {
                    this.pendingMediaItemRemovalPosition = getCurrentPositionInfo();
                    break;
                }
            }
        }
        return this.remoteMediaClient.queueRemoveItems(iArr, null);
    }

    public void setCastSession(CastSession castSession) {
        CastSession castSession2 = this.castSession;
        if (castSession2 != null) {
            castSession2.removeCastListener(this.castListener);
        }
        if (castSession != null) {
            castSession.addCastListener(this.castListener);
        }
        this.castSession = castSession;
        RemoteMediaClient remoteMediaClient = castSession != null ? castSession.getRemoteMediaClient() : null;
        RemoteMediaClient remoteMediaClient2 = this.remoteMediaClient;
        if (remoteMediaClient2 == remoteMediaClient) {
            return;
        }
        if (remoteMediaClient2 != null) {
            remoteMediaClient2.unregisterCallback(this.statusListener);
            this.remoteMediaClient.removeProgressListener(this.statusListener);
        }
        this.remoteMediaClient = remoteMediaClient;
        if (remoteMediaClient == null) {
            SessionAvailabilityListener sessionAvailabilityListener = this.sessionAvailabilityListener;
            if (sessionAvailabilityListener != null) {
                sessionAvailabilityListener.onCastSessionUnavailable();
            }
            SessionAvailabilityListener sessionAvailabilityListener2 = this.internalSessionAvailabilityListener;
            if (sessionAvailabilityListener2 != null) {
                sessionAvailabilityListener2.onCastSessionUnavailable();
                return;
            }
            return;
        }
        SessionAvailabilityListener sessionAvailabilityListener3 = this.sessionAvailabilityListener;
        if (sessionAvailabilityListener3 != null) {
            sessionAvailabilityListener3.onCastSessionAvailable();
        }
        SessionAvailabilityListener sessionAvailabilityListener4 = this.internalSessionAvailabilityListener;
        if (sessionAvailabilityListener4 != null) {
            sessionAvailabilityListener4.onCastSessionAvailable();
        }
        remoteMediaClient.registerCallback(this.statusListener);
        remoteMediaClient.addProgressListener(this.statusListener, PROGRESS_REPORT_PERIOD_MS);
        updateInternalStateAndNotifyIfChanged();
    }

    private void setDeviceVolumeAndNotifyIfChanged(int i10, boolean z10) {
        if (this.deviceVolume == i10 && this.isMuted == z10) {
            return;
        }
        this.deviceVolume = i10;
        this.isMuted = z10;
        this.listeners.c(30, new m(i10, z10));
    }

    private void setMediaItemsInternal(List<q0> list, int i10, long j9, int i11) {
        if (this.remoteMediaClient == null || list.isEmpty()) {
            return;
        }
        if (j9 == -9223372036854775807L) {
            j9 = 0;
        }
        if (i10 == -1) {
            i10 = getCurrentMediaItemIndex();
            j9 = getCurrentPosition();
        }
        if (!getCurrentTimeline().isEmpty()) {
            this.pendingMediaItemRemovalPosition = getCurrentPositionInfo();
        }
        MediaQueueItem[] mediaQueueItems = toMediaQueueItems(list);
        this.timelineTracker.onMediaItemsSet(list, mediaQueueItems);
        this.remoteMediaClient.load(new MediaLoadRequestData.Builder().setAutoplay(Boolean.valueOf(getPlayWhenReady())).setQueueData(new MediaQueueData.Builder().setItems(Arrays.asList(mediaQueueItems)).setStartIndex(Math.min(i10, list.size() - 1)).setRepeatMode(getCastRepeatMode(i11)).setStartTime(j9).build()).setCurrentTime(j9).build());
    }

    private void setPlaybackParametersAndNotifyIfChanged(z0 z0Var) {
        if (this.playbackParameters.value.equals(z0Var)) {
            return;
        }
        this.playbackParameters.value = z0Var;
        this.listeners.c(12, new k(z0Var, 3));
        updateAvailableCommandsAndNotifyIfChanged();
    }

    private void setPlayerStateAndNotifyIfChanged(boolean z10, int i10, int i11) {
        boolean z11 = false;
        boolean z12 = this.playbackState == 3 && this.playWhenReady.value.booleanValue();
        boolean z13 = this.playWhenReady.value.booleanValue() != z10;
        boolean z14 = this.playbackState != i11;
        if (z13 || z14) {
            this.playbackState = i11;
            this.playWhenReady.value = Boolean.valueOf(z10);
            this.listeners.c(-1, new m(i11, 0, z10));
            if (z14) {
                this.listeners.c(4, new n(i11, 0));
            }
            if (z13) {
                this.listeners.c(5, new m(i10, 1, z10));
            }
            if (i11 == 3 && z10) {
                z11 = true;
            }
            if (z12 != z11) {
                this.listeners.c(7, new o(0, z11));
            }
        }
    }

    private void setRepeatModeAndNotifyIfChanged(int i10) {
        if (this.repeatMode.value.intValue() != i10) {
            this.repeatMode.value = Integer.valueOf(i10);
            this.listeners.c(8, new n(i10, 1));
            updateAvailableCommandsAndNotifyIfChanged();
        }
    }

    private void setVolumeAndNotifyIfChanged(float f3) {
        if (this.volume.value.floatValue() != f3) {
            this.volume.value = Float.valueOf(f3);
            this.listeners.c(22, new q(f3, 0));
            updateAvailableCommandsAndNotifyIfChanged();
        }
    }

    private MediaQueueItem[] toMediaQueueItems(List<q0> list) {
        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaQueueItemArr[i10] = this.mediaItemConverter.toMediaQueueItem(list.get(i10));
        }
        return mediaQueueItemArr;
    }

    private void updateAvailableCommandsAndNotifyIfChanged() {
        if (this.castContext == null) {
            return;
        }
        b1 b1Var = this.availableCommands;
        b1 b1VarO = i0.o(this, PERMANENT_AVAILABLE_COMMANDS);
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.e(b1VarO.f1103a);
        if (isSetVolumeCommandAvailable()) {
            qVar.d(22);
        }
        if (isSetVolumeCommandAvailable()) {
            qVar.d(24);
        }
        b1 b1Var2 = new b1(qVar.g());
        this.availableCommands = b1Var2;
        if (b1Var2.equals(b1Var)) {
            return;
        }
        this.listeners.c(13, new l(this, 1));
    }

    public void updateDeviceVolumeAndNotifyIfChanged() {
        CastSession castSession = this.castSession;
        if (castSession != null) {
            setDeviceVolumeAndNotifyIfChanged(((Integer) RANGE_DEVICE_VOLUME.clamp(Integer.valueOf((int) Math.round(castSession.getVolume() * 20.0d)))).intValue(), this.castSession.isMute());
        }
    }

    public void updateInternalStateAndNotifyIfChanged() {
        if (this.remoteMediaClient == null) {
            return;
        }
        int i10 = this.currentWindowIndex;
        t0 t0Var = this.mediaMetadata;
        Object obj = !getCurrentTimeline().isEmpty() ? getCurrentTimeline().getPeriod(i10, this.period, true).f1232b : null;
        updatePlayerStateAndNotifyIfChanged(null);
        updateDeviceVolumeAndNotifyIfChanged();
        updateRepeatModeAndNotifyIfChanged(null);
        updateVolumeAndNotifyIfChanged(null);
        updatePlaybackRateAndNotifyIfChanged(null);
        boolean zUpdateTimelineAndNotifyIfChanged = updateTimelineAndNotifyIfChanged();
        k2 currentTimeline = getCurrentTimeline();
        this.currentWindowIndex = fetchCurrentWindowIndex(this.remoteMediaClient, currentTimeline);
        this.mediaMetadata = getMediaMetadataInternal();
        Object obj2 = currentTimeline.isEmpty() ? null : currentTimeline.getPeriod(this.currentWindowIndex, this.period, true).f1232b;
        if (!zUpdateTimelineAndNotifyIfChanged && !Objects.equals(obj, obj2) && this.pendingSeekCount == 0) {
            currentTimeline.getPeriod(i10, this.period, true);
            currentTimeline.getWindow(i10, this.window);
            long jW = i0.W(this.window.m);
            j2 j2Var = this.window;
            Object obj3 = j2Var.f1283a;
            h2 h2Var = this.period;
            int i11 = h2Var.f1233c;
            e1 e1Var = new e1(obj3, i11, j2Var.f1285c, h2Var.f1232b, i11, jW, jW, -1, -1);
            currentTimeline.getPeriod(this.currentWindowIndex, this.period, true);
            currentTimeline.getWindow(this.currentWindowIndex, this.window);
            j2 j2Var2 = this.window;
            Object obj4 = j2Var2.f1283a;
            h2 h2Var2 = this.period;
            int i12 = h2Var2.f1233c;
            this.listeners.c(11, new p(e1Var, new e1(obj4, i12, j2Var2.f1285c, h2Var2.f1232b, i12, i0.W(j2Var2.l), i0.W(this.window.l), -1, -1), 2));
            this.listeners.c(1, new l(this, 7));
        }
        if (updateTracksAndSelectionsAndNotifyIfChanged()) {
            this.listeners.c(2, new l(this, 8));
        }
        if (!t0Var.equals(this.mediaMetadata)) {
            this.listeners.c(14, new l(this, 9));
        }
        updateAvailableCommandsAndNotifyIfChanged();
        this.listeners.b();
    }

    public void updatePlaybackRateAndNotifyIfChanged(u uVar) {
        if (this.playbackParameters.acceptsUpdate(uVar)) {
            MediaStatus mediaStatus = this.remoteMediaClient.getMediaStatus();
            float playbackRate = mediaStatus != null ? (float) mediaStatus.getPlaybackRate() : z0.f1685d.f1688a;
            if (playbackRate > 0.0f) {
                setPlaybackParametersAndNotifyIfChanged(new z0(playbackRate));
            }
            this.playbackParameters.clearPendingResultCallback();
        }
    }

    public void updatePlayerStateAndNotifyIfChanged(u uVar) {
        boolean zBooleanValue = this.playWhenReady.value.booleanValue();
        if (this.playWhenReady.acceptsUpdate(uVar)) {
            zBooleanValue = !this.remoteMediaClient.isPaused();
            this.playWhenReady.clearPendingResultCallback();
        }
        setPlayerStateAndNotifyIfChanged(zBooleanValue, zBooleanValue != this.playWhenReady.value.booleanValue() ? 4 : 1, fetchPlaybackState(this.remoteMediaClient));
    }

    public void updateRepeatModeAndNotifyIfChanged(u uVar) {
        if (this.repeatMode.acceptsUpdate(uVar)) {
            setRepeatModeAndNotifyIfChanged(fetchRepeatMode(this.remoteMediaClient));
            this.repeatMode.clearPendingResultCallback();
        }
    }

    private boolean updateTimeline() {
        CastTimeline castTimeline = this.currentTimeline;
        CastTimeline castTimeline2 = getMediaStatus() != null ? this.timelineTracker.getCastTimeline(this.remoteMediaClient) : CastTimeline.EMPTY_CAST_TIMELINE;
        this.currentTimeline = castTimeline2;
        boolean zEquals = castTimeline.equals(castTimeline2);
        boolean z10 = !zEquals;
        if (!zEquals) {
            this.currentWindowIndex = fetchCurrentWindowIndex(this.remoteMediaClient, this.currentTimeline);
        }
        return z10;
    }

    public boolean updateTimelineAndNotifyIfChanged() {
        boolean z10;
        CastTimeline castTimeline = this.currentTimeline;
        int i10 = this.currentWindowIndex;
        boolean z11 = false;
        if (updateTimeline()) {
            this.listeners.c(0, new k(this.currentTimeline, 5));
            k2 currentTimeline = getCurrentTimeline();
            int i11 = 1;
            if (castTimeline.isEmpty()) {
                z10 = false;
            } else {
                Object obj = castTimeline.getPeriod(i10, this.period, true).f1232b;
                String str = i0.f5136a;
                if (currentTimeline.getIndexOfPeriod(obj) == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                e1 e1Var = this.pendingMediaItemRemovalPosition;
                if (e1Var != null) {
                    this.pendingMediaItemRemovalPosition = null;
                } else {
                    castTimeline.getPeriod(i10, this.period, true);
                    castTimeline.getWindow(this.period.f1233c, this.window);
                    j2 j2Var = this.window;
                    Object obj2 = j2Var.f1283a;
                    h2 h2Var = this.period;
                    int i12 = h2Var.f1233c;
                    e1Var = new e1(obj2, i12, j2Var.f1285c, h2Var.f1232b, i12, getCurrentPosition(), getContentPosition(), -1, -1);
                }
                this.listeners.c(11, new p(e1Var, getCurrentPositionInfo(), i11));
            }
            z11 = currentTimeline.isEmpty() != castTimeline.isEmpty() || z10;
            if (z11) {
                this.listeners.c(1, new l(this, 4));
            }
            updateAvailableCommandsAndNotifyIfChanged();
        }
        return z11;
    }

    private boolean updateTracksAndSelectionsAndNotifyIfChanged() {
        if (this.remoteMediaClient != null) {
            MediaStatus mediaStatus = getMediaStatus();
            MediaInfo mediaInfo = mediaStatus != null ? mediaStatus.getMediaInfo() : null;
            List<MediaTrack> mediaTracks = mediaInfo != null ? mediaInfo.getMediaTracks() : null;
            if (mediaTracks == null || mediaTracks.isEmpty()) {
                s2 s2Var = s2.f1554b;
                boolean z10 = !s2Var.equals(this.currentTracks);
                this.currentTracks = s2Var;
                return z10;
            }
            long[] activeTrackIds = mediaStatus.getActiveTrackIds();
            if (activeTrackIds == null) {
                activeTrackIds = EMPTY_TRACK_ID_ARRAY;
            }
            r2[] r2VarArr = new r2[mediaTracks.size()];
            for (int i10 = 0; i10 < mediaTracks.size(); i10++) {
                MediaTrack mediaTrack = mediaTracks.get(i10);
                r2VarArr[i10] = new r2(CastUtils.mediaTrackToTrackGroup(String.valueOf(i10), mediaTrack), false, new int[]{4}, new boolean[]{isTrackActive(mediaTrack.getId(), activeTrackIds)});
            }
            s2 s2Var2 = new s2(fh.t0.p(r2VarArr));
            if (!s2Var2.equals(this.currentTracks)) {
                this.currentTracks = s2Var2;
                return true;
            }
        }
        return false;
    }

    public void updateVolumeAndNotifyIfChanged(u uVar) {
        if (this.volume.acceptsUpdate(uVar)) {
            setVolumeAndNotifyIfChanged(((Float) RANGE_VOLUME.clamp(Float.valueOf(fetchVolume(this.remoteMediaClient)))).floatValue());
            this.volume.clearPendingResultCallback();
        }
    }

    @Override
    public void addListener(d1 d1Var) {
        this.listeners.a(d1Var);
    }

    @Override
    public void addMediaItems(int i10, List<q0> list) {
        c0.s(i10 >= 0);
        addMediaItemsInternal(list, i10 < this.currentTimeline.getWindowCount() ? ((Integer) this.currentTimeline.getWindow(i10, this.window).f1283a).intValue() : 0);
    }

    @Override
    public void clearVideoSurface() {
    }

    @Override
    public void clearVideoSurface(Surface surface) {
    }

    @Override
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override
    public void clearVideoTextureView(TextureView textureView) {
    }

    @Override
    @Deprecated
    public void decreaseDeviceVolume() {
        decreaseDeviceVolume(0);
    }

    @Override
    public void decreaseDeviceVolume(int i10) {
        setDeviceVolume(getDeviceVolume() - 1, i10);
    }

    @Override
    public Looper getApplicationLooper() {
        return Looper.getMainLooper();
    }

    @Override
    public androidx.media3.common.d getAudioAttributes() {
        return androidx.media3.common.d.f1142i;
    }

    @Override
    public int getAudioSessionId() {
        return 0;
    }

    @Override
    public b1 getAvailableCommands() {
        return this.availableCommands;
    }

    @Override
    public long getBufferedPosition() {
        return getCurrentPosition();
    }

    @Override
    public long getContentBufferedPosition() {
        return getBufferedPosition();
    }

    @Override
    public long getContentPosition() {
        return getCurrentPosition();
    }

    @Override
    public int getCurrentAdGroupIndex() {
        return -1;
    }

    @Override
    public int getCurrentAdIndexInAdGroup() {
        return -1;
    }

    @Override
    public d7.c getCurrentCues() {
        return d7.c.f4764d;
    }

    @Override
    public int getCurrentMediaItemIndex() {
        int i10 = this.pendingSeekWindowIndex;
        return i10 != -1 ? i10 : this.currentWindowIndex;
    }

    @Override
    public int getCurrentPeriodIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override
    public long getCurrentPosition() {
        long j9 = this.pendingSeekPositionMs;
        if (j9 != -9223372036854775807L) {
            return j9;
        }
        RemoteMediaClient remoteMediaClient = this.remoteMediaClient;
        return remoteMediaClient != null ? remoteMediaClient.getApproximateStreamPosition() : this.lastReportedPositionMs;
    }

    @Override
    public k2 getCurrentTimeline() {
        return this.currentTimeline;
    }

    @Override
    public s2 getCurrentTracks() {
        return this.currentTracks;
    }

    @Override
    public androidx.media3.common.l getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override
    public int getDeviceVolume() {
        return this.deviceVolume;
    }

    @Override
    public long getDuration() {
        return getContentDuration();
    }

    public MediaQueueItem getItem(int i10) {
        MediaStatus mediaStatus = getMediaStatus();
        if (mediaStatus == null || this.currentTimeline.getIndexOfPeriod(Integer.valueOf(i10)) == -1) {
            return null;
        }
        return mediaStatus.getItemById(i10);
    }

    @Override
    public long getMaxSeekToPreviousPosition() {
        return this.maxSeekToPreviousPositionMs;
    }

    @Override
    public t0 getMediaMetadata() {
        return this.mediaMetadata;
    }

    @Override
    public boolean getPlayWhenReady() {
        return this.playWhenReady.value.booleanValue();
    }

    @Override
    public z0 getPlaybackParameters() {
        return this.playbackParameters.value;
    }

    @Override
    public int getPlaybackState() {
        if (getCurrentTimeline().isEmpty()) {
            return 1;
        }
        return this.playbackState;
    }

    @Override
    public int getPlaybackSuppressionReason() {
        return 0;
    }

    @Override
    public PlaybackException getPlayerError() {
        return this.playbackException;
    }

    @Override
    public t0 getPlaylistMetadata() {
        return this.playlistMetadata;
    }

    @Override
    public int getRepeatMode() {
        return this.repeatMode.value.intValue();
    }

    @Override
    public long getSeekBackIncrement() {
        return this.seekBackIncrementMs;
    }

    @Override
    public long getSeekForwardIncrement() {
        return this.seekForwardIncrementMs;
    }

    @Override
    public boolean getShuffleModeEnabled() {
        return false;
    }

    @Override
    public v getSurfaceSize() {
        return v.f5185c;
    }

    @Override
    public long getTotalBufferedDuration() {
        long bufferedPosition = getBufferedPosition();
        long currentPosition = getCurrentPosition();
        if (bufferedPosition == -9223372036854775807L || currentPosition == -9223372036854775807L) {
            return 0L;
        }
        return bufferedPosition - currentPosition;
    }

    @Override
    public q2 getTrackSelectionParameters() {
        return q2.J;
    }

    @Override
    public w2 getVideoSize() {
        return w2.f1669d;
    }

    @Override
    public float getVolume() {
        return this.volume.value.floatValue();
    }

    @Override
    @Deprecated
    public void increaseDeviceVolume() {
        increaseDeviceVolume(0);
    }

    @Override
    public void increaseDeviceVolume(int i10) {
        setDeviceVolume(getDeviceVolume() + 1, i10);
    }

    public boolean isCastSessionAvailable() {
        return this.remoteMediaClient != null;
    }

    @Override
    public boolean isDeviceMuted() {
        return this.isMuted;
    }

    @Override
    public boolean isLoading() {
        return false;
    }

    @Override
    public boolean isPlayingAd() {
        return false;
    }

    @Override
    public void moveMediaItems(int i10, int i11, int i12) {
        c0.s(i10 >= 0 && i10 <= i11 && i12 >= 0);
        int windowCount = this.currentTimeline.getWindowCount();
        int iMin = Math.min(i11, windowCount);
        int i13 = iMin - i10;
        int iMin2 = Math.min(i12, windowCount - i13);
        if (i10 >= windowCount || i10 == iMin || i10 == iMin2) {
            return;
        }
        int[] iArr = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i14] = ((Integer) this.currentTimeline.getWindow(i14 + i10, this.window).f1283a).intValue();
        }
        moveMediaItemsInternal(iArr, i10, iMin2);
    }

    @Override
    public void mute() {
    }

    @Override
    public void prepare() {
        if (this.playbackException != null) {
            this.listeners.f(10, new l(this, 5));
            this.listeners.f(10, new l(this, 6));
        }
    }

    @Override
    public void release() {
        e7.a.h(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + i0.f5136a + "] [" + androidx.media3.common.r0.b() + "]");
        Api30Impl api30Impl = this.api30Impl;
        if (api30Impl != null) {
            api30Impl.release();
        }
        CastContext castContext = this.castContext;
        if (castContext != null) {
            SessionManager sessionManager = castContext.getSessionManager();
            sessionManager.removeSessionManagerListener(this.statusListener, CastSession.class);
            sessionManager.endCurrentSession(false);
        }
    }

    @Override
    public void removeListener(d1 d1Var) {
        this.listeners.e(d1Var);
    }

    @Override
    public void removeMediaItems(int i10, int i11) {
        c0.s(i10 >= 0 && i11 >= i10);
        int windowCount = this.currentTimeline.getWindowCount();
        int iMin = Math.min(i11, windowCount);
        if (i10 >= windowCount || i10 == iMin) {
            return;
        }
        int i12 = iMin - i10;
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = ((Integer) this.currentTimeline.getWindow(i13 + i10, this.window).f1283a).intValue();
        }
        removeMediaItemsInternal(iArr);
    }

    @Override
    public void replaceMediaItems(int i10, int i11, List<q0> list) {
        c0.s(i10 >= 0 && i10 <= i11);
        int windowCount = this.currentTimeline.getWindowCount();
        if (i10 > windowCount) {
            return;
        }
        int iMin = Math.min(i11, windowCount);
        addMediaItems(iMin, list);
        removeMediaItems(i10, iMin);
    }

    @Override
    public void seekTo(int i10, long j9, int i11, boolean z10) {
        if (i10 == -1) {
            return;
        }
        c0.s(i10 >= 0);
        if (this.currentTimeline.isEmpty() || i10 < this.currentTimeline.getWindowCount()) {
            MediaStatus mediaStatus = getMediaStatus();
            if (j9 == -9223372036854775807L) {
                j9 = 0;
            }
            if (mediaStatus != null) {
                if (getCurrentMediaItemIndex() != i10) {
                    this.remoteMediaClient.queueJumpToItem(((Integer) this.currentTimeline.getPeriod(i10, this.period).f1232b).intValue(), j9, null).setResultCallback(this.seekResultCallback);
                } else {
                    this.remoteMediaClient.seek(j9).setResultCallback(this.seekResultCallback);
                }
                e1 currentPositionInfo = getCurrentPositionInfo();
                this.pendingSeekCount++;
                this.pendingSeekWindowIndex = i10;
                this.pendingSeekPositionMs = j9;
                e1 currentPositionInfo2 = getCurrentPositionInfo();
                this.listeners.c(11, new p(currentPositionInfo, currentPositionInfo2, 0));
                if (currentPositionInfo.f1183b != currentPositionInfo2.f1183b) {
                    this.listeners.c(1, new k(getCurrentTimeline().getWindow(i10, this.window).f1285c, 4));
                    t0 t0Var = this.mediaMetadata;
                    t0 mediaMetadataInternal = getMediaMetadataInternal();
                    this.mediaMetadata = mediaMetadataInternal;
                    if (!t0Var.equals(mediaMetadataInternal)) {
                        this.listeners.c(14, new l(this, 2));
                    }
                }
                updateAvailableCommandsAndNotifyIfChanged();
            }
            this.listeners.b();
        }
    }

    @Override
    public void setAudioAttributes(androidx.media3.common.d dVar, boolean z10) {
    }

    @Override
    @Deprecated
    public void setDeviceMuted(boolean z10) {
        setDeviceMuted(z10, 0);
    }

    @Override
    public void setDeviceMuted(boolean z10, int i10) {
        CastSession castSession = this.castSession;
        if (castSession == null) {
            return;
        }
        try {
            castSession.setMute(z10);
            setDeviceVolumeAndNotifyIfChanged(this.deviceVolume, z10);
            this.listeners.b();
        } catch (IOException e3) {
            e7.a.n(TAG, "Ignoring setDeviceMuted due to exception", e3);
        }
    }

    @Override
    @Deprecated
    public void setDeviceVolume(int i10) {
        setDeviceVolume(i10, 0);
    }

    @Override
    public void setDeviceVolume(int i10, int i11) {
        if (this.castSession == null) {
            return;
        }
        int iIntValue = ((Integer) RANGE_DEVICE_VOLUME.clamp(Integer.valueOf(i10))).intValue();
        try {
            this.castSession.setVolume(iIntValue / 20.0f);
            setDeviceVolumeAndNotifyIfChanged(iIntValue, this.isMuted);
            this.listeners.b();
        } catch (IOException e3) {
            e7.a.n(TAG, "Ignoring setDeviceVolume due to exception", e3);
        }
    }

    public void setInternalSessionAvailabilityListener(SessionAvailabilityListener sessionAvailabilityListener) {
        this.internalSessionAvailabilityListener = sessionAvailabilityListener;
    }

    @Override
    public void setMediaItems(List<q0> list, int i10, long j9) {
        setMediaItemsInternal(list, i10, j9, this.repeatMode.value.intValue());
    }

    @Override
    public void setMediaItems(List<q0> list, boolean z10) {
        setMediaItems(list, z10 ? 0 : getCurrentMediaItemIndex(), z10 ? -9223372036854775807L : getContentPosition());
    }

    @Override
    public void setPlayWhenReady(boolean z10) {
        if (this.remoteMediaClient == null) {
            return;
        }
        setPlayerStateAndNotifyIfChanged(z10, 1, this.playbackState);
        this.listeners.b();
        if (getMediaStatus() == null) {
            return;
        }
        com.google.android.gms.common.api.s sVarPlay = z10 ? this.remoteMediaClient.play() : this.remoteMediaClient.pause();
        this.playWhenReady.pendingResultCallback = new u() {
            @Override
            public void onResult(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
                if (RemoteCastPlayer.this.remoteMediaClient != null) {
                    RemoteCastPlayer.this.updatePlayerStateAndNotifyIfChanged(this);
                    RemoteCastPlayer.this.listeners.b();
                }
            }
        };
        sVarPlay.setResultCallback(this.playWhenReady.pendingResultCallback);
    }

    @Override
    public void setPlaybackParameters(z0 z0Var) {
        if (this.remoteMediaClient == null) {
            return;
        }
        z0 z0Var2 = new z0(i0.g(z0Var.f1688a, 0.5f, 2.0f));
        setPlaybackParametersAndNotifyIfChanged(z0Var2);
        this.listeners.b();
        com.google.android.gms.common.api.s playbackRate = this.remoteMediaClient.setPlaybackRate(z0Var2.f1688a, null);
        this.playbackParameters.pendingResultCallback = new u() {
            @Override
            public void onResult(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
                if (RemoteCastPlayer.this.remoteMediaClient != null) {
                    RemoteCastPlayer.this.updatePlaybackRateAndNotifyIfChanged(this);
                    RemoteCastPlayer.this.listeners.b();
                }
            }
        };
        playbackRate.setResultCallback(this.playbackParameters.pendingResultCallback);
    }

    @Override
    public void setPlaylistMetadata(t0 t0Var) {
        t0Var.getClass();
        if (t0Var.equals(this.playlistMetadata)) {
            return;
        }
        this.playlistMetadata = t0Var;
        this.listeners.f(15, new l(this, 0));
    }

    @Override
    public void setRepeatMode(int i10) {
        if (this.remoteMediaClient == null) {
            return;
        }
        setRepeatModeAndNotifyIfChanged(i10);
        this.listeners.b();
        com.google.android.gms.common.api.s sVarQueueSetRepeatMode = this.remoteMediaClient.queueSetRepeatMode(getCastRepeatMode(i10), null);
        this.repeatMode.pendingResultCallback = new u() {
            @Override
            public void onResult(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
                if (RemoteCastPlayer.this.remoteMediaClient != null) {
                    RemoteCastPlayer.this.updateRepeatModeAndNotifyIfChanged(this);
                    RemoteCastPlayer.this.listeners.b();
                }
            }
        };
        sVarQueueSetRepeatMode.setResultCallback(this.repeatMode.pendingResultCallback);
    }

    public void setSessionAvailabilityListener(SessionAvailabilityListener sessionAvailabilityListener) {
        this.sessionAvailabilityListener = sessionAvailabilityListener;
    }

    @Override
    public void setShuffleModeEnabled(boolean z10) {
    }

    @Override
    public void setTrackSelectionParameters(q2 q2Var) {
    }

    @Override
    public void setVideoSurface(Surface surface) {
    }

    @Override
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
    }

    @Override
    public void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override
    public void setVideoTextureView(TextureView textureView) {
    }

    @Override
    public void setVolume(float f3) {
        if (this.remoteMediaClient == null) {
            return;
        }
        float fFloatValue = ((Float) RANGE_VOLUME.clamp(Float.valueOf(f3))).floatValue();
        setVolumeAndNotifyIfChanged(fFloatValue);
        this.listeners.b();
        com.google.android.gms.common.api.s streamVolume = this.remoteMediaClient.setStreamVolume(fFloatValue);
        this.volume.pendingResultCallback = new u() {
            @Override
            public void onResult(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
                if (RemoteCastPlayer.this.remoteMediaClient != null) {
                    RemoteCastPlayer.this.updateVolumeAndNotifyIfChanged(this);
                    RemoteCastPlayer.this.listeners.b();
                }
            }
        };
        streamVolume.setResultCallback(this.volume.pendingResultCallback);
    }

    @Override
    public void stop() {
        this.playbackState = 1;
        RemoteMediaClient remoteMediaClient = this.remoteMediaClient;
        if (remoteMediaClient != null) {
            remoteMediaClient.stop();
        }
    }

    @Override
    public void unmute() {
    }
}
