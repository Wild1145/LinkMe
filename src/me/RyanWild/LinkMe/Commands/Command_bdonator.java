package me.RyanWild.LinkMe.Commands;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bdonaotor")
public class Command_bdonator extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
        
    String donatordesc = Linkme.config.getString("donatordesc");
    String donatordesc1 = Utils_Colour.replaceColors(donatordesc);
    Bukkit.broadcastMessage(announcer1 + ": " + donatordesc1);
        return false;
    }
}