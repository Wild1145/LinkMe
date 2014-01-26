package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bdonaotor")
public class Command_bdonator extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String donatordesc = Linkme.config.getString("Donator.info.description");
    String donatordesc1 = LinkMe_Utils.replaceColors(donatordesc);
    String donatorurl = Linkme.config.getString("Donator.info.url");
    String donatorurl1 = LinkMe_Utils.replaceColors(donatorurl);
    String Status = Linkme.config.getString("Donator.info.enabled");
         if (Status.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(announcer1 + ": " + donatordesc1 + " " + donatorurl1);   
        } else {
            Player player = (Player) commandSender;
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}