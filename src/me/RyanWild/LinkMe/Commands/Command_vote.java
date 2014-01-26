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
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String votedesc = Linkme.config.getString("Voting.info.description");
    String votedesc1 = LinkMe_Utils.replaceColors(votedesc);
    String voteurl = Linkme.config.getString("vote");
    String voteurl1 = LinkMe_Utils.replaceColors(voteurl);
    String Status = Linkme.config.getString("Voting.info.enabled");
    Player player = (Player) commandSender;
         if (Status.equalsIgnoreCase("true")){
            player.sendMessage(announcer1 + ": " + votedesc1 + " "+ voteurl1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}