package Me.RyanWild.Kyled1986.LinkMe.Commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.staffrank3")
public class Command_staffrank3 extends BukkitCommand
{
    
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
         if (Strings.StaffInfo3Enable.equalsIgnoreCase("true")){
            player.sendMessage(Strings.StaffInfo3Title + "" + Strings.StaffInfo3Name);
            player.sendMessage(Strings.StaffInfo3Facebook);
            player.sendMessage(Strings.StaffInfo3Twitter);
        } else {
            player.sendMessage(Strings.MSG_NO_PERMS);
            }
        return false;
    }  
}
