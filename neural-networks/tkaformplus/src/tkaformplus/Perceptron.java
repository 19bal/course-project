/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tkaformplus;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gdemir
 */
public class Perceptron {
 
    /**
     * @param args the command line arguments
     */
    private static List<List> output = new ArrayList<List>();
    private static List<Double> weight = new ArrayList<Double>();
    private static double learningrate = 0.5;
    private static double bias = -1;
    public Perceptron() {
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {    
        try {
            List<List> io_elements = Matrix.fileread("train_perceptron.txt", 2); // train : 3 column; test : 2 column
            List<List> input_elements = io_elements.get(0);
            List<Double> output_elements = io_elements.get(1);

            Perceptron perceptron = new Perceptron();
            perceptron.train(io_elements);
                io_elements = Matrix.fileread("test_perceptron.txt", 2); // train : 3 column; test : 2 column
                input_elements = io_elements.get(0);
                output_elements = io_elements.get(1);
            Perceptron.test(input_elements, perceptron.getweight());
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Adaline.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Adaline.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Adaline.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initweight(int column) {
        for (int i = 0; i < column; i++)
            weight.add(1 + Math.random());
        //weight.set(0, 1.0);
        //weight.set(1, 2.0);
    }
    public List<Double> getweight() {
        return weight;
    }
    public List<List> train(List<List> io_elements) {
        System.out.println("Perceptron#train");
        double net, target;
        int i = 0, iteration = 0;

        List<List> input_elements = io_elements.get(0);
        List<Double> output_elements = io_elements.get(1);
        int row = input_elements.size();
        int column = input_elements.get(0).size();

        initweight(column);

        while (true) {
            iteration++;
            target = process(input_elements.get(i), weight);
            System.out.println(iteration + ". iterasyon: Target: " + target + "Beklenen"+ output_elements.get(i) +" weight: " + weight);
            if (target == output_elements.get(i)) {
                i++; // diğer x'e geç
                if (i >= row) break;
            } else { 
                weight_repair((target > output_elements.get(i)) ? false : true, input_elements.get(i));
                i = 0;
            }
        }
        output.add(weight);
        return output;
    }
    public static void test(List<List> input_elements, List<Double> w) {
        System.out.println("Perceptron#test");
        double target;
        System.out.println(" weight: " + w);
        for (int i = 0; i < input_elements.size(); i++) {
            target = process(input_elements.get(i), w);
            System.out.println("Inputs : " + input_elements.get(i)  + " Target: " + target);
        }
    }
    private static double process(List<Double> input_elements, List<Double> w) {
        double net = 0;
        for (int i = 0; i < input_elements.size(); i++)
            net += input_elements.get(i) * w.get(i);
        return (net > bias) ? 1 : 0;
   }
   private void weight_repair(boolean choice, List<Double> input_elements) {
        for (int i = 0; i < weight.size(); i++)
            if (choice)
                weight.set(i, ((double)weight.get(i) + learningrate * input_elements.get(i)));
            else
                weight.set(i, ((double)weight.get(i) - learningrate * input_elements.get(i)));
    }
}