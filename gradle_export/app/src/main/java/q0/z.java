package q0;

import android.view.KeyEvent;

public final class z implements z0.c {

    public static final z f12719b = new z(0);

    public final int f12720a;

    public z(int i10) {
        this.f12720a = i10;
    }

    @Override
    public void a(v1.c cVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-2101003086);
        int i11 = (g0Var.g(this) ? 32 : 16) | i10;
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            cVar.invoke(g0Var, 6);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l0.g0(this, cVar, i10, 16);
        }
    }

    public e1 b(KeyEvent keyEvent) {
        e1 e1Var;
        switch (this.f12720a) {
            case 1:
                int iZ = q.z(keyEvent);
                if (iZ == 10) {
                    if (t2.a.a(t2.d.a(keyEvent.getKeyCode()), t2.a.f14339o)) {
                        return e1.REDO;
                    }
                } else if (iZ == 2) {
                    long jA = t2.d.a(keyEvent.getKeyCode());
                    if (t2.a.a(jA, t2.a.f14336j) || t2.a.a(jA, t2.a.f14348x) || t2.a.a(jA, t2.a.N)) {
                        return e1.COPY;
                    }
                    if (t2.a.a(jA, t2.a.l)) {
                        return e1.PASTE;
                    }
                    if (t2.a.a(jA, t2.a.m)) {
                        return e1.CUT;
                    }
                    if (t2.a.a(jA, t2.a.f14335i)) {
                        return e1.SELECT_ALL;
                    }
                    if (t2.a.a(jA, t2.a.f14338n)) {
                        return e1.REDO;
                    }
                    if (t2.a.a(jA, t2.a.f14339o)) {
                        return e1.UNDO;
                    }
                } else if (iZ == 8) {
                    long jA2 = t2.d.a(keyEvent.getKeyCode());
                    if (t2.a.a(jA2, t2.a.f14332f) || t2.a.a(jA2, t2.a.H)) {
                        return e1.SELECT_LEFT_CHAR;
                    }
                    if (t2.a.a(jA2, t2.a.f14333g) || t2.a.a(jA2, t2.a.I)) {
                        return e1.SELECT_RIGHT_CHAR;
                    }
                    if (t2.a.a(jA2, t2.a.f14330d) || t2.a.a(jA2, t2.a.F)) {
                        return e1.SELECT_UP;
                    }
                    if (t2.a.a(jA2, t2.a.f14331e) || t2.a.a(jA2, t2.a.G)) {
                        return e1.SELECT_DOWN;
                    }
                    if (t2.a.a(jA2, t2.a.C) || t2.a.a(jA2, t2.a.L)) {
                        return e1.SELECT_PAGE_UP;
                    }
                    if (t2.a.a(jA2, t2.a.D) || t2.a.a(jA2, t2.a.M)) {
                        return e1.SELECT_PAGE_DOWN;
                    }
                    if (t2.a.a(jA2, t2.a.f14346v) || t2.a.a(jA2, t2.a.J)) {
                        return e1.SELECT_LINE_START;
                    }
                    if (t2.a.a(jA2, t2.a.f14347w) || t2.a.a(jA2, t2.a.K)) {
                        return e1.SELECT_LINE_END;
                    }
                    if (t2.a.a(jA2, t2.a.f14348x) || t2.a.a(jA2, t2.a.N)) {
                        return e1.PASTE;
                    }
                } else if (iZ == 0) {
                    long jA3 = t2.d.a(keyEvent.getKeyCode());
                    if (t2.a.a(jA3, t2.a.f14332f) || t2.a.a(jA3, t2.a.H)) {
                        return e1.LEFT_CHAR;
                    }
                    if (t2.a.a(jA3, t2.a.f14333g) || t2.a.a(jA3, t2.a.I)) {
                        return e1.RIGHT_CHAR;
                    }
                    if (t2.a.a(jA3, t2.a.f14330d) || t2.a.a(jA3, t2.a.F)) {
                        return e1.UP;
                    }
                    if (t2.a.a(jA3, t2.a.f14331e) || t2.a.a(jA3, t2.a.G)) {
                        return e1.DOWN;
                    }
                    if (t2.a.a(jA3, t2.a.f14334h)) {
                        return e1.CENTER;
                    }
                    if (t2.a.a(jA3, t2.a.C) || t2.a.a(jA3, t2.a.L)) {
                        return e1.PAGE_UP;
                    }
                    if (t2.a.a(jA3, t2.a.D) || t2.a.a(jA3, t2.a.M)) {
                        return e1.PAGE_DOWN;
                    }
                    if (t2.a.a(jA3, t2.a.f14346v) || t2.a.a(jA3, t2.a.J)) {
                        return e1.LINE_START;
                    }
                    if (t2.a.a(jA3, t2.a.f14347w) || t2.a.a(jA3, t2.a.K)) {
                        return e1.LINE_END;
                    }
                    if (t2.a.a(jA3, t2.a.f14342r) || t2.a.a(jA3, t2.a.E)) {
                        return e1.NEW_LINE;
                    }
                    if (t2.a.a(jA3, t2.a.f14343s)) {
                        return e1.DELETE_PREV_CHAR;
                    }
                    if (t2.a.a(jA3, t2.a.f14344t)) {
                        return e1.DELETE_NEXT_CHAR;
                    }
                    if (t2.a.a(jA3, t2.a.A)) {
                        return e1.PASTE;
                    }
                    if (t2.a.a(jA3, t2.a.f14349y)) {
                        return e1.CUT;
                    }
                    if (t2.a.a(jA3, t2.a.f14350z)) {
                        return e1.COPY;
                    }
                    if (t2.a.a(jA3, t2.a.f14340p)) {
                        return e1.TAB;
                    }
                }
                return null;
            default:
                int iZ2 = q.z(keyEvent);
                int i10 = q.f12680e;
                e1 e1Var2 = null;
                if (iZ2 == 9) {
                    long jA4 = t2.d.a(keyEvent.getKeyCode());
                    if (t2.a.a(jA4, t2.a.f14332f)) {
                        e1Var2 = e1.SELECT_LINE_LEFT;
                    } else if (t2.a.a(jA4, t2.a.f14333g)) {
                        e1Var2 = e1.SELECT_LINE_RIGHT;
                    } else if (t2.a.a(jA4, t2.a.f14330d)) {
                        e1Var2 = e1.SELECT_HOME;
                    } else if (t2.a.a(jA4, t2.a.f14331e)) {
                        e1Var2 = e1.SELECT_END;
                    }
                } else if (iZ2 == 1) {
                    long jA5 = t2.d.a(keyEvent.getKeyCode());
                    if (t2.a.a(jA5, t2.a.f14332f)) {
                        e1Var2 = e1.LINE_LEFT;
                    } else if (t2.a.a(jA5, t2.a.f14333g)) {
                        e1Var2 = e1.LINE_RIGHT;
                    } else if (t2.a.a(jA5, t2.a.f14330d)) {
                        e1Var2 = e1.HOME;
                    } else if (t2.a.a(jA5, t2.a.f14331e)) {
                        e1Var2 = e1.END;
                    } else if (t2.a.a(jA5, t2.a.f14343s)) {
                        e1Var2 = e1.DELETE_FROM_LINE_START;
                    }
                }
                if (e1Var2 != null) {
                    return e1Var2;
                }
                o10.b bVar = q.f12677b;
                bVar.getClass();
                int i11 = q.f12681f;
                int iZ3 = q.z(keyEvent);
                long jA6 = t2.d.a(keyEvent.getKeyCode());
                e1 e1Var3 = null;
                if (t2.a.a(jA6, t2.a.f14343s)) {
                    if (iZ3 == 0 || iZ3 == 8) {
                        e1Var = e1.DELETE_PREV_CHAR;
                    } else {
                        int i12 = q.f12682g;
                        if (iZ3 == 12) {
                            e1Var = e1.DELETE_PREV_CHAR;
                        } else if (iZ3 == 2 || iZ3 == 10) {
                            e1Var = e1.DELETE_PREV_WORD;
                        } else {
                            e1Var = null;
                        }
                    }
                } else if ((t2.a.a(jA6, t2.a.f14342r) || t2.a.a(jA6, t2.a.E)) && (iZ3 == 0 || iZ3 == 8 || iZ3 == 2 || iZ3 == 10)) {
                    e1Var = e1.NEW_LINE;
                } else {
                    e1Var = null;
                }
                if (e1Var != null) {
                    return e1Var;
                }
                int iZ4 = q.z(keyEvent);
                if (iZ4 == 10) {
                    long jA7 = t2.d.a(keyEvent.getKeyCode());
                    if (t2.a.a(jA7, t2.a.f14332f) || t2.a.a(jA7, t2.a.H)) {
                        e1Var3 = e1.SELECT_LEFT_WORD;
                    } else if (t2.a.a(jA7, t2.a.f14333g) || t2.a.a(jA7, t2.a.I)) {
                        e1Var3 = e1.SELECT_RIGHT_WORD;
                    } else if (t2.a.a(jA7, t2.a.f14330d) || t2.a.a(jA7, t2.a.F)) {
                        e1Var3 = e1.SELECT_PREV_PARAGRAPH;
                    } else if (t2.a.a(jA7, t2.a.f14331e) || t2.a.a(jA7, t2.a.G)) {
                        e1Var3 = e1.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (iZ4 == 2) {
                    long jA8 = t2.d.a(keyEvent.getKeyCode());
                    if (t2.a.a(jA8, t2.a.f14332f) || t2.a.a(jA8, t2.a.H)) {
                        e1Var3 = e1.LEFT_WORD;
                    } else if (t2.a.a(jA8, t2.a.f14333g) || t2.a.a(jA8, t2.a.I)) {
                        e1Var3 = e1.RIGHT_WORD;
                    } else if (t2.a.a(jA8, t2.a.f14330d) || t2.a.a(jA8, t2.a.F)) {
                        e1Var3 = e1.PREV_PARAGRAPH;
                    } else if (t2.a.a(jA8, t2.a.f14331e) || t2.a.a(jA8, t2.a.G)) {
                        e1Var3 = e1.NEXT_PARAGRAPH;
                    } else if (t2.a.a(jA8, t2.a.f14337k)) {
                        e1Var3 = e1.DELETE_PREV_CHAR;
                    } else if (t2.a.a(jA8, t2.a.f14344t)) {
                        e1Var3 = e1.DELETE_NEXT_WORD;
                    } else if (t2.a.a(jA8, t2.a.B)) {
                        e1Var3 = e1.DESELECT;
                    }
                } else if (iZ4 == 8) {
                    long jA9 = t2.d.a(keyEvent.getKeyCode());
                    if (t2.a.a(jA9, t2.a.f14346v) || t2.a.a(jA9, t2.a.J)) {
                        e1Var3 = e1.SELECT_LINE_START;
                    } else if (t2.a.a(jA9, t2.a.f14347w) || t2.a.a(jA9, t2.a.K)) {
                        e1Var3 = e1.SELECT_LINE_END;
                    }
                } else if (iZ4 == 1 && t2.a.a(t2.d.a(keyEvent.getKeyCode()), t2.a.f14344t)) {
                    e1Var3 = e1.DELETE_TO_LINE_END;
                }
                return e1Var3 == null ? ((z) bVar.B).b(keyEvent) : e1Var3;
        }
    }
}
