package me.Source.LinkMe.Commands;

import me.Source.LinkMe.LinkMe_Utils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.site")
public class Command_site extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
         if (Strings.WebsiteStatus.equalsIgnoreCase("true")){
            player.sendMessage(LinkMe_Utils.replaceColors(Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(Strings.Websitedescription) + ": " + LinkMe_Utils.replaceColors(Strings.Websiteurl));
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}
