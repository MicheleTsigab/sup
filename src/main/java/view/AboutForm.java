package view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Properties;
import java.util.ResourceBundle;

class AboutForm extends JFrame {

    private JPanel panel;
    private JLabel programNameLabel;
    private JLabel buildDateLabel;
    private JLabel developerNameLabel;
    private JLabel developerEmailLabel;
    private JLabel whatsNewInSydlerLabel;
    private JLabel newFeaturesListLabel;

    AboutForm(JFrame frame, Properties UITexts) {
        this.setContentPane(panel);
        setTitle("About " + UITexts.getProperty("program.name.label"));
        programNameLabel.setText(UITexts.getProperty("program.name.label"));
        buildDateLabel.setText(UITexts.getProperty("build.date.label"));
        developerNameLabel.setText(UITexts.getProperty("developer.name"));
        developerEmailLabel.setText("(" + UITexts.getProperty("developer.email") + ")");
        whatsNewInSydlerLabel.setText(
                UITexts.getProperty("whats.new.tab.title.beginning") + " "
                        + UITexts.getProperty("program.name.label") + " "
                        + UITexts.getProperty("program.version.label")
        );
        newFeaturesListLabel.setText(UITexts.getProperty("whats.new.in.sydler.list"));

        programNameLabel.setFont(new Font("", Font.BOLD, 36));
        buildDateLabel.setFont(new Font("", Font.PLAIN, 16));
        developerNameLabel.setFont(new Font("", Font.PLAIN, 16));
        developerEmailLabel.setFont(new Font("", Font.PLAIN, 13));
        whatsNewInSydlerLabel.setFont(new Font("", Font.BOLD, 20));
        newFeaturesListLabel.setFont(new Font("", Font.PLAIN, 14));

        setSize(new Dimension(400, 250));
        setResizable(false);
        setAlwaysOnTop(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.setEnabled(true);
            }
        });
    }

    JFrame getFrame() {
        return this;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        final JTabbedPane tabbedPane1 = new JTabbedPane();
        panel.add(tabbedPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("About", panel1);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-1));
        panel1.add(panel2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        programNameLabel = new JLabel();
        Font programNameLabelFont = this.$$$getFont$$$(null, -1, -1, programNameLabel.getFont());
        if (programNameLabelFont != null) programNameLabel.setFont(programNameLabelFont);
        this.$$$loadLabelText$$$(programNameLabel, ResourceBundle.getBundle("UITexts").getString("program.name.label"));
        panel2.add(programNameLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        buildDateLabel = new JLabel();
        Font buildDateLabelFont = this.$$$getFont$$$(null, -1, -1, buildDateLabel.getFont());
        if (buildDateLabelFont != null) buildDateLabel.setFont(buildDateLabelFont);
        this.$$$loadLabelText$$$(buildDateLabel, ResourceBundle.getBundle("UITexts").getString("build.date.label"));
        panel2.add(buildDateLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        developerEmailLabel = new JLabel();
        developerEmailLabel.setHorizontalAlignment(0);
        developerEmailLabel.setHorizontalTextPosition(0);
        this.$$$loadLabelText$$$(developerEmailLabel, ResourceBundle.getBundle("UITexts").getString("developer.email"));
        panel2.add(developerEmailLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        developerNameLabel = new JLabel();
        Font developerNameLabelFont = this.$$$getFont$$$(null, -1, -1, developerNameLabel.getFont());
        if (developerNameLabelFont != null) developerNameLabel.setFont(developerNameLabelFont);
        this.$$$loadLabelText$$$(developerNameLabel, ResourceBundle.getBundle("UITexts").getString("developer.name"));
        panel2.add(developerNameLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel3.setBackground(new Color(-1));
        tabbedPane1.addTab("What's New", panel3);
        whatsNewInSydlerLabel = new JLabel();
        Font whatsNewInSydlerLabelFont = this.$$$getFont$$$(null, -1, -1, whatsNewInSydlerLabel.getFont());
        if (whatsNewInSydlerLabelFont != null) whatsNewInSydlerLabel.setFont(whatsNewInSydlerLabelFont);
        whatsNewInSydlerLabel.setText("");
        panel3.add(whatsNewInSydlerLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setBackground(new Color(-921103));
        panel3.add(scrollPane1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        newFeaturesListLabel = new JLabel();
        newFeaturesListLabel.setBackground(new Color(-921103));
        Font newFeaturesListLabelFont = this.$$$getFont$$$(null, -1, -1, newFeaturesListLabel.getFont());
        if (newFeaturesListLabelFont != null) newFeaturesListLabel.setFont(newFeaturesListLabelFont);
        newFeaturesListLabel.setHorizontalAlignment(2);
        newFeaturesListLabel.setHorizontalTextPosition(2);
        newFeaturesListLabel.setText("");
        newFeaturesListLabel.setVerticalAlignment(0);
        newFeaturesListLabel.setVerticalTextPosition(0);
        scrollPane1.setViewportView(newFeaturesListLabel);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    private void $$$loadLabelText$$$(JLabel component, String text) {
        StringBuffer result = new StringBuffer();
        boolean haveMnemonic = false;
        char mnemonic = '\0';
        int mnemonicIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                i++;
                if (i == text.length()) break;
                if (!haveMnemonic && text.charAt(i) != '&') {
                    haveMnemonic = true;
                    mnemonic = text.charAt(i);
                    mnemonicIndex = result.length();
                }
            }
            result.append(text.charAt(i));
        }
        component.setText(result.toString());
        if (haveMnemonic) {
            component.setDisplayedMnemonic(mnemonic);
            component.setDisplayedMnemonicIndex(mnemonicIndex);
        }
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

}