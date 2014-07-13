package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Utils;
import Me.RyanWild.Kyled1986.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.set")
public class Command_set extends BukkitCommand {
    
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
        {
        Player player = (Player) commandSender;
        
        
        
        if (args[0].length() == 0) {
            player.sendMessage("1st argument no text");
        
        } else {
            
            /**** Donator Set ****/
            if (args[0].equalsIgnoreCase("donatorurl")) {
                Linkme.messages.set("Donator.info.url", args[1]);
                Linkme.messages.save();
                player.sendMessage("Donator Url set to" + " " + args[1]);
            } else if (args[0].equalsIgnoreCase("donatordescription")) {
                Linkme.messages.set("Donator.info.description", args[1]);
                Linkme.messages.save();
                player.sendMessage("Donator Description set to" + " " + args[1]);
            }
                
                
            /**** Facebook Set ****/ 
            if (args[0].equalsIgnoreCase("facebookurl")) {
                Linkme.messages.set("Facebook.info.url", args[1]);
                Linkme.messages.save();
                player.sendMessage("Facebook Url set to" + " " + args[1]);
            } else if (args[0].equalsIgnoreCase("facebookdescription")) {
                Linkme.messages.set("Facebook.info.url", args[1]);
                Linkme.messages.save();
                player.sendMessage("Facebook Description set to" + " " + args[1]); 
            }
            
            /**** Forums Set ****/
            if (args[0].equalsIgnoreCase("forumsurl")) {
                Linkme.messages.set("Forums.info.url", args[1]);
                Linkme.messages.save();
                player.sendMessage("Forums Url set to" + " " + args[1]);
            } else if (args[0].equalsIgnoreCase("forumsdescription")) {
                Linkme.messages.set("Forums.info.url", args[1]);
                Linkme.messages.save();
                player.sendMessage("Forums Description set to" + " " + args[1]); 
            }
  
            /**** Mumble Set ****/
            if (args[0].equalsIgnoreCase("mumbleip")) {
                Linkme.messages.set("Mumble.info.ip", args[1]);
                Linkme.messages.save();
                player.sendMessage("Mumble IP set to" + " " + args[1]);
            } else if (args[0].equalsIgnoreCase("mumbledescription")) {
                Linkme.messages.set("Mumble.info.description", args[1]);
                Linkme.messages.save();
                player.sendMessage("Mumble Description set to" + " " + args[1]); 
            }
    
            /**** RankingUp Set ****/
            if (args[0].equalsIgnoreCase("rankupdescription")) {
                Linkme.messages.set("RankingUp.info.ip", args[1]);
                Linkme.messages.save();
                player.sendMessage("Ranking up description set to" + " " + args[1]);
            }  
                
            /**** Teamspeak Set ****/
            if (args[0].equalsIgnoreCase("ts3ip")) {
                Linkme.messages.set("Teamspeak3.info.ip", args[1]);
                Linkme.messages.save();
                player.sendMessage("Teamspeak 3 IP set to" + " " + args[1]);
            } else if (args[0].equalsIgnoreCase("ts3description")) {
                Linkme.messages.set("Teamspeak3.info.description", args[1]);
                Linkme.messages.save();
                player.sendMessage("Teamspeak 3 Description set to" + " " + args[1]); 
            }
                
            /**** Ventrillo Set ****/
            if (args[0].equalsIgnoreCase("ventip")) {
                Linkme.messages.set("Ventrillo.info.ip", args[1]);
                Linkme.messages.save();
                player.sendMessage("Ventrillo IP set to" + " " + args[1]);
            } else if (args[0].equalsIgnoreCase("ventdescription")) {
                Linkme.messages.set("Ventrillo.info.description", args[1]);
                Linkme.messages.save();
                player.sendMessage("Ventrillo Description set to" + " " + args[1]); 
            }
                
                
                
                
                
                
                
                
            } else {
                if(args[1].length() == 0) {
                    player.sendMessage("2nd argument no text");

                    
                    
                    
                    
                    
                    
        } else {
          
            player.sendMessage(Strings.MSG_NO_PERMS);
                }
            }
        }  
        return false;
        }
}
        