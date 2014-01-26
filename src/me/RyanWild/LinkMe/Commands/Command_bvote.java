package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "blinkme.bvote")
public class Command_bvote extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String votetext = Linkme.config.getString("votetext");
    String votetext1 = LinkMe_Utils.replaceColors(votetext);
    String vote = Linkme.config.getString("vote");
    String vote1 = LinkMe_Utils.replaceColors(vote);
    Bukkit.broadcastMessage(announcer1 + ": " + votetext1 + " "+ vote1);
        return false;
    }
}