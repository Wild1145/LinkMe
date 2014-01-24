package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.site")
public class Command_site extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
        Player player = (Player) commandSender;
        String announcer = Linkme.config.getString("announcer");
        String announcer1 = Utils_Colour.replaceColors(announcer);
        String sitetext = Linkme.config.getString("sitetext");
        String sitetext1 = Utils_Colour.replaceColors(sitetext);
        String site = Linkme.config.getString("site");
        String site1 = Utils_Colour.replaceColors(site);
        player.sendMessage(announcer1 + ": " + sitetext1 + " "+ site1);
        return false;
    }
}
