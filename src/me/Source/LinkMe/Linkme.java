package me.Source.LinkMe;

/**
 * #TO ANYONE VIEWING THIS WITH A DECOMPILER#
 * If you are such a massive douche to try decompile the source for this project 
 * You really should go take some java lessons and learn how to do it, instead of
 * trying to rip of other peoples hard work, oh and don't try to submit it to Bukkit.
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.Source.LinkMe.Commands.Command_site;
import static me.Source.LinkMe.Commands.Strings.MSG_NO_PERMS;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.Metrics;

public class Linkme extends JavaPlugin
{
  public static final Logger logger = Bukkit.getLogger();
  public static BukkitCommandHandler handler;
  public static YamlConfig config;
  public static Linkme plugin;

  @Override
  public void onDisable()
  {
    Bukkit.broadcastMessage(config.getString("announcer") + ": LinkMe by Kyled1986 & Wild1145 has been Disabled! ");
    logger.info("LinkMe Disabled");
  }

  @Override
  public void onEnable()
  {
    plugin = this;
    handler = new BukkitCommandHandler(plugin);
    handler.setCommandLocation(Command_site.class.getPackage());
    handler.setPermissionMessage(MSG_NO_PERMS);
    config = new YamlConfig(plugin, "config.yml", true);
    config.load();
    PluginDescriptionFile pdfFile = getDescription();
    PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(new MyPlayerListener(this), this);
    pm.registerEvents(new SignListener(this), this);
    logger.log(Level.INFO, "{0} Version{1} Has Been Enabled", new Object[] { pdfFile.getName(), pdfFile.getVersion() });
    config.options().copyDefaults(true);
    saveConfig();
    try
    {
      Metrics metrics = new Metrics(this);
      metrics.start();
    }
    catch (IOException e)
    {
      logger.severe("[" + getDescription().getName() + "] Error Submitting stats!");
    }

    Bukkit.broadcastMessage(config.getString("announcer") + ": LinkMe Plugin by Wild1145 & Kyle1986 has been Enabled! ");
  }
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    return handler.handleCommand(sender, cmd, commandLabel, args);
  }
}