package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_site extends LM_Command implements CommandExecutor {
    
    public Command_site(Linkme plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        
        Player player = (Player) sender;
        
        // player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("sitetext") + ": " + getConfig().getString("site")));
        
        return false;
    }
    
}
