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
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.btwitch")
public class Command_btwitch extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String twitchdesc = Linkme.config.getString("Twitch.info.description");
    String twitchdesc1 = LinkMe_Utils.replaceColors(twitchdesc);
    String twitchurl = Linkme.config.getString("Twitch.info.url");
    String twitchurl1 = LinkMe_Utils.replaceColors(twitchurl);
    String Status = Linkme.config.getString("Website.info.enabled");
         if (Status.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(announcer1 + ": " + twitchdesc1 + " "+ twitchurl1);
        } else {
            Player player = (Player) commandSender;
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}