package me.RyanWild.LinkMe;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public class Linkme extends JavaPlugin

{
    public static final Logger logger = Logger.getLogger("Minecraft-Server");
    public static Linkme plugin;
    public static final String MSG_NO_PERMS = ChatColor.RED + "You do not have permission to use this command.";
     
    @Override
    public void onDisable()
    {
        Bukkit.broadcastMessage(getConfig().getString("announcer") + ": LinkMe Plugin by Wild1145 has been Disabled! "); 
        Linkme.logger.info("Link Me Plugin Disabled");
    }

    @Override
    public void onEnable()
    {
        PluginDescriptionFile pdfFile = this.getDescription();
        Linkme.logger.info(pdfFile.getName() + " Version" + pdfFile.getVersion() + " Has Been Enabled");
        getConfig().options().copyDefaults(true);
        saveConfig();
        
       /* if (getConfig().getBoolean("EnableUpdateChecker"))
        {
                Updater updater = new Updater(this);
                if (!updater.isLatest()) {
                getLogger().warning("There is a newer version of ModeratorNotes available");
                getLogger().warning("Download it at " + updater.getDownloadLink());
             }
        else 
             {
             getLogger().info("You have the latest version of ModeratorNotes!");
             }

       }*/
            
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        Player player = (Player) sender;

        if (commandLabel.equalsIgnoreCase("site"))
        {
            
            player.sendMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("sitetext") + ": " + getConfig().getString("site")));

        }
        
        
        /*
        else if (commandLabel.equalsIgnoreCase("linkme"))
        {
            player.sendMessage(ChatColor.GOLD + "[" + ChatColor.DARK_BLUE + "LINKME" + ChatColor.GOLD + "]\n" + "/site - Shows the site url\n" + "/bsite - Broadcasts the site url\n" + "/bvoice - Broadcasts voice servers\n" + "/mum - Shows Mumble Server Details\n" + "/ts - Shows the TS3 IP\n" + "/vent - Shows the Ventrillo IP\n" + "/facebook - Shows the Facebook Page\n" + "/bfacebook - Broadcasts the Facebook Page\n" + "/youtube - Show the Youtube Page\n" + "/byoutube - Broadcasts the Youtube Page\n" + "/twitter - SHows the Twitter Page\n" + "/btwitter - Broadcasts the Twitter Page\n" + "/donator - Shows the Donator Page\n" + "/bdonator - Broadcasts the Donator Page\n");

        } 
        
        
        else if (commandLabel.equalsIgnoreCase("lm"))
        {
            player.sendMessage(ChatColor.GOLD + "[" + ChatColor.DARK_BLUE + "LINKME" + ChatColor.GOLD + "]\n" + "/site - Shows the site url\n" + "/bsite - Broadcasts the site url\n" + "/bvoice - Broadcasts voice servers\n" + "/mum - Shows Mumble Server Details\n" + "/ts - Shows the TS3 IP\n" + "/vent - Shows the Ventrillo IP\n" + "/facebook - Shows the Facebook Page\n" + "/bfacebook - Broadcasts the Facebook Page\n" + "/youtube - Show the Youtube Page\n" + "/byoutube - Broadcasts the Youtube Page\n" + "/twitter - SHows the Twitter Page\n" + "/btwitter - Broadcasts the Twitter Page\n" + "/donator - Shows the Donator Page\n" + "/bdonator - Broadcasts the Donator Page\n");

        }
        */
        
        else if (commandLabel.equalsIgnoreCase("bsite"))
        {
            if (player.hasPermission("linkme.broadcast.site")){
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("sitedesc") + ": " + getConfig().getString("site")));
            }
           /* else if (sender.getName().equalsIgnoreCase("wild1145"))
            {     
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("sitedesc") + ": " + getConfig().getString("site")));
            }*/
            else{
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
            if (player.hasPermission("linkme.broadcast.facebook")){
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("facebookdesc") + ": " + getConfig().getString("facebookurl")));
            }
           /* else if (sender.getName().equalsIgnoreCase("wild1145")){     
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("facebookdesc") + ": " + getConfig().getString("facebookurl")));
            }*/
            else{
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
           /* else if (sender.getName().equalsIgnoreCase("wild1145"))
            {     
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("facebookdesc") + ": " + getConfig().getString("facebookurl")));
            }*/
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
         /*   else if (sender.getName().equalsIgnoreCase("wild1145"))
            {     
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("twitterdesc") + ": " + getConfig().getString("twitterurl or @tag here")));
            }*/
            else{
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
            if (player.hasPermission("linkme.broadcast.donator")){
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("donatordesc") + ": " + getConfig().getString("donatorurl")));
            }
         /*   else if (sender.getName().equalsIgnoreCase("wild1145"))
            {     
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("donatordesc") + ": " + getConfig().getString("donatorurl")));
            }*/
            else{
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
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("forumdesc") + ": " + getConfig().getString("forum")));
            }
       /*     else if (sender.getName().equalsIgnoreCase("wild1145"))
            {     
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("forumdesc") + ": " + getConfig().getString("forum")));
            }*/
            else{
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
           /* else if (sender.getName().equalsIgnoreCase("wild1145"))
            {     
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("voiceserverlist")));
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("mumbledesc") + ": " + getConfig().getString("mumbleip")));
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("ventdesc") + ": " + getConfig().getString("ventip")));
            Bukkit.broadcastMessage(getConfig().getString("announcer") + ": " + (getConfig().getString("ts3desc") + ": " + getConfig().getString("ts3ip")));
            }*/
            else
            {
                player.sendMessage(MSG_NO_PERMS);
                return true;
            }
        }
        return false;
    }
}