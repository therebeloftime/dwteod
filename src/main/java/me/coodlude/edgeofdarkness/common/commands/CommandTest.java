package me.coodlude.edgeofdarkness.common.commands;

import me.coodlude.edgeofdarkness.common.init.tardis.TardisHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

import java.util.Collections;
import java.util.List;

public class CommandTest extends CommandBase {

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (sender instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) sender;

            System.out.println(TardisHandler.getTardisIDFromPos(player.getPosition()));
            System.out.println(TardisHandler.getIDFromCoords(player.getPosition()));
        }
    }

    @Override
    public String getName() {
        return "test";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "";
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos) {
        return Collections.emptyList();
    }
}
