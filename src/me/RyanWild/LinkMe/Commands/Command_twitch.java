package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.twitch")
public class Command_twitch extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String twitchdesc = Linkme.config.getString("twitchdesc");
    String twitchdesc1 = Utils_Colour.replaceColors(twitchdesc);
    String twitchurl = Linkme.config.getString("twitchurl");
    String twitchurl1 = Utils_Colour.replaceColors(twitchurl);
    player.sendMessage(announcer1 + ": " + twitchdesc1 + " "+ twitchurl1);
    return false;
    }
}