package me.RyanWild.LinkMe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.RyanWild.LinkMe.Commands.*;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.Metrics;

public class Linkme extends JavaPlugin
{

    public static final Logger logger = Bukkit.getLogger();
    
    public static BukkitCommandHandler handler;
    
    public static YamlConfig config;

    public static Linkme plugin;

    public static final String MSG_NO_PERMS = ChatColor.RED + "You do not have permission to use this command.";

    @Override
    public void onDisable()
    {
        Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": LinkMe Plugin by Wild1145 & Kyle1986 has been Disabled! ");
        Linkme.logger.info("LinkMe Plugin Disabled");
    }

    @Override
    public void onEnable()
    {
        plugin = this;
        
        handler = new BukkitCommandHandler(plugin);
        handler.setCommandLocation(Command_site.class.getPackage());
        handler.setPermissionMessage(MSG_NO_PERMS);
        
        config = new YamlConfig(plugin,"config.yml",true);
        config.load();
        PluginDescriptionFile pdfFile = this.getDescription();
        Linkme.logger.log(Level.INFO, "{0} Version{1} Has Been Enabled", new Object[]{pdfFile.getName(), pdfFile.getVersion()});
        


        Linkme.config.options().copyDefaults(true);
        saveConfig();

        try
        {
            Metrics metrics = new Metrics(this);
            metrics.start();
        }
        catch (IOException e)
        {
            Linkme.logger.severe("[" + getDescription().getName() + "] Error Submitting stats!");
        }

        Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": LinkMe Plugin by Wild1145 & Kyle1986 has been Enabled! ");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        // This will handle ALL commands from now on DONT TOUCH!!!
        return handler.handleCommand(sender, cmd, commandLabel, args);
        
    }

}
