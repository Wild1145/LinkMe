package me.Source.LinkMe.Commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.staffrank2")
public class Command_staffrank2 extends BukkitCommand
{
    
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
         if (Strings.StaffInfo2Enable.equalsIgnoreCase("true")){
            player.sendMessage(Strings.StaffInfo2Title + "" + Strings.StaffInfo2Name);
            player.sendMessage(Strings.StaffInfo2Facebook);
            player.sendMessage(Strings.StaffInfo2Twitter);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    
    
    
    
    
    
    
    
    
    
    }  
}
