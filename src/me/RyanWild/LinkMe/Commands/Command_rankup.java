package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
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
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String rankdesc = Linkme.config.getString("RankingUp.info.description");
    String rankdesc1 = LinkMe_Utils.replaceColors(rankdesc);
    String Status = Linkme.config.getString("RankingUp.info.enabled");
    Player player = (Player) commandSender;
         if (Status.equalsIgnoreCase("true")){
            player.sendMessage(announcer1 + ": " + rankdesc1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}