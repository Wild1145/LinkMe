package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.vent")
public class Command_vent extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String Ventrillodesc = Linkme.config.getString("Ventrillo.info.description");
    String Ventrillodesc1 = LinkMe_Utils.replaceColors(Ventrillodesc);
    String Ventrilloip = Linkme.config.getString("Ventrillo.info.url");
    String Ventrilloip1 = LinkMe_Utils.replaceColors(Ventrilloip);
    String Status = Linkme.config.getString("Ventrillo.info.enabled");
    Player player = (Player) commandSender;
         if (Status.equalsIgnoreCase("true")){
            player.sendMessage(announcer1 + ": " + Ventrillodesc1 + " "+ Ventrilloip1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}