/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.RyanWild.LinkMe;

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
 * @author Kyle
 */
class MyPlayerListener extends JavaPlugin implements Listener {

    public MyPlayerListener(Linkme aThis) {
    }
    
    @EventHandler
    public void interact(PlayerInteractEvent event) {
/**
                String announcer = Linkme.config.getString("announcer");
                String announcer1 = LinkMe_Utils.replaceColors(announcer);
                String donatordesc = Linkme.config.getString("Donator.info.description");
                String donatordesc1 = LinkMe_Utils.replaceColors(donatordesc);
                String donatorurl = Linkme.config.getString("Donator.info.url");
                String donatorurl1 = LinkMe_Utils.replaceColors(donatorurl);
                String DonatorStatus = Linkme.config.getString("Donator.info.enabled");
                String facebookdesc = Linkme.config.getString("Facebook.info.description");
                String facebookdesc1 = LinkMe_Utils.replaceColors(facebookdesc);
                String facebookurl = Linkme.config.getString("Facebook.info.url");
                String facebookurl1 = LinkMe_Utils.replaceColors(facebookurl);
                String FBStatus = Linkme.config.getString("Facebook.info.enabled");
                String forumdesc = Linkme.config.getString("Forums.info.description");
                String forumdesc1 = LinkMe_Utils.replaceColors(forumdesc);
                String forumurl = Linkme.config.getString("Forums.info.url");
                String forumurl1 = LinkMe_Utils.replaceColors(forumurl);
                String FOStatus = Linkme.config.getString("Forums.info.enabled");
                String Mumbledesc = Linkme.config.getString("Mumble.info.description");
                String Mumbledesc1 = LinkMe_Utils.replaceColors(Mumbledesc);
                String Mumbleip = Linkme.config.getString("Mumble.info.url");
                String Mumbleip1 = LinkMe_Utils.replaceColors(Mumbleip);
                String MUStatus = Linkme.config.getString("Mumble.info.enabled");
                String rankdesc = Linkme.config.getString("RankingUp.info.description");
                String rankdesc1 = LinkMe_Utils.replaceColors(rankdesc);
                String RUNStatus = Linkme.config.getString("RankingUp.info.enabled");
                String ts3desc = Linkme.config.getString("Teamspeak3.info.description");
                String ts3desc1 = LinkMe_Utils.replaceColors(ts3desc);
                String ts3ip = Linkme.config.getString("Teamspeak3.info.url");
                String ts3ip1 = LinkMe_Utils.replaceColors(ts3ip);
                String TS3Status = Linkme.config.getString("Teamspeak3.info.enabled");
                String twitchdesc = Linkme.config.getString("Twitch.info.description");
                String twitchdesc1 = LinkMe_Utils.replaceColors(twitchdesc);
                String twitchurl = Linkme.config.getString("Twitch.info.url");
                String twitchurl1 = LinkMe_Utils.replaceColors(twitchurl);
                String TWIStatus = Linkme.config.getString("Website.info.enabled");
                String twitterdesc = Linkme.config.getString("Twitter.info.description");
                String twitterdesc1 = LinkMe_Utils.replaceColors(twitterdesc);
                String twitterurl = Linkme.config.getString("Twitter.info.url");
                String twitterurl1 = LinkMe_Utils.replaceColors(twitterurl);
                String TWITStatus = Linkme.config.getString("Twitter.info.enabled");
                String VentStatus = Linkme.config.getString("Ventrillo.info.enabled");   
                String Ventdesc = Linkme.config.getString("Ventrillo.info.description");
                String Ventdesc1 = LinkMe_Utils.replaceColors(Ventdesc);
                String Ventip = Linkme.config.getString("Ventrillo.info.url");
                String Ventip1 = LinkMe_Utils.replaceColors(Ventip);
                String votedesc = Linkme.config.getString("Voting.info.description");
                String votedesc1 = LinkMe_Utils.replaceColors(votedesc);
                String voteurl = Linkme.config.getString("vote");
                String voteurl1 = LinkMe_Utils.replaceColors(voteurl);
                String voteStatus = Linkme.config.getString("Voting.info.enabled");
                String youtubedesc = Linkme.config.getString("Youtube.info.description");
                String youtubedesc1 = LinkMe_Utils.replaceColors(youtubedesc);
                String youtubeurl = Linkme.config.getString("Youtube.info.url");
                String youtubeurl1 = LinkMe_Utils.replaceColors(youtubeurl);
                String YTStatus = Linkme.config.getString("Youtube.info.enabled");
 */
        
        
                String announcer = Linkme.config.getString("announcer");
                String announcer1 = LinkMe_Utils.replaceColors(announcer);
                String donatordesc = Linkme.config.getString("Donator.info.description");
                String donatordesc1 = LinkMe_Utils.replaceColors(donatordesc);
                String donatorurl = Linkme.config.getString("Donator.info.url");
                String donatorurl1 = LinkMe_Utils.replaceColors(donatorurl);
                String DonatorStatus = Linkme.config.getString("Donator.info.enabled");
                String facebookdesc = Linkme.config.getString("Facebook.info.description");
                String facebookdesc1 = LinkMe_Utils.replaceColors(facebookdesc);
                String facebookurl = Linkme.config.getString("Facebook.info.url");
                String facebookurl1 = LinkMe_Utils.replaceColors(facebookurl);
                String FBStatus = Linkme.config.getString("Facebook.info.enabled");
                
                
        if ((event.getPlayer() !=null) && (event.getAction() !=null) && (event.getClickedBlock() !=null)) {
               Player player = event.getPlayer();
               Action action = event.getAction();
               Material block = event.getClickedBlock().getType();
               
               
               if(action == Action.RIGHT_CLICK_BLOCK) {
                   if (block == Material.SIGN_POST || block == Material.WALL_SIGN) {
                       Sign sign = (Sign)event.getClickedBlock().getState();
                       String line1 = sign.getLine(0);
                       String line2 = sign.getLine(1);
                       if(line1.contains("[LM]")&& line2.contains("donator")) {
                           player.sendMessage("donatorKBITCH!");
                       }
                       
                       else if(line1.contains("[LM]")&& line2.contains("FACEBOOK")) {
                           player.sendMessage("FACEBOOKBITCH!");
                       }
                   }return;
               }return;
    }
}
}
        
    
/**
                
        if ((event.getPlayer() !=null) && (event.getAction() !=null) && (event.getClickedBlock() !=null)) {
            Player player = event.getPlayer();
            Action action = event.getAction();
            Material block = event.getClickedBlock().getType();
            
            
            
            if  (action.equals(Action.RIGHT_CLICK_BLOCK)) {
                if (block == Material.SIGN_POST || block == Material.WALL_SIGN) {
                    Sign sign = (Sign) event.getClickedBlock().getState();
                    String line1 = sign.getLine(0);

                    
               if (line1.contains("[Donator]")) {
                if (DonatorStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + donatordesc1 + " "+ donatorurl1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
               else if (line1.contains("[Facebook]"))
                if (DonatorStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + facebookdesc1 + " "+ facebookurl1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
                }
               }
               else if (line1.contains("[Forums]")) {
                if (FOStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + forumdesc1 + " "+ forumurl1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }
               else if (line1.contains("[Mumble]")) {
                if (MUStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + Mumbledesc1 + " "+ Mumbleip1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }
               else if (line1.contains("[RankUp]")) {
                if (RUNStatus.equalsIgnoreCase("true")){
                    player.sendMessage(announcer1 + ": " + rankdesc1);
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }        
              else if (line1.contains("[Site]")) {
                if (FBStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + facebookdesc1 + " "+ facebookurl1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }         
              else if (line1.contains("[TS3]")) {
                if (TS3Status.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + ts3desc1 + " "+ ts3ip1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }
              else if (line1.contains("[Twitch]")) {
                if (TWIStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + twitchdesc1 + " "+ twitchurl1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }
              else if (line1.contains("[Twitter]")) {
                if (TWITStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + twitterdesc1 + " "+ twitterurl1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }
              else if (line1.contains("[Vent]")) {
                if (VentStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + Ventdesc1 + " "+ Ventip1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }     
              else if (line1.contains("[Voice]")) {
                if (FBStatus.equalsIgnoreCase("true")){
                    Bukkit.broadcastMessage(announcer1 + ": " + facebookdesc1 + " "+ facebookurl1); 
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                }  
              else if (line1.contains("[Vote]")) {
                if (voteStatus.equalsIgnoreCase("true")){
                    player.sendMessage(announcer1 + ": " + votedesc1 + " "+ voteurl1);
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
                } 
              else if (line1.contains("[Youtube]")) {
                if (YTStatus.equalsIgnoreCase("true")){
                    player.sendMessage(announcer1 + ": " + youtubedesc1 + " "+ youtubeurl1);
                    } else {
                    player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }
              }
                }
            }
        }
    }
}
 */