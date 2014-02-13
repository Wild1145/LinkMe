package me.Source.LinkMe;

import me.Source.LinkMe.Commands.Strings;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

class MyPlayerListener extends JavaPlugin implements Listener {
String Announcer = Linkme.config.getString("announcer");
String adonatordesc = LinkMe_Utils.replaceColors(Strings.Donatordescription);
String afacebookdesc = LinkMe_Utils.replaceColors(Strings.Facebookdescription);
String aforumdesc = LinkMe_Utils.replaceColors(Strings.Forumdescription);
String AMumbledescription = LinkMe_Utils.replaceColors(Strings.Mumbledescription);
String ARankdescription = LinkMe_Utils.replaceColors(Strings.Rankdescription);
String ATS33description = LinkMe_Utils.replaceColors(Strings.TS33description);
String ATwitchdescription = LinkMe_Utils.replaceColors(Strings.Twitchdescription);
String ATwitterdescription = LinkMe_Utils.replaceColors(Strings.Twitchdescription);
String AVentdescription = LinkMe_Utils.replaceColors(Strings.Ventdescription);
String AWebsitedescription = LinkMe_Utils.replaceColors(Strings.Websitedescription);
String AYoutubedescription = LinkMe_Utils.replaceColors(Strings.Youtubedescription);
String adonatorurl = LinkMe_Utils.replaceColors(Strings.Donatorurl);
String afacebookurl = LinkMe_Utils.replaceColors(Strings.Facebookurl);
String aforumurl = LinkMe_Utils.replaceColors(Strings.Forumurl);
String AMumbleip = LinkMe_Utils.replaceColors(Strings.Mumbleip);
String ATS3ip = LinkMe_Utils.replaceColors(Strings.TS3ip);
String ATwitchurl = LinkMe_Utils.replaceColors(Strings.Twitchurl);
String ATwitterurl = LinkMe_Utils.replaceColors(Strings.Twitterurl); 
String AVentip = LinkMe_Utils.replaceColors(Strings.Ventip);
String AVoicelist = LinkMe_Utils.replaceColors(Strings.Voicelist);
String AYoutubeurl = LinkMe_Utils.replaceColors(Strings.Youtubeurl);
String AWebsiteurl = LinkMe_Utils.replaceColors(Strings.Websiteurl);

    public MyPlayerListener(Linkme aThis) {
    }
    
    @EventHandler
    public void interact(PlayerInteractEvent event) {
        if ((event.getPlayer() !=null) && (event.getAction() !=null) && (event.getClickedBlock() !=null)) {
               Player player = event.getPlayer();
               Action action = event.getAction();
               Material block = event.getClickedBlock().getType();
               if(action == Action.RIGHT_CLICK_BLOCK) {
                   if (block == Material.SIGN_POST || block == Material.WALL_SIGN) {
                       Sign sign = (Sign)event.getClickedBlock().getState();
                       String line1 = sign.getLine(0);
                       String line2 = sign.getLine(1);

                     if (player.hasPermission("linkme.sign.use"))  {
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("donator")) {
                         if (Strings.Donatorstatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  adonatordesc + " " + adonatorurl);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("facebook")) {
                         if (Strings.FacebookStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  afacebookdesc + " " + afacebookurl);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("forum")) {
                         if (Strings.ForumStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  aforumdesc + " " + aforumurl);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("mumble")) {
                         if (Strings.MumbleStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  AMumbledescription + "" + AMumbleip);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("rankup")) {
                         if (Strings.RankupStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  ARankdescription);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("site")) {
                         if (Strings.WebsiteStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  AWebsitedescription + " " + AWebsiteurl);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }  
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("ts")) {
                         if (Strings.TS3Status.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  ATS33description + " " + ATS3ip);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("twitch")) {
                         if (Strings.Twitchdescription.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  ATwitchdescription + " " + ATwitchurl);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("twtter")) {
                         if (Strings.TwitterStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  ATwitterdescription + " " + ATwitterurl);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("vent")) {
                         if (Strings.VentriloStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  AVentdescription + " " + AVentip);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }
                       }
                       } else {
                           player.sendMessage(Strings.MSG_NO_PERMS);
                       }
                       
                   }
               }
               }
        }
    }
}