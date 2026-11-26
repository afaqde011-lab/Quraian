package com.mchutov.quranify.audiostories.presentation.player;

import go.a;
import h00.q;
import ho.g;
import ho.o;
import ho.p;
import i7.z;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import no.n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ1\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/mchutov/quranify/audiostories/presentation/player/AudioStoryPlayerLauncher;", "", "Lgo/a;", "audioStoryPlayerController", "Laq/a;", "uiElementsController", "<init>", "(Lgo/a;Laq/a;)V", "Lho/a;", "story", "Lho/o;", "source", "Lg00/b0;", "playOrPause", "(Lho/a;Lho/o;)V", "Lho/g;", "episode", "", "startsOver", "start", "(Lho/a;Lho/g;Lho/o;Z)V", "playOrPauseFromStart", "open", "Lgo/a;", "Laq/a;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioStoryPlayerLauncher {
    public static final int $stable = 0;
    private final a audioStoryPlayerController;
    private final aq.a uiElementsController;

    public AudioStoryPlayerLauncher(a audioStoryPlayerController, aq.a uiElementsController) {
        m.e(audioStoryPlayerController, "audioStoryPlayerController");
        m.e(uiElementsController, "uiElementsController");
        this.audioStoryPlayerController = audioStoryPlayerController;
        this.uiElementsController = uiElementsController;
    }

    public static void open$default(AudioStoryPlayerLauncher audioStoryPlayerLauncher, ho.a aVar, g gVar, o oVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        audioStoryPlayerLauncher.open(aVar, gVar, oVar, z);
    }

    public static void start$default(AudioStoryPlayerLauncher audioStoryPlayerLauncher, ho.a aVar, g gVar, o oVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        audioStoryPlayerLauncher.start(aVar, gVar, oVar, z);
    }

    public final void open(ho.a story, g episode, o source, boolean startsOver) {
        m.e(story, "story");
        m.e(episode, "episode");
        m.e(source, "source");
        ((n) this.audioStoryPlayerController).x(story, episode, source, startsOver);
        g gVar = ((p) ((n) this.audioStoryPlayerController).r.getValue()).b;
        if (gVar == null || gVar.a != episode.a) {
            return;
        }
        aq.a.a(this.uiElementsController, true, 6);
    }

    public final void playOrPause(ho.a story, o source) {
        ho.a aVar;
        m.e(story, "story");
        m.e(source, "source");
        p pVar = (p) ((n) this.audioStoryPlayerController).r.getValue();
        if (pVar.c && (aVar = pVar.a) != null && aVar.a == story.a) {
            z zVar = ((n) this.audioStoryPlayerController).b.b;
            if (zVar != null) {
                zVar.pause();
                return;
            }
            return;
        }
        g gVarB = story.b();
        if (gVarB == null && (gVarB = (g) q.N0(story.g)) == null) {
            return;
        }
        g gVar = gVarB;
        if (gVar.k > 0 && !gVar.l) {
            source = o.CONTINUE;
        }
        open$default(this, story, gVar, source, false, 8, null);
    }

    public final void playOrPauseFromStart(ho.a story, o source) {
        ho.a aVar;
        m.e(story, "story");
        m.e(source, "source");
        p pVar = (p) ((n) this.audioStoryPlayerController).r.getValue();
        if (pVar.c && (aVar = pVar.a) != null && aVar.a == story.a) {
            z zVar = ((n) this.audioStoryPlayerController).b.b;
            if (zVar != null) {
                zVar.pause();
                return;
            }
            return;
        }
        g gVar = (g) q.N0(story.g);
        if (gVar == null) {
            return;
        }
        open(story, gVar, source, true);
    }

    public final void start(ho.a story, g episode, o source, boolean startsOver) {
        m.e(story, "story");
        m.e(episode, "episode");
        m.e(source, "source");
        ((n) this.audioStoryPlayerController).x(story, episode, source, startsOver);
    }
}
