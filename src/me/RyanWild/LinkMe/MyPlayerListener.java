/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.RyanWild.LinkMe;

import me.RyanWild.LinkMe.Commands.Strings;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Kyle - THIS IS A TEST TO MAKE SURE JENKINS BUILDS ON CHANGES
 */
class MyPlayerListener extends JavaPlugin implements Listener {
    
String Announcer = Linkme.config.getString("announcer");
String adonatordesc = LinkMe_Utils.replaceColors(Linkme.config.getString("Donator.info.description"));
String adonatorurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Donator.info.url"));
String afacebookdesc = LinkMe_Utils.replaceColors(Linkme.config.getString("Facebook.info.description"));
String afacebookurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Facebook.info.url"));
String aforumdesc = LinkMe_Utils.replaceColors(Linkme.config.getString("Forums.info.description"));
String aforumurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Forums.info.url"));
String AMumbledescription = LinkMe_Utils.replaceColors(Linkme.config.getString("Mumble.info.descriptionription"));
String AMumbleip = LinkMe_Utils.replaceColors(Linkme.config.getString("Mumble.info.url"));
String ARankdescription = LinkMe_Utils.replaceColors(Linkme.config.getString("RankingUp.info.descriptionription"));
String ATS33description = LinkMe_Utils.replaceColors(Linkme.config.getString("Teamspeak3.info.descriptionription"));
String ATS3ip = LinkMe_Utils.replaceColors(Linkme.config.getString("Teamspeak3.info.url"));
String ATwitchdescription = LinkMe_Utils.replaceColors(Linkme.config.getString("Twitch.info.descriptionription"));
String ATwitchurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Twitch.info.url"));
String ATwitterdescription = LinkMe_Utils.replaceColors(Linkme.config.getString("Twitter.info.descriptionription"));
String ATwitterurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Twitter.info.url")); 
String AVentdescription = LinkMe_Utils.replaceColors(Linkme.config.getString("Ventrillo.info.descriptionription"));
String AVentip = LinkMe_Utils.replaceColors(Linkme.config.getString("Ventrillo.info.url"));
String AVoicelist = LinkMe_Utils.replaceColors(Linkme.config.getString("Voicelist.info.description"));
String AVotedescription = LinkMe_Utils.replaceColors(Linkme.config.getString("Voting.info.descriptionription"));
String AVoteurl = LinkMe_Utils.replaceColors(Linkme.config.getString("vote"));
String AWebsitedescription = LinkMe_Utils.replaceColors(Linkme.config.getString("Website.info.descriptionription"));
String AWebsiteurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Website.info.url"));
String AYoutubedescription = LinkMe_Utils.replaceColors(Linkme.config.getString("Youtube.info.descriptionription"));
String AYoutubeurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Youtube.info.url"));

    public MyPlayerListener(Linkme aThis) {
    }
    
    @EventHandler
    public void interact(PlayerInteractEvent event) {
/*** TEST CODE DO NOT USE
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
                              if (Strings.Donatorstatus.equalsIgnoreCase("true")){
                                player.sendMessage(Announcer + "|| " +  adonatordesc + " " +adonatorurl);
                               } else {
                                 player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }         
                       }
                              else if(line1.contains("[LM]")&& line2.equalsIgnoreCase("facebook")) {
                              if (Strings.FacebookStatus.equalsIgnoreCase("true")){
                                player.sendMessage(Announcer + "|| " +  afacebookdesc + " " +afacebookurl);
                               } else {
                                 player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }         
                              }
                              else if(line1.contains("[LM]")&& line2.equalsIgnoreCase("forums")) {
                              if (Strings.ForumStatus.equalsIgnoreCase("true")){
                                player.sendMessage(Announcer + "|| " +  aforumdesc + " " +aforumurl);
                               } else {
                                 player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                              }
                              else if(line1.contains("[LM]")&& line2.equalsIgnoreCase("rankup")) {
                              if (Strings.RankupStatus.equalsIgnoreCase("true")){
                                player.sendMessage(Announcer + "|| " +  ARankdescription);
                               } else {
                                 player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                              }
                               else if(line1.contains("[LM]")&& line2.equalsIgnoreCase("site")) {
                              if (Strings.WebsiteStatus.equalsIgnoreCase("true")){
                                player.sendMessage(Announcer + "|| " +  AWebsitedescription + " " + AWebsiteurl);
                               } else {
                                 player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                              }        
                              
                              


 
 */
                   }
               }