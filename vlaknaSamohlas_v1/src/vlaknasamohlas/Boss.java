/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlaknasamohlas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author masic
 */
public class Boss extends Thread {

    private Counter cn;
    ArrayList<Worker> workers = new ArrayList<Worker>();
    private File temp;
    private int minT = 1;
    private int maxT = 10;
    private long divider = 1024 * 1024 * 10;//10MB

    public Boss(String path) {

        temp = new File(path);

        boolean exists = temp.exists();
        cn = new Counter();
        //this.divideTast();
        start();

        System.out.println("Temp file exists : " + exists);

    }

    private void divideTast() throws FileNotFoundException {
        long fileSize = temp.length();
        long countT = this.minT;
        long partSize = 0;
        if (fileSize / this.divider > this.minT) {
            countT = this.maxT;

        }

        partSize = fileSize / countT;

        for (long i = 0; i < countT; i++) {
             
            workers.add(
                    new Worker(i,
                            i * partSize,
                            temp.getAbsolutePath(),
                            (i+1)*partSize,
                            this.cn
                    )
            );

        }

    }

    @Override
    public void run() {
        try {
            divideTast();
            for (Worker w : workers) {//čekám na všechny
                w.join();

            }
            System.out.println("-------------");
            Arrays.stream(this.getReSDult()).forEach(System.out::println);
            System.out.println("-------------");
        } catch (FileNotFoundException ex) {
            System.out.println("Worker id: " + getId() + " has been created exception:" + ex.getMessage());
            Logger.getLogger(Boss.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            System.out.println("Worker id: " + getId() + " has been created exception:" + ex.getMessage());
            Logger.getLogger(Boss.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    protected void waiting() {
    
    
    }
    public int[] getReSDult() {
        return cn.getCount();
    }

}
