package me.RyanWild.LinkMe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.RyanWild.LinkMe.Commands.*;
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

    public static final Logger logger = Logger.getLogger("Minecraft-Server");

    public static Linkme plugin;

    public static final String MSG_NO_PERMS = ChatColor.RED + "You do not have permission to use this command.";

    @Override
    public void onDisable()
    {
        Bukkit.broadcastMessage(getConfig().getString("announcer") + ": LinkMe Plugin by Wild1145 & Kyle1986 has been Disabled! ");
        Linkme.logger.info("LinkMe Plugin Disabled");
    }

    @Override
    public void onEnable()
    {
        PluginDescriptionFile pdfFile = this.getDescription();
        Linkme.logger.log(Level.INFO, "{0} Version{1} Has Been Enabled", new Object[]
        {
            pdfFile.getName(), pdfFile.getVersion()
        });
        getConfig().options().copyDefaults(true);
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

        Bukkit.broadcastMessage(getConfig().getString("announcer") + ": LinkMe Plugin by Wild1145 & Kyle1986 has been Enabled! ");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        Player player = (Player) sender;

        plugin.getCommand("site").setExecutor(new Command_site(plugin));
        
        if (commandLabel.equalsIgnoreCase("bsite"))
        {
            if (player.hasPermission("linkme.broadcast.site"))
            {
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("sitedesc") + ": " + getConfig().getString("site")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("ts"))
        {
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("ts3desc") + ": " + getConfig().getString("ts3ip")));

        }
        else if (commandLabel.equalsIgnoreCase("vent"))
        {
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("ventdesc") + ": " + getConfig().getString("ventip")));

        }
        else if (commandLabel.equalsIgnoreCase("facebook"))
        {
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("facebookdesc") + ": " + getConfig().getString("facebookurl")));

        }
        else if (commandLabel.equalsIgnoreCase("bfacebook"))
        {
            if (player.hasPermission("linkme.broadcast.facebook"))
            {
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("facebookdesc") + ": " + getConfig().getString("facebookurl")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("youtube"))
        {
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("youtubedesc") + ": " + getConfig().getString("youtubeurl")));

        }
        else if (commandLabel.equalsIgnoreCase("byoutube"))
        {
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("youtubedesc") + ": " + getConfig().getString("youtubeurl")));

        }
        else if (commandLabel.equalsIgnoreCase("bfacebook"))
        {
            if (player.hasPermission("linkme.broadcast.facebook"))
            {
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("facebookdesc") + ": " + getConfig().getString("facebookurl")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("twitter"))
        {
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("twitterdesc") + ": " + getConfig().getString("twitterurl or @tag here")));

        }
        else if (commandLabel.equalsIgnoreCase("btwitter"))
        {
            if (player.hasPermission("linkme.broadcast.twitter"))
            {
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("twitterdesc") + ": " + getConfig().getString("twitterurl or @tag here")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("donator"))
        {
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("donatordesc") + ": " + getConfig().getString("donatorurl")));

        }
        else if (commandLabel.equalsIgnoreCase("bdonator"))
        {
            if (player.hasPermission("linkme.broadcast.donator"))
            {
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("donatordesc") + ": " + getConfig().getString("donatorurl")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("mum"))
        {
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("mumbledesc") + ": " + getConfig().getString("mumbleip")));

        }
        else if (commandLabel.equalsIgnoreCase("bforum"))
        {
            if (player.hasPermission("linkme.broadcast.forum"))
            {
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("forumtext") + ": " + getConfig().getString("forum")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("forum"))
        {
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("forumtext") + ": " + getConfig().getString("forum")));

        }
        else if (commandLabel.equalsIgnoreCase("bvoice"))
        {
            if (player.hasPermission("linkme.broadcast.voice"))
            {
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("voiceserverlist")));
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("mumbledesc") + ": " + getConfig().getString("mumbleip")));
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("ventdesc") + ": " + getConfig().getString("ventip")));
                Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("ts3desc") + ": " + getConfig().getString("ts3ip")));
            }
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        else if (commandLabel.equalsIgnoreCase("voice"))
        {

            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("voiceserverlist")));
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("mumbledesc") + ": " + getConfig().getString("mumbleip")));
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("ventdesc") + ": " + getConfig().getString("ventip")));
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("ts3desc") + ": " + getConfig().getString("ts3ip")));

        }
        else if (commandLabel.equalsIgnoreCase("lmreload"))
        {
            if (player.hasPermission("linkme.reload"))
            {
                this.reloadConfig();
                player.sendMessage("Link Me config has been reloaded!");
            }
        }
        return false;
    }

}