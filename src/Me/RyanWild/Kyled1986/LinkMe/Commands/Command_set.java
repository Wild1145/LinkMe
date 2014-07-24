package Me.RyanWild.Kyled1986.LinkMe.Commands;

import Me.RyanWild.Kyled1986.LinkMe.Linkme;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "linkme.set")
public class Command_set extends BukkitCommand {

    @Override
    public boolean run(CommandSender commandSender, Command command, String commandLabel, String[] args) {
        Player player = (Player) commandSender;

            if (args[0].equalsIgnoreCase("set")) {
                
                
                if (!args[2].equalsIgnoreCase("donatordescription")) if (args[1].equalsIgnoreCase("donatordescription")) {
                    Linkme.messages.set("Donator.info.description", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Donator Description set to" + " " + args[1]);
                    
                    
                if (!args[2].equalsIgnoreCase("donatorurl")) if (args[1].equalsIgnoreCase("donatordescription")) {
                    Linkme.messages.set("Donator.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Donator Url set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("facebookurl")) {
                    Linkme.messages.set("Facebook.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Facebook Url set to" + " " + args[1]);
                }
                if (args[0].equalsIgnoreCase("facebookdescription")) {
                    Linkme.messages.set("Facebook.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Facebook Description set to" + " " + args[1]);
                }

                if (args[0].equalsIgnoreCase("forumsurl")) {
                    Linkme.messages.set("Forums.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Forums Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("forumsdescription")) {
                    Linkme.messages.set("Forums.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Forums Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("mumbleip")) {
                    Linkme.messages.set("Mumble.info.ip", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Mumble IP set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("mumbledescription")) {
                    Linkme.messages.set("Mumble.info.description", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Mumble Description set to" + " " + args[1]);
                }

                if (args[0].equalsIgnoreCase("rankupdescription")) {
                    Linkme.messages.set("RankingUp.info.ip", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Ranking up description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("ts3ip")) {
                    Linkme.messages.set("Teamspeak3.info.ip", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Teamspeak 3 IP set to" + " " + args[1]);
                }
                if (args[0].equalsIgnoreCase("ts3description")) {
                    Linkme.messages.set("Teamspeak3.info.description", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Teamspeak 3 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("twitchurl")) {
                    Linkme.messages.set("Twitch.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Twitch Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("twitchdescription")) {
                    Linkme.messages.set("Twitch.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Twitch Description set to" + " " + args[1]);
                }

                if (args[0].equalsIgnoreCase("twitterurl")) {
                    Linkme.messages.set("twitter.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Twitter Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("twitterdescription")) {
                    Linkme.messages.set("twitter.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Twitter Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("ventip")) {
                    Linkme.messages.set("Ventrillo.info.ip", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Ventrillo IP set to" + " " + args[1]);
                }
                if (args[0].equalsIgnoreCase("ventdescription")) {
                    Linkme.messages.set("Ventrillo.info.description", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Ventrillo Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink01url")) {
                    Linkme.messages.set("VoteLink01.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink01 Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("VoteLink01description")) {
                    Linkme.messages.set("VoteLink01.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink01 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink02url")) {
                    Linkme.messages.set("VoteLink02.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink02 Url set to" + " " + args[1]);
                }
                if (args[0].equalsIgnoreCase("VoteLink02description")) {
                    Linkme.messages.set("VoteLink02.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink02 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink03url")) {
                    Linkme.messages.set("VoteLink03.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink03 Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("VoteLink03description")) {
                    Linkme.messages.set("VoteLink03.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink03 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink04url")) {
                    Linkme.messages.set("VoteLink04.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink04 Url set to" + " " + args[1]);
                }
                if (args[0].equalsIgnoreCase("VoteLink04description")) {
                    Linkme.messages.set("VoteLink04.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink04 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink05url")) {
                    Linkme.messages.set("VoteLink05.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink05 Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("VoteLink05description")) {
                    Linkme.messages.set("VoteLink05.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink05 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink06url")) {
                    Linkme.messages.set("VoteLink06.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink06 Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("VoteLink06description")) {
                    Linkme.messages.set("VoteLink06.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink06 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink07url")) {
                    Linkme.messages.set("VoteLink07.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink07 Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("VoteLink07description")) {
                    Linkme.messages.set("VoteLink07.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink07 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink08url")) {
                    Linkme.messages.set("VoteLink08.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink08 Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("VoteLink08description")) {
                    Linkme.messages.set("VoteLink08.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink08 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink09url")) {
                    Linkme.messages.set("VoteLink09.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink09 Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("VoteLink09description")) {
                    Linkme.messages.set("VoteLink09.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink09 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("VoteLink10url")) {
                    Linkme.messages.set("VoteLink10.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink10 Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("VoteLink10description")) {
                    Linkme.messages.set("VoteLink10.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("VoteLink10 Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("Websiteurl")) {
                    Linkme.messages.set("Website.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Website Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("Websitedescription")) {
                    Linkme.messages.set("Website.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Website Description set to" + " " + args[1]);
                }

                if (args[2].equalsIgnoreCase("Youtubeurl")) {
                    Linkme.messages.set("Youtube.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Youtube Url set to" + " " + args[1]);
                }
                if (args[2].equalsIgnoreCase("Youtubedescription")) {
                    Linkme.messages.set("Youtube.info.url", args[1]);
                    Linkme.messages.save();
                    player.sendMessage("Youtube Description set to" + " " + args[1]);
                }


            } else {
                player.sendMessage(Strings.MSG_NO_PERMS);
        }
            }
        return false;
    }
}
