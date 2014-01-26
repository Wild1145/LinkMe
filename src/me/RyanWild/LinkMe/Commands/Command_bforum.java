package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bforum")
public class Command_bforum extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = LinkMe_Utils.replaceColors(announcer);
    String forumtext = Linkme.config.getString("forumtext");
    String forumtext1 = LinkMe_Utils.replaceColors(forumtext);
    String forum = Linkme.config.getString("forum");
    String forum1 = LinkMe_Utils.replaceColors(forum);
    Bukkit.broadcastMessage(announcer1 + ": " + forumtext1 + " "+ forum1);
        return false;
    }
}