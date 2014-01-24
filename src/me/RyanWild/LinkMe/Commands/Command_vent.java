package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.vent")
public class Command_vent extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String ventdesc = Linkme.config.getString("ventdesc");
    String ventdesc1 = Utils_Colour.replaceColors(ventdesc);
    String venturl = Linkme.config.getString("venturl");
    String venturl1 = Utils_Colour.replaceColors(venturl);
    player.sendMessage(announcer1 + ": " + ventdesc1 + " "+ venturl1);
    return false;
    }
}