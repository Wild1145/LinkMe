
package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;

public abstract class LM_Command {
    protected Linkme plugin;
    protected Server server;
    PluginManager pm;
    
    public LM_Command() {
    }
    
    //Credits to Steven Lawson/Madgeek & Jerom Van Der Sar/DarthSalamon for various methods and WickedGamingUK who i stole this from!
    public Player getPlayer(String name) {
        for(Player player : plugin.getServer().getOnlinePlayers()) {
          if(name.equalsIgnoreCase(player.getName())) {
              return player;
          }
        }
        return null;
    }
}