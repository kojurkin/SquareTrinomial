package org.example;

import java.util.ArrayList;
import java.util.List;

public class SquareTrinome {
    private double coefficientA;
    private double coefficientB;
    private double coefficientC;

    public SquareTrinome() {
        coefficientA = 0;
        coefficientB = 0;
        coefficientC = 0;
    }
    public SquareTrinome(double a, double b, double c) {
        coefficientA = a;
        coefficientB = b;
        coefficientC = c;
    }

    public List<Double> Solution() throws Exception{
        List<Double> roots= new ArrayList<Double>();
        double x1, x2;
        if(coefficientA == 0)
        {
            if(coefficientB == 0)
            {
                if(coefficientC == 0)
                {
                    throw new Exception("Infinity count of solutions");
                } else {
                    throw new Exception("No roots, oh no....");
                }
            }
            else
            {
                x1 = ((-1 * coefficientC) / coefficientB);
                roots.add(x1);
            }
        }
        else
        {
            double dis = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
            if(dis >= 0)
            {
                x1 = (-1 * coefficientB + Math.sqrt(dis)) / (2 * coefficientA);
                x2 = (-1 * coefficientB - Math.sqrt(dis)) / (2 * coefficientA);
                if(x1 == x2)
                {
                    roots.add(x1);
                }
                else
                {
                    roots.add(x1);
                    roots.add(x2);
                }
            }//корней нет
        }
        return roots;
    }
}
