package com.example.satoshi.basiccalculator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SudokuSolver extends Activity {
    ArrayList<EditText> boxs = new ArrayList<EditText>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku_solver);
        EditText editText1 =  findViewById(R.id.number1); boxs.add(editText1);
        EditText editText2 =  findViewById(R.id.number2); boxs.add(editText2);
        EditText editText3 = (EditText) findViewById(R.id.number3); boxs.add(editText3);
        EditText editText4 = (EditText) findViewById(R.id.number4); boxs.add(editText4);
        EditText editText5 = (EditText) findViewById(R.id.number5); boxs.add(editText5);
        EditText editText6 = (EditText) findViewById(R.id.number6); boxs.add(editText6);
        EditText editText7 = (EditText) findViewById(R.id.number7); boxs.add(editText7);
        EditText editText8 = (EditText) findViewById(R.id.number8); boxs.add(editText8);
        EditText editText9 = (EditText) findViewById(R.id.number9); boxs.add(editText9);
        EditText editText10 = (EditText) findViewById(R.id.number10); boxs.add(editText10);
        EditText editText11 = (EditText) findViewById(R.id.number11); boxs.add(editText11);
        EditText editText12 = (EditText) findViewById(R.id.number12); boxs.add(editText12);
        EditText editText13 = (EditText) findViewById(R.id.number13); boxs.add(editText13);
        EditText editText14 = (EditText) findViewById(R.id.number14); boxs.add(editText14);
        EditText editText15 = (EditText) findViewById(R.id.number15); boxs.add(editText15);
        EditText editText16 = (EditText) findViewById(R.id.number16); boxs.add(editText16);
        EditText editText17 = (EditText) findViewById(R.id.number17); boxs.add(editText17);
        EditText editText18 = (EditText) findViewById(R.id.number18); boxs.add(editText18);
        EditText editText19 = (EditText) findViewById(R.id.number19); boxs.add(editText19);
        EditText editText20 = (EditText) findViewById(R.id.number20); boxs.add(editText20);
        EditText editText21 = (EditText) findViewById(R.id.number21); boxs.add(editText21);
        EditText editText22 = (EditText) findViewById(R.id.number22); boxs.add(editText22);
        EditText editText23 = (EditText) findViewById(R.id.number23); boxs.add(editText23);
        EditText editText24 = (EditText) findViewById(R.id.number24); boxs.add(editText24);
        EditText editText25 = (EditText) findViewById(R.id.number25); boxs.add(editText25);
        EditText editText26 = (EditText) findViewById(R.id.number26); boxs.add(editText26);
        EditText editText27 = (EditText) findViewById(R.id.number27); boxs.add(editText27);
        EditText editText28 = (EditText) findViewById(R.id.number28); boxs.add(editText28);
        EditText editText29 = (EditText) findViewById(R.id.number29); boxs.add(editText29);
        EditText editText30 = (EditText) findViewById(R.id.number30); boxs.add(editText30);
        EditText editText31 = (EditText) findViewById(R.id.number31); boxs.add(editText31);
        EditText editText32 = (EditText) findViewById(R.id.number32); boxs.add(editText32);
        EditText editText33 = (EditText) findViewById(R.id.number33); boxs.add(editText33);
        EditText editText34 = (EditText) findViewById(R.id.number34); boxs.add(editText34);
        EditText editText35 = (EditText) findViewById(R.id.number35); boxs.add(editText35);
        EditText editText36 = (EditText) findViewById(R.id.number36); boxs.add(editText36);
        EditText editText37 = (EditText) findViewById(R.id.number37); boxs.add(editText37);
        EditText editText38 = (EditText) findViewById(R.id.number38); boxs.add(editText38);
        EditText editText39 = (EditText) findViewById(R.id.number39); boxs.add(editText39);
        EditText editText40 = (EditText) findViewById(R.id.number40); boxs.add(editText40);
        EditText editText41 = (EditText) findViewById(R.id.number41); boxs.add(editText41);
        EditText editText42 = (EditText) findViewById(R.id.number42); boxs.add(editText42);
        EditText editText43 = (EditText) findViewById(R.id.number43); boxs.add(editText43);
        EditText editText44 = (EditText) findViewById(R.id.number44); boxs.add(editText44);
        EditText editText45 = (EditText) findViewById(R.id.number45); boxs.add(editText45);
        EditText editText46 = (EditText) findViewById(R.id.number46); boxs.add(editText46);
        EditText editText47 = (EditText) findViewById(R.id.number47); boxs.add(editText47);
        EditText editText48 = (EditText) findViewById(R.id.number48); boxs.add(editText48);
        EditText editText49 = (EditText) findViewById(R.id.number49); boxs.add(editText49);
        EditText editText50 = (EditText) findViewById(R.id.number50); boxs.add(editText50);
        EditText editText51 = (EditText) findViewById(R.id.number51); boxs.add(editText51);
        EditText editText52 = (EditText) findViewById(R.id.number52); boxs.add(editText52);
        EditText editText53 = (EditText) findViewById(R.id.number53); boxs.add(editText53);
        EditText editText54 = (EditText) findViewById(R.id.number54); boxs.add(editText54);
        EditText editText55 = (EditText) findViewById(R.id.number55); boxs.add(editText55);
        EditText editText56 = (EditText) findViewById(R.id.number56); boxs.add(editText56);
        EditText editText57 = (EditText) findViewById(R.id.number57); boxs.add(editText57);
        EditText editText58 = (EditText) findViewById(R.id.number58); boxs.add(editText58);
        EditText editText59 = (EditText) findViewById(R.id.number59); boxs.add(editText59);
        EditText editText60 = (EditText) findViewById(R.id.number60); boxs.add(editText60);
        EditText editText61 = (EditText) findViewById(R.id.number61); boxs.add(editText61);
        EditText editText62 = (EditText) findViewById(R.id.number62); boxs.add(editText62);
        EditText editText63 = (EditText) findViewById(R.id.number63); boxs.add(editText63);
        EditText editText64 = (EditText) findViewById(R.id.number64); boxs.add(editText64);
        EditText editText65 = (EditText) findViewById(R.id.number65); boxs.add(editText65);
        EditText editText66 = (EditText) findViewById(R.id.number66); boxs.add(editText66);
        EditText editText67 = (EditText) findViewById(R.id.number67); boxs.add(editText67);
        EditText editText68 = (EditText) findViewById(R.id.number68); boxs.add(editText68);
        EditText editText69 = (EditText) findViewById(R.id.number69); boxs.add(editText69);
        EditText editText70 = (EditText) findViewById(R.id.number70); boxs.add(editText70);
        EditText editText71 = (EditText) findViewById(R.id.number71); boxs.add(editText71);
        EditText editText72 = (EditText) findViewById(R.id.number72); boxs.add(editText72);
        EditText editText73 = (EditText) findViewById(R.id.number73); boxs.add(editText73);
        EditText editText74 = (EditText) findViewById(R.id.number74); boxs.add(editText74);
        EditText editText75 = (EditText) findViewById(R.id.number75); boxs.add(editText75);
        EditText editText76 = (EditText) findViewById(R.id.number76); boxs.add(editText76);
        EditText editText77 = (EditText) findViewById(R.id.number77); boxs.add(editText77);
        EditText editText78 = (EditText) findViewById(R.id.number78); boxs.add(editText78);
        EditText editText79 = (EditText) findViewById(R.id.number79); boxs.add(editText79);
        EditText editText80 = (EditText) findViewById(R.id.number80); boxs.add(editText80);
        EditText editText81 = (EditText) findViewById(R.id.number81); boxs.add(editText81);
    }

    ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Boolean>> fixed = new ArrayList<ArrayList<Boolean>>();

    {for(int i = 0; i < 9; i++){
        fixed.add(new ArrayList<Boolean>());
        board.add(new ArrayList<Integer>());
    }}

    public void onClickCalculator(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickScan(View v){
        Context context = getApplicationContext();
        CharSequence text = "This is not implemented yet...";

        Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickCalculate(View v) throws InterruptedException{
        getNumbers();
        System.out.println(board);

        Thread thread = new Thread(new Runnable(){
            int row = 0; int col = 0;
            @Override
            public void run(){
                solve(row, col);
            }
        });

        thread.start();
        Context context = getApplicationContext();
        CharSequence text = "Calculation started...";

        Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        toast.show();

        thread.join();
        text = "Calculation completed";
        toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();

        //todo: reflect the calculation on the edittexts
        ArrayList<Integer> boardOneRow = new ArrayList<Integer>();
        for(ArrayList<Integer> arr: board){
            for(Integer num: arr){
                boardOneRow.add(num);
            }
        }
        System.out.println(boardOneRow);
        for(int i = 0; i < 81; i++){
            boxs.get(i).setText(String.valueOf(boardOneRow.get(i)));
        }
    }

    public boolean solve(int row, int col){
        int nextRow = row; int nextCol = col;
        if(col == 8){
            nextRow++;
            nextCol = 0;
        }else{
            nextCol++;
        }
        if(row == 9) return true;
        if(fixed.get(row).get(col)) return solve(nextRow, nextCol);

        for (int i = 1; i <= 9; i++){
            System.out.println(board);
            board.get(row).set(col, i);
            if(!rowInvalid(row, col)) {
                if (!colInvalid(row, col)) {
                    if (!subsquareInvalid(row, col)) {
                        if (solve(nextRow, nextCol)){
                            return true;
                        }
                    }
                }
            }
            board.get(row).set(col, 0);
        }
        return false;
    }

    public boolean rowInvalid(int row, int col){
        int num = board.get(row).get(col);
        for(int i = 0; i< 9; i ++){
            if(i != col){
                int a = board.get(row).get(i);
                if(a == num) return true;
            }
        }
        return false;
    }

    public boolean colInvalid(int row, int col){
        int num = board.get(row).get(col);
        for(int i = 0; i< 9; i ++){
            if(i != row){
                int a = board.get(i).get(col);
                if(a == num) return true;
            }
        }
        return false;
    }

    public boolean subsquareInvalid(int row, int col){
        int startRow = row - row%3;
        int startCol = col - col%3;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board.get(startRow + i).get(startCol) == board.get(row).get(col)){
                    if(startRow+i != row && startCol != col){
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public void getNumbers(){
        int row = 0;
        int col = 0;
        for(EditText editText: boxs){
            if(!editText.getText().toString().equals("")){
                board.get(row).add(Integer.valueOf(editText.getText().toString()));
                fixed.get(row).add(true);
            }else{
                board.get(row).add(0);
                fixed.get(row).add(false);
            }
            if(col == 8){
                row++;
                col = 0;
            }else{
                col++;
            }
        }
    }
}
