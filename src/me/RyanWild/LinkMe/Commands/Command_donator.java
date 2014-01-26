package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.donaotor")
public class Command_donator extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String donatordesc = Linkme.config.getString("donatordesc");
    String donatordesc1 = Utils_Colour.replaceColors(donatordesc);
    String donatorurl = Linkme.config.getString("donatorurl");
    String donatorurl1 = Utils_Colour.replaceColors(donatorurl);
    player.sendMessage(announcer1 + ": " + donatordesc1 + " "+ donatorurl1);
        return false;
    }
}