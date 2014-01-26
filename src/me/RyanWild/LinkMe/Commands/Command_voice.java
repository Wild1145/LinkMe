package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.LinkMe_Utils;
import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.voice")
public class Command_voice extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
        String announcer = Linkme.config.getString("announcer");
        String announcer1 = LinkMe_Utils.replaceColors(announcer);
        String voiceserverlist = Linkme.config.getString("Voicelist.info.description");
        String voiceserverlist1 = LinkMe_Utils.replaceColors(voiceserverlist);
        String Mumbledesc = Linkme.config.getString("Mumble.info.description");
        String Mumbledesc1 = LinkMe_Utils.replaceColors(Mumbledesc);
        String Mumbleip = Linkme.config.getString("Mumble.info.url");
        String Mumbleip1 = LinkMe_Utils.replaceColors(Mumbleip);
        String MumbleStatus = Linkme.config.getString("Mumble.info.enabled");
        String Ventrillodesc = Linkme.config.getString("Ventrillo.info.description");
        String Ventrillodesc1 = LinkMe_Utils.replaceColors(Ventrillodesc);
        String Ventrilloip = Linkme.config.getString("Ventrillo.info.url");
        String Ventrilloip1 = LinkMe_Utils.replaceColors(Ventrilloip);
        String VentStatus = Linkme.config.getString("Ventrillo.info.enabled");
        String ts3desc = Linkme.config.getString("Teamspeak3.info.description");
        String ts3desc1 = LinkMe_Utils.replaceColors(ts3desc);
        String ts3ip = Linkme.config.getString("Teamspeak3.info.url");
        String ts3ip1 = LinkMe_Utils.replaceColors(ts3ip);
        String ts3Status = Linkme.config.getString("Teamspeak3.info.enabled"); 
        Player player = (Player) commandSender;
        player.sendMessage(announcer1 + ": " + voiceserverlist1);
         if (MumbleStatus.equalsIgnoreCase("true")){
            player.sendMessage(announcer1 + ": " + Mumbledesc1 + " "+ Mumbleip1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
         if (VentStatus.equalsIgnoreCase("true")){
            player.sendMessage(announcer1 + ": " + Ventrillodesc1 + " "+ Ventrilloip1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
         if (ts3Status.equalsIgnoreCase("true")){
            player.sendMessage(announcer1 + ": " + ts3desc1 + " "+ ts3ip1);
        } else {
            player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
        return false;
    }
}