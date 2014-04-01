package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;


@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.lmreload")
public class Command_lmreload extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
        PluginManager pluginManager = plugin.getServer().getPluginManager();
        Player player = (Player) commandSender;
        Linkme.config.load();
        player.sendMessage("Link Me config has been reloaded!");
        pluginManager.disablePlugin(plugin);
        pluginManager.enablePlugin(plugin);
        Linkme.config.load();
        return false;
    }
}