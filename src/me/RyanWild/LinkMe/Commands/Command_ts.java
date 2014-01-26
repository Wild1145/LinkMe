package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.ts")
public class Command_ts extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String ts3desc = Linkme.config.getString("ts3desc");
    String ts3desc1 = Utils_Colour.replaceColors(ts3desc);
    String ts3ip = Linkme.config.getString("ts3ip");
    String ts3ip1 = Utils_Colour.replaceColors(ts3ip);
    player.sendMessage(announcer1 + ": " + ts3desc1 + " "+ ts3ip1);
    return false;
    }
}