package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Utils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.donaotor")
public class Command_donator extends BukkitCommand
    {

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
        {
        Player player = (Player) commandSender;
        if (Strings.Donatorstatus.equalsIgnoreCase("true"))
            {
            player.sendMessage(LinkMe_Utils.replaceColors(Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(Strings.Donatordescription) + ": " + LinkMe_Utils.replaceColors(Strings.Donatorurl));
            }
        else
            {
            player.sendMessage(Strings.MSG_NO_PERMS);
            }
        return false;
        }
    }
