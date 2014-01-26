package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bvoice")
public class Command_bvoice extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
        String announcer = Linkme.config.getString("announcer");
        String announcer1 = Utils_Colour.replaceColors(announcer);
        String voiceserverlist = Linkme.config.getString("voiceserverlist");
        String voiceserverlist1 = Utils_Colour.replaceColors(voiceserverlist);
        String mumbledesc = Linkme.config.getString("mumbledesc");
        String mumbledesc1 = Utils_Colour.replaceColors(mumbledesc);
        String mumbleip = Linkme.config.getString("mumbleip");
        String mumbleip1 = Utils_Colour.replaceColors(mumbleip);
        String ventdesc = Linkme.config.getString("ventdesc");
        String ventdesc1 = Utils_Colour.replaceColors(ventdesc);
        String venturl = Linkme.config.getString("venturl");
        String venturl1 = Utils_Colour.replaceColors(venturl);
        String ts3desc = Linkme.config.getString("ts3desc");
        String ts3desc1 = Utils_Colour.replaceColors(ts3desc);
        String ts3ip = Linkme.config.getString("ts3ip");
        String ts3ip1 = Utils_Colour.replaceColors(ts3ip);
        Bukkit.broadcastMessage(announcer1 + ": " + voiceserverlist1);
        Bukkit.broadcastMessage(mumbledesc1 + ": " + mumbleip1);
        Bukkit.broadcastMessage(ventdesc1 + ": " + venturl1);
        Bukkit.broadcastMessage(ts3desc1 + ": " + ts3ip1);
        return false;
    }
}