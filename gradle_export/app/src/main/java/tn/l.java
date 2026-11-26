package tn;

import a10.h0;
import h00.x;
import ho.r;
import ho.s;
import ho.t;
import java.util.ArrayList;
import java.util.List;
import un.q;

public final class l extends h0 {
    public final r X(q qVar) {
        s sVar;
        t tVar;
        String word;
        Double startTime;
        List<q.a> lines = qVar != null ? qVar.getLines() : null;
        x xVar = x.A;
        if (lines == null) {
            lines = xVar;
        }
        ArrayList arrayList = new ArrayList();
        for (q.a aVar : lines) {
            List<q.b> words = aVar != null ? aVar.getWords() : null;
            if (words == null) {
                words = xVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (q.b bVar : words) {
                if (bVar == null || (word = bVar.getWord()) == null) {
                    tVar = null;
                } else {
                    String str = !r30.k.L0(word) ? word : null;
                    if (str == null || (startTime = bVar.getStartTime()) == null) {
                        tVar = null;
                    } else {
                        long jD = f50.k.D(startTime.doubleValue());
                        Double endTime = bVar.getEndTime();
                        tVar = new t(jD, endTime != null ? f50.k.D(endTime.doubleValue()) : jD, str);
                    }
                }
                if (tVar != null) {
                    arrayList2.add(tVar);
                }
            }
            if (aVar == null || arrayList2.isEmpty()) {
                sVar = null;
            } else {
                Integer paragraph = aVar.getParagraph();
                String role = aVar.getRole();
                if (role == null) {
                    role = "speaker_0";
                } else {
                    if (r30.k.L0(role)) {
                        role = null;
                    }
                    if (role == null) {
                        role = "speaker_0";
                    }
                }
                String str2 = role;
                Double start = aVar.getStart();
                long jD2 = start != null ? f50.k.D(start.doubleValue()) : ((t) h00.q.L0(arrayList2)).b;
                Double end = aVar.getEnd();
                sVar = new s(paragraph, str2, jD2, end != null ? f50.k.D(end.doubleValue()) : ((t) h00.q.T0(arrayList2)).c, arrayList2);
            }
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
        return new r(h00.q.i1(arrayList, new ba.m(23)));
    }
}
