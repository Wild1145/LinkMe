/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.RyanWild.LinkMe;

import me.RyanWild.LinkMe.Commands.Strings;
import org.bukkit.ChatColor;
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
String adonatorurl = LinkMe_Utils.replaceColors(Strings.Donatorurl);
String afacebookdesc = LinkMe_Utils.replaceColors(Strings.Facebookdescription);
String afacebookurl = LinkMe_Utils.replaceColors(Strings.Facebookurl);
String aforumdesc = LinkMe_Utils.replaceColors(Strings.Forumdescription);
String aforumurl = LinkMe_Utils.replaceColors(Strings.Forumurl);
String AMumbledescription = LinkMe_Utils.replaceColors(Strings.Mumbledescription);
String AMumbleip = LinkMe_Utils.replaceColors(Strings.Mumbleip);
String ARankdescription = LinkMe_Utils.replaceColors(Strings.Rankdescription);
String ATS33description = LinkMe_Utils.replaceColors(Strings.TS33description);
String ATS3ip = LinkMe_Utils.replaceColors(Strings.TS3ip);
String ATwitchdescription = LinkMe_Utils.replaceColors(Strings.Twitchdescription);
String ATwitchurl = LinkMe_Utils.replaceColors(Strings.Twitchurl);
String ATwitterdescription = LinkMe_Utils.replaceColors(Strings.Twitchdescription);
String ATwitterurl = LinkMe_Utils.replaceColors(Strings.Twitterurl); 
String AVentdescription = LinkMe_Utils.replaceColors(Strings.Ventdescription);
String AVentip = LinkMe_Utils.replaceColors(Strings.Ventip);
String AVoicelist = LinkMe_Utils.replaceColors(Strings.Voicelist);
String AVotedescription = LinkMe_Utils.replaceColors(Strings.Votedescription);
String AVoteurl = LinkMe_Utils.replaceColors(Strings.Voteurl);
String AWebsitedescription = LinkMe_Utils.replaceColors(Strings.Websitedescription);
String AWebsiteurl = LinkMe_Utils.replaceColors(Strings.Websiteurl);
String AYoutubedescription = LinkMe_Utils.replaceColors(Strings.Youtubedescription);
String AYoutubeurl = LinkMe_Utils.replaceColors(Strings.Youtubeurl);

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
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("vote")) {
                         if (Strings.VoteStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  AVotedescription + " " + AVotedescription);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }  
                       }
                       if(line1.contains("[LM]")&& line2.equalsIgnoreCase("youtube")) {
                         if (Strings.YoutubeStatus.equalsIgnoreCase("true")) {
                         player.sendMessage(Announcer + "|| " +  AYoutubedescription + " " + AYoutubeurl);
                         } else {
                         player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                         }  
                       }
                   }
               }
        }
    }
}