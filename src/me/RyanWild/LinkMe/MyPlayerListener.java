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