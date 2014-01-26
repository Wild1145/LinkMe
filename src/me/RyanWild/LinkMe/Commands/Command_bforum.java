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
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bforum")
public class Command_bforum extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String forumdesc = Linkme.config.getString("Forums.info.description");
    String forumdesc1 = LinkMe_Utils.replaceColors(forumdesc);
    String forumurl = Linkme.config.getString("Forums.info.url");
    String forumurl1 = LinkMe_Utils.replaceColors(forumurl);
    String Status = Linkme.config.getString("Forums.info.enabled");
    Player player = (Player) commandSender;
         if (Status.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(announcer1 + ": " + forumdesc1 + " "+ forumurl1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}