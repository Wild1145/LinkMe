package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bsite")
public class Command_bsite extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String sitetext = Linkme.config.getString("sitetext");
    String sitetext1 = LinkMe_Utils.replaceColors(sitetext);
    String site = Linkme.config.getString("site");
    String site1 = LinkMe_Utils.replaceColors(site);
    Bukkit.broadcastMessage(announcer1 + ": " + sitetext1 + " "+ site1);
        return false;
    }
}