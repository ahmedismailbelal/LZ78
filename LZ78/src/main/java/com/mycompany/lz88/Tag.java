/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lz88;

/**
 *
 * @author Abdelrahman Hany
 */
public class Tag {
    private int position;
    private char next;

    public Tag(int position, char next) {
        this.position = position;
        this.next = next;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public char getNext() {
        return next;
    }

    public void setNext(char next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{"+ position + "," + next + '}';
    }
    
    
}
