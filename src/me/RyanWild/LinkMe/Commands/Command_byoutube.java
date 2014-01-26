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
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.byoutube")
public class Command_byoutube extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String youtubedesc = Linkme.config.getString("Youtube.info.description");
    String youtubedesc1 = LinkMe_Utils.replaceColors(youtubedesc);
    String youtubeurl = Linkme.config.getString("Youtube.info.url");
    String youtubeurl1 = LinkMe_Utils.replaceColors(youtubeurl);
    String Status = Linkme.config.getString("Youtube.info.enabled");
    Player player = (Player) commandSender;
         if (Status.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(announcer1 + ": " + youtubedesc1 + " "+ youtubeurl1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}