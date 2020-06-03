package view;

import controller.PersonContr;
import model.PersonRepo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/*
 * Created by JFormDesigner on Mon Jun 01 13:16:09 IRDT 2020
 */



/**
 * @author m.a.
 */
public class Form extends JFrame {
    public Form() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        siteFrame.setVisible(true);

    }
    PersonContr personContr=new PersonContr();
    public void success(){
        successText.setText("Login successful");
        logFrame.setVisible(false);
        success.setVisible(true);
    }
    public void faild(){
        faildText.setText("Wrong password");
        faild.setVisible(true);
    }
    private void enterButtonMouseClicked(MouseEvent e) {
        if (fieldUser.getText().equals("") || fieldUser.getText().equals("Enter Username")) {
            faildText.setText("Username can't be empty");
            faild.setVisible(true);
        }
        else if (fieldPass.getText().equals("") || fieldPass.getText().equals("Enter Password")) {
            faildText.setText("Password can't be empty");
            faild.setVisible(true);
        }
        else {
            if (!PersonRepo.users.contains(fieldUser.getText()) || !PersonRepo.passes.contains(fieldPass.getText())) {
                faildText.setText("User doesn't exist");
                faild.setVisible(true);
            }
            else {
                personContr.username=fieldUser.getText();
                personContr.pass=fieldPass.getText();
                personContr.report();
            }
        }

    }

    private void fieldUserMouseClicked(MouseEvent e) {
        if (fieldUser.getText().equals("Enter Username"))
            fieldUser.setText("");
    }

    private void fieldPassMouseClicked(MouseEvent e) {
        if (fieldPass.getText().equals("Enter Password"))
            fieldPass.setText("");
    }

    private void buttonWelcomeMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void enterToSiteMouseClicked(MouseEvent e) {
        siteFrame.setVisible(false);
        logFrame.setVisible(true);
    }

    private void registerMouseClicked(MouseEvent e) {
        siteFrame.setVisible(false);
        registerFrame.setVisible(true);
    }

    private void doneButtonMouseClicked(MouseEvent e) {
        if (nameField.getText().equals("") || nameField.getText().equals("enter name")) {
            faildText.setText("name can't be empty!");
            faild.setVisible(true);
        }
        else if (usernameField.getText().equals("") || usernameField.getText().equals("enter username")) {
            faildText.setText("username can't be empty!");
            faild.setVisible(true);
        }
        else if (passField.getText().equals("") || passField.getText().equals("enter pass")){
            faildText.setText("pass can't be empty!");
            faild.setVisible(true);
        }
        else if (emailField.getText().equals("") || emailField.getText().equals("enter email")){
            faildText.setText("email can't be empty!");
            faild.setVisible(true);
        }
        else{
            personContr.name=nameField.getText();
            personContr.username=usernameField.getText();
            personContr.pass=passField.getText();
            personContr.email=emailField.getText();
            personContr.save();
        }
        System.exit(0);
    }

    private void button1MouseClicked(MouseEvent e) {

    }

    private void nameFieldMouseClicked(MouseEvent e) {
        if(nameField.getText().equals("enter name")){
            nameField.setText("");
        }
    }

    private void usernameFieldMouseClicked(MouseEvent e) {
        if(usernameField.getText().equals("enter username")){
            usernameField.setText("");
        }
    }

    private void passFieldMouseClicked(MouseEvent e) {
        if(passField.getText().equals("enter pass")){
            passField.setText("");
        }
    }

    private void emailFieldMouseClicked(MouseEvent e) {
        if(emailField.getText().equals("enter email")){
            emailField.setText("");
        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        logFrame = new JFrame();
        fieldUser = new JTextField();
        fieldPass = new JTextField();
        enterButton = new JButton();
        faild = new JDialog();
        faildText = new JLabel();
        success = new JDialog();
        welcomeButton = new JButton();
        successText = new JLabel();
        siteFrame = new JDialog();
        logButton = new JButton();
        registerButton = new JButton();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        registerFrame = new JDialog();
        nameField = new JTextField();
        usernameField = new JTextField();
        passField = new JTextField();
        emailField = new JTextField();
        doneButton = new JButton();

        //======== logFrame ========
        {
            logFrame.setTitle("logging");
            Container logFrameContentPane = logFrame.getContentPane();

            //---- fieldUser ----
            fieldUser.setText("enter username");
            fieldUser.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    fieldUserMouseClicked(e);
                }
            });

            //---- fieldPass ----
            fieldPass.setText("enter pass");
            fieldPass.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    fieldPassMouseClicked(e);
                }
            });

            //---- enterButton ----
            enterButton.setText("enter");
            enterButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                    enterButtonMouseClicked(e);
                }
            });

            GroupLayout logFrameContentPaneLayout = new GroupLayout(logFrameContentPane);
            logFrameContentPane.setLayout(logFrameContentPaneLayout);
            logFrameContentPaneLayout.setHorizontalGroup(
                logFrameContentPaneLayout.createParallelGroup()
                    .addGroup(logFrameContentPaneLayout.createSequentialGroup()
                        .addGroup(logFrameContentPaneLayout.createParallelGroup()
                            .addGroup(logFrameContentPaneLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(logFrameContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldUser, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(fieldPass, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addGroup(logFrameContentPaneLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(enterButton, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(58, Short.MAX_VALUE))
            );
            logFrameContentPaneLayout.setVerticalGroup(
                logFrameContentPaneLayout.createParallelGroup()
                    .addGroup(logFrameContentPaneLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(fieldUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enterButton)
                        .addContainerGap(82, Short.MAX_VALUE))
            );
            logFrame.pack();
            logFrame.setLocationRelativeTo(logFrame.getOwner());
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
                    .addGroup(GroupLayout.Alignment.TRAILING, faildContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(faildText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addContainerGap())
            );
            faildContentPaneLayout.setVerticalGroup(
                faildContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, faildContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(faildText, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addContainerGap())
            );
            faild.pack();
            faild.setLocationRelativeTo(faild.getOwner());
        }

        //======== success ========
        {
            Container successContentPane = success.getContentPane();

            //---- welcomeButton ----
            welcomeButton.setText("welcome");
            welcomeButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buttonWelcomeMouseClicked(e);
                    buttonWelcomeMouseClicked(e);
                }
            });

            //---- successText ----
            successText.setText("text");

            GroupLayout successContentPaneLayout = new GroupLayout(successContentPane);
            successContentPane.setLayout(successContentPaneLayout);
            successContentPaneLayout.setHorizontalGroup(
                successContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, successContentPaneLayout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addComponent(welcomeButton, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(successText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addContainerGap())
            );
            successContentPaneLayout.setVerticalGroup(
                successContentPaneLayout.createParallelGroup()
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(successText, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeButton)
                        .addContainerGap(13, Short.MAX_VALUE))
            );
            success.pack();
            success.setLocationRelativeTo(success.getOwner());
        }

        //======== siteFrame ========
        {
            siteFrame.setTitle("main page");
            Container siteFrameContentPane = siteFrame.getContentPane();

            //---- logButton ----
            logButton.setText("log");
            logButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    enterToSiteMouseClicked(e);
                }
            });

            //---- registerButton ----
            registerButton.setText("register");
            registerButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    registerMouseClicked(e);
                }
            });

            //======== scrollPane1 ========
            {

                //---- textPane1 ----
                textPane1.setText("welcome to site.");
                scrollPane1.setViewportView(textPane1);
            }

            GroupLayout siteFrameContentPaneLayout = new GroupLayout(siteFrameContentPane);
            siteFrameContentPane.setLayout(siteFrameContentPaneLayout);
            siteFrameContentPaneLayout.setHorizontalGroup(
                siteFrameContentPaneLayout.createParallelGroup()
                    .addGroup(siteFrameContentPaneLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(siteFrameContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(logButton, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(registerButton, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addContainerGap(42, Short.MAX_VALUE))
            );
            siteFrameContentPaneLayout.setVerticalGroup(
                siteFrameContentPaneLayout.createParallelGroup()
                    .addGroup(siteFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(logButton)
                        .addGap(40, 40, 40)
                        .addComponent(registerButton)
                        .addContainerGap(91, Short.MAX_VALUE))
            );
            siteFrame.pack();
            siteFrame.setLocationRelativeTo(siteFrame.getOwner());
        }

        //======== registerFrame ========
        {
            registerFrame.setTitle("registering");
            Container registerFrameContentPane = registerFrame.getContentPane();

            //---- nameField ----
            nameField.setText("enter name");
            nameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    nameFieldMouseClicked(e);
                }
            });

            //---- usernameField ----
            usernameField.setText("enter username");
            usernameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    usernameFieldMouseClicked(e);
                }
            });

            //---- passField ----
            passField.setText("enter pass");
            passField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    passFieldMouseClicked(e);
                }
            });

            //---- emailField ----
            emailField.setText("enter email");
            emailField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    emailFieldMouseClicked(e);
                }
            });

            //---- doneButton ----
            doneButton.setText("done");
            doneButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    doneButtonMouseClicked(e);
                }
            });

            GroupLayout registerFrameContentPaneLayout = new GroupLayout(registerFrameContentPane);
            registerFrameContentPane.setLayout(registerFrameContentPaneLayout);
            registerFrameContentPaneLayout.setHorizontalGroup(
                registerFrameContentPaneLayout.createParallelGroup()
                    .addGroup(registerFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(registerFrameContentPaneLayout.createParallelGroup()
                            .addComponent(passField, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(usernameField, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(emailField, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, registerFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap(66, Short.MAX_VALUE)
                        .addComponent(doneButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
            );
            registerFrameContentPaneLayout.setVerticalGroup(
                registerFrameContentPaneLayout.createParallelGroup()
                    .addGroup(registerFrameContentPaneLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(doneButton)
                        .addContainerGap(42, Short.MAX_VALUE))
            );
            registerFrame.pack();
            registerFrame.setLocationRelativeTo(registerFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JFrame logFrame;
    private JTextField fieldUser;
    private JTextField fieldPass;
    private JButton enterButton;
    private JDialog faild;
    private JLabel faildText;
    private JDialog success;
    private JButton welcomeButton;
    private JLabel successText;
    private JDialog siteFrame;
    private JButton logButton;
    private JButton registerButton;
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    private JDialog registerFrame;
    private JTextField nameField;
    private JTextField usernameField;
    private JTextField passField;
    private JTextField emailField;
    private JButton doneButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
