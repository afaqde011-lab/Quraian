package a1;

public final class r0 implements u00.k {
    public final int A;
    public final String B;
    public final int C;

    public r0(int i10, String str, int i11) {
        this.A = i11;
        this.C = i10;
        this.B = str;
    }

    public r0(String str, int i10, int i11) {
        this.A = i11;
        this.B = str;
        this.C = i10;
    }

    public final Object invoke(Object obj) throws Exception {
        hb.g gVar;
        bo.c cVar;
        switch (this.A) {
            case 0:
                z0.a aVar = (z0.a) obj;
                m3.q0 q0Var = aVar.E;
                String str = this.B;
                if (q0Var != null) {
                    long j9 = q0Var.f10520a;
                    x0.v(aVar, (int) (j9 >> 32), (int) (j9 & 4294967295L), str);
                } else {
                    x0.v(aVar, m3.q0.g(aVar.D), m3.q0.f(aVar.D), str);
                }
                int iG = m3.q0.g(aVar.D);
                int i10 = this.C;
                int iY = ab.a0.y(i10 > 0 ? (iG + i10) - 1 : (iG + i10) - str.length(), 0, aVar.B.length());
                aVar.f(m3.h0.b(iY, iY));
                break;
            case 1:
                String str2 = this.B;
                int i11 = this.C;
                ma.a aVar2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "_connection");
                ma.c cVarK0 = aVar2.k0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    cVarK0.y(1, str2);
                    cVarK0.d(2, i11);
                    int I = w50.c.I(cVarK0, "work_spec_id");
                    int I2 = w50.c.I(cVarK0, "generation");
                    int I3 = w50.c.I(cVarK0, "system_id");
                    if (cVarK0.d0()) {
                        gVar = new hb.g(cVarK0.R(I), (int) cVarK0.getLong(I2), (int) cVarK0.getLong(I3));
                        break;
                    } else {
                        gVar = null;
                    }
                    return gVar;
                } finally {
                    cVarK0.close();
                }
            case 2:
                String str3 = this.B;
                int i12 = this.C;
                ma.a aVar3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "_connection");
                ma.c cVarK1 = aVar3.k0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    cVarK1.y(1, str3);
                    cVarK1.d(2, i12);
                    cVarK1.d0();
                } finally {
                    cVarK1.close();
                }
                break;
            case 3:
                int i13 = this.C;
                String str4 = this.B;
                ma.a aVar4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar4, "_connection");
                ma.c cVarK2 = aVar4.k0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    cVarK2.d(1, i13);
                    cVarK2.y(2, str4);
                    cVarK2.d0();
                } finally {
                    cVarK2.close();
                }
                break;
            case 4:
                int i14 = this.C;
                String str5 = this.B;
                ma.a aVar5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "_connection");
                ma.c cVarK3 = aVar5.k0("SELECT * FROM audio_story_download WHERE episode_id = ? AND language = ?");
                try {
                    cVarK3.d(1, i14);
                    cVarK3.y(2, str5);
                    int I4 = w50.c.I(cVarK3, "episode_id");
                    int I5 = w50.c.I(cVarK3, "language");
                    int I6 = w50.c.I(cVarK3, "story_id");
                    int I7 = w50.c.I(cVarK3, "label");
                    int I8 = w50.c.I(cVarK3, "version");
                    int I9 = w50.c.I(cVarK3, "duration_ms");
                    int I10 = w50.c.I(cVarK3, "audio_path");
                    int I11 = w50.c.I(cVarK3, "transcript_path");
                    return cVarK3.d0() ? new bo.a((int) cVarK3.getLong(I4), cVarK3.R(I5), (int) cVarK3.getLong(I6), cVarK3.R(I7), (int) cVarK3.getLong(I8), cVarK3.getLong(I9), cVarK3.R(I10), cVarK3.isNull(I11) ? null : cVarK3.R(I11), cVarK3.getLong(w50.c.I(cVarK3, "size_bytes")), cVarK3.getLong(w50.c.I(cVarK3, "downloaded_at"))) : null;
                } finally {
                    cVarK3.close();
                }
            case 5:
                int i15 = this.C;
                String str6 = this.B;
                ma.a aVar6 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "_connection");
                ma.c cVarK4 = aVar6.k0("SELECT * FROM audio_story_progress WHERE episode_id = ? AND language = ?");
                try {
                    cVarK4.d(1, i15);
                    cVarK4.y(2, str6);
                    int I12 = w50.c.I(cVarK4, "episode_id");
                    int I13 = w50.c.I(cVarK4, "language");
                    int I14 = w50.c.I(cVarK4, "position_ms");
                    int I15 = w50.c.I(cVarK4, "is_completed");
                    int I16 = w50.c.I(cVarK4, "updated_at");
                    int I17 = w50.c.I(cVarK4, "needs_upload");
                    if (cVarK4.d0()) {
                        cVar = new bo.c((int) cVarK4.getLong(I12), cVarK4.R(I13), cVarK4.getLong(I14), ((int) cVarK4.getLong(I15)) != 0, cVarK4.getLong(I16), ((int) cVarK4.getLong(I17)) != 0);
                        break;
                    } else {
                        cVar = null;
                    }
                    return cVar;
                } finally {
                    cVarK4.close();
                }
            default:
                int i16 = this.C;
                String str7 = this.B;
                ma.a aVar7 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar7, "_connection");
                ma.c cVarK5 = aVar7.k0("UPDATE audio_story_progress SET is_completed = 1 WHERE episode_id = ? AND language = ?");
                try {
                    cVarK5.d(1, i16);
                    cVarK5.y(2, str7);
                    cVarK5.d0();
                } finally {
                    cVarK5.close();
                }
                break;
        }
        return g00.b0.a;
    }
}
