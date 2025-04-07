package org.example;

import java.awt.*;

public class Passenger {
    private String Title;
    private String FirstName;
    private String SecondName;
    private String ID;
    private int age;


    public Passenger(String title , String ID ,String SecondName , String FirstName)
    {

        if (!title.equals("Mr") && !title.equals("Mrs") && !title.equals("Ms") )
        {
            throw new IllegalArgumentException("Invalid Prefix");
        }

        this.Title = title;
        this.FirstName = FirstName;
        this.SecondName = SecondName;


    }
    public Passenger (int age)
    {
        if (age <= 17)
        {
            throw new IllegalArgumentException("You must be  18 or over");
        }
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}





