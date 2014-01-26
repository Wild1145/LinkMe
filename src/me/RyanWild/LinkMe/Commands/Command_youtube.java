package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.youtube")
public class Command_youtube extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
        Player player = (Player) commandSender;
        String announcer = Linkme.config.getString("announcer");
        String announcer1 = LinkMe_Utils.replaceColors(announcer);
        String youtubedesc = Linkme.config.getString("youtubedesc");
        String youtubedesc1 = LinkMe_Utils.replaceColors(youtubedesc);
        String youtubeurl = Linkme.config.getString("youtubeurl");
        String youtubeurl1 = LinkMe_Utils.replaceColors(youtubeurl);
        player.sendMessage(announcer1 + ": " + youtubedesc1 + " "+ youtubeurl1);
        return false;
    }
}