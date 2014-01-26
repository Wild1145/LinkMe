package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bsite")
public class Command_bsite extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String sitedesc = Linkme.config.getString("Website.info.description");
    String sitedesc1 = LinkMe_Utils.replaceColors(sitedesc);
    String siteurl = Linkme.config.getString("Website.info.url");
    String siteurl1 = LinkMe_Utils.replaceColors(siteurl);
    String Status = Linkme.config.getString("Website.info.enabled");
         if (Status.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(announcer1 + ": " + sitedesc1 + " "+ siteurl1);
        } else {
            Player player = (Player) commandSender;
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}