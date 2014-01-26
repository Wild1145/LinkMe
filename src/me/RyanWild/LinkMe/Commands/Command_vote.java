package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.vote")
public class Command_vote extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String votedesc = Linkme.config.getString("votedesc");
    String votedesc1 = LinkMe_Utils.replaceColors(votedesc);
    String voteurl = Linkme.config.getString("voteurl");
    String voteurl1 = LinkMe_Utils.replaceColors(voteurl);
    player.sendMessage(announcer1 + ": " + votedesc1 + " "+ voteurl1);  
    return false;
    }
}