package androidx.media3.cast;

import android.content.Context;
import androidx.media3.common.f1;
import androidx.media3.common.q2;
import androidx.media3.common.v;
import androidx.media3.common.z0;
import com.google.android.gms.cast.framework.CastContext;
import fh.d2;
import fh.r0;
import fh.t0;
import java.util.ArrayList;
import java.util.Objects;
import ta.c0;

public final class CastPlayer extends v {
    public static final androidx.media3.common.l DEVICE_INFO_REMOTE_EMPTY = RemoteCastPlayer.DEVICE_INFO_REMOTE_EMPTY;
    private final RemoteCastPlayer remoteCastPlayer;

    public static final class Builder {
        private boolean buildCalled;
        private final Context context;
        private f1 localPlayer;
        private RemoteCastPlayer remotePlayer;
        private TransferCallback transferCallback;

        public Builder(Context context) {
            context.getClass();
            this.context = context;
            this.transferCallback = TransferCallback.DEFAULT;
        }

        public CastPlayer build() {
            c0.A(!this.buildCalled);
            this.buildCalled = true;
            if (this.localPlayer == null) {
                this.localPlayer = new i7.l(this.context).a();
            }
            if (this.remotePlayer == null) {
                this.remotePlayer = new RemoteCastPlayer.Builder(this.context).build();
            }
            return new CastPlayer(new CastPlayerImpl(this.localPlayer, this.remotePlayer, this.remotePlayer.isCastSessionAvailable() ? this.remotePlayer : this.localPlayer, this.transferCallback), this.remotePlayer);
        }

        public Builder setLocalPlayer(f1 f1Var) {
            c0.A(!this.buildCalled);
            f1Var.getClass();
            this.localPlayer = f1Var;
            return this;
        }

        public Builder setRemotePlayer(RemoteCastPlayer remoteCastPlayer) {
            c0.A(!this.buildCalled);
            remoteCastPlayer.getClass();
            this.remotePlayer = remoteCastPlayer;
            return this;
        }

        public Builder setTransferCallback(TransferCallback transferCallback) {
            c0.A(!this.buildCalled);
            transferCallback.getClass();
            this.transferCallback = transferCallback;
            return this;
        }
    }

    public interface TransferCallback {
        public static final TransferCallback DEFAULT = new a8.n(2);

        static void lambda$static$0(f1 f1Var, f1 f1Var2) {
            Objects.requireNonNull(f1Var);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < f1Var.getMediaItemCount(); i10++) {
                arrayList.add(f1Var.getMediaItemAt(i10));
            }
            r0 r0Var = t0.B;
            d2 d2Var = d2.E;
            z0 z0Var = z0.f1685d;
            q2 q2Var = q2.J;
            boolean playWhenReady = f1Var.getPlayWhenReady();
            int repeatMode = f1Var.getRepeatMode();
            boolean shuffleModeEnabled = f1Var.getShuffleModeEnabled();
            int currentMediaItemIndex = f1Var.getCurrentMediaItemIndex();
            long currentPosition = f1Var.getCurrentPosition();
            t0 t0VarO = t0.o(arrayList);
            z0 playbackParameters = f1Var.getPlaybackParameters();
            Objects.requireNonNull(playbackParameters);
            q2 trackSelectionParameters = f1Var.getTrackSelectionParameters();
            Objects.requireNonNull(trackSelectionParameters);
            Objects.requireNonNull(f1Var2);
            if (f1Var2.getAvailableCommands().a(1)) {
                f1Var2.setPlayWhenReady(playWhenReady);
            }
            if (f1Var2.getAvailableCommands().a(15)) {
                f1Var2.setRepeatMode(repeatMode);
            }
            if (f1Var2.getAvailableCommands().a(14)) {
                f1Var2.setShuffleModeEnabled(shuffleModeEnabled);
            }
            if (f1Var2.getAvailableCommands().a(31)) {
                f1Var2.setMediaItems(t0VarO, currentMediaItemIndex, currentPosition);
            }
            if (f1Var2.getAvailableCommands().a(13)) {
                f1Var2.setPlaybackParameters(playbackParameters);
            }
            if (f1Var2.getAvailableCommands().a(29)) {
                f1Var2.setTrackSelectionParameters(trackSelectionParameters);
            }
        }

        void transferState(f1 f1Var, f1 f1Var2);
    }

    @Deprecated
    public CastPlayer(Context context, CastContext castContext, MediaItemConverter mediaItemConverter, long j9, long j10, long j11) {
        this(new RemoteCastPlayer(context, castContext, mediaItemConverter, j9, j10, j11));
    }

    private CastPlayer(CastPlayerImpl castPlayerImpl, RemoteCastPlayer remoteCastPlayer) {
        super(castPlayerImpl);
        this.remoteCastPlayer = remoteCastPlayer;
    }

    private CastPlayer(RemoteCastPlayer remoteCastPlayer) {
        super(remoteCastPlayer);
        this.remoteCastPlayer = remoteCastPlayer;
    }

    @Deprecated
    public CastPlayer(CastContext castContext) {
        this(castContext, new DefaultMediaItemConverter());
    }

    @Deprecated
    public CastPlayer(CastContext castContext, MediaItemConverter mediaItemConverter) {
        this(castContext, mediaItemConverter, 5000L, 15000L);
    }

    @Deprecated
    public CastPlayer(CastContext castContext, MediaItemConverter mediaItemConverter, long j9, long j10) {
        this(null, castContext, mediaItemConverter, j9, j10, 3000L);
    }

    @Deprecated
    public boolean isCastSessionAvailable() {
        return this.remoteCastPlayer.isCastSessionAvailable();
    }

    @Deprecated
    public void setSessionAvailabilityListener(SessionAvailabilityListener sessionAvailabilityListener) {
        this.remoteCastPlayer.setSessionAvailabilityListener(sessionAvailabilityListener);
    }
}
