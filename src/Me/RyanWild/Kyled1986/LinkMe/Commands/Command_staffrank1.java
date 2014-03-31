package Me.RyanWild.Kyled1986.LinkMe.Commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.staffrank1")
public class Command_staffrank1 extends BukkitCommand
{
    
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
         if (Strings.StaffInfo1Enable.equalsIgnoreCase("true")){
            player.sendMessage(Strings.StaffInfo1Title + "" + Strings.StaffInfo1Name);
            player.sendMessage(Strings.StaffInfo1Facebook);
            player.sendMessage(Strings.StaffInfo1Twitter);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    
    
    
    
    
    
    
    
    
    
    }  
}
