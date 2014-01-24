package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.rankup")
public class Command_rankup extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String ranktext = Linkme.config.getString("ranktext");
    String ranktext1 = Utils_Colour.replaceColors(ranktext);
    String rankurl = Linkme.config.getString("rankurl");
    String rankurl1 = Utils_Colour.replaceColors(rankurl);
    player.sendMessage(announcer1 + ": " + ranktext1 + " "+ rankurl1);
    return false;
    }
}