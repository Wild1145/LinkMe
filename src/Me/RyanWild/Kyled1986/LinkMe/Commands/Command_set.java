package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.set")
public class Command_set extends BukkitCommand
    {

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args)
        {

        if (args.length == 0)
            {
            return false;
            }

        String newthing = null;
        if (args.length >= 2)
            {
            newthing = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
            }

        Player player = (Player) commandSender;

        if (args[1].equalsIgnoreCase("donatordescription"))
            {
            Linkme.messages.set("Donator.info.description", newthing);
            Linkme.messages.save();
            player.sendMessage("Donator Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("donatorurl"))
            {
            Linkme.messages.set("Donator.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Donator Url set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("facebookurl"))
            {
            Linkme.messages.set("Facebook.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Facebook Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("facebookdescription"))
            {
            Linkme.messages.set("Facebook.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Facebook Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("forumsurl"))
            {
            Linkme.messages.set("Forums.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Forums Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("forumsdescription"))
            {
            Linkme.messages.set("Forums.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Forums Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("mumbleip"))
            {
            Linkme.messages.set("Mumble.info.ip", newthing);
            Linkme.messages.save();
            player.sendMessage("Mumble IP set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("mumbledescription"))
            {
            Linkme.messages.set("Mumble.info.description", newthing);
            Linkme.messages.save();
            player.sendMessage("Mumble Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("rankupdescription"))
            {
            Linkme.messages.set("RankingUp.info.ip", newthing);
            Linkme.messages.save();
            player.sendMessage("Ranking up description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("ts3ip"))
            {
            Linkme.messages.set("Teamspeak3.info.ip", newthing);
            Linkme.messages.save();
            player.sendMessage("Teamspeak 3 IP set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("ts3description"))
            {
            Linkme.messages.set("Teamspeak3.info.description", newthing);
            Linkme.messages.save();
            player.sendMessage("Teamspeak 3 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("twitchurl"))
            {
            Linkme.messages.set("Twitch.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Twitch Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("twitchdescription"))
            {
            Linkme.messages.set("Twitch.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Twitch Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("twitterurl"))
            {
            Linkme.messages.set("twitter.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Twitter Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("twitterdescription"))
            {
            Linkme.messages.set("twitter.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Twitter Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("ventip"))
            {
            Linkme.messages.set("Ventrillo.info.ip", newthing);
            Linkme.messages.save();
            player.sendMessage("Ventrillo IP set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("ventdescription"))
            {
            Linkme.messages.set("Ventrillo.info.description", newthing);
            Linkme.messages.save();
            player.sendMessage("Ventrillo Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink01url"))
            {
            Linkme.messages.set("VoteLink01.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink01 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink01description"))
            {
            Linkme.messages.set("VoteLink01.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink01 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink02url"))
            {
            Linkme.messages.set("VoteLink02.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink02 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink02description"))
            {
            Linkme.messages.set("VoteLink02.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink02 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink03url"))
            {
            Linkme.messages.set("VoteLink03.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink03 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink03description"))
            {
            Linkme.messages.set("VoteLink03.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink03 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink04url"))
            {
            Linkme.messages.set("VoteLink04.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink04 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink04description"))
            {
            Linkme.messages.set("VoteLink04.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink04 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink05url"))
            {
            Linkme.messages.set("VoteLink05.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink05 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink05description"))
            {
            Linkme.messages.set("VoteLink05.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink05 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink06url"))
            {
            Linkme.messages.set("VoteLink06.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink06 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink06description"))
            {
            Linkme.messages.set("VoteLink06.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink06 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink07url"))
            {
            Linkme.messages.set("VoteLink07.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink07 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink07description"))
            {
            Linkme.messages.set("VoteLink07.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink07 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink08url"))
            {
            Linkme.messages.set("VoteLink08.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink08 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink08description"))
            {
            Linkme.messages.set("VoteLink08.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink08 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink09url"))
            {
            Linkme.messages.set("VoteLink09.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink09 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink09description"))
            {
            Linkme.messages.set("VoteLink09.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink09 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("VoteLink10url"))
            {
            Linkme.messages.set("VoteLink10.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink10 Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("VoteLink10description"))
            {
            Linkme.messages.set("VoteLink10.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("VoteLink10 Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("Websiteurl"))
            {
            Linkme.messages.set("Website.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Website Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("Websitedescription"))
            {
            Linkme.messages.set("Website.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Website Description set to" + " " + newthing);
            }

        if (args[1].equalsIgnoreCase("Youtubeurl"))
            {
            Linkme.messages.set("Youtube.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Youtube Url set to" + " " + newthing);
            }
        if (args[1].equalsIgnoreCase("Youtubedescription"))
            {
            Linkme.messages.set("Youtube.info.url", newthing);
            Linkme.messages.save();
            player.sendMessage("Youtube Description set to" + " " + newthing);
            }

        return true;
        }
    }
