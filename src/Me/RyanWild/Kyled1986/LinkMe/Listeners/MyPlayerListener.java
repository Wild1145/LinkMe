package Me.RyanWild.Kyled1986.LinkMe.Listeners;

import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Strings;
import Me.RyanWild.Kyled1986.LinkMe.LinkMe_Utils;
import Me.RyanWild.Kyled1986.LinkMe.Linkme;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MyPlayerListener implements Listener
    {

    String Announcer = Linkme.config.getString("announcer");
    String Adonatordesc = LinkMe_Utils.replaceColors(LinkMe_Strings.Donatordescription);
    String Afacebookdesc = LinkMe_Utils.replaceColors(LinkMe_Strings.Facebookdescription);
    String Aforumdesc = LinkMe_Utils.replaceColors(LinkMe_Strings.Forumdescription);
    String AMumbledescription = LinkMe_Utils.replaceColors(LinkMe_Strings.Mumbledescription);
    String ARankdescription = LinkMe_Utils.replaceColors(LinkMe_Strings.Rankdescription);
    String ATS33description = LinkMe_Utils.replaceColors(LinkMe_Strings.TS33description);
    String ATwitchdescription = LinkMe_Utils.replaceColors(LinkMe_Strings.Twitchdescription);
    String ATwitterdescription = LinkMe_Utils.replaceColors(LinkMe_Strings.Twitchdescription);
    String AVentdescription = LinkMe_Utils.replaceColors(LinkMe_Strings.Ventdescription);
    String AWebsitedescription = LinkMe_Utils.replaceColors(LinkMe_Strings.Websitedescription);
    String AYoutubedescription = LinkMe_Utils.replaceColors(LinkMe_Strings.Youtubedescription);
    String adonatorurl = LinkMe_Utils.replaceColors(LinkMe_Strings.Donatorurl);
    String afacebookurl = LinkMe_Utils.replaceColors(LinkMe_Strings.Facebookurl);
    String aforumurl = LinkMe_Utils.replaceColors(LinkMe_Strings.Forumurl);
    String AMumbleip = LinkMe_Utils.replaceColors(LinkMe_Strings.Mumbleip);
    String ATS3ip = LinkMe_Utils.replaceColors(LinkMe_Strings.TS3ip);
    String ATwitchurl = LinkMe_Utils.replaceColors(LinkMe_Strings.Twitchurl);
    String ATwitterurl = LinkMe_Utils.replaceColors(LinkMe_Strings.Twitterurl);
    String AVentip = LinkMe_Utils.replaceColors(LinkMe_Strings.Ventip);
    String AVoicelist = LinkMe_Utils.replaceColors(LinkMe_Strings.Voicelist);
    String AYoutubeurl = LinkMe_Utils.replaceColors(LinkMe_Strings.Youtubeurl);
    String AWebsiteurl = LinkMe_Utils.replaceColors(LinkMe_Strings.Websiteurl);

    public MyPlayerListener(Linkme aThis)
        {
        }

    @EventHandler
    public void interact(PlayerInteractEvent event)
        {
        if ((event.getPlayer() != null) && (event.getAction() != null) && (event.getClickedBlock() != null))
            {
            Player player = event.getPlayer();
            Action action = event.getAction();
            Material block = event.getClickedBlock().getType();
            if (action == Action.RIGHT_CLICK_BLOCK)
                {
                if (block == Material.SIGN_POST || block == Material.WALL_SIGN)
                    {
                    Sign sign = (Sign) event.getClickedBlock().getState();
                    String line1 = sign.getLine(0);
                    String line2 = sign.getLine(1);
                    if (player.hasPermission("linkme.sign.use"))
                        {
                        if (line1.contains("[LM]") && line2.equalsIgnoreCase("donator"))
                            {
                            if (LinkMe_Strings.Donatorstatus.equalsIgnoreCase("true"))
                                {
                                player.sendMessage(Announcer + "|| " + Adonatordesc + " " + adonatorurl);
                                }
                            else
                                {
                                player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                }
                            }
                        if (line1.contains("[LM]") && line2.equalsIgnoreCase("facebook"))
                            {
                            if (LinkMe_Strings.FacebookStatus.equalsIgnoreCase("true"))
                                {
                                player.sendMessage(Announcer + "|| " + Afacebookdesc + " " + afacebookurl);
                                }
                            else
                                {
                                player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);

                                }
                            if (line1.contains("[LM]") && line2.equalsIgnoreCase("forum"))
                                {
                                if (LinkMe_Strings.ForumStatus.equalsIgnoreCase("true"))
                                    {
                                    player.sendMessage(Announcer + "|| " + Aforumdesc + " " + aforumurl);
                                    }
                                else
                                    {
                                    player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                    }
                                }
                            if (line1.contains("[LM]") && line2.equalsIgnoreCase("mumble"))
                                {
                                if (LinkMe_Strings.MumbleStatus.equalsIgnoreCase("true"))
                                    {
                                    player.sendMessage(Announcer + "|| " + AMumbledescription + "" + AMumbleip);
                                    }
                                else
                                    {
                                    player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                    }
                                }
                            if (line1.contains("[LM]") && line2.equalsIgnoreCase("rankup"))
                                {
                                if (LinkMe_Strings.RankupStatus.equalsIgnoreCase("true"))
                                    {
                                    player.sendMessage(Announcer + "|| " + ARankdescription);
                                    }
                                else
                                    {
                                    player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                    }
                                }
                            if (line1.contains("[LM]") && line2.equalsIgnoreCase("site"))
                                {
                                if (LinkMe_Strings.WebsiteStatus.equalsIgnoreCase("true"))
                                    {
                                    player.sendMessage(Announcer + "|| " + AWebsitedescription + " " + AWebsiteurl);
                                    }
                                else
                                    {
                                    player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                    }
                                }
                            if (line1.contains("[LM]") && line2.equalsIgnoreCase("ts"))
                                {
                                if (LinkMe_Strings.TS3Status.equalsIgnoreCase("true"))
                                    {
                                    player.sendMessage(Announcer + "|| " + ATS33description + " " + ATS3ip);
                                    }
                                else
                                    {
                                    player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                    }
                                }
                            if (line1.contains("[LM]") && line2.equalsIgnoreCase("twitch"))
                                {
                                if (LinkMe_Strings.Twitchdescription.equalsIgnoreCase("true"))
                                    {
                                    player.sendMessage(Announcer + "|| " + ATwitchdescription + " " + ATwitchurl);
                                    }
                                else
                                    {
                                    player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                    }
                                }
                            if (line1.contains("[LM]") && line2.equalsIgnoreCase("twtter"))
                                {
                                if (LinkMe_Strings.TwitterStatus.equalsIgnoreCase("true"))
                                    {
                                    player.sendMessage(Announcer + "|| " + ATwitterdescription + " " + ATwitterurl);
                                    }
                                else
                                    {
                                    player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                    }
                                }
                            if (line1.contains("[LM]") && line2.equalsIgnoreCase("vent"))
                                {
                                if (LinkMe_Strings.VentriloStatus.equalsIgnoreCase("true"))
                                    {
                                    player.sendMessage(Announcer + "|| " + AVentdescription + " " + AVentip);
                                    }
                                else
                                    {
                                    player.sendMessage(LinkMe_Strings.MSG_NO_PERMS);
                                    }
                                }
                            }
                        else
                            {
                            }
                        }
                    }
                }
            }
        }
    }
