package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>")
public class Command_site extends BukkitCommand {
    
    
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args) {
        
        Player player = (Player) commandSender;
        
         player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("sitetext") + ": " + Linkme.config.getString("site")));
        
        return false;
    }
    
}
