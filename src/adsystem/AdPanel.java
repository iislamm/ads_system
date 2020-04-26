package adsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdPanel extends JPanel implements ActionListener {
    private Advertisement ad;
    private final Feed feed = Feed.getInstance();
    private final JButton upButton;
    private final JButton downButton;

    public AdPanel(Advertisement ad) {
        this.ad = ad;

        this.setLayout(new BorderLayout());

        JLabel contentLabel = new JLabel(ad.toString());
        this.add(contentLabel, "Center");

        JPanel feedbackPanel = new JPanel(new FlowLayout());

        this.upButton = new JButton("Up vote");
        this.downButton = new JButton("Down vote");

        this.upButton.addActionListener(this);
        this.downButton.addActionListener(this);

        feedbackPanel.add(upButton);
        feedbackPanel.add(downButton);

        this.add(feedbackPanel, "South");
    }

    public Advertisement getAd() {
        return ad;
    }

    public void setAd(Advertisement ad) {
        this.ad = ad;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        feed.adFeedback(this.ad, actionEvent.getSource() == this.upButton);
        this.upButton.setEnabled(false);
        this.downButton.setEnabled(false);
    }
}
