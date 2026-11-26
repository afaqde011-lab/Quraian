package tv;

import androidx.media3.common.b1;
import androidx.media3.common.d1;
import androidx.media3.common.f1;
import androidx.media3.common.q;
import androidx.media3.common.v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import su.l;
import su.o;
import su.s;
import xu.f;

public final class d extends v {
    public final b b;
    public final ArrayList c;
    public final c d;

    public d(f1 player, b binding) {
        super(player);
        m.e(player, "player");
        m.e(binding, "binding");
        this.b = binding;
        this.c = new ArrayList();
        this.d = new c(this);
        binding.l = new pi.c(0, this, d.class, "notifyAvailableCommandsChanged", "notifyAvailableCommandsChanged()V", 0, 12);
    }

    public final void addListener(d1 listener) {
        m.e(listener, "listener");
        super.addListener(listener);
        ArrayList arrayList = this.c;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((d1) it.next()) == listener) {
                }
            }
            arrayList.add(listener);
        } else {
            arrayList.add(listener);
        }
        f1 wrappedPlayer = getWrappedPlayer();
        c cVar = this.d;
        wrappedPlayer.removeListener(cVar);
        getWrappedPlayer().addListener(cVar);
    }

    public final b1 getAvailableCommands() {
        b1 availableCommands = super.getAvailableCommands();
        m.d(availableCommands, "getAvailableCommands(...)");
        if (!this.b.g()) {
            return availableCommands;
        }
        q qVar = new q();
        qVar.e(availableCommands.a);
        qVar.f(new int[]{9, 7});
        return new b1(qVar.g());
    }

    public final boolean isCommandAvailable(int i) {
        return getAvailableCommands().a(i);
    }

    public final void play() {
        f fVar;
        s sVarD;
        b bVar = this.b;
        if (bVar.g() && (sVarD = (fVar = bVar.a).d()) != null && sVarD.f) {
            fVar.b(o.a);
        } else {
            super.play();
        }
    }

    public final void removeListener(d1 listener) {
        m.e(listener, "listener");
        super.removeListener(listener);
        q0.a aVar = new q0.a(listener, 14);
        ArrayList arrayList = this.c;
        h00.v.x0(aVar, arrayList);
        if (arrayList.isEmpty()) {
            getWrappedPlayer().removeListener(this.d);
        }
    }

    public final void seekTo(int i, long j) {
        if (i == getCurrentMediaItemIndex()) {
            j = this.b.k(j);
        }
        super.seekTo(i, j);
    }

    public final void seekTo(long j) {
        super.seekTo(this.b.k(j));
    }

    public final void seekToNext() {
        b bVar = this.b;
        if (bVar.g()) {
            f fVar = bVar.a;
            b bVar2 = fVar.h;
            if (fVar.d() != null && bVar2 != null) {
                f1 f1Var = bVar2.c;
                fVar.b(new l(f1Var != null ? f1Var.getCurrentPosition() : 0L));
                return;
            }
        }
        super.seekToNext();
    }

    public final void seekToNextMediaItem() {
        b bVar = this.b;
        if (bVar.g()) {
            f fVar = bVar.a;
            b bVar2 = fVar.h;
            if (fVar.d() != null && bVar2 != null) {
                f1 f1Var = bVar2.c;
                fVar.b(new l(f1Var != null ? f1Var.getCurrentPosition() : 0L));
                return;
            }
        }
        super.seekToNextMediaItem();
    }

    public final void seekToPrevious() {
        b bVar = this.b;
        if (bVar.g()) {
            f fVar = bVar.a;
            b bVar2 = fVar.h;
            if (fVar.d() != null && bVar2 != null) {
                f1 f1Var = bVar2.c;
                fVar.b(new su.m(f1Var != null ? f1Var.getCurrentPosition() : 0L));
                return;
            }
        }
        super.seekToPrevious();
    }

    public final void seekToPreviousMediaItem() {
        b bVar = this.b;
        if (bVar.g()) {
            f fVar = bVar.a;
            b bVar2 = fVar.h;
            if (fVar.d() != null && bVar2 != null) {
                f1 f1Var = bVar2.c;
                fVar.b(new su.m(f1Var != null ? f1Var.getCurrentPosition() : 0L));
                return;
            }
        }
        super.seekToPreviousMediaItem();
    }

    public final void setPlayWhenReady(boolean z) {
        f fVar;
        s sVarD;
        if (z) {
            b bVar = this.b;
            if (bVar.g() && (sVarD = (fVar = bVar.a).d()) != null && sVarD.f) {
                fVar.b(o.a);
                return;
            }
        }
        super.setPlayWhenReady(z);
    }
}
