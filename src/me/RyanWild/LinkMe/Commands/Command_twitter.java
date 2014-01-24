package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.twitter")
public class Command_twitter extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String twitterdesc = Linkme.config.getString("twitterdesc");
    String twitterdesc1 = Utils_Colour.replaceColors(twitterdesc);
    String twitterurl = Linkme.config.getString("twitterurl");
    String twitterurl1 = Utils_Colour.replaceColors(twitterurl);
    player.sendMessage(announcer1 + ": " + twitterdesc1 + " "+ twitterurl1);
    return false;
    }
}