/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Utils;
import Me.RyanWild.Kyled1986.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.vote")
public class Command_vote extends BukkitCommand
{
    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
    {
    Player player = (Player) commandSender;
    
    
    if (args[0].length() <1) {
        player.sendMessage("You must specify a vote link | /vote 1-10");
    } else {
        if (args[0].equals("1")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink01.description") + ": " + Linkme.messages.getString("Vote.VoteLink01.url")));}
        else if (args[0].equalsIgnoreCase("2")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink02.description") + ": " + Linkme.messages.getString("Vote.VoteLink02.url")));}
        else if (args[0].equalsIgnoreCase("3")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink03.description") + ": " + Linkme.messages.getString("Vote.VoteLink03.url")));}
        else if (args[0].equalsIgnoreCase("4")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink04.description") + ": " + Linkme.messages.getString("Vote.VoteLink04.url")));}
        else if (args[0].equalsIgnoreCase("5")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink05.description") + ": " + Linkme.messages.getString("Vote.VoteLink05.url")));}
        else if (args[0].equalsIgnoreCase("6")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink06.description") + ": " + Linkme.messages.getString("Vote.VoteLink06.url")));}
        else if (args[0].equalsIgnoreCase("7")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink07.description") + ": " + Linkme.messages.getString("Vote.VoteLink07.url")));}
        else if (args[0].equalsIgnoreCase("8")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink08.description") + ": " + Linkme.messages.getString("Vote.VoteLink08.url")));}
        else if (args[0].equalsIgnoreCase("9")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink09.description") + ": " + Linkme.messages.getString("Vote.VoteLink09.url")));}
        else if (args[0].equalsIgnoreCase("10")) {player.sendMessage(LinkMe_Utils.replaceColors(Linkme.config.getString("announcer") + ": " + Linkme.messages.getString("Vote.VoteLink10.description") + ": " + Linkme.messages.getString("Vote.VoteLink10.url")));
    } else {
            player.sendMessage(Strings.MSG_NO_PERMS);
                }
    }
        return false;
    }
}