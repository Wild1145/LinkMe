package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.btwitter")
public class Command_btwitter extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String twitterdesc = Linkme.config.getString("twitterdesc");
    String twitterdesc1 = LinkMe_Utils.replaceColors(twitterdesc);
    String twitterurl = Linkme.config.getString("twitterurl");
    String twitterurl1 = LinkMe_Utils.replaceColors(twitterurl);
    Bukkit.broadcastMessage(announcer1 + ": " + twitterdesc1 + " "+ twitterurl1);
        return false;
    }
}