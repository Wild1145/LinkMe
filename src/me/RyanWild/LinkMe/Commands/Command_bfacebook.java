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
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bfacebook")
public class Command_bfacebook extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String facebookdesc = Linkme.config.getString("Facebook.info.description");
    String facebookdesc1 = LinkMe_Utils.replaceColors(facebookdesc);
    String facebookurl = Linkme.config.getString("Facebook.info.url");
    String facebookurl1 = LinkMe_Utils.replaceColors(facebookurl);
    String Status = Linkme.config.getString("Facebook.info.enabled");
    Player player = (Player) commandSender;
         if (Status.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(announcer1 + ": " + facebookdesc1 + " "+ facebookurl1); 
        } else {

            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}