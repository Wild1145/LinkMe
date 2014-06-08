package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Utils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.bforum")
public class Command_bforum extends BukkitCommand
    {

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
        {
        Player player = (Player) commandSender;
        if (Strings.ForumStatus.equalsIgnoreCase("true"))
            {
            Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(Strings.Forumdescription) + ": " + LinkMe_Utils.replaceColors(Strings.Forumurl));
            }
        else
            {
            player.sendMessage(Strings.MSG_NO_PERMS);
            }
        return false;
        }
    }
