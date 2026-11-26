package com.mchutov.p000quranify.audiostories.data.source.local.db;

import a10.d;
import ab.w;
import ba.y;
import ca.g;
import com.mchutov.p000quranify.audiostories.data.source.local.db.AudioStoriesDatabase_Impl;
import g00.p;
import h00.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import rd.a;
import xn.b;
import xn.c;
import xn.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/audiostories/data/source/local/db/AudioStoriesDatabase_Impl;", "Lcom/mchutov/quranify/audiostories/data/source/local/db/AudioStoriesDatabase;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioStoriesDatabase_Impl extends AudioStoriesDatabase {

    public final p f5257n;

    public final p f5258o;

    public final p f5259p;

    public AudioStoriesDatabase_Impl() {
        final int i11 = 0;
        this.f5257n = a.J(new u00.a(this) {
            public final AudioStoriesDatabase_Impl B;

            {
                this.B = this;
            }

            @Override
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new e(this.B);
                    case 1:
                        return new b(this.B);
                    default:
                        return new c(this.B);
                }
            }
        });
        final int i12 = 1;
        this.f5258o = a.J(new u00.a(this) {
            public final AudioStoriesDatabase_Impl B;

            {
                this.B = this;
            }

            @Override
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new e(this.B);
                    case 1:
                        return new b(this.B);
                    default:
                        return new c(this.B);
                }
            }
        });
        final int i13 = 2;
        this.f5259p = a.J(new u00.a(this) {
            public final AudioStoriesDatabase_Impl B;

            {
                this.B = this;
            }

            @Override
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new e(this.B);
                    case 1:
                        return new b(this.B);
                    default:
                        return new c(this.B);
                }
            }
        });
    }

    @Override
    public final List c(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override
    public final g d() {
        return new g(this, new LinkedHashMap(), new LinkedHashMap(), "audio_story_progress", "audio_story_download", "audio_story_event_queue");
    }

    @Override
    public final y e() {
        return new w(this);
    }

    @Override
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b0 b0Var = a0.f13204a;
        d dVarB = b0Var.b(e.class);
        x xVar = x.A;
        linkedHashMap.put(dVarB, xVar);
        linkedHashMap.put(b0Var.b(b.class), xVar);
        linkedHashMap.put(b0Var.b(c.class), xVar);
        return linkedHashMap;
    }

    @Override
    public final b r() {
        return (b) this.f5258o.getValue();
    }

    @Override
    public final c s() {
        return (c) this.f5259p.getValue();
    }

    @Override
    public final e t() {
        return (e) this.f5257n.getValue();
    }
}
