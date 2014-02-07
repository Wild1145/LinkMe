/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.Source.LinkMe;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

/**
 *
 * @author Kyle
 */
class SignListener implements Listener {
    public SignListener(Linkme aThis) {
    }
    @EventHandler
    public void Sign(SignChangeEvent event) {
        String line1 = event.getLine(0);
        String line2 = event.getLine(1);
    if (line1.equalsIgnoreCase("[LM]"))  {

        
        if (line2.equalsIgnoreCase("donator")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("facebook")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("forum")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("mumble")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
       
        if (line2.equalsIgnoreCase("rankup")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }

        if (line2.equalsIgnoreCase("site")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("ts")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("twitch")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("twitter")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("vent")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("voice")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("vote")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        }
        
        if (line2.equalsIgnoreCase("youtube")){
        Player player = event.getPlayer();
        event.setLine(0, ChatColor.AQUA + line1);
        player.sendMessage(ChatColor.GOLD + "New Sign Created");
        } 
    }                 
  } 
}