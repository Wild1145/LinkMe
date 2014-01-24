package me.RyanWild.LinkMe.Commands;

import me.RyanWild.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
@CommandPermissions(source = SourceType.PLAYER, usage = "Usage: /<command>", permission = "linkme.mum")
public class Command_mum extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    String announcer = Linkme.config.getString("announcer");
    String announcer1 = Utils_Colour.replaceColors(announcer);
    String mumbledesc = Linkme.config.getString("mumbledesc");
    String mumbledesc1 = Utils_Colour.replaceColors(mumbledesc);
    String mumbleip = Linkme.config.getString("mumbleip");
    String mumbleip1 = Utils_Colour.replaceColors(mumbleip);
    player.sendMessage(announcer1 + ": " + mumbledesc1 + " "+ mumbleip1);
        return false;
    }
}