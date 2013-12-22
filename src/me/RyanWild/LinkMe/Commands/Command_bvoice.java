package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.bvoice")
public class Command_bvoice extends BukkitCommand
{

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {

        Player player = (Player) commandSender;

        Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("voiceserverlist")));
        Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("mumbledesc") + ": " + Linkme.config.getString("mumbleip")));
        Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("ventdesc") + ": " + Linkme.config.getString("ventip")));
        Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("ts3desc") + ": " + Linkme.config.getString("ts3ip")));

        return false;
    }

}