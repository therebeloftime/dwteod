package me.coodlude.edgeofdarkness.common.commands;

import me.coodlude.edgeofdarkness.common.init.ModSchematics;
import me.coodlude.edgeofdarkness.util.helper.schematics.SchematicUtil;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

import java.util.Collections;
import java.util.List;

public class CommandPasteSchematic extends CommandBase {

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

        if (args.length < 1 || sender.getEntityWorld().isRemote) return;

        if (sender instanceof EntityPlayer) {
            SchematicUtil.generateSchematic(ModSchematics.PURPLE_OAK_INT, sender.getPosition(), ((EntityPlayer) sender).world, true);
        }
    }

    @Override
    public String getName() {
        return "schematic-paste";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/" + this.getName() + " <schematic_name>";
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
