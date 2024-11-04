package org.example;

import javax.lang.model.type.ArrayType;

public class Main {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.setDaemon(true);
        threadClass.start();
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("In main thread");
            }
            int i =0;
            i = 10/i;
        } catch (NullPointerException e){
            System.err.println("Nani is not fine");
        } catch (StackOverflowError e){
            System.err.println("Nani is not fine");
        }
        catch (ArithmeticException e){
            System.err.println("Nani is not fine, arthemetics");
        }
        catch (Exception e){
            System.err.println("Nani is not fine, exception");
        }

    }
}