package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Strings;
import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Utils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.youtube")
public class Command_youtube extends BukkitCommand
    {

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
        {
        Player player = (Player) commandSender;
        if (LinkMe_Strings.YoutubeStatus.equalsIgnoreCase("true"))
            {
            player.sendMessage(LinkMe_Utils.replaceColors(LinkMe_Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(LinkMe_Strings.Youtubedescription) + ": " + LinkMe_Utils.replaceColors(LinkMe_Strings.Youtubeurl));
            }
        else
            {
            player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
            }
        return false;
        }
    }
