/*
 * Created by JFormDesigner on Tue Jun 02 13:36:48 IRDT 2020
 */

package View;

import Controller.Contr;
import Model.Repo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author mohammad
 */
public class UserForm {
    public UserForm() {
        initComponents();
        logFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        logFrame.setVisible(true);
    }

    private void okButtonMouseClicked(MouseEvent e) {
        if (UsernameField.getText().equals("") || UsernameField.getText().equals("enter username")) {
            faildText.setText("Username can't be empty");
            faild.setVisible(true);
        }
        else if (PassField.getText().equals("") || PassField.getText().equals("enter pass")) {
            faildText.setText("Password can't be empty");
            faild.setVisible(true);
        }
        else {
            if(!Repo.users.contains(UsernameField.getText())){
                faildText.setText("user dosen't exist!");
                faild.setVisible(true);
            }
            else {
                Contr contr=new Contr();
                contr.Username=UsernameField.getText();
                contr.Pass=PassField.getText();
                int index = Repo.users.indexOf(UsernameField.getText());
                String pass = Repo.passes.get(index);
                if (PassField.getText().equals(pass)) {
                    logFrame.setVisible(false);
                    editFrame.setVisible(true);
                }
                else {
                    faildText.setText("Wrong password");
                    faild.setVisible(true);
                }
            }
        }
    }

    private void UsernameFieldMouseClicked(MouseEvent e) {
        if (UsernameField.getText().equals("enter username"))
            UsernameField.setText("");
    }

    private void PassFieldMouseClicked(MouseEvent e) {
        if (PassField.getText().equals("enter pass"))
            PassField.setText("");
    }

    private void doneButtonMouseClicked(MouseEvent e) {
        if (usernameField.getText().equals("") || usernameField.getText().equals("enter username")) {
            faildText.setText("Username can't be empty");
            faild.setVisible(true);
        }
        else if (passField.getText().equals("") || passField.getText().equals("enter pass")) {
            faildText.setText("Password can't be empty");
            faild.setVisible(true);
        }
        else if (nameField.getText().equals("") || nameField.getText().equals("enter name")) {
            faildText.setText("name can't be empty");
            faild.setVisible(true);
        }
        else if (emailField.getText().equals("") || emailField.getText().equals("enter email")) {
            faildText.setText("email can't be empty");
            faild.setVisible(true);
        }
        else {
            Contr contr=new Contr();
            contr.name=nameField.getText();
            contr.username=usernameField.getText();
            contr.pass=passField.getText();
            contr.email=emailField.getText();
            contr.edit();
            editFrame.setVisible(false);
            success.setVisible(true);
        }
    }

    private void closeButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void nameFieldMouseClicked(MouseEvent e) {
        if (nameField.getText().equals("enter name"))
            nameField.setText("");
    }

    private void usernameFieldMouseClicked(MouseEvent e) {
        if (usernameField.getText().equals("enter username"))
            usernameField.setText("");
    }

    private void passFieldMouseClicked(MouseEvent e) {
        if (passField.getText().equals("enter pass"))
            passField.setText("");
    }

    private void emailFieldMouseClicked(MouseEvent e) {
        if (emailField.getText().equals("enter email"))
            emailField.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        logFrame = new JFrame();
        UsernameField = new JTextField();
        PassField = new JTextField();
        okButton = new JButton();
        editFrame = new JDialog();
        nameField = new JTextField();
        usernameField = new JTextField();
        passField = new JTextField();
        emailField = new JTextField();
        doneButton = new JButton();
        faild = new JDialog();
        faildText = new JLabel();
        success = new JDialog();
        successText = new JLabel();
        closeButton = new JButton();

        //======== logFrame ========
        {
            logFrame.setTitle("log");
            Container logFrameContentPane = logFrame.getContentPane();

            //---- UsernameField ----
            UsernameField.setText("enter username");
            UsernameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    UsernameFieldMouseClicked(e);
                }
            });

            //---- PassField ----
            PassField.setText("enter pass");
            PassField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    PassFieldMouseClicked(e);
                }
            });

            //---- okButton ----
            okButton.setText("OK");
            okButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    okButtonMouseClicked(e);
                }
            });

            GroupLayout logFrameContentPaneLayout = new GroupLayout(logFrameContentPane);
            logFrameContentPane.setLayout(logFrameContentPaneLayout);
            logFrameContentPaneLayout.setHorizontalGroup(
                logFrameContentPaneLayout.createParallelGroup()
                    .addGroup(logFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(logFrameContentPaneLayout.createParallelGroup()
                            .addGroup(logFrameContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(UsernameField, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addComponent(PassField, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                            .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(46, Short.MAX_VALUE))
            );
            logFrameContentPaneLayout.setVerticalGroup(
                logFrameContentPaneLayout.createParallelGroup()
                    .addGroup(logFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UsernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PassField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okButton)
                        .addContainerGap(57, Short.MAX_VALUE))
            );
            logFrame.pack();
            logFrame.setLocationRelativeTo(logFrame.getOwner());
        }

        //======== editFrame ========
        {
            editFrame.setTitle("edit");
            Container editFrameContentPane = editFrame.getContentPane();

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

            GroupLayout editFrameContentPaneLayout = new GroupLayout(editFrameContentPane);
            editFrameContentPane.setLayout(editFrameContentPaneLayout);
            editFrameContentPaneLayout.setHorizontalGroup(
                editFrameContentPaneLayout.createParallelGroup()
                    .addGroup(editFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(editFrameContentPaneLayout.createParallelGroup()
                            .addGroup(editFrameContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(usernameField, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(passField, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(emailField, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                            .addComponent(doneButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(128, Short.MAX_VALUE))
            );
            editFrameContentPaneLayout.setVerticalGroup(
                editFrameContentPaneLayout.createParallelGroup()
                    .addGroup(editFrameContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(doneButton)
                        .addContainerGap(56, Short.MAX_VALUE))
            );
            editFrame.pack();
            editFrame.setLocationRelativeTo(editFrame.getOwner());
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
                    .addGroup(faildContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(faildText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addContainerGap())
            );
            faildContentPaneLayout.setVerticalGroup(
                faildContentPaneLayout.createParallelGroup()
                    .addGroup(faildContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(faildText, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addContainerGap())
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
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(successText, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
            );
            successContentPaneLayout.setVerticalGroup(
                successContentPaneLayout.createParallelGroup()
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(successText, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            success.pack();
            success.setLocationRelativeTo(success.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JFrame logFrame;
    private JTextField UsernameField;
    private JTextField PassField;
    private JButton okButton;
    private JDialog editFrame;
    private JTextField nameField;
    private JTextField usernameField;
    private JTextField passField;
    private JTextField emailField;
    private JButton doneButton;
    private JDialog faild;
    private JLabel faildText;
    private JDialog success;
    private JLabel successText;
    private JButton closeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
