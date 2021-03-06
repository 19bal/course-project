/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * tkaframe.java
 *
 * Created on 19.Mar.2012, 20:53:13
 */
package tkaformplus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author gdemir
 */
public class tkaframe extends javax.swing.JFrame {
    Boolean errorgraph = false;

    public List<List> train_io_elements = new ArrayList<List>();
    public List<List> train_input_elements = new ArrayList<List>();
    public List<Double> train_output_elements = new ArrayList<Double>();

    public List<List> test_io_elements = new ArrayList<List>();
    public List<List> test_input_elements = new ArrayList<List>();
    public List<Double> test_output_elements = new ArrayList<Double>();

    ICanvas iCanvas;

    Perceptron perceptron;
    Adaline adaline;
    Backpropagation backpropagation;
    Lvq lvq;

    /** Creates new form tkaframe */
    public tkaframe() {
        initComponents();
        redirectSystemStreams();       
    }
 
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        comboboxalgorithm = new javax.swing.JComboBox();
        train = new javax.swing.JButton();
        test = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        trainset = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        testset = new javax.swing.JTextArea();
        inputdimension = new javax.swing.JTextField();
        labelinputdimension = new javax.swing.JLabel();
        layercount = new javax.swing.JTextField();
        labellayercount = new javax.swing.JLabel();
        comboboxtestset = new javax.swing.JComboBox();
        comboboxtrainset = new javax.swing.JComboBox();
        labelcomboboxtrainset = new javax.swing.JLabel();
        labelcomboboxtestset = new javax.swing.JLabel();
        labelalgorithm = new javax.swing.JLabel();
        loadtrainset = new javax.swing.JButton();
        loadtestset = new javax.swing.JButton();
        init = new javax.swing.JButton();
        error = new javax.swing.JTextField();
        labelerror = new javax.swing.JLabel();
        delaytime = new javax.swing.JTextField();
        labeldelaytime = new javax.swing.JLabel();
        comboboxerrorgraph = new javax.swing.JComboBox();
        labelerrorgraph = new javax.swing.JLabel();
        labeltrainset = new javax.swing.JLabel();
        labeltestset = new javax.swing.JLabel();
        labelconsole = new javax.swing.JLabel();
        epochmax = new javax.swing.JTextField();
        labelepochmax = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        opentrainfile = new javax.swing.JMenuItem();
        opentestfile = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        helpcontent = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neural Network Algorithms");
        setFont(new java.awt.Font("Comic Sans MS", 0, 10));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        comboboxalgorithm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "perceptron", "adaline", "backpropagation", "lvq" }));
        comboboxalgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxalgorithmActionPerformed(evt);
            }
        });

        train.setText("train");
        train.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainActionPerformed(evt);
            }
        });

        test.setText("test");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });

        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        trainset.setColumns(20);
        trainset.setRows(5);
        jScrollPane2.setViewportView(trainset);

        testset.setColumns(20);
        testset.setRows(5);
        jScrollPane3.setViewportView(testset);

        inputdimension.setText("2");

        labelinputdimension.setText("input dimension");

        layercount.setText("0");
        layercount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layercountActionPerformed(evt);
            }
        });

        labellayercount.setText("layer count");

        comboboxtestset.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "perceptron", "adaline", "carpim", "xor", "lvq" }));

        comboboxtrainset.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "perceptron", "adaline", "carpim", "xor", "lvq" }));

        labelcomboboxtrainset.setText("train set");

        labelcomboboxtestset.setText("test set");

        labelalgorithm.setText("algorithm");

        loadtrainset.setText("load");
        loadtrainset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadtrainsetActionPerformed(evt);
            }
        });

        loadtestset.setText("load");
        loadtestset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadtestsetActionPerformed(evt);
            }
        });

        init.setText("init");
        init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initActionPerformed(evt);
            }
        });

        error.setText("0.5");

        labelerror.setText("error");

        delaytime.setText("100");

        labeldelaytime.setText("delay time");

        comboboxerrorgraph.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "true", "false" }));

        labelerrorgraph.setText("error graph");

        labeltrainset.setText("train set");

        labeltestset.setText("train set");

        labelconsole.setText("console");

        epochmax.setText("32000");

        labelepochmax.setText("epoch max");

        file.setText("File");

        opentrainfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        opentrainfile.setText("Open Train File");
        opentrainfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opentrainfileActionPerformed(evt);
            }
        });
        file.add(opentrainfile);

        opentestfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        opentestfile.setText("Open Test File");
        opentestfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opentestfileActionPerformed(evt);
            }
        });
        file.add(opentestfile);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        menu.add(file);

        help.setText("Help");

        helpcontent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        helpcontent.setText("Help");
        help.add(helpcontent);

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        menu.add(help);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelinputdimension, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelerrorgraph))
                                    .addComponent(labeldelaytime)
                                    .addComponent(labellayercount)
                                    .addComponent(labelerror)
                                    .addComponent(labelepochmax))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboboxerrorgraph, 0, 236, Short.MAX_VALUE)
                                    .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(layercount, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(epochmax, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(delaytime, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(inputdimension, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(labeltestset)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(labelconsole)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelalgorithm)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(labelcomboboxtestset))
                                    .addComponent(labelcomboboxtrainset))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboboxalgorithm, 0, 338, Short.MAX_VALUE)
                                    .addComponent(comboboxtestset, 0, 338, Short.MAX_VALUE)
                                    .addComponent(comboboxtrainset, 0, 338, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(train, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(init, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loadtestset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loadtrainset, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))
                        .addGap(7, 7, 7))
                    .addComponent(labeltrainset))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltrainset)
                    .addComponent(labelconsole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(labeltestset)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelinputdimension)
                            .addComponent(inputdimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(layercount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labellayercount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelerror))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labeldelaytime)
                            .addComponent(delaytime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(epochmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelepochmax))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelerrorgraph)
                            .addComponent(comboboxerrorgraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxtrainset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadtrainset)
                            .addComponent(labelcomboboxtrainset))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxtestset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadtestset)
                            .addComponent(labelcomboboxtestset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboboxalgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelalgorithm))
                            .addComponent(init))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear)
                            .addComponent(train)
                            .addComponent(test))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainActionPerformed
        try {
            if (iCanvas.train) {
                iCanvas.train = false;
                train.setLabel("Step");
                //iCanvas.output = output;
            } else {
                iCanvas.train = true;
                train.setLabel("Stop");
            }

            if (errorgraph) {
                switch (comboboxalgorithm.getSelectedIndex()) {
                    case 0: iCanvas.startAnimation(perceptron);     break;
                    case 1: iCanvas.startAnimation(adaline);        break;
                    case 2: iCanvas.startAnimation(backpropagation);break;
                    case 3: iCanvas.startAnimation(lvq);            break;
                    default: System.out.print("wtf?!");
                }
            } else {
                try {
                    switch (comboboxalgorithm.getSelectedIndex()) {
                        case 0: perceptron.train(train_io_elements);      break;
                        case 1: adaline.train(train_io_elements);         break;
                        case 2: backpropagation.train(train_io_elements); break;
                        case 3: lvq.train(train_io_elements);             break;
                        default:System.out.print("wtf?!");
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        //System.out.print(iCanvas.output);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_trainActionPerformed

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed

            test_input_elements = test_io_elements.get(0);

            switch (comboboxalgorithm.getSelectedIndex()) {
            case 0: perceptron.test(test_input_elements);  break;
            case 1: adaline.test(test_input_elements);     break;
            case 2: backpropagation.test(Integer.parseInt(layercount.getText()), test_input_elements); break;
            case 3: lvq.test(test_input_elements); break;
            default: System.out.print("wtf?!");
            }
    }//GEN-LAST:event_testActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Confirm ask = new Confirm(new Frame(), true, "Are you sure ?");
        ask.show();
        if (Confirm.answer == Confirm.OK) {
            train_io_elements = new ArrayList<List>();
            train_input_elements = new ArrayList<List>();
            train_output_elements = new ArrayList<Double>();
            test_io_elements = new ArrayList<List>();
            test_input_elements = new ArrayList<List>();

            textarea.setText("");
            trainset.setText("");
            testset.setText("");
        }
    }//GEN-LAST:event_clearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(1);        
}//GEN-LAST:event_exitActionPerformed

    private void opentrainfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opentrainfileActionPerformed
        
        final JFileChooser filechooser = new JFileChooser();
        int returnVal = filechooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File files = filechooser.getSelectedFile();
            try {
                train_io_elements = Matrix.fileread(filechooser.getName(files), Integer.parseInt(inputdimension.getText()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
            }
            train_input_elements = train_io_elements.get(0);
            train_output_elements = train_io_elements.get(1);
            try {
              // What to do with the file, e.g. display it in a TextArea
              trainset.read( new FileReader( files.getAbsolutePath() ), null );
            } catch (IOException ex) {
              System.out.println("problem accessing file"+files.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_opentrainfileActionPerformed

    private void opentestfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opentestfileActionPerformed
        final JFileChooser filechooser = new JFileChooser();
        int returnVal = filechooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File files = filechooser.getSelectedFile();
            try {
                test_io_elements = Matrix.fileread(filechooser.getName(files), Integer.parseInt(inputdimension.getText()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
            }
            test_input_elements = test_io_elements.get(0);
            test_output_elements = test_io_elements.get(1);
            try {
              // What to do with the file, e.g. display it in a TextArea
              testset.read( new FileReader( files.getAbsolutePath() ), null );
            } catch (IOException ex) {
              System.out.println("problem accessing file"+files.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_opentestfileActionPerformed

    private void layercountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layercountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layercountActionPerformed

    private void loadtrainsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadtrainsetActionPerformed
        try {
            String filename = "train_" + comboboxtrainset.getSelectedItem() + ".txt";
            File files = new File(filename);
            train_io_elements = Matrix.fileread(filename, Integer.parseInt(inputdimension.getText()));
            trainset.read( new FileReader( files.getAbsolutePath() ), null );
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadtrainsetActionPerformed

    private void loadtestsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadtestsetActionPerformed
        try {
            String filename = "test_" + comboboxtestset.getSelectedItem() + ".txt";
            File files = new File(filename);
            test_io_elements = Matrix.fileread(filename, Integer.parseInt(inputdimension.getText()));
            testset.read( new FileReader( files.getAbsolutePath() ), null );
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadtestsetActionPerformed

    private void comboboxalgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxalgorithmActionPerformed
        
    }//GEN-LAST:event_comboboxalgorithmActionPerformed

    private void initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initActionPerformed
        try {
            textarea.setText("");
            iCanvas = new ICanvas();
            train.setLabel("train");

            switch (comboboxerrorgraph.getSelectedIndex()) {
                case 0: errorgraph = true; break;
                case 1: errorgraph = false; break;
                default: System.out.print("wtf?!");
            }
            switch (comboboxalgorithm.getSelectedIndex()) {
                case 0: perceptron = new Perceptron(Integer.parseInt(delaytime.getText()), errorgraph);break;
                case 1: adaline = new Adaline(Integer.parseInt(delaytime.getText()), errorgraph);break;
                case 2: backpropagation = new Backpropagation(Integer.parseInt(epochmax.getText()), Double.parseDouble(error.getText()), Integer.parseInt(layercount.getText()), Integer.parseInt(delaytime.getText()), errorgraph);break;
                case 3: lvq = new Lvq(Integer.parseInt(epochmax.getText()), Integer.parseInt(layercount.getText()),Integer.parseInt(delaytime.getText()),errorgraph);break;
                default: System.out.print("wtf?!");
            }

            if ("".equals(trainset.getText())) {
                try {
                    String filename = "train_" + comboboxtrainset.getSelectedItem() + ".txt";
                    File files = new File(filename);
                    train_io_elements = Matrix.fileread(filename, Integer.parseInt(inputdimension.getText()));
                    iCanvas.io_elements = train_io_elements;
                    trainset.read( new FileReader( files.getAbsolutePath() ), null );
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    train_io_elements = Matrix.textread(trainset.getText(), Integer.parseInt(inputdimension.getText()));
                    iCanvas.io_elements = train_io_elements;
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if ("".equals(testset.getText())) {
                try {
                    String filename = "test_" + comboboxtestset.getSelectedItem() + ".txt";
                    File files = new File(filename);
                    test_io_elements = Matrix.fileread(filename, Integer.parseInt(inputdimension.getText()));
                    testset.read( new FileReader( files.getAbsolutePath() ), null );
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else                
                try {
                    test_io_elements = Matrix.textread(testset.getText(), Integer.parseInt(inputdimension.getText()));
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
                }
        } catch (InterruptedException ex) {
            Logger.getLogger(tkaframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_initActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setTitle("about");

        Panel textpanel = new Panel();
	textpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
	textpanel.add(new Label("Neural Networks"));
        frame.add("North", textpanel);

        String[] algorithm = {"- Perceptron", "- Adaline", "- Backpropagation", "- lvq"};

        textpanel = new Panel();
        for (int i = 0; i < algorithm.length; i++) {
            textpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            textpanel.add(new Label(algorithm[i]));
            frame.add(textpanel);
        }
        String line;
        line = "--------------------------------------------------------------------------------";
        textpanel.add(new Label(line));

        textpanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        textpanel.add(new Label("Ondokuz Mayıs Üniversitesi | Bilgisayar Mühendisliği © 2012"));
        frame.add(textpanel);

        textpanel = new Panel();
        textpanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        textpanel.add(new Label("Gökhan DEMİR | http://gdemir.me"));
        frame.add("South", textpanel);

        frame.setSize(400, 200);
        frame.setLocation(Math.abs((dimension.width-frame.getSize().width)/2),0);
        frame.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tkaframe().setVisible(true);   
            }
        });
    }

    private void updateTextArea(final String text) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textarea.append(text);
            }
        });
    }

    private void redirectSystemStreams() {
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                updateTextArea(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                updateTextArea(new String(b, off, len));
            }

            @Override
            public void write(byte[] b) throws IOException {
                write(b, 0, b.length);
            }
        };

        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox comboboxalgorithm;
    private javax.swing.JComboBox comboboxerrorgraph;
    private javax.swing.JComboBox comboboxtestset;
    private javax.swing.JComboBox comboboxtrainset;
    private javax.swing.JTextField delaytime;
    private javax.swing.JTextField epochmax;
    private javax.swing.JTextField error;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JMenuItem helpcontent;
    private javax.swing.JButton init;
    private javax.swing.JTextField inputdimension;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelalgorithm;
    private javax.swing.JLabel labelcomboboxtestset;
    private javax.swing.JLabel labelcomboboxtrainset;
    private javax.swing.JLabel labelconsole;
    private javax.swing.JLabel labeldelaytime;
    private javax.swing.JLabel labelepochmax;
    private javax.swing.JLabel labelerror;
    private javax.swing.JLabel labelerrorgraph;
    private javax.swing.JLabel labelinputdimension;
    private javax.swing.JLabel labellayercount;
    private javax.swing.JLabel labeltestset;
    private javax.swing.JLabel labeltrainset;
    private javax.swing.JTextField layercount;
    private javax.swing.JButton loadtestset;
    private javax.swing.JButton loadtrainset;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem opentestfile;
    private javax.swing.JMenuItem opentrainfile;
    private javax.swing.JButton test;
    private javax.swing.JTextArea testset;
    private javax.swing.JTextArea textarea;
    private javax.swing.JButton train;
    private javax.swing.JTextArea trainset;
    // End of variables declaration//GEN-END:variables
}
