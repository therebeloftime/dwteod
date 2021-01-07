package me.coodlude.edgeofdarkness.common.init.tardis;

import me.coodlude.edgeofdarkness.client.models.ModelTardisBase;

public interface IFlightAnimation {

    void tickAnimationRemat(int timer, TardisInfo info, ModelTardisBase base);
    void tickAnimationDemat(int timer, TardisInfo info, ModelTardisBase base);
}
