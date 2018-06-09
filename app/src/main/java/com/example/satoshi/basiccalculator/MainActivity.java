package com.example.satoshi.basiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    TextView display;
    String toDisplay;
    String operators = "+-x÷";
    String nonnumber = "+-x÷().";
    String nonnumberCalc = "+-x÷()";
    String numbers = "0123456789";
    String numbersPlusDot = "0123456789.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the main display textview
        display = (TextView) findViewById(R.id.display);
        toDisplay = "";
    }



    //when numbers are clicked, add number to the display
    public void onClickNumbers(View v){
        Button number = (Button) v;
        toDisplay += number.getText().toString();
        display.setText(toDisplay);
    }

    public void onClickOperator(View v){
        //todo: need work
        Button btn = (Button) v;
        String toCompare = "+-x÷(";
        if(toDisplay.length() != 0){
            if(!(toCompare.contains(toDisplay.substring(toDisplay.length()-1)))
                    && !toDisplay.substring(toDisplay.length()-1).equals(".")){
                toDisplay += btn.getText();
            }
            display.setText(toDisplay);
        }
    }

    public void onClickArrow(View v){
        if(toDisplay.length() == 1){
            toDisplay = "";
        }else if(toDisplay.length() > 1){
            toDisplay = toDisplay.substring(0, toDisplay.length()-1);
        }
        display.setText(toDisplay);
    }

    public void onClickBracket(View v){
        Button btn = (Button) v;
        if(toDisplay.equals("")){
            toDisplay += "(";
        }else {
            int bracket = StringUtils.countMatches(toDisplay, "(") - StringUtils.countMatches(toDisplay, ")");
            if (btn.getText().equals(")") && bracket > 0) {
                if (toDisplay.charAt(toDisplay.length() - 1) != '('
                        && !(operators.contains((String.valueOf(toDisplay.charAt(toDisplay.length() - 1)))))) {
                    toDisplay += ")";
                }
            } else if (btn.getText().equals("(") && !String.valueOf(toDisplay.charAt(toDisplay.length() - 1)).equals(".")) {
                toDisplay += "(";
            }
        }
        display.setText(toDisplay);
    }

    public void onClickC(View v){
        toDisplay = "";
        display.setText(toDisplay);
    }

    public void onClickDot(View v){
        if(toDisplay.length() == 0){
            toDisplay+= "0.";
            display.setText(toDisplay);
        }else{
            int i = toDisplay.length()-1;
            while(!(nonnumber.contains(toDisplay.substring(i, i+1))) && i > 0){
                i--;
            }
            if(!toDisplay.substring(i).contains(".")){
                if(!numbers.contains(toDisplay.substring(toDisplay.length()-1))){
                    toDisplay += "0";
                }
                toDisplay += ".";
                display.setText(toDisplay);
            }
        }
    }

    public void onClickCalculate(View v){
        if(isValidEquation()){
            //this part stores things into list.
            ArrayList<Double> nums = new ArrayList<Double>();
            ArrayList<Integer> pri = new ArrayList<Integer>(); //priority
            ArrayList<String> oper = new ArrayList<String>(); //operator with next value
            int currentPrio = 0;
            int prioToCalc = 0;
            for(int i = 0; i < toDisplay.length(); i++){
                System.out.println("Current Priority is: " + currentPrio);
                String currentString = String.valueOf(toDisplay.charAt(i));
                System.out.println("Current String is: " + currentString);
                if(operators.contains(currentString)){
                    if(currentString.equals("x") || currentString.equals("÷")){
                        currentPrio++;
                        prioToCalc = currentPrio;
                    }
                    oper.add(currentString);
                    pri.add(currentPrio);
                }else if(currentString.equals("(")){
                    currentPrio++;
                    prioToCalc = currentPrio;
                    if(i != 0 && numbers.contains(String.valueOf(toDisplay.charAt(i-1)))){
                        oper.add("x");
                        pri.add(currentPrio);
                    }
                }else if(currentString.equals(")")) {
                    currentPrio--;
                    if(i != toDisplay.length()-1 && numbers.contains(String.valueOf(toDisplay.charAt(i+1)))){
                        oper.add("x");
                        pri.add(currentPrio);
                    }
                }else if(numbers.contains(currentString)){
                    String num = "";
                    while (numbersPlusDot.contains(currentString)) {
                        num += String.valueOf(toDisplay.charAt(i));
                        System.out.println(num);
                        if (i + 1 != toDisplay.length()) {
                            if(numbersPlusDot.contains(String.valueOf(toDisplay.charAt(i+1)))){
                                i++;
                            }else{
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    nums.add(Double.valueOf(num));
                }else{
                    oper.add(currentString);
                }
            }

            System.out.println(nums);
            System.out.println(pri);
            System.out.println(oper);
            

            System.out.println("Nums: " + nums);
            System.out.println("Oper: " + oper);
            System.out.println("Prio: " + pri);
            //TODO: you have to think about going through multiple times n managing priority number you are working on.
            while(prioToCalc >= 0) {
                System.out.println("Nums: " + nums);
                System.out.println("Oper: " + oper);
                System.out.println("Prio: " + pri);
                int currentPos = 0;
                while (currentPos < pri.size()) {
                    if (pri.get(currentPos) == prioToCalc) {
                        double firNum = nums.get(currentPos);
                        double secondNum = nums.get(currentPos + 1);
                        if (oper.get(currentPos).equals("+")) {
                            nums.set(currentPos, firNum + secondNum);
                        } else if (oper.get(currentPos).equals("-")) {
                            nums.set(currentPos, firNum - secondNum);
                        } else if (oper.get(currentPos).equals("÷")) {
                            nums.set(currentPos, firNum / secondNum);
                        } else if (oper.get(currentPos).equals("x")) {
                            nums.set(currentPos, firNum * secondNum);
                        }
                        nums.remove(currentPos + 1);
                        pri.remove(currentPos);
                        oper.remove(currentPos);
                    } else {
                        currentPos++;
                    }
                }
                prioToCalc--;
            }
            if(nums.get(0)%1 == 0){
                toDisplay = String.valueOf(Math.round(nums.get(0)));
            }else{
                toDisplay = String.valueOf(nums.get(0));
            }
        }
        display.setText(toDisplay);
    }//the end of onclickcalculate

    public boolean isValidEquation(){
        int bracketCount = 0;
        for(int i = 0; i < toDisplay.length()-1; i++){
            bracketCount = bracketModify(bracketCount, toDisplay.substring(i, i+1));
            if(bracketCount < 0){
                System.out.println("BracketCount error");
                return false;
            }
        }
        bracketCount = bracketModify(bracketCount, toDisplay.substring(toDisplay.length()-1));

        if(bracketCount != 0){
            System.out.println("It is not complete equation");
            return false;
        }

        if(!numbers.contains(toDisplay.substring(0,1)) || toDisplay.substring(0,1).equals("(")){
            System.out.println(numbers.contains(toDisplay.substring(0,1)));
            System.out.println(toDisplay.substring(0,1).equals("("));
            System.out.println("The equation does not start with right thing");
            return false;
        }

        return true;
    }

    public int bracketModify(int bracketCount, String a){
        if(a.equals("(")){
            return bracketCount+1;
        }else if(a.equals(")")){
            return bracketCount-1;
        }
        return bracketCount;
    }

    public void onClickSudoku(View v){
        Intent intent = new Intent(this, SudokuSolver.class);
        startActivity(intent);
    }
}