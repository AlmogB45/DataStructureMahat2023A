package PracticeMahat;
import java.util.Stack;
import java.util.*;


public class Aviv2023A {
    // Question 3

    public class Fruit {
        protected int weight;

        public Fruit(int val) {
            weight = val;
        }

        public int getWeight() {
            return weight;
        }
    }

    public class Apple extends Fruit {
        private String color;

        public Apple(int val, String col) {
            super(val);
            color = col;
        }

        public boolean validWeight() {
            return weight > 80 && weight < 140;
        }
    }


//Question 3 A

//1. Incorrect, Fruit does not inherit "getWeight() from class Apple.
//2. Correct, class Apple inherits everything from Fruit including "getWeight()" and protected weight.
//3. Correct, "weight" is defined as protected, hence Fruit can access it.
//4. Incorrect, since Apple inherits from Fruit and not the opposite, Fruit cannot access "color"
//5. Correct, since there is no "toString()" method anywhere in class Apple

//Question 3 B

//1. Incorrect, this is a Compilation error, Fruit has no "validWeight()" method, only Apple has.
//2. Incorrect, this is a Compilation error, Fruit has no "validWeight()" method, only Apple has.
//3. Correct, since there's a casting to type "Apple", the output will be "true".
//4. Incorrect, this is a Runtime error since the object is not really an Apple.
//5. Correct, since both "first" and "third" will be from type Apple (after casting), the output will be "true"

//Question 3 C

    public static void countObjectrs(Object[] objects) {
        int countApple = 0;
        int countNonAppleFruit = 0;
        int nonFruitCount = 0;

        for (Object obj : objects) {
            if (obj instanceof Apple) {
                countApple++;
            } else if (obj instanceof Fruit) {
                countNonAppleFruit++;
            } else {
                nonFruitCount++;
            }
        }

        System.out.println("Number of Objects from type Apple:" +countApple);
        System.out.println("Number of Objects from type Fruit:" +countNonAppleFruit);
        System.out.println("Number of Objects from type not fruit:" +nonFruitCount);
    }

// Question 7
public static String what(Les12.BinNode<Integer> t)
{
    String output = "(";
    if (t.getLeft()!= null)
        output += what(t.getLeft());
    output += t.getValue();
    if (t.getRight()!= null)
        output += what (t.getRight());
    output += ")";
    return output;
}
    public static String why(Les12.BinNode<Integer> t)
    {
        String output = "(";
        output += t.getValue();
        if (t.getLeft()!= null)
            output += why(t.getLeft());
        if (t.getRight()!= null)
            output += why (t.getRight());
        output += ")";
        return output;
    }

// Question 7 A

   //Following throught the method "what" on BinNode (tree) bt will give us the following:
   // "((1)2(3))4(6(7))"


// Question 7 B
//       40
//    20    //10
//  30  //5
//      50


//Question 7 C

//Yes there can be a BinNode bt that will have both "what" and "why" return identical results

//          1
//              2
//                  3
}