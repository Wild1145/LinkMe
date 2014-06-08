package Me.RyanWild.Kyled1986.LinkMe.Listeners;

import Me.RyanWild.Kyled1986.LinkMe.Linkme;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignListener implements Listener
    {

    public SignListener(Linkme aThis)
        {
        }

    @EventHandler
    public void Sign(SignChangeEvent event)
        {
        String line1 = event.getLine(0);
        String line2 = event.getLine(1);
        Player player1 = event.getPlayer();

        if (player1.hasPermission("linkme.sign.place"))
            {
            if (line1.equalsIgnoreCase("[LM]"))
                {
                if (line2.equalsIgnoreCase("donator"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("facebook"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("forum"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("mumble"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("rankup"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("site"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("ts"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("twitch"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("twitter"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("vent"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                if (line2.equalsIgnoreCase("youtube"))
                    {
                    Player player = event.getPlayer();
                    event.setLine(0, ChatColor.AQUA + line1);
                    player.sendMessage(ChatColor.GOLD + "New Sign Created");
                    }
                }
            }
        else
            {
            player1.sendMessage("You do not have permission to use this!");
            }
        }
    }
