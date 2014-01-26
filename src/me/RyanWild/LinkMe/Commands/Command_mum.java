package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.mum")
public class Command_mum extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String Mumbledesc = Linkme.config.getString("Mumble.info.description");
    String Mumbledesc1 = LinkMe_Utils.replaceColors(Mumbledesc);
    String Mumbleip = Linkme.config.getString("Mumble.info.url");
    String Mumbleip1 = LinkMe_Utils.replaceColors(Mumbleip);
    String Status = Linkme.config.getString("Mumble.info.enabled");
    Player player = (Player) commandSender;
         if (Status.equalsIgnoreCase("true")){
            player.sendMessage(announcer1 + ": " + Mumbledesc1 + " "+ Mumbleip1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}