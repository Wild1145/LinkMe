package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bfacebook")
public class Command_bfacebook extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String facebookdesc = Linkme.config.getString("facebookdesc");
    String facebookdesc1 = Utils_Colour.replaceColors(facebookdesc);
    String facebookurl = Linkme.config.getString("facebookurl");
    String facebookurl1 = Utils_Colour.replaceColors(facebookurl);
    Bukkit.broadcastMessage(announcer1 + ": " + facebookdesc1 + " "+ facebookurl1);
        return false;
    }
}