package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.byoutube")
public class Command_byoutube extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String youtubedesc = Linkme.config.getString("youtubedesc");
    String youtubedesc1 = Utils_Colour.replaceColors(youtubedesc);
    String youtubeurl = Linkme.config.getString("youtubeurl");
    String youtubeurl1 = Utils_Colour.replaceColors(youtubeurl);
    Bukkit.broadcastMessage(announcer1 + ": " + youtubedesc1 + " "+ youtubeurl1);
        return false;
    }
}