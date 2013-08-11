package me.RyanWild.LinkMe;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.bukkit.plugin.PluginDescriptionFile;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Update
{

    Linkme plugin;

    public Update(Linkme plugin)
    {
        this.plugin = plugin;
    }

    public boolean isLatest()
    {
        this.plugin.getLogger().info("Checking for newer versions...");
        try
        {
            InputStream input = new URL("http://dev.bukkit.org/bukkit-plugins/LinkMe/files.rss").openConnection().getInputStream();
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(input);
            Node latestFile = document.getElementsByTagName("item").item(0);
            NodeList children = latestFile.getChildNodes();
            String[] updateVersion = children.item(1).getTextContent().replaceAll("[a-zA-Z ]", "").split("\\.");
            int updateMajorRelease = Integer.parseInt(updateVersion[0]);
            int updateMinorRelease = Integer.parseInt(updateVersion[1]);
            int updateBuild = Integer.parseInt(updateVersion[2]);

            PluginDescriptionFile pdf = this.plugin.getDescription();
            String[] currentVersion = pdf.getVersion().split("\\.");
            int currentMajorRelease = Integer.parseInt(currentVersion[0]);
            int currentMinorRelease = Integer.parseInt(currentVersion[1]);
            int currentBuild = Integer.parseInt(currentVersion[2]);

            if (updateMajorRelease > currentMajorRelease)
            {
                return false;
            }

            if ((updateMinorRelease > currentMinorRelease) && (updateMajorRelease == currentMajorRelease))
            {
                return false;
            }

            if ((updateBuild > currentBuild) && (updateMinorRelease == currentMinorRelease))
            {
                return false;
            }
            return true;
        }
        catch (IOException | ParserConfigurationException | SAXException | DOMException | NumberFormatException e)
        {
            this.plugin.getLogger().warning("Something is wrong with the update checker. This should be able to be ignored, however if there are issues, please tweet @Wild1145 or go to the LinkMe BukkitDev page and open a ticket!");
        }
        return true;
    }

    public String getDownloadLink()
    {
        try
        {
            InputStream input = new URL("http://dev.bukkit.org/bukkit-plugins/LinkMe/files.rss").openConnection().getInputStream();
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(input);
            Node latestFile = document.getElementsByTagName("item").item(0);
            NodeList children = latestFile.getChildNodes();
            return children.item(3).getTextContent();
        }
        catch (IOException | ParserConfigurationException | SAXException | DOMException e)
        {
        }
        return "http://dev.bukkit.org/server-mods/LinkMe/";
    }
}