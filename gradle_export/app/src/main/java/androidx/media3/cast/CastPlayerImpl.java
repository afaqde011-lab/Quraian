package androidx.media3.cast;

import androidx.media3.common.a2;
import androidx.media3.common.b1;
import androidx.media3.common.b2;
import androidx.media3.common.f1;
import androidx.media3.common.z;
import kh.t;
import kh.v;

final class CastPlayerImpl extends z {
    private final f1 localPlayer;
    private final RemoteCastPlayer remotePlayer;
    private final SessionAvailabilityListener sessionAvailabilityListener;
    private final CastPlayer.TransferCallback transferCallback;

    public class SessionAvailabilityListenerImpl implements SessionAvailabilityListener {
        private SessionAvailabilityListenerImpl() {
        }

        @Override
        public void onCastSessionAvailable() {
            CastPlayerImpl.this.updateActivePlayer();
        }

        @Override
        public void onCastSessionUnavailable() {
            CastPlayerImpl.this.updateActivePlayer();
        }
    }

    public CastPlayerImpl(f1 f1Var, RemoteCastPlayer remoteCastPlayer, f1 f1Var2, CastPlayer.TransferCallback transferCallback) {
        super(f1Var2);
        this.localPlayer = f1Var;
        this.remotePlayer = remoteCastPlayer;
        this.transferCallback = transferCallback;
        SessionAvailabilityListenerImpl sessionAvailabilityListenerImpl = new SessionAvailabilityListenerImpl();
        this.sessionAvailabilityListener = sessionAvailabilityListenerImpl;
        remoteCastPlayer.setInternalSessionAvailabilityListener(sessionAvailabilityListenerImpl);
    }

    public void updateActivePlayer() {
        f1 player = getPlayer();
        f1 f1Var = this.remotePlayer.isCastSessionAvailable() ? this.remotePlayer : this.localPlayer;
        if (player == f1Var) {
            return;
        }
        this.transferCallback.transferState(player, f1Var);
        if (player.getPlaybackState() != 1) {
            f1Var.prepare();
        }
        player.stop();
        setPlayer(f1Var);
    }

    @Override
    public b2 getState() {
        b2 state = super.getState();
        b1 b1Var = state.f1104a;
        if (b1Var.a(32)) {
            return state;
        }
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.e(b1Var.f1103a);
        qVar.d(32);
        b1 b1Var2 = new b1(qVar.g());
        a2 a2VarA = state.a();
        a2VarA.f1067a = b1Var2;
        return new b2(a2VarA);
    }

    @Override
    public v handleRelease() {
        this.remotePlayer.release();
        this.remotePlayer.setInternalSessionAvailabilityListener(null);
        if (this.localPlayer.isCommandAvailable(32)) {
            this.localPlayer.release();
        }
        return t.B;
    }
}
