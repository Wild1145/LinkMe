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
import org.bukkit.entity.Player;
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
        Linkme.logger.log(Level.INFO, "{0} Version{1} Has Been Enabled", new Object[]
        {
            pdfFile.getName(), pdfFile.getVersion()
        });
        Linkme.config.options().copyDefaults(true);
        saveConfig();

        try
        {
            Metrics metrics = new Metrics(this);
            metrics.start();
        }
        catch (IOException e)
        {
            System.out.println("[" + getDescription().getName() + "] Error Submitting stats!");
        }

        Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": LinkMe Plugin by Wild1145 & Kyle1986 has been Enabled! ");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        
        return handler.handleCommand(sender, cmd, commandLabel, args);
        
        
        /*Player player = (Player) sender;

        plugin.getCommand("site").setExecutor(new Command_site(plugin));
        
        if (commandLabel.equalsIgnoreCase("bsite"))
        {
            if (player.hasPermission("linkme.broadcast.site"))
            {
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("sitedesc") + ": " + Linkme.config.getString("site")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("ts"))
        {
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("ts3desc") + ": " + Linkme.config.getString("ts3ip")));

        }
        else if (commandLabel.equalsIgnoreCase("vent"))
        {
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("ventdesc") + ": " + Linkme.config.getString("ventip")));

        }
        else if (commandLabel.equalsIgnoreCase("facebook"))
        {
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("facebookdesc") + ": " + Linkme.config.getString("facebookurl")));

        }
        else if (commandLabel.equalsIgnoreCase("bfacebook"))
        {
            if (player.hasPermission("linkme.broadcast.facebook"))
            {
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("facebookdesc") + ": " + Linkme.config.getString("facebookurl")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("youtube"))
        {
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("youtubedesc") + ": " + Linkme.config.getString("youtubeurl")));

        }
        else if (commandLabel.equalsIgnoreCase("byoutube"))
        {
            Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("youtubedesc") + ": " + Linkme.config.getString("youtubeurl")));

        }
        else if (commandLabel.equalsIgnoreCase("bfacebook"))
        {
            if (player.hasPermission("linkme.broadcast.facebook"))
            {
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("facebookdesc") + ": " + Linkme.config.getString("facebookurl")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("twitter"))
        {
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("twitterdesc") + ": " + Linkme.config.getString("twitterurl or @tag here")));

        }
        else if (commandLabel.equalsIgnoreCase("btwitter"))
        {
            if (player.hasPermission("linkme.broadcast.twitter"))
            {
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("twitterdesc") + ": " + Linkme.config.getString("twitterurl or @tag here")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("donator"))
        {
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("donatordesc") + ": " + Linkme.config.getString("donatorurl")));

        }
        else if (commandLabel.equalsIgnoreCase("bdonator"))
        {
            if (player.hasPermission("linkme.broadcast.donator"))
            {
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("donatordesc") + ": " + Linkme.config.getString("donatorurl")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("mum"))
        {
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("mumbledesc") + ": " + Linkme.config.getString("mumbleip")));

        }
        else if (commandLabel.equalsIgnoreCase("bforum"))
        {
            if (player.hasPermission("linkme.broadcast.forum"))
            {
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("forumtext") + ": " + Linkme.config.getString("forum")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("forum"))
        {
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("forumtext") + ": " + Linkme.config.getString("forum")));

        }
        else if (commandLabel.equalsIgnoreCase("bvoice"))
        {
            if (player.hasPermission("linkme.broadcast.voice"))
            {
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("voiceserverlist")));
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("mumbledesc") + ": " + Linkme.config.getString("mumbleip")));
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("ventdesc") + ": " + Linkme.config.getString("ventip")));
                Bukkit.broadcastMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("ts3desc") + ": " + Linkme.config.getString("ts3ip")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("voice"))
        {

            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("voiceserverlist")));
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("mumbledesc") + ": " + Linkme.config.getString("mumbleip")));
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("ventdesc") + ": " + Linkme.config.getString("ventip")));
            player.sendMessage(Linkme.config.getString("announcer") + ": " + (Linkme.config.getString("ts3desc") + ": " + Linkme.config.getString("ts3ip")));

        }
        else if (commandLabel.equalsIgnoreCase("lmreload"))
        {
            if (player.hasPermission("linkme.reload"))
            {
                this.reloadConfig();
                player.sendMessage("Link Me config has been reloaded!");
            }
        }
        return false; */
    }

}