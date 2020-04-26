package me.coodlude.edgeofdarkness.common.init.tardis;

import java.util.HashMap;

public class TardisHandler {

    public static HashMap<Integer, TardisInfo> tardises = new HashMap<>();


    public static int addTardis() {
        int id = tardises.size() + 1;
        TardisInfo info = new TardisInfo();
        info.tardisID = id;
        tardises.put(id, info);

        return id;
    }
}
