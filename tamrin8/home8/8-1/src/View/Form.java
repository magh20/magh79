/*
 * Created by JFormDesigner on Tue Jun 02 11:57:47 IRDT 2020
 */

package View;

import Controller.Contr;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author mohammad
 */
public class Form {
    public Form() {
        initComponents();
        employmentForm.setVisible(true);
        employmentForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    private void doneButtonMouseClicked(MouseEvent e) {
        if (nameField.getText().equals("") || nameField.getText().equals("enter name")) {
            faildText.setText("Name can't be empty");
            faild.setVisible(true);
        }
        else if (familyField.getText().equals("") || familyField.getText().equals("enter family")) {
            faildText.setText("family can't be empty");
            faild.setVisible(true);
        }
        else if (melicodeField.getText().equals("") || melicodeField.getText().equals("enter melicode")) {
            faildText.setText("melicode can't be empty");
            faild.setVisible(true);
        }
        else if (phonenumberField.getText().equals("") || phonenumberField.getText().equals("enter phone number")) {
            faildText.setText("phone number can't be empty");
            faild.setVisible(true);
        }
        else if (addressField.getText().equals("") || addressField.getText().equals("enter address")) {
            faildText.setText("address can't be empty");
            faild.setVisible(true);
        }
        else if (addressField.getText().equals("") || addressField.getText().equals("enter age")) {
            faildText.setText("age can't be empty");
            faild.setVisible(true);
        }
        else if (experienceField.getText().equals("") || experienceField.getText().equals("enter exprience")) {
            faildText.setText("exprience can't be empty");
            faild.setVisible(true);
        }
        else if (skillField.getText().equals("") || skillField.getText().equals("enter skill")) {
            faildText.setText("skill can't be empty");
            faild.setVisible(true);
        }
        else{
            Contr contr=new Contr();
            contr.name=nameField.getText();
            contr.family=familyField.getText();
            contr.melicode=melicodeField.getText();
            contr.phonenumber=phonenumberField.getText();
            contr.address=addressField.getText();
            contr.age=ageField.getText();
            contr.skill=skillField.getText();
            contr.experience=experienceField.getText();
            contr.save();
            successText.setText("completed.");
            success.setVisible(true);
        }
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

    private void phonenumberFieldMouseClicked(MouseEvent e) {
        if(phonenumberField.getText().equals("enter phone number")){
            phonenumberField.setText("");
        }
    }

    private void addressFieldMouseClicked(MouseEvent e) {
        if(addressField.getText().equals("enter address")){
            addressField.setText("");
        }
    }

    private void ageFieldMouseClicked(MouseEvent e) {
        if(ageField.getText().equals("enter age")){
            ageField.setText("");
        }
    }

    private void experienceFieldMouseClicked(MouseEvent e) {
        if(experienceField.getText().equals("enter exprience")){
            experienceField.setText("");
        }
    }

    private void skillFieldMouseClicked(MouseEvent e) {
        if(skillField.getText().equals("enter skill")){
            skillField.setText("");
        }
    }

    private void closeButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        employmentForm = new JFrame();
        nameField = new JTextField();
        familyField = new JTextField();
        melicodeField = new JTextField();
        phonenumberField = new JTextField();
        addressField = new JTextField();
        ageField = new JTextField();
        experienceField = new JTextField();
        doneButton = new JButton();
        skillField = new JTextField();
        success = new JDialog();
        successText = new JLabel();
        closeButton = new JButton();
        faild = new JDialog();
        faildText = new JLabel();

        //======== employmentForm ========
        {
            employmentForm.setTitle("employment form");
            Container employmentFormContentPane = employmentForm.getContentPane();

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

            //---- phonenumberField ----
            phonenumberField.setText("enter phone number");
            phonenumberField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    phonenumberFieldMouseClicked(e);
                }
            });

            //---- addressField ----
            addressField.setText("enter address");
            addressField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    addressFieldMouseClicked(e);
                }
            });

            //---- ageField ----
            ageField.setText("enter age");
            ageField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ageFieldMouseClicked(e);
                }
            });

            //---- experienceField ----
            experienceField.setText("enter exprience");
            experienceField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    experienceFieldMouseClicked(e);
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

            //---- skillField ----
            skillField.setText("enter skill");
            skillField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    skillFieldMouseClicked(e);
                }
            });

            GroupLayout employmentFormContentPaneLayout = new GroupLayout(employmentFormContentPane);
            employmentFormContentPane.setLayout(employmentFormContentPaneLayout);
            employmentFormContentPaneLayout.setHorizontalGroup(
                employmentFormContentPaneLayout.createParallelGroup()
                    .addGroup(employmentFormContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(employmentFormContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(familyField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(melicodeField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(phonenumberField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(addressField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(ageField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(experienceField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(doneButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                            .addComponent(skillField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                        .addContainerGap(181, Short.MAX_VALUE))
            );
            employmentFormContentPaneLayout.setVerticalGroup(
                employmentFormContentPaneLayout.createParallelGroup()
                    .addGroup(employmentFormContentPaneLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(familyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(melicodeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phonenumberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(experienceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(skillField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(doneButton)
                        .addContainerGap(205, Short.MAX_VALUE))
            );
            employmentForm.pack();
            employmentForm.setLocationRelativeTo(employmentForm.getOwner());
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
                        .addGap(47, 47, 47)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
            );
            successContentPaneLayout.setVerticalGroup(
                successContentPaneLayout.createParallelGroup()
                    .addGroup(successContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(successText, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton)
                        .addContainerGap(15, Short.MAX_VALUE))
            );
            success.pack();
            success.setLocationRelativeTo(success.getOwner());
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
                        .addComponent(faildText, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addContainerGap())
            );
            faild.pack();
            faild.setLocationRelativeTo(faild.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JFrame employmentForm;
    private JTextField nameField;
    private JTextField familyField;
    private JTextField melicodeField;
    private JTextField phonenumberField;
    private JTextField addressField;
    private JTextField ageField;
    private JTextField experienceField;
    private JButton doneButton;
    private JTextField skillField;
    private JDialog success;
    private JLabel successText;
    private JButton closeButton;
    private JDialog faild;
    private JLabel faildText;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
