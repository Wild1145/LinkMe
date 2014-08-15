package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Strings;
import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Utils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.bvoice")
public class Command_bvoice extends BukkitCommand
    {

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
        {

        Player player = (Player) commandSender;

        Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(LinkMe_Strings.Announcer) + ": " + (LinkMe_Utils.replaceColors(LinkMe_Strings.Voicelist)));
        if (LinkMe_Strings.MumbleStatus.equalsIgnoreCase("true"))
            {
            Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(LinkMe_Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(LinkMe_Strings.Mumbledescription) + ": " + LinkMe_Utils.replaceColors(LinkMe_Strings.Mumbleip));
            }
        else
            {
            player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
            }
        if (LinkMe_Strings.VentriloStatus.equalsIgnoreCase("true"))
            {
            Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(LinkMe_Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(LinkMe_Strings.Ventdescription) + ": " + LinkMe_Utils.replaceColors(LinkMe_Strings.Ventip));
            }
        else
            {
            player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
            }
        if (LinkMe_Strings.TS3Status.equalsIgnoreCase("true"))
            {
            Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(LinkMe_Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(LinkMe_Strings.TS33description) + ": " + LinkMe_Utils.replaceColors(LinkMe_Strings.TS3ip));
            }
        else
            {
            player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
            }
        return false;
        }
    }
