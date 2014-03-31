package com.SuperiorNetworks.Projects.LinkMe.Commands;

import com.SuperiorNetworks.Projects.LinkMe.LinkMe_Utils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.btwitch")
public class Command_btwitch extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
         if (Strings.TwitchStatus.equalsIgnoreCase("true")){
            Bukkit.broadcastMessage(LinkMe_Utils.replaceColors(Strings.Announcer) + ": " + LinkMe_Utils.replaceColors(Strings.Twitchdescription)+ ": " + LinkMe_Utils.replaceColors(Strings.Twitchurl));
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}