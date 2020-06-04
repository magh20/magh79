import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Thu Jun 04 16:40:24 IRDT 2020
 */



/**
 * @author mohammad
 */
public class Form {
    public Form() {
        initComponents();
        mainFrame.setVisible(true);
    }

    private void nameFieldMouseClicked(MouseEvent e) {
        if(nameField.getText().equals("enter name")){
            nameField.setText("");
        }
    }

    private void familyFieldMouseClicked(MouseEvent e) {
        if(familyField.getText().equals("enter family")){
            familyField.setText("");
        }
    }

    private void melicodeFieldMouseClicked(MouseEvent e) {
        if(melicodeField.getText().equals("enter melicode")){
            melicodeField.setText("");
        }
    }

    private void okMouseClicked(MouseEvent e) {
        if (nameField.getText().equals("") || nameField.getText().equals("enter name")) {
            faildText.setText("name can't be empty!");
            faild.setVisible(true);
        }
        else if (familyField.getText().equals("") || familyField.getText().equals("enter family")) {
            faildText.setText("family can't be empty!");
            faild.setVisible(true);
        }
        else if (melicodeField.getText().equals("") || melicodeField.getText().equals("enetr melicode")){
            faildText.setText("melicode can't be empty!");
            faild.setVisible(true);
        }
        else {
            Contr contr=new Contr();
            contr.name=nameField.getText();
            contr.family=familyField.getText();
            contr.melicode=melicodeField.getText();
            Thread thread1=new Thread(){
                @Override
                public void run() {
                    contr.save();
                }
            };
            thread1.start();
            WriteToFile writeToFile=new WriteToFile();
            Thread thread2=new Thread(){
                @Override
                public void run() {
                    writeToFile.write();
                }
            };
            thread2.start();
            successText.setText("complited.");
            mainFrame.setVisible(false);
            success.setVisible(true);
        }
    }

    private void closeButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void saveButtonMouseClicked(MouseEvent e) {
        saveFrame.setVisible(true);
        mainFrame.setVisible(false);
    }

    private void showButtonMouseClicked(MouseEvent e) {
        Contr contr=new Contr();
        Thread thread3=new Thread(){
            @Override
            public void run() {
                for(Enti s: contr.show()){
                    showText.setText(String.valueOf(s));
                }
            }
        };thread3.start();
        mainFrame.setVisible(false);
        show.setVisible(true);
    }

    private void doneButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        saveFrame = new JFrame();
        nameField = new JTextField();
        familyField = new JTextField();
        melicodeField = new JTextField();
        okButton = new JButton();
        faild = new JDialog();
        faildText = new JLabel();
        success = new JDialog();
        successText = new JLabel();
        closeButton = new JButton();
        mainFrame = new JDialog();
        saveButton = new JButton();
        showButton = new JButton();
        show = new JDialog();
        showText = new JLabel();
        doneButton = new JButton();

        //======== saveFrame ========
        {
            Container saveFrameContentPane = saveFrame.getContentPane();

            //---- nameField ----
            nameField.setText("enter name");
            nameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    nameFieldMouseClicked(e);
                }
            });

            //---- familyField ----
            familyField.setText("enter family");
            familyField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    familyFieldMouseClicked(e);
                }
            });

            //---- melicodeField ----
            melicodeField.setText("enter melicode");
            melicodeField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    melicodeFieldMouseClicked(e);
                }
            });

            //---- okButton ----
            okButton.setText("OK");
            okButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    okMouseClicked(e);
                }
            });

            GroupLayout saveFrameContentPaneLayout = new GroupLayout(saveFrameContentPane);
            saveFrameContentPane.setLayout(saveFrameContentPaneLayout);
            saveFrameContentPaneLayout.setHorizontalGroup(
                saveFrameContentPaneLayout.createParallelGroup()
                    .addGroup(saveFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(saveFrameContentPaneLayout.createParallelGroup()
                            .addGroup(saveFrameContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(familyField, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(melicodeField, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                            .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(55, Short.MAX_VALUE))
            );
            saveFrameContentPaneLayout.setVerticalGroup(
                saveFrameContentPaneLayout.createParallelGroup()
                    .addGroup(saveFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(familyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(melicodeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okButton)
                        .addContainerGap(57, Short.MAX_VALUE))
            );
            saveFrame.pack();
            saveFrame.setLocationRelativeTo(saveFrame.getOwner());
        }

        //======== faild ========
        {
            Container faildContentPane = faild.getContentPane();

            //---- faildText ----
            faildText.setText("text");

            GroupLayout faildContentPaneLayout = new GroupLayout(faildContentPane);
            faildContentPane.setLayout(faildContentPaneLayout);
            faildContentPaneLayout.setHorizontalGroup(
                faildContentPaneLayout.createParallelGroup()
                    .addComponent(faildText, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            );
            faildContentPaneLayout.setVerticalGroup(
                faildContentPaneLayout.createParallelGroup()
                    .addComponent(faildText, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
            );
            faild.pack();
            faild.setLocationRelativeTo(faild.getOwner());
        }

        //======== success ========
        {
            Container successContentPane = success.getContentPane();

            //---- successText ----
            successText.setText("text");

            //---- closeButton ----
            closeButton.setText("close");
            closeButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    closeButtonMouseClicked(e);
                }
            });

            GroupLayout successContentPaneLayout = new GroupLayout(successContentPane);
            successContentPane.setLayout(successContentPaneLayout);
            successContentPaneLayout.setHorizontalGroup(
                successContentPaneLayout.createParallelGroup()
                    .addComponent(successText, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
            );
            successContentPaneLayout.setVerticalGroup(
                successContentPaneLayout.createParallelGroup()
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addComponent(successText, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton)
                        .addGap(0, 5, Short.MAX_VALUE))
            );
            success.pack();
            success.setLocationRelativeTo(success.getOwner());
        }

        //======== mainFrame ========
        {
            Container mainFrameContentPane = mainFrame.getContentPane();

            //---- saveButton ----
            saveButton.setText("save");
            saveButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    saveButtonMouseClicked(e);
                }
            });

            //---- showButton ----
            showButton.setText("show");
            showButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    showButtonMouseClicked(e);
                }
            });

            GroupLayout mainFrameContentPaneLayout = new GroupLayout(mainFrameContentPane);
            mainFrameContentPane.setLayout(mainFrameContentPaneLayout);
            mainFrameContentPaneLayout.setHorizontalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(mainFrameContentPaneLayout.createParallelGroup()
                            .addComponent(showButton, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(70, Short.MAX_VALUE))
            );
            mainFrameContentPaneLayout.setVerticalGroup(
                mainFrameContentPaneLayout.createParallelGroup()
                    .addGroup(mainFrameContentPaneLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(showButton)
                        .addContainerGap(59, Short.MAX_VALUE))
            );
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(mainFrame.getOwner());
        }

        //======== show ========
        {
            Container showContentPane = show.getContentPane();

            //---- showText ----
            showText.setText("text");

            //---- doneButton ----
            doneButton.setText("done");
            doneButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    doneButtonMouseClicked(e);
                }
            });

            GroupLayout showContentPaneLayout = new GroupLayout(showContentPane);
            showContentPane.setLayout(showContentPaneLayout);
            showContentPaneLayout.setHorizontalGroup(
                showContentPaneLayout.createParallelGroup()
                    .addComponent(showText, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(showContentPaneLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(doneButton)
                        .addContainerGap(62, Short.MAX_VALUE))
            );
            showContentPaneLayout.setVerticalGroup(
                showContentPaneLayout.createParallelGroup()
                    .addGroup(showContentPaneLayout.createSequentialGroup()
                        .addComponent(showText, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doneButton)
                        .addGap(0, 4, Short.MAX_VALUE))
            );
            show.pack();
            show.setLocationRelativeTo(show.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JFrame saveFrame;
    private JTextField nameField;
    private JTextField familyField;
    private JTextField melicodeField;
    private JButton okButton;
    private JDialog faild;
    private JLabel faildText;
    private JDialog success;
    private JLabel successText;
    private JButton closeButton;
    private JDialog mainFrame;
    private JButton saveButton;
    private JButton showButton;
    private JDialog show;
    private JLabel showText;
    private JButton doneButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
