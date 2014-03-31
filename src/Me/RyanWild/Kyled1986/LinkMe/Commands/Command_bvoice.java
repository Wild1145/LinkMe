package Me.RyanWild.Kyled1986.LinkMe.Commands;

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

        Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(Strings.Announcer) + ": " + (LinkMe_Utils.replaceColors(Strings.Voicelist)));
         if (Strings.MumbleStatus.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(Strings.Mumbledescription) + ": " + LinkMe_Utils.replaceColors(Strings.Mumbleip));
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
         if (Strings.VentriloStatus.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(Strings.Ventdescription) + ": " + LinkMe_Utils.replaceColors(Strings.Ventip));
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
         if (Strings.TS3Status.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(Strings.TS33description) + ": " + LinkMe_Utils.replaceColors(Strings.TS3ip));
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}