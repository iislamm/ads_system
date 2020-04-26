package adsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdSystemUI extends JFrame implements ActionListener {
    private final Feed feed = Feed.getInstance();
    private JPanel containerJPanel;
    private JButton refreshButton;
    private JPanel adsContainer;
    public AdSystemUI() {
        DataGenerator.feedFiles();
        this.setSize(500, 500);
        this.setTitle("Ad System");

        this.containerJPanel = new JPanel(new BorderLayout());

        this.refreshButton = new JButton("Refresh");
        this.refreshButton.addActionListener(this);

        this.containerJPanel.add(this.refreshButton, "North");

        this.loadAds();

        this.add(this.containerJPanel);

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new AdSystemUI();
    }

    private void loadAds() {
        var ads = feed.getCurrentAds();
        this.adsContainer = new JPanel(new GridLayout(0, 1));
        this.containerJPanel.add(adsContainer, "Center");
        AdPanel adPanel;
        for (var ad: ads) {
            adPanel = new AdPanel(ad.getKey());
            this.adsContainer.add(adPanel);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        feed.updateViewerInterestsRating();
        this.containerJPanel.remove(this.adsContainer);
        this.containerJPanel.revalidate();
        loadAds();
        this.containerJPanel.revalidate();
    }
}
