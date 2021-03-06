package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.Linkme;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.lmreload")
public class Command_lmreload extends BukkitCommand
    {

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
        {
        String filepath = plugin.getDataFolder().toPath().toString();
        String configfilename = "config.yml";
        String messagesfilename = "messages.yml";
        Player player = (Player) commandSender;

        File f = new File(plugin.getDataFolder().toPath().toString() + "\\" + "config.yml");
        File f2 = new File(plugin.getDataFolder().toPath().toString() + "\\" + "messages.yml");

        if (f.exists() && !f.isDirectory())
            {
            try
                {
                PluginManager pluginManager = plugin.getServer().getPluginManager();
                plugin.getConfig().load(filepath + "\\" + configfilename);
                pluginManager.disablePlugin(plugin);
                pluginManager.enablePlugin(plugin);
                plugin.getConfig().load(filepath + "\\" + configfilename);
                player.sendMessage("Config has been reloaded");
                }
            catch (IOException ex)
                {
                Logger.getLogger(Command_lmreload.class.getName()).log(Level.SEVERE, null, ex);
                }
            catch (InvalidConfigurationException ex)
                {
                Logger.getLogger(Command_lmreload.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        else
            {
            player.sendMessage("Config.yml was unable to be reloaded - generating a new configuration file!");
            Linkme.config.options().copyDefaults();
            player.sendMessage("A new configuration file has been generated");
            }

        if (f2.exists() && !f2.isDirectory())
            {
            try
                {
                PluginManager pluginManager = plugin.getServer().getPluginManager();
                plugin.getConfig().load(filepath + "\\" + messagesfilename);
                pluginManager.disablePlugin(plugin);
                pluginManager.enablePlugin(plugin);
                plugin.getConfig().load(filepath + "\\" + messagesfilename);
                player.sendMessage("~Messages has been reloaded");
                }
            catch (IOException ex)
                {
                Logger.getLogger(Command_lmreload.class.getName()).log(Level.SEVERE, null, ex);
                }
            catch (InvalidConfigurationException ex)
                {
                Logger.getLogger(Command_lmreload.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        else
            {
            player.sendMessage("Messages.yml was unable to be reloaded - generating a new configuration file!");
            Linkme.messages.options().copyDefaults();
            player.sendMessage("A new configuration file has been generated");
            }
        return false;
        }
    }
