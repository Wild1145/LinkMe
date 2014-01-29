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
 * @author Kyle
 */
class MyPlayerListener extends JavaPlugin implements Listener {
    
String Announcer = Linkme.config.getString("announcer");
String adonatordesc = LinkMe_Utils.replaceColors(Linkme.config.getString("Donator.info.description"));
String adonatorurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Donator.info.url"));
String afacebookdesc = LinkMe_Utils.replaceColors(Linkme.config.getString("Facebook.info.description"));
String afacebookurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Facebook.info.url"));
String aforumdesc = LinkMe_Utils.replaceColors(Linkme.config.getString("Forums.info.description"));
String aforumurl = LinkMe_Utils.replaceColors(Linkme.config.getString("Forums.info.url"));


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
                       
                       
/*** THIS PEICE OF CODE IS AN ARSEHOLE - BITCH CUNT FUCK
                       if(line1.contains("[LM]")&& line2.contains("donator")) {
                              if (Strings.Donatorstatus.equalsIgnoreCase("true")){
                                player.sendMessage(Announcer + "|| " +  adonatordesc + " " +adonatorurl);
                               } else {
                                 player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }             
                              
                       if(line1.contains("[LM]")&& line2.contains("facebook")) {
                              if (Strings.FacebookStatus.equalsIgnoreCase("true")){
                                player.sendMessage(Announcer + "|| " +  afacebookdesc + " " +afacebookurl);
                               } else {
                                 player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            } 
                       if(line1.contains("[LM]")&& line2.contains("forum")) {
                              if (Strings.ForumStatus.equalsIgnoreCase("true")){
                                player.sendMessage(Announcer + "|| " +  aforumdesc + " " +aforumurl);
                               } else {
                                 player.sendMessage("Sorry this feature is not enabled please contact a member of staff.");
            }        

                       
                       
                   }return;
               }return;
 
 */
                   }
               }
        }
    }
}
