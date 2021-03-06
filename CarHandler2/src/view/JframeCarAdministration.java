/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Control;
import java.util.Collections;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Car;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Flinkerfyr
 */
public class JframeCarAdministration extends javax.swing.JFrame {

    private Control control;

    /**
     * Creates new form JFrameCarHandler
     */
    public JframeCarAdministration(Control control) {
        initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        this.control = control;
        fillPeriodComboBox();
        updateCarTableModel();
        this.setVisible(true);
    }

    public void updateCarTableModel() {

        DefaultTableModel model = new DefaultTableModel();
        
        Collections.sort(control.getCarListForDisplay()); //Sort list of cars with Arrays.sort (Remenber to make Cars comparable by GuestID)
        
        model.addColumn("Brand");
        model.addColumn("Model");
        model.addColumn("Year");
        model.addColumn("Carvalue");
        model.addColumn("Topspeed");
        model.addColumn("Seats");
        model.addColumn("Trunk");
        model.setRowCount(control.getCarListForDisplay().size());
        int r=0;
        
        for (Car s : control.getCarListForDisplay()) {
            model.setValueAt(s.getBrand(), r, 0);
            model.setValueAt(s.getModel(), r, 1);
            model.setValueAt(s.getYear(), r, 2);
            model.setValueAt(s.getCarValue(), r, 3);
            model.setValueAt(s.getTopSpeed(), r, 4);
            model.setValueAt(s.getNumberOfSeats(), r, 5);
            model.setValueAt(s.getTrunkPresent(), r, 6);
            r++;
        }
        jTableCarList.setModel(model);
    }

    public void fillPeriodComboBox() {
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        dcbm.addElement("Monthly");
        dcbm.addElement("Weekly");
        jComboBoxPeriode.setModel(dcbm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jButtonShowAllCarsSortedByHighestEarning = new javax.swing.JButton();
        jLabelCarTitle = new javax.swing.JLabel();
        jButtonShowAllCarsRentedByGuestID = new javax.swing.JButton();
        jButtonShowAllAvailableCars = new javax.swing.JButton();
        jButtonShowAllCarsRentedOut = new javax.swing.JButton();
        jButtonShowNumberOfCarsRentedOut = new javax.swing.JButton();
        jButtonShowTotalDistanceDrivenForAllCars = new javax.swing.JButton();
        jButtonShowMoneyEarnedForAllCars = new javax.swing.JButton();
        jButtonShowCarsWhichNeedRepair = new javax.swing.JButton();
        jButtonShowAllCarsSortedByMostRented = new javax.swing.JButton();
        jComboBoxPeriode = new javax.swing.JComboBox<>();
        jLabelCurrently = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarList = new javax.swing.JTable();
        jButtonDisplayRentingInformation = new javax.swing.JButton();
        jButtonSearchCar = new javax.swing.JButton();
        jButtonRentCar = new javax.swing.JButton();
        jButtonAddCar = new javax.swing.JButton();
        jButtonReturnCar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonDeleteCar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonShowAllCarsSortedByHighestEarning.setText("Show all cars sorted by highest earnings");
        jButtonShowAllCarsSortedByHighestEarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowAllCarsSortedByHighestEarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllCarsSortedByHighestEarningActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAllCarsSortedByHighestEarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 320, -1));

        jLabelCarTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCarTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCarTitle.setText("Car Administration");
        getContentPane().add(jLabelCarTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 39));

        jButtonShowAllCarsRentedByGuestID.setText("Show all cars rented by guest ID");
        jButtonShowAllCarsRentedByGuestID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowAllCarsRentedByGuestID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllCarsRentedByGuestIDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAllCarsRentedByGuestID, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 320, -1));

        jButtonShowAllAvailableCars.setText("Show all available cars");
        jButtonShowAllAvailableCars.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowAllAvailableCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllAvailableCarsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAllAvailableCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 320, -1));

        jButtonShowAllCarsRentedOut.setText("Show all cars rented out");
        jButtonShowAllCarsRentedOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowAllCarsRentedOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllCarsRentedOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAllCarsRentedOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 320, -1));

        jButtonShowNumberOfCarsRentedOut.setText("Show number of cars rented out");
        jButtonShowNumberOfCarsRentedOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowNumberOfCarsRentedOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowNumberOfCarsRentedOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowNumberOfCarsRentedOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 320, -1));

        jButtonShowTotalDistanceDrivenForAllCars.setText("Show total distance driven for all cars");
        jButtonShowTotalDistanceDrivenForAllCars.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowTotalDistanceDrivenForAllCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowTotalDistanceDrivenForAllCarsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowTotalDistanceDrivenForAllCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 320, -1));

        jButtonShowMoneyEarnedForAllCars.setText("Show money earned for all cars");
        jButtonShowMoneyEarnedForAllCars.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowMoneyEarnedForAllCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowMoneyEarnedForAllCarsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowMoneyEarnedForAllCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 320, -1));

        jButtonShowCarsWhichNeedRepair.setText("Show cars which need repair");
        jButtonShowCarsWhichNeedRepair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowCarsWhichNeedRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCarsWhichNeedRepairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowCarsWhichNeedRepair, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 320, -1));

        jButtonShowAllCarsSortedByMostRented.setText("Show all cars sorted by most rented");
        jButtonShowAllCarsSortedByMostRented.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonShowAllCarsSortedByMostRented.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllCarsSortedByMostRentedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAllCarsSortedByMostRented, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 320, -1));

        jComboBoxPeriode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeriodeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPeriode, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 210, 315, -1));

        jLabelCurrently.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCurrently.setText("Currently");
        jLabelCurrently.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabelCurrently, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 300, 20));

        jTableCarList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCarList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 590, -1));

        jButtonDisplayRentingInformation.setText("Display renting information");
        getContentPane().add(jButtonDisplayRentingInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 260, -1));

        jButtonSearchCar.setText("Search Car");
        jButtonSearchCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchCarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSearchCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 140, -1));

        jButtonRentCar.setText("Rent Car");
        jButtonRentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentCarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRentCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 140, -1));

        jButtonAddCar.setText("Add Car");
        jButtonAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 130, -1));

        jButtonReturnCar.setText("Return Car");
        jButtonReturnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnCarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReturnCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 260, -1));

        jButton1.setText("Close");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 70, -1));

        jButtonDeleteCar.setText("Delete car");
        jButtonDeleteCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeleteCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowAllCarsSortedByHighestEarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllCarsSortedByHighestEarningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowAllCarsSortedByHighestEarningActionPerformed

    private void jButtonShowAllCarsRentedByGuestIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllCarsRentedByGuestIDActionPerformed
        control.startUserChooseBox(this); //Search in renting list of Rentings by this User CHANGE carList into this list
        this.setVisible(false);
    }//GEN-LAST:event_jButtonShowAllCarsRentedByGuestIDActionPerformed

    private void jButtonShowAllAvailableCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllAvailableCarsActionPerformed
        control.setCarListForDisplayToAllAvailableCars(this);
    }//GEN-LAST:event_jButtonShowAllAvailableCarsActionPerformed

    private void jButtonShowAllCarsRentedOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllCarsRentedOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowAllCarsRentedOutActionPerformed

    private void jButtonShowNumberOfCarsRentedOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowNumberOfCarsRentedOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowNumberOfCarsRentedOutActionPerformed

    private void jButtonShowTotalDistanceDrivenForAllCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowTotalDistanceDrivenForAllCarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowTotalDistanceDrivenForAllCarsActionPerformed

    private void jButtonShowMoneyEarnedForAllCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowMoneyEarnedForAllCarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowMoneyEarnedForAllCarsActionPerformed

    private void jButtonShowCarsWhichNeedRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCarsWhichNeedRepairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowCarsWhichNeedRepairActionPerformed

    private void jButtonShowAllCarsSortedByMostRentedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllCarsSortedByMostRentedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShowAllCarsSortedByMostRentedActionPerformed

    private void jComboBoxPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeriodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPeriodeActionPerformed

    private void jButtonReturnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonReturnCarActionPerformed

    private void jButtonAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCarActionPerformed
        control.addNewCar();
        updateCarTableModel();
    }//GEN-LAST:event_jButtonAddCarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRentCarActionPerformed

    private void jButtonDeleteCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCarActionPerformed
        control.deleteCar();
        updateCarTableModel();
    }//GEN-LAST:event_jButtonDeleteCarActionPerformed

    private void jButtonSearchCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCarActionPerformed
        control.searchCar();
    }//GEN-LAST:event_jButtonSearchCarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddCar;
    private javax.swing.JButton jButtonDeleteCar;
    private javax.swing.JButton jButtonDisplayRentingInformation;
    private javax.swing.JButton jButtonRentCar;
    private javax.swing.JButton jButtonReturnCar;
    private javax.swing.JButton jButtonSearchCar;
    private javax.swing.JButton jButtonShowAllAvailableCars;
    private javax.swing.JButton jButtonShowAllCarsRentedByGuestID;
    private javax.swing.JButton jButtonShowAllCarsRentedOut;
    private javax.swing.JButton jButtonShowAllCarsSortedByHighestEarning;
    private javax.swing.JButton jButtonShowAllCarsSortedByMostRented;
    private javax.swing.JButton jButtonShowCarsWhichNeedRepair;
    private javax.swing.JButton jButtonShowMoneyEarnedForAllCars;
    private javax.swing.JButton jButtonShowNumberOfCarsRentedOut;
    private javax.swing.JButton jButtonShowTotalDistanceDrivenForAllCars;
    private javax.swing.JComboBox<String> jComboBoxPeriode;
    private javax.swing.JLabel jLabelCarTitle;
    private javax.swing.JLabel jLabelCurrently;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarList;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
